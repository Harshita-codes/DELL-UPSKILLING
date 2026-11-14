package org.apache.spark.sql.execution.streaming

import capstone.{SparkTestSession, StreamingLogic}
import org.scalatest.funsuite.AnyFunSuite

class StreamingLogicSpec extends AnyFunSuite with SparkTestSession {
  import spark.implicits._

  test("uppercaseEvents processes records added in memory batches") {
    // Test the streaming transformation logic deterministically on dataset records
    val inputData = Seq(" first", "second", "third").toDS()
    val transformed = StreamingLogic.uppercaseEvents(inputData)

    val results = transformed.collect().toSeq
    assert(results == Seq("FIRST", "SECOND", "THIRD"))
  }
}