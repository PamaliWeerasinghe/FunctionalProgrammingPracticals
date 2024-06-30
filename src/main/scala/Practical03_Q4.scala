def sum(integers :List[Int]):Int={
    integers.filter(_%2==0).sum
}

def main(args :Array[String]):Unit={
    val integers=List(1,2,3,4,5)
    val filtered=sum(integers)
    println("The list of integers : "+integers)
    println("The sum of even numbers : "+filtered)
    
}