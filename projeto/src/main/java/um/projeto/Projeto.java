package um.projeto;
import java.util.Scanner;
import um.projeto.BackEnd.Album;
import um.projeto.BackEnd.Instrumento;
import um.projeto.BackEnd.Musica;
import um.projeto.BackEnd.Musico;
import um.projeto.BackEnd.PreAlbum;
import um.projeto.BackEnd.Produtor;
import um.projeto.BackEnd.Sessao;
import um.projeto.BackEnd.Utilizador;
import um.projeto.BackEnd.Ficheiros;
import um.projeto.BackEnd.Admin;

 
public class Projeto 
{
    
    public static Scanner input= new Scanner(System.in);
     public static String caminho= "C:\\Users\\vitor\\Documents\\NetBeansProjects\\projeto\\src\\main\\java\\um\\projeto\\DadosUsers.txt";
     
    public static void main(String[] args) 
    {
        boolean quit = false;
        Utilizador utilizador=new Utilizador();
        do
        {
            
           

            //Fazer Login/Registro

            int e;
            do
            {
                System.out.println("1-Entrar\n2-Sair");
                e=input.nextInt();

            }while(e!=1 && e!=2);

            switch(e)
            {
                    case 1:
                        boolean voltarIniciarSessao=false;
                        do
                        {   
                            Iniciar(utilizador);
                        
                            switch(utilizador.role)
                            {
                                case 0:
                                    utilizador=new Admin();

                                    //CODIGO PARA ADMIN
                                    int escolha;
                                    do
                                    {
                                        System.out.println("MENU 1-\n + \n2-Voltar Atrás");
                                        escolha=input.nextInt();

                                    }while(escolha!=1 && escolha!=2); //AVISO TEM DE ALTERAR AQUI TB ADICIONAR OS OUTROS 

                                    switch(escolha)
                                    {
                                        case 4:
                                            voltarIniciarSessao=true;
                                            break;

                                    }
                                    break;
                                case 1:
                                    utilizador=new Musico();
                                    //CODIGO PARA MUSICO
                                    int escolha2;
                                    do
                                    {
                                        System.out.println("MENU 1-\n + \n2-voltar atrás");
                                        escolha2=input.nextInt();

                                    }while(escolha2!=1 && escolha2!=2); //AVISO TEM DE ALTERAR AQUI TB ADICIONAR OS OUTROS 

                                    switch(escolha2)
                                    {
                                        case 4:
                                            voltarIniciarSessao=true;
                                            break;
                                    }
                                    //MENU
                                    break;
                                case 2:
                                    utilizador=new Produtor();
                                    //CODIGO PARA PRODUTOR
                                    int escolha3;
                                    do
                                    {
                                        System.out.println("MENU 1-\n + \n2-voltar atrás");
                                        escolha3=input.nextInt();

                                    }while(escolha3!=1 && escolha3!=2); //AVISO TEM DE ALTERAR AQUI TB ADICIONAR OS OUTROS 

                                    switch(escolha3)
                                    {
                                        case 4:
                                            voltarIniciarSessao=true;
                                            break;
                                    }
                                    //MENU

                                    break;

                            }
                        }while(!voltarIniciarSessao);
                        
                        break;
                case 2:
                        
                    quit=true;
                        
                    break;
            }
        }while(!quit);    
        
        
    }
    
    public static void Iniciar(Utilizador utilizador)
    {
       
        int role;
        int escolha;
        
        
        do{
            System.out.println("1-Registar\n2-Login");
            escolha=input.nextInt();
            switch(escolha)
            {
                case 1:
                    do
                    {
                        System.out.println("Register\n\n");
                        System.out.println("UserName : ");
                        utilizador.name=input.next();
                        System.out.println("Password: ");
                        utilizador.password=input.next();
                        do
                        {
                            System.out.println("Qual é o role: \n1-Admin\n2-Musico\n3-Produtor");
                            role=input.nextInt();
                        }while(role!=1 && role!=2 && role != 3);
                        
                    }while(Ficheiros.RegistarConta(caminho, utilizador)==false);
                    
                    utilizador.PrintData();
                        
                        
                    
                    
                    break;
                case 2:
                    int e='1'; //inicializa-se como um
                    boolean exists=false;
                    do
                    {
                        do
                        {
                            System.out.println("LOGIN\n\n");
                            System.out.println("UserName : ");
                            utilizador.name=input.next();
                            System.out.println("Password: ");
                            utilizador.password=input.next();

                            do
                            {
                                System.out.println("Tem certeza: \n1-sim\n2-nao");
                                e=input.nextInt();
                            }while(e!=1 && e!=2);


                        }while(e!=1);
                        
                        Utilizador newUser = Ficheiros.Login(caminho,utilizador);
                        if(newUser!=null)
                        {
                            exists=true;
                            utilizador= newUser;
                            utilizador.PrintData();
                        }
                        
                    }while(!exists);
                    
                    
                    break;
                
                
                    
            }
        
        }while(escolha!=1 && escolha!=2);
        
        
    }
}
