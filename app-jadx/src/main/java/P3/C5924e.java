package p3;

import U2.AbstractC2257s;
import U2.InterfaceC2256q;
import java.util.Arrays;
import t2.AbstractC6614a;
import t2.C6609I;

/* JADX INFO: renamed from: p3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5924e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5925f f55757a = new C5925f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6609I f55758b = new C6609I(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55759c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f55760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55761e;

    C5924e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f55760d = 0;
        do {
            int i13 = this.f55760d;
            int i14 = i10 + i13;
            C5925f c5925f = this.f55757a;
            if (i14 >= c5925f.f55768g) {
                break;
            }
            int[] iArr = c5925f.f55771j;
            this.f55760d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public C5925f b() {
        return this.f55757a;
    }

    public C6609I c() {
        return this.f55758b;
    }

    public boolean d(InterfaceC2256q interfaceC2256q) {
        int i10;
        AbstractC6614a.g(interfaceC2256q != null);
        if (this.f55761e) {
            this.f55761e = false;
            this.f55758b.X(0);
        }
        while (!this.f55761e) {
            if (this.f55759c < 0) {
                if (!this.f55757a.c(interfaceC2256q) || !this.f55757a.a(interfaceC2256q, true)) {
                    return false;
                }
                C5925f c5925f = this.f55757a;
                int iA = c5925f.f55769h;
                if ((c5925f.f55763b & 1) == 1 && this.f55758b.j() == 0) {
                    iA += a(0);
                    i10 = this.f55760d;
                } else {
                    i10 = 0;
                }
                if (!AbstractC2257s.f(interfaceC2256q, iA)) {
                    return false;
                }
                this.f55759c = i10;
            }
            int iA2 = a(this.f55759c);
            int i11 = this.f55759c + this.f55760d;
            if (iA2 > 0) {
                C6609I c6609i = this.f55758b;
                c6609i.d(c6609i.j() + iA2);
                if (!AbstractC2257s.e(interfaceC2256q, this.f55758b.f(), this.f55758b.j(), iA2)) {
                    return false;
                }
                C6609I c6609i2 = this.f55758b;
                c6609i2.a0(c6609i2.j() + iA2);
                this.f55761e = this.f55757a.f55771j[i11 + (-1)] != 255;
            }
            if (i11 == this.f55757a.f55768g) {
                i11 = -1;
            }
            this.f55759c = i11;
        }
        return true;
    }

    public void e() {
        this.f55757a.b();
        this.f55758b.X(0);
        this.f55759c = -1;
        this.f55761e = false;
    }

    public void f() {
        if (this.f55758b.f().length == 65025) {
            return;
        }
        C6609I c6609i = this.f55758b;
        c6609i.Z(Arrays.copyOf(c6609i.f(), Math.max(65025, this.f55758b.j())), this.f55758b.j());
    }
}
