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
public class Radio {

    /**
     * @param args the command line arguments
     */
   
        private int volume;
        private int channel;
        private boolean power;
        public static final int Max_Volume=15;

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the channel
     */
    public int getChannel() {
        return channel;
    }

    /**
     * @param channel the channel to set
     */
    public void setChannel(int channel) {
        this.channel = channel;
    }

    /**
     * @return the power
     */
    public boolean isPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(boolean power) {
        this.power = power;
    }

    
}
