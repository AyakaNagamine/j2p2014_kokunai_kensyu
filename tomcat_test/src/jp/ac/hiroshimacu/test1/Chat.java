package jp.ac.hiroshimacu.test1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Chat
 */
@WebServlet("/Chat")
public class Chat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Chat() {
        super();
        // TODO Auto-generated constructor stub
    }

    String comment = "";
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(createHTML());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        String message = request.getParameter("message");
        
        if(!message.equals("")){
        	
             comment+=message+"<br>";
   	
        }
        
        out.println(createHTML());
	}

	protected String createHTML(){
        StringBuffer sb = new StringBuffer();//String bufferのクラスsb
//private でもprotectedでもいいがpublicだめ、STringなので文字列を返す。クライアントの出力処理をしているわけではない。

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>サンプル</title>");
        sb.append("</head>");
        sb.append("<body>");

        sb.append("<p>");
      //  sb.append(methodType);//outに代入された型が入力される
        sb.append("</p>");

        sb.append("<p><a href=\"/tomcat_test/Chat\">リンク</a></p>");

    /*    sb.append("<form action=\"/tomcat_test/Chat\" method=\"get\">");//""内に""を入れ込みたいときは、/""とする。
        sb.append("<input type=\"submit\" value=\"GETで送信\">");
        sb.append("</form>");
*/
        sb.append("<form action=\"/tomcat_test/Chat\" method=\"post\">");
        sb.append("<input type=\"submit\" value=\"送信\">");
        sb.append(" <td><input type=\"text\" size=\"50\" value=\"\" name=\"message\" id=\"\"></td>");
        sb.append("</form>");
        sb.append(comment+"<br>");
        sb.append("</body>");
        sb.append("</html>");
//sbに以上の記述がすべて入った状態になる。
        return (new String(sb));//sbを引数に渡して、Stringで文字列表示する。
	}	
/*
 * <td><input type="text" size="5" value="" name="old" id="old2"></td>	
 */
}
