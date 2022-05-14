import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.sql.types.{StringType, StructField, StructType}

class createDfTest {
  val spark = SparkSession.builder.
    master("local")
    .appName("spark session example")
    .getOrCreate()

  val dataLine = Seq(
    Row("Paul","AAA"),
    Row("Tommy","BBB"))

  val dlSchema = List(
    StructField("name", StringType, true),
    StructField("miam", StringType, true))

  val df = spark.createDataFrame(spark.sparkContext.parallelize(dataLine), StructType(dlSchema))

  df.show(2)
}
