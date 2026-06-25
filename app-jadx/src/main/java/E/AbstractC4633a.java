package e;

import Td.L;
import Y.AbstractC2393b0;
import Y.B1;
import Y.InterfaceC2425m;
import Y.U1;
import Y.X;
import Y.Y;
import Y.h2;
import androidx.activity.G;
import androidx.activity.H;
import androidx.activity.K;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.r;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: e.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4633a {

    /* JADX INFO: renamed from: e.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0722a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ d f45750a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f45751b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0722a(d dVar, boolean z10) {
            super(0);
            this.f45750a = dVar;
            this.f45751b = z10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m939invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m939invoke() {
            this.f45750a.j(this.f45751b);
        }
    }

    /* JADX INFO: renamed from: e.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ H f45752a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ r f45753b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ d f45754c;

        /* JADX INFO: renamed from: e.a$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0723a implements X {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ d f45755a;

            public C0723a(d dVar) {
                this.f45755a = dVar;
            }

            @Override // Y.X
            public void dispose() {
                this.f45755a.h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(H h10, r rVar, d dVar) {
            super(1);
            this.f45752a = h10;
            this.f45753b = rVar;
            this.f45754c = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final X invoke(Y y10) {
            this.f45752a.i(this.f45753b, this.f45754c);
            return new C0723a(this.f45754c);
        }
    }

    /* JADX INFO: renamed from: e.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f45756a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5082a f45757b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f45758c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f45759d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, InterfaceC5082a interfaceC5082a, int i10, int i11) {
            super(2);
            this.f45756a = z10;
            this.f45757b = interfaceC5082a;
            this.f45758c = i10;
            this.f45759d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC4633a.a(this.f45756a, this.f45757b, interfaceC2425m, this.f45758c | 1, this.f45759d);
        }
    }

    /* JADX INFO: renamed from: e.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends G {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ h2 f45760d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, h2 h2Var) {
            super(z10);
            this.f45760d = h2Var;
        }

        @Override // androidx.activity.G
        public void d() {
            AbstractC4633a.b(this.f45760d).invoke();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(boolean z10, InterfaceC5082a interfaceC5082a, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-361453782);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.a(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.U(interfaceC5082a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            h2 h2VarO = U1.o(interfaceC5082a, interfaceC2425mG, (i12 >> 3) & 14);
            interfaceC2425mG.C(-971159753);
            Object objD = interfaceC2425mG.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                objD = new d(z10, h2VarO);
                interfaceC2425mG.u(objD);
            }
            d dVar = (d) objD;
            interfaceC2425mG.T();
            interfaceC2425mG.C(-971159481);
            boolean zU = interfaceC2425mG.U(dVar) | interfaceC2425mG.a(z10);
            Object objD2 = interfaceC2425mG.D();
            if (zU || objD2 == aVar.a()) {
                objD2 = new C0722a(dVar, z10);
                interfaceC2425mG.u(objD2);
            }
            interfaceC2425mG.T();
            AbstractC2393b0.g((InterfaceC5082a) objD2, interfaceC2425mG, 0);
            K kA = C4635c.f45762a.a(interfaceC2425mG, 6);
            if (kA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            H onBackPressedDispatcher = kA.getOnBackPressedDispatcher();
            r rVar = (r) interfaceC2425mG.n(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            interfaceC2425mG.C(-971159120);
            boolean zU2 = interfaceC2425mG.U(onBackPressedDispatcher) | interfaceC2425mG.U(rVar) | interfaceC2425mG.U(dVar);
            Object objD3 = interfaceC2425mG.D();
            if (zU2 || objD3 == aVar.a()) {
                objD3 = new b(onBackPressedDispatcher, rVar, dVar);
                interfaceC2425mG.u(objD3);
            }
            interfaceC2425mG.T();
            AbstractC2393b0.a(rVar, onBackPressedDispatcher, (Function1) objD3, interfaceC2425mG, 0);
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new c(z10, interfaceC5082a, i10, i11));
        }
    }

    public static final InterfaceC5082a b(h2 h2Var) {
        return (InterfaceC5082a) h2Var.getValue();
    }
}
