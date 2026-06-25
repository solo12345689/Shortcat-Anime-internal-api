package Gf;

import Gf.InterfaceC1621m;
import Lf.C1902i;
import Td.C2160k;
import ae.AbstractC2605b;
import ie.InterfaceC5096o;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Gf.p */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C1627p extends AbstractC1602c0 implements InterfaceC1623n, kotlin.coroutines.jvm.internal.e, h1 {

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7600f = AtomicIntegerFieldUpdater.newUpdater(C1627p.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7601g = AtomicReferenceFieldUpdater.newUpdater(C1627p.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7602h = AtomicReferenceFieldUpdater.newUpdater(C1627p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d */
    private final Zd.e f7603d;

    /* JADX INFO: renamed from: e */
    private final Zd.i f7604e;

    public C1627p(Zd.e eVar, int i10) {
        super(i10);
        this.f7603d = eVar;
        this.f7604e = eVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1603d.f7555a;
    }

    private final InterfaceC1612h0 D() {
        C0 c02 = (C0) getContext().l(C0.f7490K);
        if (c02 == null) {
            return null;
        }
        InterfaceC1612h0 interfaceC1612h0M = G0.m(c02, false, new C1634t(this), 1, null);
        androidx.concurrent.futures.b.a(f7602h, this, null, interfaceC1612h0M);
        return interfaceC1612h0M;
    }

    private final void E(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7601g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C1603d) {
                if (androidx.concurrent.futures.b.a(f7601g, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof InterfaceC1621m) || (obj2 instanceof Lf.B)) {
                H(obj, obj2);
            } else {
                if (obj2 instanceof C) {
                    C c10 = (C) obj2;
                    if (!c10.c()) {
                        H(obj, obj2);
                    }
                    if (obj2 instanceof C1632s) {
                        Throwable th2 = c10.f7489a;
                        if (obj instanceof InterfaceC1621m) {
                            l((InterfaceC1621m) obj, th2);
                            return;
                        } else {
                            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            n((Lf.B) obj, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof B) {
                    B b10 = (B) obj2;
                    if (b10.f7483b != null) {
                        H(obj, obj2);
                    }
                    if (obj instanceof Lf.B) {
                        return;
                    }
                    AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC1621m interfaceC1621m = (InterfaceC1621m) obj;
                    if (b10.c()) {
                        l(interfaceC1621m, b10.f7486e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f7601g, this, obj2, B.b(b10, null, interfaceC1621m, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof Lf.B) {
                        return;
                    }
                    AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(f7601g, this, obj2, new B(obj2, (InterfaceC1621m) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean G() {
        if (!AbstractC1604d0.c(this.f7553c)) {
            return false;
        }
        Zd.e eVar = this.f7603d;
        AbstractC5504s.f(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C1902i) eVar).o();
    }

    private final void H(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static final Td.L Q(Function1 function1, Throwable th2, Object obj, Zd.i iVar) {
        function1.invoke(th2);
        return Td.L.f17438a;
    }

    public static /* synthetic */ void S(C1627p c1627p, Object obj, int i10, InterfaceC5096o interfaceC5096o, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            interfaceC5096o = null;
        }
        c1627p.R(obj, i10, interfaceC5096o);
    }

    private final Object T(Q0 q02, Object obj, int i10, InterfaceC5096o interfaceC5096o, Object obj2) {
        if (obj instanceof C) {
            return obj;
        }
        if ((AbstractC1604d0.b(i10) || obj2 != null) && !(interfaceC5096o == null && !(q02 instanceof InterfaceC1621m) && obj2 == null)) {
            return new B(obj, q02 instanceof InterfaceC1621m ? (InterfaceC1621m) q02 : null, interfaceC5096o, obj2, null, 16, null);
        }
        return obj;
    }

    private final boolean W() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7600f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f7600f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final Lf.E X(Object obj, Object obj2, InterfaceC5096o interfaceC5096o) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7601g;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof Q0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof B) && obj4 != null && ((B) obj3).f7485d == obj4) {
                    return AbstractC1629q.f7607a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            InterfaceC5096o interfaceC5096o2 = interfaceC5096o;
            if (androidx.concurrent.futures.b.a(f7601g, this, obj3, T((Q0) obj3, obj5, this.f7553c, interfaceC5096o2, obj6))) {
                r();
                return AbstractC1629q.f7607a;
            }
            obj = obj5;
            interfaceC5096o = interfaceC5096o2;
            obj2 = obj6;
        }
    }

    private final boolean Y() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7600f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f7600f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void n(Lf.B b10, Throwable th2) {
        int i10 = f7600f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            b10.s(i10, th2, getContext());
        } catch (Throwable th3) {
            M.a(getContext(), new D("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    private final boolean o(Throwable th2) {
        if (!G()) {
            return false;
        }
        Zd.e eVar = this.f7603d;
        AbstractC5504s.f(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C1902i) eVar).q(th2);
    }

    private final void r() {
        if (G()) {
            return;
        }
        q();
    }

    private final void s(int i10) {
        if (W()) {
            return;
        }
        AbstractC1604d0.a(this, i10);
    }

    private final InterfaceC1612h0 u() {
        return (InterfaceC1612h0) f7602h.get(this);
    }

    private final String x() {
        Object objW = w();
        return objW instanceof Q0 ? "Active" : objW instanceof C1632s ? "Cancelled" : "Completed";
    }

    @Override // Gf.InterfaceC1623n
    public Object B(Throwable th2) {
        return X(new C(th2, false, 2, null), null, null);
    }

    public void C() {
        InterfaceC1612h0 interfaceC1612h0D = D();
        if (interfaceC1612h0D != null && j()) {
            interfaceC1612h0D.dispose();
            f7602h.set(this, P0.f7528a);
        }
    }

    public final void F(InterfaceC1621m interfaceC1621m) {
        E(interfaceC1621m);
    }

    @Override // Gf.InterfaceC1623n
    public void I(Object obj, InterfaceC5096o interfaceC5096o) {
        R(obj, this.f7553c, interfaceC5096o);
    }

    protected String J() {
        return "CancellableContinuation";
    }

    public final void K(Throwable th2) {
        if (o(th2)) {
            return;
        }
        L(th2);
        r();
    }

    @Override // Gf.InterfaceC1623n
    public boolean L(Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7601g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof Q0)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f7601g, this, obj, new C1632s(this, th2, (obj instanceof InterfaceC1621m) || (obj instanceof Lf.B))));
        Q0 q02 = (Q0) obj;
        if (q02 instanceof InterfaceC1621m) {
            l((InterfaceC1621m) obj, th2);
        } else if (q02 instanceof Lf.B) {
            n((Lf.B) obj, th2);
        }
        r();
        s(this.f7553c);
        return true;
    }

    public final void M() {
        Throwable thS;
        Zd.e eVar = this.f7603d;
        C1902i c1902i = eVar instanceof C1902i ? (C1902i) eVar : null;
        if (c1902i == null || (thS = c1902i.s(this)) == null) {
            return;
        }
        q();
        L(thS);
    }

    @Override // Gf.InterfaceC1623n
    public void N(K k10, Object obj) {
        Zd.e eVar = this.f7603d;
        C1902i c1902i = eVar instanceof C1902i ? (C1902i) eVar : null;
        S(this, obj, (c1902i != null ? c1902i.f11571d : null) == k10 ? 4 : this.f7553c, null, 4, null);
    }

    public final boolean O() {
        Object obj = f7601g.get(this);
        if ((obj instanceof B) && ((B) obj).f7485d != null) {
            q();
            return false;
        }
        f7600f.set(this, 536870911);
        f7601g.set(this, C1603d.f7555a);
        return true;
    }

    public void P(Object obj, final Function1 function1) {
        R(obj, this.f7553c, function1 != null ? new InterfaceC5096o() { // from class: Gf.o
            @Override // ie.InterfaceC5096o
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return C1627p.Q(function1, (Throwable) obj2, obj3, (Zd.i) obj4);
            }
        } : null);
    }

    public final void R(Object obj, int i10, InterfaceC5096o interfaceC5096o) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7601g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof Q0)) {
                Object obj3 = obj;
                InterfaceC5096o interfaceC5096o2 = interfaceC5096o;
                if (obj2 instanceof C1632s) {
                    C1632s c1632s = (C1632s) obj2;
                    if (c1632s.e()) {
                        if (interfaceC5096o2 != null) {
                            m(interfaceC5096o2, c1632s.f7489a, obj3);
                            return;
                        }
                        return;
                    }
                }
                k(obj3);
                throw new C2160k();
            }
            Object obj4 = obj;
            int i11 = i10;
            InterfaceC5096o interfaceC5096o3 = interfaceC5096o;
            if (androidx.concurrent.futures.b.a(f7601g, this, obj2, T((Q0) obj2, obj4, i11, interfaceC5096o3, null))) {
                r();
                s(i11);
                return;
            } else {
                obj = obj4;
                i10 = i11;
                interfaceC5096o = interfaceC5096o3;
            }
        }
    }

    @Override // Gf.InterfaceC1623n
    public void U(Object obj) {
        s(this.f7553c);
    }

    @Override // Gf.InterfaceC1623n
    public Object V(Object obj, Object obj2, InterfaceC5096o interfaceC5096o) {
        return X(obj, obj2, interfaceC5096o);
    }

    @Override // Gf.AbstractC1602c0
    public void a(Object obj, Throwable th2) {
        Throwable th3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7601g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof Q0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C) {
                return;
            }
            if (obj2 instanceof B) {
                B b10 = (B) obj2;
                if (b10.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th4 = th2;
                th3 = th4;
                if (androidx.concurrent.futures.b.a(f7601g, this, obj2, B.b(b10, null, null, null, null, th4, 15, null))) {
                    b10.d(this, th3);
                    return;
                }
            } else {
                th3 = th2;
                if (androidx.concurrent.futures.b.a(f7601g, this, obj2, new B(obj2, null, null, null, th3, 14, null))) {
                    return;
                }
            }
            th2 = th3;
        }
    }

    @Override // Gf.InterfaceC1623n
    public boolean b() {
        return w() instanceof Q0;
    }

    @Override // Gf.h1
    public void c(Lf.B b10, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7600f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        E(b10);
    }

    @Override // Gf.AbstractC1602c0
    public final Zd.e d() {
        return this.f7603d;
    }

    @Override // Gf.AbstractC1602c0
    public Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // Gf.AbstractC1602c0
    public Object f(Object obj) {
        return obj instanceof B ? ((B) obj).f7482a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Zd.e eVar = this.f7603d;
        if (eVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) eVar;
        }
        return null;
    }

    @Override // Zd.e
    public Zd.i getContext() {
        return this.f7604e;
    }

    @Override // Gf.AbstractC1602c0
    public Object h() {
        return w();
    }

    @Override // Gf.InterfaceC1623n
    public boolean isCancelled() {
        return w() instanceof C1632s;
    }

    @Override // Gf.InterfaceC1623n
    public boolean j() {
        return !(w() instanceof Q0);
    }

    public final void l(InterfaceC1621m interfaceC1621m, Throwable th2) {
        try {
            interfaceC1621m.a(th2);
        } catch (Throwable th3) {
            M.a(getContext(), new D("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void m(InterfaceC5096o interfaceC5096o, Throwable th2, Object obj) {
        try {
            interfaceC5096o.invoke(th2, obj, getContext());
        } catch (Throwable th3) {
            M.a(getContext(), new D("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // Gf.InterfaceC1623n
    public void p(Function1 function1) {
        r.c(this, new InterfaceC1621m.a(function1));
    }

    public final void q() {
        InterfaceC1612h0 interfaceC1612h0U = u();
        if (interfaceC1612h0U == null) {
            return;
        }
        interfaceC1612h0U.dispose();
        f7602h.set(this, P0.f7528a);
    }

    @Override // Zd.e
    public void resumeWith(Object obj) {
        S(this, E.c(obj, this), this.f7553c, null, 4, null);
    }

    public Throwable t(C0 c02) {
        return c02.D();
    }

    public String toString() {
        return J() + '(' + T.c(this.f7603d) + "){" + x() + "}@" + T.b(this);
    }

    public final Object v() {
        C0 c02;
        boolean zG = G();
        if (Y()) {
            if (u() == null) {
                D();
            }
            if (zG) {
                M();
            }
            return AbstractC2605b.f();
        }
        if (zG) {
            M();
        }
        Object objW = w();
        if (objW instanceof C) {
            throw ((C) objW).f7489a;
        }
        if (!AbstractC1604d0.b(this.f7553c) || (c02 = (C0) getContext().l(C0.f7490K)) == null || c02.b()) {
            return f(objW);
        }
        CancellationException cancellationExceptionD = c02.D();
        a(objW, cancellationExceptionD);
        throw cancellationExceptionD;
    }

    public final Object w() {
        return f7601g.get(this);
    }
}
