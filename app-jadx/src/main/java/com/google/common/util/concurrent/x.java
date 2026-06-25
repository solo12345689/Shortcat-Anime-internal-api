package com.google.common.util.concurrent;

import com.google.common.util.concurrent.f;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class x extends f.a implements RunnableFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile n f43184h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Callable f43185c;

        a(Callable callable) {
            this.f43185c = (Callable) O9.n.j(callable);
        }

        @Override // com.google.common.util.concurrent.n
        void a(Throwable th2) {
            x.this.G(th2);
        }

        @Override // com.google.common.util.concurrent.n
        void b(Object obj) {
            x.this.F(obj);
        }

        @Override // com.google.common.util.concurrent.n
        final boolean d() {
            return x.this.isDone();
        }

        @Override // com.google.common.util.concurrent.n
        Object e() {
            return this.f43185c.call();
        }

        @Override // com.google.common.util.concurrent.n
        String f() {
            return this.f43185c.toString();
        }
    }

    x(Callable callable) {
        this.f43184h = new a(callable);
    }

    static x J(Runnable runnable, Object obj) {
        return new x(Executors.callable(runnable, obj));
    }

    static x K(Callable callable) {
        return new x(callable);
    }

    @Override // com.google.common.util.concurrent.a
    protected String C() {
        n nVar = this.f43184h;
        if (nVar == null) {
            return super.C();
        }
        return "task=[" + nVar + "]";
    }

    @Override // com.google.common.util.concurrent.a
    protected void q() {
        n nVar;
        super.q();
        if (I() && (nVar = this.f43184h) != null) {
            nVar.c();
        }
        this.f43184h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        n nVar = this.f43184h;
        if (nVar != null) {
            nVar.run();
        }
        this.f43184h = null;
    }
}
