package C;

import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: C.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1144o implements P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P f2163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P f2164c;

    public C1144o(P p10, P p11) {
        this.f2163b = p10;
        this.f2164c = p11;
    }

    @Override // C.P
    public int a(InterfaceC5011d interfaceC5011d) {
        return AbstractC5874j.e(this.f2163b.a(interfaceC5011d) - this.f2164c.a(interfaceC5011d), 0);
    }

    @Override // C.P
    public int b(InterfaceC5011d interfaceC5011d) {
        return AbstractC5874j.e(this.f2163b.b(interfaceC5011d) - this.f2164c.b(interfaceC5011d), 0);
    }

    @Override // C.P
    public int c(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        return AbstractC5874j.e(this.f2163b.c(interfaceC5011d, enumC5027t) - this.f2164c.c(interfaceC5011d, enumC5027t), 0);
    }

    @Override // C.P
    public int d(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        return AbstractC5874j.e(this.f2163b.d(interfaceC5011d, enumC5027t) - this.f2164c.d(interfaceC5011d, enumC5027t), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1144o)) {
            return false;
        }
        C1144o c1144o = (C1144o) obj;
        return AbstractC5504s.c(c1144o.f2163b, this.f2163b) && AbstractC5504s.c(c1144o.f2164c, this.f2164c);
    }

    public int hashCode() {
        return (this.f2163b.hashCode() * 31) + this.f2164c.hashCode();
    }

    public String toString() {
        return '(' + this.f2163b + " - " + this.f2164c + ')';
    }
}
