package com.cong.logiware.test;

import com.cong.logiware.hibernate.dao.ProductDAO;
import com.cong.logiware.hibernate.dao.UserDAO;
import com.cong.logiware.hibernate.entity.Cart;
import com.cong.logiware.hibernate.entity.CartProduct;
import com.cong.logiware.hibernate.entity.Product;
import com.cong.logiware.hibernate.entity.User;
import java.util.List;

/**
 *
 * @author sks
 */
public class CartTest {
    
    public static void main(String[] args) {
        
        //============= READ ===================
        //User
        User user = new User();
        //Cart
        Cart cart = user.getCart();
        //List of Cart Product
        List<CartProduct> cartProductList = cart.getCartProductList();
        //Each Cart Product
        for(CartProduct cartProduct : cartProductList){
            Product product = cartProduct.getProduct();
            System.out.println("Product : " + product);
        }
       
        
    }
    
    public static void writeProduct(){
         //============WRITE=======================
        // User Id    - 2
        // Product Id - 3
        // Quantity   - 2
        UserDAO userDAO = new UserDAO();
        User user = userDAO.findById(2);
        //1
        Cart cart = user.getCart();
        //2
        Product product = new ProductDAO().findById(3);
        //new row
        CartProduct cartProduct = new CartProduct();
        cartProduct.setCart(cart);
        cartProduct.setProduct(product);
        
        cart.getCartProductList().add(cartProduct);
        userDAO.saveOrUpdate(user);
        
        //             ->      New Object        ->
        //User -> Cart -> List<CartProduct> -> Product
        
    }
    
}
