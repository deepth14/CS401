package lesson3.labs.prob1;

public class PersonWithJob {
	private Person person;
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n){
		setPerson(new Person(n));
		salary = 0;
	}
	PersonWithJob(String n, double s) {
		setPerson(new Person(n));
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false;
		
		if(aPerson instanceof Person) {
			Person p = (Person)aPerson;
			return p.getName().equals(person.getName());
		}
		
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = p.person.getName().equals(person.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1.getPerson()));
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}


}
