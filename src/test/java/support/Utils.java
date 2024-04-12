package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {

    private static String emailCadastrado;

    static {
        gerarEmailAleatorio();
    }

    public static void esperarElementoClicavel(By element, int time) {
        WebDriverWait wait = new WebDriverWait(getDriver(), time);

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void esperarElementoVisivel(By element, int time) {
        WebDriverWait wait = new WebDriverWait(getDriver(), time);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void esperar(Integer milesegundos) {
        try {
            Thread.sleep(milesegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void gerarEmailAleatorio() {
        if (emailCadastrado == null) {
            String localPart = "teste";
            String domain = "@teste.com.br";

            Random random = new Random();
            int min = 1;
            int max = 99999;
            int result = random.nextInt(max - min) + min;
            emailCadastrado = localPart + result + domain;
        }
    }

    public static String getEmailCadastrado() {
        return emailCadastrado;
    }
}
