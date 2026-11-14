package capstone

import org.scalatest.funsuite.AnyFunSuite

class TransformationsSpec extends AnyFunSuite with SparkTestSession {
  import spark.implicits._

  test("cleanOrders removes invalid rows and normalizes columns") {
    val input = Seq(
      ("O-1", "C001", "PAID "),
      ("O-2", "C002", "PENDING"),
      ("O-3", "", "PAID"),
      (null, "C004", "PAID")
    ).toDF("order_id", "customer_id", "status")

    val actual = Transformations.cleanOrders(input)
    actual.show(false)

    val rows = actual.collect().map(r => (r.getString(0), r.getString(1), r.getString(2))).toSeq
    assert(actual.count() == 2)
    assert(rows == Seq(
      ("O-1", "C001", "paid"),
      ("O-2", "C002", "pending")
    ))
  }
}