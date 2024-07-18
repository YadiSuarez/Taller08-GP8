

public class ConsumoMonto {
    float monto;

    public ConsumoMonto(float monto) {
        this.monto = monto;
    }

    public void aprobar(){
        System.out.println("Consumo por : "+ monto + " aprobado");
    }

    public float getMonto() {
        return monto;
    }

}
