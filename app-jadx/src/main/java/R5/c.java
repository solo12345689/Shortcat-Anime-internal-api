package R5;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f15167b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f15168c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f15169a = new ArrayBlockingQueue(20);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private c() {
    }

    public static c a() {
        return f15168c ? new c() : f15167b;
    }

    public void b(a aVar) {
        if (f15168c) {
            for (int i10 = 5; !this.f15169a.offer(aVar) && i10 > 0; i10--) {
                this.f15169a.poll();
            }
        }
    }

    public String toString() {
        return this.f15169a.toString();
    }
}
