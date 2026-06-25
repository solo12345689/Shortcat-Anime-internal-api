package R0;

import Td.InterfaceC2158i;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: R0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2092a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2158i f14944b;

    public C2092a(String str, InterfaceC2158i interfaceC2158i) {
        this.f14943a = str;
        this.f14944b = interfaceC2158i;
    }

    public final InterfaceC2158i a() {
        return this.f14944b;
    }

    public final String b() {
        return this.f14943a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2092a)) {
            return false;
        }
        C2092a c2092a = (C2092a) obj;
        return AbstractC5504s.c(this.f14943a, c2092a.f14943a) && AbstractC5504s.c(this.f14944b, c2092a.f14944b);
    }

    public int hashCode() {
        String str = this.f14943a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC2158i interfaceC2158i = this.f14944b;
        return iHashCode + (interfaceC2158i != null ? interfaceC2158i.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f14943a + ", action=" + this.f14944b + ')';
    }
}
