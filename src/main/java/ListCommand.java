public class ListCommand extends Command {
    @Override
    public void executeCommand(TaskList taskList, String input) {
        System.out.println(Messages.DIVIDER);
        System.out.println("Here is the list of tasks you have remaining! Come on Buddy!");
        int index = 1;                                              // index which shows numbers the task
        for (int i = 0; i < Buddy.taskCount; i++) {
            System.out.println(index + "." + taskList.get(i));
            index++;                                                // increment the number on the task
        }
        System.out.println(Messages.DIVIDER);


    }
}