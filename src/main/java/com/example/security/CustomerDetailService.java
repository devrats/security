/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/19/2021
 *   Time: 6:15 PM
 *   File: CustomerDetailService.java
 */

package com.example.security;

import com.example.entity.Customer;
import com.example.entity.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomerDetailService implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Customer customer = customerRepository.findByUserName(s);
        CustomerDetails customerDetails = new CustomerDetails(customer);
        return customerDetails;
    }
}