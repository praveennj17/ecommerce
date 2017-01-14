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
public class ShippingAction extends LogiwareDispatchAction {

    private static final String SHIPPING = "shiping";

    public ActionForward Shipping(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        return mapping.findForward(SHIPPING);
    }
}
