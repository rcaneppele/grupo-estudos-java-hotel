package br.com.alura.hotel.reserva;

import br.com.alura.hotel.acomodacao.TipoAcomodacao;
import br.com.alura.hotel.hospede.Hospede;

import java.time.LocalDate;

public class Reserva {

    private Hospede hospede;
    private TipoAcomodacao tipoAcomodacao;
    private Periodo periodo;

    private StatusReserva status;

    public Reserva(Hospede hospede, TipoAcomodacao tipoAcomodacao, Periodo periodo) {
        this.hospede = hospede;
        this.tipoAcomodacao = tipoAcomodacao;
        this.periodo = periodo;
        this.status = StatusReserva.EM_ANALISE;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "hospede=" + hospede +
                ", tipoAcomodacao=" + tipoAcomodacao +
                ", periodo=" + periodo +
                '}';
    }

    public Hospede getHospede() {
        return hospede;
    }

    public TipoAcomodacao getTipoAcomodacao() {
        return tipoAcomodacao;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

}
