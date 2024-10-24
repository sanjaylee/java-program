package Test;

public class switchcase {
	
	
class gh{
public void meth(String[] pass) {
	for(int i=pass.length-1;i>=0;i--) {
		System.out.println(pass[i]);
	}
}

}
public static void main(String[] args) {
		
		String s="firday";
		switch(s) {
		case "monday":
			System.out.println("monday");
			break;
		
		case "tuesday":
			System.out.println("tuesday");
			break;
		
		case "wednesday":
			System.out.println("wednesday");
         	break;
		
		case "thursday":
			System.out.println("thursday");
			break;
		
		case "friday":
			System.out.println("friday");
			break;
		
		 default:
			 System.out.println("saturday or sunday");
		}
    System.out.println("-------------while------------");
		
		int arr[]= {1,2,3,4,5,6};
		int x=0;
		
		while(x<arr.length) {
			System.out.println(arr[x]);
			x++;
		}
		System.out.println("-------------------while reverse -----------");

		int arrr[]= {1,2,3,4,5,6};
		int xx=arr.length-1;
		
		while(xx>=0) {
			System.out.println(arrr[xx]);
			xx--;
		}
		
		System.out.println("---------------do while----------------------");
		
		int aa[]= {1,3,5,7,9};
		int ss=0;
		do {
			System.out.println(aa[ss]);
			ss++;
		}while(aa.length>ss);
		
		
		
		System.out.println("------------------array method --------------------");
		
		switchcase sw=new switchcase();
	    switchcase.gh sww=sw.new gh();
		String[] pass= {"sanjay","lee"};
		
		sww.meth(pass);
		
		
		
		
		
		
		
		}
		
	}


