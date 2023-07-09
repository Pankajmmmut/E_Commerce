# E_Commerce

A Spring-boot project.Project manage Employee and Address.

## tools
### Framework
intelliJ IDEA MySQL

## dependencies -
Spring web, Validation, JPA, MySQL , lombok

## entities
### User
* userId
* userName
* userEmail
* userPassword
* phoneNumber

### Product
*  id:integer 
*   name:string
*  Price:integer
 *  description:string
  * category:string
   * brand:string
### Address Model:
     *  id:integer    
     *  name:string
     *  landmark:string
      * phoneNumber:string
      * zipcode:string
      * state:string
      * UserID : foreign key mapping
### Order Model:
   *  id:integer
  *   userID:integer (foreign key mapping)
  *  productID:integer(foreign key mapping)
  *  addressID:integer(foreign key mapping)
  *  productQuantity:integer

## packages
### controller
* UserController and
* AddressController class
* ProductController
* OrderController
  

### model
contains 
* User.java and 
* Address.java class
* product.java
* Order.java

### service
contains UserService OrderService ProductService Address.service class

### repository
conatains IUserrepo ProductRepo Orderarepo and IAddressRepo interface extends CrudRepository interface

## endpoints
add, get, update, delete

# Project Summary
This project is made for showing one to one ,one to many ,many to may mappings between two entity.
