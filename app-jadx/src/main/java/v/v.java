package v;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.h2;
import kotlin.jvm.functions.Function1;
import s0.C6385r0;
import w.AbstractC6892c;
import w.AbstractC6906j;
import w.C6903h0;
import w.InterfaceC6904i;
import w.s0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a */
    private static final C6903h0 f61688a = AbstractC6906j.h(0.0f, 0.0f, null, 7, null);

    public static final h2 a(long j10, InterfaceC6904i interfaceC6904i, String str, Function1 function1, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6904i = f61688a;
        }
        InterfaceC6904i interfaceC6904i2 = interfaceC6904i;
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-451899108, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean zU = interfaceC2425m.U(C6385r0.v(j10));
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = (s0) i.a(C6385r0.f58985b).invoke(C6385r0.v(j10));
            interfaceC2425m.u(objD);
        }
        int i12 = i10 << 6;
        h2 h2VarE = AbstractC6892c.e(C6385r0.m(j10), (s0) objD, interfaceC6904i2, null, str2, function12, interfaceC2425m, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarE;
    }
}
