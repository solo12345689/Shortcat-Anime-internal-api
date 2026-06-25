package Ke;

import gf.C4880c;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7227e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4880c f11076a;

    @Override // Ke.n
    public InterfaceC7227e a(Oe.g javaClass) {
        AbstractC5504s.h(javaClass, "javaClass");
        return b().b(javaClass);
    }

    public final C4880c b() {
        C4880c c4880c = this.f11076a;
        if (c4880c != null) {
            return c4880c;
        }
        AbstractC5504s.u("resolver");
        return null;
    }

    public final void c(C4880c c4880c) {
        AbstractC5504s.h(c4880c, "<set-?>");
        this.f11076a = c4880c;
    }
}
