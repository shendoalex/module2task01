package by.javaguru.git.mergeexperience;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/module1theme1")
public class Module1Theme1Servlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Модуль 1";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>Enterprise-версия&nbsp;Java дважды за свою историю была переименована.<br />\n" +
                "<br />\n" +
                "Говоря о первом переименовании, стоит сказать пару слов о версиях Java вообще. Сначала JDK подчинялся правилам версионирования&nbsp;semver, продукт с названием Java 1 &ndash; это JDK версии 1.0.2 и позже 1.1.<br />\n" +
                "<br />\n" +
                "В 1.2 вся платформа получил маркетинговое название Java 2, а версия JDK разделилась на отдельные части: J2SE, J2ME и&nbsp;J2EE. Эти правила, сохранялись до 1.4.<br />\n" +
                "<br />\n" +
                "В 2004 году, подгоняемая молодым конкурентом в лице C#, Java получила множество обновлений. Среди них &ndash; появление современной нумерации. Из названия следующего релиза пропала цифра 2, а формат версии из инженерного стал маркетинговым. Вышла Java 5,&nbsp;J2EE 1.5 превратилась в Java EE 5.<br />\n" +
                "<br />\n" +
                "В 2018-ом компания Oracle рассталась с enterprise-версией, передала её open-source организации Eclipse Foundation. Авторское право на слово &laquo;Java&raquo; осталось за компанией, и технология получила свое нынешнее официальное название:&nbsp;Jakarta EE. Не следует путать ее с другим проектом&nbsp;Apache Jakarta.<br />\n" +
                "<br />\n" +
                "Еще один забавный факт: до Java 7 у версий были&nbsp;кодовые имена, семерка вышла под именем &laquo;Дельфин&raquo;. Далее разработка перешла от Sun к Oracle, и веселье кончилось.</p>");
        out.println("<a href=\"/module1\"><input type=\"button\" value=\"<- Назад к модулю 1\"></a>");
        out.println("</body></html>");
    }
    public void destroy() {
    }
}
