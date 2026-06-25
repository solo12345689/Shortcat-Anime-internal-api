package N2;

import U2.C2249j;
import U2.O;
import q2.C6109x;
import w2.InterfaceC6940g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f12661o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C6109x f12662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f12663q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f12664r;

    public o(InterfaceC6940g interfaceC6940g, w2.o oVar, C6109x c6109x, int i10, Object obj, long j10, long j11, long j12, int i11, C6109x c6109x2) {
        super(interfaceC6940g, oVar, c6109x, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f12661o = i11;
        this.f12662p = c6109x2;
    }

    @Override // Q2.m.e
    public void a() {
        c cVarJ = j();
        cVarJ.b(0L);
        O oE = cVarJ.e(0, this.f12661o);
        oE.c(this.f12662p);
        try {
            long jA = this.f12613i.a(this.f12606b.e(this.f12663q));
            if (jA != -1) {
                jA += this.f12663q;
            }
            C2249j c2249j = new C2249j(this.f12613i, this.f12663q, jA);
            for (int iE = 0; iE != -1; iE = oE.e(c2249j, Integer.MAX_VALUE, true)) {
                this.f12663q += (long) iE;
            }
            oE.a(this.f12611g, 1, (int) this.f12663q, 0, null);
            w2.n.a(this.f12613i);
            this.f12664r = true;
        } catch (Throwable th2) {
            w2.n.a(this.f12613i);
            throw th2;
        }
    }

    @Override // N2.m
    public boolean h() {
        return this.f12664r;
    }

    @Override // Q2.m.e
    public void c() {
    }
}
