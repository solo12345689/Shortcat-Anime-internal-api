package I5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import w5.C6944a;
import y5.k;
import y5.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8833b;

    private h(List list, boolean z10) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f8832a = list;
        this.f8833b = z10;
    }

    public static h c(List list, boolean z10) {
        return new h(list, z10);
    }

    @Override // y5.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return y5.i.a(this.f8832a, ((h) obj).f8832a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8832a.hashCode();
    }

    public String toString() {
        return y5.i.b(this).b("list", this.f8832a).toString();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a extends I5.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ArrayList f8834h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f8835i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f8836j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private AtomicInteger f8837k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Throwable f8838l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Map f8839m;

        public a() {
            if (h.this.f8833b) {
                return;
            }
            z();
        }

        private synchronized c A(int i10) {
            c cVar;
            ArrayList arrayList = this.f8834h;
            cVar = null;
            if (arrayList != null && i10 < arrayList.size()) {
                cVar = (c) this.f8834h.set(i10, null);
            }
            return cVar;
        }

        private synchronized c B(int i10) {
            ArrayList arrayList;
            arrayList = this.f8834h;
            return (arrayList == null || i10 >= arrayList.size()) ? null : (c) this.f8834h.get(i10);
        }

        private synchronized c C() {
            return B(this.f8835i);
        }

        private void D() {
            Throwable th2;
            if (this.f8837k.incrementAndGet() != this.f8836j || (th2 = this.f8838l) == null) {
                return;
            }
            p(th2, this.f8839m);
        }

        private void E(int i10, c cVar, boolean z10) {
            synchronized (this) {
                try {
                    int i11 = this.f8835i;
                    if (cVar == B(i10) && i10 != this.f8835i) {
                        if (C() == null || (z10 && i10 < this.f8835i)) {
                            this.f8835i = i10;
                        } else {
                            i10 = i11;
                        }
                        while (i11 > i10) {
                            y(A(i11));
                            i11--;
                        }
                    }
                } finally {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F(int i10, c cVar) {
            y(H(i10, cVar));
            if (i10 == 0) {
                this.f8838l = cVar.c();
                this.f8839m = cVar.getExtras();
            }
            D();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G(int i10, c cVar) {
            E(i10, cVar, cVar.isFinished());
            if (cVar == C()) {
                t(null, i10 == 0 && cVar.isFinished(), cVar.getExtras());
            }
            D();
        }

        private synchronized c H(int i10, c cVar) {
            if (cVar == C()) {
                return null;
            }
            if (cVar != B(i10)) {
                return cVar;
            }
            return A(i10);
        }

        private void y(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private void z() {
            if (this.f8837k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f8837k == null) {
                        this.f8837k = new AtomicInteger(0);
                        int size = h.this.f8832a.size();
                        this.f8836j = size;
                        this.f8835i = size;
                        this.f8834h = new ArrayList(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            c cVar = (c) ((n) h.this.f8832a.get(i10)).get();
                            this.f8834h.add(cVar);
                            cVar.f(new C0120a(i10), C6944a.b());
                            if (!cVar.b()) {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        @Override // I5.a, I5.c
        public synchronized Object a() {
            c cVarC;
            try {
                if (h.this.f8833b) {
                    z();
                }
                cVarC = C();
            } catch (Throwable th2) {
                throw th2;
            }
            return cVarC != null ? cVarC.a() : null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
        @Override // I5.a, I5.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public synchronized boolean b() {
            /*
                r1 = this;
                monitor-enter(r1)
                I5.h r0 = I5.h.this     // Catch: java.lang.Throwable -> Ld
                boolean r0 = I5.h.a(r0)     // Catch: java.lang.Throwable -> Ld
                if (r0 == 0) goto Lf
                r1.z()     // Catch: java.lang.Throwable -> Ld
                goto Lf
            Ld:
                r0 = move-exception
                goto L20
            Lf:
                I5.c r0 = r1.C()     // Catch: java.lang.Throwable -> Ld
                if (r0 == 0) goto L1d
                boolean r0 = r0.b()     // Catch: java.lang.Throwable -> Ld
                if (r0 == 0) goto L1d
                r0 = 1
                goto L1e
            L1d:
                r0 = 0
            L1e:
                monitor-exit(r1)
                return r0
            L20:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: I5.h.a.b():boolean");
        }

        @Override // I5.a, I5.c
        public boolean close() {
            if (h.this.f8833b) {
                z();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList arrayList = this.f8834h;
                    this.f8834h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        y((c) arrayList.get(i10));
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: I5.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private class C0120a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f8841a;

            public C0120a(int i10) {
                this.f8841a = i10;
            }

            @Override // I5.e
            public void a(c cVar) {
                if (cVar.b()) {
                    a.this.G(this.f8841a, cVar);
                } else if (cVar.isFinished()) {
                    a.this.F(this.f8841a, cVar);
                }
            }

            @Override // I5.e
            public void b(c cVar) {
                if (this.f8841a == 0) {
                    a.this.r(cVar.d());
                }
            }

            @Override // I5.e
            public void c(c cVar) {
                a.this.F(this.f8841a, cVar);
            }

            @Override // I5.e
            public void d(c cVar) {
            }
        }
    }
}
