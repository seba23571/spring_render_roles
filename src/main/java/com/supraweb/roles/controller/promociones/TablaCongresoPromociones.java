package com.supraweb.roles.controller.promociones;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
 
import javax.persistence.Table;
 

/**
 *
 * @author sebawin
 */
@Entity
@Table(name = "tabla_congreso_promociones") 
 public class TablaCongresoPromociones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_numero_insert")
    private Integer idNumeroInsert;
    @Basic(optional = false)
    @Column(name = "id_codigo_promo")
    private String idCodigoPromo;
    @Basic(optional = false)
    @Column(name = "id_codigo_de_barra")
    private String idCodigoDeBarra;
    @Basic(optional = false)
    @Column(name = "nombre_del_producto")
    private String nombreDelProducto;
    @Basic(optional = false)
    @Column(name = "nombre_promocion")
    private String nombrePromocion;
    @Basic(optional = false)
    @Column(name = "precio_unitario")
    private float precioUnitario;
    @Basic(optional = false)
    @Column(name = "precio_final")
    private float precioFinal;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;

    public TablaCongresoPromociones() {
    }

    public TablaCongresoPromociones(Integer idNumeroInsert) {
        this.idNumeroInsert = idNumeroInsert;
    }

    public TablaCongresoPromociones(Integer idNumeroInsert, String idCodigoPromo, String idCodigoDeBarra, String nombreDelProducto, String nombrePromocion, float precioUnitario, float precioFinal, int cantidad) {
        this.idNumeroInsert = idNumeroInsert;
        this.idCodigoPromo = idCodigoPromo;
        this.idCodigoDeBarra = idCodigoDeBarra;
        this.nombreDelProducto = nombreDelProducto;
        this.nombrePromocion = nombrePromocion;
        this.precioUnitario = precioUnitario;
        this.precioFinal = precioFinal;
        this.cantidad = cantidad;
    }

    public Integer getIdNumeroInsert() {
        return idNumeroInsert;
    }

    public void setIdNumeroInsert(Integer idNumeroInsert) {
        this.idNumeroInsert = idNumeroInsert;
    }

    public String getIdCodigoPromo() {
        return idCodigoPromo;
    }

    public void setIdCodigoPromo(String idCodigoPromo) {
        this.idCodigoPromo = idCodigoPromo;
    }

    public String getIdCodigoDeBarra() {
        return idCodigoDeBarra;
    }

    public void setIdCodigoDeBarra(String idCodigoDeBarra) {
        this.idCodigoDeBarra = idCodigoDeBarra;
    }

    public String getNombreDelProducto() {
        return nombreDelProducto;
    }

    public void setNombreDelProducto(String nombreDelProducto) {
        this.nombreDelProducto = nombreDelProducto;
    }

    public String getNombrePromocion() {
        return nombrePromocion;
    }

    public void setNombrePromocion(String nombrePromocion) {
        this.nombrePromocion = nombrePromocion;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNumeroInsert != null ? idNumeroInsert.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TablaCongresoPromociones)) {
            return false;
        }
        TablaCongresoPromociones other = (TablaCongresoPromociones) object;
        if ((this.idNumeroInsert == null && other.idNumeroInsert != null) || (this.idNumeroInsert != null && !this.idNumeroInsert.equals(other.idNumeroInsert))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TablaCongresoPromociones[ idNumeroInsert=" + idNumeroInsert + " ]";
    }
    
}
