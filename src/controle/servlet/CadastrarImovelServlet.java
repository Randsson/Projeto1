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
 * Servlet implementation class CadastrarImovelServlet
 */
public class CadastrarImovelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarImovelServlet() {
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
		
		imovelVO.setNome(request.getParameter("txtNome"));
		imovelVO.setEstado(request.getParameter("txtEstado"));
		imovelVO.setValor(request.getParameter("txtValor"));
		imovelVO.setObs(request.getParameter("txtObs"));
		imovelVO.setTipo(request.getParameter("tipo"));
				
	//System.out.println(imovelVO.getTipo());
		
		ImovelBO imovelBO = new ImovelBO();
		boolean retorno = imovelBO.validarCadastroImovel(imovelVO);
		if(retorno){
			RequestDispatcher direcionar = request.getRequestDispatcher("VerImovel.jsp");
			direcionar.forward(request, response);
		}else{
			erro="Todas os campos devem ser preenchidos";
			request.setAttribute("erro", erro);
			RequestDispatcher direcionar = request.getRequestDispatcher("CadastroImovel.jsp");
			direcionar.forward(request, response);
		}
	}

}
