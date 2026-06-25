package J;

import i1.C5015h;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f9193a;

    public /* synthetic */ d(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    @Override // J.b
    public float a(long j10, InterfaceC5011d interfaceC5011d) {
        return interfaceC5011d.l1(this.f9193a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && C5015h.q(this.f9193a, ((d) obj).f9193a);
    }

    public int hashCode() {
        return C5015h.r(this.f9193a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f9193a + ".dp)";
    }

    private d(float f10) {
        this.f9193a = f10;
    }
}
