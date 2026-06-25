package androidx.compose.ui.layout;

import androidx.compose.ui.e;
import i1.C5025r;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class q extends e.c implements K0.D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function1 f26999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27000b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27001c;

    public q(Function1 function1) {
        this.f26999a = function1;
        long j10 = Integer.MIN_VALUE;
        this.f27001c = C5025r.c((j10 & 4294967295L) | (j10 << 32));
    }

    public final void E1(Function1 function1) {
        this.f26999a = function1;
        long j10 = Integer.MIN_VALUE;
        this.f27001c = C5025r.c((j10 & 4294967295L) | (j10 << 32));
    }

    @Override // K0.D
    public void I(long j10) {
        if (C5025r.e(this.f27001c, j10)) {
            return;
        }
        this.f26999a.invoke(C5025r.b(j10));
        this.f27001c = j10;
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return this.f27000b;
    }
}
