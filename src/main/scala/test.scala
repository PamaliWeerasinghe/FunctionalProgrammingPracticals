object Test{
    def maximum(a:Int, b:Int):Int=a>=b match{
        case true=>a
        case false=>b
        
    }
    def passFail(marks:Int):String={
        marks>=50 match{
            case true =>"PASS"
            case false =>"FAIL"
        }
    }
    def isEven(x:Int):Boolean=x%2 match{
        case 0=>true;
        case _=>false;
    }
    def leapYear(x:Int):String={
        (x%4==0 && x%100!=0)||(x%400==0) match{
            case true => "Leap Year"
            case false=> "Common Year"
        }
    } 
    def sinFunction(x:Int):Int=x match{
        
    }
    

    def main(args: Array[String]):Unit={
        var max=maximum(10,8)
        printf("%s %d","Maximum value is :",max);
        printf("%s %s","\nPass or Fail result : ",passFail(30))
        printf("%s %s","\nThe number is even or not:",isEven(1))
        printf("%s %s","\nThe Year is : ",leapYear(2021))
    }
}