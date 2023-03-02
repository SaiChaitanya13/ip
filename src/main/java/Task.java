public class Task {
    protected String description;
    protected boolean isDone;
    protected String type;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getTaskName(){
        return this.description;
    }

    public String getType(){
        return "";
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public void markAsDone(){
        this.isDone = true;
    }

    public void markAsUndone(){
        this.isDone = false;
    }

    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "] " + this.description;
    }

    public void printAfterAddingTask(){
        if (Buddy.taskCount == 1){
            System.out.println("Got it! I have added this task!: \n" + this + "\n" + "Now you have " + Buddy.taskCount + " task remaining! Almost there, buddy!");
        }
        else{
            System.out.println("Got it! I have added this task! \n" + this + "\n" + "Now you have " + Buddy.taskCount + " tasks remaining! Let's finish them faster and relax!");

        }

    }

    public void printAfterDeletingTask() {
        if (Buddy.taskCount == 0) {
            System.out.println( "OK I have deleted this task!: \n" + this + "\n" + "CONGRATS BUDDY ON FINISHING ALL YOUR TASKS! TIME TO RELAX WITH YOUR FRIENDS AND FAMILY! :)");
        } else if (Buddy.taskCount == 1) {
            System.out.println("YAY ONE LESS TO GO! I have deleted this task!:  \n" + this + "\n" + "Now you have JUST " + Buddy.taskCount + " task remaining! CHOP CHOP FINISH IT");
        } else{
            System.out.println("YAY ONE LESS TO GO! I have deleted this task!:  \n" + this + "\n" + "Now you have " + Buddy.taskCount + " tasks remaining! Type list to see remaining tasks");

        }
    }

}
