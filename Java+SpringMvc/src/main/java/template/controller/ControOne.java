package template.controller;

import javaTemplate.Book;
import javaTemplate.BookDAO;
import javaTemplate.SpringConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.util.List;
import java.util.Map;


@RequestMapping(produces = "application/json; charset=utf-8")
@RestController
public class ControOne {
    @GetMapping()
    public String getOne(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDAO bean = context.getBean(BookDAO.class);
        List<Map<String, Object>> toList = bean.getToList();
        return bean.getToBook().toString();
    }
}
