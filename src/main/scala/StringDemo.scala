/**
 * @Function:
 * @author fanfan
 * @Date: 2020/3/11
 * @since JDK 1.8
 */
object StringDemo {
  def main(args: Array[String]): Unit = {
//    差值器 f s raw
//    s 字符串差值器
    val name = "Jerry"
    val res = s"hello,${name}"
    val res1 = s"hello,$name"
    val res2 = s"1+1=${1+1}"
    println(res)
    println(res1)
    println(res2)

//    f 差值器
    val height = 1.9d
    val name1 = "tom"
    val res3 = f"$name1 is $height%2.2f meters tall"
    println(res3)

//    raw 差值器，类似于 s 差值器，不对其中的内容做转换
    var str = s"a\nb "

   }

}
