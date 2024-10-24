package another;

import java.util.Arrays;

public class Demo {
 
		
	public static void main(String[] args) {
		
		int a=3;
		int b=6;
		int count=0;
		int sum=0;
		int[] arr=new int[b];
		
		for(int i=0;i<b;i++) {
			arr[count++]=a;
		}
	    
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
      System.out.println("-----------multi two number without * and moduls operater-----------------");
		
		
		int aa=80;
		int bb=5;
		int su=0;
		
		for(int i=0;i<bb;i++) {
			su=su+aa;
		}
		
		System.out.println(su);
		
		System.out.println("-----------interviwe question ekattudhangal----------------");
		
		String sa="hello world";
		System.out.println();
		int  lastindex=sa.indexOf(' ');
		System.out.println(sa.substring(lastindex +1));
      	
		System.out.println("----------------interviwe question ekattudhangal-------------");
		
		String ss="hello world";
		String[] sp=ss.split(" ");
		System.out.println(sp[1]); //   System.out.println(sp[sp.length-1]);
		
		System.out.println("----------------------");
	   
		
		
		
		String[] in = {"sanjay","lee","arun","rddt"};

		Arrays.sort(in);
		
	
			System.out.print(String.join("-", in));
			
		
		System.out.println();
		
		
		



			
		}
	
}