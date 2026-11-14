# Spark Projects

This repository contains three Scala projects for learning and practicing Apache Spark. The `Practise_Upskilling` project is intentionally not included in this overview.

## Projects

| Project | Description | Scala | Apache Spark |
|---|---|---:|---:|
| [employee-spark](./employee-spark/) | Employee DataFrame analysis and transformations, with ScalaTest coverage. | 2.13.13 | 4.0.0 |
| [spark-testing-capstone](./spark-testing-capstone/) | Order transformations, data-quality checks, and Dataset event logic with tests. | 2.12.18 | 3.5.1 |
| [spark-typed-datasets](./spark-typed-datasets/) | Examples comparing DataFrame and typed Dataset operations on employee data. | 2.12.18 | 3.5.3 |

Each project is an independent SBT build. Open the corresponding project directory before running its SBT commands.

## Prerequisites

- JDK 17 or newer
- SBT

## Build and test

Run these commands from the relevant project directory:

```shell
sbt test
```

For `spark-typed-datasets`, which currently has no test sources, compile the project with:

```shell
sbt compile
```

## Project guides

- [Employee Spark README](./employee-spark/README.md)
- [Spark Testing Capstone README](./spark-testing-capstone/README.md)
- [Spark Typed Datasets README](./spark-typed-datasets/README.md)
