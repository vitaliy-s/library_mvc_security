package ua.sosna.role_users;

/**
 * Created by vitaliy on 12.05.16.
 */
public enum UserRole {
    ROLE_USER("ROLE_USER"),
    ROLE_ADMIN("ROLE_ADMIN");

    private final String name;

    UserRole(String role_admin) {
        name = role_admin;
    }


    public boolean equalsName(String otherName) {
        return (otherName == null) ? false : name.equals(otherName);
    }


    @Override
    public String toString() {
        return this.name;
    }
}
