package C;

import Y.C0;
import Y.b2;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class N implements P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0 f2031c;

    public N(C1150v c1150v, String str) {
        this.f2030b = str;
        this.f2031c = b2.e(c1150v, null, 2, null);
    }

    @Override // C.P
    public int a(InterfaceC5011d interfaceC5011d) {
        return e().a();
    }

    @Override // C.P
    public int b(InterfaceC5011d interfaceC5011d) {
        return e().d();
    }

    @Override // C.P
    public int c(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        return e().c();
    }

    @Override // C.P
    public int d(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        return e().b();
    }

    public final C1150v e() {
        return (C1150v) this.f2031c.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N) {
            return AbstractC5504s.c(e(), ((N) obj).e());
        }
        return false;
    }

    public final void f(C1150v c1150v) {
        this.f2031c.setValue(c1150v);
    }

    public int hashCode() {
        return this.f2030b.hashCode();
    }

    public String toString() {
        return this.f2030b + "(left=" + e().b() + ", top=" + e().d() + ", right=" + e().c() + ", bottom=" + e().a() + ')';
    }
}
