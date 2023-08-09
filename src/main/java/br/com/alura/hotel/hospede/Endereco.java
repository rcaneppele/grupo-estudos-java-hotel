package br.com.alura.hotel.hospede;

public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String cidade;
    private UF uf;

    public Endereco(String logradouro, String bairro, String cep, String numero, String cidade, UF uf) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf=" + uf +
                '}';
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public UF getUf() {
        return uf;
    }
}
