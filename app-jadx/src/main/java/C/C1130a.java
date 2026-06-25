package C;

import Y.C0;
import Y.b2;
import androidx.core.view.L0;
import i1.EnumC5027t;
import i1.InterfaceC5011d;

/* JADX INFO: renamed from: C.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1130a implements P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0 f2091d = b2.e(A1.b.f103e, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0 f2092e = b2.e(Boolean.TRUE, null, 2, null);

    public C1130a(int i10, String str) {
        this.f2089b = i10;
        this.f2090c = str;
    }

    private final void g(boolean z10) {
        this.f2092e.setValue(Boolean.valueOf(z10));
    }

    @Override // C.P
    public int a(InterfaceC5011d interfaceC5011d) {
        return e().f107d;
    }

    @Override // C.P
    public int b(InterfaceC5011d interfaceC5011d) {
        return e().f105b;
    }

    @Override // C.P
    public int c(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        return e().f106c;
    }

    @Override // C.P
    public int d(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        return e().f104a;
    }

    public final A1.b e() {
        return (A1.b) this.f2091d.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1130a) && this.f2089b == ((C1130a) obj).f2089b;
    }

    public final void f(A1.b bVar) {
        this.f2091d.setValue(bVar);
    }

    public final void h(L0 l02, int i10) {
        if (i10 == 0 || (i10 & this.f2089b) != 0) {
            f(l02.f(this.f2089b));
            g(l02.r(this.f2089b));
        }
    }

    public int hashCode() {
        return this.f2089b;
    }

    public String toString() {
        return this.f2090c + '(' + e().f104a + ", " + e().f105b + ", " + e().f106c + ", " + e().f107d + ')';
    }
}
