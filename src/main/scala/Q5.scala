object runningTime{
    def easy_time(distance : Float):Float=distance*8
    
    def tempo_time(distance : Float):Float=distance*7
    
    def main(args :Array[String]):Unit={
        printf("%s %.2f","Total running time : ",easy_time(2)+tempo_time(3)+easy_time(2))
    }
}