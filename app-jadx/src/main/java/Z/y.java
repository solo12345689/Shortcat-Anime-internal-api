package z;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ h2 f65433a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h2 h2Var) {
            super(1);
            this.f65433a = h2Var;
        }

        public final Float a(float f10) {
            return (Float) ((Function1) this.f65433a.getValue()).invoke(Float.valueOf(f10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public static final x a(Function1 function1) {
        return new C7267i(function1);
    }

    public static final x b(Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-180460798, i10, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:161)");
        }
        h2 h2VarO = U1.o(function1, interfaceC2425m, i10 & 14);
        Object objD = interfaceC2425m.D();
        if (objD == InterfaceC2425m.f22370a.a()) {
            objD = a(new a(h2VarO));
            interfaceC2425m.u(objD);
        }
        x xVar = (x) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return xVar;
    }
}
