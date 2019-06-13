/*
 * Sandeep Rai
 * 991450576
 * 
 */
package radio;

/**
 *
 * @author Sandeep
 */
public class RadioSimulator {
    public static void main(String[] args){
        Radio r=new Radio();
        r.setPower(true);
        System.out.println("Radio is On");
        r.setChannel(7);
        System.out.println("radio is playing channel "+r.getChannel());
        r.setVolume(Radio.Max_Volume);
        System.out.println("Volume is "+r.getVolume());
        r.setPower(false);
        System.out.println("Radio is off");
    }
}
