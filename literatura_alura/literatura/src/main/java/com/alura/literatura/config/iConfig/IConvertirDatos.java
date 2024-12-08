package com.alura.literatura.config.iConfig;

public interface IConvertirDatos {
    <T> T convertirDatosJsonAJava(String json , Class<T> clase);

}
