public interface PlayerState {
    void jump();
    void attack();
}

public class AliveState implements PlayerState {
    public void jump() {
        System.out.println("Player jumps high");
    }

    public void attack() {
        System.out.println("Player attacks with sword");
    }
}

public class DeadState implements PlayerState {
    public void jump() {
        System.out.println("Player can't jump when dead");
    }

    public void attack() {
        System.out.println("Player can't attack when dead");
    }
}

public class Player {
    private PlayerState state;

    public Player() {
        state = new AliveState();
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void jump() {
        state.jump();
    }

    public void attack() {
        state.attack();
    }
}


// Usage:
public class Main {
    public static void main(String[] args) {
	Player player = new Player();
	player.jump();   // Output: "Player jumps high"
	player.attack(); // Output: "Player attacks with sword"

	player.setState(new DeadState());
	player.jump();   // Output: "Player can't jump when dead"
	player.attack(); // Output: "Player can't attack when dead"
    }
}


