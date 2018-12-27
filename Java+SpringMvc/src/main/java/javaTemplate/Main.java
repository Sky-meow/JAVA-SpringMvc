package javaTemplate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDAO bean = context.getBean(BookDAO.class);
        List<Map<String, Object>> toList = bean.getToList();
        Book toBook = bean.getToBook();
        System.out.println(0);
        bean.create();
    }
}
