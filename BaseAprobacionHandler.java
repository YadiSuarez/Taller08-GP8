public  abstract class BaseAprobacionHandler implements AprobacionHandler{
    AprobacionHandler nextHandler;

    public BaseAprobacionHandler(AprobacionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void setNext(AprobacionHandler handler){
        this.nextHandler = handler;


    }

    @Override
    public void aprobar(ConsumoMonto consumo) {
        if (nextHandler != null) {
            nextHandler.aprobar(consumo);
        }
    }
}
