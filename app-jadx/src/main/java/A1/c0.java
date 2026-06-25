package a1;

import U0.T0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a */
    private final C2529W f23582a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2520M f23583b;

    public c0(C2529W c2529w, InterfaceC2520M interfaceC2520M) {
        this.f23582a = c2529w;
        this.f23583b = interfaceC2520M;
    }

    public final void a() {
        this.f23582a.g(this);
    }

    public final boolean b() {
        return AbstractC5504s.c(this.f23582a.a(), this);
    }

    public final boolean c(C6226h c6226h) {
        boolean zB = b();
        if (zB) {
            this.f23583b.d(c6226h);
        }
        return zB;
    }

    public final boolean d(C2527U c2527u, C2527U c2527u2) {
        boolean zB = b();
        if (zB) {
            this.f23583b.f(c2527u, c2527u2);
        }
        return zB;
    }

    public final boolean e(C2527U c2527u, InterfaceC2517J interfaceC2517J, T0 t02, Function1 function1, C6226h c6226h, C6226h c6226h2) {
        boolean zB = b();
        if (zB) {
            this.f23583b.c(c2527u, interfaceC2517J, t02, function1, c6226h, c6226h2);
        }
        return zB;
    }
}
