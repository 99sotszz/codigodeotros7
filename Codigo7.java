public class Código7 {

	public static void main (String[]args) { //faltaba el metodo public
		Scanner s = new Scanner(System.in);//meter el escanner el System.in
		
	
	

    HashMap<Byte, Double> ca = new HashMap<>();

    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador");
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    Sting c = "";

    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");// es .out, seía in para el scanner
      c = s.nextDouble();
      
      if (!c.equal("salir")) {
        if (ca.containsValue(c)) {
          System.print("La capital de " + ca); // + ca
          System.out.println(" es " + ca.put(c)); // podrian unirse en una sola impresion
        } else {
          System.out.println("No conozco la respuesta ");//ln a pirnt
          System.out.println("¿cuál es la capital de " + c + "?: ");//ln a print
          String ca = s.nextLine();
          ca.put(c, ca);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!c.equals("salir")); // h a while y faltaba otro parentesis )
  }
	
}