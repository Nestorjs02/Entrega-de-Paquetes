public class GestorEnvios {
   
    private double tarifaBase;
    private double tarifaUrgente;
    private double tarifaFragil;
    private double costoPorPeso;
    private double costoPorDimensiones;

    public GestorEnvios(double tarifaBase, double tarifaUrgente, double tarifaFragil, double costoPorPeso, double costoPorDimensiones) {
        this.tarifaBase = tarifaBase;
        this.tarifaUrgente = tarifaUrgente;
        this.tarifaFragil = tarifaFragil;
        this.costoPorPeso = costoPorPeso;
        this.costoPorDimensiones = costoPorDimensiones;
    }

    public double calcularCosto(Paquete paquete) {
        return paquete.calcularCosto();
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getTarifaUrgente() {
        return tarifaUrgente;
    }

    public void setTarifaUrgente(double tarifaUrgente) {
        this.tarifaUrgente = tarifaUrgente;
    }

    public double getTarifaFragil() {
        return tarifaFragil;
    }

    public void setTarifaFragil(double tarifaFragil) {
        this.tarifaFragil = tarifaFragil;
    }

    public double getCostoPorPeso() {
        return costoPorPeso;
    }

    public void setCostoPorPeso(double costoPorPeso) {
        this.costoPorPeso = costoPorPeso;
    }

    public double getCostoPorDimensiones() {
        return costoPorDimensiones;
    }

    public void setCostoPorDimensiones(double costoPorDimensiones) {
        this.costoPorDimensiones = costoPorDimensiones;
    }
}
