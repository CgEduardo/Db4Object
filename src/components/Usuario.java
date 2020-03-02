package Components;

public class Usuario {
	
private int numeroCliente;
private String nombreCompleto;
private int Edad;
private String numeroTarejta;
private String Tutor;
private String Nip;

    public String getNip() {
        return Nip;
    }

    public void setNip(String Nip) {
        this.Nip = Nip;
    }
private int Fondos;

    public int getFondos() {
        return Fondos;
    }

    public void setFondos(int Fondos) {
        this.Fondos = Fondos;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNumeroTarejta() {
        return numeroTarejta;
    }

    public void setNumeroTarejta(String numeroTarejta) {
        this.numeroTarejta = numeroTarejta;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTutor() {
        return Tutor;
    }

    public void setTutor(String Tutor) {
        this.Tutor = Tutor;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    

    @Override
    public String toString() {
        return "Usuario{" + "numeroCliente=" + numeroCliente +
                ", nombreCompleto=" + nombreCompleto + 
                ", Edad=" + Edad + ", "+
                "numeroTarejta=" + numeroTarejta +
                ", Tutor=" + Tutor +
                ", Nip=" + Nip + 
                ", Fondos=" + Fondos + '}'+"\n";
    }

    
    
   


}








