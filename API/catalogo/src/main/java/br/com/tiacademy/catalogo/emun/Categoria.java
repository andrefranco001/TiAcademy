package br.com.tiacademy.catalogo.emun;

public enum Categoria {
    JAZZ("J"),
    ROCK("R"),
    CLASSICO("C");

    Categoria(String prefixo) {
        this.prefixo = prefixo;
    }

    private String prefixo;

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }
}
