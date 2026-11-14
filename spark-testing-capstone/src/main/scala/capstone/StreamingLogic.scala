package capstone

import org.apache.spark.sql.Dataset

object StreamingLogic {
  def uppercaseEvents(events: Dataset[String]): Dataset[String] =
    events.map(_.trim.toUpperCase)(events.sparkSession.implicits.newStringEncoder)
}