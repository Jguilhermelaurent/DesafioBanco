package Poo.Model;

import java.util.ArrayList;

public class EntregaCartao {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.Cep = "00000000";
        // dados do endereço

        Cliente cliente = new Cliente();

        // dados dos cliente

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com Sucesso: ");
        }catch (Exception e){
            System.err.println("Houve um erro ao Adicionar: " + e.getMessage());
        }


    }

}
