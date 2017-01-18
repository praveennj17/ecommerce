package com.ziletech.app.action;

import com.cong.logiware.hibernate.dao.UserDAO;
import com.cong.logiware.hibernate.entity.Cart;
import com.cong.logiware.hibernate.entity.CartProduct;
import com.cong.logiware.hibernate.entity.Product;
import com.cong.logiware.hibernate.entity.User;
import com.cong.logiware.struts.LogiwareDispatchAction;
import com.ziletech.app.form.ProductForm;
import com.ziletech.app.service.ProductService;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author sks
 */
public class CheckoutAction extends LogiwareDispatchAction {

    private static final String CARTS = "carts";

    public ActionForward Checkout(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ProductForm productForm = (ProductForm) form;
        UserDAO userDAO = new UserDAO();
        User user = userDAO.findById(getCurrentUser(request).getId());
        Cart cart = user.getCart();
        List<CartProduct> cartProductList = cart.getCartProductList();
       
        List<Product> productList = new ArrayList<>();
        for (CartProduct cartProduct : cartProductList) {
           
            Product product = cartProduct.getProduct();
            productList.add(product);
        }
        productForm.setProductList(productList);
        return mapping.findForward(CARTS);
    }

}
