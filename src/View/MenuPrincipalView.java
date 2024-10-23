package View;

import javax.swing.*;
import Controller.LivroController;
import Model.LivroModel;
import View.LivroView;

public class MenuPrincipalView
{
    LivroModel livro = new LivroModel();
    LivroView livroView = new LivroView();
    LivroController livroController = new LivroController();

    public void Menu()
    {
        String menu = "1 - Criar Livro: " +
                "2 - Criar Usuario: " + "3 - Emprestimo de livro: ";


        int comando = Integer.parseInt(JOptionPane.showInputDialog(null,menu));

        switch (comando)
        {
            case 1:
                livro = livroView.menuCriarLivro(livro);
                String retornoController = livroController.leituralivro(livro);
                JOptionPane.showMessageDialog(null,retornoController);
                break;



        }


    }

}
