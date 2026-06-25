package com.facebook.imagepipeline.memory;

import H6.E;
import H6.F;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Set;
import y5.k;
import y5.m;
import y5.p;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements B5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f35964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final B5.d f35965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final E f35966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final SparseArray f35967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Set f35968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final C0603a f35970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final C0603a f35971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final F f35972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35973j;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.memory.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C0603a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f35975b;

        C0603a() {
        }

        public void a(int i10) {
            int i11;
            int i12 = this.f35975b;
            if (i12 < i10 || (i11 = this.f35974a) <= 0) {
                AbstractC7283a.N("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i10), Integer.valueOf(this.f35975b), Integer.valueOf(this.f35974a));
            } else {
                this.f35974a = i11 - 1;
                this.f35975b = i12 - i10;
            }
        }

        public void b(int i10) {
            this.f35974a++;
            this.f35975b += i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b extends RuntimeException {
        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c extends RuntimeException {
        public c(int i10, int i11, int i12, int i13) {
            super("Pool hard cap violation? Hard cap = " + i10 + " Used size = " + i11 + " Free size = " + i12 + " Request size = " + i13);
        }
    }

    public a(B5.d dVar, E e10, F f10) {
        this.f35964a = getClass();
        this.f35965b = (B5.d) k.g(dVar);
        E e11 = (E) k.g(e10);
        this.f35966c = e11;
        this.f35972i = (F) k.g(f10);
        this.f35967d = new SparseArray();
        if (e11.f7973f) {
            s();
        } else {
            w(new SparseIntArray(0));
        }
        this.f35968e = m.b();
        this.f35971h = new C0603a();
        this.f35970g = new C0603a();
    }

    private synchronized void j() {
        try {
            k.i(!u() || this.f35971h.f35975b == 0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void k(SparseIntArray sparseIntArray) {
        this.f35967d.clear();
        for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
            int iKeyAt = sparseIntArray.keyAt(i10);
            this.f35967d.put(iKeyAt, new com.facebook.imagepipeline.memory.b(q(iKeyAt), sparseIntArray.valueAt(i10), 0, this.f35966c.f7973f));
        }
    }

    private synchronized com.facebook.imagepipeline.memory.b n(int i10) {
        return (com.facebook.imagepipeline.memory.b) this.f35967d.get(i10);
    }

    private synchronized void s() {
        try {
            SparseIntArray sparseIntArray = this.f35966c.f7970c;
            if (sparseIntArray != null) {
                k(sparseIntArray);
                this.f35969f = false;
            } else {
                this.f35969f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void w(SparseIntArray sparseIntArray) {
        try {
            k.g(sparseIntArray);
            this.f35967d.clear();
            SparseIntArray sparseIntArray2 = this.f35966c.f7970c;
            if (sparseIntArray2 != null) {
                for (int i10 = 0; i10 < sparseIntArray2.size(); i10++) {
                    int iKeyAt = sparseIntArray2.keyAt(i10);
                    this.f35967d.put(iKeyAt, new com.facebook.imagepipeline.memory.b(q(iKeyAt), sparseIntArray2.valueAt(i10), sparseIntArray.get(iKeyAt, 0), this.f35966c.f7973f));
                }
                this.f35969f = false;
            } else {
                this.f35969f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void x() {
        if (AbstractC7283a.w(2)) {
            AbstractC7283a.B(this.f35964a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f35970g.f35974a), Integer.valueOf(this.f35970g.f35975b), Integer.valueOf(this.f35971h.f35974a), Integer.valueOf(this.f35971h.f35975b));
        }
    }

    synchronized void A() {
        if (u()) {
            z(this.f35966c.f7969b);
        }
    }

    @Override // B5.f, C5.h
    public void a(Object obj) {
        k.g(obj);
        int iP = p(obj);
        int iQ = q(iP);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b bVarN = n(iP);
                if (!this.f35968e.remove(obj)) {
                    AbstractC7283a.k(this.f35964a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iP));
                    l(obj);
                    this.f35972i.b(iQ);
                } else if (bVarN == null || bVarN.f() || u() || !v(obj)) {
                    if (bVarN != null) {
                        bVarN.b();
                    }
                    if (AbstractC7283a.w(2)) {
                        AbstractC7283a.z(this.f35964a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iP));
                    }
                    l(obj);
                    this.f35970g.a(iQ);
                    this.f35972i.b(iQ);
                } else {
                    bVarN.h(obj);
                    this.f35971h.b(iQ);
                    this.f35970g.a(iQ);
                    this.f35972i.c(iQ);
                    if (AbstractC7283a.w(2)) {
                        AbstractC7283a.z(this.f35964a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iP));
                    }
                }
                x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // B5.f
    public Object get(int i10) throws Throwable {
        Object objH;
        Object objR;
        j();
        int iO = o(i10);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b bVarM = m(iO);
                if (bVarM != null && (objR = r(bVarM)) != null) {
                    k.i(this.f35968e.add(objR));
                    int iP = p(objR);
                    int iQ = q(iP);
                    this.f35970g.b(iQ);
                    this.f35971h.a(iQ);
                    this.f35972i.e(iQ);
                    x();
                    if (AbstractC7283a.w(2)) {
                        AbstractC7283a.z(this.f35964a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objR)), Integer.valueOf(iP));
                    }
                    return objR;
                }
                int iQ2 = q(iO);
                if (!i(iQ2)) {
                    throw new c(this.f35966c.f7968a, this.f35970g.f35975b, this.f35971h.f35975b, iQ2);
                }
                this.f35970g.b(iQ2);
                if (bVarM != null) {
                    bVarM.e();
                }
                try {
                    objH = h(iO);
                } catch (Throwable th2) {
                    synchronized (this) {
                        try {
                            this.f35970g.a(iQ2);
                            com.facebook.imagepipeline.memory.b bVarM2 = m(iO);
                            if (bVarM2 != null) {
                                bVarM2.b();
                            }
                            p.c(th2);
                            objH = null;
                        } finally {
                        }
                    }
                }
                synchronized (this) {
                    try {
                        k.i(this.f35968e.add(objH));
                        A();
                        this.f35972i.d(iQ2);
                        x();
                        if (AbstractC7283a.w(2)) {
                            AbstractC7283a.z(this.f35964a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objH)), Integer.valueOf(iO));
                        }
                    } finally {
                    }
                }
                return objH;
            } finally {
            }
        }
    }

    protected abstract Object h(int i10);

    synchronized boolean i(int i10) {
        if (this.f35973j) {
            return true;
        }
        E e10 = this.f35966c;
        int i11 = e10.f7968a;
        int i12 = this.f35970g.f35975b;
        if (i10 > i11 - i12) {
            this.f35972i.g();
            return false;
        }
        int i13 = e10.f7969b;
        if (i10 > i13 - (i12 + this.f35971h.f35975b)) {
            z(i13 - i10);
        }
        if (i10 <= i11 - (this.f35970g.f35975b + this.f35971h.f35975b)) {
            return true;
        }
        this.f35972i.g();
        return false;
    }

    protected abstract void l(Object obj);

    synchronized com.facebook.imagepipeline.memory.b m(int i10) {
        try {
            com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) this.f35967d.get(i10);
            if (bVar == null && this.f35969f) {
                if (AbstractC7283a.w(2)) {
                    AbstractC7283a.y(this.f35964a, "creating new bucket %s", Integer.valueOf(i10));
                }
                com.facebook.imagepipeline.memory.b bVarY = y(i10);
                this.f35967d.put(i10, bVarY);
                return bVarY;
            }
            return bVar;
        } finally {
        }
    }

    protected abstract int o(int i10);

    protected abstract int p(Object obj);

    protected abstract int q(int i10);

    protected synchronized Object r(com.facebook.imagepipeline.memory.b bVar) {
        return bVar.c();
    }

    protected void t() {
        this.f35965b.a(this);
        this.f35972i.f(this);
    }

    synchronized boolean u() {
        boolean z10;
        z10 = this.f35970g.f35975b + this.f35971h.f35975b > this.f35966c.f7969b;
        if (z10) {
            this.f35972i.a();
        }
        return z10;
    }

    protected boolean v(Object obj) {
        k.g(obj);
        return true;
    }

    com.facebook.imagepipeline.memory.b y(int i10) {
        return new com.facebook.imagepipeline.memory.b(q(i10), Integer.MAX_VALUE, 0, this.f35966c.f7973f);
    }

    synchronized void z(int i10) {
        try {
            int i11 = this.f35970g.f35975b;
            int i12 = this.f35971h.f35975b;
            int iMin = Math.min((i11 + i12) - i10, i12);
            if (iMin <= 0) {
                return;
            }
            if (AbstractC7283a.w(2)) {
                AbstractC7283a.A(this.f35964a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i10), Integer.valueOf(this.f35970g.f35975b + this.f35971h.f35975b), Integer.valueOf(iMin));
            }
            x();
            for (int i13 = 0; i13 < this.f35967d.size() && iMin > 0; i13++) {
                com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) k.g((com.facebook.imagepipeline.memory.b) this.f35967d.valueAt(i13));
                while (iMin > 0) {
                    Object objG = bVar.g();
                    if (objG == null) {
                        break;
                    }
                    l(objG);
                    int i14 = bVar.f35976a;
                    iMin -= i14;
                    this.f35971h.a(i14);
                }
            }
            x();
            if (AbstractC7283a.w(2)) {
                AbstractC7283a.z(this.f35964a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i10), Integer.valueOf(this.f35970g.f35975b + this.f35971h.f35975b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public a(B5.d dVar, E e10, F f10, boolean z10) {
        this(dVar, e10, f10);
        this.f35973j = z10;
    }
}
