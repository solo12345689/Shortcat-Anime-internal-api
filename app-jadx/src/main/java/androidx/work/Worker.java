package androidx.work;

import android.content.Context;
import androidx.work.c;
import com.google.common.util.concurrent.p;
import i4.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Worker extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f32643e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f32643e.q(Worker.this.o());
            } catch (Throwable th2) {
                Worker.this.f32643e.r(th2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f32645a;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f32645a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f32645a.q(Worker.this.p());
            } catch (Throwable th2) {
                this.f32645a.r(th2);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.c
    public p d() {
        androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        c().execute(new b(cVarU));
        return cVarU;
    }

    @Override // androidx.work.c
    public final p m() {
        this.f32643e = androidx.work.impl.utils.futures.c.u();
        c().execute(new a());
        return this.f32643e;
    }

    public abstract c.a o();

    public e p() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
