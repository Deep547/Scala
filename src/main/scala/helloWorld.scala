object helloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
    val y = sum(10, 12)
    println("Sum of inputs provided is: "+y)
  }
  def sum(a:Int,b:Int):Int = {
    val x = a+b
   return x} //Not mandatory to specify RETURN keyword

  def suma(a:Int,b:Int):Int = {
    val x = a+b
    x} //Not mandatory to specify RETURN keyword as we have already specified the return type of method.

  def sumb(a:Int,b:Int):Int  = { //Not mandatory to specify return type.
    val x = a+b
     return x} // Mandatory to specify RETURN type as we have used the return keyword.

  def sumc(a:Int,b:Int) = a+b //No need to specify both return type and return keyword. Bracket is optional in single lined method else mandatory.
}
