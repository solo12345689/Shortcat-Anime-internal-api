package androidx.concurrent.futures;

import com.google.common.util.concurrent.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f27929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d f27930c = androidx.concurrent.futures.d.B();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f27931d;

        a() {
        }

        private void d() {
            this.f27928a = null;
            this.f27929b = null;
            this.f27930c = null;
        }

        void a() {
            this.f27928a = null;
            this.f27929b = null;
            this.f27930c.x(null);
        }

        public boolean b(Object obj) {
            this.f27931d = true;
            d dVar = this.f27929b;
            boolean z10 = dVar != null && dVar.b(obj);
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean c() {
            this.f27931d = true;
            d dVar = this.f27929b;
            boolean z10 = dVar != null && dVar.a(true);
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean e(Throwable th2) {
            this.f27931d = true;
            d dVar = this.f27929b;
            boolean z10 = dVar != null && dVar.c(th2);
            if (z10) {
                d();
            }
            return z10;
        }

        protected void finalize() {
            androidx.concurrent.futures.d dVar;
            d dVar2 = this.f27929b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f27928a));
            }
            if (this.f27931d || (dVar = this.f27930c) == null) {
                return;
            }
            dVar.x(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0486c {
        Object a(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference f27932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a f27933b = new a();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String u() {
                a aVar = (a) d.this.f27932a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f27928a + "]";
            }
        }

        d(a aVar) {
            this.f27932a = new WeakReference(aVar);
        }

        boolean a(boolean z10) {
            return this.f27933b.cancel(z10);
        }

        boolean b(Object obj) {
            return this.f27933b.x(obj);
        }

        boolean c(Throwable th2) {
            return this.f27933b.y(th2);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a aVar = (a) this.f27932a.get();
            boolean zCancel = this.f27933b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.a();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f27933b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f27933b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f27933b.isDone();
        }

        @Override // com.google.common.util.concurrent.p
        public void k(Runnable runnable, Executor executor) {
            this.f27933b.k(runnable, executor);
        }

        public String toString() {
            return this.f27933b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            return this.f27933b.get(j10, timeUnit);
        }
    }

    public static p a(InterfaceC0486c interfaceC0486c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f27929b = dVar;
        aVar.f27928a = interfaceC0486c.getClass();
        try {
            Object objA = interfaceC0486c.a(aVar);
            if (objA == null) {
                return dVar;
            }
            aVar.f27928a = objA;
            return dVar;
        } catch (Exception e10) {
            dVar.c(e10);
            return dVar;
        }
    }
}
