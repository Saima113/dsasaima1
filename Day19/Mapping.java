import java.util.*;
public class Mapping {
     public static void main (String[] args){
        HashMap<Integer,Integer> mp=new HashMap<> (); //initialize
        int[] arr={1,2,3,4,5,2,1,2,3,3,6,7,6,18,3,2,2};
        for(int i:arr){
         if(mp.containsKey(i)){
            mp.put(i,mp.get(i)+1);
         } else{
            mp.put(i,1);
         }
         
      }
      System.out.println(mp);

        mp.put(1,2); //add
        mp.put(2,3);
        mp.put(3,4);
        mp.put(4,1);
        mp.put(5, null); //value of any key be defined with null
        System.out.println(mp); //display
        arr[0]=2;
        arr[1]=4;
        mp.put(1,1);
        mp.put(4,2);
        System.out.println(mp.containsKey(3)); //to check if a key already exists or not boolean
        System.out.println(mp); //using put function to add or modify anything in map
        mp.remove(3); //to remove 
        System.out.println(mp);
        System.out.println(mp.containsKey(3)); 
        System.out.println(mp.get(2)); // accessing, gives null if the key doesnt exist and gives the value if key exists

       // iteration of map
        for(Map.Entry m:mp.entrySet()){  //getkey() getvalue()  m works like i and entrySet converts the map into a set     set is always sorted and no key is repeated
            System.out.println("the key is :"+m.getKey() + " the value is:"+ m.getValue());

        }
        
     }
    
}
