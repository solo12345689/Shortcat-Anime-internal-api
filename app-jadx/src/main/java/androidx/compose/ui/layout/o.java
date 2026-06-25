package androidx.compose.ui.layout;

import I0.InterfaceC1690p;
import K0.InterfaceC1808v;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class o extends e.c implements InterfaceC1808v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function1 f26998a;

    public o(Function1 function1) {
        this.f26998a = function1;
    }

    public final void E1(Function1 function1) {
        this.f26998a = function1;
    }

    @Override // K0.InterfaceC1808v
    public void p(InterfaceC1690p interfaceC1690p) {
        this.f26998a.invoke(interfaceC1690p);
    }
}
