object CalculateSquareNumbers{

    def calculateSquare(numbers :List[Int]):List[Int]={
        return numbers.map(num=>num*num);
    }


    def main(args :Array[String]):Unit={
        val input=List(1, 2, 3, 4, 5);
        val output=calculateSquare(input);
        printf("Square Numbers List : "+output);

    }
}
