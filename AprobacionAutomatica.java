public class AprobacionAutomatica extends BaseAprobacionHandler {
    

    @Override
    public void aprobar(ConsumoMonto consumo) {
        if (consumo.getMonto() <= 100) {
            System.out.println("Aprobado automáticamente: " + consumo.getMonto());
        } else {
            super.aprobar(consumo);
        }
    }
}