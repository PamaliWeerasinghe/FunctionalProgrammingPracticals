import scala.io.StdIn.readLine;

object inventoryManagement{
    var productList:List[String]=List();
    def getProductList(productList :List[String]):List[String]={
        println("Enter the Product Name : ")
        val product=readLine()
        if(product.toLowerCase=="done") productList
        else getProductList(productList:+product)

    }
    def printProductList(productList:List[String]):Unit={
        
        // position  productName
        for(i<-1 until productList.length+1){
            printf("%d %s",i,productList(i-1))
            printf("\n");
        }
    }
    def getTotalProducts(productList:List[String]):Unit={
        printf("Total number of products in the list : ")
        val listLength = productList.length
        printf("%s",listLength)
    }

    def main(args:Array[String]):Unit={
        val productList=getProductList(List());
        printProductList(productList);
        getTotalProducts(productList);
    }

}