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
class Rectangle implements CalculateSurface{
    public double lenght;
    public double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public double Area(){
        return this.lenght*this.width;
    }
    
    @Override
    public double Circumference(){
        return 2*(this.lenght+this.width);
    }
}
