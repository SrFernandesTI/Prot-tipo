package prototipo;

public class Redmi extends CelularPrototype{
    protected Redmi(Redmi redmiPrototype) {

        this.ValorCelular = redmiPrototype.getValorCelular();
    }
    public Redmi() {
        ValorCelular = 0.0;

    }
    @Override
    public String exibirInfo() {
        return "Modelo: Redmi 12 \nMarca: Xiaomi\n" + "Valor: R$ "
                + getValorCelular();
    }

    @Override
    public CelularPrototype clonar() {

        return new Redmi(this);
    }

}
