package tienda;

public class TipoPintura {
    private String tipo;

    public TipoPintura(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo de Pintura: " + tipo;
    }
}
