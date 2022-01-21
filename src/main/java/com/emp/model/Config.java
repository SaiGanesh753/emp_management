package com.emp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Config")
public class Config implements Serializable {

    private Long config_id;
    private String config_key;
    private String config_value;
    private String description;
    private Boolean active_flg;

    public Config() {
    }

    public Config(Long config_id, String config_key, String config_value, String description, Boolean active_flg) {
        this.config_id = config_id;
        this.config_key = config_key;
        this.config_value = config_value;
        this.description = description;
        this.active_flg = active_flg;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "config_id", nullable = false)
    public Long getConfig_id() {
        return config_id;
    }

    public void setConfig_id(Long config_id) {
        this.config_id = config_id;
    }

    @Column(name = "config_key", nullable = false)
    public String getConfig_key() {
        return config_key;
    }

    public void setConfig_key(String config_key) {
        this.config_key = config_key;
    }

    @Column(name = "config_value", nullable = false)
    public String getConfig_value() {
        return config_value;
    }

    public void setConfig_value(String config_value) {
        this.config_value = config_value;
    }

    @Column(name = "description", nullable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "active_flg", nullable = false)
    public Boolean getActive_flg() {
        return active_flg;
    }

    public void setActive_flg(Boolean active_flg) {
        this.active_flg = active_flg;
    }

    @Override
    public String toString() {
        return "Config{" +
                "config_id=" + config_id +
                ", config_key='" + config_key + '\'' +
                ", config_value='" + config_value + '\'' +
                ", description='" + description + '\'' +
                ", active_flg=" + active_flg +
                '}';
    }
}
