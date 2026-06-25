package U;

import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;

/* JADX INFO: renamed from: U.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2171h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f18352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f18355d;

    public /* synthetic */ C2171h(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public final long a(boolean z10) {
        return z10 ? this.f18352a : this.f18354c;
    }

    public final long b(boolean z10) {
        return z10 ? this.f18353b : this.f18355d;
    }

    public final C2171h c(long j10, long j11, long j12, long j13) {
        return new C2171h(j10 != 16 ? j10 : this.f18352a, j11 != 16 ? j11 : this.f18353b, j12 != 16 ? j12 : this.f18354c, j13 != 16 ? j13 : this.f18355d, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2171h)) {
            return false;
        }
        C2171h c2171h = (C2171h) obj;
        return C6385r0.s(this.f18352a, c2171h.f18352a) && C6385r0.s(this.f18353b, c2171h.f18353b) && C6385r0.s(this.f18354c, c2171h.f18354c) && C6385r0.s(this.f18355d, c2171h.f18355d);
    }

    public int hashCode() {
        return (((((C6385r0.y(this.f18352a) * 31) + C6385r0.y(this.f18353b)) * 31) + C6385r0.y(this.f18354c)) * 31) + C6385r0.y(this.f18355d);
    }

    private C2171h(long j10, long j11, long j12, long j13) {
        this.f18352a = j10;
        this.f18353b = j11;
        this.f18354c = j12;
        this.f18355d = j13;
    }
}
