
public class Tiger extends Animal implements Walk{
    private static final long serialVersionUID =1L;


    private int numberOfStripes;


    private int speed;


    private int soundLevel;

    public Tiger(){
        super("Tiger");
    }



    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am moving at the speed " + speed);
    }
    @Override
    public String toString(){
        return String.format("Tiger{numberOfStripes=%d, speed=%d, soundLevel=%d}", numberOfStripes, speed, soundLevel);
    }
}
