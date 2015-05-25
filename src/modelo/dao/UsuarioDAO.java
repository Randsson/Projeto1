package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Request;

import modelo.util.Conexao;
import modelo.vo.UsuarioVO;

public class UsuarioDAO {
	
	Conexao conexao = new Conexao();

	public boolean verificaCpfCadastrado(UsuarioVO usuarioVO) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM usuario WHERE cpf = ?";
		try{
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			st.setString(1, usuarioVO.getCpf());
			//st.execute();
			
			ResultSet rs = st.executeQuery();
			if(rs.next()){
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			conexao.fecharConexao();
		}
	}
	
	public boolean verificaSenhaOk(UsuarioVO usuarioVO) {
		String sql="SELECT * FROM usuario WHERE nome = ? AND senha = ?";
		try{
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			st.setString(1,  usuarioVO.getNome());
			st.setString(2, usuarioVO.getSenha());
			ResultSet rs = st.executeQuery();
			if(rs.next()){
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			conexao.fecharConexao();
		}
	}
	
	public boolean verificaIdOk(UsuarioVO usuarioVO){
		String sql = "SELECT * FROM usuario WHERE id = ?";
		try{
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			st.setInt(1, usuarioVO.getId());
			ResultSet rs = st.executeQuery();
			if(rs.next()){
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			conexao.fecharConexao();
		}
	}
	public boolean cadastrarUsuario(UsuarioVO usuarioVO) {
		String sql = "INSERT INTO usuario (nome, cpf, endereco, senha, tipo) " +
				"VALUES (?,?,?,?,?)";
		
		try{
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			st.setString(1, usuarioVO.getNome());
			st.setString(2, usuarioVO.getCpf());
			st.setString(3, usuarioVO.getEndereco());
			st.setString(4, usuarioVO.getSenha());
			st.setString(5, usuarioVO.getTipo());
				
			st.execute();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			conexao.fecharConexao();
		}
	}
	
	public boolean alterarUsuario(UsuarioVO usuarioVO){
		String sql="UPDATE usuario SET nome=?, cpf=?, endereco=?, senha=? WHERE id=?";
		try{
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			st.setString(1, usuarioVO.getNome());
			st.setString(2, usuarioVO.getCpf());
			st.setString(3, usuarioVO.getEndereco());
			st.setString(4, usuarioVO.getSenha());
			st.setInt(5, usuarioVO.getId());
			
			st.execute();
			return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}finally{
			conexao.fecharConexao();
		}
	}
	
	public boolean excluirUsuario(String recebeId){
		String sql = "DELETE FROM usuario WHERE id = ?";
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
	
	public List listarTodosUsuarios() {
		List<UsuarioVO> listaCompleta = new ArrayList<UsuarioVO>();
		String sql = "SELECT * FROM usuario";
		try{
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()){
				UsuarioVO usuarioVO = new UsuarioVO();
				usuarioVO.setId(rs.getInt("id"));
				usuarioVO.setNome(rs.getString("nome"));
				usuarioVO.setCpf(rs.getString("cpf"));
				usuarioVO.setSenha(rs.getString("senha"));
				usuarioVO.setEndereco(rs.getString("endereco"));
				usuarioVO.setTipo(rs.getString("tipo"));
				listaCompleta.add(usuarioVO);
			}
			return listaCompleta;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			conexao.fecharConexao();
		}
	}
	
	public boolean pegarUsuario(String recebeId, UsuarioVO usuarioVO){
		String sql = "SELECT * FROM usuario WHERE id = ?";
		int novaId = Integer.parseInt(recebeId);
		//UsuarioVO usuarioVODAO = new UsuarioVO();
		
		try{
			PreparedStatement st = conexao.getConexao().prepareStatement(sql);
			st.setInt(1, novaId);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()){
				usuarioVO.setId(rs.getInt("id"));
				usuarioVO.setCpf(rs.getString("cpf"));
				usuarioVO.setEndereco(rs.getString("endereco"));
				usuarioVO.setNome(rs.getString("nome"));
				usuarioVO.setSenha(rs.getString("senha"));
				usuarioVO.setTipo(rs.getString("tipo"));
				
				//return true;
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
