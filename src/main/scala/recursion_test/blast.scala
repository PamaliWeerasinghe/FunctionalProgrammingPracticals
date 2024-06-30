def blast (n:Int):Unit={
    println(n)
    if(n<=1) println("BlastOff!")
    else blast(n-1)
}


def main(args :Array[String]):Unit={
    blast(3);
}