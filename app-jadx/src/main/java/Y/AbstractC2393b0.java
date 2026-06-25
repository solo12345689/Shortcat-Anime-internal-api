package Y;

import ie.InterfaceC5082a;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Y.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2393b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Y f22272a = new Y();

    public static final void a(Object obj, Object obj2, Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:190)");
        }
        boolean zU = interfaceC2425m.U(obj) | interfaceC2425m.U(obj2);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = new W(function1);
            interfaceC2425m.u(objD);
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }

    public static final void b(Object obj, Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:153)");
        }
        boolean zU = interfaceC2425m.U(obj);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = new W(function1);
            interfaceC2425m.u(objD);
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }

    public static final void c(Object[] objArr, Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1307627122, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:264)");
        }
        boolean zU = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zU |= interfaceC2425m.U(obj);
        }
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            interfaceC2425m.u(new W(function1));
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }

    public static final void d(Object obj, Object obj2, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        Zd.i iVarQ = interfaceC2425m.q();
        boolean zU = interfaceC2425m.U(obj) | interfaceC2425m.U(obj2);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = new C2435p0(iVarQ, function2);
            interfaceC2425m.u(objD);
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }

    public static final void e(Object obj, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:341)");
        }
        Zd.i iVarQ = interfaceC2425m.q();
        boolean zU = interfaceC2425m.U(obj);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = new C2435p0(iVarQ, function2);
            interfaceC2425m.u(objD);
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }

    public static final void f(Object[] objArr, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-139560008, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:407)");
        }
        Zd.i iVarQ = interfaceC2425m.q();
        boolean zU = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zU |= interfaceC2425m.U(obj);
        }
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            interfaceC2425m.u(new C2435p0(iVarQ, function2));
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }

    public static final void g(InterfaceC5082a interfaceC5082a, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:51)");
        }
        interfaceC2425m.t(interfaceC5082a);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }

    public static final Gf.O i(Zd.i iVar, InterfaceC2425m interfaceC2425m) {
        if (iVar.l(Gf.C0.f7490K) == null) {
            return new C2459x1(interfaceC2425m.q(), iVar);
        }
        Gf.A aB = Gf.G0.b(null, 1, null);
        aB.h(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return Gf.P.a(aB);
    }
}
