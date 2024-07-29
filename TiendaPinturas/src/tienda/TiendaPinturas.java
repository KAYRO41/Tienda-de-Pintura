package tienda;

public class TiendaPinturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Color rojo = new Color("Rojo");
	        TipoPintura esmalte = new TipoPintura("Esmalte");
	        Pintura pintura1 = new Pintura("001", rojo, esmalte);
	        
	        Empleado empleado1 = new Empleado("E001", "Juan");

	        System.out.println(pintura1);
	        System.out.println(empleado1);

	        empleado1.despachar(pintura1);
	    }
	}


