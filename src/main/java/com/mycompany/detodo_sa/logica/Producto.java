
package com.mycompany.detodo_sa.logica;


public class Producto {
private int codigo_prod;
private String desc;
private double precio;
private int stock;
private Categoria rubro;

    public Producto() {
    }

    public Producto(int codigo_prod, String desc, double precio, int stock, Categoria rubro) {
        this.codigo_prod = codigo_prod;
        this.desc = desc;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo_prod() {
        return codigo_prod;
    }

    public void setCodigo_prod(int codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }
     

}
