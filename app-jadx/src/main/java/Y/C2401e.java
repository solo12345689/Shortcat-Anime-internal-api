package Y;

import Gf.C1627p;
import Gf.InterfaceC1623n;
import Td.u;
import Y.InterfaceC2446t0;
import Zd.i;
import ae.AbstractC2605b;
import g0.C4819a;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6546L;

/* JADX INFO: renamed from: Y.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2401e implements InterfaceC2446t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5082a f22289a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Throwable f22291c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f22290b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4819a f22292d = a.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C6546L f22293e = new C6546L(0, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C6546L f22294f = new C6546L(0, 1, null);

    /* JADX INFO: renamed from: Y.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Function1 f22296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InterfaceC1623n f22297b;

        public b(Function1 function1, InterfaceC1623n interfaceC1623n) {
            this.f22296a = function1;
            this.f22297b = interfaceC1623n;
        }

        public final void a() {
            this.f22296a = null;
            this.f22297b = null;
        }

        public final void b(long j10) {
            InterfaceC1623n interfaceC1623n;
            Object objB;
            Function1 function1 = this.f22296a;
            if (function1 == null || (interfaceC1623n = this.f22297b) == null) {
                return;
            }
            try {
                u.a aVar = Td.u.f17466b;
                objB = Td.u.b(function1.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                u.a aVar2 = Td.u.f17466b;
                objB = Td.u.b(Td.v.a(th2));
            }
            interfaceC1623n.resumeWith(objB);
        }

        public final void c(Throwable th2) {
            InterfaceC1623n interfaceC1623n = this.f22297b;
            if (interfaceC1623n != null) {
                u.a aVar = Td.u.f17466b;
                interfaceC1623n.resumeWith(Td.u.b(Td.v.a(th2)));
            }
        }
    }

    /* JADX INFO: renamed from: Y.e$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f22298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2401e f22299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f22300c;

        c(b bVar, C2401e c2401e, kotlin.jvm.internal.L l10) {
            this.f22298a = bVar;
            this.f22299b = c2401e;
            this.f22300c = l10;
        }

        public final void a(Throwable th2) {
            int i10;
            this.f22298a.a();
            C4819a c4819a = this.f22299b.f22292d;
            int i11 = this.f22300c.f52257a;
            do {
                i10 = c4819a.get();
            } while (!c4819a.compareAndSet(i10, ((i10 >>> 27) & 15) == i11 ? i10 - 1 : i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Td.L.f17438a;
        }
    }

    public C2401e(InterfaceC5082a interfaceC5082a) {
        this.f22289a = interfaceC5082a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Throwable th2) {
        int i10;
        synchronized (this.f22290b) {
            try {
                if (this.f22291c != null) {
                    return;
                }
                this.f22291c = th2;
                C6546L c6546l = this.f22293e;
                Object[] objArr = c6546l.f60006a;
                int i11 = c6546l.f60007b;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((b) objArr[i12]).c(th2);
                }
                this.f22293e.n();
                C4819a c4819a = this.f22292d;
                do {
                    i10 = c4819a.get();
                } while (!c4819a.compareAndSet(i10, a.d(c4819a, ((i10 >>> 27) & 15) + 1, 0)));
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // Y.InterfaceC2446t0
    public Object A1(Function1 function1, Zd.e eVar) {
        int i10;
        int i11;
        boolean z10 = true;
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        b bVar = new b(function1, c1627p);
        kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
        l10.f52257a = -1;
        synchronized (this.f22290b) {
            Throwable th2 = this.f22291c;
            if (th2 != null) {
                u.a aVar = Td.u.f17466b;
                c1627p.resumeWith(Td.u.b(Td.v.a(th2)));
            } else {
                C4819a c4819a = this.f22292d;
                do {
                    i10 = c4819a.get();
                    i11 = i10 + 1;
                } while (!c4819a.compareAndSet(i10, i11));
                if ((134217727 & i11) != 1) {
                    z10 = false;
                }
                l10.f52257a = (i11 >>> 27) & 15;
                this.f22293e.k(bVar);
                c1627p.p(new c(bVar, this, l10));
                if (z10 && this.f22289a != null) {
                    try {
                        this.f22289a.invoke();
                    } catch (Throwable th3) {
                        m(th3);
                    }
                }
            }
        }
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }

    @Override // Zd.i
    public Zd.i a1(i.c cVar) {
        return InterfaceC2446t0.a.c(this, cVar);
    }

    @Override // Zd.i.b, Zd.i
    public i.b l(i.c cVar) {
        return InterfaceC2446t0.a.b(this, cVar);
    }

    public final boolean n() {
        return (this.f22292d.get() & 134217727) > 0;
    }

    public final void p(long j10) {
        int i10;
        int i11;
        synchronized (this.f22290b) {
            try {
                C6546L c6546l = this.f22293e;
                this.f22293e = this.f22294f;
                this.f22294f = c6546l;
                C4819a c4819a = this.f22292d;
                do {
                    i10 = c4819a.get();
                } while (!c4819a.compareAndSet(i10, a.d(c4819a, ((i10 >>> 27) & 15) + 1, 0)));
                int iD = c6546l.d();
                for (i11 = 0; i11 < iD; i11++) {
                    ((b) c6546l.c(i11)).b(j10);
                }
                c6546l.n();
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Zd.i
    public Zd.i w(Zd.i iVar) {
        return InterfaceC2446t0.a.d(this, iVar);
    }

    @Override // Zd.i
    public Object y1(Object obj, Function2 function2) {
        return InterfaceC2446t0.a.a(this, obj, function2);
    }

    /* JADX INFO: renamed from: Y.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0382a f22295a = new C0382a(null);

        /* JADX INFO: renamed from: Y.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0382a {
            public /* synthetic */ C0382a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0382a() {
            }
        }

        public static C4819a b() {
            return c(new C4819a(0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(C4819a c4819a, int i10, int i11) {
            return ((i10 & 15) << 27) | (134217727 & i11);
        }

        private static C4819a c(C4819a c4819a) {
            return c4819a;
        }
    }
}
