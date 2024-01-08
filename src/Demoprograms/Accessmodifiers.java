package Demoprograms;

class Parent {
    private String secretData;

    public Parent(String secretData) {
        this.secretData = secretData;
    }

    public String getSecretData() {
        return secretData;
    }

    public void setSecretData(String newSecretData) {
        this.secretData = newSecretData;
    }
}

class Child extends Parent {
    public Child(String secretData) {
        super(secretData);
    }
     // Override the getter to access the secretData
        @Override
        public String getSecretData() {
            return "Accessed from Child: " + super.getSecretData();
        }
    }

public class Accessmodifiers {
	public static void main(String[] args) {
        Parent parent = new Parent("This is a secret.");
        System.out.println("Parent's Secret Data: " + parent.getSecretData());

        Child child = new Child("Secret from Parent");
        System.out.println("Child's Secret Data: " + child.getSecretData());

        // Accessing and modifying secret data using setters
        child.setSecretData("New Secret from Child");
        System.out.println("Updated Child's Secret Data: " + child.getSecretData());
    }
}
