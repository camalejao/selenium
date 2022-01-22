package jao.tests;

import org.junit.Assert;
import org.junit.Test;

import jao.core.BaseTest;
import jao.pages.GooglePage;

public class GoogleTest extends BaseTest {
    
    private GooglePage googlePage = new GooglePage();

    @Test
    public void tituloPaginaGoogle() {
        googlePage.acessar();
        Assert.assertEquals("Google", googlePage.obterTitulo());
    }
}
