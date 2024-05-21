
package modelo;

import apresentacao.*;
import java.util.ArrayList;
import java.util.List;


public class Visitantes extends AbsPropriedades
{

    
    private static List<Visitantes> listaVisitantes = new ArrayList<>();

    public Visitantes(String nome, String resp1, String resp2, String resp3, String resp4, String resp5)
    {
       this.nome = nome;
       this.resp1 = resp1;
       this.resp2 = resp2;
       this.resp3 = resp3;
       this.resp4 = resp4;
       this.resp5= resp5;
    }

    
    // Método estático para adicionar um visitante à lista
    public static void adicionarVisitante(Visitantes visitante) 
    {
        listaVisitantes.add(visitante);
    }

    // Método estático para obter a lista de visitantes
    public static List<Visitantes> getListaVisitantes() 
    {
        return listaVisitantes;
    }


    // Método sobrescrito para retornar uma representação em string do visitante
    @Override
    public String toString() 
    {
        return "Nome: " + nome + ", resposta 1: " + resp1 + ", resposta 2: " + resp2 +
                 ", resposta 3: " + resp3 + ", resposta 4: " + resp4 + ", resposta 5: " + resp5 + 
                ", total de acerto: "  + Estaticos.ACERTOS;
    }

 
}