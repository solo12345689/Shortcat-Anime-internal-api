package U2;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class L implements InterfaceC2255p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f18930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private O f18931g;

    public L(int i10, int i11, String str) {
        this.f18925a = i10;
        this.f18926b = i11;
        this.f18927c = str;
    }

    private void d(String str) {
        O oE = this.f18930f.e(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 4);
        this.f18931g = oE;
        oE.c(new C6109x.b().W(str).y0(str).P());
        this.f18930f.p();
        this.f18930f.t(new M(-9223372036854775807L));
        this.f18929e = 1;
    }

    private void e(InterfaceC2256q interfaceC2256q) {
        int iE = ((O) AbstractC6614a.e(this.f18931g)).e(interfaceC2256q, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, true);
        if (iE != -1) {
            this.f18928d += iE;
            return;
        }
        this.f18929e = 2;
        this.f18931g.a(0L, 1, this.f18928d, 0, null);
        this.f18928d = 0;
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        if (j10 == 0 || this.f18929e == 1) {
            this.f18929e = 1;
            this.f18928d = 0;
        }
    }

    @Override // U2.InterfaceC2255p
    public void c(r rVar) {
        this.f18930f = rVar;
        d(this.f18927c);
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        AbstractC6614a.g((this.f18925a == -1 || this.f18926b == -1) ? false : true);
        C6609I c6609i = new C6609I(this.f18926b);
        interfaceC2256q.o(c6609i.f(), 0, this.f18926b);
        return c6609i.U() == this.f18925a;
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) {
        int i11 = this.f18929e;
        if (i11 == 1) {
            e(interfaceC2256q);
            return 0;
        }
        if (i11 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
