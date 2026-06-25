package N2;

import N2.f;
import U2.C2249j;
import U2.O;
import q2.AbstractC6079K;
import q2.C6109x;
import t2.C6609I;
import w2.C6930D;
import w2.InterfaceC6940g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class j extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f12646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f12647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f f12648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f12649r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f12650s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f12651t;

    public j(InterfaceC6940g interfaceC6940g, w2.o oVar, C6109x c6109x, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, f fVar) {
        super(interfaceC6940g, oVar, c6109x, i10, obj, j10, j11, j12, j13, j14);
        this.f12646o = i11;
        this.f12647p = j15;
        this.f12648q = fVar;
    }

    private void m(c cVar) {
        if (AbstractC6079K.q(this.f12608d.f57021n)) {
            C6109x c6109x = this.f12608d;
            int i10 = c6109x.f57004N;
            if ((i10 <= 1 && c6109x.f57005O <= 1) || i10 == -1 || c6109x.f57005O == -1) {
                return;
            }
            O oE = cVar.e(0, 4);
            C6109x c6109x2 = this.f12608d;
            int i11 = c6109x2.f57004N * c6109x2.f57005O;
            long j10 = (this.f12612h - this.f12611g) / ((long) i11);
            for (int i12 = 1; i12 < i11; i12++) {
                oE.f(new C6609I(), 0);
                oE.a(((long) i12) * j10, 0, 0, 0, null);
            }
        }
    }

    @Override // Q2.m.e
    public final void a() {
        c cVarJ = j();
        if (this.f12649r == 0) {
            cVarJ.b(this.f12647p);
            f fVar = this.f12648q;
            f.b bVarL = l(cVarJ);
            long j10 = this.f12575k;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f12647p;
            long j12 = this.f12576l;
            fVar.c(bVarL, j11, j12 != -9223372036854775807L ? j12 - this.f12647p : -9223372036854775807L);
        }
        try {
            w2.o oVarE = this.f12606b.e(this.f12649r);
            C6930D c6930d = this.f12613i;
            C2249j c2249j = new C2249j(c6930d, oVarE.f62831g, c6930d.a(oVarE));
            do {
                try {
                    if (this.f12650s) {
                        break;
                    }
                } finally {
                    this.f12649r = c2249j.getPosition() - this.f12606b.f62831g;
                }
            } while (this.f12648q.b(c2249j));
            m(cVarJ);
            this.f12649r = c2249j.getPosition() - this.f12606b.f62831g;
            n();
            w2.n.a(this.f12613i);
            this.f12651t = !this.f12650s;
        } catch (Throwable th2) {
            n();
            w2.n.a(this.f12613i);
            throw th2;
        }
    }

    @Override // Q2.m.e
    public final void c() {
        this.f12650s = true;
    }

    @Override // N2.m
    public long g() {
        return this.f12659j + ((long) this.f12646o);
    }

    @Override // N2.m
    public boolean h() {
        return this.f12651t;
    }

    protected void n() {
    }

    protected f.b l(c cVar) {
        return cVar;
    }
}
