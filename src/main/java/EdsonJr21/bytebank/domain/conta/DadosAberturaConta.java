package EdsonJr21.bytebank.domain.conta;

import EdsonJr21.bytebank.domain.cliente.DadosCadastroCliente;

public record DadosAberturaConta(Integer numero, DadosCadastroCliente dadosCliente) {
}
