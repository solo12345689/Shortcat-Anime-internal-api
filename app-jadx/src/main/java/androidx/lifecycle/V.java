package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC5504s;
import o2.AbstractC5804c;
import o2.C5803b;
import o2.C5807f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C5807f f30206a = new C5807f();

    public static final Gf.O a(U u10) {
        C5803b c5803bA;
        AbstractC5504s.h(u10, "<this>");
        synchronized (f30206a) {
            c5803bA = (C5803b) u10.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c5803bA == null) {
                c5803bA = AbstractC5804c.a();
                u10.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c5803bA);
            }
        }
        return c5803bA;
    }
}
