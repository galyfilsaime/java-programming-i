/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author galyfilsaime
 */
public class Timer {
    private ClockHand hundredsOfSeconds;
    private ClockHand seconds;
    
    public Timer () {
        this.hundredsOfSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        this.hundredsOfSeconds.advance();
        
        if (this.hundredsOfSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return this.seconds + ":" + this.hundredsOfSeconds;
    }
}
