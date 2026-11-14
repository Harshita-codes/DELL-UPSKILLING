# Employee Spark

An Apache Spark and Scala project that demonstrates basic employee DataFrame analysis and reusable transformations.

## Features

- Builds a DataFrame from sample employee records and displays it.
- Increases employee salaries by 5,000.
- Removes duplicate employee rows.
- Includes ScalaTest tests for the transformations.

## Technologies

- Scala 2.13.13
- Apache Spark 4.0.0
- SBT
- ScalaTest 3.2.18

## Prerequisites

- JDK 17 or newer
- SBT
- A compatible Spark runtime to launch the Spark application

## Test

From this directory, run:

```shell
sbt test
```

## Application entry point

The sample application entry point is `com.training.EmployeeAnalysis`. It creates a local employee DataFrame and prints it. To run it outside the test suite, use a Spark 4.0.0-compatible runtime and configure the Spark classpath for the project.
