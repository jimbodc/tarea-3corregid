
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{   int sumar = x+y;
		return sumar;
	}//a la variable int sumar declaramos como suma 
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{ 	int restar=x-y;
		return restar;
	}// la variable tipo int restar la declaramos como resta
	
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{	int multiplicar =x*y;
		return multiplicar;
	}//
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{	int residuo = x%y;
		return residuo;
	}//el resisduo es igual a la division de X y Y
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x)
	{	if (x%2==0) //si x es dividible entre dos se cumple la condicion
		{
			return true;
		}
			return false;
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{	if (x%3==0)
	{
		return true;
	}
		return false;
	}//X es multiplo de 3 por que es dividible entre ese numero 
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{	if (x>y)
	{
		return x;
	}else if (y>x)
	{
		return y;
	}
		return x;
	}//se tiene que cumplir cualquiera de las condiciones para que retorne el valor
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{	if (edad>=18)
	{
		return true;
	}
		return false;
	}//si la edad que ingresamos es mayor o igual a 18 se cumple la condicion y retorna true
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
		if ((x%2==0)&&(y%2==0)&&(z%2==0))
		{
			return true;
		}
		return false;
	}//si X Y y Z son dividibles entre dos devuelve true
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{	if ((x>y)&&(x>z))// si se cumple la condicion x es mayor que Y y Z devuelve x
	{
		return x;
	}else if ((y>x)&&(y>z))
	{
		return y;
	}else if ((z>x)&&(z>y))
	{
		return z;
	}
	return x;
	}
	
	
	
	public static void main(String[] args)
	{
		
	}

}
