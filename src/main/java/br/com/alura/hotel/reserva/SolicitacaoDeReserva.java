package br.com.alura.hotel.reserva;

public class SolicitacaoDeReserva {

    private ReservaRepository repository;

    public Reserva solicitar(DadosSolicitacaoReserva dados) {
        // Vini solicitou uma reserva para a acomodação do tipo CHALE no periodo 01/11/2023 a 10/11/2023

        Byte quantidadeReservasEfetuadas = repository.?;
        Byte quantidadeDisponivel = repository.?;

        if (quantidadeDisponivel > quantidadeReservasEfetuadas) {
            //confirmar reserva do vini
        } else {
            //cancelar reserva do vini
        }
    }

}
