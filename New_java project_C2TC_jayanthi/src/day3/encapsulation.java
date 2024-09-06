package day3;

public class encapsulation {
	 private String name;
	    private int age;

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Setter for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter for age
	    public int getAge() {
	        return age;
	    }

	    // Setter for age
	    public void setAge(int age) {
	        this.age = age;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       encapsulation person = new encapsulation();

		        // Set values using setter methods
		       person.setName("John");
		       person.setAge(30);

		        // Retrieve values using getter methods
		        System.out.println("Name: " + person.getName());
		        System.out.println("Age: " + person.getAge());
		    }

	}


