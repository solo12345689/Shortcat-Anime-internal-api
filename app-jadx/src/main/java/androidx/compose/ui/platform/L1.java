package androidx.compose.ui.platform;

import Y.AbstractC2393b0;
import Y.AbstractC2454w;
import Y.C2397c1;
import Y.InterfaceC2425m;
import Y.InterfaceC2457x;
import ae.AbstractC2605b;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.InterfaceC2861o;
import java.util.Set;
import k0.AbstractC5425o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class L1 implements InterfaceC2457x, InterfaceC2861o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidComposeView f27291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2457x f27292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC2857k f27294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Function2 f27295e = C2735u0.f27497a.a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f27297b;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.L1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0469a extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1 f27298a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f27299b;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.L1$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0470a extends kotlin.coroutines.jvm.internal.l implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f27300a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ L1 f27301b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0470a(L1 l12, Zd.e eVar) {
                    super(2, eVar);
                    this.f27301b = l12;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Zd.e create(Object obj, Zd.e eVar) {
                    return new C0470a(this.f27301b, eVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Gf.O o10, Zd.e eVar) {
                    return ((C0470a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = AbstractC2605b.f();
                    int i10 = this.f27300a;
                    if (i10 == 0) {
                        Td.v.b(obj);
                        AndroidComposeView androidComposeViewF = this.f27301b.F();
                        this.f27300a = 1;
                        if (androidComposeViewF.o0(this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Td.v.b(obj);
                    }
                    return Td.L.f17438a;
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.L1$a$a$b */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f27302a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ L1 f27303b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(L1 l12, Zd.e eVar) {
                    super(2, eVar);
                    this.f27303b = l12;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Zd.e create(Object obj, Zd.e eVar) {
                    return new b(this.f27303b, eVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Gf.O o10, Zd.e eVar) {
                    return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = AbstractC2605b.f();
                    int i10 = this.f27302a;
                    if (i10 == 0) {
                        Td.v.b(obj);
                        AndroidComposeView androidComposeViewF = this.f27303b.F();
                        this.f27302a = 1;
                        if (androidComposeViewF.p0(this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Td.v.b(obj);
                    }
                    return Td.L.f17438a;
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.L1$a$a$c */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class c extends AbstractC5506u implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1 f27304a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function2 f27305b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(L1 l12, Function2 function2) {
                    super(2);
                    this.f27304a = l12;
                    this.f27305b = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
                    return Td.L.f17438a;
                }

                public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
                    if (!interfaceC2425m.p((i10 & 3) != 2, i10 & 1)) {
                        interfaceC2425m.K();
                        return;
                    }
                    if (AbstractC2454w.L()) {
                        AbstractC2454w.U(-280240369, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                    }
                    AndroidCompositionLocals_androidKt.a(this.f27304a.F(), this.f27305b, interfaceC2425m, 0);
                    if (AbstractC2454w.L()) {
                        AbstractC2454w.T();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0469a(L1 l12, Function2 function2) {
                super(2);
                this.f27298a = l12;
                this.f27299b = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
                return Td.L.f17438a;
            }

            public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
                if (!interfaceC2425m.p((i10 & 3) != 2, i10 & 1)) {
                    interfaceC2425m.K();
                    return;
                }
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(1330788943, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:123)");
                }
                Object tag = this.f27298a.F().getTag(l0.l.f52358K);
                Set set = kotlin.jvm.internal.V.o(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f27298a.F().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(l0.l.f52358K) : null;
                    set = kotlin.jvm.internal.V.o(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(interfaceC2425m.E());
                    interfaceC2425m.z();
                }
                AndroidComposeView androidComposeViewF = this.f27298a.F();
                boolean zF = interfaceC2425m.F(this.f27298a);
                L1 l12 = this.f27298a;
                Object objD = interfaceC2425m.D();
                if (zF || objD == InterfaceC2425m.f22370a.a()) {
                    objD = new C0470a(l12, null);
                    interfaceC2425m.u(objD);
                }
                AbstractC2393b0.e(androidComposeViewF, (Function2) objD, interfaceC2425m, 0);
                AndroidComposeView androidComposeViewF2 = this.f27298a.F();
                boolean zF2 = interfaceC2425m.F(this.f27298a);
                L1 l13 = this.f27298a;
                Object objD2 = interfaceC2425m.D();
                if (zF2 || objD2 == InterfaceC2425m.f22370a.a()) {
                    objD2 = new b(l13, null);
                    interfaceC2425m.u(objD2);
                }
                AbstractC2393b0.e(androidComposeViewF2, (Function2) objD2, interfaceC2425m, 0);
                Y.H.c(AbstractC5425o.c().d(set), g0.i.d(-280240369, true, new c(this.f27298a, this.f27299b), interfaceC2425m, 54), interfaceC2425m, C2397c1.f22274i | 48);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2) {
            super(1);
            this.f27297b = function2;
        }

        public final void a(AndroidComposeView.b bVar) {
            if (L1.this.f27293c) {
                return;
            }
            AbstractC2857k lifecycle = bVar.a().getLifecycle();
            L1.this.f27295e = this.f27297b;
            if (L1.this.f27294d == null) {
                L1.this.f27294d = lifecycle;
                lifecycle.addObserver(L1.this);
            } else if (lifecycle.getCurrentState().b(AbstractC2857k.b.f30237c)) {
                L1.this.D().h(g0.i.b(1330788943, true, new C0469a(L1.this, this.f27297b)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AndroidComposeView.b) obj);
            return Td.L.f17438a;
        }
    }

    public L1(AndroidComposeView androidComposeView, InterfaceC2457x interfaceC2457x) {
        this.f27291a = androidComposeView;
        this.f27292b = interfaceC2457x;
    }

    public final InterfaceC2457x D() {
        return this.f27292b;
    }

    public final AndroidComposeView F() {
        return this.f27291a;
    }

    @Override // Y.InterfaceC2457x
    public void dispose() {
        if (!this.f27293c) {
            this.f27293c = true;
            this.f27291a.getView().setTag(l0.l.f52359L, null);
            AbstractC2857k abstractC2857k = this.f27294d;
            if (abstractC2857k != null) {
                abstractC2857k.removeObserver(this);
            }
        }
        this.f27292b.dispose();
    }

    @Override // androidx.lifecycle.InterfaceC2861o
    public void g(androidx.lifecycle.r rVar, AbstractC2857k.a aVar) {
        if (aVar == AbstractC2857k.a.ON_DESTROY) {
            dispose();
        } else {
            if (aVar != AbstractC2857k.a.ON_CREATE || this.f27293c) {
                return;
            }
            h(this.f27295e);
        }
    }

    @Override // Y.InterfaceC2457x
    public void h(Function2 function2) {
        this.f27291a.setOnViewTreeOwnersAvailable(new a(function2));
    }
}
