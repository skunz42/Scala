class Cat(name : String) {
  def display() : Unit = {
    println("The cat's name is: " + name)
  }
}

object Main {
  def main(args : Array[String]) : Unit = {
    var kitty = new Cat("Tubs")
    kitty.display()
  }
}
