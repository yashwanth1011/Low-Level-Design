/**
 * Product
 */
public interface Product {
    void addUser(ProductObserver user);
    void removeUser(ProductObserver user);
    void notifyUser();
}