public class Todo extends Task {
    protected boolean isDone;
    public Todo(String description) {
        super(description);  // don't need isDone as isDone is already in Task class
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}

