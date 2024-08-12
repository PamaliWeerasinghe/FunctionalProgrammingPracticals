import scala.io.StdIn.readInt

object PatternMatching{
    def getInt():Int={
        println("Enter an Integer");
        val num=readInt();
        return num;

    }
    def matchPattern(num :Int):String={
        
        (num%3==0, num%5==0)match{
            case(true,true)=>"Multiple Of Both Three and Five"
            case(false,true)=>"Multiple of Five"
            case(true,false)=>"Multiple of Three"
            case _=>"Not a multiple of Three or Five"
        }
    }
    def main(args:Array[String]):Unit={
        val num=getInt();
        val output=matchPattern(num);
        println(output)
    }
}
