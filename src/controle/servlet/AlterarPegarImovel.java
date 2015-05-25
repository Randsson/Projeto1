package controle.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bo.ImovelBO;
import modelo.dao.ImovelDAO;
import modelo.vo.ImovelVO;

/**
 * Servlet implementation class AlterarPegarImovel
 */
public class AlterarPegarImovel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarPegarImovel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		ImovelVO imovelVO = new ImovelVO();
		String erro = "";
		String recebeId = request.getParameter("id");
		ImovelBO imovelBO = new ImovelBO();
		ImovelDAO imovelDAO = new ImovelDAO();
		if(imovelBO.validarIdImovel(recebeId)){
			if(imovelDAO.pegarImovel(recebeId, imovelVO)){
				request.setAttribute("imovelVO", imovelVO);
				RequestDispatcher direcionar = request.getRequestDispatcher("AlterarImovel.jsp");
				direcionar.forward(request, response);
			}
			
		}else{
			erro = "ID do Imovel não encontrada!";
			request.setAttribute("erro", erro);
			RequestDispatcher direcionar = request.getRequestDispatcher("ExcluirImovel");
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
