package U;

import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;

/* JADX INFO: renamed from: U.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2187y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f18678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f18681d;

    public /* synthetic */ C2187y(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public static /* synthetic */ C2187y d(C2187y c2187y, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = c2187y.f18678a;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = c2187y.f18679b;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = c2187y.f18680c;
        }
        return c2187y.c(j14, j15, j12, (i10 & 8) != 0 ? c2187y.f18681d : j13);
    }

    public final long a(boolean z10) {
        return z10 ? this.f18678a : this.f18680c;
    }

    public final long b(boolean z10) {
        return z10 ? this.f18679b : this.f18681d;
    }

    public final C2187y c(long j10, long j11, long j12, long j13) {
        return new C2187y(j10 != 16 ? j10 : this.f18678a, j11 != 16 ? j11 : this.f18679b, j12 != 16 ? j12 : this.f18680c, j13 != 16 ? j13 : this.f18681d, null);
    }

    public final long e() {
        return this.f18679b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2187y)) {
            return false;
        }
        C2187y c2187y = (C2187y) obj;
        return C6385r0.s(this.f18678a, c2187y.f18678a) && C6385r0.s(this.f18679b, c2187y.f18679b) && C6385r0.s(this.f18680c, c2187y.f18680c) && C6385r0.s(this.f18681d, c2187y.f18681d);
    }

    public int hashCode() {
        return (((((C6385r0.y(this.f18678a) * 31) + C6385r0.y(this.f18679b)) * 31) + C6385r0.y(this.f18680c)) * 31) + C6385r0.y(this.f18681d);
    }

    private C2187y(long j10, long j11, long j12, long j13) {
        this.f18678a = j10;
        this.f18679b = j11;
        this.f18680c = j12;
        this.f18681d = j13;
    }
}
