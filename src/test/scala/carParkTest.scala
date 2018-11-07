import org.scalatest.FunSuite

class CarTest extends FunSuite {
  test("Should move the car to 1,1"){
    var car = new Car("red","fiat")
    assert(car.color === "red")
    car.move(1,1)
    assert(car.position(0) === 1)
    }

}
