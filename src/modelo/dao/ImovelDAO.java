package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Request;

import modelo.util.Conexao;
import modelo.vo.ImovelVO;

public class ImovelDAO {
	
	Conexao conexao = new Conexao();

		
		public boolean cadastrarImovel(ImovelVO imovelVO) {
		String sql = "INSERT INTO imovel (nome, estado, valor, obs, tipo) " +
				"VALUES (?,?,?,?,?)";
		
		try{
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			st.setString(1, imovelVO.getNome());
			st.setString(2, imovelVO.getEstado());
			st.setString(3, imovelVO.getValor());
			st.setString(4, imovelVO.getObs());
			st.setString(5, imovelVO.getTipo());
				
			st.execute();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			conexao.fecharConexao();
		}
	}
	
	public boolean alterarImovel(ImovelVO imovelVO)
	{
		String sql="UPDATE imovel SET nome=?, estado=?, valor=?, obs=?, tipo=?, WHERE id=?";
		try{
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			st.setString(1, imovelVO.getNome());
			st.setString(2, imovelVO.getEstado());
			st.setString(3, imovelVO.getValor());
			st.setString(4, imovelVO.getObs());
			st.setString(5, imovelVO.getTipo());
			
			st.execute();
			return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}finally{
			conexao.fecharConexao();
		}
	}
	
	public boolean excluirImovel(String recebeId){
		String sql = "DELETE FROM imovel WHERE id = ?";
		int novaId = Integer.parseInt(recebeId);
		try{
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			st.setInt(1, novaId);
			st.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			conexao.fecharConexao();
		}
	}
	
	public List listarTodosImoveis() {
		List<ImovelVO> listaCompleta = new ArrayList<ImovelVO>();
		String sql = "SELECT * FROM imovel";
		try{
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next())
			{
				ImovelVO imovelVO = new ImovelVO();
				imovelVO.setId(rs.getInt("id"));
				imovelVO.setNome(rs.getString("nome"));
				imovelVO.setTipo(rs.getString("tipo"));
				imovelVO.setEstado(rs.getString("estado"));
				imovelVO.setValor(rs.getString("valor"));
				imovelVO.setObs(rs.getString("obs"));
				listaCompleta.add(imovelVO);
			}
			return listaCompleta;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			conexao.fecharConexao();
		}
	}
	
	public boolean pegarImovel(String recebeId, ImovelVO imovelVO){
		String sql = "SELECT * FROM imovel WHERE id = ?";
		int novaId = Integer.parseInt(recebeId);
			
		try{
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			st.setInt(1, novaId);
			ResultSet rs = st.executeQuery();
			
			if(rs.next())
			{
				imovelVO.setId(rs.getInt("id"));
				imovelVO.setNome(rs.getString("nome"));
				imovelVO.setTipo(rs.getString("tipo"));
				imovelVO.setEstado(rs.getString("estado"));
				imovelVO.setValor(rs.getString("valor"));
				imovelVO.setObs(rs.getString("obs"));
				
		}
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			conexao.fecharConexao();
		}
	}
	
}
