package controle.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.ImovelDAO;
import modelo.vo.ImovelVO;

/**
 * Servlet implementation class ListarImovel
 */
public class ListarImovel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarImovel() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		List<ImovelVO> listaCompleta = new ArrayList<ImovelVO>();
		listaCompleta = new ImovelDAO().listarTodosImoveis();
		request.setAttribute("listaCompleta", listaCompleta);
		RequestDispatcher direcionar = request.getRequestDispatcher("VerImovel.jsp");
		direcionar.forward(request, response);
	}

}
