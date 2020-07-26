package org.hoss.flowertrakker.models;

import javax.persistence.*;

@Entity
@Table(name = "gifting_method")
public class GiftingMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "item")
    private String item;

    @Column(name = "item_descr")
    private String itemDescr;

    public GiftingMethod() {}

    public GiftingMethod(String item, String itemDescr) {
        this.item = item;
        this.itemDescr = itemDescr;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItemDescr() {
        return itemDescr;
    }

    public void setItemDescr(String itemDescr) {
        this.itemDescr = itemDescr;
    }
}
