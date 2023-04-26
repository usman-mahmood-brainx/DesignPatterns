// Product
public interface Pizza {
    void prepare();
    void bake();
    void cut();
}

// Concrete Product
public class CheesePizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing cheese pizza...");
    }
    public void bake() {
        System.out.println("Baking cheese pizza...");
    }
    public void cut() {
        System.out.println("Cutting cheese pizza...");
    }
}

// Concrete Product
public class PepperoniPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing pepperoni pizza...");
    }
    public void bake() {
        System.out.println("Baking pepperoni pizza...");
    }
    public void cut() {
        System.out.println("Cutting pepperoni pizza...");
    }
}

// Creator
public abstract class PizzaStore {
    public void orderPizza() {
        Pizza pizza = createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
    }
    protected abstract Pizza createPizza();
}

// Concrete Creator
public class NYStylePizzaStore extends PizzaStore {
    protected Pizza createPizza() {
        return new CheesePizza();
    }
}

// Concrete Creator
public class ChicagoStylePizzaStore extends PizzaStore {
    protected Pizza createPizza() {
        return new PepperoniPizza();
    }
}


class Main(){
	public static void main(String args[]){
		PizzaStore nyStore = new NYStylePizzaStore();
		nyStore.orderPizza();

		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		chicagoStore.orderPizza();
	}
}



