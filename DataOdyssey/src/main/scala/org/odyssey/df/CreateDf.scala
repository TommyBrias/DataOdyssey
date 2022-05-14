package org.odyssey.df

import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}
class CreateDf {



  def createSf(): Unit = {
    val spark = SparkSession.builder.
      master("local")
      .appName("spark session example")
      .getOrCreate()
    spark.sparkContext.setLogLevel("WARN")

    val dfConso = spark.read.option("header",true)
      .options(Map("delimiter"->";"))
      .csv("src/test/resources/consommation_lite.csv")

    dfConso.printSchema()
    dfConso.show()
  }




}
