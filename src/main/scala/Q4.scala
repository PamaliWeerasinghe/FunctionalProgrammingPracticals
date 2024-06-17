object costForCopies{
    def bookPrice(copies :Int):Double=copies*24.95
    
    def discount(amount :Double):Double=amount*0.4
    
    def shippingCost(copies :Int):Double={
        if(copies>=50) 3*50+(copies-50)*0.75
        else 3*copies

    }
    def totalCost(x :Int):Double=bookPrice(x)+shippingCost(x)-discount(bookPrice(x))
    def main(args :Array[String]):Unit={
        printf("%s %.2f","The total cost for copies is : ",totalCost(60))
    }
}