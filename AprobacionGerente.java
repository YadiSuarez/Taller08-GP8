public class AprobacionGerente extends BaseAprobacionHandler {
    @Override
    public void aprobar(ConsumoMonto consumo) {
        if (consumo.getMonto() > 1000) {
            System.out.println("Aprobado por Gerente: " + consumo.getMonto());
        } else {
            super.aprobar(consumo);
        }
    }
}