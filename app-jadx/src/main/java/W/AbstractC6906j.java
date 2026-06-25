package w;

import kotlin.jvm.functions.Function1;
import w.S;

/* JADX INFO: renamed from: w.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6906j {
    public static final AbstractC6913q b(s0 s0Var, Object obj) {
        if (obj == null) {
            return null;
        }
        return (AbstractC6913q) s0Var.a().invoke(obj);
    }

    public static final InterfaceC6904i c(InterfaceC6904i interfaceC6904i, long j10) {
        return new C6905i0(interfaceC6904i, j10);
    }

    public static final C6884M d(InterfaceC6874C interfaceC6874C, EnumC6891b0 enumC6891b0, long j10) {
        return new C6884M(interfaceC6874C, enumC6891b0, j10, null);
    }

    public static /* synthetic */ C6884M e(InterfaceC6874C interfaceC6874C, EnumC6891b0 enumC6891b0, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC6891b0 = EnumC6891b0.Restart;
        }
        if ((i10 & 4) != 0) {
            j10 = k0.c(0, 0, 2, null);
        }
        return d(interfaceC6874C, enumC6891b0, j10);
    }

    public static final S f(Function1 function1) {
        S.b bVar = new S.b();
        function1.invoke(bVar);
        return new S(bVar);
    }

    public static final C6903h0 g(float f10, float f11, Object obj) {
        return new C6903h0(f10, f11, obj);
    }

    public static /* synthetic */ C6903h0 h(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return g(f10, f11, obj);
    }

    public static final r0 i(int i10, int i11, InterfaceC6875D interfaceC6875D) {
        return new r0(i10, i11, interfaceC6875D);
    }

    public static /* synthetic */ r0 j(int i10, int i11, InterfaceC6875D interfaceC6875D, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            interfaceC6875D = AbstractC6877F.d();
        }
        return i(i10, i11, interfaceC6875D);
    }
}
