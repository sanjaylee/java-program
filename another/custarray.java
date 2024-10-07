package another;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class sanjay{
	String name;
	int age;
	sanjay(String n,int a){
		this.name=n;
		this.age=a;
	
	}
	
}
class lee{
	
	String gender;
	int  moblie;
	public lee(String gender, int moblie) {
		super();
		this.gender = gender;
		this.moblie = moblie;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMoblie() {
		return moblie;
	}
	public void setMoblie(int moblie) {
		this.moblie = moblie;
	}
	@Override
	public String toString() {
		return "lee [gender=" + gender + ", moblie=" + moblie + "]";
	}
	
}


public class custarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<sanjay> obj=new ArrayList<sanjay>();
		obj.add(new sanjay( "sanjay",23));
		obj.add(new sanjay("arun",24));
		obj.add(new sanjay("dharan",87));
		obj.add(new sanjay("santhosh",54));
		System.out.println("------------------------user defined arraylist for loop print-----------------");
		for(sanjay sa:obj) {
			System.out.println(sa.age+" ,"+sa.name);
		}

		System.out.println("-----------------------user defined arraylist print by iterator method----------------");
		Iterator<sanjay> its=obj.iterator();
		while(its.hasNext()) {
			sanjay s=its.next();
			System.out.println(s.age+" <"+s.name);
		}
		
		System.out.println("-----using getter and tostring method-------------");
		LinkedList <lee> le=new LinkedList<lee>();
		le.add(new lee("male",234567));
		le.add(new lee("female",45234567));
		le.add(new lee("male",5234567));
		
		System.out.println(le);
		System.out.println("--------using getter and tostring method print one by one------");
		
		for(lee as:le) {
			System.out.println(as);
		}
		
	}

}
