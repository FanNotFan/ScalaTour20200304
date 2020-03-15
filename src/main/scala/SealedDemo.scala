/**
 * @Function:
 * @author fanfan
 * @Date: 2020/3/10
 * @since JDK 1.8
 */
sealed abstract class Furniture
// 定义样例类
case class Couch() extends Furniture
case class Chair() extends Furniture

object SealedDemo {
  def findPlaceToSit(furniture: Furniture):String = furniture match {
    case a:Couch => "lie on the couch"
    case b:Chair => "sit on the chair"
    case _ => "Nothing"
  }

  val chair = Chair()
  def main(args: Array[String]): Unit = {
    println(findPlaceToSit(chair))
  }
}
