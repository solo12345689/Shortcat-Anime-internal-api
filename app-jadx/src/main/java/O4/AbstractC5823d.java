package o4;

import android.os.Build;
import androidx.work.b;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import n4.C5745u;

/* JADX INFO: renamed from: o4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5823d {
    public static final C5745u a(C5745u workSpec) throws Throwable {
        AbstractC5504s.h(workSpec, "workSpec");
        i4.b bVar = workSpec.f53952j;
        String str = workSpec.f53945c;
        if (AbstractC5504s.c(str, ConstraintTrackingWorker.class.getName()) || !(bVar.f() || bVar.i())) {
            return workSpec;
        }
        androidx.work.b bVarA = new b.a().c(workSpec.f53947e).g("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
        AbstractC5504s.g(bVarA, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        AbstractC5504s.g(name, "name");
        return C5745u.e(workSpec, null, null, name, null, bVarA, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048555, null);
    }

    public static final C5745u b(List schedulers, C5745u workSpec) {
        AbstractC5504s.h(schedulers, "schedulers");
        AbstractC5504s.h(workSpec, "workSpec");
        return Build.VERSION.SDK_INT < 26 ? a(workSpec) : workSpec;
    }
}
