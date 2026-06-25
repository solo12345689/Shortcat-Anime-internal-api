package Pf;

import Gf.C1627p;
import Gf.InterfaceC1623n;
import Gf.K;
import Gf.T;
import Gf.h1;
import Gf.r;
import Lf.B;
import Pf.f;
import Td.L;
import ae.AbstractC2605b;
import ie.InterfaceC5096o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class f extends j implements Pf.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13951i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC5096o f13952h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class a implements InterfaceC1623n, h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1627p f13953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f13954b;

        public a(C1627p c1627p, Object obj) {
            this.f13953a = c1627p;
            this.f13954b = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L f(f fVar, a aVar, Throwable th2) {
            fVar.e(aVar.f13954b);
            return L.f17438a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L i(f fVar, a aVar, Throwable th2, L l10, Zd.i iVar) {
            f.z().set(fVar, aVar.f13954b);
            fVar.e(aVar.f13954b);
            return L.f17438a;
        }

        @Override // Gf.InterfaceC1623n
        public Object B(Throwable th2) {
            return this.f13953a.B(th2);
        }

        @Override // Gf.InterfaceC1623n
        public boolean L(Throwable th2) {
            return this.f13953a.L(th2);
        }

        @Override // Gf.InterfaceC1623n
        public void U(Object obj) {
            this.f13953a.U(obj);
        }

        @Override // Gf.InterfaceC1623n
        public boolean b() {
            return this.f13953a.b();
        }

        @Override // Gf.h1
        public void c(B b10, int i10) {
            this.f13953a.c(b10, i10);
        }

        @Override // Gf.InterfaceC1623n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void I(L l10, InterfaceC5096o interfaceC5096o) {
            f.z().set(f.this, this.f13954b);
            C1627p c1627p = this.f13953a;
            final f fVar = f.this;
            c1627p.P(l10, new Function1() { // from class: Pf.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.a.f(fVar, this, (Throwable) obj);
                }
            });
        }

        @Override // Gf.InterfaceC1623n
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void N(K k10, L l10) {
            this.f13953a.N(k10, l10);
        }

        @Override // Zd.e
        public Zd.i getContext() {
            return this.f13953a.getContext();
        }

        @Override // Gf.InterfaceC1623n
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object V(L l10, Object obj, InterfaceC5096o interfaceC5096o) {
            final f fVar = f.this;
            Object objV = this.f13953a.V(l10, obj, new InterfaceC5096o() { // from class: Pf.d
                @Override // ie.InterfaceC5096o
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return f.a.i(fVar, this, (Throwable) obj2, (L) obj3, (Zd.i) obj4);
                }
            });
            if (objV != null) {
                f.z().set(f.this, this.f13954b);
            }
            return objV;
        }

        @Override // Gf.InterfaceC1623n
        public boolean isCancelled() {
            return this.f13953a.isCancelled();
        }

        @Override // Gf.InterfaceC1623n
        public boolean j() {
            return this.f13953a.j();
        }

        @Override // Gf.InterfaceC1623n
        public void p(Function1 function1) {
            this.f13953a.p(function1);
        }

        @Override // Zd.e
        public void resumeWith(Object obj) {
            this.f13953a.resumeWith(obj);
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f13956a;
        this.f13952h = new InterfaceC5096o() { // from class: Pf.b
            @Override // ie.InterfaceC5096o
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                f fVar = this.f13944a;
                android.support.v4.media.session.b.a(obj);
                return f.E(fVar, null, obj2, obj3);
            }
        };
    }

    private final int A(Object obj) {
        while (B()) {
            Object obj2 = f13951i.get(this);
            if (obj2 != g.f13956a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object C(f fVar, Object obj, Zd.e eVar) {
        if (fVar.d(obj)) {
            return L.f17438a;
        }
        Object objD = fVar.D(obj, eVar);
        return objD == AbstractC2605b.f() ? objD : L.f17438a;
    }

    private final Object D(Object obj, Zd.e eVar) {
        C1627p c1627pB = r.b(AbstractC2605b.c(eVar));
        try {
            h(new a(c1627pB, obj));
            Object objV = c1627pB.v();
            if (objV == AbstractC2605b.f()) {
                kotlin.coroutines.jvm.internal.h.c(eVar);
            }
            return objV == AbstractC2605b.f() ? objV : L.f17438a;
        } catch (Throwable th2) {
            c1627pB.M();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5096o E(final f fVar, Of.a aVar, final Object obj, Object obj2) {
        return new InterfaceC5096o() { // from class: Pf.c
            @Override // ie.InterfaceC5096o
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return f.F(this.f13945a, obj, (Throwable) obj3, obj4, (Zd.i) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L F(f fVar, Object obj, Throwable th2, Object obj2, Zd.i iVar) {
        fVar.e(obj);
        return L.f17438a;
    }

    private final int G(Object obj) {
        while (!t()) {
            if (obj == null) {
                return 1;
            }
            int iA = A(obj);
            if (iA == 1) {
                return 2;
            }
            if (iA == 2) {
                return 1;
            }
        }
        f13951i.set(this, obj);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater z() {
        return f13951i;
    }

    public boolean B() {
        return m() == 0;
    }

    @Override // Pf.a
    public Object c(Object obj, Zd.e eVar) {
        return C(this, obj, eVar);
    }

    @Override // Pf.a
    public boolean d(Object obj) {
        int iG = G(obj);
        if (iG == 0) {
            return true;
        }
        if (iG == 1) {
            return false;
        }
        if (iG != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // Pf.a
    public void e(Object obj) {
        while (B()) {
            Object obj2 = f13951i.get(this);
            if (obj2 != g.f13956a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(f13951i, this, obj2, g.f13956a)) {
                    a();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        return "Mutex@" + T.b(this) + "[isLocked=" + B() + ",owner=" + f13951i.get(this) + ']';
    }
}
