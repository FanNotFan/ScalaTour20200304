/**
 * @Function:
 * @author fanfan
 * @Date: 2020/3/9
 * @since JDK 1.8
 */
trait Logger{
  def log(msg: String)
}

// 子特质实现父特质里的抽象放方法
trait ConsoleLogger extends Logger{
  override def log(msg: String): Unit = {
    println(msg)
  }
}

// 给日志加上时间戳
trait TimestampLogger extends ConsoleLogger{
  override def log(msg: String): Unit = super.log(s"${java.time.Instant.now()}$msg")
}

// 如果日志太长，对日志截断显示
trait ShortterLogger extends ConsoleLogger{
  val maxLength = 15

  override def log(msg: String): Unit = super.log(
    if(msg.length < maxLength) msg
    else s"${msg.substring(0,maxLength-3)}..."
  )
}

class Account {
  protected var balance:Double = 0.0
}

class SavingAccount extends Account with ConsoleLogger {
  def withdraw(amount:Double): Unit ={
    if (amount > balance) log("Insufficent funds")
    else balance = balance - amount
  }
}

object TraitTest2 {
  def main(args: Array[String]): Unit = {
    var acc1 = new SavingAccount with ConsoleLogger
    var acc2 = new SavingAccount with TimestampLogger
    var acc3 = new SavingAccount with ShortterLogger
    var acc4 = new SavingAccount with TimestampLogger with ShortterLogger
    var acc5 = new SavingAccount with ShortterLogger with TimestampLogger
    var acc6 = new SavingAccount with ConsoleLogger with ShortterLogger with TimestampLogger

    acc1.withdraw(100.0)
    acc2.withdraw(100.0)
    acc3.withdraw(100.0)
    acc4.withdraw(100.0)
    acc5.withdraw(100.0)
    acc6.withdraw(100.0)
  }
}
