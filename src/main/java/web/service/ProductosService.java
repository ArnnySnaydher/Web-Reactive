package web.service;

import web.model.Producto;

import java.util.List;

public interface ProductosService {
    
    List<Producto> catalogo();
    List<Producto> productosCategoria(String categoria);
    Producto productoCodigo(int cod);
    void altaProducto(Producto producto);
    Producto eliminarProducto(int cod);
    Producto actualizarProducto(int cod,double precio);
    
}
