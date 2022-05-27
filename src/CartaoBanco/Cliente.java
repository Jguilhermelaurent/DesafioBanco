package Poo.Model;

import java.util.ArrayList;
import java.util.List;


public class Cliente extends Pessoa {

    public String numCartao;
    private List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco){
            if (endereco == null){
                throw  new RuntimeException("O Endereço não pode ser nulo");
            }

            if(endereco.Cep == null) {
                throw new RuntimeException("O Cep não pode ser nulo: ");
            }

            getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos(){
        if (enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return  enderecos;
    }
}
