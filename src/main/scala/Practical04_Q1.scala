object retailShop{
    var items:Array[String] = Array("Toffee","Bread","Pencil","Eraser","Pen");
    var quantity:Array[Int] = Array(10,5,8,6,2);

    def displayInventory():Unit={
        println("------------INVENTORY------------");
        for(i<-0 until items.length){
            println(items(i)+" : "+quantity(i));
        }
    }

    def restockItem(item:String , quantityVal:Int):Unit={
        var found:Boolean = false;
        for(i<-0 until items.length){
            if(items(i)==item){
                quantity(i) += quantityVal;
                println("Item is restocked");
                found = true;
            }
        }
        if(!found){
            println("Item not found");
        }
    }

    def sellItem(item : String , quantityVal : Int) : Unit = {
        var found:Boolean = false;
        for(i<-0 until items.length){
            if(items(i)==item){
                if(quantity(i)>=quantityVal){
                    quantity(i) -= quantityVal;
                    println("Item is sold");
                }
                else{
                    println("Not enough quantity");
                }
                found = true;
            }
        }
        if(!found){
            println("Item not found");
        }
    }

    def main(args:Array[String]):Unit={
        restockItem("Pen",4);
        displayInventory();
        sellItem("Toffee",6);
        displayInventory();
    }
}