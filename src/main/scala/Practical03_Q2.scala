def checkLength(strings :List[String]):List[String]={
    strings.filter(_.length>5)
    //_ is used to iterate through each element in the list
    //filter is a special operation that is allowed by the List data structure

}

def main(args: Array[String]):Unit={
    //A List is mutable
    //A new list is returned after adding or removing existing elements
    
    val strings=List("Germany","Cuba","USA","Canada")
    val checked=checkLength(strings)
    println(checked)
}