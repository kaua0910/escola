package co.Correio.cadastros;

public class Cliente {
    private String username;
    private String lastname;
    private String password;
    private String email;
    private String telefone;
    private String CPF;
    //Setter(Set) = modificar do geito q a gnt quer
    //Getter (Get) = retornar\mostrar o codigo

    public Cliente(String username, String lastname, String email, String password,  String telefone, String CPF) {
        this.username = username;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.telefone = telefone;
        this.CPF = CPF;

    }

    public void SetUsername(String username) {
      this.username = username.toUpperCase();
    }

    public String GetUsername() {
        return username;
    }




    public void SetLastname(String lastname) {
        this.lastname = lastname.toUpperCase();
    }

    public String GetLastname() {
        return lastname;
    }

    public String GetFullName() {

        return username + " " + lastname;
    }




    public void Setpassword(String password) {
        this.password = password.trim();
    }
public String GetPassword() {
        return password;
}




    public void Setcpf(String cpf) {
       this.CPF = cpf.trim();
    }
    public String Getcpf() {
        return CPF;
    }



    public void password(String password) {
        this.password = password.trim();

    }


    public void SetEmail(String email) {
        this.email = email.trim();
    }

    public String GetEmail() {
        return email;
    }

    public void SetTelefone(String telefone) {
        this.telefone = telefone.trim();
    }
    public String GetTelefone() {
        return telefone;
    }

    public String TodasasInfo() {
        return "nome completo: " + GetFullName() + "\n Email: " + email + "\n senha: " + password + "\n Telefone: "  + telefone + "\n CPF: " + CPF;


    }
}