package day3;

public class constructer { 
	    String name;  
		//creating a default constructor 
	    constructer(){
			System.out.println(" default constructer is created");
	    }
		constructer(String n){
		name=n;
		}
		void display(){
			System.out.println("Parameterized constructer. My name is = "+name);
			}
		
		//main method    
         public static void main(String[] args) {
		// TODO Auto-generated method stub
        	//calling a default constructor  
     		constructer obj1=new constructer();
     		constructer obj2= new constructer("Jayanthi");
     		obj2.display();
     		}  
}
