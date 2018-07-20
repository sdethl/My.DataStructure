package completeJavaMaster;

import org.junit.Test;

public class TheatreCases {

    @Test
    public void testTheatre(){
        Theatre theatre = new Theatre("austin", 8, 12);
        //theatre.getSeats();
        if(theatre.reserveSeat("A03")){
            System.out.println("please pay");
        } else{
            System.out.println("Sorry, the seat is taken.");
        }
    }
}
