package Y;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class P implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f22168a;

    public P(Function1 function1) {
        this.f22168a = function1;
    }

    @Override // Y.n2
    public Object a(U0 u02) {
        return this.f22168a.invoke(u02);
    }

    public final Function1 b() {
        return this.f22168a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P) && AbstractC5504s.c(this.f22168a, ((P) obj).f22168a);
    }

    public int hashCode() {
        return this.f22168a.hashCode();
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.f22168a + ')';
    }
}
