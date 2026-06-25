package Gf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class B0 extends H0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f7487e;

    public B0(Function1 function1) {
        this.f7487e = function1;
    }

    @Override // Gf.H0
    public boolean v() {
        return false;
    }

    @Override // Gf.H0
    public void w(Throwable th2) {
        this.f7487e.invoke(th2);
    }
}
