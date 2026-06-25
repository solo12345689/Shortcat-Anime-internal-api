package Lf;

import Gf.T;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Lf.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C1909p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f11587a = AtomicReferenceFieldUpdater.newUpdater(C1909p.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f11588b = AtomicReferenceFieldUpdater.newUpdater(C1909p.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f11589c = AtomicReferenceFieldUpdater.newUpdater(C1909p.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (androidx.concurrent.futures.b.a(Lf.C1909p.f11587a, r3, r2, ((Lf.y) r4).f11605a) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Lf.C1909p h() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o()
            java.lang.Object r0 = r0.get(r7)
            Lf.p r0 = (Lf.C1909p) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = n()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            goto L25
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o()
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.q()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            boolean r5 = r4 instanceof Lf.y
            if (r5 == 0) goto L4f
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = n()
            Lf.y r4 = (Lf.y) r4
            Lf.p r4 = r4.f11605a
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L42
            goto L0
        L42:
            r2 = r3
            goto Lc
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o()
            java.lang.Object r2 = r4.get(r2)
            Lf.p r2 = (Lf.C1909p) r2
            goto Ld
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.AbstractC5504s.f(r4, r3)
            r3 = r4
            Lf.p r3 = (Lf.C1909p) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Lf.C1909p.h():Lf.p");
    }

    private final C1909p i(C1909p c1909p) {
        while (c1909p.q()) {
            c1909p = (C1909p) f11588b.get(c1909p);
        }
        return c1909p;
    }

    private final void j(C1909p c1909p) {
        C1909p c1909p2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11588b;
        do {
            c1909p2 = (C1909p) atomicReferenceFieldUpdater.get(c1909p);
            if (k() != c1909p) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f11588b, c1909p, c1909p2, this));
        if (q()) {
            c1909p.h();
        }
    }

    private final y t() {
        y yVar = (y) f11589c.get(this);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this);
        f11589c.set(this, yVar2);
        return yVar2;
    }

    public final boolean d(C1909p c1909p, int i10) {
        C1909p c1909pM;
        do {
            c1909pM = m();
            if (c1909pM instanceof C1907n) {
                return (((C1907n) c1909pM).f11586d & i10) == 0 && c1909pM.d(c1909p, i10);
            }
        } while (!c1909pM.e(c1909p, this));
        return true;
    }

    public final boolean e(C1909p c1909p, C1909p c1909p2) {
        f11588b.set(c1909p, this);
        f11587a.set(c1909p, c1909p2);
        if (!androidx.concurrent.futures.b.a(f11587a, this, c1909p2, c1909p)) {
            return false;
        }
        c1909p.j(c1909p2);
        return true;
    }

    public final boolean f(C1909p c1909p) {
        f11588b.set(c1909p, this);
        f11587a.set(c1909p, this);
        while (k() == this) {
            if (androidx.concurrent.futures.b.a(f11587a, this, this, c1909p)) {
                c1909p.j(this);
                return true;
            }
        }
        return false;
    }

    public final void g(int i10) {
        d(new C1907n(i10), i10);
    }

    public final Object k() {
        return f11587a.get(this);
    }

    public final C1909p l() {
        C1909p c1909p;
        Object objK = k();
        y yVar = objK instanceof y ? (y) objK : null;
        if (yVar != null && (c1909p = yVar.f11605a) != null) {
            return c1909p;
        }
        AbstractC5504s.f(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C1909p) objK;
    }

    public final C1909p m() {
        C1909p c1909pH = h();
        return c1909pH == null ? i((C1909p) f11588b.get(this)) : c1909pH;
    }

    public boolean q() {
        return k() instanceof y;
    }

    public boolean r() {
        return s() == null;
    }

    public final C1909p s() {
        Object objK;
        C1909p c1909p;
        do {
            objK = k();
            if (objK instanceof y) {
                return ((y) objK).f11605a;
            }
            if (objK == this) {
                return (C1909p) objK;
            }
            AbstractC5504s.f(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c1909p = (C1909p) objK;
        } while (!androidx.concurrent.futures.b.a(f11587a, this, objK, c1909p.t()));
        c1909p.h();
        return null;
    }

    public String toString() {
        return new kotlin.jvm.internal.D(this) { // from class: Lf.p.a
            @Override // pe.InterfaceC6024n
            public Object get() {
                return T.a(this.receiver);
            }
        } + '@' + T.b(this);
    }
}
