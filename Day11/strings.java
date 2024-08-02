
public class strings {
    public static String changeName(String str){
        String s1=" ";
        for(int i=0;i<str.length();i++){
            s1+=(char)(str.charAt(i)+1);
            
        }
        System.out.println(s1);
        return s1;
     }
     public static String reverseName(String str){
        String s1="";
        for(int i=str.length()-1;i>=0;i--){
            s1+=str.charAt(i);    
        }
        return s1;
     }
     public static boolean palindrome(String str){
        String s=reverseName(str);
        for(int i=0;i<str.length();i++){
        if(s.charAt(i)==str.charAt(i))
            return true;
            
        
    } 
    return false;
        
     }

    // new method is str.equals()
    //str.equalsIgnoreCase()
    //compareto gives integer  value
     public static boolean palindrome1(String str){
        return(str.equals(reverseName(str))); // t or f
        
     }
     //trim() 
     //split()
     public static String reverse(String s){
        s=s.trim();
        String[] s_arr=s.split(" "); //split whenever there is space
        String ans=" ";
        for(int i=s_arr.length-1;i>=0;i--){
            ans+=s_arr[i];
     }
    
        return ans.trim();   
     }

     public static void subString(String str,int i,int j){
        for(int k=i;k<j;k++){
            System.out.print(str.charAt(k));
        }
        
     }
     // find length of longest substring with repeating characters
     public static int count(String str){
        int ans=0;
        char curr=str.charAt(0);
        int len=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==curr){
                len++;
                ans=Math.max(ans,len);
            }
            else{
                curr=str.charAt(i);
                ans=Math.max(ans,len);
                len=1;
            }
        }
        return ans;
     }



    public static void main(String[] args){
        String s1="  this is a table   ";
        //System.out.println("*"+s1.trim()+"*");
        //System.out.println(reverse(s1));
        //subString("delusion",0,8);
        System.out.println(count("saimaaaaaaaaaaaaaaaaaaaaa"));
        //String s2 = new String("hi");
        //String s3 = "hi";
        //char[] s4={'h','i'};
        //String s1 ="today is thursday";
        //String s5= "a";
       //j= System.out.println(s1.compareTo(s5));
        // 32 is the difference between their ascii values
        //System.out.println(s1==s2);
         // internally string is a character array // string is a wrapper class
         // s1==s2 gives false because 
         // heap memory and stack memory
         // if you modify a string it makes the new copy at a different address
     
         //System.out.println(palindrome1("saima"));
         
          

    }
    
}
