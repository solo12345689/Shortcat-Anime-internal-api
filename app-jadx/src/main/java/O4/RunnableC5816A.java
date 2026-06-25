package o4;

import android.content.Context;
import android.os.Build;
import n4.C5745u;
import p4.InterfaceC5931b;

/* JADX INFO: renamed from: o4.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC5816A implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f54454g = i4.i.i("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f54455a = androidx.work.impl.utils.futures.c.u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f54456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final C5745u f54457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.work.c f54458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final i4.f f54459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final InterfaceC5931b f54460f;

    /* JADX INFO: renamed from: o4.A$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f54461a;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f54461a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (RunnableC5816A.this.f54455a.isCancelled()) {
                return;
            }
            try {
                i4.e eVar = (i4.e) this.f54461a.get();
                if (eVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + RunnableC5816A.this.f54457c.f53945c + ") but did not provide ForegroundInfo");
                }
                i4.i.e().a(RunnableC5816A.f54454g, "Updating notification for " + RunnableC5816A.this.f54457c.f53945c);
                RunnableC5816A runnableC5816A = RunnableC5816A.this;
                runnableC5816A.f54455a.s(runnableC5816A.f54459e.a(runnableC5816A.f54456b, runnableC5816A.f54458d.f(), eVar));
            } catch (Throwable th2) {
                RunnableC5816A.this.f54455a.r(th2);
            }
        }
    }

    public RunnableC5816A(Context context, C5745u c5745u, androidx.work.c cVar, i4.f fVar, InterfaceC5931b interfaceC5931b) {
        this.f54456b = context;
        this.f54457c = c5745u;
        this.f54458d = cVar;
        this.f54459e = fVar;
        this.f54460f = interfaceC5931b;
    }

    public static /* synthetic */ void a(RunnableC5816A runnableC5816A, androidx.work.impl.utils.futures.c cVar) {
        if (runnableC5816A.f54455a.isCancelled()) {
            cVar.cancel(true);
        } else {
            cVar.s(runnableC5816A.f54458d.d());
        }
    }

    public com.google.common.util.concurrent.p b() {
        return this.f54455a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f54457c.f53959q || Build.VERSION.SDK_INT >= 31) {
            this.f54455a.q(null);
            return;
        }
        final androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        this.f54460f.a().execute(new Runnable() { // from class: o4.z
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC5816A.a(this.f54520a, cVarU);
            }
        });
        cVarU.k(new a(cVarU), this.f54460f.a());
    }
}
