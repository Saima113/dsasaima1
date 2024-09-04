package Day21;
public class oopac{
     //description code only thats why no main function

     //state
     boolean start;
     int temp;
     String swing;
     int fanspeed;

     oopac(boolean val1,int val2,String val3,int val4){
          start=val1;
          temp=val2;
          swing=val3;
          fanspeed=val4;

     }

     //behaviour
     void Switchmode(){
         if(start==true){
          start=false;
         }
         else{
          start=true;
         }

     }

     void Increase(){
          if(temp==30){
               return;
          }
          temp++;
     }

     void Decrease(){
          if(temp==16){
               return;
          }
          temp--;
     }
}