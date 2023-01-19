class Student(name:String, surname:String, age:Int, gmail:String, address:Address, var login:String,
              var password:String, var balance:Double, var fiat:Double, var smartcontrakt:Smartcontrakt)
  extends Human(name, surname, age, gmail, address) with TraitBirga{

    private var _login:String = login
    private var _password:String = password
    private var _balance:Double = balance
    private var _fiat:Double = fiat
    private var _smartcontrakt:Smartcontrakt = smartcontrakt


    def Login: String = _login
    def Login(NewValue:String): Unit = {
      _login=NewValue
    }

    def Password: String = _password
    def Password(NewValue: String): Unit = {
      _password = NewValue
    }

    def Balance: Double = _balance
    def set_Balance(NewValue: Double, birga:Birga): Unit = {
      if(NewValue<0){
        var reserve = NewValue.abs
        var toup:(Double, Double) = buy(reserve, birga, _balance, _fiat)
        _balance=toup._1
        _fiat=toup._2
      }
      else{
        _balance= NewValue
      }
    }

  def Fiat: Double = _fiat
  def set_fiat(NewValue: Double): Unit = {
    _fiat=NewValue
  }
  
  def Smartcontrakt:Smartcontrakt = _smartcontrakt
  def Smartcontrakt(NewValue: Smartcontrakt): Unit ={
   _smartcontrakt=NewValue
  }
  
  override def toString: String = super.toString() + s", ${_balance}" + s", ${_fiat}" + s", ${_smartcontrakt}"

  override def Show(): String = super.Show() + s"\nBalance: ${_balance}\n" + s"\nFiat: ${fiat}\n" + s"\nSmartcontrakt: ${_smartcontrakt}\n"
}
