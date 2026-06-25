package x;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: renamed from: x.Q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6997Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f63288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C.A f63289b;

    public /* synthetic */ C6997Q(long j10, C.A a10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, a10);
    }

    public final C.A a() {
        return this.f63289b;
    }

    public final long b() {
        return this.f63288a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5504s.c(C6997Q.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        C6997Q c6997q = (C6997Q) obj;
        return C6385r0.s(this.f63288a, c6997q.f63288a) && AbstractC5504s.c(this.f63289b, c6997q.f63289b);
    }

    public int hashCode() {
        return (C6385r0.y(this.f63288a) * 31) + this.f63289b.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) C6385r0.z(this.f63288a)) + ", drawPadding=" + this.f63289b + ')';
    }

    private C6997Q(long j10, C.A a10) {
        this.f63288a = j10;
        this.f63289b = a10;
    }

    public /* synthetic */ C6997Q(long j10, C.A a10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC6387s0.d(4284900966L) : j10, (i10 & 2) != 0 ? androidx.compose.foundation.layout.p.c(0.0f, 0.0f, 3, null) : a10, null);
    }
}
