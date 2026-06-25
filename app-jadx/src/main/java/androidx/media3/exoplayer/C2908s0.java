package androidx.media3.exoplayer;

import M2.D;
import java.util.Objects;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: androidx.media3.exoplayer.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2908s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D.b f31219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f31222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f31223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f31226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f31227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f31228j;

    C2908s0(D.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        AbstractC6614a.a(!z14 || z12);
        AbstractC6614a.a(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        AbstractC6614a.a(z15);
        this.f31219a = bVar;
        this.f31220b = j10;
        this.f31221c = j11;
        this.f31222d = j12;
        this.f31223e = j13;
        this.f31224f = z10;
        this.f31225g = z11;
        this.f31226h = z12;
        this.f31227i = z13;
        this.f31228j = z14;
    }

    public C2908s0 a(long j10) {
        return j10 == this.f31221c ? this : new C2908s0(this.f31219a, this.f31220b, j10, this.f31222d, this.f31223e, this.f31224f, this.f31225g, this.f31226h, this.f31227i, this.f31228j);
    }

    public C2908s0 b(long j10) {
        return j10 == this.f31220b ? this : new C2908s0(this.f31219a, j10, this.f31221c, this.f31222d, this.f31223e, this.f31224f, this.f31225g, this.f31226h, this.f31227i, this.f31228j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2908s0.class == obj.getClass()) {
            C2908s0 c2908s0 = (C2908s0) obj;
            if (this.f31220b == c2908s0.f31220b && this.f31221c == c2908s0.f31221c && this.f31222d == c2908s0.f31222d && this.f31223e == c2908s0.f31223e && this.f31224f == c2908s0.f31224f && this.f31225g == c2908s0.f31225g && this.f31226h == c2908s0.f31226h && this.f31227i == c2908s0.f31227i && this.f31228j == c2908s0.f31228j && Objects.equals(this.f31219a, c2908s0.f31219a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f31219a.hashCode()) * 31) + ((int) this.f31220b)) * 31) + ((int) this.f31221c)) * 31) + ((int) this.f31222d)) * 31) + ((int) this.f31223e)) * 31) + (this.f31224f ? 1 : 0)) * 31) + (this.f31225g ? 1 : 0)) * 31) + (this.f31226h ? 1 : 0)) * 31) + (this.f31227i ? 1 : 0)) * 31) + (this.f31228j ? 1 : 0);
    }
}
