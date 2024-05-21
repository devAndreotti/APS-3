package modelo;

import apresentacao.*;

public class Validacao extends AbsPropriedades
{
    // Construtor que recebe uma resposta e chama o método Executar
    public Validacao(String resposta)
    {
        this.resposta = resposta;
        this.Executar();
    }
    
    // Método para executar a validação da resposta
    public void Executar()
    {
        Estaticos.MENSAGEM = "";
        if(this.resposta.equals("verdadeiro") || this.resposta.equals("falso"))
        {
             this.resp1 = resposta;
        }
        else
        {
            Estaticos.MENSAGEM = "Digite verdadeiro ou falso";
        }
    }
    
}