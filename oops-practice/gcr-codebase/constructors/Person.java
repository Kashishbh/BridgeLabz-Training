public class Person {
    String firstName;
    String lastName;
    Person(String firstName,String lastName){
    	this.firstName=firstName;
    	this.lastName=lastName;
    	
    }
    Person(Person clonedPerson){
    	this.firstName=clonedPerson.firstName;
    	this.lastName=clonedPerson.lastName;
    }
    public void display() {
    	System.out.println("The name of a person are: "+firstName+" "+lastName);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person1=new Person("Kashish","Bhatnagar");
        Person person2=new Person(person1);
        person1.display();
        person2.display();
	}

}
