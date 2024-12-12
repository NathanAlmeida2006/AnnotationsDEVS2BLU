package exer02.app;

import exer02.annotations.Version;

// @Version(description = "Versão inicial")
@Version(number = 8, description = "Versão final")
public class TesteVersion {
    public static void main(String[] args) {
        Class<?> classe = TesteVersion.class;
        Version version = classe.getAnnotation(Version.class);

        System.out.println("Número versão: " + version.number());
        System.out.println("Descrição versão: " + version.description());
    }
}
