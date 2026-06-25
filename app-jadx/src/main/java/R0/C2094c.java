package R0;

import K0.A0;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: R0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2094c extends e.c implements A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f14947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Function1 f14949c;

    public C2094c(boolean z10, boolean z11, Function1 function1) {
        this.f14947a = z10;
        this.f14948b = z11;
        this.f14949c = function1;
    }

    public final void E1(boolean z10) {
        this.f14947a = z10;
    }

    public final void F1(Function1 function1) {
        this.f14949c = function1;
    }

    @Override // K0.A0
    public void Y(C c10) {
        this.f14949c.invoke(c10);
    }

    @Override // K0.A0
    public boolean Z() {
        return this.f14948b;
    }

    @Override // K0.A0
    public boolean z1() {
        return this.f14947a;
    }
}
