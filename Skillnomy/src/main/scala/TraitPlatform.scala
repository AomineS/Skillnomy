trait TraitPlatform {
  def get(platform: Platform, courseprice: Int): Unit = {
    var NewValue = platform.get_tokens + (courseprice/2)
    platform.set_tokens(NewValue)
  }
  def give(platform: Platform, price: Double): Unit = {
    var NewValue = platform.get_tokens - price
    platform.set_tokens(NewValue)
  }
}
