/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose_Chaps
 */
import java.io.IOException;
import java.util.Arrays;

import java.io.IOException;
import java.util.Arrays;

public class Principal {
	public static void main(String[] args) throws IOException {


	Sorts controlador = new Sorts();

	 //ALGORITMO UTILIZADO PARA CREAR LA LISTA UTILIZADA SOLO SE CREA LA LISTA 
	controlador.numeros();
	
	
        //Probar los sorts que ordenan
	System.out.print(Arrays.toString(controlador.selectionSort(controlador.elegirnumerosdelarray(controlador.leerarchivoalista("Numerosaleatorios.txt"),1875))));
	System.out.print("\n"+Arrays.toString(controlador.quicksort(controlador.elegirnumerosdelarray(controlador.leerarchivoalista("Numerosaleatorios.txt"),1875),0,(controlador.elegirnumerosdelarray(controlador.leerarchivoalista("Numerosaleatorios.txt"),1875).length)-1)));
	System.out.print("\n"+Arrays.toString(controlador.bubbleSort(controlador.elegirnumerosdelarray(controlador.leerarchivoalista("Numerosaleatorios.txt"),1875))));
	System.out.print("\n"+Arrays.toString(controlador.radixsort(controlador.elegirnumerosdelarray(controlador.leerarchivoalista("Numerosaleatorios.txt"),1875))));
	System.out.print("\n"+Arrays.toString(controlador.mergeSort((controlador.elegirnumerosdelarray(controlador.leerarchivoalista("Numerosaleatorios.txt"),1875)))));
        
        //Probar lista ordenada con sorts 
       // controlador.radixsort(controlador.mergeSort((controlador.elegirnumerosdelarray(controlador.leerarchivoalista("Numerosaleatorios.txt"),1875))));
        //controlador.mergeSort(controlador.mergeSort((controlador.elegirnumerosdelarray(controlador.leerarchivoalista("Numerosaleatorios.txt"),1875))));
        //controlador.bubbleSort(controlador.mergeSort((controlador.elegirnumerosdelarray(controlador.leerarchivoalista("Numerosaleatorios.txt"),1875))));
        //controlador.selectionSort(controlador.mergeSort((controlador.elegirnumerosdelarray(controlador.leerarchivoalista("Numerosaleatorios.txt"),1875))));
       // controlador.quicksort(controlador.mergeSort((controlador.elegirnumerosdelarray(controlador.leerarchivoalista("Numerosaleatorios.txt"),1875))), 0, controlador.mergeSort((controlador.elegirnumerosdelarray(controlador.leerarchivoalista("Numerosaleatorios.txt"),1875))).length-1);
		
	}	

}
