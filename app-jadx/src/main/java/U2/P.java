package U2;

import U2.O;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f18938a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f18941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18944g;

    public void a(O o10, O.a aVar) {
        if (this.f18940c > 0) {
            o10.a(this.f18941d, this.f18942e, this.f18943f, this.f18944g, aVar);
            this.f18940c = 0;
        }
    }

    public void b() {
        this.f18939b = false;
        this.f18940c = 0;
    }

    public void c(O o10, long j10, int i10, int i11, int i12, O.a aVar) {
        AbstractC6614a.h(this.f18944g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f18939b) {
            int i13 = this.f18940c;
            int i14 = i13 + 1;
            this.f18940c = i14;
            if (i13 == 0) {
                this.f18941d = j10;
                this.f18942e = i10;
                this.f18943f = 0;
            }
            this.f18943f += i11;
            this.f18944g = i12;
            if (i14 >= 16) {
                a(o10, aVar);
            }
        }
    }

    public void d(InterfaceC2256q interfaceC2256q) {
        if (this.f18939b) {
            return;
        }
        interfaceC2256q.o(this.f18938a, 0, 10);
        interfaceC2256q.g();
        if (AbstractC2241b.j(this.f18938a) == 0) {
            return;
        }
        this.f18939b = true;
    }
}
