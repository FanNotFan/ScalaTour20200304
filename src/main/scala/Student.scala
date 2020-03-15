/**
 * @Function: 抽象类
 * @author fanfan
 * @Date: 2020/3/9
 * @since JDK 1.8
 */
abstract class Student {
  // 抽象字段，没有初始化值
  var name:String
  // 抽象方法，没有方法体
  def id:Int
  //  具体方法
  def smile:Unit = {
    println("HaHa")
  }
}

// 定义一个子类，去继承我们的抽象类，需要实现我的抽象类及抽象方法
class StudentOne extends Student{
  override var name: String = "Fanfan"

  override def id: Int = {
    name.hashCode
  }
}