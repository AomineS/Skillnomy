object Main {
  def main(args: Array[String]): Unit ={
    var address_1 = new Address("Ukraine","Odessa", 20)
    var address_2 = new Address("Ukraine","Khmelnitsk", 8)
    var address_3 = new Address("Ukraine","Kherson", 168)
    var smartcontrakt = new Smartcontrakt(500, 6, 5)
    var teacher = new Teacher("Karinian","Olexandr", 17,"System.user22@gmail.com", address_3, "KSasha", "fd56df543df212", 0, 1000, smartcontrakt)
    var student_1 = new Student("Yulia","Shkvarun", 17,"Yulia.shkvarun@gmail.com", address_2, "YuliaS","YS56543212", 0, 1000, smartcontrakt)
    var student_2 = new Student("Bohdan","Suprun", 18,"Bohdan.suprun.2004@gmail.com", address_1, "Sbohdan228","Bs200413375050", 0, 1000, smartcontrakt)
    var birja1 = new Birga()
    var platform1 = new Platform()
    teacher.addinlist(student_1)
    teacher.addinlist(student_2)
    println(teacher.Show())
    println(teacher.showlist())
    teacher.evaluation(birja1, platform1)
    println(teacher.Show())
    println(teacher.showlist())
    println(birja1.Show())
    println(platform1.Show());
}
}
