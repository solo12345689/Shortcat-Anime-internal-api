package C;

import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class M implements P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P f2028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P f2029c;

    public M(P p10, P p11) {
        this.f2028b = p10;
        this.f2029c = p11;
    }

    @Override // C.P
    public int a(InterfaceC5011d interfaceC5011d) {
        return Math.max(this.f2028b.a(interfaceC5011d), this.f2029c.a(interfaceC5011d));
    }

    @Override // C.P
    public int b(InterfaceC5011d interfaceC5011d) {
        return Math.max(this.f2028b.b(interfaceC5011d), this.f2029c.b(interfaceC5011d));
    }

    @Override // C.P
    public int c(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        return Math.max(this.f2028b.c(interfaceC5011d, enumC5027t), this.f2029c.c(interfaceC5011d, enumC5027t));
    }

    @Override // C.P
    public int d(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        return Math.max(this.f2028b.d(interfaceC5011d, enumC5027t), this.f2029c.d(interfaceC5011d, enumC5027t));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return AbstractC5504s.c(m10.f2028b, this.f2028b) && AbstractC5504s.c(m10.f2029c, this.f2029c);
    }

    public int hashCode() {
        return this.f2028b.hashCode() + (this.f2029c.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.f2028b + " ∪ " + this.f2029c + ')';
    }
}
