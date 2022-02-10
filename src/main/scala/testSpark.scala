import org.apache.spark.sql._



object testSpark {

  def main(args: Array[String]): Unit = {

    System.setProperty("hadoop.home.dir", "C:/Hadoop/")

    val ss = SparkSession.builder()
      .master("local[*]")
      .appName("app_name")
      .config("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
      .getOrCreate()

    println(ss.version)

    val rdd1  = ss.sparkContext.parallelize(List("Franck", "Urbain", "Arnaud", "Jean Louis"))
    rdd1.foreach(e => println(e))


  }

}
