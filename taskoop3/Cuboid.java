/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskoop3;

/**
 *
 * @author Gustav
 */
public class Cuboid extends Rectangle implements CalculateVolume{
    double height;

    public Cuboid(double height, double lenght, double width) {
        super(lenght, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double volume(){
        return this.Area()*this.height;
    }
    
    @Override
    public double surfacearea(){
        return 2*((this.lenght*this.width)+(this.lenght*this.height)+(this.width*this.height));
    }
}