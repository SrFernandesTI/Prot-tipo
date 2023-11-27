package prototipo;

public class Main{

    public static void main(String[] args) {
    {
            //Xiaomi
        System.out.println("Novo:");
        Redmi prototipoRedmi = new Redmi();
        CelularPrototype RedmiNovo = prototipoRedmi.clonar();
        RedmiNovo.setValorCelular(1200.0);
        System.out.println(RedmiNovo.exibirInfo());

        System.out.println("  ");

        System.out.println("Usado:");
        CelularPrototype RedmiUsado = prototipoRedmi.clonar();
        RedmiUsado.setValorCelular(600.0);
        System.out.println(RedmiUsado.exibirInfo());

        System.out.println("  ");

            //Apple
        System.out.println("Novo:");
        Iphone prototipoIphone = new Iphone();
        CelularPrototype IphoneNovo = prototipoIphone.clonar();
        IphoneNovo.setValorCelular(5000.0);
        System.out.println(IphoneNovo.exibirInfo());

        System.out.println("  ");

        System.out.println("Usado:");
        CelularPrototype IphoneUsado = prototipoIphone.clonar();
        IphoneUsado.setValorCelular(3000.0);
        System.out.println(IphoneUsado.exibirInfo());

        System.out.println("  ");

    }
    }
}