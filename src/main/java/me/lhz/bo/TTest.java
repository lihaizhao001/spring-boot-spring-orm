package me.lhz.bo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_Test")
@Data
public class TTest {

    public TTest(){}

    public TTest(String name){
        this.name = name;
    }

    @Id
    @Column(name = "name",  nullable = false)
    private String name;
}
