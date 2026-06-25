package Q;

import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f14062b;

    public /* synthetic */ J(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public final long a() {
        return this.f14062b;
    }

    public final long b() {
        return this.f14061a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        return C6385r0.s(this.f14061a, j10.f14061a) && C6385r0.s(this.f14062b, j10.f14062b);
    }

    public int hashCode() {
        return (C6385r0.y(this.f14061a) * 31) + C6385r0.y(this.f14062b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) C6385r0.z(this.f14061a)) + ", selectionBackgroundColor=" + ((Object) C6385r0.z(this.f14062b)) + ')';
    }

    private J(long j10, long j11) {
        this.f14061a = j10;
        this.f14062b = j11;
    }
}
