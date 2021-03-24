class main {
    public static void main(String[] args){

        time timeObject = new time();
        time timeObject2 = new time(5);
        time timeObject3 = new time(5,13);
        time timeObject4 = new time(5,13,43);

        System.out.printf("%s\n", timeObject.toMilitary());
        System.out.printf("%s\n", timeObject2.toMilitary());
        System.out.printf("%s\n", timeObject3.toMilitary());
        System.out.printf("%s\n", timeObject4.toMilitary());

        date dateObject = new date(10,6,2010);

        System.out.printf("%s\n", dateObject.toMilitary());
    }
}
