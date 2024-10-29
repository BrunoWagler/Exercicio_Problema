package View;

import Controller.LivroController;
import Model.LivroModel;
import Controller.UsuarioController;
import Model.UsuarioModel;

import javax.swing.*;

public class MenuPrincipalView
{
    LivroModel livro = new LivroModel();
    LivroView livroView = new LivroView();
    LivroController livroController = new LivroController();

    UsuarioModel usuario = new UsuarioModel();
    UsuarioView usuarioview = new UsuarioView();
    UsuarioController usuariocontroller = new UsuarioController();



    public void Menu()
    {
        String menu = "1 - Criar Livro:\n" +
                "2 - Criar Usuario:\n" + "3 - Emprestimo de livro:\n";


        int comando = Integer.parseInt(JOptionPane.showInputDialog(null,menu));

        switch (comando)
        {
            case 1:
                livro = livroView.menuCriarLivro(livro);
                String retornoController = livroController.leituralivro(livro);
                JOptionPane.showMessageDialog(null,retornoController);

                break;

            case 2:
                usuario = usuarioview.menuusuario(usuario);
                String retorno = usuariocontroller.leituraUsuario(usuario);
                JOptionPane.showMessageDialog(null,retorno);

                break;
        }


    }

}
