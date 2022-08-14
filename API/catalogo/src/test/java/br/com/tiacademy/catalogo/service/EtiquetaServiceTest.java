package br.com.tiacademy.catalogo.service;

import br.com.tiacademy.catalogo.Service.EtiquetaService;
import br.com.tiacademy.catalogo.emun.Categoria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EtiquetaServiceTest {

    @Test
    public void deveConterNoveDigitos() {

        var etiquetaService = new EtiquetaService();
        String resultado = etiquetaService.gerarEtiqueta();

       assertTrue(resultado.length() == 9);
    }

    @Test
    public void deveSerAlphaNumerico() {

        var etiquetaService = new EtiquetaService();
        String resultado = etiquetaService.gerarEtiqueta();

        assertTrue(resultado.matches("^[A-Za-z0-9]+$"));
    }

    @Test
    public void primeiroCaracterDeveSerNumero () {

        var etiquetaService = new EtiquetaService();
        String resultado = etiquetaService.gerarEtiqueta(Categoria.CLASSICO);

        resultado.startsWith("C");

    }

}
