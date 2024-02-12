package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	//Creamos las variables 
    	int[] numbers = new int[arregloEnteros.length];
    	int len = numbers.length;
    	int i = 0;
    	
    	//Hacemos el loop y hacemos la copia de los numero
    	while (len >= i)
    	{
    		Integer nextNumber = arregloEnteros[i];
    		numbers[i] = nextNumber;
    		i++;
    	}
    	//retornamos la nueva lista
        return numbers;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	//Creamos una variable donde guardar la cadena
    	String[] nuevaLista = new String[arregloCadenas.length];
    	//Creamos el while loop para que tenga un recorrido del largo de la lista
    	int i =0;
    	while (i<arregloCadenas.length)
    	{
    		//Guardamos el valor de la lista vieja en la nueva 
    		nuevaLista[i] = arregloCadenas[i];
    		i++;
    	}
    	//Retornamos la lista nueva
        return nuevaLista;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int[] newArray = new int[arregloEnteros.length +1];
    	int i = 0;
    	while (i<=arregloEnteros.length)
    	{
    		if (i < arregloEnteros.length)
    		{
    			newArray[i] = arregloEnteros[i];
    		} else {
    			newArray[i] = entero;
    		}
    		i++;
    	}
    	arregloEnteros = newArray;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String[] newChain = new String[arregloCadenas.length];
    	int i = 0;
    	while (i<= arregloCadenas.length)
    	{
    		if (i< arregloCadenas.length) 
    		{
    			newChain[i] = arregloCadenas[i];
    		} else
    		{
    			newChain[i] = cadena;
    		}
    		i++;
    	}
    	arregloCadenas = newChain;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int cantidad = 0;
    	int i = 0;
    	while ( i < arregloEnteros.length)
    	{
    		if (arregloEnteros[i] != valor)
    		{
    			cantidad++;
    		}
    		i++;
    	}
    	
    	int[]delArray = new int[cantidad];
    	
    	int x = 0;
    	int j = 0;
    	while ( x < arregloEnteros.length)
    	{
    		if (arregloEnteros[x] != valor)
    		{
    			delArray[j++] = arregloEnteros[x];
    		}
    		x++;
    	}
    	arregloEnteros = delArray;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int cantidad = 0;
    	int i = 0;
    	
    	while ( i< arregloCadenas.length)
    	{
    		if (arregloCadenas[i] != cadena)
    		{
    			cantidad++;
    		}
    		i++;
    	}
    	String[] delChain = new String[cantidad];
    	
    	int x = 0;
    	int j = 0;
    	while ( x < arregloCadenas.length)
    	{
    		if (arregloCadenas[x] != cadena);
    		{
    			delChain[j++] = arregloCadenas[x];
    		}
    		x++;
    	}
    	arregloCadenas = delChain;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int[] insArray = new int[arregloEnteros.length +1];
    	int x = 0;
    	while (x<arregloEnteros.length)
    	{
    		if (x != posicion)
    		{
    			insArray[x] = arregloEnteros[x];
    		}
    		else
    		{
    			insArray[posicion] = entero;
    			x++;
    		}
    		x++;
    	}
    	arregloEnteros = insArray;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int[] posArray = new int[arregloEnteros.length-1];
    	int i = 0;
    	while (i < arregloEnteros.length);
    	{
    		if (i!= posicion)
    		{
    			posArray[i] = arregloEnteros[i];
    		}
    		i++;
    	}
    	arregloEnteros = posArray;
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int[] resArray = new int[valores.length];
    	int i = 0;
    	while ( i < valores.length);
    	{
    		int number = (int)(valores[i]-(valores[i]%1));
    		resArray[i] = number;
    		i++;
    	}
    	arregloEnteros = resArray; 
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	int i = 0; 
    	String[] resChain = new String[objetos.length];
    	
    	while (i< objetos.length) {
    		resChain[i] = objetos[i] + "";
    		i++;
    	}
    	arregloCadenas = resChain;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int[] posiArray = new int[arregloEnteros.length];
    	int i = 0;
    	while (i< arregloEnteros.length) {
    		if (arregloEnteros[i]<0) {
    			posiArray[i] = -(arregloEnteros[i]);
    		}
    		else {
    			posiArray[i] = arregloEnteros[i];
    		}
    		i++;
    	}
    	arregloEnteros = posiArray;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	int[] orgArray = new int[arregloEnteros.length];
    	int i = 0;
    	int x = 0;
    	int elemi;
    	int elemx;
    	int menor = arregloEnteros[0];
    	int posMenor = 0;
    	while (i< arregloEnteros.length) 
    	{
    		elemi = arregloEnteros[i];
    		//Primero encontraremos el menor elemento en arregloEnteros
    		while (x< arregloEnteros.length) 
    		{
    			
    			elemx = arregloEnteros[x];
    			
    			if (elemx < menor) 
    			{
    				menor = elemx;
    				posMenor = x;
    			}
    			x++;
    		}
    		orgArray[i] = menor;
    		eliminarEnteroPorPosicion(posMenor);
    		menor = arregloEnteros[0];
	    	posMenor = 0;
    		i++;
    	}
    	arregloEnteros = orgArray;
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	String[] orgChain = new String[arregloCadenas.length];
    	int i = 0;
    	int x = 0;
    	int j = 0;
    	String menor = arregloCadenas[0];
    	int posMenor = 0;
    	
    	
    	while (i< arregloCadenas.length);
    	{
    		String[] tempChain = new String[arregloCadenas.length];
    		String elemi = arregloCadenas[i];
			
    		
    		while(x< arregloCadenas.length) 
    		{
    			String elemx = arregloCadenas[x];
    			char xtemp = elemx.substring(0, 1).toCharArray()[0];
    			int xAscii = (int)(xtemp);
    			
    			char mtemp = menor.substring(0, 1).toCharArray()[0];
    			int menorAscii = (int)(mtemp);
    			
    			if (xAscii<menorAscii)
    			{
    				menor = elemx;
    				posMenor = x;
    				menorAscii = xAscii;
    				
    				
    			}		
    			x++;	
    		}
    			
    		orgChain[i] = menor;
    		while(j<arregloCadenas.length)
    		{
    			if (j != posMenor)
    			{
    				tempChain[j] = arregloCadenas[j];
    			}
    			
    			
    			j++;
    		}
    		arregloCadenas = tempChain;
    		menor = arregloCadenas[0];
        	posMenor = 0;
    		i++;	
    	}
    	
    arregloCadenas = orgChain;
    		
    }
    

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int counter = 0;
    	for(int i =0;i< arregloEnteros.length; i++)
    	{
    		if (i == valor)
    		{
    			counter++;
    		}
    	}	
        
    	return counter;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int counter = 0;
    	int i = 0;
    	while (i<arregloCadenas.length)
    	{
    		if (arregloCadenas[i] == cadena)
    		{
    			counter++;
    		}
    		i++;
    	}
    	return counter;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int counter = 0;
    	for (int x = 0; x< arregloEnteros.length; x++)
    	{
    		if (x == valor){counter++;}
    	}
    	int i = 0;
    	int j = 0;
    	int[] posArray = new int[counter];
    	while (i< arregloEnteros.length)
    	{
    		if (arregloEnteros[i] == valor) 
    		{
    			posArray[j] = i;
    			j++;
    		}
    		i++;
    	}
        return posArray;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	int[] Array = new int[2];
    	Array[0] = arregloEnteros[0];
    	Array[1] = arregloEnteros[(arregloEnteros.length)-1];
    	
        return Array;
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	int counter = 0;
    	ArrayList<Integer> uniqueList = new ArrayList<>();
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for (int x = 0; x<arregloEnteros.length; x++)
    	{
    		if (!(uniqueList.contains(x)))
    		{
    			uniqueList.add(x);
    		}
    	}
    	for (int i = 0; i<uniqueList.size(); i++)
    	{
    		
    		for (int j = 0; j<arregloEnteros.length; j++)
    		{
    			counter = 0;
    			if (i==j) 
    			{
    				counter++;
    			}
    		}
    		map.put(i, counter);
    		
    	}
        return map;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	int rta = 0;
    	ArrayList<String> stringList = new ArrayList<>();
    	
    	for (String x : arregloCadenas )
    	{
    		if (!(stringList.contains(x)))
    		{
    			stringList.add(x);
    		}
    	}
    	int counter = 0;
    	for (String i : stringList)
    	{
    		for(String j : arregloCadenas)
    		{
    			if (i==j) {counter++;}
    		}
    		if (counter>= 2)
    		{
    			rta++;
    		}
    	}
    	
        return rta;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	boolean rta = true;
    	int i = 0;
    	if (arregloEnteros.length != otroArreglo.length)
    	{
    		rta = false;
    	}
    	else
    	{
    		while(i<arregloEnteros.length);
    		{
    			if (arregloEnteros[i] != otroArreglo[i])
    			{
    				rta = false;
    			}
    			i++;
    		}
    	}
        return rta;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	ArrayList<Integer> intList = new ArrayList<>();
    	boolean rta = true;
    	
    	for (int x : arregloEnteros)
    	{
    		if (!intList.contains(x))
    		{
    			intList.add(x);
    		}
    	}
    	for (int i : otroArreglo)
    	{
    		if (!intList.contains(i))
    		{
    			rta = false;
    		}
    	}
        return rta;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	ArrayList<Integer> set = new ArrayList<>();
        
    	int[] ranges = calcularRangoEnteros();
    	
        int lowerBound = ranges[0];
        int upperBound = ranges[1];
        
        // Generate 10 random integers within the given range
        while (set.size() < cantidad) {
            int randomNumber = (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
            set.add(randomNumber);
        }
    }

}
