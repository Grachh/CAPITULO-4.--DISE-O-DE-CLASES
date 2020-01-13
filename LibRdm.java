import java.util.Arrays;
import java.util.Random;

public class LibRdm {

	public static double doubleRdm(int a, int b)
	{
		  return Math.floor(Math.random()*(b-a+1)+a);  
		  // Valor entre a y b, ambos incluidos.
	}
	
	
	
	public static double[] colDoubleRdm (int max)
	{
		double [] col = new double[intRdm(1,max)];
		for (int i=0; i<col.length; i++)
			col[i] = LibRdm.doubleRdm(1,max);
		return col;
	}
	public static int intRdm(int a, int b)
	{
		  return (int) Math.round(Math.floor(Math.random()*(b-a+1)+a));  
		  // Valor entre M y N, ambos incluidos.
	}
	
	public static int[] colIntRdm (int max)
	{
		int [] col = new int[intRdm(1,max)];
		for (int i=0; i<col.length; i++)
			col[i] = intRdm(1,max);
		return col;
	}
	public static char charRdm ()
	{
		return  (char) intRdm(48,135);
	}
	
	
	public static char[] colCharRdm (int max)
	{
		char [] col = new char[intRdm(1,max)];
		for (int i=0; i<col.length; i++)
			col[i] = charRdm();
		return col;
	}
	public static boolean boolRdm()
	{
		return (intRdm(1,2) == intRdm(1,2));
	}
	
	public static boolean[] colBooleanRdm (int max)
	{
		boolean [] col = new boolean[intRdm(1,max)];
		for (int i=0; i<col.length; i++)
			col[i] = boolRdm();
		return col;
	}
	
	public static String strRdm (int tamano)
	{
		// Los caracteres de interés en un array de char.
		char [] chars = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();

		// Longitud del array de char.
		int charsLength = chars.length;

		// Instanciamos la clase Random
		Random random = new Random();

		// Un StringBuffer para componer la cadena aleatoria de forma eficiente
		StringBuffer buffer = new StringBuffer();

		// Bucle para elegir una cadena de 10 caracteres al azar
		for (int i=0;i<tamano;i++){

			// Añadimos al buffer un caracter al azar del array
			buffer.append(chars[random.nextInt(charsLength)]);
		}

		// Y solo nos queda hacer algo con la cadena
		return buffer.toString();
	}
	
	public static String[] colStrRdm (int max)
	{
		String [] col = new String[intRdm(1,max)];
		for (int i=0; i<col.length; i++)
			col[i] = strRdm(col.length);
		return col;
	}
	
	
	public static Fecha fRdm ()
	
	{
		return new Fecha (intRdm(1,31), intRdm(1,12), intRdm(1900, 2100));
	}
	
	public static Horario hRdm ()
	
	{
		return new Horario (intRdm(0,23), intRdm(0,59), intRdm(0,59));
	}
	
	
	public static Reloj rRdm ()
	{
		return new Reloj (hRdm(), fRdm());
	}
	
	public static Reloj[] colRRdm (int max)
	{
		Reloj [] colRelojes = new Reloj[intRdm(1,max)];
		for (int i=0; i<colRelojes.length; i++)
			colRelojes[i] = rRdm();
		return colRelojes;
	}
	public static Fecha[] colFRdm (int max)
	{
		Fecha [] col = new Fecha[intRdm(1,max)];
		for (int i=0; i<col.length; i++)
			col[i] = fRdm();
		return col;
	}
	public static Horario[] colHRdm (int max)
	{
		Horario [] col = new Horario[intRdm(1,max)];
		for (int i=0; i<col.length; i++)
			col[i] = hRdm();
		return col;
	}
	
	
	
	public static String toString(int[] col) {
		return "LibArray [] col=" + Arrays.toString(col);
	}
	public static String toString(double[] col) {
		return "LibArray [] col=" + Arrays.toString(col);
	}
	public static String toString(boolean[] col) {
		return "LibArray [] col=" + Arrays.toString(col);
	}
	public static String toString(char[] col) {
		return "LibArray [] col=" + Arrays.toString(col);
	}
	public static String toString(String[] col) {
		return "LibArray [] col=" + Arrays.toString(col);
	}
	public static String toString(Fecha[] col) {
		return "LibArray [] col=" + Arrays.toString(col);
	}
	public static String toString(Horario[] col) {
		return "LibArray [] col=" + Arrays.toString(col);
	}
	public static String toString(Reloj[] col) {
		return "LibArray [] col=" + Arrays.toString(col);
	}
	
}
