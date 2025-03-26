
public class Dolphin extends Animal implements Swim {
    private static final long serialVersionUID=1L;


    private String color;
    private int swimmingSpeed;

    public Dolphin(){
        super("Dolphin");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish.");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed " + swimmingSpeed);
    }
    @Override
    public String toString(){
        return String.format("Dolphin{color='%s', swimmingSpeed=%d}", color, swimmingSpeed);
    }

}
