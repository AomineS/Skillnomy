class Platform extends TraitBirga {
  private var _token: Double = 1000000
  private var _fiat: Double = 1000000

  def get_tokens: Double = _token
  def set_tokens(NewValue:Double): Unit ={
    _token = NewValue
  }
  def get_fiat: Double = _fiat
  def set_fiat(NewValue:Double): Unit = {
    _fiat = NewValue
  }

  override def toString: String = super.toString + s", ${_token}" + s", ${_fiat}"
  def Show(): String = s"\n Tokens: ${_token}\n" + s"Fiat : ${_fiat}\n"
}
