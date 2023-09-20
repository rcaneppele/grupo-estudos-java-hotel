package br.com.alura.hotel.reserva;

import br.com.alura.hotel.acomodacao.TipoAcomodacao;
import br.com.alura.hotel.hospede.Hospede;

public record DadosSolicitacaoReserva(Periodo periodo, TipoAcomodacao tipo, Hospede hospede) {}
