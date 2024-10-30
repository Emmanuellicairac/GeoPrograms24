public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 2;

        for (int x = 1; x <= 10; x = x + 1) {
            System.out.println("x: " + x);
            plane.square(100);
        }
        System.out.println("****");
        for (int y = 2; y <= 20; y = y + 2) {
            System.out.println("x:" + y);

        }
        System.out.println("****");
        for (int z = 1; z<=19; z=z + 2){
            System.out.println("x:" + z);
        }
        System.out.println("****");
        for(int a=10;a>=1;a=a-1) {
            System.out.println("x:"+a);
        }
        System.out.println("****");
        for(int b=5;b<=45;b=b+5) {
            System.out.println("x:"+b);

        }
    }
}
