package grafo;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    
    private int[][] matrizAdyacencia;
    private int numVertices;

    
    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        matrizAdyacencia = new int[numVertices][numVertices];
    }

    
    public void agregarArista(int origen, int destino) {
        matrizAdyacencia[origen][destino] = 1;
        
    }

    
    public void mostrarMatrizAdyacencia() {
        System.out.println("Matriz de Adyacencia:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {

        Grafo grafo = new Grafo(5);
        
        // Agregar aristas
        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 4);
        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(1, 4);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(3, 4);

        grafo.mostrarMatrizAdyacencia();

    }
}
