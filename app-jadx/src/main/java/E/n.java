package E;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import pe.InterfaceC6024n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2 f3918a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h2 h2Var) {
            super(0);
            this.f3918a = h2Var;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1289j invoke() {
            return new C1289j((Function1) this.f3918a.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2 f3919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ I f3920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h2 h2Var, I i10) {
            super(0);
            this.f3919a = h2Var;
            this.f3920b = i10;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            C1289j c1289j = (C1289j) this.f3919a.getValue();
            return new m(this.f3920b, c1289j, new F.H(this.f3920b.u(), c1289j));
        }
    }

    public static final InterfaceC5082a a(I i10, Function1 function1, InterfaceC2425m interfaceC2425m, int i11) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1898306282, i11, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        h2 h2VarO = U1.o(function1, interfaceC2425m, (i11 >> 3) & 14);
        boolean z10 = (((i11 & 14) ^ 6) > 4 && interfaceC2425m.U(i10)) || (i11 & 6) == 4;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new kotlin.jvm.internal.D(U1.c(U1.n(), new c(U1.c(U1.n(), new b(h2VarO)), i10))) { // from class: E.n.a
                @Override // pe.InterfaceC6024n
                public Object get() {
                    return ((h2) this.receiver).getValue();
                }
            };
            interfaceC2425m.u(objD);
        }
        InterfaceC6024n interfaceC6024n = (InterfaceC6024n) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return interfaceC6024n;
    }
}
