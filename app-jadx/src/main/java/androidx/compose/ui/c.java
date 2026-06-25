package androidx.compose.ui;

import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.T0;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final a f26575a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(e.b bVar) {
            return Boolean.valueOf(!(bVar instanceof androidx.compose.ui.b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC2425m f26576a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2425m interfaceC2425m) {
            super(2);
            this.f26576a = interfaceC2425m;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final e invoke(e eVar, e.b bVar) {
            boolean z10 = bVar instanceof androidx.compose.ui.b;
            e eVarE = bVar;
            if (z10) {
                InterfaceC5096o interfaceC5096oA = ((androidx.compose.ui.b) bVar).a();
                AbstractC5504s.f(interfaceC5096oA, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                eVarE = c.e(this.f26576a, (e) ((InterfaceC5096o) V.e(interfaceC5096oA, 3)).invoke(e.f26613a, this.f26576a, 0));
            }
            return eVar.then(eVarE);
        }
    }

    public static final e b(e eVar, Function1 function1, InterfaceC5096o interfaceC5096o) {
        return eVar.then(new androidx.compose.ui.b(function1, interfaceC5096o));
    }

    public static /* synthetic */ e c(e eVar, Function1 function1, InterfaceC5096o interfaceC5096o, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = T0.a();
        }
        return b(eVar, function1, interfaceC5096o);
    }

    public static final e e(InterfaceC2425m interfaceC2425m, e eVar) {
        if (eVar.all(a.f26575a)) {
            return eVar;
        }
        interfaceC2425m.C(1219399079);
        e eVar2 = (e) eVar.foldIn(e.f26613a, new b(interfaceC2425m));
        interfaceC2425m.T();
        return eVar2;
    }

    public static final e f(InterfaceC2425m interfaceC2425m, e eVar) {
        interfaceC2425m.V(439770924);
        e eVarE = e(interfaceC2425m, eVar);
        interfaceC2425m.O();
        return eVarE;
    }

    public static final e g(InterfaceC2425m interfaceC2425m, e eVar) {
        return eVar == e.f26613a ? eVar : f(interfaceC2425m, new CompositionLocalMapInjectionElement(interfaceC2425m.r()).then(eVar));
    }
}
