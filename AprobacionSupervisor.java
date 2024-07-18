public class AprobacionSupervisor extends BaseAprobacionHandler{

    public AprobacionSupervisor(AprobacionHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void aprobar(ConsumoMonto consumo) {
        if (consumo.getMonto() > 100 && consumo.getMonto() <= 500) {
            System.out.println("Aprobado por Supervisor: " + consumo.getMonto());
        } else {
            super.aprobar(consumo);
        }   
    
    
}
