package jao.core;

public class Properties {
    
    public static boolean QUIT_BROWSER = true;

    public static Browsers BROWSER = Browsers.CHROME;

    public static TipoExecucao TIPO_EXECUCAO = TipoExecucao.LOCAL;

    public enum Browsers {
        CHROME,
        FIREFOX,
        IE
    }

    public enum TipoExecucao {
        LOCAL,
        GRID,
        NUVEM
    }

}
