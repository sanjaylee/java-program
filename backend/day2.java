package backend;
//byte->short->char->int->long->float->double
public class day2 {
	//while
	static int y=0;
	//do while
	static int sum0=5;
	static int z=0;
	public int sum=5;
	public int sum2=3;
	static int rrr=4;
	
	// widening casting int float conved
	public static int val=1;
	static float va2=val;
	
	//array similar data type only allowed
	static int arr[]= {2,4,6,8};
	
	//narrow casting type casting(type conversion)double to int
	public static double sa1=13.26;
    static int sa2=(int)sa1;
//method
    
    static void myfun() {
    	System.out.println(" void function without parameter");
    }
    static int myfun2() {
    	return 6;
    }
    static void myfun1(int num) {
    	System.out.println(" void function with parameter ="+num);
    }
    static int myfun5(int num2){
    	return num2;
    }
    public static void main(String[] args){
    	//class called
    	
    	day2 aa=new day2();
     System.out.println("widening casting-integer to float="+va2);
     System.out.println("narrow casting -double to integer="+sa2);
   //called a method
     myfun();
     System.out.println(" non void function without parameter="+(myfun2()));
     myfun1(69);
     System.out.println("non void function with parameter="+(myfun5(60)));
     
 // Arithmatic operator
     
    	System.out.println("-------Arithmetic operators-----");
    	System.out.println("addition="+(aa.sum2+aa.sum));
    	System.out.println("subtraction="+(aa.sum-aa.sum2));
    	System.out.println("multiplication="+(aa.sum*aa.sum2));
    	System.out.println("division="+(aa.sum/aa.sum2));
    	System.out.println("modulo="+(aa.sum%aa.sum2));	
//logical operator
    	
    	System.out.println("-------Logical operators-------");	
    	System.out.println("five greaten then three is="+(aa.sum>aa.sum2));	
    	System.out.println("five less then three is="+(aa.sum<aa.sum2));	
    	System.out.println("five greater then or equal to three is="+(aa.sum<=aa.sum2));	
    	System.out.println("five less then or equal to three is="+(aa.sum>=aa.sum2));	
    	System.out.println("five is equal to three is="+(aa.sum==aa.sum2));	
    	System.out.println("five is not equal tothree is="+(aa.sum!=aa.sum2));	
 //comparison operators
    	
    	//AND operator
    	System.out.println("------comparison operators------");	
    	System.out.println("And (&& opreator-both condition are satisfied="+(100>99 && 100>99));
    	System.out.println("And (&& opreator-single condition are satisfied="+(100<99 && 100>99));
    	//OR operators
    	System.out.println("OR(||) operator-single conditions are satisfied="+(98<99 || 100>101));
    	System.out.println("OR(||) operator-both conditions are satisfied="+(98<99 || 100>99));
    	
 //ternary operators   	
    	System.out.println( "-------Ternary operators------");	
    	System.out.println("100>99="+(100>99?"rigth":"worng"));
    	System.out.println("99>100="+(99>100?"rigth":"worng"));
  //array 
    	System.out.println("-------array------");
    	System.out.println("array memory address"+arr);
    	System.out.println("array[0] is"+arr[0]);
    	System.out.println("array[1] is"+arr[1]);
    	System.out.println("array[2] is"+arr[2]);
    	System.out.println("array[3] is"+arr[3]);
 // Loops
    	System.out.println("--------Loops---------");
    	System.out.println("-------- if Loops---------");
    	//if or if else
    	if(3<4){
    		rrr=rrr+3;
    	} else {
    		rrr=rrr-1;
    	}
    	System.out.println("if statement value="+rrr);
    	// if else loops
    	System.out.println("------if else----");
    	if(3>4){
    		sum0=sum0+3;
    	} else if(4<8) {
    		sum0=sum0*3;
    	}
    	System.out.println("if else statement value="+sum0);
    	
    	System.out.println("-------for loops-------");
  //For LOOPS
    	for(int i=0;i<4;i++) {
    	System.out.println(arr[i]);
    	
    }
  //while loops
    	System.out.println("--------while loops------");
    	while(y<4) {
    	System.out.println(arr[y]);
    	y++;
      }
  //do while
    	System.out.println("-------- do while loops------");
    	do {
    	System.out.println(arr[z]);
    	z++; 	
    	}while(z<4);
}
 }

