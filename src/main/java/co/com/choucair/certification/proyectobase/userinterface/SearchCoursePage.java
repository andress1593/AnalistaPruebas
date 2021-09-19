package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {

    public static final Target BUTTON_COURSES = Target.the("Selecciona cursos y certificaciones")
            .located(By.xpath("//*[@id=\"certificaciones\"]/div[1]/a/h4/strong"));

    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Dar clic en 'Ir ' para buscar el curso")
            .located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));

    public static final Target SELECT_COURSE = Target.the("Seleccionar el curso buscado")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));

    public static final Target NAME_COURSE = Target.the("Reconocer el nombre del curso")
            .located(By.xpath("//*[@id=\"page-header\"]/div/div/div[2]/div[1]/div[1]/a/div/div/h1\n"));
}
