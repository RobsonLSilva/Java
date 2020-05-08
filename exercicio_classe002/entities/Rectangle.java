package entities;

public class Rectangle {

    public double width;  // largura
    public double height; // altura

    public double Area() { 

         // Area = largura * altura
        return this.width * this.height;

    }

    public double Perimeter() {
        //(2largura + 2altura)
        return 2 *  (this.width + this.height);         
    }

    public double Diagonal() {
        //d2= Largura2 + Altura2
        return Math.sqrt(this.width * this.width + this.height * this.height);
        
    }
    
}