package Controller;

import Model.LivroModel;
import Repository.LivroRepository;
import View.LivroView;
import javax.swing.*;


public class LivroController
{
    LivroRepository livroRepository = new LivroRepository();

    public String leituralivro(LivroModel livro)
    {
        String returnrepository = livroRepository.salvar(livro);
        return returnrepository;




    }


}
