package modelo;

import apresentacao.*;

public class Validacao extends AbsPropriedades
{

    public Validacao(String resposta)
    {
        this.resposta = resposta;
        this.Executar();
    }
    
    public void Executar()
    {
        Estaticos.MENSAGEM = "";
        if(this.resposta.equals("verdadeiro") || this.resposta.equals("falso"))
        {
             this.resp1 = resposta;
        }else
        {
            Estaticos.MENSAGEM = "Digite verdadeiro ou falso";
        }
    }
    
}