
package dominio;

public abstract class veiculoIdentificador {
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public veiculoIdentificador() {
    }

    public veiculoIdentificador(int codigo) {
        this.codigo = codigo;
    } 
}