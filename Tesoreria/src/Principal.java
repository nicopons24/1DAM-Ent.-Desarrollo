
public class Principal {

	public static void main(String[] args) {
		//variables
		int ingresosDinero=0;
		int gastosDinero=0;
		int totalDinero=0;
		int ingresos[]={25,65,97,22,36};
		int gastos[]={76,62,43};
		//codigo
		//calculo ingresos
		for(int i=0;i<ingresos.length;i++){
			ingresosDinero += ingresos[i];
		}
		//calculo gastos
		for(int i=0;i<gastos.length;i++){
			gastosDinero += gastos[i];
		}
		//calculo total
		totalDinero = ingresosDinero - gastosDinero;
		//salida pantalla
		System.out.println("Los ingresos son: "+ingresosDinero);
		System.out.println("Los gastos son: "+gastosDinero);
		System.out.println("El total del dinero es: "+totalDinero);
	}

}
