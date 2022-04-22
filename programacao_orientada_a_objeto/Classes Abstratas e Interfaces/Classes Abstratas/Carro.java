abstract class Carro{
    String modelo;
    public boolean portaAberta = false;
    Carro(String modelo){
        this.modelo = modelo;
    }
    public abstract void abrirPorta();
    public abstract void fecharPorta();
    public abstract boolean getPorta();
}

class CarroEsportivo extends Carro{
    CarroEsportivo(String modelo){
        super(modelo);
    }
    public void abrirPorta(){
        portaAberta = true;
    }
    public void fecharPorta(){
        portaAberta = false;        
    }
    public boolean getPorta(){
        return portaAberta;
    }
}
