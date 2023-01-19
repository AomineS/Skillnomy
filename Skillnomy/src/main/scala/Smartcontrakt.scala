class Smartcontrakt(var profit: Int, var period:Int, var percentage: Int ) {
  private var _profit:Int = profit
  private var _period:Int = period
  private var _percentage:Int = percentage

  def Profit:Int = _profit
  def Profit(NewValue:Int): Unit = {
    _profit=NewValue
  }

  def Period: Int = _period
  def Period(NewValue: Int): Unit = {
    _period = NewValue
  }

  def Percentage: Int = _percentage
  def Percentage(NewValue: Int): Unit = {
    _percentage = NewValue
  }

  override def toString: String = s"Earned: ${_profit}, Period of study: ${_period}"
}
