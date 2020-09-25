
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 834043
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int firstNumber =0;
        int secondNumber=0;
        try{ firstNumber = Integer.parseInt( request.getParameter("first_number"));
            secondNumber = Integer.parseInt( request.getParameter("second_number"));
        }
       catch (NumberFormatException e){
         request.setAttribute("result", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request,response);
       } 
        String selectedButton = request.getParameter("button");
        
        switch (selectedButton){
            case "+" : request.setAttribute("result", firstNumber + secondNumber); break;
            case "-" : request.setAttribute("result", firstNumber - secondNumber); break;
            case "*" : request.setAttribute("result", firstNumber * secondNumber); break;
            case "%" : request.setAttribute("result", firstNumber % secondNumber); break;
        }

      getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request,response);
    }
}
