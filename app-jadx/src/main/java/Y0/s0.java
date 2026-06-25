package Y0;

import Y.h2;
import kotlin.jvm.functions.Function1;
import t.C6575z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1.u f22721a = new d1.u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6575z f22722b = new C6575z(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L c(s0 s0Var, q0 q0Var, t0 t0Var) {
        synchronized (s0Var.f22721a) {
            try {
                if (t0Var.e()) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Td.L.f17438a;
    }

    public final h2 b(final q0 q0Var, Function1 function1) {
        synchronized (this.f22721a) {
            t0 t0Var = (t0) this.f22722b.d(q0Var);
            if (t0Var != null) {
                if (t0Var.e()) {
                    return t0Var;
                }
            }
            try {
                t0 t0Var2 = (t0) function1.invoke(new Function1() { // from class: Y0.r0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s0.c(this.f22719a, q0Var, (t0) obj);
                    }
                });
                synchronized (this.f22721a) {
                    try {
                        if (this.f22722b.d(q0Var) == null && t0Var2.e()) {
                            this.f22722b.f(q0Var, t0Var2);
                        }
                        Td.L l10 = Td.L.f17438a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return t0Var2;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
