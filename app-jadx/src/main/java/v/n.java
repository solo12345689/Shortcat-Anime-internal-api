package v;

import kotlin.jvm.internal.AbstractC5504s;
import w.InterfaceC6878G;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f61676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6878G f61677b;

    public n(float f10, InterfaceC6878G interfaceC6878G) {
        this.f61676a = f10;
        this.f61677b = interfaceC6878G;
    }

    public final float a() {
        return this.f61676a;
    }

    public final InterfaceC6878G b() {
        return this.f61677b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f61676a, nVar.f61676a) == 0 && AbstractC5504s.c(this.f61677b, nVar.f61677b);
    }

    public int hashCode() {
        return (Float.hashCode(this.f61676a) * 31) + this.f61677b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f61676a + ", animationSpec=" + this.f61677b + ')';
    }
}
