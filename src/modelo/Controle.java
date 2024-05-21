
package modelo;

import apresentacao.*;

public class Controle extends AbsPropriedades
{
    
    public Controle(String resp1) {
        this.resp1 = resp1;
        Validacao validacao = new Validacao(this.resp1);
    }

    public Controle(String nome, String resp1, String resp2, String resp3, String resp4, String resp5) {
        this.nome = nome;
        this.resp1 = resp1;
        this.resp2 = resp2;
        this.resp3 = resp3;
        this.resp4 = resp4;
        this.resp5 = resp5;
        this.Executar();
    }
    


    public void Executar() {
       
            if (Estaticos.MENSAGEM.equals("")) {
            Visitantes visitante = new Visitantes(nome, resp1, resp2, resp3, resp4, resp5);
            Visitantes.adicionarVisitante(visitante);
        }
    }
}
