package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Juan Pablo\\Downloads\\chromedriver.exe");

        // Crear una instancia del navegador Chrome
        WebDriver driver = new ChromeDriver();

        // Navegar a la URL del sitio web
        driver.get("https://www.google.com");

        // Encontrar el campo de entrada de usuario por su nombre de etiqueta
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));

        // Ingresar el nombre de usuario en el campo de entrada de usuario
        usernameField.sendKeys("Prueba");


        // Encontrar el botón de inicio de sesión por su nombre de etiqueta
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));

        // Hacer clic en el botón de inicio de sesión para enviar el formulario
        loginButton.click();

        // Esperar un tiempo para que la página se cargue completamente (opcional)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Cerrar el navegador
        driver.close();

    }
}