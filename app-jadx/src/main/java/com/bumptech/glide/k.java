package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import f5.C4776c;
import h5.InterfaceC4905b;
import h5.InterfaceC4906c;
import h5.p;
import h5.q;
import h5.s;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k5.InterfaceC5451c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class k implements ComponentCallbacks2, h5.l {

    /* JADX INFO: renamed from: m */
    private static final k5.f f35653m = (k5.f) k5.f.i0(Bitmap.class).Q();

    /* JADX INFO: renamed from: n */
    private static final k5.f f35654n = (k5.f) k5.f.i0(C4776c.class).Q();

    /* JADX INFO: renamed from: o */
    private static final k5.f f35655o = (k5.f) ((k5.f) k5.f.j0(U4.j.f19227c).U(g.LOW)).c0(true);

    /* JADX INFO: renamed from: a */
    protected final com.bumptech.glide.b f35656a;

    /* JADX INFO: renamed from: b */
    protected final Context f35657b;

    /* JADX INFO: renamed from: c */
    final h5.j f35658c;

    /* JADX INFO: renamed from: d */
    private final q f35659d;

    /* JADX INFO: renamed from: e */
    private final p f35660e;

    /* JADX INFO: renamed from: f */
    private final s f35661f;

    /* JADX INFO: renamed from: g */
    private final Runnable f35662g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC4905b f35663h;

    /* JADX INFO: renamed from: i */
    private final CopyOnWriteArrayList f35664i;

    /* JADX INFO: renamed from: j */
    private k5.f f35665j;

    /* JADX INFO: renamed from: k */
    private boolean f35666k;

    /* JADX INFO: renamed from: l */
    private boolean f35667l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.f35658c.b(kVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements InterfaceC4905b.a {

        /* JADX INFO: renamed from: a */
        private final q f35669a;

        b(q qVar) {
            this.f35669a = qVar;
        }

        @Override // h5.InterfaceC4905b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (k.this) {
                    this.f35669a.e();
                }
            }
        }
    }

    public k(com.bumptech.glide.b bVar, h5.j jVar, p pVar, Context context) {
        this(bVar, jVar, pVar, new q(), bVar.h(), context);
    }

    private void C(l5.d dVar) {
        boolean zB = B(dVar);
        InterfaceC5451c interfaceC5451cC = dVar.c();
        if (zB || this.f35656a.q(dVar) || interfaceC5451cC == null) {
            return;
        }
        dVar.j(null);
        interfaceC5451cC.clear();
    }

    private synchronized void q() {
        try {
            Iterator it = this.f35661f.g().iterator();
            while (it.hasNext()) {
                p((l5.d) it.next());
            }
            this.f35661f.e();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void A(l5.d dVar, InterfaceC5451c interfaceC5451c) {
        this.f35661f.k(dVar);
        this.f35659d.g(interfaceC5451c);
    }

    synchronized boolean B(l5.d dVar) {
        InterfaceC5451c interfaceC5451cC = dVar.c();
        if (interfaceC5451cC == null) {
            return true;
        }
        if (!this.f35659d.a(interfaceC5451cC)) {
            return false;
        }
        this.f35661f.o(dVar);
        dVar.j(null);
        return true;
    }

    @Override // h5.l
    public synchronized void a() {
        try {
            this.f35661f.a();
            if (this.f35667l) {
                q();
            } else {
                x();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // h5.l
    public synchronized void b() {
        y();
        this.f35661f.b();
    }

    @Override // h5.l
    public synchronized void d() {
        this.f35661f.d();
        q();
        this.f35659d.b();
        this.f35658c.a(this);
        this.f35658c.a(this.f35663h);
        o5.l.x(this.f35662g);
        this.f35656a.t(this);
    }

    public j e(Class cls) {
        return new j(this.f35656a, this, cls, this.f35657b);
    }

    public j g() {
        return e(Bitmap.class).a(f35653m);
    }

    public j k() {
        return e(Drawable.class);
    }

    public j o() {
        return e(File.class).a(k5.f.l0(true));
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f35666k) {
            w();
        }
    }

    public void p(l5.d dVar) {
        if (dVar == null) {
            return;
        }
        C(dVar);
    }

    List r() {
        return this.f35664i;
    }

    synchronized k5.f s() {
        return this.f35665j;
    }

    l t(Class cls) {
        return this.f35656a.j().d(cls);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f35659d + ", treeNode=" + this.f35660e + "}";
    }

    public j u(Object obj) {
        return k().v0(obj);
    }

    public synchronized void v() {
        this.f35659d.c();
    }

    public synchronized void w() {
        v();
        Iterator it = this.f35660e.a().iterator();
        while (it.hasNext()) {
            ((k) it.next()).v();
        }
    }

    public synchronized void x() {
        this.f35659d.d();
    }

    public synchronized void y() {
        this.f35659d.f();
    }

    protected synchronized void z(k5.f fVar) {
        this.f35665j = (k5.f) ((k5.f) fVar.clone()).c();
    }

    k(com.bumptech.glide.b bVar, h5.j jVar, p pVar, q qVar, InterfaceC4906c interfaceC4906c, Context context) {
        this.f35661f = new s();
        a aVar = new a();
        this.f35662g = aVar;
        this.f35656a = bVar;
        this.f35658c = jVar;
        this.f35660e = pVar;
        this.f35659d = qVar;
        this.f35657b = context;
        InterfaceC4905b interfaceC4905bA = interfaceC4906c.a(context.getApplicationContext(), new b(qVar));
        this.f35663h = interfaceC4905bA;
        bVar.p(this);
        if (o5.l.r()) {
            o5.l.w(aVar);
        } else {
            jVar.b(this);
        }
        jVar.b(interfaceC4905bA);
        this.f35664i = new CopyOnWriteArrayList(bVar.j().b());
        z(bVar.j().c());
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
