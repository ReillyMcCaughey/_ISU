
package Unimportant_ISU_Ideas;

public abstract class Character {
    protected String name;
    protected String occupation;
    protected int money = 200;
    protected int physical, hunger, safety;
    protected int happiness = 50;
    
    public Character(){
        name = "";
        occupation = "";
    }
    
    public Character(String nm, String oc){
        name = nm;
        occupation = oc;
    }
    
    public abstract void work();
    
    public String play(){
        int loc = (int)Math.floor(Math.random() * 5);
        String x[] = new String[5];
        x[0] = name + " is playing games on their PC.";
        x[1] = name + " is reading a book."; 
        x[2] = name + " is playing with their dog.";
        x[3] = name + " is holding a pleasant conversation."; 
        x[4] = name + " is going for a walk.";
        happiness += 10;
        return x[loc];
    }
    
    public boolean setName(String nm){
            if (nm.equals(""))
                return false;
            else{
                name = nm;
                return true;
            }
    }
    
    public boolean setOccupation(String o){
        if (o.equals("")) return false;
        else{
            occupation = o;
            return true;
        }
    }
    
    public final String getOccupation() {
        return occupation;
    }
    
    public final String getName() {
        return name;
    }
    
     
    
}
