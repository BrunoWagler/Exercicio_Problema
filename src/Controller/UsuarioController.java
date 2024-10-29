package Controller;

import Model.UsuarioModel;
import Repository.UsuarioRepository;


public class UsuarioController
{
    UsuarioRepository usuariorepository = new UsuarioRepository();

    public String leituraUsuario(UsuarioModel usuario)
    {
        String returnusuariorepository = UsuarioRepository.salvarUsuario(usuario);
        return returnusuariorepository;
    }

}
