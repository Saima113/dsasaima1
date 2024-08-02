package Day12;
public class Wrapper{
    public static void allSubstrings(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
               System.out.println(str.substring(i,j));

            }
        }
    }
    public static void main(String[] args){
        //autoboxing kept phone in the box
        // kept primitive datatype in its wrapper class
        int x=4;
        Integer y=x;
        // unboxing
        int z=y;
        int a=499;
        int b=499;
        Integer c=499;
        Integer d=499;
        System.out.println(c==d);

        // false
        allSubstrings("abcde");
    }

}
