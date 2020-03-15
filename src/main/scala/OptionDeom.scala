/**
 * @Function:
 * @author fanfan
 * @Date: 2020/3/11
 * @since JDK 1.8
 */
object OptionDeom {
  def main(args: Array[String]): Unit = {
    val map = Map("a"->1,"b"->2)
    println(map("a"))
//    当取当前map中没有这个程序时
    println(map.getOrElse("c","default value"))
    val a:Option[Int] = map.get("a ")
    println("OptionA:" + a)
  }
}
