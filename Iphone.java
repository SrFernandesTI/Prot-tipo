package prototipo;

public class Iphone extends CelularPrototype{

    protected Iphone (Iphone iphone) {

        this.ValorCelular = iphone.getValorCelular();
    }
    public Iphone() {
        ValorCelular = 0.0;

    }
    @Override
    public String exibirInfo() {
        return "Modelo: Iphone 13 \nMarca: Apple\n" + "Valor: R$ "
                + getValorCelular();
    }

    @Override
    public Iphone clonar() {
        return new Iphone(this);
    }
}
