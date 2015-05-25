package controle.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bo.ImovelBO;
import modelo.vo.ImovelVO;

/**
 * Servlet implementation class AlterarSalvarImovel
 */
public class AlterarSalvarImovel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarSalvarImovel() {
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
		ImovelVO imovelVO = new ImovelVO();
		String erro = "";
		String idString = request.getParameter("txtId");
		int idInt = Integer.parseInt(idString);
		imovelVO.setId(Integer.parseInt(request.getParameter("txtId")));
		imovelVO.setNome(request.getParameter("txtNome"));
		imovelVO.setObs(request.getParameter("txtObs"));
		imovelVO.setTipo(request.getParameter("txtTipo"));
		imovelVO.setValor(request.getParameter("txtValor"));
		
		ImovelBO imovelBO = new ImovelBO();
		boolean retorno = imovelBO.validarImovelAlterado(imovelVO);
		if(retorno){
			RequestDispatcher direcionar = request.getRequestDispatcher("ListarImovel.jsp");
			direcionar.forward(request, response);
		}else{
			erro="Dados em branco!";
			request.setAttribute("erro", erro);
			RequestDispatcher direcionar = request.getRequestDispatcher("AlterarUsuario.jsp");
			direcionar.forward(request, response);
		}
	}

}
