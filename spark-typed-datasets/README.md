# Spark Typed Datasets Using Scala

## Project Overview
This project demonstrates the implementation of Apache Spark DataFrames and Typed Datasets using Scala.

It explores both untyped and typed approaches to processing structured employee data.

## Technologies Used
- Scala 2.12.18
- Apache Spark 3.5.3
- SBT 1.10.7
- IntelliJ IDEA
- JDK 17

## Concepts Implemented
1. Creating Scala case classes
2. Converting collections into DataFrames using `toDF()`
3. Converting collections into Typed Datasets using `toDS()`
4. Filtering and sorting DataFrames
5. Filtering and sorting Typed Datasets
6. Typed projections using `map()`
7. Transforming Dataset records into summary records

## Project Structure
```text
spark-typed-datasets/
├── project/
├── src/
│   └── main/
│       └── scala/
│           └── com/
│               └── example/
│                   └── TypedDatasetDemo.scala
├── build.sbt
└── README.md
```

## How to Run
1. Clone this repository.
2. Open the project in IntelliJ IDEA.
3. Ensure JDK 17 is configured.
4. Load the SBT dependencies.
5. Run `TypedDatasetDemo.scala`.

## Learning Outcome
Understanding the differences between Spark DataFrames and Typed Datasets, and implementing transformations using both approaches.