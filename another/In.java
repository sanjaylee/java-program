package another;

public class In {
	protected int a=0;
   static String san="sanjay ia the dfghfghgghf";
  static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        In sa=new In();
        System.out.println(sa.a);
        
        int i=0;
        while(i<san.length()){
            if(san.charAt(i)!=' '){// this condition is used to avoid counting space
                count++;
            }
             i++;
        }
        System.out.println(i);
        
	}

}
