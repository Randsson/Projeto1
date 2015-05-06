package controle.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bo.UsuarioBO;
import modelo.dao.UsuarioDAO;
import modelo.vo.UsuarioVO;

/**
 * Servlet implementation class AlterarPegarUsuario
 */
public class AlterarPegarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarPegarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UsuarioVO usuarioVO = new UsuarioVO();
		String erro = "";
		String recebeId = request.getParameter("id");
		UsuarioBO usuarioBO = new UsuarioBO();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		if(usuarioBO.validarIdUsuario(recebeId)){
			if(usuarioDAO.pegarUsuario(recebeId, usuarioVO)){
				request.setAttribute("usuarioVO", usuarioVO);
				//request.setAttribute("", arg1)
				RequestDispatcher direcionar = request.getRequestDispatcher("visao/AlterarUsuario.jsp");
				direcionar.forward(request, response);
			}
			
		}else{
			erro = "ID do Usuário não encontrada!";
			request.setAttribute("erro", erro);
			RequestDispatcher direcionar = request.getRequestDispatcher("naofoi");
			direcionar.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
