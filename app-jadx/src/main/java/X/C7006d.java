package x;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.InterfaceC6341b1;
import s0.InterfaceC6364j0;
import s0.InterfaceC6374m1;
import u0.C6706a;

/* JADX INFO: renamed from: x.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C7006d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC6341b1 f63331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC6364j0 f63332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C6706a f63333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC6374m1 f63334d;

    public C7006d(InterfaceC6341b1 interfaceC6341b1, InterfaceC6364j0 interfaceC6364j0, C6706a c6706a, InterfaceC6374m1 interfaceC6374m1) {
        this.f63331a = interfaceC6341b1;
        this.f63332b = interfaceC6364j0;
        this.f63333c = c6706a;
        this.f63334d = interfaceC6374m1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7006d)) {
            return false;
        }
        C7006d c7006d = (C7006d) obj;
        return AbstractC5504s.c(this.f63331a, c7006d.f63331a) && AbstractC5504s.c(this.f63332b, c7006d.f63332b) && AbstractC5504s.c(this.f63333c, c7006d.f63333c) && AbstractC5504s.c(this.f63334d, c7006d.f63334d);
    }

    public final InterfaceC6374m1 g() {
        InterfaceC6374m1 interfaceC6374m1 = this.f63334d;
        if (interfaceC6374m1 != null) {
            return interfaceC6374m1;
        }
        InterfaceC6374m1 interfaceC6374m1A = s0.V.a();
        this.f63334d = interfaceC6374m1A;
        return interfaceC6374m1A;
    }

    public int hashCode() {
        InterfaceC6341b1 interfaceC6341b1 = this.f63331a;
        int iHashCode = (interfaceC6341b1 == null ? 0 : interfaceC6341b1.hashCode()) * 31;
        InterfaceC6364j0 interfaceC6364j0 = this.f63332b;
        int iHashCode2 = (iHashCode + (interfaceC6364j0 == null ? 0 : interfaceC6364j0.hashCode())) * 31;
        C6706a c6706a = this.f63333c;
        int iHashCode3 = (iHashCode2 + (c6706a == null ? 0 : c6706a.hashCode())) * 31;
        InterfaceC6374m1 interfaceC6374m1 = this.f63334d;
        return iHashCode3 + (interfaceC6374m1 != null ? interfaceC6374m1.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f63331a + ", canvas=" + this.f63332b + ", canvasDrawScope=" + this.f63333c + ", borderPath=" + this.f63334d + ')';
    }

    public /* synthetic */ C7006d(InterfaceC6341b1 interfaceC6341b1, InterfaceC6364j0 interfaceC6364j0, C6706a c6706a, InterfaceC6374m1 interfaceC6374m1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : interfaceC6341b1, (i10 & 2) != 0 ? null : interfaceC6364j0, (i10 & 4) != 0 ? null : c6706a, (i10 & 8) != 0 ? null : interfaceC6374m1);
    }
}
