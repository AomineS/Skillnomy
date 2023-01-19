class Address(var country:String, var city:String, var house:Int) {
  private var country1:String = country
  private var city1:String = city
  private var house1:Int = house

  override def toString: String =s"${country1}, ${city1}, ${house1}"
  
  def Country:String = country1
}
