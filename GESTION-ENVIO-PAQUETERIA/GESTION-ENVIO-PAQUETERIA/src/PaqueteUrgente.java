// Clase PaqueteUrgente
class PaqueteUrgente extends Paquete {
    public PaqueteUrgente(double peso, double altura, double ancho, double largo, String tipoServicio) {
        super(peso, altura, ancho, largo, tipoServicio);
    }

    @Override
    public double calcularCosto() {
        double costoTotal = 0;
        costoTotal += 20.0; // Suponiendo una tarifa base para paquetes urgentes de $20
        costoTotal += this.peso * 0.5; // Suponiendo un costo adicional de $0.5 por kilogramo
        costoTotal += (this.altura * this.ancho * this.largo) * 0.2; // Suponiendo un costo adicional de $0.2 por cm^3
        return costoTotal;
    }
}
