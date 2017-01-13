package com.ziletech.app.action;

import com.cong.logiware.hibernate.dao.ProductDAO;
import com.cong.logiware.hibernate.dao.UserDAO;
import com.cong.logiware.hibernate.entity.Cart;
import com.cong.logiware.hibernate.entity.CartProduct;
import com.cong.logiware.hibernate.entity.Product;
import com.cong.logiware.hibernate.entity.User;
import com.cong.logiware.struts.LogiwareDispatchAction;
import com.ziletech.app.form.ProductForm;
import com.ziletech.app.service.ProductService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author sks
 */
public class CartAction extends LogiwareDispatchAction {

    private static final String PRODUCTS = "products";

    public ActionForward cart(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Get all products from the service class and put into form.
        ProductForm productForm = (ProductForm) form;
        UserDAO userDAO = new UserDAO();
        User user = userDAO.findById(getCurrentUser(request).getId());

        Cart cart = user.getCart();
        Product product = new ProductDAO().findById(productForm.getProductId());
        CartProduct cartProduct = new CartProduct();
        cartProduct.setCart(cart);
        cartProduct.setProduct(product);
        cart.getCartProductList().add(cartProduct);
        userDAO.saveOrUpdate(user);
        return mapping.findForward(PRODUCTS);
        
    }
    

}
