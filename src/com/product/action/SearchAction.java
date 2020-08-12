package com.product.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.product.model.Product;
import com.product.model.ProductDAO;

/**
 * Servlet implementation class SearchAction
 */
@WebServlet("/product/search")
public class SearchAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String field = request.getParameter("field");
		String word = request.getParameter("word");
		ProductDAO dao = ProductDAO.getInstance();
		ArrayList<Product>arr = dao.ProductSearch(field,word);
		int count = dao.ProductCount(field, word);
		
		JSONObject mainObj = new JSONObject();
		JSONArray jarr = new JSONArray();
			for(Product dto : arr) {
				JSONObject obj = new JSONObject();
				obj.put("productid", dto.getProductid());
				obj.put("producttype", dto.getProducttype());
				obj.put("productname", dto.getProductname());
				obj.put("explanation", dto.getExplanation());
				obj.put("price", dto.getPrice());
				obj.put("inventory", dto.getInventory());
				jarr.add(obj);
			}
			
			JSONObject objCount = new JSONObject();
			objCount.put("scount",count);
			
			mainObj.put("searchArr", jarr);
			mainObj.put("searchCount", jarr);
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println(mainObj.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
