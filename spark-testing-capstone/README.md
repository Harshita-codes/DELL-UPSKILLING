# Spark Testing Capstone

A Scala project for practicing testable Apache Spark transformations and data-quality checks.

## Features

- Normalizes order status and cleans order and customer ID columns.
- Adds a tax-inclusive amount to order records.
- Provides row-count, null, and duplicate-key checks for DataFrames.
- Transforms string event Datasets by trimming and uppercasing each value.
- Includes ScalaTest suites that exercise the Spark logic with a local Spark session.

## Technologies

- Scala 2.12.18
- Apache Spark 3.5.1
- SBT
- ScalaTest 3.2.18

## Prerequisites

- JDK 17 or newer
- SBT

## Test

From this directory, run:

```shell
sbt test
```

The tests cover the transformations, selected data-quality checks, and event Dataset logic. The event transformation is a Dataset operation; this project does not configure a streaming source or sink.
