package br.com.alura;

import br.com.alura.Command;
import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.servico.AbrigoServico;

import java.io.IOException;

public class CadastrarAbrigoCommand implements Command {
    @Override
    public void execute() {
        try{
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            AbrigoServico abrigoServico = new AbrigoServico(client);

            abrigoServico.cadastrarAbrigo();

        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
