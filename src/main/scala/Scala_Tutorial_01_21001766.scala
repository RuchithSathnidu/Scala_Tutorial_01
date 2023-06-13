object Scala_Tutorial_01_21001766 {

    def main(args: Array[String]) = {
      println(Area_disk(5))
      println(CtoF(35))
      println(volume_sphere(5))
      println(totalcost(60))
      println(run(4, 3))
    }

    var pi: Double = 3.14

    def Area_disk(r: Double): Double = pi * r * r

    def CtoF(a: Double): Double = a * 1.8000 + 32

    def volume_sphere(r: Double): Double = (4.0/3) * pi * r * r * r

    def cost(c: Int): Double = c * 24.95

    def discount(c: Double): Double = c * 40 / 100

    def sc(c: Int): Double = if (c > 50) {
      3 + ((c - 50) * 0.75)
    } else {
      3
    }

    def totalcost(c: Int): Double = cost(c) - discount(cost(c)) + sc(c)

    def easy_pace(km: Double): Double = 8 * km

    def Tempo(km: Double): Double = 7 * km

    def run(km1: Double, km2: Double): Double = easy_pace(km1) + Tempo(km2)

}
