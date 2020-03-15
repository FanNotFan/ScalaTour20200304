/**
 * @Function:
 * @author fanfan
 * @Date: 2020/3/6
 * @since JDK 1.8
 */
// 单例对象
// 可以定义一些工具函数和一些常量，Java 中的工具类
object Logger {
  def log(msg:String) :Unit = {
    println("INFO: "+msg)
  }
}

class LoggerTest{
  def method: Unit ={
    Logger.log("method hello world")
  }
}

object testLogger{
  def main(args: Array[String]): Unit = {
    Logger.log("hello world")
    val loggerTest:LoggerTest = new LoggerTest()
    loggerTest.method
  }
}