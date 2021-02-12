import java.beans.DesignMode

class sampleTest {
  def divison(a: Int, b: Int): Int = {
    a / b
  }
}
object sample1 extends App{
  val sam = new sampleTest()
  val c = sam.divison(10,5)
  println("sample Class Test")
  println("divison of two numbers is "+c)
  }

