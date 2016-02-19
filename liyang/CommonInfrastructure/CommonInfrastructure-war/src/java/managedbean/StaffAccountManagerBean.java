package managedbean;

import entity.Role;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import session.stateless.StaffAccountSessionBean;

@Named(value = "staffAccountManagerBean")
@RequestScoped
public class StaffAccountManagerBean {

    @EJB
    private StaffAccountSessionBean staffAccountSessionBean;
    private String email;
    private String emailLength;
    private String staffAccountName;
    private String password;
    private String contactNumber;
    private String statusMessage;
    private Long newStaffAccountId;
    private String role;
    private List<String> roles = staffAccountSessionBean.getAllRoleNames();

    public StaffAccountManagerBean() {
        emailLength = "Current staff name length is less than 4.";
    }

    public StaffAccountSessionBean getStaffAccountSessionBean() {
        return staffAccountSessionBean;
    }

    public void setStaffAccountSessionBean(StaffAccountSessionBean staffAccountSessionBean) {
        this.staffAccountSessionBean = staffAccountSessionBean;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailLength() {
        return emailLength;
    }

    public void setEmailLength(String emailLength) {
        this.emailLength = emailLength;
    }

    public String getStaffAccountName() {
        return staffAccountName;
    }

    public void setStaffAccountName(String staffAccountName) {
        this.staffAccountName = staffAccountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public Long getNewStaffAccountId() {
        return newStaffAccountId;
    }

    public void setNewStaffAccountId(Long newStaffAccountId) {
        this.newStaffAccountId = newStaffAccountId;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
    
    
    //public void saveNewRole(ActionEvent event) {
        //newRoleId = roleSessionBean.addNewRole(roleName, value1, value2, value3, value4, value5, value6, value7, value8, 
                //value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20,
                //value21, value22, value23, value24, value25, value26, value27);
        //statusMessage = "New Role Saved Successfully";
        //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Add New Role Result: "
                //+ statusMessage + " (New Role ID is " + newRoleId + ")", ""));

    }   
//}
