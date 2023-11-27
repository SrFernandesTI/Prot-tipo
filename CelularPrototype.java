package prototipo;

public abstract class CelularPrototype {

    public double ValorCelular;

    public abstract String exibirInfo();

    public abstract CelularPrototype clonar();

    public double getValorCelular() {
        return ValorCelular;
    }

    public void setValorCelular (double ValorCelular) {
        this.ValorCelular = ValorCelular;
    }
}
