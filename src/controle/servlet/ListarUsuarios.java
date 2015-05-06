package controle.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.UsuarioDAO;
import modelo.vo.UsuarioVO;

/**
 * Servlet implementation class ListarUsuarios
 */
public class ListarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuarios() {
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
		List<UsuarioVO> listaCompleta = new ArrayList<UsuarioVO>();
		listaCompleta = new UsuarioDAO().listarTodosUsuarios();
		request.setAttribute("listaCompleta", listaCompleta);
		RequestDispatcher direcionar = request.getRequestDispatcher("visao/index.jsp");
		direcionar.forward(request, response);
	}

}
