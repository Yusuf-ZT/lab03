
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
public class AgeCalculatorServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NumberFormatException {
            //Integer ageCalc = Integer.parseInt(request.getParameter("age"));
            String ageCalc = request.getParameter("age");
        
       //System.out.println(ageCalc);
       
       request.setAttribute("age", ageCalc);
       
       
       
       //add some validation, if doesn't exist or empty, load the form again!
       
       //check if ageCalc is number
       //if not, send message: this is not a number
       
           if(ageCalc == null || ageCalc.equals("")){
                String nMessage = "You must give your current age!";
                request.setAttribute("nullMessage", nMessage);
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
                 
                
                return;
            } 
           
           if(ageCalc.equals("0")){
                String eMessage = "Please enter a number greater than 0.";
                request.setAttribute("errorMessage", eMessage);
            }
           else {
                int  a = Integer.parseInt(ageCalc);
                String message = "Your age next year will be " + (a + 1);
                request.setAttribute("passMessage", message);
            
           //System.out.println(ageCalc);
            }    
       
       
       
          
       getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
            return;
           
       
       
    }


}
