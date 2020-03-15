

/**
 * Created by fanfan on 2020/3/5
 */
class Person {
  //  val 修饰属性，系统会自动生成get set 方法，可以定义自己的get set 方法
  val id:String = "89757"
  //  val 修饰属性，系统会生成get set 方法，可以定义自己的get set 方法
  var name:String = "FanFan"
  //  private var 类的私有字段，系统会生成  private 修饰的get set 方法
  private var gender:Int = 0
  //  private[this]，系统不会生成  private 修饰的get set 方法
  //  private[this] 只有当前属性才可以访问该属性
  private[this] var age:Int = 0
}

object test{
  def main(args: Array[String]): Unit = {
    val person:Person = new Person()
    println(person.id+","+person.name+",")
    person.name = ("huihui")
    println(person.id+","+person.name+",")
  }
}
