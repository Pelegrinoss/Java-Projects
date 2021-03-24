import java.sql.SQLOutput;

public class Dog extends Animal  {

        private int eyes;
        private int legs;
        private int tail;
        private int teeth;
        private String coat;

    /**
     *
     * @param name e
     * @param size e
     * @param weight e
     * @param eyes e
     * @param legs e
     * @param tail e
     * @param teeth e
     * @param coat e
     */

        public Dog(String name, int size , int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
            System.out.println("Dog chewing");
    }

        @Override
        public void eat() {
                System.out.println("Dog eating");
                chew();
                super.eat();
        }

        public void walk(){
            System.out.println("Dog walk called");
            move(5);
        }
        public void run(){
            System.out.println("Dog run called");
            move(10);
        }
}
