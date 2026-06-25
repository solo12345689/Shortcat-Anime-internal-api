package Gf;

import Gf.C0;
import Lf.C1909p;
import Td.AbstractC2156g;
import Zd.i;
import ae.AbstractC2605b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class I0 implements C0, InterfaceC1640w, R0 {

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7497a = AtomicReferenceFieldUpdater.newUpdater(I0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7498b = AtomicReferenceFieldUpdater.newUpdater(I0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends C1627p {

        /* JADX INFO: renamed from: i */
        private final I0 f7499i;

        public a(Zd.e eVar, I0 i02) {
            super(eVar, 1);
            this.f7499i = i02;
        }

        @Override // Gf.C1627p
        protected String J() {
            return "AwaitContinuation";
        }

        @Override // Gf.C1627p
        public Throwable t(C0 c02) {
            Throwable thF;
            Object objE0 = this.f7499i.e0();
            return (!(objE0 instanceof c) || (thF = ((c) objE0).f()) == null) ? objE0 instanceof C ? ((C) objE0).f7489a : c02.D() : thF;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends H0 {

        /* JADX INFO: renamed from: e */
        private final I0 f7500e;

        /* JADX INFO: renamed from: f */
        private final c f7501f;

        /* JADX INFO: renamed from: g */
        private final C1638v f7502g;

        /* JADX INFO: renamed from: h */
        private final Object f7503h;

        public b(I0 i02, c cVar, C1638v c1638v, Object obj) {
            this.f7500e = i02;
            this.f7501f = cVar;
            this.f7502g = c1638v;
            this.f7503h = obj;
        }

        @Override // Gf.H0
        public boolean v() {
            return false;
        }

        @Override // Gf.H0
        public void w(Throwable th2) {
            this.f7500e.P(this.f7501f, this.f7502g, this.f7503h);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements InterfaceC1643x0 {

        /* JADX INFO: renamed from: b */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f7504b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f7505c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f7506d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a */
        private final N0 f7507a;

        public c(N0 n02, boolean z10, Throwable th2) {
            this.f7507a = n02;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        private final ArrayList d() {
            return new ArrayList(4);
        }

        private final Object e() {
            return f7506d.get(this);
        }

        private final void o(Object obj) {
            f7506d.set(this, obj);
        }

        public final void a(Throwable th2) {
            Throwable thF = f();
            if (thF == null) {
                p(th2);
                return;
            }
            if (th2 == thF) {
                return;
            }
            Object objE = e();
            if (objE == null) {
                o(th2);
                return;
            }
            if (objE instanceof Throwable) {
                if (th2 == objE) {
                    return;
                }
                ArrayList arrayListD = d();
                arrayListD.add(objE);
                arrayListD.add(th2);
                o(arrayListD);
                return;
            }
            if (objE instanceof ArrayList) {
                ((ArrayList) objE).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + objE).toString());
        }

        @Override // Gf.InterfaceC1643x0
        public boolean b() {
            return f() == null;
        }

        @Override // Gf.InterfaceC1643x0
        public N0 c() {
            return this.f7507a;
        }

        public final Throwable f() {
            return (Throwable) f7505c.get(this);
        }

        public final boolean j() {
            return f() != null;
        }

        public final boolean k() {
            return f7504b.get(this) == 1;
        }

        public final boolean l() {
            return e() == J0.f7517e;
        }

        public final List m(Throwable th2) {
            ArrayList arrayListD;
            Object objE = e();
            if (objE == null) {
                arrayListD = d();
            } else if (objE instanceof Throwable) {
                ArrayList arrayListD2 = d();
                arrayListD2.add(objE);
                arrayListD = arrayListD2;
            } else {
                if (!(objE instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objE).toString());
                }
                arrayListD = (ArrayList) objE;
            }
            Throwable thF = f();
            if (thF != null) {
                arrayListD.add(0, thF);
            }
            if (th2 != null && !AbstractC5504s.c(th2, thF)) {
                arrayListD.add(th2);
            }
            o(J0.f7517e);
            return arrayListD;
        }

        public final void n(boolean z10) {
            f7504b.set(this, z10 ? 1 : 0);
        }

        public final void p(Throwable th2) {
            f7505c.set(this, th2);
        }

        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + c() + ']';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f7508a;

        /* JADX INFO: renamed from: b */
        Object f7509b;

        /* JADX INFO: renamed from: c */
        int f7510c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Object f7511d;

        d(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Object invoke(Cf.k kVar, Zd.e eVar) {
            return ((d) create(kVar, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            d dVar = I0.this.new d(eVar);
            dVar.f7511d = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0045, code lost:
        
            if (r6.d(r1, r5) == r0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x007e, code lost:
        
            if (r4.d(r6, r5) == r0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x006b -> B:57:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x007e -> B:57:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r5.f7510c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r5.f7509b
                Lf.p r1 = (Lf.C1909p) r1
                java.lang.Object r3 = r5.f7508a
                Lf.o r3 = (Lf.AbstractC1908o) r3
                java.lang.Object r4 = r5.f7511d
                Cf.k r4 = (Cf.k) r4
                Td.v.b(r6)
                goto L81
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L26:
                Td.v.b(r6)
                goto L86
            L2a:
                Td.v.b(r6)
                java.lang.Object r6 = r5.f7511d
                Cf.k r6 = (Cf.k) r6
                Gf.I0 r1 = Gf.I0.this
                java.lang.Object r1 = r1.e0()
                boolean r4 = r1 instanceof Gf.C1638v
                if (r4 == 0) goto L48
                Gf.v r1 = (Gf.C1638v) r1
                Gf.w r1 = r1.f7612e
                r5.f7510c = r3
                java.lang.Object r6 = r6.d(r1, r5)
                if (r6 != r0) goto L86
                goto L80
            L48:
                boolean r3 = r1 instanceof Gf.InterfaceC1643x0
                if (r3 == 0) goto L86
                Gf.x0 r1 = (Gf.InterfaceC1643x0) r1
                Gf.N0 r1 = r1.c()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.k()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                kotlin.jvm.internal.AbstractC5504s.f(r3, r4)
                Lf.p r3 = (Lf.C1909p) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L63:
                boolean r6 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
                if (r6 != 0) goto L86
                boolean r6 = r1 instanceof Gf.C1638v
                if (r6 == 0) goto L81
                r6 = r1
                Gf.v r6 = (Gf.C1638v) r6
                Gf.w r6 = r6.f7612e
                r5.f7511d = r4
                r5.f7508a = r3
                r5.f7509b = r1
                r5.f7510c = r2
                java.lang.Object r6 = r4.d(r6, r5)
                if (r6 != r0) goto L81
            L80:
                return r0
            L81:
                Lf.p r1 = r1.l()
                goto L63
            L86:
                Td.L r6 = Td.L.f17438a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Gf.I0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public I0(boolean z10) {
        this._state$volatile = z10 ? J0.f7519g : J0.f7518f;
    }

    private final void A0(C1618k0 c1618k0) {
        N0 n02 = new N0();
        Object c1641w0 = n02;
        if (!c1618k0.b()) {
            c1641w0 = new C1641w0(n02);
        }
        androidx.concurrent.futures.b.a(f7497a, this, c1618k0, c1641w0);
    }

    private final void B0(H0 h02) {
        h02.f(new N0());
        androidx.concurrent.futures.b.a(f7497a, this, h02, h02.l());
    }

    private final int E0(Object obj) {
        if (obj instanceof C1618k0) {
            if (((C1618k0) obj).b()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f7497a, this, obj, J0.f7519g)) {
                return -1;
            }
            z0();
            return 1;
        }
        if (!(obj instanceof C1641w0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f7497a, this, obj, ((C1641w0) obj).c())) {
            return -1;
        }
        z0();
        return 1;
    }

    private final Object F(Object obj) {
        Object objN0;
        do {
            Object objE0 = e0();
            if (!(objE0 instanceof InterfaceC1643x0) || ((objE0 instanceof c) && ((c) objE0).k())) {
                return J0.f7513a;
            }
            objN0 = N0(objE0, new C(Q(obj), false, 2, null));
        } while (objN0 == J0.f7515c);
        return objN0;
    }

    private final boolean G(Throwable th2) {
        if (n0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        InterfaceC1636u interfaceC1636uD0 = d0();
        return (interfaceC1636uD0 == null || interfaceC1636uD0 == P0.f7528a) ? z10 : interfaceC1636uD0.a(th2) || z10;
    }

    private final String G0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC1643x0 ? ((InterfaceC1643x0) obj).b() ? "Active" : "New" : obj instanceof C ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.j() ? "Cancelling" : cVar.k() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException I0(I0 i02, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return i02.H0(th2, str);
    }

    private final boolean K0(InterfaceC1643x0 interfaceC1643x0, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f7497a, this, interfaceC1643x0, J0.g(obj))) {
            return false;
        }
        x0(null);
        y0(obj);
        M(interfaceC1643x0, obj);
        return true;
    }

    private final boolean L0(InterfaceC1643x0 interfaceC1643x0, Throwable th2) throws Throwable {
        N0 n0B0 = b0(interfaceC1643x0);
        if (n0B0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f7497a, this, interfaceC1643x0, new c(n0B0, false, th2))) {
            return false;
        }
        v0(n0B0, th2);
        return true;
    }

    private final void M(InterfaceC1643x0 interfaceC1643x0, Object obj) throws Throwable {
        InterfaceC1636u interfaceC1636uD0 = d0();
        if (interfaceC1636uD0 != null) {
            interfaceC1636uD0.dispose();
            D0(P0.f7528a);
        }
        C c10 = obj instanceof C ? (C) obj : null;
        Throwable th2 = c10 != null ? c10.f7489a : null;
        if (!(interfaceC1643x0 instanceof H0)) {
            N0 n0C = interfaceC1643x0.c();
            if (n0C != null) {
                w0(n0C, th2);
                return;
            }
            return;
        }
        try {
            ((H0) interfaceC1643x0).w(th2);
        } catch (Throwable th3) {
            j0(new D("Exception in completion handler " + interfaceC1643x0 + " for " + this, th3));
        }
    }

    private final Object N0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC1643x0) ? J0.f7513a : ((!(obj instanceof C1618k0) && !(obj instanceof H0)) || (obj instanceof C1638v) || (obj2 instanceof C)) ? O0((InterfaceC1643x0) obj, obj2) : K0((InterfaceC1643x0) obj, obj2) ? obj2 : J0.f7515c;
    }

    private final Object O0(InterfaceC1643x0 interfaceC1643x0, Object obj) throws Throwable {
        N0 n0B0 = b0(interfaceC1643x0);
        if (n0B0 == null) {
            return J0.f7515c;
        }
        c cVar = interfaceC1643x0 instanceof c ? (c) interfaceC1643x0 : null;
        if (cVar == null) {
            cVar = new c(n0B0, false, null);
        }
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        synchronized (cVar) {
            if (cVar.k()) {
                return J0.f7513a;
            }
            cVar.n(true);
            if (cVar != interfaceC1643x0 && !androidx.concurrent.futures.b.a(f7497a, this, interfaceC1643x0, cVar)) {
                return J0.f7515c;
            }
            boolean zJ = cVar.j();
            C c10 = obj instanceof C ? (C) obj : null;
            if (c10 != null) {
                cVar.a(c10.f7489a);
            }
            Throwable thF = zJ ? null : cVar.f();
            n10.f52259a = thF;
            Td.L l10 = Td.L.f17438a;
            if (thF != null) {
                v0(n0B0, thF);
            }
            C1638v c1638vU0 = u0(n0B0);
            if (c1638vU0 != null && P0(cVar, c1638vU0, obj)) {
                return J0.f7514b;
            }
            n0B0.g(2);
            C1638v c1638vU02 = u0(n0B0);
            return (c1638vU02 == null || !P0(cVar, c1638vU02, obj)) ? R(cVar, obj) : J0.f7514b;
        }
    }

    public final void P(c cVar, C1638v c1638v, Object obj) {
        C1638v c1638vU0 = u0(c1638v);
        if (c1638vU0 == null || !P0(cVar, c1638vU0, obj)) {
            cVar.c().g(2);
            C1638v c1638vU02 = u0(c1638v);
            if (c1638vU02 == null || !P0(cVar, c1638vU02, obj)) {
                t(R(cVar, obj));
            }
        }
    }

    private final boolean P0(c cVar, C1638v c1638v, Object obj) {
        while (F0.l(c1638v.f7612e, false, new b(this, cVar, c1638v, obj)) == P0.f7528a) {
            c1638v = u0(c1638v);
            if (c1638v == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable Q(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new D0(J(), null, this) : th2;
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((R0) obj).Y();
    }

    private final Object R(c cVar, Object obj) throws Throwable {
        boolean zJ;
        Throwable thX;
        C c10 = obj instanceof C ? (C) obj : null;
        Throwable th2 = c10 != null ? c10.f7489a : null;
        synchronized (cVar) {
            zJ = cVar.j();
            List listM = cVar.m(th2);
            thX = X(cVar, listM);
            if (thX != null) {
                s(thX, listM);
            }
        }
        if (thX != null && thX != th2) {
            obj = new C(thX, false, 2, null);
        }
        if (thX != null && (G(thX) || i0(thX))) {
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C) obj).c();
        }
        if (!zJ) {
            x0(thX);
        }
        y0(obj);
        androidx.concurrent.futures.b.a(f7497a, this, cVar, J0.g(obj));
        M(cVar, obj);
        return obj;
    }

    private final Throwable W(Object obj) {
        C c10 = obj instanceof C ? (C) obj : null;
        if (c10 != null) {
            return c10.f7489a;
        }
        return null;
    }

    private final Throwable X(c cVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.j()) {
                return new D0(J(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) list.get(0);
        if (th3 instanceof b1) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th4 = (Throwable) next2;
                if (th4 != th3 && (th4 instanceof b1)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    private final N0 b0(InterfaceC1643x0 interfaceC1643x0) {
        N0 n0C = interfaceC1643x0.c();
        if (n0C != null) {
            return n0C;
        }
        if (interfaceC1643x0 instanceof C1618k0) {
            return new N0();
        }
        if (interfaceC1643x0 instanceof H0) {
            B0((H0) interfaceC1643x0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1643x0).toString());
    }

    private final boolean o0() {
        Object objE0;
        do {
            objE0 = e0();
            if (!(objE0 instanceof InterfaceC1643x0)) {
                return false;
            }
        } while (E0(objE0) < 0);
        return true;
    }

    private final Object p0(Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        r.a(c1627p, G0.m(this, false, new T0(c1627p), 1, null));
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : Td.L.f17438a;
    }

    private final Object q0(Object obj) throws Throwable {
        Throwable thQ = null;
        while (true) {
            Object objE0 = e0();
            if (objE0 instanceof c) {
                synchronized (objE0) {
                    if (((c) objE0).l()) {
                        return J0.f7516d;
                    }
                    boolean zJ = ((c) objE0).j();
                    if (obj != null || !zJ) {
                        if (thQ == null) {
                            thQ = Q(obj);
                        }
                        ((c) objE0).a(thQ);
                    }
                    Throwable thF = zJ ? null : ((c) objE0).f();
                    if (thF != null) {
                        v0(((c) objE0).c(), thF);
                    }
                    return J0.f7513a;
                }
            }
            if (!(objE0 instanceof InterfaceC1643x0)) {
                return J0.f7516d;
            }
            if (thQ == null) {
                thQ = Q(obj);
            }
            InterfaceC1643x0 interfaceC1643x0 = (InterfaceC1643x0) objE0;
            if (!interfaceC1643x0.b()) {
                Object objN0 = N0(objE0, new C(thQ, false, 2, null));
                if (objN0 == J0.f7513a) {
                    throw new IllegalStateException(("Cannot happen in " + objE0).toString());
                }
                if (objN0 != J0.f7515c) {
                    return objN0;
                }
            } else if (L0(interfaceC1643x0, thQ)) {
                return J0.f7513a;
            }
        }
    }

    private final void s(Throwable th2, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th3 = (Throwable) it.next();
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                AbstractC2156g.a(th2, th3);
            }
        }
    }

    private final C1638v u0(C1909p c1909p) {
        while (c1909p.q()) {
            c1909p = c1909p.m();
        }
        while (true) {
            c1909p = c1909p.l();
            if (!c1909p.q()) {
                if (c1909p instanceof C1638v) {
                    return (C1638v) c1909p;
                }
                if (c1909p instanceof N0) {
                    return null;
                }
            }
        }
    }

    private final Object v(Zd.e eVar) {
        a aVar = new a(AbstractC2605b.c(eVar), this);
        aVar.C();
        r.a(aVar, G0.m(this, false, new S0(aVar), 1, null));
        Object objV = aVar.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }

    private final void v0(N0 n02, Throwable th2) throws Throwable {
        x0(th2);
        n02.g(4);
        Object objK = n02.k();
        AbstractC5504s.f(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        D d10 = null;
        for (C1909p c1909pL = (C1909p) objK; !AbstractC5504s.c(c1909pL, n02); c1909pL = c1909pL.l()) {
            if ((c1909pL instanceof H0) && ((H0) c1909pL).v()) {
                try {
                    ((H0) c1909pL).w(th2);
                } catch (Throwable th3) {
                    if (d10 != null) {
                        AbstractC2156g.a(d10, th3);
                    } else {
                        d10 = new D("Exception in completion handler " + c1909pL + " for " + this, th3);
                        Td.L l10 = Td.L.f17438a;
                    }
                }
            }
        }
        if (d10 != null) {
            j0(d10);
        }
        G(th2);
    }

    private final void w0(N0 n02, Throwable th2) throws Throwable {
        n02.g(1);
        Object objK = n02.k();
        AbstractC5504s.f(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        D d10 = null;
        for (C1909p c1909pL = (C1909p) objK; !AbstractC5504s.c(c1909pL, n02); c1909pL = c1909pL.l()) {
            if (c1909pL instanceof H0) {
                try {
                    ((H0) c1909pL).w(th2);
                } catch (Throwable th3) {
                    if (d10 != null) {
                        AbstractC2156g.a(d10, th3);
                    } else {
                        d10 = new D("Exception in completion handler " + c1909pL + " for " + this, th3);
                        Td.L l10 = Td.L.f17438a;
                    }
                }
            }
        }
        if (d10 != null) {
            j0(d10);
        }
    }

    public void A(Throwable th2) throws Throwable {
        y(th2);
    }

    @Override // Gf.C0
    public final InterfaceC1612h0 C(boolean z10, boolean z11, Function1 function1) {
        return m0(z11, z10 ? new A0(function1) : new B0(function1));
    }

    public final void C0(H0 h02) {
        Object objE0;
        do {
            objE0 = e0();
            if (!(objE0 instanceof H0)) {
                if (!(objE0 instanceof InterfaceC1643x0) || ((InterfaceC1643x0) objE0).c() == null) {
                    return;
                }
                h02.r();
                return;
            }
            if (objE0 != h02) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f7497a, this, objE0, J0.f7519g));
    }

    @Override // Gf.C0
    public final CancellationException D() {
        Object objE0 = e0();
        if (!(objE0 instanceof c)) {
            if (objE0 instanceof InterfaceC1643x0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objE0 instanceof C) {
                return I0(this, ((C) objE0).f7489a, null, 1, null);
            }
            return new D0(T.a(this) + " has completed normally", null, this);
        }
        Throwable thF = ((c) objE0).f();
        if (thF != null) {
            CancellationException cancellationExceptionH0 = H0(thF, T.a(this) + " is cancelling");
            if (cancellationExceptionH0 != null) {
                return cancellationExceptionH0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final void D0(InterfaceC1636u interfaceC1636u) {
        f7498b.set(this, interfaceC1636u);
    }

    @Override // Gf.C0
    public final InterfaceC1612h0 H(Function1 function1) {
        return m0(true, new B0(function1));
    }

    protected final CancellationException H0(Throwable th2, String str) {
        CancellationException d02 = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (d02 == null) {
            if (str == null) {
                str = J();
            }
            d02 = new D0(str, th2, this);
        }
        return d02;
    }

    public String J() {
        return "Job was cancelled";
    }

    public final String J0() {
        return t0() + '{' + G0(e0()) + '}';
    }

    public boolean K(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return y(th2) && Z();
    }

    @Override // Gf.InterfaceC1640w
    public final void S(R0 r02) throws Throwable {
        y(r02);
    }

    public final Object T() throws Throwable {
        Object objE0 = e0();
        if (objE0 instanceof InterfaceC1643x0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objE0 instanceof C) {
            throw ((C) objE0).f7489a;
        }
        return J0.h(objE0);
    }

    @Override // Gf.R0
    public CancellationException Y() {
        Throwable thF;
        Object objE0 = e0();
        if (objE0 instanceof c) {
            thF = ((c) objE0).f();
        } else if (objE0 instanceof C) {
            thF = ((C) objE0).f7489a;
        } else {
            if (objE0 instanceof InterfaceC1643x0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objE0).toString());
            }
            thF = null;
        }
        CancellationException cancellationException = thF instanceof CancellationException ? (CancellationException) thF : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new D0("Parent job is " + G0(objE0), thF, this);
    }

    public boolean Z() {
        return true;
    }

    public boolean a0() {
        return false;
    }

    @Override // Zd.i
    public Zd.i a1(i.c cVar) {
        return C0.a.d(this, cVar);
    }

    @Override // Gf.C0
    public boolean b() {
        Object objE0 = e0();
        return (objE0 instanceof InterfaceC1643x0) && ((InterfaceC1643x0) objE0).b();
    }

    public C0 c0() {
        InterfaceC1636u interfaceC1636uD0 = d0();
        if (interfaceC1636uD0 != null) {
            return interfaceC1636uD0.getParent();
        }
        return null;
    }

    public final InterfaceC1636u d0() {
        return (InterfaceC1636u) f7498b.get(this);
    }

    public final Object e0() {
        return f7497a.get(this);
    }

    @Override // Gf.C0
    public final Cf.i g() {
        return Cf.l.b(new d(null));
    }

    @Override // Zd.i.b
    public final i.c getKey() {
        return C0.f7490K;
    }

    @Override // Gf.C0
    public final Object h0(Zd.e eVar) {
        if (o0()) {
            Object objP0 = p0(eVar);
            return objP0 == AbstractC2605b.f() ? objP0 : Td.L.f17438a;
        }
        F0.j(eVar.getContext());
        return Td.L.f17438a;
    }

    protected boolean i0(Throwable th2) {
        return false;
    }

    public final boolean isCancelled() {
        Object objE0 = e0();
        if (objE0 instanceof C) {
            return true;
        }
        return (objE0 instanceof c) && ((c) objE0).j();
    }

    @Override // Gf.C0
    public final boolean j() {
        return !(e0() instanceof InterfaceC1643x0);
    }

    @Override // Gf.C0
    public void k(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new D0(J(), null, this);
        }
        A(cancellationException);
    }

    @Override // Zd.i.b, Zd.i
    public i.b l(i.c cVar) {
        return C0.a.c(this, cVar);
    }

    protected final void l0(C0 c02) {
        if (c02 == null) {
            D0(P0.f7528a);
            return;
        }
        c02.start();
        InterfaceC1636u interfaceC1636uT1 = c02.t1(this);
        D0(interfaceC1636uT1);
        if (j()) {
            interfaceC1636uT1.dispose();
            D0(P0.f7528a);
        }
    }

    public final InterfaceC1612h0 m0(boolean z10, H0 h02) {
        boolean z11;
        boolean zD;
        h02.x(this);
        while (true) {
            Object objE0 = e0();
            z11 = true;
            if (!(objE0 instanceof C1618k0)) {
                if (!(objE0 instanceof InterfaceC1643x0)) {
                    z11 = false;
                    break;
                }
                InterfaceC1643x0 interfaceC1643x0 = (InterfaceC1643x0) objE0;
                N0 n0C = interfaceC1643x0.c();
                if (n0C == null) {
                    AbstractC5504s.f(objE0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    B0((H0) objE0);
                } else {
                    if (h02.v()) {
                        c cVar = interfaceC1643x0 instanceof c ? (c) interfaceC1643x0 : null;
                        Throwable thF = cVar != null ? cVar.f() : null;
                        if (thF != null) {
                            if (z10) {
                                h02.w(thF);
                            }
                            return P0.f7528a;
                        }
                        zD = n0C.d(h02, 5);
                    } else {
                        zD = n0C.d(h02, 1);
                    }
                    if (zD) {
                        break;
                    }
                }
            } else {
                C1618k0 c1618k0 = (C1618k0) objE0;
                if (!c1618k0.b()) {
                    A0(c1618k0);
                } else if (androidx.concurrent.futures.b.a(f7497a, this, objE0, h02)) {
                    break;
                }
            }
        }
        if (z11) {
            return h02;
        }
        if (z10) {
            Object objE02 = e0();
            C c10 = objE02 instanceof C ? (C) objE02 : null;
            h02.w(c10 != null ? c10.f7489a : null);
        }
        return P0.f7528a;
    }

    protected boolean n0() {
        return false;
    }

    public final boolean r0(Object obj) {
        Object objN0;
        do {
            objN0 = N0(e0(), obj);
            if (objN0 == J0.f7513a) {
                return false;
            }
            if (objN0 == J0.f7514b) {
                return true;
            }
        } while (objN0 == J0.f7515c);
        t(objN0);
        return true;
    }

    public final Object s0(Object obj) {
        Object objN0;
        do {
            objN0 = N0(e0(), obj);
            if (objN0 == J0.f7513a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, W(obj));
            }
        } while (objN0 == J0.f7515c);
        return objN0;
    }

    @Override // Gf.C0
    public final boolean start() {
        int iE0;
        do {
            iE0 = E0(e0());
            if (iE0 == 0) {
                return false;
            }
        } while (iE0 != 1);
        return true;
    }

    public String t0() {
        return T.a(this);
    }

    @Override // Gf.C0
    public final InterfaceC1636u t1(InterfaceC1640w interfaceC1640w) {
        C1638v c1638v = new C1638v(interfaceC1640w);
        c1638v.x(this);
        while (true) {
            Object objE0 = e0();
            if (objE0 instanceof C1618k0) {
                C1618k0 c1618k0 = (C1618k0) objE0;
                if (!c1618k0.b()) {
                    A0(c1618k0);
                } else if (androidx.concurrent.futures.b.a(f7497a, this, objE0, c1638v)) {
                    return c1638v;
                }
            } else {
                if (!(objE0 instanceof InterfaceC1643x0)) {
                    Object objE02 = e0();
                    C c10 = objE02 instanceof C ? (C) objE02 : null;
                    c1638v.w(c10 != null ? c10.f7489a : null);
                    return P0.f7528a;
                }
                N0 n0C = ((InterfaceC1643x0) objE0).c();
                if (n0C != null) {
                    if (!n0C.d(c1638v, 7)) {
                        boolean zD = n0C.d(c1638v, 3);
                        Object objE03 = e0();
                        if (objE03 instanceof c) {
                            thF = ((c) objE03).f();
                        } else {
                            C c11 = objE03 instanceof C ? (C) objE03 : null;
                            if (c11 != null) {
                                thF = c11.f7489a;
                            }
                        }
                        c1638v.w(thF);
                        if (!zD) {
                            return P0.f7528a;
                        }
                    }
                    return c1638v;
                }
                AbstractC5504s.f(objE0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                B0((H0) objE0);
            }
        }
    }

    public String toString() {
        return J0() + '@' + T.b(this);
    }

    protected final Object u(Zd.e eVar) throws Throwable {
        Object objE0;
        do {
            objE0 = e0();
            if (!(objE0 instanceof InterfaceC1643x0)) {
                if (objE0 instanceof C) {
                    throw ((C) objE0).f7489a;
                }
                return J0.h(objE0);
            }
        } while (E0(objE0) < 0);
        return v(eVar);
    }

    @Override // Zd.i
    public Zd.i w(Zd.i iVar) {
        return C0.a.e(this, iVar);
    }

    public final boolean x(Throwable th2) {
        return y(th2);
    }

    public final boolean y(Object obj) throws Throwable {
        Object objQ0 = J0.f7513a;
        if (a0() && (objQ0 = F(obj)) == J0.f7514b) {
            return true;
        }
        if (objQ0 == J0.f7513a) {
            objQ0 = q0(obj);
        }
        if (objQ0 == J0.f7513a || objQ0 == J0.f7514b) {
            return true;
        }
        if (objQ0 == J0.f7516d) {
            return false;
        }
        t(objQ0);
        return true;
    }

    @Override // Zd.i
    public Object y1(Object obj, Function2 function2) {
        return C0.a.b(this, obj, function2);
    }

    protected void z0() {
    }

    public void j0(Throwable th2) throws Throwable {
        throw th2;
    }

    protected void t(Object obj) {
    }

    protected void x0(Throwable th2) {
    }

    protected void y0(Object obj) {
    }
}
