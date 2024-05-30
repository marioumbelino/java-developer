public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.estado);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.ligar();
        
        smartTv.aumentarVolume();
        
        smartTv.mudarCanal(5);
        
        System.out.println("TV ligada? " + smartTv.estado);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.desligar();

        System.out.println("TV ligada? " + smartTv.estado);
    }
}
