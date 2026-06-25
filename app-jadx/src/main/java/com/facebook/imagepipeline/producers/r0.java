package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class r0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f36286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36287b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f36290e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue f36289d = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36288c = 0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a extends AbstractC3199t {

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.r0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class RunnableC0608a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Pair f36292a;

            RunnableC0608a(Pair pair) {
                this.f36292a = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                r0 r0Var = r0.this;
                Pair pair = this.f36292a;
                r0Var.g((InterfaceC3194n) pair.first, (e0) pair.second);
            }
        }

        private void q() {
            Pair pair;
            synchronized (r0.this) {
                try {
                    pair = (Pair) r0.this.f36289d.poll();
                    if (pair == null) {
                        r0 r0Var = r0.this;
                        r0Var.f36288c--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pair != null) {
                r0.this.f36290e.execute(new RunnableC0608a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3199t, com.facebook.imagepipeline.producers.AbstractC3183c
        protected void g() {
            p().b();
            q();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3199t, com.facebook.imagepipeline.producers.AbstractC3183c
        protected void h(Throwable th2) {
            p().a(th2);
            q();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        protected void i(Object obj, int i10) {
            p().c(obj, i10);
            if (AbstractC3183c.e(i10)) {
                q();
            }
        }

        private a(InterfaceC3194n interfaceC3194n) {
            super(interfaceC3194n);
        }
    }

    public r0(int i10, Executor executor, d0 d0Var) {
        this.f36287b = i10;
        this.f36290e = (Executor) y5.k.g(executor);
        this.f36286a = (d0) y5.k.g(d0Var);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        boolean z10;
        e0Var.m().d(e0Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i10 = this.f36288c;
                z10 = true;
                if (i10 >= this.f36287b) {
                    this.f36289d.add(Pair.create(interfaceC3194n, e0Var));
                } else {
                    this.f36288c = i10 + 1;
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return;
        }
        g(interfaceC3194n, e0Var);
    }

    void g(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        e0Var.m().j(e0Var, "ThrottlingProducer", null);
        this.f36286a.a(new a(interfaceC3194n), e0Var);
    }
}
