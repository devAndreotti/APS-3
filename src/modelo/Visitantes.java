
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
        return "Nome: " + nome + ", Resposta 1: " + resp1 + ", Resposta 2: " + resp2 +
                 ", Resposta 3: " + resp3 + ", Resposta 4: " + resp4 + ", Resposta 5: " + resp5 + 
                ", Total de acerto: "  + Estaticos.SOMAACERTOS;
    }

 
}