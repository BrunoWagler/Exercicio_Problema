package View;

import Model.UsuarioModel;
import javax.swing.*;

public class UsuarioView
{

    public UsuarioModel menuusuario(UsuarioModel usuario)
    {
        usuario.setNome(JOptionPane.showInputDialog(null,"Digite seu nome:"));
        usuario.setEmail(JOptionPane.showInputDialog(null,"Digite seu email:"));
        usuario.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu numero")));

        return usuario;
    }


}
