package Day21;

public class acmanuf {
     public static void main (String[] args){

        oopac daikin =new oopac(true,26,"right",6); //method to cal constructor

        System.out.println(daikin.temp);
        daikin.start=true;
        daikin.temp=26;
        daikin.swing="right";
        daikin.fanspeed=6;
    
       daikin.Increase();
       System.out.println(daikin.temp);
     }
    
}
