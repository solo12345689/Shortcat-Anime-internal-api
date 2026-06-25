package A;

import ae.AbstractC2605b;
import kotlin.jvm.functions.Function1;
import w.AbstractC6908l;
import w.InterfaceC6921z;
import z.u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6921z f42a;

    public c(InterfaceC6921z interfaceC6921z) {
        this.f42a = interfaceC6921z;
    }

    @Override // A.b
    public /* bridge */ /* synthetic */ Object a(u uVar, Object obj, Object obj2, Function1 function1, Zd.e eVar) {
        return b(uVar, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), function1, eVar);
    }

    public Object b(u uVar, float f10, float f11, Function1 function1, Zd.e eVar) {
        Object objF = i.f(uVar, f10, AbstractC6908l.c(0.0f, f11, 0L, 0L, false, 28, null), this.f42a, function1, eVar);
        return objF == AbstractC2605b.f() ? objF : (a) objF;
    }
}
