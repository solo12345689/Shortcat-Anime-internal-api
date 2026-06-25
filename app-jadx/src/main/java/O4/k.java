package o4;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f54498a;

    public k(WorkDatabase workDatabase) {
        AbstractC5504s.h(workDatabase, "workDatabase");
        this.f54498a = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer d(k this$0) {
        AbstractC5504s.h(this$0, "this$0");
        return Integer.valueOf(l.d(this$0.f54498a, "next_alarm_manager_id"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer f(k this$0, int i10, int i11) {
        AbstractC5504s.h(this$0, "this$0");
        int iD = l.d(this$0.f54498a, "next_job_scheduler_id");
        if (i10 > iD || iD > i11) {
            l.e(this$0.f54498a, "next_job_scheduler_id", i10 + 1);
        } else {
            i10 = iD;
        }
        return Integer.valueOf(i10);
    }

    public final int c() {
        Object objZ = this.f54498a.z(new Callable() { // from class: o4.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k.d(this.f54494a);
            }
        });
        AbstractC5504s.g(objZ, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) objZ).intValue();
    }

    public final int e(final int i10, final int i11) {
        Object objZ = this.f54498a.z(new Callable() { // from class: o4.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k.f(this.f54495a, i10, i11);
            }
        });
        AbstractC5504s.g(objZ, "workDatabase.runInTransa…            id\n        })");
        return ((Number) objZ).intValue();
    }
}
