package View;

import Model.LivroModel;

import javax.swing.*;

public class LivroView
{


   public LivroModel menuCriarLivro(LivroModel livro)
   {
       livro.setAutor(JOptionPane.showInputDialog(null,"Entre com o autor: "));
       livro.setTitulo(JOptionPane.showInputDialog(null,"Entre com o titulo do livro: "));
       livro.setISBN(JOptionPane.showInputDialog(null,"Entre com o ISBN: "));
       livro.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade de exemplares:")));
       return livro;
    }

}
