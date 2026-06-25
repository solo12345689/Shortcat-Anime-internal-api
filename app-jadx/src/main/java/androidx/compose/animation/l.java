package androidx.compose.animation;

import i1.C5025r;
import kotlin.jvm.functions.Function2;
import v.w;
import w.InterfaceC6878G;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class l implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f25713b;

    public l(boolean z10, Function2 function2) {
        this.f25712a = z10;
        this.f25713b = function2;
    }

    @Override // v.w
    public InterfaceC6878G a(long j10, long j11) {
        return (InterfaceC6878G) this.f25713b.invoke(C5025r.b(j10), C5025r.b(j11));
    }

    @Override // v.w
    public boolean l() {
        return this.f25712a;
    }
}
