package org.hoss.flowertrakker.models;

import javax.persistence.*;
import java.util.concurrent.Flow;

@Entity
@Table(name = "flower_type")
public class FlowerType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "flower_id")
    private Long flowerId;

    @Column(name= "flower_name")
    private String flowerName;

    public FlowerType() {}

    public FlowerType(Long flowerId, String flowerName) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
    }

    public FlowerType(String flowerName) {
        this.flowerName = flowerName;
    }

    public Long getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(Long flowerId) {
        this.flowerId = flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }
}
