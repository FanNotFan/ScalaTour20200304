/**
 * @Function:
 * @author fanfan
 * @Date: 2020/3/10
 * @since JDK 1.8
 */
object PatternDemo {
  def main(args: Array[String]): Unit = {
//    常量模式匹配
//    常量字面值匹配
//    val site = "github.com12"
//    val FANFAN = "github.com1"
//    val fanfan = "github.com1" // 这是一个变量匹配，无论何时都会成功，这是一个失败的操作
//    site match {
//      case fanfan => println(fanfan + " Success")
//      case FANFAN => println("Fanfan Success")
//      case "github.com" => println("success")
//      case _ => println("fail")  // 下划线相当于Java中的Default，不需要break
//    }

    //  通配符模式匹配
    val list = List(1,2,3)
    list match {
      case List(_,_,3) => println("success")
      case _ => println("fail")
    }
  }
}
