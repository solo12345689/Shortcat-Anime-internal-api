package B3;

import B3.L;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f1083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6609I f1084b = new C6609I(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1088f;

    public E(D d10) {
        this.f1083a = d10;
    }

    @Override // B3.L
    public void a(t2.O o10, U2.r rVar, L.d dVar) {
        this.f1083a.a(o10, rVar, dVar);
        this.f1088f = true;
    }

    @Override // B3.L
    public void b(C6609I c6609i, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int iG = z10 ? c6609i.g() + c6609i.M() : -1;
        if (this.f1088f) {
            if (!z10) {
                return;
            }
            this.f1088f = false;
            c6609i.b0(iG);
            this.f1086d = 0;
        }
        while (c6609i.a() > 0) {
            int i11 = this.f1086d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iM = c6609i.M();
                    c6609i.b0(c6609i.g() - 1);
                    if (iM == 255) {
                        this.f1088f = true;
                        return;
                    }
                }
                int iMin = Math.min(c6609i.a(), 3 - this.f1086d);
                c6609i.q(this.f1084b.f(), this.f1086d, iMin);
                int i12 = this.f1086d + iMin;
                this.f1086d = i12;
                if (i12 == 3) {
                    this.f1084b.b0(0);
                    this.f1084b.a0(3);
                    this.f1084b.c0(1);
                    int iM2 = this.f1084b.M();
                    int iM3 = this.f1084b.M();
                    this.f1087e = (iM2 & 128) != 0;
                    this.f1085c = (((iM2 & 15) << 8) | iM3) + 3;
                    int iB = this.f1084b.b();
                    int i13 = this.f1085c;
                    if (iB < i13) {
                        this.f1084b.d(Math.min(4098, Math.max(i13, this.f1084b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c6609i.a(), this.f1085c - this.f1086d);
                c6609i.q(this.f1084b.f(), this.f1086d, iMin2);
                int i14 = this.f1086d + iMin2;
                this.f1086d = i14;
                int i15 = this.f1085c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f1087e) {
                        this.f1084b.a0(i15);
                    } else {
                        if (a0.z(this.f1084b.f(), 0, this.f1085c, -1) != 0) {
                            this.f1088f = true;
                            return;
                        }
                        this.f1084b.a0(this.f1085c - 4);
                    }
                    this.f1084b.b0(0);
                    this.f1083a.b(this.f1084b);
                    this.f1086d = 0;
                }
            }
        }
    }

    @Override // B3.L
    public void c() {
        this.f1088f = true;
    }
}
