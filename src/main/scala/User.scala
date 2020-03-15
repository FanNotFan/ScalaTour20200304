/**
 * @Function:
 * @author fanfan
 * @Date: 2020/3/6
 * @since JDK 1.8
 */
class User (val name:String, val password:String){

}
// 定义伴生对象
object User {
  def apply(name: String, password: String): User = new User(name, password)

  def unapply(arg: User): Option[(String, String)] = {
    if (arg == null) None
    else{
      Some(arg.name,arg.password)
    }
  }
}

object userTest{
  def main(args: Array[String]): Unit = {
    val user = new User("fanfan", "89757")
    val user2 = User("fanfan", "89757")
    println(user.isInstanceOf[User])
    println(user2.isInstanceOf[User])

    user match {
      case User(name,password) => println(name+":"+password)
      case _=>println("None" )
    }
  }
}