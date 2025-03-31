//package task;
//
///**
// * @author: maxinhang.
// */
//public abstract class CronTask extends AbstractTask {
//    protected DateTime runTime;
//
//    protected abstract boolean canSchedule();
//
//    protected abstract void schedule() throws Exception;
//
//    public void runTask() {
//        boolean isError = false;
//        try {
//            runTime = DateTime.now();
//            if (canSchedule()) {
//                log.info("task {} start...", getTaskName());
//                stopWatch = new PerfCounterStopWatch(String.format("CronTask-%s", getTaskName()));
//                registerTask();
//                schedule();
//                finishTask();
//                stopWatch.stop();
//            } else {
//                log.info("not master, task {} is in waiting...", getTaskName());
//            }
//        } catch (Exception e) {
//            isError = true;
//            log.error("error in budget-cron-task-{},", getTaskName(), e);
//        } finally {
//            PerfCounter.setGaugeValue(String.format("budget.cron.task.%s.error", getTaskName()), isError ? 1 : 0);
//        }
//    }
//}
//
