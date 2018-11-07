class Car(col: String, mk: String) {
    val color: String = col
    val make: String = mk
//    var posX: Int = 0
//    var posY: Int = 0
    var position = new Array[Int](2)
    position(0) = 0
    position(1) = 0
    var coord = new Array[Int](2)

    def move(dx: Int, dy: Int) {
      position(0) = position(0)+dx
      position(1) = position(1)+dy
    }

  def readCoordinates(carName: String){
    println(s"where do you want to move your $carName?\n Please enter X position:")
    val dx  = scala.io.StdIn.readInt()
    println("Please enter Y position")
    val dy = scala.io.StdIn.readInt()
    coord = Array(dx,dy)
  }

  }


