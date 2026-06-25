package C;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: C.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1140k implements J0.d {

    /* JADX INFO: renamed from: b */
    private final Function1 f2143b;

    /* JADX INFO: renamed from: c */
    private P f2144c;

    public C1140k(Function1 function1) {
        this.f2143b = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1140k) && ((C1140k) obj).f2143b == this.f2143b;
    }

    @Override // J0.d
    public void f(J0.k kVar) {
        P p10 = (P) kVar.j(T.a());
        if (AbstractC5504s.c(p10, this.f2144c)) {
            return;
        }
        this.f2144c = p10;
        this.f2143b.invoke(p10);
    }

    public int hashCode() {
        return this.f2143b.hashCode();
    }
}
