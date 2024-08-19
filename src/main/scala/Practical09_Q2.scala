import scala.io.StdIn.readInt;


object PatternMatching{
    def main(args: Array[String]): Unit = {
        val evenOrOdd=(num: Int)=> {
            if(num==0 || num<0){
                printf("Enter valid number")
            }else{
                num % 2 match {
                    case 0 => printf("Even Number")
                    case 1 => printf("Odd Number")
                }
            }
        
        }
        printf("Enter an integer : ")
        val num=readInt();
        evenOrOdd(num)
    }
}