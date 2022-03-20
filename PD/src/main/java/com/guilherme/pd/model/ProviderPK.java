package com.guilherme.pd.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ProviderPK implements Serializable {
    private static final long serialVersionUID = 4802050407934923880L;
    @ManyToOne
    @JoinColumn(name = "rawMaterial_id")
    private RawMaterial rawMaterial;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public ProviderPK() {
    }

    public RawMaterial getMaterial() {
        return rawMaterial;
    }

    public void setMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
