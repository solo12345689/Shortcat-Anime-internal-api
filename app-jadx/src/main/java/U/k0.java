package U;

import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6387s0;
import s0.C6385r0;
import w.AbstractC6877F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f18512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f18515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f18516e;

    public /* synthetic */ k0(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14);
    }

    public final long a(float f10) {
        return AbstractC6387s0.i(this.f18512a, this.f18513b, AbstractC6877F.c().a(f10));
    }

    public final k0 b(long j10, long j11, long j12, long j13, long j14) {
        return new k0(j10 != 16 ? j10 : this.f18512a, j11 != 16 ? j11 : this.f18513b, j12 != 16 ? j12 : this.f18514c, j13 != 16 ? j13 : this.f18515d, j14 != 16 ? j14 : this.f18516e, null);
    }

    public final long c() {
        return this.f18516e;
    }

    public final long d() {
        return this.f18514c;
    }

    public final long e() {
        return this.f18515d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return C6385r0.s(this.f18512a, k0Var.f18512a) && C6385r0.s(this.f18513b, k0Var.f18513b) && C6385r0.s(this.f18514c, k0Var.f18514c) && C6385r0.s(this.f18515d, k0Var.f18515d) && C6385r0.s(this.f18516e, k0Var.f18516e);
    }

    public int hashCode() {
        return (((((((C6385r0.y(this.f18512a) * 31) + C6385r0.y(this.f18513b)) * 31) + C6385r0.y(this.f18514c)) * 31) + C6385r0.y(this.f18515d)) * 31) + C6385r0.y(this.f18516e);
    }

    private k0(long j10, long j11, long j12, long j13, long j14) {
        this.f18512a = j10;
        this.f18513b = j11;
        this.f18514c = j12;
        this.f18515d = j13;
        this.f18516e = j14;
    }
}
