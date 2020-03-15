/**
 * @Function:
 * @author fanfan
 * @Date: 2020/3/6
 * @since JDK 1.8
 * @descript: 定义一个带参数的构造函数
 */
class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("x 的坐标点: " + x);
    println ("y 的坐标点: " + y);
  }
}

object test002 {
  def main(args: Array[String]) {
    val pt = new Point(10, 20);

    // 移到一个新的位置
    pt.move(10, 10);
  }
}
