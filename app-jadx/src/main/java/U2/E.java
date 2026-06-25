package U2;

import U2.J;
import t2.AbstractC6614a;
import t2.C6636x;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6636x f18900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6636x f18901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f18902c;

    public E(long[] jArr, long[] jArr2, long j10) {
        AbstractC6614a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f18900a = new C6636x(length);
            this.f18901b = new C6636x(length);
        } else {
            int i10 = length + 1;
            C6636x c6636x = new C6636x(i10);
            this.f18900a = c6636x;
            C6636x c6636x2 = new C6636x(i10);
            this.f18901b = c6636x2;
            c6636x.a(0L);
            c6636x2.a(0L);
        }
        this.f18900a.b(jArr);
        this.f18901b.b(jArr2);
        this.f18902c = j10;
    }

    public void a(long j10, long j11) {
        if (this.f18901b.d() == 0 && j10 > 0) {
            this.f18900a.a(0L);
            this.f18901b.a(0L);
        }
        this.f18900a.a(j11);
        this.f18901b.a(j10);
    }

    public boolean b(long j10, long j11) {
        if (this.f18901b.d() == 0) {
            return false;
        }
        C6636x c6636x = this.f18901b;
        return j10 - c6636x.c(c6636x.d() - 1) < j11;
    }

    public void c(long j10) {
        this.f18902c = j10;
    }

    public long d(long j10) {
        if (this.f18901b.d() == 0) {
            return -9223372036854775807L;
        }
        return this.f18901b.c(a0.i(this.f18900a, j10, true, true));
    }

    @Override // U2.J
    public J.a g(long j10) {
        if (this.f18901b.d() == 0) {
            return new J.a(K.f18922c);
        }
        int i10 = a0.i(this.f18901b, j10, true, true);
        K k10 = new K(this.f18901b.c(i10), this.f18900a.c(i10));
        if (k10.f18923a == j10 || i10 == this.f18901b.d() - 1) {
            return new J.a(k10);
        }
        int i11 = i10 + 1;
        return new J.a(k10, new K(this.f18901b.c(i11), this.f18900a.c(i11)));
    }

    @Override // U2.J
    public boolean k() {
        return this.f18901b.d() > 0;
    }

    @Override // U2.J
    public long n() {
        return this.f18902c;
    }
}
