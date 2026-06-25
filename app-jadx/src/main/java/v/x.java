package v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import w.InterfaceC6878G;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f61689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6878G f61690b;

    public x(Function1 function1, InterfaceC6878G interfaceC6878G) {
        this.f61689a = function1;
        this.f61690b = interfaceC6878G;
    }

    public final InterfaceC6878G a() {
        return this.f61690b;
    }

    public final Function1 b() {
        return this.f61689a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return AbstractC5504s.c(this.f61689a, xVar.f61689a) && AbstractC5504s.c(this.f61690b, xVar.f61690b);
    }

    public int hashCode() {
        return (this.f61689a.hashCode() * 31) + this.f61690b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f61689a + ", animationSpec=" + this.f61690b + ')';
    }
}
