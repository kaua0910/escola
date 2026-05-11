
public class InfCelulares {
    public static void main(String[] args){
        Celular celularA = new Celular();

    celularA.nome = "iphone12";
    celularA.SistemaOperacional = "iphone";
    celularA.EspaçodeArmazenamento = Integer.parseInt("256");
    celularA.TamanhoTela = (6.1f);

    System.out.format("Celular %s com tela de %.1f,com %d e So %s, " , celularA.nome , celularA.TamanhoTela, celularA.EspaçodeArmazenamento , celularA.SistemaOperacional );


    Celular celularB = new Celular();

    celularB.nome = "pocox6";
    celularB.SistemaOperacional = "xiome";
    celularB.EspaçodeArmazenamento = Integer.parseInt("128");
    celularB.TamanhoTela = (5.9f);
        System.out.format("Celular %s com tela de %.1f,com %d e So %s, " , celularB.nome , celularB.TamanhoTela, celularB.EspaçodeArmazenamento , celularB.SistemaOperacional );




}
}
