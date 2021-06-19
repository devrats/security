/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/19/2021
 *   Time: 5:27 PM
 *   File: CustomerRepository.java
 */

package com.example.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    public Customer findByUserName(String userName);
}