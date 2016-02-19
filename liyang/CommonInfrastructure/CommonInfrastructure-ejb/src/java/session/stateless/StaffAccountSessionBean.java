package session.stateless;

import entity.Role;
import entity.StaffAccount;
import entity.Privilege;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class StaffAccountSessionBean {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Privilege> getAllPrivileges() {
        Query query = entityManager.createQuery("SELECT p FROM Privilege p");
        return query.getResultList();
    }

    public List<String> getAllPrivilegeNames() {
        Query query = entityManager.createQuery("SELECT p.privilegeName FROM Privilege p");
        return query.getResultList();
    }
    
        public List<String> getAllRoleNames() {
        Query query = entityManager.createQuery("SELECT r.roleName FROM Role r");
        return query.getResultList();
    }

    public String getPrivilegeName(Long privilegeId) {
        Privilege privilege = entityManager.find(Privilege.class, privilegeId);
        String privilegeName = privilege.getPrivilegeName();
        return privilegeName;
    }

    private Privilege getPrivilege(Long privilegeId) {
        Privilege privilege = entityManager.find(Privilege.class, privilegeId);
        return privilege;
    }

    // staffAccountId can be changed to staffAccountName for easier search
    private StaffAccount getStaffAccount(Long staffAccountId) {
        StaffAccount staffAccount = entityManager.find(StaffAccount.class,
                staffAccountId);
        return staffAccount;
    }

    public List<Role> getAllRoles() {
        Query query = entityManager.createQuery("SELECT r FROM Role r");
        return query.getResultList();
    }

    public Role getMyRole(Long staffAccountId) {
        StaffAccount staffAccount = getStaffAccount(staffAccountId);
        return staffAccount.getRole();
    }

    public Long addNewRole(String roleName, boolean value1, boolean value2, boolean value3, boolean value4, boolean value5, boolean value6, boolean value7, boolean value8,
            boolean value9, boolean value10, boolean value11, boolean value12, boolean value13, boolean value14, boolean value15, boolean value16, boolean value17, boolean value18, boolean value19, boolean value20,
            boolean value21, boolean value22, boolean value23, boolean value24, boolean value25, boolean value26, boolean value27) {
        Role role = new Role();
        role.setRoleName(roleName);
        entityManager.persist(role);
        entityManager.flush();
        return role.getRoleId();
    }

    public void deleteRole(Role seletedRole) {
        Role role;
        role = entityManager.find(Role.class, seletedRole.getRoleId());
        entityManager.remove(role);
    }
}
