
package Smis;

public abstract class Being {
    protected String name;
    protected int hunger = 50;
    protected int happiness = 50; //0-100, playing will raise
    protected static int count = -1;
    protected static int money = 200; //0-infinity
    protected static double time = 0; //0-24?
    
    public Being(String nm){ //set your own name
        name = nm;
        count++;
        money-=200;
    }
    
    public Being(){
        name = "";
        count++;
        money-=200;
    }
    
    /*public Being(int n){ //random name
        String str[] = new String[5];
        str[0] = "Bob";
        str[1] = "Gwen";
        str[2] = "Jenny";
        str[3] = "Richard";
        str[4] = "Sue";
        name = str[generate(n)];
        count++;
    }*/
    
    public final String eat(){
        //idea is that you eat more depending on how hungry you are
        advanceTime(0.5);
        if(hunger >=0 && hunger <=33){
            hunger += generate(25) + 40; 
            return name + " has eaten some food.";
        }
        if(hunger >=34 && hunger <=67){
            hunger += generate(10) + 20; 
            return name + " has eaten some food.";
        }
        if(hunger >=68 && hunger <=90){
            hunger += generate(10);
            return name + " has eaten some food.";
        } 
        if(hunger >=91 && hunger <=100) return "Can not eat. " + name + " is not hungry enough.";
        else
            return "Can not eat at this time.";
    }
    
    public final void advanceTime(double n){//Each action will advance the time forward in the day. Will eventually force character to sleep.
        time += n;
        if(time >=24) time = 0;
        if((time >=21 && time <24) || (time >=0 && time <7)) sleep();
    }
    
    public abstract void sleep();
    public abstract String playString();
    public abstract void play();
    public abstract String getExclusive();
    
    public final int generate(int n){
        int num = (int)Math.floor(Math.random() * n);
        return num;
    }
    
    public String info(){//like a toString but just for character stats.
        String str = "";
        str += "\nHappiness: " + happiness + "/100";
        str += "\nHunger: " + hunger + "/100";
        return str;
    }
    
    public String getName(){
        return name;
    }
    
    public static int getMoney(){
        return money;
    }

    public final int getHunger() {
        return hunger;
    }

    public final int getHappiness() {
        return happiness;
    }

    public static double getTime() {
        return time;
    }
    
    public static int getCount(){
        return count;
    }
    
    
}
