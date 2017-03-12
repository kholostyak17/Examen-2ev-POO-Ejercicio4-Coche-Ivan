public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;
    Coche (String m, String n) {                            
        this.marca = m;
        this.modelo = n;
    }
    //apartado a)
    String getMarca() {
        return this.marca;
    }
    String getModelo() {
        return this.modelo;
    }
    int getVelocidad() {
        return this.velocidad;
    }
    void setVelocidad(int kmh) {
        this.velocidad = kmh;
    }
    //apartado b)
    void acelerar(int kmh) { 
        this.velocidad = this.velocidad + kmh;
    }
    void frenar(int kmh) {
        this.velocidad = this.velocidad - kmh;
    }
    void mostrar() {
        System.out.print("\nsu coche es un "+marca+" "+modelo+",\n");
        if (velocidad>=0){
            System.out.print("su velocidad final es de "+velocidad+" km/h.\n");
        }
        else{
            System.out.print("su velocidad final es de 0 km/h.\n");
            System.out.print("(ha dado un valor de frenada mayor que la velocidad asignada antes al coche)\n");
        }
    }
    
    //apartado c)
    public static void main(String[] args){ 
        String marca, modelo, respuesta;
        int velocidad, nuevaVelocidad;
        System.out.println("\nvamos a crear un coche, ¿de que marca lo quieres?");
        marca = System.console().readLine();
        System.out.println("\n¿que modelo es?");
        modelo = System.console().readLine();
        Coche coche1 =new Coche(marca, modelo);
        
        System.out.println("\nsupongamos que se encuentra en movimiento,");
        System.out.println("¿que velocidad lleva? (en km/h) (introduzca num. entero)");
        velocidad = Integer.parseInt(System.console().readLine());
        coche1.setVelocidad(velocidad);
        
        System.out.println("\nvamos a modificar su velocidad,");
        System.out.println("¿desea acelerar o frenar? (responda \"acelerar\"/\"frenar\")");
        respuesta = System.console().readLine();
        if(respuesta.equals("acelerar")){
            int incremento;
            System.out.println("\n¿en cuantos km/h deseas incremetar su velocidad?");
            incremento = Integer.parseInt(System.console().readLine());
            coche1.acelerar(incremento);
        }
        else{
            if(respuesta.equals("frenar")){
                int decremento;
                System.out.println("\n¿en cuantos km/h deseas decrementar su velocidad?");
                decremento = Integer.parseInt(System.console().readLine());
                coche1.frenar(decremento);
            }
            else{
                System.out.println("\nrespuesta no valida (se mantendra la velocidad anterior)");
            }
        }
        coche1.mostrar();
        System.out.print("=)\n");
    }  
}