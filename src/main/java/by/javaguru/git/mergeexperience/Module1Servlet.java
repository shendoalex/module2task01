package by.javaguru.git.mergeexperience;

import java.io.*;

import by.javaguru.git.mergeexperience.topics.Module1Topics;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/module1")
public class Module1Servlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Модуль 1";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        out.println("<table>");
        for (Module1Topics value : Module1Topics.values())
            out.println("<tr><td>"
                    + value.getOrder() + "</td><td>"
                    + value.getTopic() + "</td><td>"
                    + value.getDesc()
                    + "</td><td><a href=''>Подробнее</a>"
                    + "</td></tr>");

        out.println("</table>");

        out.println("<p>");
        out.println("<a href=\"/module1\"><button><img src=" + LEFT_ARROW_IMAGE + " alt=\"<- Предыдущий модуль\" style=\"vertical-align: middle\"></button></a>");
        out.println("<a href=\"/module2\"><button><img src=" + RIGHT_ARROW_IMAGE + " alt=\"Следующий модуль ->\" style=\"vertical-align: middle\"></button></a>");
        out.println("</p>");

        out.println("</body></html>");
    }

    public void destroy() {
    }

    private final String LEFT_ARROW_IMAGE = "" +
            "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAMAAABg3A" +
            "m1AAAACXBIWXMAAA7EAAAOxAGVKw4bAAACcFBMVEVHcEwKMxsKMhpx964JKhU" +
            "JJRIKMhot84grxl8KMhoKMhokqlMMPCAclFILMxsKMhsIMRkKMhot9Ik/9JLc++kKMR" +
            "oqvlkKMhoHKxYt84kTXzQJMRoJMRoKMhoHLRcJMRoSXTIJMhoXeEIJMRoKMhoILhcK" +
            "MhoJMRkt7YMgl0oKMhoKMhoILhgrzGQILBcKMhoIMRll9qcbjE4JMRkJMRoIMBkdl1QK" +
            "MhoIMBkfoloZczgKMhoILBYXcDks3HMJMRkKMRoTXDAt8IYVbj0YbjUrwlsKMhoJMRkn" +
            "r1Iko00ILhgs3nUJLxkt6H4KMhos1m4ryGEKMhoJMRkIMBkXbzcKMhoKMhoJMhoHJh" +
            "Qr5oEJMRkNQiMIMRkKMhoQTigKMhoKMhoJMRkbf0ApuFcLLRcqv1knsVQIKhUntlgqv" +
            "VkJMRoJMBkKMhokv2sJMRkJMBkMOx8o1XcKMhoKMhoIMBgOSCcIMBgKMhop23slx2" +
            "8n0XUKMhokwmwKMRoKMhpZ9aAKMhox9IoQTytt9qtw960u9IkKMxst84gkqlMMPCA" +
            "TXzQclFLc/Ok/9JIt64EMOR419I0ck1Et5XwrwFot8ogt74ULNBsSVCoOQSErxV4LNRws" +
            "2nEt7IILNhwLOB4t9Ig49I7V++UZgkgNQCIejkgbhEQrwlwchUIbfDsUXC0QTScrzmccg" +
            "0Apt1Yt8YYglUchrGArxF0PRyUs7oUs4ngVajos64MRVi8QSiUUZjgkuGQitmUTXS8jplIs" +
            "0moryGEkpVAp2HknznMPTioNQyQNPyEdl1S/+thN9Zk79JAo1ngt8YcPSyja++g+9JE" +
            "1ABP2KJ92AAAAhXRSTlMAr7n+IwH+/v79r/7+/v7+VvX+/v63/vED/v6onKMHe/6i/" +
            "mm0CNGK/v77yQ3+H9wg/v6Nfxb+zQ/+/rYC/v5Lcf7+/v7+mWP+/gX+Ff7m/v7DN" +
            "x7++aaPBP5K/izZ/u6/Kv7+JP7+I/7+RSPt/igT/v7p4jL+GdP+/v72/oKr/rD+/v7+I/" +
            "ifAQAAAgRJREFUSMdjYBgF5IGYMDU3CxLURwlGb50lS7x6gVCFSCElcaLVu2vt3MbeOpG" +
            "TlUj1DpzOm1vZW7uJ1WDCr+TEDgS8xGlgNWZbNIW9lWgbJGT4jNpbidfgJc1nxg4FxD" +
            "hJVWWaJcR4IDrG1sDIxQhCUIqLq67WAEW9TsLcDUJwDaeaOjt5wAhK8XT2swkKIKnP1" +
            "563G6gQpqFVqL2dHYygFHv76Zoz1dlw9WXlBbnsKKCxmbmFGQwMJdnZ60FkFZ86TL2B" +
            "/tHK1lZkG9hPnBXp6QGiHpGFE9jnHweRrdutoerzio8cYkfTMP+k8Lle4d7eXuEFQP4EMN" +
            "nFBFFfUlRayE4MkIJo0Ms5XAE2FcUGGELmQG2QmXuQnSQNsdPnsLOT4iTtHTP7SLJBu" +
            "W2F6yRSNEhY87uIeRPhIiEFaLDKKbKtXOvfTtCGOdOZYBlHnnOVx+p1BDT07d+EKEsE" +
            "BGd4BmggbNfQ5UAHM1M1+ZGSa5Bf//qNvnDjZmd0dHCDEZTi7tibNE/UBil9B6tNW+" +
            "O6RRKqYdestjY2MIJSQCSuroqag1TYQjJnw7NoCgsqSNeLwCgDwvn3JO8jpdRgUNaK" +
            "S9OdSkK5xJAVP+MARx8pJV+ifr/mskmklK0+gXzLJ9tNXUq0BlA6sRUTsxInoUKR53R" +
            "cslialCrL3lxQ1HS05qYEAAAblQLtXwMN+AAAAABJRU5ErkJggg==";

    private final String RIGHT_ARROW_IMAGE = "" +
            "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAMAAABg3A" +
            "m1AAAACXBIWXMAAA7EAAAOxAGVKw4bAAAC91BMVEUt84gKMhtx964KMhsJMRk" +
            "KMhoJHxBHcEwrxl8ILxcMPCAKMhokqlMKMxsclFIKMhot74Q/9JLc++kYfEUYfEQLMx" +
            "sKMhoKMhoLNBwIMBkKMhoKMhodiEQrxV4u84kr5IBl9qcHLRcKMRot8YcILhgKMho" +
            "Wcj8JMhoJMRockVAILxgKMhoKMRoJLxkJJBIIMRku9IkHLxcILxkfkkkJMhoafT8IIBA" +
            "qwVsHLBcKMhot7YMJMRorx2AJMBkKMhot8IYKMhtN9ZkIMBgGJRQs3XQJMRoJMRk" +
            "JMRkrzWYmsFUpuVgs4HcpvFkKMRoKMhoHLhgKMhsKMBgJMBgrwlwt5Hot9IkJMRoQ" +
            "TSggp10JLxgKMhoIMRkJMRkKMhoRVSwotVcTYTUILxgKMhoKMhoHKBUrzGQHKxVZ" +
            "9aAt7oMx9IoJMhorxV8JMRoKMhoNPyEJMRkrv1kILhgnz3MJMRkKMhoKMhoIMBgJM" +
            "ho29I0JMhoLNhwkqFEJLhcdiUUILRcKMhoGJxQJMRkJMRot74UKMRoKMhoJMhoUX" +
            "y8s0WkJMhoIMRkKMhot8ocJMBkKMhoIMBkJMRoJMRor6IIIMRkKMhoejkgIMBgqvlg" +
            "mynEZczgqvlkKMhohsGIKMholwmwJMRoYcjoKMhoKMhoKMho+9JFt9qsKMhoJMRkp" +
            "2XkPTCkVazsJMRkZgEcKMhoJMRoKMhoQUi3c++hw960u9IkLMxst84gkqlMMPCAclF" +
            "IYfEU/9JLc/OkNQCIt8ogLNRwt6oArymPV++ULNh0ahkot74Ydl1QUaTot9Igo1ngen" +
            "Fc19I0t530rw10t7YIKMhos7IS/+tg79JAjo1ALNx0qv1oVZzUYcjokuGQTXTAs2nIX" +
            "bjcQTyss1Ww49I4s2XAntlgNPyEMOh/a++gWcz8QTCY59I4kqFIfkUcrzWYSWjE19Iw" +
            "UXC4t8YYLNBsMOx8myHAhm0wlqlIORiUbhEQrwlwRWTEck1EjuWcTXDAs4HcMOR" +
            "4q330NPiFN8xOUAAAAs3RSTlP+4P79iv4BAP5K/v3+/v7Q/v7+/v7+wub+Ddf1/v7" +
            "+/v4BjP4Cl/6Aov4ErXMGART+Bw7+sv4B/gPY/oT+INX+3/4dAf6PVTb+/v7+/rah" +
            "Cv6KCf7+/nv+/heyJmn6/v7+SNRnHP4B/v7+o/5l8P4w/iX+h/nFFIz+U/7+S/4H" +
            "3AUcb/5F9JL+/qEV7v4p3hSQlf4S6/4W/v7+/sD+z/5d/u38yP7++yz+/v5T/qZJ+" +
            "P7+/vmH2cMAAAImSURBVEjHY2AnETCMakAC/hPmrl1OioaJh1b9kV5HgoYpaxhW" +
            "rFy/mmgNZtw7GDb/3rBsPrEa2JiBGjbLf10UQ6wGbj4GIJiUwKpDig0Mm88f41UnSc" +
            "PmI2qsSopEaNCDOAkIlEVYVVXQNJTlFLOggUDWoxAbNjPsPcyqoYWioTJX9OF2ru3" +
            "bgZhrOwzdPgHTsHmr5hZtXSQN+SUvi/ZuZdi6FYgZtsIQWDVEw2aGk1t8gxAasvLkG" +
            "eQUmNIZQCQYbGJamsmADAwiJGZLwjVYPt7M8Oqg0IXjmysOCu3eDUQbdz9yRLFh" +
            "8+Y5hxZPhmlg3AkUuSt4CijxVHDXLiBasusiA5oGhu+/+KfBNAgzEAPmcUk1ItkANQx" +
            "uMIYNmzfP2NPXRZIGhvdv20hxEgNDc7sUSTYIHHjCT4qG/bLPt1hDNIgQ456QYBkJ" +
            "OyOwBodbbwjasNXlyrUAMX1IsPK/fpFBQMPWO143tvgZQiOuvKq6IJsDHaRaIZxj7+" +
            "EZzh0GT0uR4g9qn23j2bYNiHm2wdD9m3Abztpc2iPthpQfokt5t2xh3QLCrFtgaN91mI" +
            "bTZ4wvi7ujZtHCRE40UAPLoqHe5qai/E5EFwJb7/lcPWciSXS51NMRH8frakF0MSNw" +
            "4OOn2GQiy6VvoNTw4V13C7El32eBn19k9tX3Elvct86cPmsBq1g/0fVD1J6pP3g764iv" +
            "UGyTeBc2pZFSKTqnNIy2BKAAAA1hdTFDEa3dAAAAAElFTkSuQmCC";

}