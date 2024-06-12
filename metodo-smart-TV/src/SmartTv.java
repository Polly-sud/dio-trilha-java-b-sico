public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanaL){
        canal = novoCanaL;

    }

    public void aumentarCanal();{
        canal++;   
    }

    public void diminuirCanal();{
        canal--;
        
    }



    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentar o Volume para : " +volume);
       
        
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o Volume para : " +volume);


    }

    public void ligar(){
        ligada= true;
    }

    public void desligar(){
        ligada = false;
    }

   
}
