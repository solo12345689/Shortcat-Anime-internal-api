package M2;

import M2.C;
import M2.D;
import androidx.media3.exoplayer.C2905q0;
import java.io.IOException;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: M2.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1935z implements C, C.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D.b f12063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q2.b f12065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private D f12066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C f12067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C.a f12068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f12069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f12071i = -9223372036854775807L;

    /* JADX INFO: renamed from: M2.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(D.b bVar);

        void b(D.b bVar, IOException iOException);
    }

    public C1935z(D.b bVar, Q2.b bVar2, long j10) {
        this.f12063a = bVar;
        this.f12065c = bVar2;
        this.f12064b = j10;
    }

    private long t(long j10) {
        long j11 = this.f12071i;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // M2.C, M2.d0
    public boolean a(C2905q0 c2905q0) {
        C c10 = this.f12067e;
        return c10 != null && c10.a(c2905q0);
    }

    @Override // M2.C.a
    public void b(C c10) {
        ((C.a) t2.a0.l(this.f12068f)).b(this);
        a aVar = this.f12069g;
        if (aVar != null) {
            aVar.a(this.f12063a);
        }
    }

    @Override // M2.C, M2.d0
    public long c() {
        return ((C) t2.a0.l(this.f12067e)).c();
    }

    @Override // M2.C
    public long d(long j10, A2.Q q10) {
        return ((C) t2.a0.l(this.f12067e)).d(j10, q10);
    }

    @Override // M2.C, M2.d0
    public long f() {
        return ((C) t2.a0.l(this.f12067e)).f();
    }

    @Override // M2.C, M2.d0
    public void g(long j10) {
        ((C) t2.a0.l(this.f12067e)).g(j10);
    }

    public void h(D.b bVar) {
        long jT = t(this.f12064b);
        C cF = ((D) AbstractC6614a.e(this.f12066d)).f(bVar, this.f12065c, jT);
        this.f12067e = cF;
        if (this.f12068f != null) {
            cF.l(this, jT);
        }
    }

    @Override // M2.C
    public long i(long j10) {
        return ((C) t2.a0.l(this.f12067e)).i(j10);
    }

    @Override // M2.C
    public long k() {
        return ((C) t2.a0.l(this.f12067e)).k();
    }

    @Override // M2.C
    public void l(C.a aVar, long j10) {
        this.f12068f = aVar;
        C c10 = this.f12067e;
        if (c10 != null) {
            c10.l(this, t(this.f12064b));
        }
    }

    public long n() {
        return this.f12071i;
    }

    @Override // M2.C
    public void o() throws IOException {
        try {
            C c10 = this.f12067e;
            if (c10 != null) {
                c10.o();
                return;
            }
            D d10 = this.f12066d;
            if (d10 != null) {
                d10.l();
            }
        } catch (IOException e10) {
            a aVar = this.f12069g;
            if (aVar == null) {
                throw e10;
            }
            if (this.f12070h) {
                return;
            }
            this.f12070h = true;
            aVar.b(this.f12063a, e10);
        }
    }

    public long p() {
        return this.f12064b;
    }

    @Override // M2.C, M2.d0
    public boolean q() {
        C c10 = this.f12067e;
        return c10 != null && c10.q();
    }

    @Override // M2.C
    public long r(P2.A[] aArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        long j11 = this.f12071i;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f12064b) ? j10 : j11;
        this.f12071i = -9223372036854775807L;
        return ((C) t2.a0.l(this.f12067e)).r(aArr, zArr, c0VarArr, zArr2, j12);
    }

    @Override // M2.C
    public n0 s() {
        return ((C) t2.a0.l(this.f12067e)).s();
    }

    @Override // M2.C
    public void u(long j10, boolean z10) {
        ((C) t2.a0.l(this.f12067e)).u(j10, z10);
    }

    @Override // M2.d0.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void j(C c10) {
        ((C.a) t2.a0.l(this.f12068f)).j(this);
    }

    public void w(long j10) {
        this.f12071i = j10;
    }

    public void x() {
        if (this.f12067e != null) {
            ((D) AbstractC6614a.e(this.f12066d)).m(this.f12067e);
        }
    }

    public void y(D d10) {
        AbstractC6614a.g(this.f12066d == null);
        this.f12066d = d10;
    }
}
