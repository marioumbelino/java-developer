public class SmartTv {
    boolean estado=false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void ligar() {
        estado = true;
    }

    public void desligar() {
        estado = false;
    }
}
