// Test if statement
//

object Test {

  def main(args: Array[String]){
    println( "Returned value: " + addInt(5,12) );
  }

  // method 
  //

  def addInt(a:Int, b:Int) : Int = {
    var sum:Int = 0;
    sum = a + b
    return sum;
  }
}