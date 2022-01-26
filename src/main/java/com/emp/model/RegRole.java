package com.emp.model;

import javax.persistence.*;

@Entity
@Table(name = "Reg_Role")
public class RegRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reg_role_id", nullable = false)
    private Long regRoleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_desc")
    private String roleDesc;

    @Column(name = "active_flg")
    private Boolean activeFlg;

    public Long getRegRoleId() {
        return regRoleId;
    }

    public void setRegRoleId(Long regRoleId) {
        this.regRoleId = regRoleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Boolean getActiveFlg() {
        return activeFlg;
    }

    public void setActiveFlg(Boolean activeFlg) {
        this.activeFlg = activeFlg;
    }

    public RegRole() {

    }

    public RegRole(Long regRoleId, String roleName, String roleDesc, Boolean activeFlg) {
        this.regRoleId = regRoleId;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.activeFlg = activeFlg;
    }

    @Override
    public String toString() {
        return "RegRole{" +
                "regRoleId=" + regRoleId +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", activeFlg=" + activeFlg +
                '}';
    }
}
