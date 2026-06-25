package cg;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class h implements com.google.common.util.concurrent.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.common.util.concurrent.p f33625a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3105b f33626a;

        public a(h hVar, InterfaceC3105b interfaceC3105b) {
            this.f33626a = interfaceC3105b;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            this.f33626a.a(new Exception(th2), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f33626a.a(null, obj);
        }
    }

    public h(com.google.common.util.concurrent.p pVar) {
        this.f33625a = pVar;
    }

    public h a(InterfaceC3105b interfaceC3105b, Executor executor) {
        com.google.common.util.concurrent.j.a(this, new a(this, interfaceC3105b), executor);
        return this;
    }

    public h b(com.google.common.util.concurrent.d dVar, Executor executor) {
        return new h(com.google.common.util.concurrent.j.f(this, dVar, executor));
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f33625a.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f33625a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f33625a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f33625a.isDone();
    }

    @Override // com.google.common.util.concurrent.p
    public void k(Runnable runnable, Executor executor) {
        this.f33625a.k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f33625a.get(j10, timeUnit);
    }
}
