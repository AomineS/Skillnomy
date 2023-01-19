class Human(var name:String, var surname:String, var age:Int, var gmail:String, var address:Address) {
  private var _name:String = name
  private var _surname:String = surname
  private var _age:Int = age
  private var _gmail:String = gmail
  private var _address:Address = address

  def Name:String = _name
  def Name(newValue:String): Unit ={
    _name=newValue
  }

  def Surname: String = _surname

  def Surname(newValue: String): Unit = {
    _surname = newValue
  }

  def Age: Int = _age

  def Age(newValue: Int): Unit = {
    if(newValue > 0)
      _age = newValue
    else println("Вік не може бути від'ємним числом!")
  }

  def Gmail: String = _gmail

  def Gmail(newValue: String): Unit = {
    _gmail = newValue
  }

  def Address: Address = _address

  def Address(newValue: Address): Unit = {
    _address = newValue
  }

  override def toString: String = s"${_name}, ${_surname}, ${_age}, ${_gmail}, ${_address}"

  def Show(): String = s"Name: ${_name}\nSurname: ${_surname}\nAge: ${_age}\nGmail: ${_gmail}\n Address: ${_address.toString()}"

}
