package br.com.alura.hotel.acomodacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TipoAcomodacao {

    private String nome;
    private BigDecimal precoPorNoite;
    private Byte capacidade;
    private List<Comodidade> comodidades = new ArrayList<>();

    private Byte quantidade;

    public TipoAcomodacao(String nome, BigDecimal precoPorNoite, Byte capacidade, List<Comodidade> comodidades, Byte quantidade) {
        this.nome = nome;
        this.precoPorNoite = precoPorNoite;
        this.capacidade = capacidade;
        this.comodidades = comodidades;
        this.quantidade = quantidade;
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

    public Byte getQuantidade() {
        return quantidade;
    }
}
