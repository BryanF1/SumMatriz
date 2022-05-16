package proyecto.src.clase1;

import javax.swing.*;

public class SumMatriz {
    private int Matriz1[][];

    private int matriz2[][];
     
    private int suma[][];

    private int columna;

    private int fila;

    private int valores;


    public SumMatriz()
    {
        
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila para la matriz 1"));

        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna para la matriz 1"));

        this.Matriz1 = new int[fila][columna];

        
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila para la matriz 2"));

        columna  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna para la matriz 2"));

        this.matriz2 = new int[fila][columna];

        suma = new int[fila][columna];


    }

    public void incorporarMatriz1()
    {
        for (int fila=0; fila < this.Matriz1.length; fila++)
        {
            for (int columna=0; columna < this.Matriz1[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("valores para la matriz 1"));

                this.Matriz1[fila][columna] = this.valores;
            }
        }
    }

    public void presentarMatriz1()
    {
        System.out.println("matriz 1");
        for(int fila=0; fila < this.Matriz1.length; fila++)
        {
            for(int columna=0; columna < this.Matriz1[fila].length; columna++)
            {
                System.out.printf("%d ", this.Matriz1[fila][columna]);
            }
            
            System.out.println();
        }
    }

    public void incorporarMatriz2()
    {
        for (int fila=0; fila < this.matriz2.length; fila++)
        {
            for (int columna=0; columna < this.matriz2[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("valores para la matriz 2"));

                this.matriz2[fila][columna] = this.valores;
            }
        }
    }

    public void presentarMatriz2()
    {
        System.out.println("matriz 2");
        for(int fila=0; fila < this.matriz2.length; fila++)
        {
            for(int columna=0; columna < this.matriz2[fila].length; columna++)
            {
                System.out.printf("%d ", this.matriz2[fila][columna]);
            }

            System.out.println();
        }
    }

    public void calcularSuma()
    {
        System.out.println("resultado");
    for (int fila=0; fila < this.Matriz1.length; fila++)
        {
        for (int columna=0; columna < this.Matriz1[fila].length; columna++)
        {
          suma[fila][columna] = (Matriz1[fila][columna]+ matriz2[fila][columna]); 
          System.out.printf("%d ", suma[fila][columna]);
        }
          System.out.println();
        }
    }


    public static void main(String args[])
    {
        SumMatriz matriz = new SumMatriz();

        matriz.incorporarMatriz1();

        matriz.presentarMatriz1();

        matriz.incorporarMatriz2();

        matriz.presentarMatriz2();

        matriz.calcularSuma();

    }
}

