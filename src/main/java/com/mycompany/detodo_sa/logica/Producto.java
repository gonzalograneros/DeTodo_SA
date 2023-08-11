
package com.mycompany.detodo_sa.logica;


public class Producto {
private int codigo_prod;
private String desc;
private double precio;
private int stock;
private String rubro;

    public Producto() {
    }

    public Producto(int codigo_prod, String desc, double precio, int stock, String rubro) {
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

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    
    


}
