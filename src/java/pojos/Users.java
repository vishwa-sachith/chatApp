package pojos;
// Generated Nov 8, 2017 10:19:19 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private int id;
     private String name;
     private String password;
     private String status;
     private Set<Private> privatesForRese = new HashSet<Private>(0);
     private Set<Private> privatesForSender = new HashSet<Private>(0);
     private Set<Public> publics = new HashSet<Public>(0);

    public Users() {
    }

	
    public Users(int id) {
        this.id = id;
    }
    public Users(int id, String name, String password, String status, Set<Private> privatesForRese, Set<Private> privatesForSender, Set<Public> publics) {
       this.id = id;
       this.name = name;
       this.password = password;
       this.status = status;
       this.privatesForRese = privatesForRese;
       this.privatesForSender = privatesForSender;
       this.publics = publics;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set<Private> getPrivatesForRese() {
        return this.privatesForRese;
    }
    
    public void setPrivatesForRese(Set<Private> privatesForRese) {
        this.privatesForRese = privatesForRese;
    }
    public Set<Private> getPrivatesForSender() {
        return this.privatesForSender;
    }
    
    public void setPrivatesForSender(Set<Private> privatesForSender) {
        this.privatesForSender = privatesForSender;
    }
    public Set<Public> getPublics() {
        return this.publics;
    }
    
    public void setPublics(Set<Public> publics) {
        this.publics = publics;
    }




}

