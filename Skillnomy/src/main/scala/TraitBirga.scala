trait TraitBirga {
  def sell(tokens_to_sell: Double, birga: Birga, balance: Double, fiat: Double):(Double, Double) = {
    for(_ <-0  until  tokens_to_sell.toInt){
      var new_price = birga.get_price - 0.1
      birga.set_price(new_price);}
    var new_balance_birga_tokens = birga.get_tokens + tokens_to_sell
    birga.set_fiat(new_balance_birga_tokens)
    var new_balance_personality_tokens = balance - tokens_to_sell
    var new_balance_personality_fiat = fiat +(birga.get_price*tokens_to_sell)
    var new_balance_birga_fiat = birga.get_fiat - (birga.get_price*tokens_to_sell)
    birga.set_fiat(new_balance_birga_fiat)
    (new_balance_personality_tokens, new_balance_personality_fiat)
  }
  def buy(need_token:Double, birga: Birga, balance: Double, fiat: Double):(Double, Double) = {
    for(_ <-0  until  need_token.toInt){
      var new_price = birga.get_price + 0.01
      birga.set_price(new_price);}
    var new_balance_birga_tokens = birga.get_tokens - need_token
    birga.set_tokens(new_balance_birga_tokens)
    var new_balance_personality_tokens = balance + need_token
    var new_balance_personality_fiat = fiat - (birga.get_price*need_token)
    var new_balance_birga_fiat = birga.get_fiat + (birga.get_price*need_token)
    birga.set_fiat(new_balance_birga_fiat)
    (new_balance_personality_tokens, new_balance_personality_fiat)
  }
}
