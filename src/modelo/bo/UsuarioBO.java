package modelo.bo;

import modelo.dao.UsuarioDAO;
import modelo.vo.UsuarioVO;

public class UsuarioBO {
	
	UsuarioDAO usuarioDAO = new UsuarioDAO();

	public boolean validarUsuario(UsuarioVO usuarioVO) {
		// TODO Auto-generated method stub
		if(usuarioVO.getEndereco() == ""|| usuarioVO.getNome() == ""||
			usuarioVO.getCpf() == ""|| usuarioVO.getSenha() == ""){
				return false;
			}else if(usuarioDAO.verificaCpfCadastrado(usuarioVO)){
				return false;	
			}else{
				return usuarioDAO.cadastrarUsuario(usuarioVO);
			}
	}
	
	public boolean validarUsuarioAlterado(UsuarioVO usuarioVO) {
		if(usuarioVO.getEndereco() == ""|| usuarioVO.getNome() == ""||
			usuarioVO.getCpf() == ""|| usuarioVO.getSenha() == ""){
			return false;
		}else{
			return usuarioDAO.alterarUsuario(usuarioVO);
		}
	}
	
	public boolean validarSenhaLogin(UsuarioVO usuarioVO){
		if(usuarioVO.getCpf() == ""|| usuarioVO.getSenha() == ""){
			return false;
		}else if(usuarioDAO.verificaSenhaOk(usuarioVO)){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean validarIdUsuario(String recebeId){
		if(recebeId == ""){
			return false;
		}else{
			return true;
		}
	}
}
