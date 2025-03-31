//package task;
//
///**
// * @author: maxinhang.
// */
//public abstract class FixedTask extends AbstractTask {
//    public abstract long getPeriod();
//
//    protected abstract void execute() throws Exception;
//
//    public void runTask() {
//        boolean isError = false;
//        try {
//            stopWatch = new PerfCounterStopWatch(String.format("FixedTask-%s", getTaskName()));
//            registerTask();
//            execute();
//            finishTask();
//            stopWatch.stop();
//        } catch (Throwable e) {
//            isError = true;
//            log.error("error in budget-fixed-task-{},", getTaskName(), e);
//        } finally {
//            PerfCounter.setGaugeValue(String.format("budget.fixed.task.%s.error", getTaskName()), isError ? 1 : 0);
//        }
//    }
//}
//
