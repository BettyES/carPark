import Array._

//object carPark {
//  def main(args: Array[String]) {
//    val fiat = new Car("red","Fiat")
//    var seat = new Car("white","Seat")
//
//    fiat.readCoordinates("fiat")
//    seat.readCoordinates("seat")
//    // Move to a new location
//
//    println(fiat.coord(0))
//
//    fiat.move(fiat.coord(0), fiat.coord(1))
//    seat.move(seat.coord(0), seat.coord(1))
//
//    if(seat.position(0) == fiat.position(0) && seat.position(1)==fiat.position(1) && fiat.position(1)<4){
//      seat.move(0,1)
//      println("Apologies, but this parking spot has been taken, we have parked you car to the right" )
//    }else if(seat.position(0) == fiat.position(0) && seat.position(1)==fiat.position(1) ){
//      seat.move(0,-1)
//      println("Apologies, but this parking spot has been taken, we have parked you car to the left" )
//    }
//
//    println()
//    val streetMap = new Grid(3,3);
//    streetMap.updatePosition(fiat.position(0),fiat.position(1))
//    streetMap.updatePosition(seat.position(0),seat.position(1))
//    streetMap.show()
//
//  }}

object carPark {
  def main(args: Array[String]) {
    val fiat = new Car("red","Fiat")

    fiat.readCoordinates("fiat")

    // Move to a new location

    fiat.move(fiat.coord(0), fiat.coord(1))

    // display location
    val streetMap = new Grid(5,5);
    streetMap.updatePosition(fiat.position(0),fiat.position(1))
    streetMap.show()

  }}


/*class car(col: String, mk: String) {
  val color = col
  val make = mk
  var posX: Int = 0
  var posY: Int = 0
  val position = new Array[Int](2);
  //    position(0) = posX
  //    position(1) = posY

  def move(dx: Int, dy: Int) {
    posX = posX + dx
    posY = posY + dy
    println ("Point x location : " + posX);
    println ("Point y location : " + posX);
    position(0) = posX
    position(1) = posY
    return position
  }
}*/

/*class grid(r:Int, c: Int){
  val row = r
  val col = c
  var streetMap= ofDim[Int](5,5);
  for (i <- 0 to 4) {
    for ( j <- 0 to 4) {
      streetMap(i)(j) = 0;
    }
  }

  def updatePosition(posX: Int,posY:Int): Unit ={
    streetMap(posX)(posY) = 1
  }

  def show(): Unit ={
    for (i <- 0 to 4) {
      for ( j <- 0 to 4) {
        print(" " + streetMap(i)(j));
      }
      println();
    }
  }

}*/

