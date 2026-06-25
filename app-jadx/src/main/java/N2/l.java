package N2;

import N2.f;
import U2.C2246g;
import U2.C2249j;
import q2.C6109x;
import w2.C6930D;
import w2.InterfaceC6940g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f12654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f.b f12655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C2246g f12656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f12657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f12658n;

    public l(InterfaceC6940g interfaceC6940g, w2.o oVar, C6109x c6109x, int i10, Object obj, f fVar) {
        super(interfaceC6940g, oVar, 2, c6109x, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f12654j = fVar;
    }

    @Override // Q2.m.e
    public void a() {
        if (this.f12657m == 0) {
            this.f12654j.c(this.f12655k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            w2.o oVarE = this.f12606b.e(this.f12657m);
            C6930D c6930d = this.f12613i;
            C2249j c2249j = new C2249j(c6930d, oVarE.f62831g, c6930d.a(oVarE));
            while (!this.f12658n && this.f12654j.b(c2249j)) {
                try {
                } finally {
                    this.f12657m = c2249j.getPosition() - this.f12606b.f62831g;
                    this.f12656l = this.f12654j.d();
                }
            }
        } finally {
            w2.n.a(this.f12613i);
        }
    }

    @Override // Q2.m.e
    public void c() {
        this.f12658n = true;
    }

    public void g(f.b bVar) {
        this.f12655k = bVar;
    }
}
