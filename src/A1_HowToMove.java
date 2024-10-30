public class A1_HowToMove extends World {


    public void go() {


        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 0;
        plane.isTrail = true;
        plane.teleport(100, 700);
        plane.turn(90);

        for (int repeat = 700; repeat <= 1450; repeat = repeat + 1) {
            //Loop Below creates Sea
            for (int x = 100; x < 750; x = x + 1) {
                plane.teleport(x, repeat);
                if(x%2==2){
                    plane.setPixelColor(0,0,0);
                }else {
                    plane.setPixelColor(45, 25, x / 3);
                }


            }


        }

        for (int x = 100; x <= 750; x = x + 1) {
            //Loop Creates Sea
            for (int again = 0; again < 750; again = again + 1) {
                plane.teleport(x, again/3);
                if(x%5==0){
                    plane.setPixelColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
                }
                else {
                    plane.setPixelColor(25, 76, x/3);
                }

            }
        }
        //Creates the 'land'
        for(int whyanothervariable=0;whyanothervariable<=850;whyanothervariable=whyanothervariable+1){
           for(int ihatethismanyvariables=450;ihatethismanyvariables<1200;ihatethismanyvariables=ihatethismanyvariables+1){
                plane.teleport(whyanothervariable,ihatethismanyvariables/2);
                plane.setPixelColor(98,65,whyanothervariable/6);
            }


            }
        }

}






