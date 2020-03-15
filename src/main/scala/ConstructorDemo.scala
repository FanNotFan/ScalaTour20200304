

/**
 * Created by fanfan on 2020/3/6
 */
class ConstructorDemo {
  var id:Int = 26
  println("hello constructor demo")

//  定义辅佐构造函数
  def this(a1:Int){
//  首先需要调用主构造函数或者其他的辅助函数
    this()
    this.id = a1
  }
}

// scala 类会自动无参构造函数
// 主构造函数会执行类中所有的语句
// 构造函数分为主构造函数和辅佐构造函数
object test001{
  def main(args: Array[String]): Unit = {
//    调用主构造函数
//    val constructorDemo:ConstructorDemo = new ConstructorDemo()
//    调用辅助构造函数
    val constructorDemo:ConstructorDemo = new ConstructorDemo(18)
    println(constructorDemo.id)
  }
}
