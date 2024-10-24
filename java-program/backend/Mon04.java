package backend;

public class Mon04 {
    // int variable
	static int obj=10;
	static int obj1=25; 
	static int obj2=4;
	Integer sa=new Integer(obj);
	Integer sa1=new Integer(obj1);
	  
	//Char variable
	    char c='A';
	    char d='a';
	    Character var=new Character(c);
	    Character var1=new Character (d);
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mon04 aa=new Mon04();
		//print the value
        System.out.println(obj);
        System.out.println(obj1);
        //int convert to Integer
        System.out.println("int convert to Integer");
        System.out.println(aa.sa);
        System.out.println(aa.sa1);
        
       // Integer convert String
        System.out.println("Integer convert String");
        System.out.println(aa.sa.toString()+aa.sa1);
        
        //compare
        System.out.println("compareTo the right side biggest value(print -1) ");
        System.out.println(aa.sa.compareTo(aa.sa1));  
        System.out.println("compareTo the left side biggest value(print 1) ");
        System.out.println(aa.sa1.compareTo(aa.sa));
        System.out.println("compareTo the value equal (print 0) ");
        //System.out.println(aa.sa.compareTo(aa.sa1));
       
        //compareeUnsigned
        System.out.println(Integer.compareUnsigned(aa.sa, aa.sa1));
        
        //String Integer convert
        System.out.println("String Integer convert");
        System.out.println(Integer.valueOf("34"));
        
        //add two value used to sum
        System.out.println("add two value used to sum");
       System.out.println(Integer.sum(aa.sa,aa.sa1));
       
       //minimam value
       System.out.println("minimam value");
       System.out.println(Integer.min(aa.sa,aa.sa1));
       
       
       //maximam value
       System.out.println("maximam value");
       System.out.println(Integer.max(aa.sa,aa.sa1));

       //String convert int
       System.out.println(" String convert int");
       System.out.println(Integer.parseInt("99"));
     
       
       //-------------------------------------------Char Method---------------------------------------------------------
       
              // char convert to String
       System.out.println("char meyhod");
         System.out.println(aa.var.toString());
         
               //GetNumericValue----
         
         System.out.println("GetNumericValue");
         System.out.println(aa.var.getNumericValue('i'));
         System.out.println(aa.var.getNumericValue('5'));
         
         //isAlphobetic
         System.out.println("isAlphobetic");
         System.out.println(aa.var.isAlphabetic('&'));
         System.out.println(aa.var.isAlphabetic('S'));
         
         //isDigit
          System.out.println("isDigit");
          System.out.println(aa.var1.isDigit('7'));
          System.out.println(aa.var1.isDigit('o'));
          
        // isLower
          System.out.println("is Lower");
          System.out.println(Character.isLowerCase(aa.var1));
          System.out.println(Character.isLowerCase(aa.var));
            
        //is Uppercase  
          System.out.println("upper case");
        System.out.println(Character.isUpperCase(aa.var1)); 
        System.out.println(Character.isUpperCase(aa.var));
        
        //isWhitespace
        System.out.println("isWhitespace");
       System.out.println(Character.isWhitespace(' '));
       System.out.println(Character.isWhitespace('s'));
       
	}

}
