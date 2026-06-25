package com.google.common.util.concurrent;

import com.google.common.util.concurrent.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class c extends f.a implements Runnable {

    /* JADX INFO: renamed from: h */
    p f43162h;

    /* JADX INFO: renamed from: i */
    Object f43163i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends c {
        a(p pVar, d dVar) {
            super(pVar, dVar);
        }

        @Override // com.google.common.util.concurrent.c
        /* JADX INFO: renamed from: M */
        public p K(d dVar, Object obj) {
            p pVarApply = dVar.apply(obj);
            O9.n.l(pVarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", dVar);
            return pVarApply;
        }

        @Override // com.google.common.util.concurrent.c
        /* JADX INFO: renamed from: N */
        public void L(p pVar) {
            H(pVar);
        }
    }

    c(p pVar, Object obj) {
        this.f43162h = (p) O9.n.j(pVar);
        this.f43163i = O9.n.j(obj);
    }

    static p J(p pVar, d dVar, Executor executor) {
        O9.n.j(executor);
        a aVar = new a(pVar, dVar);
        pVar.k(aVar, s.c(executor, aVar));
        return aVar;
    }

    @Override // com.google.common.util.concurrent.a
    protected String C() {
        String str;
        p pVar = this.f43162h;
        Object obj = this.f43163i;
        String strC = super.C();
        if (pVar != null) {
            str = "inputFuture=[" + pVar + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        }
        if (strC == null) {
            return null;
        }
        return str + strC;
    }

    abstract Object K(Object obj, Object obj2);

    abstract void L(Object obj);

    @Override // com.google.common.util.concurrent.a
    protected final void q() {
        B(this.f43162h);
        this.f43162h = null;
        this.f43163i = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f43162h;
        Object obj = this.f43163i;
        if ((isCancelled() | (pVar == null)) || (obj == null)) {
            return;
        }
        this.f43162h = null;
        if (pVar.isCancelled()) {
            H(pVar);
            return;
        }
        try {
            try {
                Object objK = K(obj, j.b(pVar));
                this.f43163i = null;
                L(objK);
            } catch (Throwable th2) {
                try {
                    v.a(th2);
                    G(th2);
                } finally {
                    this.f43163i = null;
                }
            }
        } catch (Error e10) {
            G(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            G(e11.getCause());
        } catch (Exception e12) {
            G(e12);
        }
    }
}
