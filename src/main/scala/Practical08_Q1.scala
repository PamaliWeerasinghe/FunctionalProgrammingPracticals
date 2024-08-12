import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
object CaesarCipher{
    // encrypt function
    def encrypt(text:String, shift:Int ):String={
        text.map{ char=>
            if(char.isLetter){
                val base=if(char.isUpper) 'A' else 'a'
                ((char - base + shift) % 26 + base).toChar
            }else{
                char
            }


        }
    }
    //decrypt function
    def decrypt(text: String, shift:Int):String={
        text.map{ char =>
            if(char.isLetter){
                val base=if(char.isUpper) 'A' else 'a'
                ((char - base - shift + 26)% 26 + base).toChar
            }else{
                char
            }

        }
    }
    //Cipher function that takes either the encrypt or decrypt function as an argument

    def cipher(text: String, shift: Int, operation:(String,Int)=>String):String={
        operation(text,shift);
    }
    // Get plain text function
    def getPlainText():String={
        println("Enter plain text : ");
        val plainText=readLine();
        return plainText

    }

    //Get shift function
    def getShift():Int={
        println("Enter the shift count : ");
        val shifts=readInt();
        return shifts;
    }
    def main(args: Array[String]):Unit={
        val plainText=getPlainText();
        val shifts=getShift();

        val encryptedText=cipher(plainText,shifts,encrypt)
        println("Encrypted Text : "+encryptedText);

        val decryptedText=cipher(encryptedText,shifts,decrypt)
        println("Decrypted Text : "+decryptedText);
    }
}