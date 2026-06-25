package io.invertase.firebase.common;

import Pd.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f48947e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RejectedExecutionHandler f48951d = new RejectedExecutionHandler() { // from class: Pd.n
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            this.f13820a.h(runnable, threadPoolExecutor);
        }
    };

    a(String str) {
        this.f48948a = str;
        i iVarG = i.g();
        this.f48949b = iVarG.d("android_task_executor_maximum_pool_size", 1);
        this.f48950c = iVarG.d("android_task_executor_keep_alive_seconds", 3);
    }

    private ExecutorService e(boolean z10) {
        if (z10) {
            return Executors.newSingleThreadExecutor();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, this.f48949b, this.f48950c, TimeUnit.SECONDS, new SynchronousQueue());
        threadPoolExecutor.setRejectedExecutionHandler(this.f48951d);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminated() || threadPoolExecutor.isTerminating()) {
            return;
        }
        f().execute(runnable);
    }

    public ExecutorService b() {
        return c(this.f48949b <= 1, "");
    }

    public ExecutorService c(boolean z10, String str) {
        String strD = d(z10, str);
        Map map = f48947e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(strD);
                if (executorService != null) {
                    return executorService;
                }
                ExecutorService executorServiceE = e(z10);
                map.put(strD, executorServiceE);
                return executorServiceE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String d(boolean z10, String str) {
        if (z10) {
            return this.f48948a + "TransactionalExecutor" + str;
        }
        return this.f48948a + "Executor" + str;
    }

    public ExecutorService f() {
        return c(true, "");
    }

    public ExecutorService g(String str) {
        if (this.f48949b == 0) {
            str = "";
        }
        return c(true, str);
    }

    public void i(String str) {
        Map map = f48947e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(str);
                if (executorService != null) {
                    executorService.shutdownNow();
                    map.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j() {
        Map map = f48947e;
        synchronized (map) {
            try {
                for (String str : new ArrayList(map.keySet())) {
                    if (str.startsWith(this.f48948a)) {
                        i(str);
                    } else {
                        f48947e.remove(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
