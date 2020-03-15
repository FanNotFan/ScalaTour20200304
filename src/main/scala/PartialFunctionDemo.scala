/**
 * @Function:
 * @author fanfan
 * @Date: 2020/3/10
 * @since JDK 1.8
 */
object PartialFunctionDemo {
  val div1 = (x:Int) => 100/x

//  方式一 定义偏函数
  val div2 = new PartialFunction[Int,Int] {
    override def isDefinedAt(x: Int): Boolean = x!=0

    override def apply(v1: Int): Int = 100/v1
  }
//  方式二 使用case定义偏函数
  val div3:PartialFunction[Int,Int] = {
    case d:Int if(d!=0) => 100/d
  }

  val div4:PartialFunction[Int,String] = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "there"
  }

//  orElse 组合多个偏函数
  val r1:PartialFunction[Int,String] = {case 1 => "one"}
  val r2:PartialFunction[Int,String] = {case 2 => "two"}
  val r3:PartialFunction[Int,String] = {case 3 => "there"}
  val res2 = r1 orElse r2 orElse r3 // 相当于div4

  val r4:PartialFunction[Int,String] = {case cs if(cs == 1) => "one"}
  val r5:PartialFunction[String,String] = {case cs if(cs eq "one") => "is one"}
  val res3 = r4 andThen r5 // 相当于div4

  def main(args: Array[String]): Unit = {
//    div1(0)
//    println(div2.isDefinedAt(0))
//    println(div2(1))
//    println(div2(0))

//    println(div3(1))
//    println(div4.isDefinedAt(1))
//    println(div4(2))
//
//    println(res2.isDefinedAt(1))
//    println(res2(2))

    println(res3(1))
  }
}
