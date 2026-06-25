package A2;

import q2.C6083O;
import t2.InterfaceC6623j;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class S implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6623j f173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C6083O f177e = C6083O.f56598d;

    public S(InterfaceC6623j interfaceC6623j) {
        this.f173a = interfaceC6623j;
    }

    @Override // A2.L
    public long I() {
        long j10 = this.f175c;
        if (!this.f174b) {
            return j10;
        }
        long jC = this.f173a.c() - this.f176d;
        C6083O c6083o = this.f177e;
        return j10 + (c6083o.f56601a == 1.0f ? a0.V0(jC) : c6083o.b(jC));
    }

    public void a(long j10) {
        this.f175c = j10;
        if (this.f174b) {
            this.f176d = this.f173a.c();
        }
    }

    public void b() {
        if (this.f174b) {
            return;
        }
        this.f176d = this.f173a.c();
        this.f174b = true;
    }

    @Override // A2.L
    public C6083O c() {
        return this.f177e;
    }

    public void d() {
        if (this.f174b) {
            a(I());
            this.f174b = false;
        }
    }

    @Override // A2.L
    public void e(C6083O c6083o) {
        if (this.f174b) {
            a(I());
        }
        this.f177e = c6083o;
    }
}
