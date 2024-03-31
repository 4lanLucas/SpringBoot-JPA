package com.AlanProductions.ProjectCourse.entities.pk;

import com.AlanProductions.ProjectCourse.entities.Order;
import com.AlanProductions.ProjectCourse.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product Product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public com.AlanProductions.ProjectCourse.entities.Product getProduct() {
        return Product;
    }

    public void setProduct(com.AlanProductions.ProjectCourse.entities.Product product) {
        Product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemPK that = (OrderItemPK) o;
        return Objects.equals(order, that.order) && Objects.equals(Product, that.Product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, Product);
    }
}
