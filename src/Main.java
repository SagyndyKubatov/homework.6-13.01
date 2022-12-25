public class Main {
    public static void main(String[] args) {

        Boss boss= new Boss(700,50, new Weapon("Excalibur","Sword"));

        Skeleton skeleton1 = new Skeleton(250,40,
                new Weapon("Bow","bow"),20);
        Skeleton skeleton2 = new Skeleton(250,40,
                new Weapon("Bow","bow"),20);


        System.out.println();
        System.out.println("Boss"+boss.printInfo());
        System.out.println("Skeletons one"+skeleton1.printInfo());
        System.out.println("Skeleton two"+skeleton2.printInfo());


    }

}