/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author galyfilsaime
 */
public class Cube {
    private int side;
    
    public Cube(int edgeLength) {
        this.side = edgeLength;
    }
    
    public int volume() {
        return this.side * this.side * this.side;
    }
    
    public String toString() {
        return "The length of the edge is " + this.side + " and the volume " + this.volume();
    }
}
