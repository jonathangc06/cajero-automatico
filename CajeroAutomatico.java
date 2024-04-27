import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CajeroAutomatico
{
  private List < BilleteDisponible > billetes;
  private int saldoTotal;

  public CajeroAutomatico ()
  {
	billetes = new ArrayList <> ();
	saldoTotal = 0;
  }

  public void agregarBillete (BilleteDisponible billete)
  {
	billetes.add (billete);
	saldoTotal += billete.getValor ();
  }

  public void dispensarDinero (int monto)
  {
	List < BilleteDisponible > billetesADispensar = new ArrayList <> ();
	int montoRestante = monto;

	Iterator < BilleteDisponible > iterator = billetes.iterator ();
	while (iterator.hasNext () && montoRestante > 0)
	  {
		BilleteDisponible billete = iterator.next ();
		int valorBillete = billete.getValor ();
		if (valorBillete <= montoRestante)
		  {
			billetesADispensar.add (billete);
			montoRestante -= valorBillete;
			iterator.remove ();	// Remove the dispensed billet from the list
		  }
	  }

	if (montoRestante == 0)
	  {
		saldoTotal -= monto;
		System.out.println ("Dinero dispensado correctamente.");
	  }
	else
	  {
		System.out.
		  println
		  ("No hay suficientes billetes para dispensar el monto solicitado.");
	  }
  }
}
