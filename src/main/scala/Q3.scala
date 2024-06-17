object volumeOfSphere{
    
    def volume(r:Int):Double=4/3*math.Pi*r*r*r

    def main(args: Array[String]):Unit={
        printf("%s %.2f","The volume of a sphere with radius 5 is",volume(5))
    
}


}