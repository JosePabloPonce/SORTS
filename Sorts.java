/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose_Chaps
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class Sorts {
	
	
	
	public void agregarnumeros(int[] lista){
		
		for (int i =0; i< 3000; i++) {
			Random aleatorio = new Random();
			int numerogenerado = aleatorio.nextInt(50000);
			lista[i]= numerogenerado;
		}
		


	}
	//Funcion que se utilizo para crear la lista con los numeros, evidencia de la lista creada aleatoriamente
	public  void numeros() {
            	int[] lista= new int[3001];

		File crear = new File ("Numerosaleatorios.txt");
                
		FileWriter escribir = null;
		
		try {
			escribir = new FileWriter (crear);
			BufferedWriter escribir1 = new BufferedWriter (escribir);
			int linea;
			Random aleatorios = new Random();
			for (int i =0; i<3000; i++) {
				linea = aleatorios.nextInt(1000);
				lista[i]= aleatorios.nextInt(1000);
				escribir1.write(linea + "\n");
		}
		
		escribir.close();
	} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
	}
	}
        
        //funcion para guardar en archivo de texto array
        

        
	
	//Funcion para leer archivo de texto y pasarlo a array
	 public int[] leerarchivoalista(String nombredearchivodetexto) throws IOException 
	    {
	        FileReader leer = new FileReader(nombredearchivodetexto);
	         
	        BufferedReader bufferedReader = new BufferedReader(leer);
			int[] numeros= new int[3001];
	        String leerlinea = null;
	        int i=0;
	        
	        while ((leerlinea = bufferedReader.readLine()) != null) {
		    int convertiraentero =Integer.parseInt(leerlinea);

			numeros[i]= convertiraentero;
	        i++;
	        }
	         
	        bufferedReader.close();
	         
	        return numeros;
	    }   
         
	 //funcion para elegir la cantidad de numeros a ordenar
	 public int[] elegirnumerosdelarray(int[] lista, int numerosaevaluar) {
			
		 int[] numeroselegidos= new int[numerosaevaluar];

		 for(int i =0; i<numerosaevaluar; i++) {
			 numeroselegidos[i]= lista[i];
			 
		 }
		 return numeroselegidos;
		 
		 
		 
		 
		 
	 }
	 
	 



	//Selection Sort https://stackabuse.com/sorting-algorithms-in-java/#quicksort Algoritmo de referencia
	public  int[] selectionSort(int[] lista) {
	    for (int i = 0; i < lista.length; i++) {
	        int inicial = lista[i];
	        int minId = i;
	        for (int j = i+1; j < lista.length; j++) {
	            if (lista[j] < inicial) {
	                inicial = lista[j];
	                minId = j;
	            }
	        }
	        // swapping
	        int cambiar = lista[i];
	        lista[i] = inicial;
	        lista[minId] = cambiar;
	    }
	    return lista;
	}
	
	//MergeSort https://stackoverflow.com/questions/50394397/java-implementing-merge-sort
	
	 public  int[] mergeSort(int[] seq) {

	        if (seq.length < 2) {
	            return seq;
	        }
	        int s = seq.length / 2; //You always use that value. no need for 2 methods
	        int[] a = new int[s];
	        int[] b = new int[seq.length - s];
	        for (int i=0;i<a.length;i++) {
	            a[i] = seq[i];
	        }
	        for (int i=0;i<b.length;i++) {
	            b[i] = seq[s + i];
	        }
	        a=mergeSort(a);
	        b=mergeSort(b);

	        return merge(a, b);
	    }

	    public  int[] merge(int[] ls, int[] rs) {
	        // Store the result in this array
	        int[] result = new int[ls.length + rs.length];

	        int i, l, r;
	        i = l = r = 0;
	        while (i < result.length) {
	            if (l < ls.length && r < rs.length) {
	                if (ls[l] < rs[r]) {
	                    result[i] = ls[l];
	                    ++i;
	                    ++l;
	                } else {
	                    result[i] = rs[r];
	                    ++i;
	                    ++r;
	                }
	            } else if (l >= ls.length) {
	                while (r < rs.length) {
	                    result[i] = rs[r];
	                    ++i;
	                    ++r;
	                }
	            } else if (r >= rs.length) {
	                while (l < ls.length) {
	                    result[i] = ls[l];
	                    ++i;
	                    ++l;
	                }
	            }
	        }
	        return result;
	    }
	 
	 
	 //QuickSort https://stackabuse.com/sorting-algorithms-in-java/#quicksort Algoritmo de referencia
	 
	 public  int[] quicksort(int A[], int izq, int der) {

		    int piv=A[izq];      // tomamos el primer elemento como pivote
		    int i=izq;       // i realiza la búsqueda de izquierda a derecha
		    int j=der;       // j realiza la búsqueda de derecha a izquierda
		    int aux;
		   
		    while(i<j){               // mientras no se crucen...
		       while(A[i]<=piv && i<j) i++;  // busca un elemento mayor que pivote,
		       while(A[j]>piv) j--;         // busca un elemento menor que pivote,
		       if (i<j) {                     // si los encuentra y no se han cruzado...                     
		           aux= A[i];                 // los intercambia.
		           A[i]=A[j];
		           A[j]=aux;
		       }
		     }
		     A[izq]=A[j];      // colocamos el pivote en su lugar de la forma [menores][pivote][mayores]
		     A[j]=piv;       
		     if(izq<j-1)
		        quicksort(A,izq,j-1);   // ordenamos mitad izquierda
		     if(j+1 <der)
		        quicksort(A,j+1,der);   // ordenamos mitad derecha
		  
	 return A;
			 }
		
		
		
		
		//Radix Sort https://stackabuse.com/sorting-algorithms-in-java/#quicksort Algoritmo de referencia
	 public  int[] radixsort(int[] v) {
	        int repeticionmaxima    = 1;     // cantidad de repeticiones
	        int bytesdesplazados = 4;     // numero de bytes a desplazar
	        int arreglocolas = (int) Math.pow(2,bytesdesplazados) ;
	        // Creación e inicialización del arreglo de colas
	        Queue<Integer>[] cola = new LinkedList[arreglocolas];
	        for(int i=0; i<arreglocolas; i++) cola[i]=new LinkedList<Integer>();
	 
	        int     div     = 0;        // posición a comparar
	        for(int i=0; i<repeticionmaxima; i++) {
	            // parte 1: recorrer el vector  para guardar cada elemento
	            // en la cola correspondiente
	            for(int numero: v) {
	                // buscar el mayor número del vector
	                if(i==0) if(numero>repeticionmaxima) repeticionmaxima=numero;
	                // calcular en qué cola debe ir cada número
	                int numCola = (numero>>div) & 0xf;
	                cola[numCola].add(numero);
	            }
	            div = div+bytesdesplazados;
	 
	            // parte 2: recorrer las colas en orden para poner cada
	            // elemento en el vector;
	            int j=0;
	            for(Queue<Integer> c: cola) {
	                while(!c.isEmpty()) v[j++]=c.remove();
	            }
	            // la primera vez se actualiza el número de veces que se
	            // debe ejecutar el proceso
	            if(i==0) { repeticionmaxima = (int) (Math.log(repeticionmaxima)/Math.log(arreglocolas)) + 1; }
	        }
	         return v;
	    }
		
		
		//bubble sort https://stackabuse.com/sorting-algorithms-in-java/#quicksort Algoritmo de referencia
		public  int[]   bubbleSort(int[] a) {
		    boolean sorted = false;
		    int temp;
		    while(!sorted) {
		        sorted = true;
		        for (int i = 0; i < a.length - 1; i++) {
		            if (a[i] > a[i+1]) {
		                temp = a[i];
		                a[i] = a[i+1];
		                a[i+1] = temp;
		                sorted = false;
		            }
		        }
		    }
			return a;
		}
		}
	
	
	
	




