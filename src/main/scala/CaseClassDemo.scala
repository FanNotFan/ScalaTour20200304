/**
 * @Function: 样例类
 * @author fanfan
 * @Date: 2020/3/10
 * @since JDK 1.8
 */
// 定义样例类,样例类默认带有apply方法，构造函数的参数默认是public val 修饰的
case class Message(sender:String, recipient:String, body:String)

object CaseClassDemo{
  def main(args: Array[String]): Unit = {
// 创建样例类对象
    val message = Message("Jerry","huihui","Fanfan")
    println(message.sender)
    println(message.recipient)
    println(message.body)
//    样例类的比较，基于值或结构的比较，而不是基于引用的比较
    val message2 = Message("Jerry","huihui","Fanfan")
    if(message == message2) println("same")
    else println("different")

//    样例类的copy
    val message3 = message.copy()
    println("message3.sender:"+message3.sender)
    println("message3.recipient:"+message3.recipient)
    println("message3.recipient:"+message3.body)
    if(message == message3) println("true")
    else println("false")

//    不完全拷贝
    val message4 = message.copy(sender = "LiHua")
    println("message4.sender:"+message4.sender)
    println("message4.recipient:"+message4.recipient)
    println("message4.recipient:"+message4.body)
    if(message == message4) println("true")
    else println("false")
  }
}