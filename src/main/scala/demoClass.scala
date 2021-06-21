class demoCar{
  var GST = 70
  var roadTax = 100
  var overallExpenses = 80
  def carCost(carprice:Int) = carprice + GST+ roadTax+ overallExpenses
  def checkGST: Unit ={
    GST =10 //Unintentionally value changed causing side effect
  }
  }
object demoClass{
  def main(args:Array[String]):Unit = {
    val corolla = new demoCar
    println(corolla.GST)
    println(corolla.checkGST)
    //corolla.GST = 400 // this will change GST only for corolla and not for other cars
    println(corolla.roadTax)
    println(corolla.overallExpenses)
    val cost = corolla.carCost(4000)
    println(cost)

    val suzuki = new demoCar
    println(suzuki.GST)
    val costa = suzuki.carCost(4000)
    println(costa)
  }}
