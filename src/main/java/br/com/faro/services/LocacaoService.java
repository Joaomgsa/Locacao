package br.com.faro.services;

import br.com.faro.entities.Filme;
import br.com.faro.entities.Locacao;
import br.com.faro.entities.Usuario;
import br.com.faro.utils.DataUtils;
import org.junit.jupiter.api.Test;

import java.util.Date;


import static br.com.faro.utils.DataUtils.adicionarDias;


public class LocacaoService {

    public Locacao alugarFilme(Usuario usuario, Filme filme){
        Locacao locacao = new Locacao();
        locacao.setFilme(filme);
        locacao.setUsuario(usuario);
        locacao.setDataLocacao(new Date());
        locacao.setValor(filme.getPrecoLocacao());

        //Calcular data de entrega - Se dia de semana +1 dia se fim de semana +2 dias

        Date dataEntrega = new Date();
        dataEntrega = adicionarDias(dataEntrega,1);

        return locacao;

    }

    @Test
    public void Teste(){
        //Cenario
        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("joaomgsa");
        Filme filme = new Filme("A gangue dos Dobermans ", 2 ,5.0);

        //Ação

        Locacao locacao = service.alugarFilme(usuario,filme);

        //Verificação
        System.out.println(locacao.getValor() == 5.0);
        System.out.println(DataUtils.isMesmaData(locacao.getDataLocacao(),new Date()));
        System.out.println(DataUtils.isMesmaData(locacao.getDataRetorno(),DataUtils.obterDataComDiferencaDias(2)));
    }

}
