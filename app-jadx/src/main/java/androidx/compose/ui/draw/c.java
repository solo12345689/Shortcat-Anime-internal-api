package androidx.compose.ui.draw;

import K0.InterfaceC1806t;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import u0.InterfaceC6708c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class c extends e.c implements InterfaceC1806t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function1 f26610a;

    public c(Function1 function1) {
        this.f26610a = function1;
    }

    public final void E1(Function1 function1) {
        this.f26610a = function1;
    }

    @Override // K0.InterfaceC1806t
    public void draw(InterfaceC6708c interfaceC6708c) {
        this.f26610a.invoke(interfaceC6708c);
    }
}
