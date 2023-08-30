import java.util.*;
class reverse{
    void rev(String n){
        char[] c=new char[n.length()];
        int p=0;
        for(int i=n.length()-1;i>=0;i--){
            c[p]=n.charAt(i);
            p++;
        }
       String emp="";
       for(int j=0;j<n.length();j++){
           emp=emp+c[j];
       }
	try{
       System.out.println(emp);
      System.out.println(emp.charAt(5));
	//System.out.println(n);
	}
	catch(Exception e){
		System.out.println("name must be only 4 letters");
	}
	finally{
	System.out.println(n);
	}
	
        
    }
}
class ExceptionHandling{
    public static void main(String[] args){
        String str="RAMA";
         reverse obj=new reverse();
        obj.rev(str);
    
    }
}