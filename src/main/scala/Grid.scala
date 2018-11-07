import Array._
class Grid(r:Int, c: Int) {
  val row: Int = r
  val col: Int = c
  var streetMap = ofDim[Int](row, col)
  for (i <- 0 to row-1) {
    for (j <- 0 to col-1) {
      streetMap(i)(j) = 0
    }
  }

  def updatePosition(posX: Int, posY: Int): Unit = {
    streetMap(posX)(posY) = 1
  }

  def show(): Unit = {
    println("=========================")
    for (i <- 0 to row-1) {
      print("|")
      for (j <- 0 to col-1) {
        print(" " + streetMap(i)(j)+" | ")
      }
      println()
      println("=========================")

    }
  }
}
