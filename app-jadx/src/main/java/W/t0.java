package w;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class t0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f62672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f62673b;

    public t0(Function1 function1, Function1 function12) {
        this.f62672a = function1;
        this.f62673b = function12;
    }

    @Override // w.s0
    public Function1 a() {
        return this.f62672a;
    }

    @Override // w.s0
    public Function1 b() {
        return this.f62673b;
    }
}
