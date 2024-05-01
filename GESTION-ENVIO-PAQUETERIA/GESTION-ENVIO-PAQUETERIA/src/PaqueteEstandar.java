class PaqueteEstandar extends Paquete {
    public PaqueteEstandar(double peso, double altura, double ancho, double largo, String tipoServicio) {
        super(peso, altura, ancho, largo, tipoServicio);
    }

    @Override
    public double calcularCosto() {
       double costoTotal = 10.0; // Tarifa base
       costoTotal += this.peso * 0.5; // Ejemplo de costo por peso: $0.5 por cada kg extra
       double volumen = this.altura * this.ancho * this.largo;
       costoTotal += volumen * 0.2; // Ejemplo de costo por dimensiones: $0.2 por cada cm³ extra

       return costoTotal;

    }
}