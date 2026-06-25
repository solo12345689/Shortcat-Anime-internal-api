package V;

import kotlin.jvm.internal.AbstractC5504s;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6226h f19592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19596e;

    public c(C6226h c6226h, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f19592a = c6226h;
        this.f19593b = z10;
        this.f19594c = z11;
        this.f19595d = z12;
        this.f19596e = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC5504s.c(this.f19592a, cVar.f19592a) && this.f19593b == cVar.f19593b && this.f19594c == cVar.f19594c && this.f19595d == cVar.f19595d && this.f19596e == cVar.f19596e;
    }

    public int hashCode() {
        return (((((((this.f19592a.hashCode() * 31) + Boolean.hashCode(this.f19593b)) * 31) + Boolean.hashCode(this.f19594c)) * 31) + Boolean.hashCode(this.f19595d)) * 31) + Boolean.hashCode(this.f19596e);
    }

    public String toString() {
        return "HingeInfo(bounds=" + this.f19592a + ", isFlat=" + this.f19593b + ", isVertical=" + this.f19594c + ", isSeparating=" + this.f19595d + ", isOccluding=" + this.f19596e + ')';
    }
}
