package Poo.Model;

public class Pessoa {

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum  TipoPessoa {FISICA , JURIDICA}

    public Integer Codigo;
    public String Nome;
    private String documento;
    public TipoPessoa tipo;

    public String getDocumento(){
        return  documento;
    }

    public void setDocumento(String documento){
        if (documento == null || documento.isEmpty()){
            throw  new RuntimeException("Documento não pode ser nulo ou Vazio:");
        }

        if (documento.length() == TAMANHO_CPF){
           setDocumento(documento , tipo  = TipoPessoa.FISICA);
        } else if (documento.length() == TAMANHO_CNPJ){
           setDocumento(documento , tipo  = TipoPessoa.JURIDICA );
        }else {
            throw new RuntimeException("Documento Invalido para pessoa fisica ou juridica");
        }

    }
    private void setDocumento(String documento , TipoPessoa tipo){
        this.documento = documento;
        this.tipo = tipo;
    }

    public TipoPessoa getTipo(){
        return  tipo;
    }


}
