object celciusToFahrenheit{
    def convert(temp : Double):Double=temp*1.8000+32.00
    def main(args: Array[String]):Unit={
        printf("%s %.2f","35 degrees celcius in Fahrenheit : ",convert(35))
    }

}
