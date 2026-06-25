package x;

import ae.AbstractC2605b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import r0.C6224f;

/* JADX INFO: renamed from: x.P, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6996P implements InterfaceC6999T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6996P f63287a = new C6996P();

    private C6996P() {
    }

    @Override // x.InterfaceC6999T
    public boolean a() {
        return false;
    }

    @Override // x.InterfaceC6999T
    public androidx.compose.ui.e b() {
        return androidx.compose.ui.e.f26613a;
    }

    @Override // x.InterfaceC6999T
    public long c(long j10, int i10, Function1 function1) {
        return ((C6224f) function1.invoke(C6224f.d(j10))).u();
    }

    @Override // x.InterfaceC6999T
    public Object d(long j10, Function2 function2, Zd.e eVar) {
        Object objInvoke = function2.invoke(i1.y.b(j10), eVar);
        return objInvoke == AbstractC2605b.f() ? objInvoke : Td.L.f17438a;
    }
}
