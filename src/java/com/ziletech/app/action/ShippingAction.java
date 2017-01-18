package com.ziletech.app.action;

import com.cong.logiware.hibernate.dao.AddressDAO;
import com.cong.logiware.hibernate.dao.UserDAO;
import com.cong.logiware.hibernate.entity.Address;
import com.cong.logiware.hibernate.entity.User;
import com.cong.logiware.struts.LogiwareDispatchAction;
import com.ziletech.app.form.ShippingForm;
import java.util.List;
import java.util.Properties;

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

    public ActionForward PlaceOrder(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
//
//        Order order = null;
//        //make sure you make it casacade.All
//        Address address = null;
//        order.setAddress(address);
//        saveOrUpdate(order);
//        
        return mapping.findForward(SHIPPING);
    }

    public ActionForward shipping(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ShippingForm shippingForm = (ShippingForm) form;

        UserDAO userDAO = new UserDAO();
        User user = userDAO.findById(getCurrentUser(request).getId());

           List<Address>addresList = user.getAddressList();
         
           for (Address addresss : addresList)
           {
            shippingForm.setState(addresss.getState());
             shippingForm.setCity(addresss.getCity());
             shippingForm.setHouseno(addresss.getHouseno());
             shippingForm.setStreet(addresss.getStreet());
             shippingForm.setMobileno(addresss.getMobileno());
             shippingForm.setPincode(addresss.getPincode());
             shippingForm.setFullName(user.getUserName());
           }
        return mapping.findForward(SHIPPING);

    }

}
