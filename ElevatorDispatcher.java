package HW12092024;

public class ElevatorDispatcher {
    public static class Elevator {
        private String name;
        private int currentFloor;

        public Elevator(String name, int currentFloor) {
            this.name = name;
            this.currentFloor = currentFloor;
        }

        public String getName() {
            return name;
        }

        public int getCurrentFloor() {
            return currentFloor;
        }

        public void moveToFloor(int floor) {
            System.out.println("Лифт " + name + " отправляется на " + floor + " этаж.");
            this.currentFloor = floor;
        }
    }

    private Elevator elevatorA;
    private Elevator elevatorB;

    public ElevatorDispatcher(int floorA, int floorB) {
        this.elevatorA = new Elevator("A", floorA);
        this.elevatorB = new Elevator("B", floorB);
    }

    public void callElevator(int callFloor) {
        int distanceToA = Math.abs(elevatorA.getCurrentFloor() - callFloor);
        int distanceToB = Math.abs(elevatorB.getCurrentFloor() - callFloor);

        if (distanceToA <= distanceToB) {
            elevatorA.moveToFloor(callFloor);
        } else {
            elevatorB.moveToFloor(callFloor);
        }
    }

    public static void main(String[] args) {
        ElevatorDispatcher dispatcher = new ElevatorDispatcher(0, 8);

        dispatcher.callElevator(1);
    }
}
