package task;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: maxinhang.
 */
public abstract class AbstractTask {
    protected static Map<Class<? extends AbstractTask>, LoadStatus> TASK_STATUS_MAP = new ConcurrentHashMap<>();
    enum LoadStatus {
        INIT, RUNNING, INITIALIZED, FINISH
    }

    protected String getTaskName() {
        return getClass().getSimpleName();
    }

    protected void registerTask() {
        if (!TASK_STATUS_MAP.containsKey(getClass())) {
            TASK_STATUS_MAP.put(getClass(), LoadStatus.INIT);
        } else {
            TASK_STATUS_MAP.put(getClass(), LoadStatus.RUNNING);
        }
    }

    public abstract void runTask();

    protected void finishTask() {
        if (LoadStatus.INIT == TASK_STATUS_MAP.get(getClass())) {
            TASK_STATUS_MAP.put(getClass(), LoadStatus.INITIALIZED);
        } else {
            TASK_STATUS_MAP.put(getClass(), LoadStatus.FINISH);
        }

    }

    public static boolean hasInit(Class<? extends AbstractTask> clazz) {
        boolean isRunning = TASK_STATUS_MAP.containsKey(clazz) && LoadStatus.INIT != TASK_STATUS_MAP.get(clazz);
        if (!isRunning) {
//            log.error("task: {} has not be initialized", clazz.getSimpleName());
        }
        return isRunning;
    }
}

