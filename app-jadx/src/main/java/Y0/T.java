package Y0;

import Y0.t0;
import android.graphics.Typeface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f22640a = e0.a();

    public t0 a(q0 q0Var, U u10, Function1 function1, Function1 function12) {
        Typeface typefaceC;
        AbstractC2485u abstractC2485uC = q0Var.c();
        if (abstractC2485uC == null || (abstractC2485uC instanceof C2480o)) {
            typefaceC = this.f22640a.c(q0Var.f(), q0Var.d());
        } else if (abstractC2485uC instanceof P) {
            typefaceC = this.f22640a.b((P) q0Var.c(), q0Var.f(), q0Var.d());
        } else {
            if (!(abstractC2485uC instanceof Q)) {
                return null;
            }
            h0 h0VarL = ((Q) q0Var.c()).l();
            AbstractC5504s.f(h0VarL, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceC = ((d1.k) h0VarL).a(q0Var.f(), q0Var.d(), q0Var.e());
        }
        return new t0.b(typefaceC, false, 2, null);
    }
}
