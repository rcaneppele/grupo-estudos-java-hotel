package br.com.alura.hotel.acomodacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TipoAcomodacao {

    private String nome;
    private BigDecimal precoPorNoite;
    private Byte capacidade;
    private List<Comodidade> comodidades = new ArrayList<>();

    public TipoAcomodacao(String nome, BigDecimal precoPorNoite, Byte capacidade, List<Comodidade> comodidades) {
        this.nome = nome;
        this.precoPorNoite = precoPorNoite;
        this.capacidade = capacidade;
        this.comodidades = comodidades;
    }

    @Override
    public String toString() {
        return "Acomodacao{" +
                "nome=" + nome +
                ", precoPorNoite=" + precoPorNoite +
                ", capacidade=" + capacidade +
                ", comodidades=" + comodidades +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPrecoPorNoite() {
        return precoPorNoite;
    }

    public Byte getCapacidade() {
        return capacidade;
    }

    public List<Comodidade> getComodidades() {
        return comodidades;
    }

}
