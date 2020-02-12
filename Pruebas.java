import static org.junit.Assert.*;

import org.junit.Test;

public class Pruebas {
	int[] lista= {2, 4,4,2,1,2, 5, 6, 7, 8};

	Sorts funciones = new Sorts ();

	@Test
	public void test() {
		funciones.mergeSort(lista);
		
	}
	@Test
	public void test2() {
		funciones.bubbleSort(lista);
		
	}
	
	@Test
	public void test3() {
		funciones.radixsort(lista);
		
	}
	
	@Test
	public void tes4() {
		funciones.selectionSort(lista);
		
	}
	@Test
	public void test5() {
		funciones.quicksort(lista, 0, lista.length-1);
		
	}
}
