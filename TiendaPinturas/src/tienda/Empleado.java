package tienda;

public class Empleado {
	 private String codigo;
	    private String nombre;

	    public Empleado(String codigo, String nombre) {
	        this.codigo = codigo;
	        this.nombre = nombre;
	    }

	    public String getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(String codigo) {
	        this.codigo = codigo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void despachar(Pintura pintura) {
	        System.out.println(nombre + " despachando pintura: " + pintura);
	    }

	    @Override
	    public String toString() {
	        return "Empleado{" +
	                "codigo='" + codigo + '\'' +
	                ", nombre='" + nombre + '\'' +
	                '}';
	    }
	}