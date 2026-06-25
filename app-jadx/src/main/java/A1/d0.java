package a1;

import U0.C2197e;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a */
    private final C2197e f23584a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2517J f23585b;

    public d0(C2197e c2197e, InterfaceC2517J interfaceC2517J) {
        this.f23584a = c2197e;
        this.f23585b = interfaceC2517J;
    }

    public final InterfaceC2517J a() {
        return this.f23585b;
    }

    public final C2197e b() {
        return this.f23584a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return AbstractC5504s.c(this.f23584a, d0Var.f23584a) && AbstractC5504s.c(this.f23585b, d0Var.f23585b);
    }

    public int hashCode() {
        return (this.f23584a.hashCode() * 31) + this.f23585b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.f23584a) + ", offsetMapping=" + this.f23585b + ')';
    }
}
