import scala.io.StdIn.readInt
object CalculateInterest{
    
    def main(args: Array[String]): Unit = {
        val Interest=(amount: Double)=> amount match {
            case amount if amount<=20000 && amount>0 => printf("Interest per year for the deposit amount of Rs."+amount+" is : "+amount*0.02)
            case amount if amount >20000 && amount<=200000 =>printf("Interest per year for the deposit amount of Rs."+amount+" is : "+amount*0.04)
            case amount if amount >200000 && amount<=2000000 =>printf("Interest per year for the deposit amount of Rs."+amount+" is : "+amount*0.035)
            case amount if amount >2000000 =>printf("Interest per year for the deposit amount of Rs."+amount+" is : "+amount*0.065)
            case _ =>printf("Deposit amount entered is not valid")
        
        }   
        printf("Enter the deposit amount : ")
        val amount=readInt();
        Interest(amount)
    }
}