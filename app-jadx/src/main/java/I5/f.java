package I5;

import java.util.List;
import w5.C6944a;
import y5.k;
import y5.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8826a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a extends I5.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f8827h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c f8828i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private c f8829j = null;

        /* JADX INFO: renamed from: I5.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private class C0119a implements e {
            @Override // I5.e
            public void a(c cVar) {
                if (cVar.b()) {
                    a.this.E(cVar);
                } else if (cVar.isFinished()) {
                    a.this.D(cVar);
                }
            }

            @Override // I5.e
            public void b(c cVar) {
                a.this.r(Math.max(a.this.d(), cVar.d()));
            }

            @Override // I5.e
            public void c(c cVar) {
                a.this.D(cVar);
            }

            private C0119a() {
            }

            @Override // I5.e
            public void d(c cVar) {
            }
        }

        public a() {
            if (G()) {
                return;
            }
            o(new RuntimeException("No data source supplier or supplier returned null."));
        }

        private synchronized c A() {
            return this.f8829j;
        }

        private synchronized n B() {
            if (j() || this.f8827h >= f.this.f8826a.size()) {
                return null;
            }
            List list = f.this.f8826a;
            int i10 = this.f8827h;
            this.f8827h = i10 + 1;
            return (n) list.get(i10);
        }

        private void C(c cVar, boolean z10) {
            c cVar2;
            synchronized (this) {
                if (cVar == this.f8828i && cVar != (cVar2 = this.f8829j)) {
                    if (cVar2 == null || z10) {
                        this.f8829j = cVar;
                    } else {
                        cVar2 = null;
                    }
                    z(cVar2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D(c cVar) {
            if (y(cVar)) {
                if (cVar != A()) {
                    z(cVar);
                }
                if (G()) {
                    return;
                }
                p(cVar.c(), cVar.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(c cVar) {
            C(cVar, cVar.isFinished());
            if (cVar == A()) {
                t(null, cVar.isFinished(), cVar.getExtras());
            }
        }

        private synchronized boolean F(c cVar) {
            if (j()) {
                return false;
            }
            this.f8828i = cVar;
            return true;
        }

        private boolean G() {
            n nVarB = B();
            c cVar = nVarB != null ? (c) nVarB.get() : null;
            if (!F(cVar) || cVar == null) {
                z(cVar);
                return false;
            }
            cVar.f(new C0119a(), C6944a.b());
            return true;
        }

        private synchronized boolean y(c cVar) {
            if (!j() && cVar == this.f8828i) {
                this.f8828i = null;
                return true;
            }
            return false;
        }

        private void z(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        @Override // I5.a, I5.c
        public synchronized Object a() {
            c cVarA;
            cVarA = A();
            return cVarA != null ? cVarA.a() : null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
        @Override // I5.a, I5.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public synchronized boolean b() {
            /*
                r1 = this;
                monitor-enter(r1)
                I5.c r0 = r1.A()     // Catch: java.lang.Throwable -> Lf
                if (r0 == 0) goto L11
                boolean r0 = r0.b()     // Catch: java.lang.Throwable -> Lf
                if (r0 == 0) goto L11
                r0 = 1
                goto L12
            Lf:
                r0 = move-exception
                goto L14
            L11:
                r0 = 0
            L12:
                monitor-exit(r1)
                return r0
            L14:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: I5.f.a.b():boolean");
        }

        @Override // I5.a, I5.c
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    c cVar = this.f8828i;
                    this.f8828i = null;
                    c cVar2 = this.f8829j;
                    this.f8829j = null;
                    z(cVar2);
                    z(cVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private f(List list) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f8826a = list;
    }

    public static f b(List list) {
        return new f(list);
    }

    @Override // y5.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return y5.i.a(this.f8826a, ((f) obj).f8826a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8826a.hashCode();
    }

    public String toString() {
        return y5.i.b(this).b("list", this.f8826a).toString();
    }
}
