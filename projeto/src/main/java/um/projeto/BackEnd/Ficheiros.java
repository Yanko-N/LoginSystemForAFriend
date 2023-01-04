/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package um.projeto.BackEnd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class Ficheiros {
    
    
    public static Utilizador Login(String Caminho,Utilizador user)
    {
        Utilizador newUser=new Utilizador();
        try {       
            FileReader arqRead = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arqRead);       
            String linha = lerArq.readLine();
            String[] splitted;
            boolean ExisteConta = false;
              
                    while(linha!=null){
                        
                        splitted= linha.split(";"); 
                        if(splitted[1].equals(user.name) && splitted[2].equals(user.password)){
                            
                            ExisteConta = true;
                            
                            
                            newUser.id=Integer.parseInt(splitted[0]);
                            newUser.name=splitted[1];
                            newUser.password=splitted[2];
                            newUser.role= Integer.parseInt(splitted[3]);
                            
                        }
                       linha = lerArq.readLine();
                    }
                arqRead.close(); 
                
            return newUser;
            
        }catch(IOException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    //ESCREVER NO FICHEIRO
    //CONTAS
     public static boolean RegistarConta(String Caminho,Utilizador user)
     {
        List<Utilizador> _contas = new ArrayList<>();
        int number=0;
        try {       
            //vai abrir o ficheiro, vai escrever tudo o que já tem lá e depois vai adicionar a nova conta
            //Abrir ficheiro em modo de Leitura
            FileReader arqRead = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arqRead);       
            //-----------vai ler todas as linhas e guardar na lista
            String linha = lerArq.readLine();
            
            String[] splitted;
            String texto = "";
            
           
            while(linha!=null){                           
                        splitted= linha.split(";");                        
                       _contas.add(new Utilizador( Integer.parseInt(splitted[0]),splitted[1],splitted[2],Integer.parseInt(splitted[3])));                
                       linha = lerArq.readLine();
                       number++;
                    }
                arqRead.close(); 
            FileWriter arqWriter = new FileWriter(Caminho);
            PrintWriter gravarArq = new PrintWriter(arqWriter);  
            
            user.id = number + 1 ;
            _contas.add(new Utilizador(user.id,user.name,user.password,user.role));                       
            for(Utilizador c : _contas){                           
               texto =  c.id + ";" + c.name + ";" + c.password + ";" + c.role + ";";
               gravarArq.println(texto);
             }   
            gravarArq.close();
            return true;      
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}

