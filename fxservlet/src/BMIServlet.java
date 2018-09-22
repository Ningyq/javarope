import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BMIServlet", urlPatterns = "/bmi")
public class BMIServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String height = request.getParameter("height");
        String weight = request.getParameter("weight");

        double bmi = calculateBMI(
                Double.parseDouble(weight),
                Double.parseDouble(height)
        );
        
        request.setAttribute("bmiResult", estimateBMI(bmi));
        response.setHeader("Test", "Success");
        response.setHeader("BMI", String.valueOf(bmi));

        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    private String estimateBMI(double bmi) {
        String result = "";
        if (bmi < 18.5) {
            result = "体重过轻";
        }else if (bmi < 23.9) {
            result = "体重正常";
        }else if (bmi < 27) {
            result = "过重";
        }else if (bmi < 32) {
            result = "肥胖";
        }else {
            result = "非常肥胖";
        }
        return result;
    }

    private double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
