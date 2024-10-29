import Repository.LivroRepository;
import Repository.UsuarioRepository;
import View.MenuPrincipalView;

import javax.swing.*;
import javax.swing.text.View;


public class Main
{
    public static void main(String[] args)
    {
        LivroRepository livroRepository = new LivroRepository();
        UsuarioRepository usuariorepository = new UsuarioRepository();

        MenuPrincipalView menup = new MenuPrincipalView();

        menup.Menu();

    }
}