package ye;

import kf.InterfaceC5475g;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ye.u */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7242u {
    protected AbstractC7242u() {
    }

    public final Integer a(AbstractC7242u visibility) {
        AbstractC5504s.h(visibility, "visibility");
        return b().a(visibility.b());
    }

    public abstract x0 b();

    public abstract String c();

    public final boolean d() {
        return b().c();
    }

    public abstract boolean e(InterfaceC5475g interfaceC5475g, InterfaceC7239q interfaceC7239q, InterfaceC7235m interfaceC7235m, boolean z10);

    public abstract AbstractC7242u f();

    public final String toString() {
        return b().toString();
    }
}
