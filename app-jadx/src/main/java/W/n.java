package W;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import ie.InterfaceC5096o;
import kotlin.jvm.internal.AbstractC5506u;
import w.AbstractC6877F;
import w.AbstractC6906j;
import w.InterfaceC6878G;
import w.o0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC5506u implements InterfaceC5096o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f20594a = new n();

    public n() {
        super(3);
    }

    public final InterfaceC6878G a(o0.b bVar, InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(-1154662212);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1154662212, i10, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:367)");
        }
        d dVar = d.Focused;
        d dVar2 = d.UnfocusedEmpty;
        InterfaceC6878G interfaceC6878GJ = bVar.c(dVar, dVar2) ? AbstractC6906j.j(67, 0, AbstractC6877F.e(), 2, null) : (bVar.c(dVar2, dVar) || bVar.c(d.UnfocusedNotEmpty, dVar2)) ? AbstractC6906j.i(83, 67, AbstractC6877F.e()) : AbstractC6906j.h(0.0f, 0.0f, null, 7, null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return interfaceC6878GJ;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((o0.b) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
    }
}
