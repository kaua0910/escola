package co.Correio.cadastros;

public class Adress {
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String complemento;
    private String bairro;

public String SetCidade(String cidade) {
    this.cidade = cidade;
    return cidade;
}
public String SetEstado(String estado) {
    this.estado = estado;
    return estado;
}
public String SetPais(String pais) {
    this.pais = pais;
    return pais;
}

public String Local() {
    return "Local: " + "\n Cidade: " + cidade + "\n Estado: " + estado + "\n Pais: " + pais;
}












}