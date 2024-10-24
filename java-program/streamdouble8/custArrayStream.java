package streamdouble8;

import java.util.ArrayList;
import java.util.Comparator;

public class custArrayStream {
	
	private String name;
	int age;
	int salary;
	custArrayStream(String a,int b,int c){
		this.name=a;
		this.age=b;
		this.salary=c;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

	@Override
	public String toString() {
		return "custArrayStream [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <custArrayStream> cu=new ArrayList<custArrayStream>();
		cu.add(new custArrayStream("sanjay",21,70000));
		cu.add(new custArrayStream("apple",221,10000));
		cu.add(new custArrayStream("zoho",3,40000));
		cu.add(new custArrayStream("lee",31,53000));
		
		
		

		// System.out.println(cu);
		System.out.println("------------------------------sorted by name--------------------");
		System.out.println();
		cu.stream()
		.sorted(Comparator.comparing(custArrayStream::getName))   //getage    //   getsalary
		.forEach(System.out::println);
		
		
		System.err.println("-------------------map() using custArray------------------------");
		
		cu.stream()
		.map(s->s.getName())
		.map(a->a.toUpperCase())
		.forEach(System.out::println);
		
		System.err.println("------------------map() and filter() ---------------------");
		
		cu.stream()
		.filter(em->em.salary>50000)
		.map(em->em.getName())
		.forEach(System.out::println);
		
       System.err.println("------------------map() and filter() anthor way-----------------------");
		cu.stream()
		.filter(em->em.salary>50000)
		
		.forEach((em)->System.out.println(em.name+" + "+em.age));
		
		
		
		
		
		
	}

}
