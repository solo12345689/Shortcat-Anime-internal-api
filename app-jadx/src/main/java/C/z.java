package C;

import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class z implements P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P f2192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2193c;

    public /* synthetic */ z(P p10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(p10, i10);
    }

    @Override // C.P
    public int a(InterfaceC5011d interfaceC5011d) {
        if (V.j(this.f2193c, V.f2072a.e())) {
            return this.f2192b.a(interfaceC5011d);
        }
        return 0;
    }

    @Override // C.P
    public int b(InterfaceC5011d interfaceC5011d) {
        if (V.j(this.f2193c, V.f2072a.g())) {
            return this.f2192b.b(interfaceC5011d);
        }
        return 0;
    }

    @Override // C.P
    public int c(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        if (V.j(this.f2193c, enumC5027t == EnumC5027t.f48573a ? V.f2072a.c() : V.f2072a.d())) {
            return this.f2192b.c(interfaceC5011d, enumC5027t);
        }
        return 0;
    }

    @Override // C.P
    public int d(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        if (V.j(this.f2193c, enumC5027t == EnumC5027t.f48573a ? V.f2072a.a() : V.f2072a.b())) {
            return this.f2192b.d(interfaceC5011d, enumC5027t);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return AbstractC5504s.c(this.f2192b, zVar.f2192b) && V.i(this.f2193c, zVar.f2193c);
    }

    public int hashCode() {
        return (this.f2192b.hashCode() * 31) + V.k(this.f2193c);
    }

    public String toString() {
        return '(' + this.f2192b + " only " + ((Object) V.m(this.f2193c)) + ')';
    }

    private z(P p10, int i10) {
        this.f2192b = p10;
        this.f2193c = i10;
    }
}
