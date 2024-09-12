package examendeampliacion;
import javax.swing.JOptionPane;


public class todo {
   private final cine[] Cine = new cine[10];
   
   public void precargarDatos(){// es la informacion con la que se trabajara, es precaragada
       Cine [0] =  new cine ("L", "A", "O","O");
       Cine [1] =  new cine ("O", "B", "L","L");
       Cine [2] =  new cine ("L", "C", "O","L");
       Cine [3] =  new cine ("O", "D", "O","O");
       Cine [4] =  new cine ("L", "E", "O","L");
       Cine [5] =  new cine ("L", "F", "O","O");
       Cine [6] =  new cine ("O", "G", "L","L");
       Cine [7] =  new cine ("L", "H", "L","O");
       Cine [8] =  new cine ("O", "I", "L","L");
       Cine [9] =  new cine ("3", "#", "2","1");
   }
   
   public void mostrarDatos(){// para poder mostrar las salas con sus respectivos numero y letras 
    StringBuilder s = new StringBuilder();

    s.append("_____________ PANTALLA \n");
    JOptionPane.showMessageDialog(null, """
                                        L = LIBRE 
                                        O = OCUPPADO""");
    String nombre = JOptionPane.showInputDialog("NOMBRE PELICULA: \n ");
    agregarAsientos(s, 0, 3); 
    agregarAsientos(s, 4, 6);  
    agregarAsientos(s, 7, 9);  
    
    JOptionPane.showMessageDialog(null, s.toString(), nombre, JOptionPane.INFORMATION_MESSAGE); // el nombre de la pelicula se muestra arriba a la izquierda una vez ingresado 
}
  private void agregarAsientos (StringBuilder s, int inicio, int fin) {// el orden en el que queremos que se muestre
    for (int i = inicio; i <= fin; i++) {
        s.append(Cine[i].getAsientos()).append(" - ")
            .append(Cine[i].getEstado()).append(" - ")
            .append(Cine[i].getLetra()).append(" - ")
            .append(Cine[i].getNombrePeli()).append("\n");
    }
    s.append("");
  }
  
  public void modificarAsientos() {//para poder modificar los estados de los asientos, libres o ocupados 
    String[] numerosAsientos = new String[Cine.length];
    for (int i = 0; i < Cine.length; i++) {
        numerosAsientos[i] = Cine[i].getNumero();
    }
    int asientoSeleccionada = JOptionPane.showOptionDialog(null,
            "Seleccione el asiento que desea modificar:",
            "Modificar Asiento",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            numerosAsientos,
            numerosAsientos[0]); //para seleccionar el asiento que quremos cambiar

    if (asientoSeleccionada >= 0 && asientoSeleccionada < numerosAsientos.length) {
        cine ci = null;
        for (cine l : Cine) {
            if (l.getNumero().equals(numerosAsientos[asientoSeleccionada])) {
                ci = l;
                break;
            }
        }
        if (ci != null) {
            String[] estado = {"L", "O"};
            int tipoSeleccionado = JOptionPane.showOptionDialog(null,
                    "Seleccione el nuevo estado del asiento:",
                    "Modificar Asiento",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    estado,
                    estado[0]);// nos da las dos opciones de las cuales podemos seleccionar una de ellas para los asientos
            if (tipoSeleccionado < 0 || tipoSeleccionado >= estado.length) {
            } 
            else {
                 ci.getNumero(estado[tipoSeleccionado]);
                 JOptionPane.showMessageDialog(null,"El asinto ha sido modificado" + estado[tipoSeleccionado]); // finalizamos con la modificacion de los asientos
            }
   }
    }
  }
}
  