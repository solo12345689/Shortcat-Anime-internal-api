package androidx.compose.ui.input.rotary;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class b extends e.c implements G0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function1 f26852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Function1 f26853b;

    public b(Function1 function1, Function1 function12) {
        this.f26852a = function1;
        this.f26853b = function12;
    }

    public final void E1(Function1 function1) {
        this.f26852a = function1;
    }

    public final void F1(Function1 function1) {
        this.f26853b = function1;
    }

    @Override // G0.a
    public boolean V(G0.b bVar) {
        Function1 function1 = this.f26853b;
        if (function1 != null) {
            return ((Boolean) function1.invoke(bVar)).booleanValue();
        }
        return false;
    }

    @Override // G0.a
    public boolean x0(G0.b bVar) {
        Function1 function1 = this.f26852a;
        if (function1 != null) {
            return ((Boolean) function1.invoke(bVar)).booleanValue();
        }
        return false;
    }
}
