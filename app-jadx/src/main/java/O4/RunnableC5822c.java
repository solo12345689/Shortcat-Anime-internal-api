package o4;

import android.text.TextUtils;
import androidx.work.impl.E;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import i4.l;
import java.util.List;

/* JADX INFO: renamed from: o4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC5822c implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f54491c = i4.i.i("EnqueueRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.x f54492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.o f54493b;

    public RunnableC5822c(androidx.work.impl.x xVar) {
        this(xVar, new androidx.work.impl.o());
    }

    private static boolean b(androidx.work.impl.x xVar) {
        boolean zC = c(xVar.g(), xVar.f(), (String[]) androidx.work.impl.x.l(xVar).toArray(new String[0]), xVar.d(), xVar.b());
        xVar.k();
        return zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(androidx.work.impl.E r18, java.util.List r19, java.lang.String[] r20, java.lang.String r21, i4.d r22) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.RunnableC5822c.c(androidx.work.impl.E, java.util.List, java.lang.String[], java.lang.String, i4.d):boolean");
    }

    private static boolean e(androidx.work.impl.x xVar) {
        List<androidx.work.impl.x> listE = xVar.e();
        boolean zE = false;
        if (listE != null) {
            for (androidx.work.impl.x xVar2 : listE) {
                if (xVar2.j()) {
                    i4.i.e().k(f54491c, "Already enqueued work ids (" + TextUtils.join(", ", xVar2.c()) + ")");
                } else {
                    zE |= e(xVar2);
                }
            }
        }
        return b(xVar) | zE;
    }

    public boolean a() {
        WorkDatabase workDatabaseV = this.f54492a.g().v();
        workDatabaseV.e();
        try {
            boolean zE = e(this.f54492a);
            workDatabaseV.B();
            return zE;
        } finally {
            workDatabaseV.i();
        }
    }

    public i4.l d() {
        return this.f54493b;
    }

    public void f() {
        E eG = this.f54492a.g();
        androidx.work.impl.u.b(eG.o(), eG.v(), eG.t());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f54492a.h()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.f54492a + ")");
            }
            if (a()) {
                p.a(this.f54492a.g().n(), RescheduleReceiver.class, true);
                f();
            }
            this.f54493b.a(i4.l.f48678a);
        } catch (Throwable th2) {
            this.f54493b.a(new l.b.a(th2));
        }
    }

    public RunnableC5822c(androidx.work.impl.x xVar, androidx.work.impl.o oVar) {
        this.f54492a = xVar;
        this.f54493b = oVar;
    }
}
