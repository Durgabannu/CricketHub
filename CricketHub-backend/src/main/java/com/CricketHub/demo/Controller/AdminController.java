package com.CricketHub.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CricketHub.demo.Model.Admin;
import com.CricketHub.demo.Repository.AdminRepository;


// Enabling Cross-Origin Resource Sharing (CORS) for the specified origin. In other words, this configuration relaxes the same-origin policy for requests originating from http://localhost:3000, allowing them to access resources provided by the AdminController endpoints.
@CrossOrigin(origins= "http://localhost:3000")

// Annotating the class to indicate that it's a REST controller.
@RestController
public class AdminController {
    
    @Autowired //This annotation signals to the Spring container that it should automatically inject a bean of the required type (AdminRepository in this case) into the annotated field.
    private AdminRepository adminRepository;  // By specifying the type as AdminRepository, it ensures that only objects of AdminRepository (or its subclasses/interfaces) can be assigned to the adminRepository field. This helps in preventing type mismatches or errors related to incompatible types.

    // Defining a POST mapping for "/adminRegistration" endpoint.
    @PostMapping("/adminRegistration")

    public ResponseEntity<?> newAdminRegister(@RequestBody Admin newAdmin){    //ResponseEntity<?> is the return type of the method. ResponseEntity is a generic class provided by Spring MVC that represents the entire HTTP response to the client. It encapsulates the HTTP status code, headers, and body. <?> (wildcard) indicates that the body of the response can be of any type. It provides flexibility in defining the response body based on the specific use case.@RequestBody: This annotation indicates that the newAdmin parameter should be populated with the data from the request body of the HTTP request.Admin newAdmin: This parameter represents the data (payload) sent in the request body. It is of type Admin, which presumably is a model or DTO (Data Transfer Object) class containing the details required for registering a new admin.

    Admin savedAdmin = adminRepository.save(newAdmin);
    if(savedAdmin != null) {
        return new ResponseEntity<>(savedAdmin, HttpStatus.CREATED);
    } else {
        return new ResponseEntity<>("Error saving admin", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

    @PostMapping("/adminLogin")
    public ResponseEntity<String> login(@RequestBody Admin admin) {
        Admin foundAdmin = adminRepository.findByName(admin.getName());

        if (foundAdmin != null && foundAdmin.getPassword().equals(admin.getPassword())) {
            return new ResponseEntity<>("Login successful!", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Invalid username or password", HttpStatus.UNAUTHORIZED);
        }
    }
}

