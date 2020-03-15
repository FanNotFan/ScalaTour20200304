/**
 * @Function: 特质
 * @author fanfan
 * @Date: 2020/3/9
 * @since JDK 1.8
 */
// 定义一个带有抽象方法的特质,返回类型是泛型A
trait Iterator[A]{
  def hasNext:Boolean
  def next():A
}

// 定义一个带有实现的特质
trait ConsoleLogger{
  def log(msg:String): Unit = {
    println(msg)
  }
}

//定义一个类来实现特质
class IntIterator(to :Int) extends Iterator[Int] with ConsoleLogger {
  private var current = 0
  override def hasNext:Boolean = current < to
  override def next(): Int = {
    if (hasNext){
      log("hasNext is true")
      var t = current
      current += 1
      t
    }else 0
  }
}

object TraitTest {
  def main(args: Array[String]): Unit = {
    val intIterator = new IntIterator(to=10)
    println(intIterator.next())
    println(intIterator.next())
    println(intIterator.next())
    println(intIterator.next())
  }
}
