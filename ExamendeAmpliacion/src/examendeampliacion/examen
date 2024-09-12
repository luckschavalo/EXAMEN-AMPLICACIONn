
package examendeampliacion;

import javax.swing.JOptionPane;

public class menu {
    
    private int opc;
    public void mMenu(){ // se crea un metodo de menu el cual nos ayudara a que sea mas ordenado
        todo t =new todo();
        String[] opciones = {"ACTUALIZAR SALAS", "VER SALAS", "MODIFICAR SALAS", "SALIR"};
        
        
        do {
            opc = JOptionPane.showOptionDialog(null, "NOVA CINEMAS", "GESTION DE SALAS",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opc) {
                case 0 ->  {
                    t.precargarDatos();
                    JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE.");
                }
                case 1 ->  {
                    t.mostrarDatos();
                }
                case 2 ->  {
                    t.modificarAsientos();
                }
                case 3 ->  {
                    System.exit(0);
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "¡Opción incorrecta!");
                }
            }
        } while (opc != 3);// se dan las posibles opciones del menu
    }
        
    }

