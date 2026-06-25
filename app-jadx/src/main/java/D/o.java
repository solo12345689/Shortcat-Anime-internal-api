package D;

import F.H;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.D;
import pe.InterfaceC6024n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2 f3401a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h2 h2Var) {
            super(0);
            this.f3401a = h2Var;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return new k((Function1) this.f3401a.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2 f3402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f3403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f3404c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h2 h2Var, B b10, d dVar) {
            super(0);
            this.f3402a = h2Var;
            this.f3403b = b10;
            this.f3404c = dVar;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            k kVar = (k) this.f3402a.getValue();
            return new n(this.f3403b, kVar, this.f3404c, new H(this.f3403b.w(), kVar));
        }
    }

    public static final InterfaceC5082a a(B b10, Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-343736148, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)");
        }
        h2 h2VarO = U1.o(function1, interfaceC2425m, (i10 >> 3) & 14);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(b10)) || (i10 & 6) == 4;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new D(U1.c(U1.n(), new c(U1.c(U1.n(), new b(h2VarO)), b10, new d()))) { // from class: D.o.a
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
