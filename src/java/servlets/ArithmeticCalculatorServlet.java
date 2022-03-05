
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 761450
 */
public class ArithmeticCalculatorServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        return;
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer firstNum = Integer.parseInt(request.getParameter("first"));
        Integer secondNum = Integer.parseInt(request.getParameter("second"));
        String invalid = "invalid";
       
        
        request.setAttribute("first", firstNum);
        request.setAttribute("second", secondNum);
        
        //This code still needs some validation. Run application for better understanding

        try{
            
        
        if (request.getParameter("operation_add") != null){
           int resultAdd = (firstNum + secondNum);
           request.setAttribute("result", resultAdd);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
           return;
        } else if (request.getParameter("operation_sub") != null){
           int resultSub = (firstNum - secondNum);
           request.setAttribute("result", resultSub);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
           return;
        } else if (request.getParameter("operation_multiply") != null){
           int resultMultiply = (firstNum * secondNum);
           request.setAttribute("result", resultMultiply);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
           return;
        } else if (request.getParameter("operation_mod") != null){
           int resultMod = (firstNum % secondNum);
           request.setAttribute("result", resultMod);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
           return;
        } 
        } catch(IOException | ServletException e){
            request.setAttribute("result", invalid);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
           return;
            
        }
        

       

        
      
        }
        

        
        

        
    }


