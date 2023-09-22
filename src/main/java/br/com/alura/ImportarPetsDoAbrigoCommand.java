package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.servico.PetServico;

import java.io.IOException;

public class ImportarPetsDoAbrigoCommand implements Command{
    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetServico petServico = new PetServico(client);

            petServico.importarPetsDoAbrigo();
        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
