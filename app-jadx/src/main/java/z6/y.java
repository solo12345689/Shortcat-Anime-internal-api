package z6;

import android.content.Context;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.q0;
import java.util.Set;
import s6.InterfaceC6436a;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class y {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Class f65918p = y.class;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static y f65919q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static C7305t f65920r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f65921s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f65922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7307v f65923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C7287a f65924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y5.n f65925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x6.n f65926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x6.u f65927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x6.n f65928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private x6.u f65929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C6.c f65930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private M6.d f65931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C f65932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private W f65933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private w6.d f65934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private I6.d f65935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC6436a f65936o;

    public y(InterfaceC7307v interfaceC7307v) {
        if (L6.b.d()) {
            L6.b.a("ImagePipelineConfig()");
        }
        InterfaceC7307v interfaceC7307v2 = (InterfaceC7307v) y5.k.g(interfaceC7307v);
        this.f65923b = interfaceC7307v2;
        this.f65922a = interfaceC7307v2.G().G() ? new com.facebook.imagepipeline.producers.B(interfaceC7307v.H().a()) : new q0(interfaceC7307v.H().a());
        this.f65924c = new C7287a(interfaceC7307v.w());
        if (L6.b.d()) {
            L6.b.b();
        }
        this.f65925d = interfaceC7307v2.v();
        if (interfaceC7307v2.G().A()) {
            q6.e.e().g(true);
        }
    }

    private C7305t a() {
        W wP = p();
        Set setE = this.f65923b.e();
        Set setA = this.f65923b.a();
        y5.n nVarC = this.f65923b.C();
        x6.u uVarE = e();
        x6.u uVarH = h();
        y5.n nVar = this.f65925d;
        x6.k kVarY = this.f65923b.y();
        p0 p0Var = this.f65922a;
        y5.n nVarT = this.f65923b.G().t();
        y5.n nVarI = this.f65923b.G().I();
        this.f65923b.F();
        return new C7305t(wP, setE, setA, nVarC, uVarE, uVarH, nVar, kVarY, p0Var, nVarT, nVarI, null, this.f65923b);
    }

    private InterfaceC6436a c() {
        if (this.f65936o == null) {
            this.f65936o = s6.b.a(m(), this.f65923b.H(), d(), this.f65923b.G().j(), this.f65923b.G().v(), this.f65923b.G().c(), this.f65923b.G().d(), this.f65923b.l());
        }
        return this.f65936o;
    }

    private C6.c i() {
        C6.c cVarC;
        C6.c cVarB;
        if (this.f65930i == null) {
            if (this.f65923b.r() != null) {
                this.f65930i = this.f65923b.r();
            } else {
                InterfaceC6436a interfaceC6436aC = c();
                if (interfaceC6436aC != null) {
                    cVarC = interfaceC6436aC.c();
                    cVarB = interfaceC6436aC.b();
                } else {
                    cVarC = null;
                    cVarB = null;
                }
                C6.c cVarR = r();
                this.f65923b.o();
                this.f65930i = new C6.b(cVarC, cVarB, cVarR, n());
            }
        }
        return this.f65930i;
    }

    private M6.d k() {
        if (this.f65931j == null) {
            if (this.f65923b.n() == null && this.f65923b.m() == null && this.f65923b.G().J()) {
                this.f65931j = new M6.h(this.f65923b.G().m());
            } else {
                this.f65931j = new M6.f(this.f65923b.G().m(), this.f65923b.G().x(), this.f65923b.n(), this.f65923b.m(), this.f65923b.G().F());
            }
        }
        return this.f65931j;
    }

    public static y l() {
        return (y) y5.k.h(f65919q, "ImagePipelineFactory was not initialized!");
    }

    private C o() {
        if (this.f65932k == null) {
            this.f65932k = this.f65923b.G().p().a(this.f65923b.getContext(), this.f65923b.t().k(), i(), this.f65923b.h(), this.f65923b.E(), this.f65923b.z(), this.f65923b.G().B(), this.f65923b.H(), this.f65923b.t().i(this.f65923b.u()), this.f65923b.t().j(), e(), h(), this.f65925d, this.f65923b.y(), m(), this.f65923b.G().g(), this.f65923b.G().f(), this.f65923b.G().e(), this.f65923b.G().m(), f(), this.f65923b.G().l(), this.f65923b.G().u());
        }
        return this.f65932k;
    }

    private W p() {
        boolean zW = this.f65923b.G().w();
        if (this.f65933l == null) {
            this.f65933l = new W(this.f65923b.getContext().getApplicationContext().getContentResolver(), o(), this.f65923b.b(), this.f65923b.z(), this.f65923b.G().L(), this.f65922a, this.f65923b.E(), zW, this.f65923b.G().K(), this.f65923b.p(), k(), this.f65923b.G().E(), this.f65923b.G().C(), this.f65923b.G().a(), this.f65923b.A());
        }
        return this.f65933l;
    }

    public static synchronized void s(Context context) {
        try {
            if (L6.b.d()) {
                L6.b.a("ImagePipelineFactory#initialize");
            }
            t(C7306u.K(context).a());
            if (L6.b.d()) {
                L6.b.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void t(InterfaceC7307v interfaceC7307v) {
        if (f65919q != null) {
            AbstractC7283a.E(f65918p, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            if (f65921s) {
                return;
            }
        }
        f65919q = new y(interfaceC7307v);
    }

    public D6.a b(Context context) {
        InterfaceC6436a interfaceC6436aC = c();
        if (interfaceC6436aC == null) {
            return null;
        }
        return interfaceC6436aC.a(context);
    }

    public x6.n d() {
        if (this.f65926e == null) {
            this.f65926e = this.f65923b.x().a(this.f65923b.q(), this.f65923b.D(), this.f65923b.g(), this.f65923b.G().r(), this.f65923b.G().q(), this.f65923b.k());
        }
        return this.f65926e;
    }

    public x6.u e() {
        if (this.f65927f == null) {
            this.f65927f = x6.v.a(d(), this.f65923b.B());
        }
        return this.f65927f;
    }

    public C7287a f() {
        return this.f65924c;
    }

    public x6.n g() {
        if (this.f65928g == null) {
            this.f65928g = x6.r.a(this.f65923b.s(), this.f65923b.D(), this.f65923b.f());
        }
        return this.f65928g;
    }

    public x6.u h() {
        if (this.f65929h == null) {
            this.f65929h = x6.s.a(this.f65923b.c() != null ? this.f65923b.c() : g(), this.f65923b.B());
        }
        return this.f65929h;
    }

    public C7305t j() {
        if (f65920r == null) {
            f65920r = a();
        }
        return f65920r;
    }

    public w6.d m() {
        if (this.f65934m == null) {
            this.f65934m = w6.e.a(this.f65923b.t(), n(), f());
        }
        return this.f65934m;
    }

    public I6.d n() {
        if (this.f65935n == null) {
            this.f65935n = I6.e.a(this.f65923b.t(), this.f65923b.G().H(), this.f65923b.G().s(), this.f65923b.G().o());
        }
        return this.f65935n;
    }

    public D6.a q() {
        if (this.f65923b.G().A()) {
            return new O6.a();
        }
        return null;
    }

    public C6.c r() {
        if (this.f65923b.G().A()) {
            return new O6.b(this.f65923b.getContext().getApplicationContext().getResources());
        }
        return null;
    }
}
