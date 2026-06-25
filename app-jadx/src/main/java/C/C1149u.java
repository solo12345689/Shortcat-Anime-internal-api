package C;

import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: C.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1149u implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P f2180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5011d f2181b;

    public C1149u(P p10, InterfaceC5011d interfaceC5011d) {
        this.f2180a = p10;
        this.f2181b = interfaceC5011d;
    }

    @Override // C.A
    public float a(EnumC5027t enumC5027t) {
        InterfaceC5011d interfaceC5011d = this.f2181b;
        return interfaceC5011d.A(this.f2180a.c(interfaceC5011d, enumC5027t));
    }

    @Override // C.A
    public float b(EnumC5027t enumC5027t) {
        InterfaceC5011d interfaceC5011d = this.f2181b;
        return interfaceC5011d.A(this.f2180a.d(interfaceC5011d, enumC5027t));
    }

    @Override // C.A
    public float c() {
        InterfaceC5011d interfaceC5011d = this.f2181b;
        return interfaceC5011d.A(this.f2180a.a(interfaceC5011d));
    }

    @Override // C.A
    public float d() {
        InterfaceC5011d interfaceC5011d = this.f2181b;
        return interfaceC5011d.A(this.f2180a.b(interfaceC5011d));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1149u)) {
            return false;
        }
        C1149u c1149u = (C1149u) obj;
        return AbstractC5504s.c(this.f2180a, c1149u.f2180a) && AbstractC5504s.c(this.f2181b, c1149u.f2181b);
    }

    public int hashCode() {
        return (this.f2180a.hashCode() * 31) + this.f2181b.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f2180a + ", density=" + this.f2181b + ')';
    }
}
