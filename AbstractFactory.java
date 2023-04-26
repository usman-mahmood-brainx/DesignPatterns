// Abstract factory interface
public interface CuisineFactory {

    Appetizer createAppetizer();
    Entree createEntree();
    Dessert createDessert();

}

// Concrete factory implementing CuisineFactory for Italian cuisine

public class ItalianCuisineFactory implements CuisineFactory {

    public Appetizer createAppetizer() {
        return new Bruschetta();
    }
    public Entree createEntree() {
        return new Spaghetti();
    }
    public Dessert createDessert() {
        return new Tiramisu();
    }
}

// Concrete factory implementing CuisineFactory for Chinese cuisine
public class ChineseCuisineFactory implements CuisineFactory {

    public Appetizer createAppetizer() {
        return new SpringRolls();
    }

    public Entree createEntree() {
        return new KungPaoChicken();
    }
    public Dessert createDessert() {
        return new MangoPudding();
    }
}

// Abstract product interface
public interface Appetizer {
    void prepare();
}

// Concrete product implementing Appetizer for Italian cuisine
public class Bruschetta implements Appetizer {

    public void prepare() {
        System.out.println("Preparing Bruschetta");
    }

}

// Concrete product implementing Appetizer for Chinese cuisine
public class SpringRolls implements Appetizer {
    public void prepare() {
        System.out.println("Preparing Spring Rolls");
    }
}

// Abstract product interface
public interface Entree {
    void prepare();
}

// Concrete product implementing Entree for Italian cuisine
public class Spaghetti implements Entree {
    public void prepare() {
        System.out.println("Preparing Spaghetti");
    }
}

// Concrete product implementing Entree for Chinese cuisine
public class KungPaoChicken implements Entree {
    public void prepare() {
        System.out.println("Preparing Kung Pao Chicken");
    }
}

// Abstract product interface
public interface Dessert {
    void prepare();
}

// Concrete product implementing Dessert for Italian cuisine
public class Tiramisu implements Dessert {
    public void prepare() {
        System.out.println("Preparing Tiramisu");
    }
}

// Concrete product implementing Dessert for Chinese cuisine
public class MangoPudding implements Dessert {
    public void prepare() {
        System.out.println("Preparing Mango Pudding");
    }
}


CuisineFactory italianFactory = new ItalianCuisineFactory()
