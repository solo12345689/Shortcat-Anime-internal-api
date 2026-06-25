package androidx.compose.ui.platform;

import Td.C2160k;
import Y.AbstractC2393b0;
import Y.AbstractC2394b1;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.C2397c1;
import Y.InterfaceC2425m;
import Y.b2;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import ie.InterfaceC5082a;
import j2.AbstractC5332c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import z0.InterfaceC7269a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00168\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\" \u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019\" \u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b)\u0010\u0019\" \u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0019¨\u00060²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "LTd/L;", "content", "a", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;LY/m;I)V", "Landroid/content/Context;", "context", "LP0/d;", "n", "(Landroid/content/Context;LY/m;I)LP0/d;", "Landroid/content/res/Configuration;", "configuration", "LP0/b;", "m", "(Landroid/content/Context;Landroid/content/res/Configuration;LY/m;I)LP0/b;", "", "name", "", "l", "(Ljava/lang/String;)Ljava/lang/Void;", "LY/b1;", "LY/b1;", "f", "()LY/b1;", "LocalConfiguration", "b", "g", "LocalContext", "Landroid/content/res/Resources;", "c", "j", "LocalResources", "d", "h", "LocalImageVectorCache", "e", "i", "LocalResourceIdCache", "Landroid/view/View;", "k", "LocalView", "Landroidx/lifecycle/r;", "getLocalLifecycleOwner", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2394b1 f27160a = Y.H.h(null, a.f27166a, 1, null);

    /* JADX INFO: renamed from: b */
    private static final AbstractC2394b1 f27161b = Y.H.j(b.f27167a);

    /* JADX INFO: renamed from: c */
    private static final AbstractC2394b1 f27162c = Y.H.i(e.f27170a);

    /* JADX INFO: renamed from: d */
    private static final AbstractC2394b1 f27163d = Y.H.j(c.f27168a);

    /* JADX INFO: renamed from: e */
    private static final AbstractC2394b1 f27164e = Y.H.j(d.f27169a);

    /* JADX INFO: renamed from: f */
    private static final AbstractC2394b1 f27165f = Y.H.j(f.f27171a);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final a f27166a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.l("LocalConfiguration");
            throw new C2160k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final b f27167a = new b();

        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.l("LocalContext");
            throw new C2160k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final c f27168a = new c();

        c() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final P0.b invoke() {
            AndroidCompositionLocals_androidKt.l("LocalImageVectorCache");
            throw new C2160k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final d f27169a = new d();

        d() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final P0.d invoke() {
            AndroidCompositionLocals_androidKt.l("LocalResourceIdCache");
            throw new C2160k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final e f27170a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Resources invoke(Y.E e10) {
            e10.c(AndroidCompositionLocals_androidKt.f());
            return ((Context) e10.c(AndroidCompositionLocals_androidKt.g())).getResources();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final f f27171a = new f();

        f() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final View invoke() {
            AndroidCompositionLocals_androidKt.l("LocalView");
            throw new C2160k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Y.C0 f27172a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Y.C0 c02) {
            super(1);
            this.f27172a = c02;
        }

        public final void a(Configuration configuration) {
            AndroidCompositionLocals_androidKt.c(this.f27172a, new Configuration(configuration));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Configuration) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ A0 f27173a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements Y.X {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ A0 f27174a;

            public a(A0 a02) {
                this.f27174a = a02;
            }

            @Override // Y.X
            public void dispose() {
                this.f27174a.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(A0 a02) {
            super(1);
            this.f27173a = a02;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Y.X invoke(Y.Y y10) {
            return new a(this.f27173a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AndroidComposeView f27175a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ V f27176b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f27177c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(AndroidComposeView androidComposeView, V v10, Function2 function2) {
            super(2);
            this.f27175a = androidComposeView;
            this.f27176b = v10;
            this.f27177c = function2;
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
                AbstractC2454w.U(1059770793, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:144)");
            }
            AbstractC2739w0.a(this.f27175a, this.f27176b, this.f27177c, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AndroidComposeView f27178a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f27179b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f27180c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(AndroidComposeView androidComposeView, Function2 function2, int i10) {
            super(2);
            this.f27178a = androidComposeView;
            this.f27179b = function2;
            this.f27180c = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AndroidCompositionLocals_androidKt.a(this.f27178a, this.f27179b, interfaceC2425m, AbstractC2409g1.a(this.f27180c | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class k extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f27181a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f27182b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements Y.X {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Context f27183a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ l f27184b;

            public a(Context context, l lVar) {
                this.f27183a = context;
                this.f27184b = lVar;
            }

            @Override // Y.X
            public void dispose() {
                this.f27183a.getApplicationContext().unregisterComponentCallbacks(this.f27184b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.f27181a = context;
            this.f27182b = lVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Y.X invoke(Y.Y y10) {
            this.f27181a.getApplicationContext().registerComponentCallbacks(this.f27182b);
            return new a(this.f27181a, this.f27182b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Configuration f27185a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ P0.b f27186b;

        l(Configuration configuration, P0.b bVar) {
            this.f27185a = configuration;
            this.f27186b = bVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f27186b.c(this.f27185a.updateFrom(configuration));
            this.f27185a.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f27186b.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f27186b.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class m extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f27187a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ n f27188b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements Y.X {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Context f27189a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ n f27190b;

            public a(Context context, n nVar) {
                this.f27189a = context;
                this.f27190b = nVar;
            }

            @Override // Y.X
            public void dispose() {
                this.f27189a.getApplicationContext().unregisterComponentCallbacks(this.f27190b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context, n nVar) {
            super(1);
            this.f27187a = context;
            this.f27188b = nVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Y.X invoke(Y.Y y10) {
            this.f27187a.getApplicationContext().registerComponentCallbacks(this.f27188b);
            return new a(this.f27187a, this.f27188b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ P0.d f27191a;

        n(P0.d dVar) {
            this.f27191a = dVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f27191a.a();
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f27191a.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f27191a.a();
        }
    }

    public static final void a(AndroidComposeView androidComposeView, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-520299287);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(androidComposeView) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(function2) ? 32 : 16;
        }
        if (interfaceC2425mG.p((i11 & 19) != 18, i11 & 1)) {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-520299287, i11, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:99)");
            }
            Context context = androidComposeView.getContext();
            Object objD = interfaceC2425mG.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                objD = b2.e(new Configuration(context.getResources().getConfiguration()), null, 2, null);
                interfaceC2425mG.u(objD);
            }
            Y.C0 c02 = (Y.C0) objD;
            Object objD2 = interfaceC2425mG.D();
            if (objD2 == aVar.a()) {
                objD2 = new g(c02);
                interfaceC2425mG.u(objD2);
            }
            androidComposeView.setConfigurationChangeObserver((Function1) objD2);
            Object objD3 = interfaceC2425mG.D();
            if (objD3 == aVar.a()) {
                objD3 = new V(context);
                interfaceC2425mG.u(objD3);
            }
            V v10 = (V) objD3;
            AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objD4 = interfaceC2425mG.D();
            if (objD4 == aVar.a()) {
                objD4 = C0.b(androidComposeView, viewTreeOwners.b());
                interfaceC2425mG.u(objD4);
            }
            A0 a02 = (A0) objD4;
            Td.L l10 = Td.L.f17438a;
            boolean zF = interfaceC2425mG.F(a02);
            Object objD5 = interfaceC2425mG.D();
            if (zF || objD5 == aVar.a()) {
                objD5 = new h(a02);
                interfaceC2425mG.u(objD5);
            }
            AbstractC2393b0.b(l10, (Function1) objD5, interfaceC2425mG, 6);
            Object objD6 = interfaceC2425mG.D();
            if (objD6 == aVar.a()) {
                objD6 = O0.f27335a.a(context) ? new C2743y0(androidComposeView.getView()) : new C2694e1();
                interfaceC2425mG.u(objD6);
            }
            Y.H.d(new C2397c1[]{f27160a.d(b(c02)), f27161b.d(context), AbstractC5332c.c().d(viewTreeOwners.a()), Q3.b.c().d(viewTreeOwners.b()), h0.s.g().d(a02), f27165f.d(androidComposeView.getView()), f27163d.d(m(context, b(c02), interfaceC2425mG, 0)), f27164e.d(n(context, interfaceC2425mG, 0)), AbstractC2739w0.m().d(Boolean.valueOf(((Boolean) interfaceC2425mG.n(AbstractC2739w0.n())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), AbstractC2739w0.i().d((InterfaceC7269a) objD6)}, g0.i.d(1059770793, true, new i(androidComposeView, v10, function2), interfaceC2425mG, 54), interfaceC2425mG, C2397c1.f22274i | 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        } else {
            interfaceC2425mG.K();
        }
        Y.B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new j(androidComposeView, function2, i10));
        }
    }

    private static final Configuration b(Y.C0 c02) {
        return (Configuration) c02.getValue();
    }

    public static final void c(Y.C0 c02, Configuration configuration) {
        c02.setValue(configuration);
    }

    public static final AbstractC2394b1 f() {
        return f27160a;
    }

    public static final AbstractC2394b1 g() {
        return f27161b;
    }

    public static final AbstractC2394b1 getLocalLifecycleOwner() {
        return AbstractC5332c.c();
    }

    public static final AbstractC2394b1 h() {
        return f27163d;
    }

    public static final AbstractC2394b1 i() {
        return f27164e;
    }

    public static final AbstractC2394b1 j() {
        return f27162c;
    }

    public static final AbstractC2394b1 k() {
        return f27165f;
    }

    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final P0.b m(Context context, Configuration configuration, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-485908294, i10, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:180)");
        }
        Object objD = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD == aVar.a()) {
            objD = new P0.b();
            interfaceC2425m.u(objD);
        }
        P0.b bVar = (P0.b) objD;
        Object objD2 = interfaceC2425m.D();
        Object obj = objD2;
        if (objD2 == aVar.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            interfaceC2425m.u(configuration2);
            obj = configuration2;
        }
        Configuration configuration3 = (Configuration) obj;
        Object objD3 = interfaceC2425m.D();
        if (objD3 == aVar.a()) {
            objD3 = new l(configuration3, bVar);
            interfaceC2425m.u(objD3);
        }
        l lVar = (l) objD3;
        boolean zF = interfaceC2425m.F(context);
        Object objD4 = interfaceC2425m.D();
        if (zF || objD4 == aVar.a()) {
            objD4 = new k(context, lVar);
            interfaceC2425m.u(objD4);
        }
        AbstractC2393b0.b(bVar, (Function1) objD4, interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return bVar;
    }

    private static final P0.d n(Context context, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1348507246, i10, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:150)");
        }
        Object objD = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD == aVar.a()) {
            objD = new P0.d();
            interfaceC2425m.u(objD);
        }
        P0.d dVar = (P0.d) objD;
        Object objD2 = interfaceC2425m.D();
        if (objD2 == aVar.a()) {
            objD2 = new n(dVar);
            interfaceC2425m.u(objD2);
        }
        n nVar = (n) objD2;
        boolean zF = interfaceC2425m.F(context);
        Object objD3 = interfaceC2425m.D();
        if (zF || objD3 == aVar.a()) {
            objD3 = new m(context, nVar);
            interfaceC2425m.u(objD3);
        }
        AbstractC2393b0.b(dVar, (Function1) objD3, interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return dVar;
    }
}
