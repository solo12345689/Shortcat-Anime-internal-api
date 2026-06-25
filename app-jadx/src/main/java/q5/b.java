package Q5;

import E6.m;
import V5.F;
import java.io.Closeable;
import l6.C5556a;
import l6.InterfaceC5557b;
import l6.e;
import l6.i;
import l6.j;
import l6.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends C5556a implements Closeable, F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F5.b f14370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f14371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f14372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f14373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f14374g;

    public b(F5.b bVar, j jVar, i iVar) {
        this(bVar, jVar, iVar, true);
    }

    private void C(j jVar, e eVar) {
        jVar.H(eVar);
        this.f14372e.a(jVar, eVar);
        i iVar = this.f14373f;
        if (iVar != null) {
            iVar.a(jVar, eVar);
        }
    }

    private void D(j jVar, n nVar) {
        this.f14372e.b(jVar, nVar);
        i iVar = this.f14373f;
        if (iVar != null) {
            iVar.b(jVar, nVar);
        }
    }

    private void q(j jVar, long j10) {
        jVar.R(false);
        jVar.L(j10);
        D(jVar, n.f52666f);
    }

    @Override // l6.C5556a, l6.InterfaceC5557b
    public void b(String str, InterfaceC5557b.a aVar) {
        long jNow = this.f14370c.now();
        j jVar = this.f14371d;
        jVar.F(aVar);
        jVar.B(str);
        C(jVar, e.f52573j);
        if (this.f14374g) {
            q(jVar, jNow);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        z();
    }

    @Override // l6.C5556a, l6.InterfaceC5557b
    public void g(String str, Object obj, InterfaceC5557b.a aVar) {
        long jNow = this.f14370c.now();
        j jVar = this.f14371d;
        jVar.x();
        jVar.D(jNow);
        jVar.B(str);
        jVar.y(obj);
        jVar.F(aVar);
        C(jVar, e.f52568e);
        if (this.f14374g) {
            w(jVar, jNow);
        }
    }

    @Override // l6.C5556a, l6.InterfaceC5557b
    public void h(String str, Throwable th2, InterfaceC5557b.a aVar) {
        long jNow = this.f14370c.now();
        j jVar = this.f14371d;
        jVar.F(aVar);
        jVar.z(jNow);
        jVar.B(str);
        jVar.E(th2);
        C(jVar, e.f52571h);
        q(jVar, jNow);
    }

    @Override // V5.F
    public void l(boolean z10) {
        if (z10) {
            w(this.f14371d, this.f14370c.now());
        } else {
            q(this.f14371d, this.f14370c.now());
        }
    }

    @Override // l6.C5556a, l6.InterfaceC5557b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(String str, m mVar, InterfaceC5557b.a aVar) {
        long jNow = this.f14370c.now();
        j jVar = this.f14371d;
        jVar.F(aVar);
        jVar.A(jNow);
        jVar.J(jNow);
        jVar.B(str);
        jVar.G(mVar);
        C(jVar, e.f52570g);
    }

    @Override // l6.C5556a, l6.InterfaceC5557b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void a(String str, m mVar) {
        long jNow = this.f14370c.now();
        j jVar = this.f14371d;
        jVar.C(jNow);
        jVar.B(str);
        jVar.G(mVar);
        C(jVar, e.f52569f);
    }

    public void w(j jVar, long j10) {
        jVar.R(true);
        jVar.Q(j10);
        D(jVar, n.f52665e);
    }

    public void z() {
        this.f14371d.w();
    }

    public b(F5.b bVar, j jVar, i iVar, boolean z10) {
        this.f14373f = null;
        this.f14370c = bVar;
        this.f14371d = jVar;
        this.f14372e = iVar;
        this.f14374g = z10;
    }

    @Override // V5.F
    public void onDraw() {
    }
}
