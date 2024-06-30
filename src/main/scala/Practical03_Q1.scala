object reverseString{
    def reverse_string(text :String):String={
        if(text.isEmpty)""
        else reverse_string(text.tail)+text.head
    }

    def main(args:Array[String]):Unit={
        println("Original String : 1234")
        println("Reverse String :"+reverse_string("1234"));
    }

}