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
 * Servlet implementation class LoginUsuario
 */
public class LoginUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUsuario() {
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
		UsuarioVO usuarioVO = new UsuarioVO();
		String erro = "";
		usuarioVO.setCpf(request.getParameter("txtCpf"));
		usuarioVO.setSenha(request.getParameter("txtSenha"));
		
		UsuarioBO usuarioBO = new UsuarioBO();
		if(usuarioBO.validarSenhaLogin(usuarioVO)){
			RequestDispatcher direcionar = request.getRequestDispatcher("ListarUsuarios.jsp");
			direcionar.forward(request, response);
		}else{
			erro = "CPF ou senha errado!";
			request.setAttribute("erro", erro);
			RequestDispatcher direcionar = request.getRequestDispatcher("Login.jsp");
			direcionar.forward(request, response); 
		}
		
	}

}
