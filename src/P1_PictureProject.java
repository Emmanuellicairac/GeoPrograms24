public class P1_PictureProject extends World{

    public void go() {
        int red = plane.howMuchRed();
        int green = plane.howMuchGreen();
        int blue = plane.howMuchBlue();
        plane.pausetime = 0;
        plane.isTrail = true;
        int y=0;
        for(int x=0; x<=800; x=x+20){

            if (y%2==0){
                plane.teleport(x,y);
                plane.square(x);
            }
            plane.teleport(x,y);
            plane.square(x);
            y=y++;

        }




        for(int x=plane.random(250,750); x>plane.random(1,250); x=x- plane.random(1,5)) {
            for(y=797;y>0;y--){
                plane.teleport(x,y);
                if(y%2==0){
                    plane.triangle(5);
                    y=y++;
                } else {
                    plane.square(plane.random(5,50));
                    y=y++;
                }


            }



        }




















    }

    public void square(int size) {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);

    }
    }


