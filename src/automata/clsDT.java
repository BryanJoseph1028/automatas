/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata;

/**
 *
 * @author pc
 */
public class clsDT {
    public clsDT(){
        
    }
    
    public boolean aceptaCadena(String cad){
        int estado = 0;
        char cc;
        int tam = cad.length();
        String cadR = "";
        boolean sw = true;
        for(int i=0;i<=tam;i++){
            switch(estado){
                case 0:{
                    cc = cad.charAt(i);
                    cadR = cadR + cc;
                    if(cc == 'a'){estado=1;}
                    else{
                        System.out.println("Error.. \nCadR: "+cadR+"\nCadO: "+cad);
                        sw = false; i = tam;
                    }
                } break;
                case 1:{
                    cc = cad.charAt(i);
                    cadR = cadR +cc;
                    if(cc == 'b'){estado = 2;}
                    else{
                        System.out.println("Error.. \nCadR: "+cadR+"\nCadO: "+cad);
                        sw = false; i = tam;
                    }
                } break;
                case 2: {
                    cc = cad.charAt(i);
                    cadR = cadR+cc;
                    if(cc == 'a'){estado = 3;}
                    else{
                        if(cc == 'b'){estado = 2;}
                        else{
                            System.out.println("Error.. \nCadR: "+cadR+"\nCadO: "+cad);
                            sw = false; i = tam;
                        }
                    }
                } break;
                case 3: {
                    cc = cad.charAt(i);
                    cadR = cadR+cc;
                    if(cc == 'a'){estado = 3;}
                    else{
                        if(cc =='b'){estado = 4;}
                        else{
                            System.out.println("Error.. \nCadR: "+cadR+"\nCadO: "+cad); 
                            sw = false; i = tam;
                        }
                    }
                }break;
                case 4: {
                    if(i == tam){
                        System.out.println("Palabra Reconocida OK --> "+cadR);
                    }else{
                        System.out.println("Error.. \nCadR: "+cadR+"\nCadO: "+cad);
                        sw = false; i = tam;
                    }
                }break;
            }
        }
        return sw;
    }
}
