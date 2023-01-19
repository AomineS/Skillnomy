class Birga {
  private var _token:Double = 100000
  private var _fiat:Double = 100000
  private var _price:Double = 1.0

  def get_tokens:Double = _token

  def set_tokens(NewValue:Double): Unit = {
    _token = NewValue
  }

  def get_fiat: Double = _fiat

  def set_fiat(NewValue: Double): Unit = {
    _fiat = NewValue
  }

  def get_price: Double = _price

  def set_price(NewValue: Double): Unit = {
    _price = NewValue
  }

  override def toString: String = super.toString + s", ${_token}" + s", ${_fiat}" + s", ${_price}"

  def Show():String = s"\n tokens: ${_token}\n" + s"\n fiat: ${_fiat}\n" + s"\n price_tokens: ${_price}\n"
}
