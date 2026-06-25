package androidx.work.impl.workers;

import Td.L;
import Ud.AbstractC2279u;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.E;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.p;
import i4.i;
import java.util.List;
import k4.InterfaceC5447c;
import k4.e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import m4.n;
import n4.C5745u;
import n4.InterfaceC5746v;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u001d\u0010\u0014\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR8\u0010$\u001a&\u0012\f\u0012\n !*\u0004\u0018\u00010\r0\r !*\u0012\u0012\f\u0012\n !*\u0004\u0018\u00010\r0\r\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010*\u001a\u0004\u0018\u00010\u00012\b\u0010%\u001a\u0004\u0018\u00010\u00018G@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/c;", "Lk4/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "LTd/L;", "q", "()V", "Lcom/google/common/util/concurrent/p;", "Landroidx/work/c$a;", "m", "()Lcom/google/common/util/concurrent/p;", "k", "", "Ln4/u;", "workSpecs", "e", "(Ljava/util/List;)V", "b", "Landroidx/work/WorkerParameters;", "", "f", "Ljava/lang/Object;", "lock", "", "g", "Z", "areConstraintsUnmet", "Landroidx/work/impl/utils/futures/c;", "kotlin.jvm.PlatformType", "h", "Landroidx/work/impl/utils/futures/c;", "future", "<set-?>", "i", "Landroidx/work/c;", "getDelegate", "()Landroidx/work/c;", "delegate", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConstraintTrackingWorker extends c implements InterfaceC5447c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters workerParameters;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private volatile boolean areConstraintsUnmet;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.impl.utils.futures.c future;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private c delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
        this.lock = new Object();
        this.future = androidx.work.impl.utils.futures.c.u();
    }

    private final void q() {
        if (this.future.isCancelled()) {
            return;
        }
        String strM = g().m("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        i iVarE = i.e();
        AbstractC5504s.g(iVarE, "get()");
        if (strM == null || strM.length() == 0) {
            iVarE.c(q4.c.f57086a, "No worker to delegate to.");
            androidx.work.impl.utils.futures.c future = this.future;
            AbstractC5504s.g(future, "future");
            q4.c.d(future);
            return;
        }
        c cVarB = h().b(a(), strM, this.workerParameters);
        this.delegate = cVarB;
        if (cVarB == null) {
            iVarE.a(q4.c.f57086a, "No worker to delegate to.");
            androidx.work.impl.utils.futures.c future2 = this.future;
            AbstractC5504s.g(future2, "future");
            q4.c.d(future2);
            return;
        }
        E eQ = E.q(a());
        AbstractC5504s.g(eQ, "getInstance(applicationContext)");
        InterfaceC5746v interfaceC5746vJ = eQ.v().J();
        String string = f().toString();
        AbstractC5504s.g(string, "id.toString()");
        C5745u c5745uH = interfaceC5746vJ.h(string);
        if (c5745uH == null) {
            androidx.work.impl.utils.futures.c future3 = this.future;
            AbstractC5504s.g(future3, "future");
            q4.c.d(future3);
            return;
        }
        n nVarU = eQ.u();
        AbstractC5504s.g(nVarU, "workManagerImpl.trackers");
        e eVar = new e(nVarU, this);
        eVar.a(AbstractC2279u.e(c5745uH));
        String string2 = f().toString();
        AbstractC5504s.g(string2, "id.toString()");
        if (!eVar.d(string2)) {
            iVarE.a(q4.c.f57086a, "Constraints not met for delegate " + strM + ". Requesting retry.");
            androidx.work.impl.utils.futures.c future4 = this.future;
            AbstractC5504s.g(future4, "future");
            q4.c.e(future4);
            return;
        }
        iVarE.a(q4.c.f57086a, "Constraints met for delegate " + strM);
        try {
            c cVar = this.delegate;
            AbstractC5504s.e(cVar);
            final p pVarM = cVar.m();
            AbstractC5504s.g(pVarM, "delegate!!.startWork()");
            pVarM.k(new Runnable() { // from class: q4.b
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintTrackingWorker.r(this.f57084a, pVarM);
                }
            }, c());
        } catch (Throwable th2) {
            iVarE.b(q4.c.f57086a, "Delegated worker " + strM + " threw exception in startWork.", th2);
            synchronized (this.lock) {
                try {
                    if (!this.areConstraintsUnmet) {
                        androidx.work.impl.utils.futures.c future5 = this.future;
                        AbstractC5504s.g(future5, "future");
                        q4.c.d(future5);
                    } else {
                        iVarE.a(q4.c.f57086a, "Constraints were unmet, Retrying.");
                        androidx.work.impl.utils.futures.c future6 = this.future;
                        AbstractC5504s.g(future6, "future");
                        q4.c.e(future6);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(ConstraintTrackingWorker this$0, p innerFuture) {
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(innerFuture, "$innerFuture");
        synchronized (this$0.lock) {
            try {
                if (this$0.areConstraintsUnmet) {
                    androidx.work.impl.utils.futures.c future = this$0.future;
                    AbstractC5504s.g(future, "future");
                    q4.c.e(future);
                } else {
                    this$0.future.s(innerFuture);
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(ConstraintTrackingWorker this$0) {
        AbstractC5504s.h(this$0, "this$0");
        this$0.q();
    }

    @Override // k4.InterfaceC5447c
    public void b(List workSpecs) {
        AbstractC5504s.h(workSpecs, "workSpecs");
        i.e().a(q4.c.f57086a, "Constraints changed for " + workSpecs);
        synchronized (this.lock) {
            this.areConstraintsUnmet = true;
            L l10 = L.f17438a;
        }
    }

    @Override // k4.InterfaceC5447c
    public void e(List workSpecs) {
        AbstractC5504s.h(workSpecs, "workSpecs");
    }

    @Override // androidx.work.c
    public void k() {
        super.k();
        c cVar = this.delegate;
        if (cVar == null || cVar.i()) {
            return;
        }
        cVar.n();
    }

    @Override // androidx.work.c
    public p m() {
        c().execute(new Runnable() { // from class: q4.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.s(this.f57083a);
            }
        });
        androidx.work.impl.utils.futures.c future = this.future;
        AbstractC5504s.g(future, "future");
        return future;
    }
}
