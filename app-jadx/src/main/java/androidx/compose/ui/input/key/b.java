package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class b extends e.c implements C0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function1 f26840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Function1 f26841b;

    public b(Function1 function1, Function1 function12) {
        this.f26840a = function1;
        this.f26841b = function12;
    }

    @Override // C0.e
    public boolean E0(KeyEvent keyEvent) {
        Function1 function1 = this.f26841b;
        if (function1 != null) {
            return ((Boolean) function1.invoke(C0.b.a(keyEvent))).booleanValue();
        }
        return false;
    }

    public final void E1(Function1 function1) {
        this.f26840a = function1;
    }

    public final void F1(Function1 function1) {
        this.f26841b = function1;
    }

    @Override // C0.e
    public boolean T0(KeyEvent keyEvent) {
        Function1 function1 = this.f26840a;
        if (function1 != null) {
            return ((Boolean) function1.invoke(C0.b.a(keyEvent))).booleanValue();
        }
        return false;
    }
}
