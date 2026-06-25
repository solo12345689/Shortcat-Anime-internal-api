package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import q0.InterfaceC6058d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class c extends e.c implements InterfaceC6058d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function1 f26649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q0.n f26650b;

    public c(Function1 function1) {
        this.f26649a = function1;
    }

    public final void E1(Function1 function1) {
        this.f26649a = function1;
    }

    @Override // q0.InterfaceC6058d
    public void W0(q0.n nVar) {
        if (AbstractC5504s.c(this.f26650b, nVar)) {
            return;
        }
        this.f26650b = nVar;
        this.f26649a.invoke(nVar);
    }
}
