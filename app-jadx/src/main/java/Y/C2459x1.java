package Y;

import Gf.L;
import k0.C5418h;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Y.x1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2459x1 implements Gf.O, InterfaceC2453v1 {

    /* JADX INFO: renamed from: e */
    public static final a f22564e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f22565f = 8;

    /* JADX INFO: renamed from: g */
    public static final Zd.i f22566g = new C2404f();

    /* JADX INFO: renamed from: a */
    private final Zd.i f22567a;

    /* JADX INFO: renamed from: b */
    private final Zd.i f22568b;

    /* JADX INFO: renamed from: c */
    private final Object f22569c = this;

    /* JADX INFO: renamed from: d */
    private volatile Zd.i f22570d;

    /* JADX INFO: renamed from: Y.x1$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: Y.x1$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends Zd.a implements Gf.L {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C5418h f22571b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C2459x1 f22572c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L.b bVar, C5418h c5418h, C2459x1 c2459x1) {
            super(bVar);
            this.f22571b = c5418h;
            this.f22572c = c2459x1;
        }

        @Override // Gf.L
        public void z(Zd.i iVar, Throwable th2) throws Throwable {
            this.f22571b.a(th2, this.f22572c);
            Zd.i iVar2 = this.f22572c.f22568b;
            L.b bVar = Gf.L.f7522J;
            Gf.L l10 = (Gf.L) iVar2.l(bVar);
            if (l10 != null) {
                l10.z(iVar, th2);
                return;
            }
            Gf.L l11 = (Gf.L) this.f22572c.f22567a.l(bVar);
            if (l11 == null) {
                throw th2;
            }
            l11.z(iVar, th2);
        }
    }

    public C2459x1(Zd.i iVar, Zd.i iVar2) {
        this.f22567a = iVar;
        this.f22568b = iVar2;
    }

    @Override // Y.InterfaceC2453v1
    public void d() {
        f();
    }

    @Override // Y.InterfaceC2453v1
    public void e() {
        f();
    }

    public final void f() {
        synchronized (this.f22569c) {
            try {
                Zd.i iVar = this.f22570d;
                if (iVar == null) {
                    this.f22570d = f22566g;
                } else {
                    Gf.F0.d(iVar, new C2399d0());
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Gf.O
    public Zd.i getCoroutineContext() {
        Zd.i iVarW;
        Zd.i iVar = this.f22570d;
        if (iVar == null || iVar == f22566g) {
            C5418h c5418h = (C5418h) this.f22567a.l(C5418h.f51976b);
            Zd.i bVar = c5418h != null ? new b(Gf.L.f7522J, c5418h, this) : Zd.j.f23275a;
            synchronized (this.f22569c) {
                try {
                    iVarW = this.f22570d;
                    if (iVarW == null) {
                        Zd.i iVar2 = this.f22567a;
                        iVarW = iVar2.w(Gf.F0.a((Gf.C0) iVar2.l(Gf.C0.f7490K))).w(this.f22568b).w(bVar);
                    } else if (iVarW == f22566g) {
                        Zd.i iVar3 = this.f22567a;
                        Gf.A a10 = Gf.F0.a((Gf.C0) iVar3.l(Gf.C0.f7490K));
                        a10.k(new C2399d0());
                        iVarW = iVar3.w(a10).w(this.f22568b).w(bVar);
                    }
                    this.f22570d = iVarW;
                    Td.L l10 = Td.L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            iVar = iVarW;
        }
        AbstractC5504s.e(iVar);
        return iVar;
    }

    @Override // Y.InterfaceC2453v1
    public void c() {
    }
}
