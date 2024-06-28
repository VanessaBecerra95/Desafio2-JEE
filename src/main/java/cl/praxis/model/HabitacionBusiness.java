package cl.praxis.model;
import java.util.ArrayList;
import java.util.List;

public class HabitacionBusiness {
	public List<Habitacion> getHabitaciones() {
		// Inicializacion de lista de eventos
		ArrayList<Habitacion> habitacion = new ArrayList<Habitacion>();
		// habitacion 1
		Habitacion habitacion1 = new Habitacion ();
		habitacion1.setId(1);
		habitacion1.setNombre("Habitación 1, Simple");
		habitacion1.setDescripcion("Habitación Clásica con cama extragrande, vistas al océano y balcón.");
		habitacion1.setImagen(
				"https://i.postimg.cc/ydL8Y9ZQ/habitacion1.webp");
		habitacion1.setPrecio(10000);
		habitacion1.setHabitaciones(1);
		habitacion1.setMetraje(18);
		// habitacion 2
		Habitacion habitacion2 = new Habitacion ();
		habitacion2.setId(2);
		habitacion2.setNombre("Habitación 2, Doble - Simple");
		habitacion2.setDescripcion("Habitación Clásica con 2 camas grandes o dobles, vistas al océano y balcón");
		habitacion2.setImagen(
				"https://i.postimg.cc/J4Vz71DW/habitacion2.webp");
		habitacion2.setPrecio(20000);
		habitacion2.setHabitaciones(1);
		habitacion2.setMetraje(15);
		// habitacion 3
		Habitacion habitacion3 = new Habitacion ();
		habitacion3.setId(3);
		habitacion3.setNombre("Habitación 3, Doble - Normal");
		habitacion3.setDescripcion("Habitación Superior en planta alta con vistas al océano y 2 camas dobles");
		habitacion3.setImagen(
				"https://i.postimg.cc/zDPTxHcF/habitacion3.webp");
		habitacion3.setPrecio(30000);
		habitacion3.setHabitaciones(1);
		habitacion3.setMetraje(20);
		// habitacion 4
		Habitacion habitacion4 = new Habitacion ();
		habitacion4.setId(4);
		habitacion4.setNombre("Habitación 4, Doble - King");
		habitacion4.setDescripcion("Habitación Executive en planta superior con cama extragrande y vistas al océano");
		habitacion4.setImagen(
				"https://i.postimg.cc/vZXYvfPQ/habitacion4.webp");
		habitacion4.setPrecio(40000);
		habitacion4.setHabitaciones(1);
		habitacion4.setMetraje(21);
		// habitacion 5
		Habitacion habitacion5 = new Habitacion ();
		habitacion5.setId(5);
		habitacion5.setNombre("Habitación 5, Doble - King");
		habitacion5.setDescripcion("Suite Executive en planta superior con cama extragrande y vistas al océano");
		habitacion5.setImagen(
				"https://i.postimg.cc/LsbmcRKw/habitacion5.webp");
		habitacion5.setPrecio(50000);
		habitacion5.setHabitaciones(1);
		habitacion5.setMetraje(22);
		// habitacion 6
		Habitacion habitacion6 = new Habitacion ();
		habitacion6.setId(6);
		habitacion6.setNombre("Habitación 6, Doble - King");
		habitacion6.setDescripcion("Suite Executive en planta superior con cama extragrande y vistas al océano");
		habitacion6.setImagen(
				"https://i.postimg.cc/xCN9Y79C/habitacion6.webp");
		habitacion6.setPrecio(60000);
		habitacion6.setHabitaciones(1);
		habitacion6.setMetraje(22);
		// habitacion 7
		Habitacion habitacion7 = new Habitacion ();
		habitacion7.setId(7);
		habitacion7.setNombre("Habitación 7, Doble - King");
		habitacion7.setDescripcion("Suite Executive en planta superior con cama extragrande y vistas al océano");
		habitacion7.setImagen(
				"https://i.postimg.cc/HnGdL2Lt/habitacion7.webp");
		habitacion7.setPrecio(70000);
		habitacion7.setHabitaciones(1);
		habitacion7.setMetraje(24);
		// habitacion 8
		Habitacion habitacion8 = new Habitacion ();
		habitacion8.setId(8);
		habitacion8.setNombre("Habitación 8, Doble - King");
		habitacion8.setDescripcion("Suite Executive en planta superior con cama extragrande y vistas al océano");
		habitacion8.setImagen(
				"https://i.postimg.cc/Kvxhs434/habitacion8.webp");
		habitacion8.setPrecio(80000);
		habitacion8.setHabitaciones(1);
		habitacion8.setMetraje(26);
		
		//Agregar listas de habitaciones
		habitacion.add(habitacion1);
		habitacion.add(habitacion2);
		habitacion.add(habitacion3);
		habitacion.add(habitacion4);
		habitacion.add(habitacion5);
		habitacion.add(habitacion6);
		habitacion.add(habitacion7);
		habitacion.add(habitacion8);
		//retorno
		return habitacion;
	}
	
	public Habitacion getHabitacionbyID(Habitacion habitacion) {
		List<Habitacion> listaHabitacion = getHabitaciones();
		for (int x = 0; x < listaHabitacion.size(); x++) {
			if (listaHabitacion.get(x).getId() == habitacion.getId()) {
				habitacion = listaHabitacion.get(x);
			}
		}
		return habitacion;
	}
	
	public int calculaValorPagar(int valorHabitacion, int cantidadHabitaciones) {
		int valor = valorHabitacion * cantidadHabitaciones;
		return valor;
	}
	
}
