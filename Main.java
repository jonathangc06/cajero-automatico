public class Main
{
  public static void main (String[]args)
  {
	CajeroAutomatico cajero = new CajeroAutomatico ();

	// Agregar billetes al cajero
	  cajero.agregarBillete (new BilleteDisponible (100));
	  cajero.agregarBillete (new BilleteDisponible (50));
	  cajero.agregarBillete (new BilleteDisponible (20));
	  cajero.agregarBillete (new BilleteDisponible (10));

	// Dispensar dinero
	  cajero.dispensarDinero (80);	// Prueba dispensando $80
	  cajero.dispensarDinero (200);	// Prueba dispensando $200
  }
}
