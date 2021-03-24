/**
 * Nesto pisem
 */

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;


    /**
     *
     * @param name ime
     * @param size velicina
     * @param weight tezina
     * @param gills skrge
     * @param eyes oci
     * @param fins peraja
     */
    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){
    }
    private void moveMuscles(){

    }
    private void moveBackFin(){

        /**
         * Opet nesto
         */
    }
    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }
}

