import scala.util.Random

/**
 * @Function:
 * @author fanfan
 * @Date: 2020/3/10
 * @since JDK 1.8
 */
object PatternDemo2 {
  def main(args: Array[String]): Unit = {
//    做一个信息的甄别
    abstract class Notification
//    定义不同信息的样例类
    case class Email(sender:String, tiltle:String, body:String) extends Notification
    case class SMS(caller:String, message: String) extends Notification
    case class VoiceRecording(contactName:String,link:String) extends Notification
//    信息识别
    def showNotification(notification: Notification): String ={
      notification match {
        case Email(sender,tiltle,_) if (sender=="Fanfan")=> "You got Email msg from "+ sender
        case SMS(caller,_) => "You got SMS msg from "+ caller
        case VoiceRecording(contactName,link) => "You got VoiceRecording msg from "+ contactName
        case _ => "you got error message"
      }
    }
    //    创建一条Mail信息
    val notificationEmail = Email("Fanfan","TestTitle","Hello World")
    //    创建一条Mail信息
    val notificationSMS = SMS("Fanfan","TestTitle")
    //    创建一条Mail信息
    val notificationVoiceRecording = VoiceRecording("HiHui","Hello World")
    println(showNotification(notificationEmail))
    println(showNotification(notificationSMS))
    println(showNotification(notificationVoiceRecording))

//    类型匹配
    val arr = Array("sss",1,'c',3.00,2.1f)
//    随机取数组中的一个元素
    val arrItem = arr(Random.nextInt(5))
    println("arrItem: "+arrItem)
    arrItem match {
      case x:Int => println(x)
      case s:String => println(s.toUpperCase)
      case f:Float => println(f)
      case d:Double => println(Int.MaxValue)
      case c:Char => println(c.toString)
      case _ => println("未匹配到类型")
    }
  }
}
