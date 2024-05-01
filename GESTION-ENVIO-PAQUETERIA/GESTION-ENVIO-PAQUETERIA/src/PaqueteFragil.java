class PaqueteFragil extends Paquete {
    public PaqueteFragil(double peso, double altura, double ancho, double largo, String tipoServicio) {
        super(peso, altura, ancho, largo, tipoServicio);
    }

    @Override
    public double calcularCosto() {
        double costoTotal = super.calcularCosto(); // Llama al método calcularCosto() de la clase base
        double tarifaFragilidad = 5.0; // Supongamos que la tarifa adicional por fragilidad es de $5
        costoTotal += tarifaFragilidad;
        costoTotal += peso * 0.1; // Supongamos que el costo por peso adicional es de $0.1 por kg
        costoTotal += (altura * ancho * largo) * 0.01; // Supongamos que el costo por dimensiones adicionales es de $0.01 por cm³

        return costoTotal;
    }
}
