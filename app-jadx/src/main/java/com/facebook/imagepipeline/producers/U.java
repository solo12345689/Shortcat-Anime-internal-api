package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class U implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f36106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f36107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f36109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f36110e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f36111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CopyOnWriteArraySet f36112b = y5.m.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Closeable f36113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f36114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f36115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private C3185e f36116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b f36117g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.U$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0604a extends AbstractC3186f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Pair f36119a;

            C0604a(Pair pair) {
                this.f36119a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3186f, com.facebook.imagepipeline.producers.f0
            public void a() {
                C3185e.d(a.this.r());
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void b() {
                boolean zRemove;
                List list;
                C3185e c3185e;
                List listT;
                List listR;
                synchronized (a.this) {
                    try {
                        zRemove = a.this.f36112b.remove(this.f36119a);
                        list = null;
                        if (!zRemove) {
                            c3185e = null;
                            listT = null;
                        } else if (a.this.f36112b.isEmpty()) {
                            c3185e = a.this.f36116f;
                            listT = null;
                        } else {
                            List listS = a.this.s();
                            listT = a.this.t();
                            listR = a.this.r();
                            c3185e = null;
                            list = listS;
                        }
                        listR = listT;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C3185e.e(list);
                C3185e.f(listT);
                C3185e.d(listR);
                if (c3185e != null) {
                    if (!U.this.f36108c || c3185e.z()) {
                        c3185e.i();
                    } else {
                        C3185e.f(c3185e.s(y6.f.f64862b));
                    }
                }
                if (zRemove) {
                    ((InterfaceC3194n) this.f36119a.first).b();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3186f, com.facebook.imagepipeline.producers.f0
            public void c() {
                C3185e.f(a.this.t());
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3186f, com.facebook.imagepipeline.producers.f0
            public void d() {
                C3185e.e(a.this.s());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private class b extends AbstractC3183c {
            @Override // com.facebook.imagepipeline.producers.AbstractC3183c
            protected void g() {
                try {
                    if (L6.b.d()) {
                        L6.b.a("MultiplexProducer#onCancellation");
                    }
                    a.this.m(this);
                    if (L6.b.d()) {
                        L6.b.b();
                    }
                } catch (Throwable th2) {
                    if (L6.b.d()) {
                        L6.b.b();
                    }
                    throw th2;
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3183c
            protected void h(Throwable th2) {
                try {
                    if (L6.b.d()) {
                        L6.b.a("MultiplexProducer#onFailure");
                    }
                    a.this.n(this, th2);
                    if (L6.b.d()) {
                        L6.b.b();
                    }
                } catch (Throwable th3) {
                    if (L6.b.d()) {
                        L6.b.b();
                    }
                    throw th3;
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3183c
            protected void j(float f10) {
                try {
                    if (L6.b.d()) {
                        L6.b.a("MultiplexProducer#onProgressUpdate");
                    }
                    a.this.p(this, f10);
                    if (L6.b.d()) {
                        L6.b.b();
                    }
                } catch (Throwable th2) {
                    if (L6.b.d()) {
                        L6.b.b();
                    }
                    throw th2;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.producers.AbstractC3183c
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public void i(Closeable closeable, int i10) {
                try {
                    if (L6.b.d()) {
                        L6.b.a("MultiplexProducer#onNewResult");
                    }
                    a.this.o(this, closeable, i10);
                    if (L6.b.d()) {
                        L6.b.b();
                    }
                } catch (Throwable th2) {
                    if (L6.b.d()) {
                        L6.b.b();
                    }
                    throw th2;
                }
            }

            private b() {
            }
        }

        public a(Object obj) {
            this.f36111a = obj;
        }

        private void g(Pair pair, e0 e0Var) {
            e0Var.b(new C0604a(pair));
        }

        private void i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }

        private synchronized boolean j() {
            Iterator it = this.f36112b.iterator();
            while (it.hasNext()) {
                if (((e0) ((Pair) it.next()).second).o()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized boolean k() {
            Iterator it = this.f36112b.iterator();
            while (it.hasNext()) {
                if (!((e0) ((Pair) it.next()).second).z()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized y6.f l() {
            y6.f fVarB;
            fVarB = y6.f.f64862b;
            Iterator it = this.f36112b.iterator();
            while (it.hasNext()) {
                fVarB = y6.f.b(fVarB, ((e0) ((Pair) it.next()).second).D());
            }
            return fVarB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(G5.e eVar) {
            synchronized (this) {
                try {
                    y5.k.b(Boolean.valueOf(this.f36116f == null));
                    y5.k.b(Boolean.valueOf(this.f36117g == null));
                    if (this.f36112b.isEmpty()) {
                        U.this.k(this.f36111a, this);
                        return;
                    }
                    e0 e0Var = (e0) ((Pair) this.f36112b.iterator().next()).second;
                    C3185e c3185e = new C3185e(e0Var.q(), e0Var.getId(), e0Var.m(), e0Var.a(), e0Var.E(), k(), j(), l(), e0Var.g());
                    this.f36116f = c3185e;
                    c3185e.w(e0Var.getExtras());
                    if (eVar.b()) {
                        this.f36116f.k("started_as_prefetch", Boolean.valueOf(eVar.a()));
                    }
                    b bVar = new b();
                    this.f36117g = bVar;
                    U.this.f36107b.a(bVar, this.f36116f);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List r() {
            C3185e c3185e = this.f36116f;
            if (c3185e == null) {
                return null;
            }
            return c3185e.p(j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List s() {
            C3185e c3185e = this.f36116f;
            if (c3185e == null) {
                return null;
            }
            return c3185e.r(k());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List t() {
            C3185e c3185e = this.f36116f;
            if (c3185e == null) {
                return null;
            }
            return c3185e.s(l());
        }

        public boolean h(InterfaceC3194n interfaceC3194n, e0 e0Var) {
            Pair pairCreate = Pair.create(interfaceC3194n, e0Var);
            synchronized (this) {
                try {
                    if (U.this.i(this.f36111a) != this) {
                        return false;
                    }
                    this.f36112b.add(pairCreate);
                    List listS = s();
                    List listT = t();
                    List listR = r();
                    Closeable closeableG = this.f36113c;
                    float f10 = this.f36114d;
                    int i10 = this.f36115e;
                    C3185e.e(listS);
                    C3185e.f(listT);
                    C3185e.d(listR);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                if (closeableG != this.f36113c) {
                                    closeableG = null;
                                } else if (closeableG != null) {
                                    closeableG = U.this.g(closeableG);
                                }
                            }
                            if (closeableG != null) {
                                if (f10 > 0.0f) {
                                    interfaceC3194n.d(f10);
                                }
                                interfaceC3194n.c(closeableG, i10);
                                i(closeableG);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        } finally {
                        }
                    }
                    g(pairCreate, e0Var);
                    return true;
                } finally {
                }
            }
        }

        public void m(b bVar) {
            synchronized (this) {
                try {
                    if (this.f36117g != bVar) {
                        return;
                    }
                    this.f36117g = null;
                    this.f36116f = null;
                    i(this.f36113c);
                    this.f36113c = null;
                    q(G5.e.UNSET);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void n(b bVar, Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f36117g != bVar) {
                        return;
                    }
                    this.f36112b.clear();
                    U.this.k(this.f36111a, this);
                    i(this.f36113c);
                    this.f36113c = null;
                    for (Pair pair : this.f36112b) {
                        synchronized (pair) {
                            try {
                                ((e0) pair.second).m().k((e0) pair.second, U.this.f36109d, th2, null);
                                C3185e c3185e = this.f36116f;
                                if (c3185e != null) {
                                    ((e0) pair.second).w(c3185e.getExtras());
                                }
                                ((InterfaceC3194n) pair.first).a(th2);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void o(b bVar, Closeable closeable, int i10) {
            synchronized (this) {
                try {
                    if (this.f36117g != bVar) {
                        return;
                    }
                    i(this.f36113c);
                    this.f36113c = null;
                    int size = this.f36112b.size();
                    if (AbstractC3183c.f(i10)) {
                        this.f36113c = U.this.g(closeable);
                        this.f36115e = i10;
                    } else {
                        this.f36112b.clear();
                        U.this.k(this.f36111a, this);
                    }
                    for (Pair pair : this.f36112b) {
                        synchronized (pair) {
                            try {
                                if (AbstractC3183c.e(i10)) {
                                    ((e0) pair.second).m().j((e0) pair.second, U.this.f36109d, null);
                                    C3185e c3185e = this.f36116f;
                                    if (c3185e != null) {
                                        ((e0) pair.second).w(c3185e.getExtras());
                                    }
                                    ((e0) pair.second).k(U.this.f36110e, Integer.valueOf(size));
                                }
                                ((InterfaceC3194n) pair.first).c(closeable, i10);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void p(b bVar, float f10) {
            synchronized (this) {
                try {
                    if (this.f36117g != bVar) {
                        return;
                    }
                    this.f36114d = f10;
                    for (Pair pair : this.f36112b) {
                        synchronized (pair) {
                            ((InterfaceC3194n) pair.first).d(f10);
                        }
                    }
                } finally {
                }
            }
        }
    }

    protected U(d0 d0Var, String str, String str2) {
        this(d0Var, str, str2, false);
    }

    private synchronized a h(Object obj) {
        a aVar;
        aVar = new a(obj);
        this.f36106a.put(obj, aVar);
        return aVar;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        a aVarI;
        boolean z10;
        try {
            if (L6.b.d()) {
                L6.b.a("MultiplexProducer#produceResults");
            }
            e0Var.m().d(e0Var, this.f36109d);
            Object objJ = j(e0Var);
            do {
                synchronized (this) {
                    try {
                        aVarI = i(objJ);
                        if (aVarI == null) {
                            aVarI = h(objJ);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } finally {
                    }
                }
            } while (!aVarI.h(interfaceC3194n, e0Var));
            if (z10) {
                aVarI.q(G5.e.c(e0Var.z()));
            }
            if (L6.b.d()) {
                L6.b.b();
            }
        } catch (Throwable th2) {
            if (L6.b.d()) {
                L6.b.b();
            }
            throw th2;
        }
    }

    protected abstract Closeable g(Closeable closeable);

    protected synchronized a i(Object obj) {
        return (a) this.f36106a.get(obj);
    }

    protected abstract Object j(e0 e0Var);

    protected synchronized void k(Object obj, a aVar) {
        if (this.f36106a.get(obj) == aVar) {
            this.f36106a.remove(obj);
        }
    }

    protected U(d0 d0Var, String str, String str2, boolean z10) {
        this.f36107b = d0Var;
        this.f36106a = new HashMap();
        this.f36108c = z10;
        this.f36109d = str;
        this.f36110e = str2;
    }
}
