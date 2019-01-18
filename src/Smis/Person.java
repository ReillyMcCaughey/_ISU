/*TODO


*/
package Smis;

public class Person extends Being{
    
    private int stress;
    
    public Person(){
        super("");
        stress = 50;
        time = 7;
    }
    
    public Person(String nm){
        super(nm);
        stress = 50;
        time = 7;
    }

    @Override
    public void play() {//lower stress levels and increase happiness
        stress -= 15;
        if(stress <= 0){
            stress = 0;
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
        str[0] = " is playing games on their computer.";
        str[1] = " is playing a board game.";
        str[2] = " is playing in the park.";
        result += str[generate(3)];
        return result;
    }
    
    @Override
    public String info(){
        String str = "";
        str += "Name: " + name;
        str += super.info();
        str += "\nStress: " + stress + "/100";
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
        
        stress -= 30;
        if (stress <=0) stress = 0;
        
        time = 7;
    }
    
    public int getStress() {
        return stress;
    }
    
    public void work(){
        advanceTime(8);
        money += 10;
        happiness -= 20;
        if (happiness <=0) happiness = 0;
        stress += 25;
        if(stress >=100) stress = 100;
    }

    @Override
    public String getExclusive() {
        return "Stress:              " + Integer.toString(stress);
    }

    
}
