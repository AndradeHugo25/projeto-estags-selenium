package teoricas.selenium.driver;

import system.tools.configuration.PropertiesLoader;

import java.io.IOException;
import java.util.Properties;

public class Passo1Properties {

    public static void main(String[] args) throws IOException {
        String login;
        boolean fecharDrive;
        int senhaNumerica;

        Properties props = PropertiesLoader.inicializarProperties("config.properties");

        login = props.getProperty("login");
        senhaNumerica = Integer.parseInt(props.getProperty("senha"));
        fecharDrive = Boolean.parseBoolean(props.getProperty("closeDrive"));

        System.out.println("Login: " + login + "\nSenha: " + senhaNumerica + "\nFechar drive? " + fecharDrive);
    }

}
