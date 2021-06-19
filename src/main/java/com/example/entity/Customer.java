/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/19/2021
 *   Time: 5:04 PM
 *   File: Customer.java
 */

package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Customer {
    @Override
    public String toString() {
        return "Customer{" +
                "cId=" + cId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getcId(), customer.getcId()) && Objects.equals(getUserName(), customer.getUserName()) && Objects.equals(getPassword(), customer.getPassword()) && Objects.equals(getRole(), customer.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getcId(), getUserName(), getPassword(), getRole());
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Customer(Integer cId, String userName, String password, String role) {
        this.cId = cId;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public Customer() {
    }

    public Customer(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cId;
    private String userName;
    private String password;
    private String role;
}