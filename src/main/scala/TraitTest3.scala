/**
 * @Function:
 * @author fanfan
 * @Date: 2020/3/10
 * @since JDK 1.8
 */
trait LoggerSelf{
  def log(msg: String) // 实现抽象方法
  def info(msg: String): Unit ={
    log(s"INFO:"+msg)
  }
  def severe(msg: String): Unit ={
    log(s"SEVERE:"+msg)
  }
  def warn(msg: String): Unit ={
    log(s"WARN:"+msg)
  }
}

class AccountSelf {
  protected var balance:Double = 0.0
}

class SavingAccountSelf extends AccountSelf with LoggerSelf {
  override def log(msg: String): Unit = println(msg)
  def withdraw(amount:Double): Unit ={
    if (amount > balance) severe("Insufficent funds")
    else {
      balance = balance - amount
      info("you withdraw ...")
    }
  }
}

object TraitTest3 {
  def main(args: Array[String]): Unit = {
    val acc1 = new SavingAccountSelf
    acc1.withdraw(100)
  }
}
