
package Utilitario;


public class Corretores {
    public static String ConverteSQL(String data){

        return data.substring(6, 10)+"-"+data.substring(3, 5)+"-"+data.substring(0, 2);
        
    }
    
    public static String ConverteJava(String data){
        
        return data.substring(8, 10)+"/"+data.substring(5,7)+"/"+data.substring(0,4);
    }
       
    public static String CoverteCpf(String cpf){
        //123.456.789-12
        return cpf.substring(0,3)+cpf.substring(4,7)+cpf.substring(8,11)+cpf.substring(12,14);
    }
    
    
   public static String CoverteTele(String cel){
        //(86)99412-4445
        return cel.substring(1,3)+cel.substring(4,9)+cel.substring(10, 14);
    }
   
   
    public static String CoverteCNPJ(String cnpj){
        //78.425.986/0036-15?
        return cnpj.substring(0, 2)+cnpj.substring(3, 6)+cnpj.substring(7, 10)+cnpj.substring(11, 15)+cnpj.substring(16, 18);
    }
    
    
    /*public static void main(String args[]){
        System.out.println(Corretores.CoverteCNPJ("78.425.986/0036-15"));
    }*/
}
