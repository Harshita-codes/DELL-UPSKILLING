package capstone

import org.apache.spark.sql.SparkSession
import org.scalatest.{BeforeAndAfterAll, Suite}

trait SparkTestSession extends BeforeAndAfterAll {
  this: Suite =>

  try {
    val clazz = Class.forName("org.apache.hadoop.io.nativeio.NativeIO$Windows")
    val field = clazz.getDeclaredField("nativeLoaded")
    field.setAccessible(true)
    field.setBoolean(null, false)
  } catch {
    case _: Throwable =>
  }

  System.setProperty("hadoop.home.dir", "C:\\hadoop")

  protected lazy val spark: SparkSession =
    SparkSession.builder()
      .appName("Spark Testing Capstone")
      .master("local[2]")
      .config("spark.ui.enabled", "false")
      .config("spark.sql.shuffle.partitions", "2")
      .getOrCreate()

  override protected def afterAll(): Unit = {
    try {
      spark.stop()
    } finally {
      super.afterAll()
    }
  }
}