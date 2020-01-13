import java.util.Arrays;

public class LibArray {

	
	
	//////////////////////////////////////////////////////////
	//   ESQUEMAS DE RESOLUION DE FAMILIAS DE PROBLEMAS DE RECORRIDO
	//   DE COLECCIONES
	
	
	// EXISTE / HAY / ALGUN / SE CUEMPLE QUE HAY
	// Hay alguna fecha de la colección que es un año bisiesto
	public static boolean hayBisiesto (Fecha[] colF)
	{
		boolean hayBisiesto = false;
		int i = 0 ;
		while (i < colF.length && !hayBisiesto)
		{
			if (LibFechas.anyoBisiesto(colF[i]))
				hayBisiesto = true;
			else
				i++;
		}
		return hayBisiesto;
	}
	
	public static boolean esHK (Fecha f)
	{
		return true;
	}
	
	
	public static boolean hayHK (Fecha[] colF)
	{
		boolean hayHK = false;
		int i = 0 ;
		while (i < colF.length && !hayHK)
		{
			if (esHK(colF[i]))
				hayHK = true;
			else
				i++;
		}
		return hayHK;
	}
	
	
	
	public static int sumaAnio (Fecha[] col)
	{
		int resultado = 0;
		
		for (int i = 0; i < col.length; i++)
		{
			resultado = resultado + col[i].getAnio();
		}
		return resultado;
	}
	
	public static int sumaSegundos (Horario[] col)
	{
		int resultado = 0;
		
		for (int i = 0; i < col.length; i++)
		{
			resultado += LibHorarios.aSegundos(col[i]);
		}
		return resultado;
	}
	
	public static int sumaSegundos (Reloj[] col)
	{
		int resultado = 0;
		
		for (int i = 0; i < col.length; i++)
		{
			resultado += LibHorarios.aSegundos(col[i].getH());
		}
		return resultado;
	}
	
	
	public static int cuantosDesfaseMenorQue (Reloj[] col, Reloj atomico, int desfase)
	{
		int cuantos = 0;
		int segsAtomico = LibHorarios.aSegundos (atomico.getH());
		
		for (int i = 0; i < col.length; i++)
		{
			int segsHorario = LibHorarios.aSegundos (col[i].getH());
			if (Math.abs(segsHorario-segsAtomico) < desfase)
  			    cuantos++;
		}
		return cuantos;
	}
	
	public static int cuantosMismoMes (Reloj[] col, int mes)
	{
		int cuantos = 0;
		
		for (int i = 0; i < col.length; i++)
		{
			if (col[i].getF().getMes() == mes)
  			    cuantos++;
		}
		return cuantos;
	}
	
	public static int cuantosSiglo21(Reloj[] col, int siglo)
	{
		int cuantos = 0;
		
		
		for (int i = 0; i < col.length; i++)
		{
			

			if (col[i].getF().getAnio() > (siglo-1)*100 && 
				col[i].getF().getAnio() <= siglo*100)
  			    cuantos++;
		}
		return cuantos;
	}
	
	
	
	public static boolean todosMayores (Fecha[] colF, Fecha f)
	{
		boolean todasMayores = true;
		int i = 0 ;
		while (i < colF.length && todasMayores)
		{
			if (LibFechas.esAnterior(colF[i],f))
				todasMayores = false;
			else
				i++;
		}
		return todasMayores;
	}
	
	
	
	
	
	public static boolean todosMayores (Fecha[] colF, Fecha f)
	{
		boolean todasMayores = true;
		int i = 0 ;
		while (i < colF.length && todasMayores)
		{
			if (LibFechas.esAnterior(colF[i],f))
				todasMayores = false;
			else
				i++;
		}
		return todasMayores;
	}
	
	
	
	public static boolean todosPositivos (double [] col)
	{
		boolean positivos = true;
		int i = 0 ;
		while (i < col.length && positivos)
		{
			if (!(col[i] >= 0))
				positivos = false;
			else
				i++;
		}
		return positivos;
		
	}
	
	public static boolean todosMayoresTemp (double [] col, double temp)
	{
		boolean mayores = true;
		int i = 0 ;
		while (i < col.length && mayores)
		{
			if (col[i] < temp) // (!col[i] >= temp)
				mayores = false;
			else
				i++;
		}
		return mayores;
		
	}
	
	
	
	public static boolean esMenor (Fecha f, Fecha g)
	{
		return LibFechas.esAnterior (f,g);
	}
	
	
	
	public static boolean algunaMayor (Fecha[] colF, Fecha f)
	{
		boolean hayMayor = false;
		int i = 0 ;
		while (i < colF.length && !hayMayor)
		{
			if (esMenor(f, colF[i]))  // es dir colF[i] es mayor !!!
				hayMayor = true;
			else
				i++;
		}
		return hayMayor;
	}
	
	public static Fecha unaMayor (Fecha[] colF, Fecha f)
	{
		boolean hayMayor = false;
		int i = 0 ;
		while (i < colF.length && !hayMayor)
		{
			if (esMenor(f, colF[i]))  // es dir colF[i] es mayor !!!
				hayMayor = true;
			else
				i++;
		}
		if (hayMayor)
			return colF[i];
		else
			return null;
	}
	
	
	
	public static int cuantosBisiestos (Fecha[] col)
	{
		int cuantos = 0;
		
		for (int i = 0; i < col.length; i++)
		{
			if (LibFechas.anyoBisiesto(col[i]))
  			    cuantos++;
		}
		return cuantos;
	}
	
	
	public static boolean hayVariosBisiestos (Fecha[] col)
	{
		return cuantosBisiestos(col) > 1;
	}
	
	
	
	
	
}
