
package Unimportant_ISU_Ideas;

public class Firefighter extends Character{

    public Firefighter(){
        super("","");
    }
    public Firefighter(String nm, String oc){
        super(nm, oc);
    }
    @Override
    public void work() {
        //txtoutput.setText(name + " is going to work.");
        hunger -= 10;
        money += 11.45;
        int m[] = new int[5];
        m[0] = -10; 
        m[1] = -20; 
        m[2] = 0;
        m[3] = 20; 
        m[4] = 10;
        int loc = (int)Math.floor(Math.random() * 5);
        happiness += m[loc];
    }
    
    public void compete(){
        //txtoutput.setText(name + " is now competing in a tournament.")
        int m[] = new int[5];
        m[0] = 10; 
        m[1] = 20; 
        m[2] = 30;
        m[3] = 40; 
        m[4] = 50;
        int loc = (int)Math.floor(Math.random() * 5); 
        physical += m[loc]; //add a random physical number
        happiness += m[loc];
        
    }
    
}
