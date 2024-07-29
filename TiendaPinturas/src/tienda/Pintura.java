package tienda;

public class Pintura {
    private String codigo;
    private Color color;
    private TipoPintura tipo;

    public Pintura(String codigo, Color color, TipoPintura tipo) {
        this.codigo = codigo;
        this.color = color;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoPintura getTipo() {
        return tipo;
    }

    public void setTipo(TipoPintura tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pintura{" +
                "codigo='" + codigo + '\'' +
                ", color=" + color +
                ", tipo=" + tipo +
                '}';
    }
}
