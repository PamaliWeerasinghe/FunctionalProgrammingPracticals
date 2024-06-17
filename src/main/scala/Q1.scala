object diskArea{
    def areaOfCircle(r:Double):Double=r*r*math.Pi

    def main(args: Array[String]):Unit={
        printf("%s %f","The area of a disk with radius 5 is",areaOfCircle(5))
    }
}

