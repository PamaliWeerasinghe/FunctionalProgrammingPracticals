import scala.io.StdIn.readInt;

object FibonacciSeries{

    def fibonacci(n:Int):Int=n match{
        case 0=>0
        case x if x==1=>1
        case _ => fibonacci(n-1)+fibonacci(n-2)
    }
    def fibonacciSeries(n:Int):Unit={
        if(n>0) fibonacciSeries(n-1)
        println(fibonacci(n))
    }
    def main(args:Array[String]):Unit={
        println("Enter the number of terms in the series : ")
        val n=readInt();
        fibonacciSeries(n)
    }

}