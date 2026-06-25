package g0;

import Df.AbstractC1268a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47191a;

    public k(int i10) {
        this.f47191a = i10;
    }

    public final int a() {
        return this.f47191a;
    }

    public final void b(int i10) {
        this.f47191a = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("IntRef(element = ");
        sb2.append(this.f47191a);
        sb2.append(")@");
        String string = Integer.toString(hashCode(), AbstractC1268a.a(16));
        AbstractC5504s.g(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    public /* synthetic */ k(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
