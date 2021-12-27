 import java.util.Scanner; 
 
 class Product{ 
	 int pid,price,quantity; 
	 int total=0; 
  
	 Product(int pid,int price,int quantity){ 
		 this.pid=pid; 
		 this.price=price; 
		 this.quantity=quantity; 
	 } 
  
	 public String toString(){ 
		 return pid+" "+price+" "+quantity; 
	 } 
  
	 public int total(){ 
		 total = total + price * quantity; 
		 return total; 
	 } 
  
 } 
  
  
 class Main{ 
	 public static void main(String[] args){ 
		 Scanner in = new Scanner(System.in); 
		 System.out.println("Enter the number of product :"); 
		 int n = in.nextInt(); 
  
		 int total=0; 
  
		 Product product[] = new Product[n]; 
  
  
		 for(int i=0;i<n;i++){ 
			 System.out.println("Enter the product id : "); 
			 int pid = in.nextInt(); 
			 System.out.println("Enter the product price :"); 
			 int price = in.nextInt(); 
			 System.out.println("Enter the product quantity : "); 
			 int quantity = in.nextInt(); 
			 product[i] = new Product(pid,price,quantity); 
			 System.out.println("---------------------------------------");  } 
 
		 int hprice = product[0].price; 
		 int hpid = product[0].pid; 
  
		 for(int i=0;i<n;i++){ 
			 System.out.println(product[i]); 
			 System.out.println("--------------------------------------");  } 
  
		 for(int i=0;i<n;i++){ 
			 if(hprice<product[i].price){ 
				 hprice = product[i].price; 
				 hpid = product[i].pid; 
			 } 
		 } 
  
		 System.out.println("Highest pid is : "+hpid);  System.out.println("Highest price is : "+hprice);   
		 for(int i=0;i<n;i++){ 
			 total = total + product[i].total(); 
		 } 
  
		 System.out.println("Total price : "+total); 
	 } 
 }
