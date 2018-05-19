
package aula02;


public class Caneta {
    
    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    
    boolean tampa;
    
    //Metodos
    void Status(){
        System.out.println("Modelo:"+ this.modelo);
        System.out.println("Uma caneta:" + this.cor);
        System.out.println("Ponta da caneta é:" + this.ponta);
        System.out.println("está tampada?:"+ this.tampa);
    }
    
    void rabiscar(){
        if (this.tampa == true){
            System.out.println("ERRo não posso rabistcar");
        }else{
            System.out.println("Estou Rabiscando");
        }
        
    }
    void tampar(){
        this.tampa = true;
    }
    void destampar(){
     this.tampa = false;   
    }
}
