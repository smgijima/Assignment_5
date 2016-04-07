package za.ac.cput.Assignment_5.Domain;

/**
 * Created by mgijma on 2016/04/06.
 */
public class User {

    private String UserID;
    private String Password;
    private String UserType;



    public String getUserID(){
        return UserID;
    }

    public String getPassword(){
        return Password;
    }

    public String getUserType() {
        return UserType;
    }

    private User() {

    }

    private User(Builder builder) {
        this.UserID = builder.UserID;
        this.Password = builder.Password;
        this.UserType = builder.UserType;

    }

    public static class Builder{
        private String UserID;
        private String Password;
        private String UserType;




        public Builder (String userId){
            this.UserID = userId;

        }
        public Builder Password(String password){
            this.Password = password;
            return this;
        }

        public Builder UserType(String usertype){
            this.UserType = usertype;
            return this;
        }


        public Builder copy(User value) {
            this.UserID = value.UserID;
            this.Password = value.Password;
            this.UserType = value.UserType;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
