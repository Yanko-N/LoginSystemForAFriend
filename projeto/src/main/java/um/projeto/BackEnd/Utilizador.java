/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package um.projeto.BackEnd;


public class Utilizador {
    public int id;
    public String name;
    public String password;
    public int role; //ROLE 0-ADMIN 1-MUSICO 2-PRODUTOR

    public Utilizador() {
    }

    public Utilizador(int id, String Name, String Password,int role) {
        this.id = id;
        this.name = Name;
        this.password = Password;
        this.role=role;
    }
    
    public void PrintData()
    {
        System.out.println("id:" +this.id + "\n name:" + this.name + "\n role: " + this.role);
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }
    

}
