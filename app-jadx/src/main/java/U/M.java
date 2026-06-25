package U;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f17809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T.d f17810b;

    public /* synthetic */ M(long j10, T.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, dVar);
    }

    public final long a() {
        return this.f17809a;
    }

    public final T.d b() {
        return this.f17810b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return C6385r0.s(this.f17809a, m10.f17809a) && AbstractC5504s.c(this.f17810b, m10.f17810b);
    }

    public int hashCode() {
        int iY = C6385r0.y(this.f17809a) * 31;
        T.d dVar = this.f17810b;
        return iY + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + ((Object) C6385r0.z(this.f17809a)) + ", rippleAlpha=" + this.f17810b + ')';
    }

    private M(long j10, T.d dVar) {
        this.f17809a = j10;
        this.f17810b = dVar;
    }

    public /* synthetic */ M(long j10, T.d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C6385r0.f58985b.j() : j10, (i10 & 2) != 0 ? null : dVar, null);
    }
}
