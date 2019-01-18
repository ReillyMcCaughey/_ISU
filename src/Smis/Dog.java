package Smis;

public class Dog extends Being{

    private int attention;
    
    public Dog(){
        super("");
        attention = 50;
        time = 7;
    }
    public Dog(String nm){
        super(nm);
        attention = 50;
        time = 7;
    }
    
    @Override
    public void play() {//increase attention and happiness
        attention += 50;
        if(attention <= 0){
            attention = 0;
        }
        happiness += 25;
        if(happiness >= 100){
            happiness = 100;
        }
        advanceTime(3);
    }
    @Override
    public String playString(){//custmom toString for the play method
        String result = name;
        String str[] = new String[3];
        str[0] = " is playing with a chew-toy.";
        str[1] = " is getting dirty in the yard.";
        str[2] = " is digging for an old bone.";
        result += str[generate(3)];
        return result;
    }
    @Override
    public String info(){
        String str = "";
        str += "Name: " + name;
        str += super.info();
        str += "\nAttention: " + attention + "/100";
        return str;
    }
    @Override
    public void sleep() {//decrease hunger, increase happiness, set time, change exclusive property
        if(hunger >=40){
            hunger -=40;
        }
        else hunger = 0;
        
        happiness += 25;
        if(happiness >=100) happiness = 100;
        
        attention -= 40;
        if (attention <=0) attention = 0;
        
        time = 7;
    }

    public int getAttention() {
        return attention;
    }

    
    
    public void dig(){
        advanceTime(8);
        int mon[] = new int[3];
        mon[0] = 0;
        mon[1] = 0;
        mon[2] = 25;
        money += mon[generate(3)];
        attention -= 20;
        happiness += 5;
        if(happiness >=100) happiness = 100;
    }

    @Override
    public String getExclusive() {
        return "Attention:           " + Integer.toString(attention);
    }
    
}
