package pjktTriangle;

import java.lang.Math;
import java.util.*;


//Klasse Triangle erstellen
public class Triangle {
	
	//add Methode berechnet die Flaeche
	public double flaeche (double kathetea , double katheteb) {
	    double s = (kathetea * katheteb) / 2;
	    return s;
    }
    
    //Methode berechnet die Hypotenuse
    public double hypotenuse (double kathetea , double katheteb) {
     	double h = Math.sqrt(kathetea * kathetea + katheteb * katheteb);
        return h;
    }
    
  	//Methode berechnet der winkle, parameter alpha ist bekannt, 
    //ein rechtwinkliges Dreieck besitzt einen 90°
    public double winkel (double alpha) {
 	    double w = 180 - 90 - alpha;
 	 	return w;
    }   

	public static void main(String[] args) {
		  Triangle t = new Triangle();
		  double alpha = 50.10;
		  double kathetea = 35.45;
		  double katheteb = 35.00;
		  double f1 = t.flaeche (kathetea , katheteb);
		  double h1 = t.hypotenuse (kathetea , katheteb);
		  double w1 = t.winkel (alpha);
		  System.out.println(t   + "(" + f1 + "," + h1 + "," + w1 + ")");
		  System.out.println(t.flaeche(3 , 4));
		  System.out.println(t.hypotenuse(3.0 , 4.0));
    }
}
