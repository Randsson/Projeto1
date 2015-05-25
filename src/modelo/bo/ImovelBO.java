package modelo.bo;

import modelo.dao.ImovelDAO;
import modelo.vo.ImovelVO;

public class ImovelBO {
	
	ImovelDAO imovelDAO = new ImovelDAO();

	public boolean validarCadastroImovel(ImovelVO imovelVO) {
		// TODO Auto-generated method stub
		if(imovelVO.getTipo() == ""|| imovelVO.getNome() == ""||
			imovelVO.getEstado() == ""|| imovelVO.getObs() == "" || imovelVO.getValor() == ""){
				return false;
			}else{
				return imovelDAO.cadastrarImovel(imovelVO);
			}
	}
	
	public boolean validarImovelAlterado(ImovelVO imovelVO) {
		if(imovelVO.getTipo() == ""|| imovelVO.getNome() == ""||
				imovelVO.getEstado() == ""|| imovelVO.getObs() == "" || imovelVO.getValor() == ""){
			return false;
		}else{
			return imovelDAO.alterarImovel(imovelVO);
		}
	}
	
		public boolean validarIdImovel(String recebeId){
		if(recebeId == ""){
			return false;
		}else{
			return true;
		}
	}
}
