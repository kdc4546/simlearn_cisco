package cisco.java.program;

interface Login {
 void register();
 void login();
}

interface Cart {
 void payment();
 void wallet();
}

interface Logout {
 void login();
 void out();
}

interface Dashboard {
 void register();
 void profile();
}

interface Website extends Login, Cart, Logout, Dashboard {

}

class Ecommerce implements Website {

 public void register() {
     System.out.println("User registered.");
 }

 public void login() {
     System.out.println("User logged in.");
 }

 public void payment() {
     System.out.println("Payment processed.");
 }

 public void wallet() {
     System.out.println("Wallet functionality accessed.");
 }

 public void out() {
     System.out.println("User logged out.");
 }
 
 public void profile() {
     System.out.println("User profile viewed.");
 }

 public static void main(String[] args) {
     Ecommerce ecommerce = new Ecommerce();
     ecommerce.register();
     ecommerce.login();
     ecommerce.payment();
     ecommerce.wallet();
     ecommerce.out();
     ecommerce.profile();
 }
}

