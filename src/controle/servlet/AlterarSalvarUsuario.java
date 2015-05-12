package controle.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bo.UsuarioBO;
import modelo.vo.UsuarioVO;

/**
 * Servlet implementation class AlterarSalvarUsuario
 */
public class AlterarSalvarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarSalvarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UsuarioVO usuarioVO = new UsuarioVO();
		String erro = "";
		String idString = request.getParameter("txtId");
		int idInt = Integer.parseInt(idString);
		usuarioVO.setId(Integer.parseInt(request.getParameter("txtId")));
		usuarioVO.setNome(request.getParameter("txtNome"));
		usuarioVO.setCpf(request.getParameter("txtCpf"));
		usuarioVO.setEndereco(request.getParameter("txtEndereco"));
		usuarioVO.setSenha(request.getParameter("txtSenha"));
		
		UsuarioBO usuarioBO = new UsuarioBO();
		boolean retorno = usuarioBO.validarUsuarioAlterado(usuarioVO);
		if(retorno){
			RequestDispatcher direcionar = request.getRequestDispatcher("ListarUsuarios.jsp");
			direcionar.forward(request, response);
		}else{
			erro="Dados em branco!";
			request.setAttribute("erro", erro);
			RequestDispatcher direcionar = request.getRequestDispatcher("AlterarUsuario.jsp");
			direcionar.forward(request, response);
		}
	}

}
