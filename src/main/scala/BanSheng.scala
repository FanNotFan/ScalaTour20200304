/**
 * @Function:
 * @author fanfan
 * @Date: 2020/3/6
 * @since JDK 1.8
 */
// 类的伴生对象，类和伴生对象可以互相访问彼此的私有属性或者方法
class BanSheng {
  val id: Int = BanSheng.add
}

object BanSheng {
  private var number: Int = 1
   private def add:Int  = {
     number += 1
     number
   }
}

//object banShengTest{
//  def main(args: Array[String]): Unit = {
//    val banSheng:BanSheng = new BanSheng()
//    println(banSheng.id)
//  }
//}

// 使用应用程序对象定义main函数
object banShengTest extends App{
  val banSheng:BanSheng = new BanSheng()
  println(banSheng.id)
}