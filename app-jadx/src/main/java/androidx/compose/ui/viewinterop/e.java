package androidx.compose.ui.viewinterop;

import K0.InterfaceC1788g;
import K0.J;
import K0.p0;
import Td.C2160k;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.AbstractC2460y;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.r;
import h0.p;
import h0.s;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function1 f27718a = g.f27731a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27719a = new a();

        a() {
            super(2);
        }

        public final void a(J j10, Function1 function1) {
            e.e(j10).setResetBlock(function1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (Function1) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27720a = new b();

        b() {
            super(2);
        }

        public final void a(J j10, Function1 function1) {
            e.e(j10).setUpdateBlock(function1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (Function1) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27721a = new c();

        c() {
            super(2);
        }

        public final void a(J j10, Function1 function1) {
            e.e(j10).setReleaseBlock(function1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (Function1) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27722a = new d();

        d() {
            super(2);
        }

        public final void a(J j10, Function1 function1) {
            e.e(j10).setUpdateBlock(function1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (Function1) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0476e extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0476e f27723a = new C0476e();

        C0476e() {
            super(2);
        }

        public final void a(J j10, Function1 function1) {
            e.e(j10).setReleaseBlock(function1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (Function1) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f27724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f27725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f27726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f27727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f27728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f27729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f27730g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, androidx.compose.ui.e eVar, Function1 function12, Function1 function13, Function1 function14, int i10, int i11) {
            super(2);
            this.f27724a = function1;
            this.f27725b = eVar;
            this.f27726c = function12;
            this.f27727d = function13;
            this.f27728e = function14;
            this.f27729f = i10;
            this.f27730g = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            e.a(this.f27724a, this.f27725b, this.f27726c, this.f27727d, this.f27728e, interfaceC2425m, AbstractC2409g1.a(this.f27729f | 1), this.f27730g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f27732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f27733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2460y f27734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f27735d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27736e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f27737f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, Function1 function1, AbstractC2460y abstractC2460y, p pVar, int i10, View view) {
            super(0);
            this.f27732a = context;
            this.f27733b = function1;
            this.f27734c = abstractC2460y;
            this.f27735d = pVar;
            this.f27736e = i10;
            this.f27737f = view;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J invoke() {
            Context context = this.f27732a;
            Function1 function1 = this.f27733b;
            AbstractC2460y abstractC2460y = this.f27734c;
            p pVar = this.f27735d;
            int i10 = this.f27736e;
            KeyEvent.Callback callback = this.f27737f;
            AbstractC5504s.f(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
            return new androidx.compose.ui.viewinterop.i(context, function1, abstractC2460y, pVar, i10, (p0) callback).getLayoutNode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f27738a = new i();

        i() {
            super(2);
        }

        public final void a(J j10, androidx.compose.ui.e eVar) {
            e.e(j10).setModifier(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (androidx.compose.ui.e) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f27739a = new j();

        j() {
            super(2);
        }

        public final void a(J j10, InterfaceC5011d interfaceC5011d) {
            e.e(j10).setDensity(interfaceC5011d);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (InterfaceC5011d) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class k extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f27740a = new k();

        k() {
            super(2);
        }

        public final void a(J j10, r rVar) {
            e.e(j10).setLifecycleOwner(rVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (r) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class l extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f27741a = new l();

        l() {
            super(2);
        }

        public final void a(J j10, P3.i iVar) {
            e.e(j10).setSavedStateRegistryOwner(iVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (P3.i) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class m extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f27742a = new m();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27743a;

            static {
                int[] iArr = new int[EnumC5027t.values().length];
                try {
                    iArr[EnumC5027t.f48573a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5027t.f48574b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f27743a = iArr;
            }
        }

        m() {
            super(2);
        }

        public final void a(J j10, EnumC5027t enumC5027t) {
            androidx.compose.ui.viewinterop.i iVarE = e.e(j10);
            int i10 = a.f27743a[enumC5027t.ordinal()];
            int i11 = 1;
            if (i10 == 1) {
                i11 = 0;
            } else if (i10 != 2) {
                throw new Td.r();
            }
            iVarE.setLayoutDirection(i11);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (EnumC5027t) obj2);
            return L.f17438a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(kotlin.jvm.functions.Function1 r23, androidx.compose.ui.e r24, kotlin.jvm.functions.Function1 r25, kotlin.jvm.functions.Function1 r26, kotlin.jvm.functions.Function1 r27, Y.InterfaceC2425m r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.e.a(kotlin.jvm.functions.Function1, androidx.compose.ui.e, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, Y.m, int, int):void");
    }

    private static final InterfaceC5082a c(Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(2030558801, i10, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)");
        }
        int iHashCode = Long.hashCode(AbstractC2410h.b(interfaceC2425m, 0));
        Context context = (Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g());
        AbstractC2460y abstractC2460yE = AbstractC2410h.e(interfaceC2425m, 0);
        p pVar = (p) interfaceC2425m.n(s.g());
        View view = (View) interfaceC2425m.n(AndroidCompositionLocals_androidKt.k());
        boolean zF = interfaceC2425m.F(context) | ((((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(function1)) || (i10 & 6) == 4) | interfaceC2425m.F(abstractC2460yE) | interfaceC2425m.F(pVar) | interfaceC2425m.c(iHashCode) | interfaceC2425m.F(view);
        Object objD = interfaceC2425m.D();
        if (zF || objD == InterfaceC2425m.f22370a.a()) {
            Object hVar = new h(context, function1, abstractC2460yE, pVar, iHashCode, view);
            interfaceC2425m.u(hVar);
            objD = hVar;
        }
        InterfaceC5082a interfaceC5082a = (InterfaceC5082a) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return interfaceC5082a;
    }

    public static final Function1 d() {
        return f27718a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.viewinterop.i e(J j10) {
        androidx.compose.ui.viewinterop.b bVarA0 = j10.a0();
        if (bVarA0 != null) {
            return (androidx.compose.ui.viewinterop.i) bVarA0;
        }
        H0.a.c("Required value was null.");
        throw new C2160k();
    }

    private static final void f(InterfaceC2425m interfaceC2425m, androidx.compose.ui.e eVar, int i10, InterfaceC5011d interfaceC5011d, r rVar, P3.i iVar, EnumC5027t enumC5027t, I i11) {
        InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
        m2.e(interfaceC2425m, i11, aVar.g());
        m2.e(interfaceC2425m, eVar, i.f27738a);
        m2.e(interfaceC2425m, interfaceC5011d, j.f27739a);
        m2.e(interfaceC2425m, rVar, k.f27740a);
        m2.e(interfaceC2425m, iVar, l.f27741a);
        m2.e(interfaceC2425m, enumC5027t, m.f27742a);
        Function2 function2B = aVar.b();
        if (interfaceC2425m.e() || !AbstractC5504s.c(interfaceC2425m.D(), Integer.valueOf(i10))) {
            interfaceC2425m.u(Integer.valueOf(i10));
            interfaceC2425m.m(Integer.valueOf(i10), function2B);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f27731a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return L.f17438a;
        }

        public final void a(View view) {
        }
    }
}
