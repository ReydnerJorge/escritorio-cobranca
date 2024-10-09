public class Main {
    public static void main(String[] args) {
        /*
        Pessoa vai ser cobrada
        Pessoa que está cobrando
        valor da dívida
        acordo a ser feito com as partes
        forma de pagamento
        valor a ser cobrado = valor original + taxas
         */

        PessoaJuridica lojaDoBairro = new PessoaJuridica();
        lojaDoBairro.setNome("Loja do Bairro");
        lojaDoBairro.setCnpj("94.679.343/0001-78");
        PessoaFisica reydner = new PessoaFisica();
        reydner.setNome("Reydner");
        reydner.setCpf("481.128.090-38");
        reydner.setDataNascimento("19/02/2001");

        Divida divida = new Divida(lojaDoBairro, reydner, 2500.00);
        AcordoDivida acordoDivida = new AcordoDivida(divida, FormaDePagamento.CREDITO);
        System.out.println("----Dados Devedor:");
        System.out.println("Nome: "+ acordoDivida.getDivida().getDevedora().getNome());
        System.out.println("Data nascimento: "+ acordoDivida.getDivida().getDevedora().getDataFormatada());
        System.out.println("Documento: "+ acordoDivida.getDivida().getDevedora().getDocument());
        System.out.println("----Dados Cobrador:");
        System.out.println("Nome: "+ acordoDivida.getDivida().getCobradora().getNome());
        System.out.println("Documento: "+ acordoDivida.getDivida().getCobradora().getDocument());

        System.out.println("Valor da dívida: "+ acordoDivida.getDivida().getValorDivida());
        System.out.println("Forma de pagamento: "+ acordoDivida.getFormaDePagamento().name());
        System.out.println("Valor total: "+ acordoDivida.getValorTotal());
        // System.out.println("Nome: "+ divida.getCobradora().getDocument());
    }
}