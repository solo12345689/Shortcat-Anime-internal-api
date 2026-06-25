package x6;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import x6.n;
import x6.x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class w implements n, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n.b f63990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final m f63991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final m f63992c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final D f63994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x.a f63995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final y5.n f63996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected y f63997h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f63999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f64000k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map f63993d = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f63998i = SystemClock.uptimeMillis();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f64001a;

        a(D d10) {
            this.f64001a = d10;
        }

        @Override // x6.D
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(n.a aVar) {
            return w.this.f63999j ? aVar.f63980g : this.f64001a.a(aVar.f63975b.C());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements C5.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a f64003a;

        b(n.a aVar) {
            this.f64003a = aVar;
        }

        @Override // C5.h
        public void a(Object obj) {
            w.this.z(this.f64003a);
        }
    }

    public w(D d10, x.a aVar, y5.n nVar, n.b bVar, boolean z10, boolean z11) {
        this.f63994e = d10;
        this.f63991b = new m(B(d10));
        this.f63992c = new m(B(d10));
        this.f63995f = aVar;
        this.f63996g = nVar;
        this.f63997h = (y) y5.k.h((y) nVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f63990a = bVar;
        this.f63999j = z10;
        this.f64000k = z11;
    }

    private synchronized ArrayList A(int i10, int i11) {
        int iMax = Math.max(i10, 0);
        int iMax2 = Math.max(i11, 0);
        if (this.f63991b.c() <= iMax && this.f63991b.f() <= iMax2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.f63991b.c() <= iMax && this.f63991b.f() <= iMax2) {
                break;
            }
            Object objD = this.f63991b.d();
            if (objD != null) {
                this.f63991b.i(objD);
                arrayList.add((n.a) this.f63992c.i(objD));
            } else {
                if (!this.f64000k) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f63991b.c()), Integer.valueOf(this.f63991b.f())));
                }
                this.f63991b.k();
            }
        }
        return arrayList;
    }

    private D B(D d10) {
        return new a(d10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean j(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            x6.y r0 = r3.f63997h     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.f64009e     // Catch: java.lang.Throwable -> L1f
            if (r4 > r0) goto L21
            int r0 = r3.l()     // Catch: java.lang.Throwable -> L1f
            x6.y r1 = r3.f63997h     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.f64006b     // Catch: java.lang.Throwable -> L1f
            r2 = 1
            int r1 = r1 - r2
            if (r0 > r1) goto L21
            int r0 = r3.m()     // Catch: java.lang.Throwable -> L1f
            x6.y r1 = r3.f63997h     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.f64005a     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 - r4
            if (r0 > r1) goto L21
            goto L22
        L1f:
            r4 = move-exception
            goto L24
        L21:
            r2 = 0
        L22:
            monitor-exit(r3)
            return r2
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.w.j(int):boolean");
    }

    private synchronized void k(n.a aVar) {
        y5.k.g(aVar);
        y5.k.i(aVar.f63976c > 0);
        aVar.f63976c--;
    }

    private synchronized void n(n.a aVar) {
        y5.k.g(aVar);
        y5.k.i(!aVar.f63977d);
        aVar.f63976c++;
    }

    private synchronized void o(n.a aVar) {
        y5.k.g(aVar);
        y5.k.i(!aVar.f63977d);
        aVar.f63977d = true;
    }

    private synchronized void p(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o((n.a) it.next());
            }
        }
    }

    private synchronized boolean q(n.a aVar) {
        if (aVar.f63977d || aVar.f63976c != 0) {
            return false;
        }
        this.f63991b.h(aVar.f63974a, aVar);
        return true;
    }

    private void r(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5.a.m(y((n.a) it.next()));
            }
        }
    }

    private static void t(n.a aVar) {
        n.b bVar;
        if (aVar == null || (bVar = aVar.f63978e) == null) {
            return;
        }
        bVar.a(aVar.f63974a, true);
    }

    private void u(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v((n.a) it.next());
            }
        }
    }

    private static void v(n.a aVar) {
        n.b bVar;
        if (aVar == null || (bVar = aVar.f63978e) == null) {
            return;
        }
        bVar.a(aVar.f63974a, false);
    }

    private synchronized void w() {
        if (this.f63998i + this.f63997h.f64010f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f63998i = SystemClock.uptimeMillis();
        this.f63997h = (y) y5.k.h((y) this.f63996g.get(), "mMemoryCacheParamsSupplier returned null");
    }

    private synchronized C5.a x(n.a aVar) {
        n(aVar);
        return C5.a.S(aVar.f63975b.C(), new b(aVar));
    }

    private synchronized C5.a y(n.a aVar) {
        y5.k.g(aVar);
        return (aVar.f63977d && aVar.f63976c == 0) ? aVar.f63975b : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(n.a aVar) {
        boolean zQ;
        C5.a aVarY;
        y5.k.g(aVar);
        synchronized (this) {
            k(aVar);
            zQ = q(aVar);
            aVarY = y(aVar);
        }
        C5.a.m(aVarY);
        if (!zQ) {
            aVar = null;
        }
        t(aVar);
        w();
        s();
    }

    @Override // x6.x
    public void b(Object obj) {
        y5.k.g(obj);
        synchronized (this) {
            try {
                n.a aVar = (n.a) this.f63991b.i(obj);
                if (aVar != null) {
                    this.f63991b.h(obj, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x6.x
    public C5.a c(Object obj, C5.a aVar) {
        return d(obj, aVar, this.f63990a);
    }

    @Override // x6.x
    public synchronized boolean contains(Object obj) {
        return this.f63992c.a(obj);
    }

    @Override // x6.n
    public C5.a d(Object obj, C5.a aVar, n.b bVar) {
        n.a aVar2;
        C5.a aVarX;
        C5.a aVarY;
        y5.k.g(obj);
        y5.k.g(aVar);
        w();
        synchronized (this) {
            try {
                aVar2 = (n.a) this.f63991b.i(obj);
                n.a aVar3 = (n.a) this.f63992c.i(obj);
                aVarX = null;
                if (aVar3 != null) {
                    o(aVar3);
                    aVarY = y(aVar3);
                } else {
                    aVarY = null;
                }
                int iA = this.f63994e.a(aVar.C());
                if (j(iA)) {
                    n.a aVarA = this.f63999j ? n.a.a(obj, aVar, iA, bVar) : n.a.b(obj, aVar, bVar);
                    this.f63992c.h(obj, aVarA);
                    aVarX = x(aVarA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C5.a.m(aVarY);
        v(aVar2);
        s();
        return aVarX;
    }

    @Override // x6.n
    public C5.a e(Object obj) {
        n.a aVar;
        boolean z10;
        C5.a aVar2;
        y5.k.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f63991b.i(obj);
                if (aVar != null) {
                    n.a aVar3 = (n.a) this.f63992c.i(obj);
                    y5.k.g(aVar3);
                    y5.k.i(aVar3.f63976c == 0);
                    aVar2 = aVar3.f63975b;
                    z10 = true;
                } else {
                    aVar2 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            v(aVar);
        }
        return aVar2;
    }

    @Override // x6.x
    public synchronized boolean f(y5.l lVar) {
        return !this.f63992c.e(lVar).isEmpty();
    }

    @Override // x6.x
    public int g(y5.l lVar) {
        ArrayList arrayListJ;
        ArrayList arrayListJ2;
        synchronized (this) {
            arrayListJ = this.f63991b.j(lVar);
            arrayListJ2 = this.f63992c.j(lVar);
            p(arrayListJ2);
        }
        r(arrayListJ2);
        u(arrayListJ);
        w();
        s();
        return arrayListJ2.size();
    }

    @Override // x6.x
    public C5.a get(Object obj) {
        n.a aVar;
        C5.a aVarX;
        y5.k.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f63991b.i(obj);
                n.a aVar2 = (n.a) this.f63992c.b(obj);
                aVarX = aVar2 != null ? x(aVar2) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        v(aVar);
        w();
        s();
        return aVarX;
    }

    public synchronized int l() {
        return this.f63992c.c() - this.f63991b.c();
    }

    public synchronized int m() {
        return this.f63992c.f() - this.f63991b.f();
    }

    public void s() {
        ArrayList arrayListA;
        synchronized (this) {
            y yVar = this.f63997h;
            int iMin = Math.min(yVar.f64008d, yVar.f64006b - l());
            y yVar2 = this.f63997h;
            arrayListA = A(iMin, Math.min(yVar2.f64007c, yVar2.f64005a - m()));
            p(arrayListA);
        }
        r(arrayListA);
        u(arrayListA);
    }
}
