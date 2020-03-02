package Components;

import banco.Ingreso;
import banco.Menu;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import com.db4o.query.Query;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Conexion {

	private ObjectContainer db=null;  
	
	//Apertura de la base de datos
	 private void abrirRegistro(){
	  db = Db4oEmbedded.openFile("BasedeDatos");  
	  }
	private void cerrarRegistro(){
	    db.close();
	    }
	
	
	//Almacenamiento de los registros
	public void insertarRegistro(Usuario u){
	abrirRegistro();
	db.store(u);
	cerrarRegistro();
	}
	
		//Actualizacion de los datos
	public void actualizacion(int idN,String NombreN){
	abrirRegistro();
	Usuario u = new Usuario();
	u.setNumeroCliente(idN);
	
	ObjectSet resultado = db.queryByExample(u);
	Usuario preresultado =(Usuario) resultado.next();
	preresultado.setNombreCompleto(NombreN);
	db.store(u);
	cerrarRegistro();
}
        //Metodo Para la verificacion de insercion de datos en forma de lista
	public List<Usuario> seleccionarUsuario()
        {
	abrirRegistro();
	ObjectSet listaUsuarios = db.queryByExample(Usuario.class);
	List<Usuario> lu = new ArrayList<>();
	for(Object listaUsuarios1 : listaUsuarios){
	    lu.add((Usuario) listaUsuarios1);
	}
	cerrarRegistro();
	return lu;
	}
        
 public void actualizacionFondos(int id, int cantidad ){
        abrirRegistro();
        Usuario u = new Usuario();
        u.setNumeroCliente(id);
        ObjectSet resultado = db.queryByExample(u);
        
        Usuario preresultado = (Usuario) resultado.next();
        preresultado.setFondos(preresultado.getFondos() + cantidad);
        
        db.store(preresultado);
        cerrarRegistro();
    }
 
 public void iniciarSesion(String numTar, String numNip)
 {
     
     abrirRegistro();
     String numtar=numTar;
     List<Usuario> usuarios = db.query(new Predicate<Usuario>()
     {
         public boolean match(Usuario o)
         {
             return o.getNumeroTarejta().equals(numTar) && o.getNip().equals(numNip);
         }
     } );
     if(usuarios.size()>0)
     {
        Menu m = new Menu();
        m.setVisible(true);
        m.setNumeroTarjeta(numtar);
     }
     else
     {
         JOptionPane.showInputDialog(null, "Login incorrecto", JOptionPane.WARNING_MESSAGE);
         Ingreso i = new Ingreso();
         i.setVisible(true);
     }
     
     cerrarRegistro();
 }
 
    public List<Usuario> Fondo(String numTar)
    {
        abrirRegistro();
    Query q = db.query();
    q.constrain(Usuario.class);
    q.descend("numeroTarejta").constrain(numTar);
    ObjectSet r=q.execute();
    List<Usuario> l = new ArrayList<>();
    for(Object o : r)
    {
        l.add((Usuario)o);
    }
    cerrarRegistro();
    return l;
    }
   
}
