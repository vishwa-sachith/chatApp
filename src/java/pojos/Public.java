package pojos;
// Generated Nov 8, 2017 10:19:19 AM by Hibernate Tools 4.3.1



/**
 * Public generated by hbm2java
 */
public class Public  implements java.io.Serializable {


     private Integer id;
     private Users users;
     private String msg;

    public Public() {
    }

	
    public Public(Users users) {
        this.users = users;
    }
    public Public(Users users, String msg) {
       this.users = users;
       this.msg = msg;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public String getMsg() {
        return this.msg;
    }
    
    public void setMsg(String msg) {
        this.msg = msg;
    }




}


