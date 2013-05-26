package pjktTriangle;

//Klasse Triangle erstellen

public class Triangle {
	//add Methode berechnet die Flaeche
	public static double flaeche (double kathetea , double katheteb) {
	    double s = (kathetea * katheteb) / 2;
	    return s;
}
    
    //Methode berechnet die Hypotenuse
    public static double hypotenuse (double kathetea , double katheteb) {
     	double h = Math.sqrt(kathetea * kathetea + katheteb * katheteb);
        return h;
         }
    
  	//Methode berechnet der winkle, parameter alpha ist bekannt, 
    //ein rechtwinkliges Dreieck besitzt einen 90°
     public static double winkel (double alpha) {
 	 	    double w = 180 - 90 - alpha;
 	 	    return w;
 	     }   

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Triangle triangle = new Triangle();

}
}
