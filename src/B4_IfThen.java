public class B4_IfThen extends World {
   public int red;
   public int blue;
   public int green;

   public void go() {
      plane.loadBackGround("PowerPuff.png");
      plane.showBackGround();
      

      for(int y=1; y<800; y=y+1){
         for(int x=1; x<1000; x=x+1){
            plane.teleport(x,y);

            red   = plane.howMuchRed();
            green = plane.howMuchGreen();
            blue  = plane.howMuchBlue();

            plane.setPixelColor(red, green, blue);
            if(red>50 && red<170 && green >210 && blue>210) {
               plane.setPixelColor(plane.random(1,255), 250, 222);
            }

            if(red>240 && green>240 && x>650 && x<870 && y>280 && y<370){
               plane.setPixelColor(blue/green, 0,blue/3);
            }
         }
      }
   }
   
}
