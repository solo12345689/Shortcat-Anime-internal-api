package Od;

import Td.L;
import android.view.View;
import bc.C3042a;
import bc.EnumC3046e;
import expo.modules.webview.DomWebView;
import expo.modules.webview.DomWebViewSource;
import expo.modules.webview.ScrollToParam;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;
import wc.AbstractC6959b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LOd/e;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "expo-dom-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends gc.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13126a = new a();

        a() {
        }

        public final void a(DomWebView view, DomWebViewSource source) {
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(source, "source");
            view.setSource(source);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((DomWebView) obj, (DomWebViewSource) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f13127a = new b();

        b() {
        }

        public final void a(DomWebView view, String script) {
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(script, "script");
            view.setInjectedJSBeforeContentLoaded(script);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((DomWebView) obj, (String) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f13128a = new c();

        c() {
        }

        public final void a(DomWebView view, boolean z10) {
            AbstractC5504s.h(view, "view");
            view.setWebviewDebuggingEnabled(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((DomWebView) obj, ((Boolean) obj2).booleanValue());
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f13129a = new d();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DomWebView f13130a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f13131b;

            a(DomWebView domWebView, boolean z10) {
                this.f13130a = domWebView;
                this.f13131b = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f13130a.getWebView().setHorizontalScrollBarEnabled(this.f13131b);
            }
        }

        d() {
        }

        public final void a(DomWebView view, boolean z10) {
            AbstractC5504s.h(view, "view");
            view.getWebView().post(new a(view, z10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((DomWebView) obj, ((Boolean) obj2).booleanValue());
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Od.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0209e implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0209e f13132a = new C0209e();

        /* JADX INFO: renamed from: Od.e$e$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DomWebView f13133a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f13134b;

            a(DomWebView domWebView, boolean z10) {
                this.f13133a = domWebView;
                this.f13134b = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f13133a.getWebView().setVerticalScrollBarEnabled(this.f13134b);
            }
        }

        C0209e() {
        }

        public final void a(DomWebView view, boolean z10) {
            AbstractC5504s.h(view, "view");
            view.getWebView().post(new a(view, z10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((DomWebView) obj, ((Boolean) obj2).booleanValue());
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f13135a = new f();

        f() {
        }

        public final void a(DomWebView view, boolean z10) {
            AbstractC5504s.h(view, "view");
            view.setNestedScrollEnabled(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((DomWebView) obj, ((Boolean) obj2).booleanValue());
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f13136a = new g();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(Integer.TYPE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f13137a = new h();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            String str = (String) objArr[1];
            DomWebView domWebViewB = Od.f.f13149a.b(((Number) obj).intValue());
            if (domWebViewB == null) {
                return null;
            }
            domWebViewB.injectJavaScript(str);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements InterfaceC5082a {
        public final void a() {
            Od.f.f13149a.c();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f13138a = new k();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(DomWebView.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f13139a = new l();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(DomWebView.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f13140a = new m();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(ScrollToParam.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ((DomWebView) objArr[0]).scrollTo((ScrollToParam) objArr[1]);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f13141a = new o();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(DomWebView.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f13142a = new p();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ((DomWebView) objArr[0]).injectJavaScript((String) objArr[1]);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r implements Function1 {
        public final void a(View it) {
            AbstractC5504s.h(it, "it");
            ((DomWebView) it).reload();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class s implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f13143a = new s();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(DomWebViewSource.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class t implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f13144a = new t();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f13145a = new u();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(Boolean.TYPE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class v implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f13146a = new v();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(Boolean.TYPE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class w implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f13147a = new w();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(Boolean.TYPE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class x implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x f13148a = new x();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(Boolean.TYPE);
        }
    }

    @Override // gc.c
    public gc.e n() {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        C5974d c5974d;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoDomWebViewModule");
            Map mapW = dVar.w();
            EnumC3046e enumC3046e = EnumC3046e.f33269b;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new j()));
            X xM = dVar.m();
            C5974d c5974d2 = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(Integer.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b = (C5972b) c5974d2.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                cls = ScrollToParam.class;
                c5972b = new C5972b(new M(O.b(Integer.class), false, g.f13136a), xM);
            } else {
                cls = ScrollToParam.class;
            }
            C5972b c5972b2 = (C5972b) c5974d2.a().get(new Pair(O.b(String.class), bool));
            if (c5972b2 == null) {
                cls2 = DomWebViewSource.class;
                c5972b2 = new C5972b(new M(O.b(String.class), false, h.f13137a), xM);
            } else {
                cls2 = DomWebViewSource.class;
            }
            dVar.k().put("evalJsForWebViewAsync", new dc.s("evalJsForWebViewAsync", new C5972b[]{c5972b, c5972b2}, new i()));
            expo.modules.kotlin.views.p pVar = new expo.modules.kotlin.views.p(O.b(DomWebView.class), new M(O.b(DomWebView.class), false, k.f13138a, 2, null), dVar.m());
            AbstractC6959b.g(pVar);
            pVar.b("onMessage");
            a aVar = a.f13126a;
            Map mapH = pVar.h();
            C5972b c5972b3 = (C5972b) c5974d2.a().get(new Pair(O.b(cls2), bool));
            if (c5972b3 == null) {
                s sVar = s.f13143a;
                cls3 = DomWebView.class;
                InterfaceC6014d interfaceC6014dB2 = O.b(cls2);
                cls4 = Boolean.class;
                c5972b3 = new C5972b(new M(interfaceC6014dB2, false, sVar), null);
            } else {
                cls3 = DomWebView.class;
                cls4 = Boolean.class;
            }
            mapH.put("source", new expo.modules.kotlin.views.c("source", c5972b3, aVar));
            b bVar = b.f13127a;
            Map mapH2 = pVar.h();
            C5972b c5972b4 = (C5972b) c5974d2.a().get(new Pair(O.b(String.class), bool));
            if (c5972b4 == null) {
                c5972b4 = new C5972b(new M(O.b(String.class), false, t.f13144a), null);
            }
            mapH2.put("injectedJavaScriptBeforeContentLoaded", new expo.modules.kotlin.views.c("injectedJavaScriptBeforeContentLoaded", c5972b4, bVar));
            c cVar = c.f13128a;
            Map mapH3 = pVar.h();
            C5972b c5972b5 = (C5972b) c5974d2.a().get(new Pair(O.b(cls4), bool));
            if (c5972b5 == null) {
                c5972b5 = new C5972b(new M(O.b(cls4), false, u.f13145a), null);
            }
            mapH3.put("webviewDebuggingEnabled", new expo.modules.kotlin.views.c("webviewDebuggingEnabled", c5972b5, cVar));
            d dVar2 = d.f13129a;
            Map mapH4 = pVar.h();
            C5972b c5972b6 = (C5972b) c5974d2.a().get(new Pair(O.b(cls4), bool));
            if (c5972b6 == null) {
                c5972b6 = new C5972b(new M(O.b(cls4), false, v.f13146a), null);
            }
            mapH4.put("showsHorizontalScrollIndicator", new expo.modules.kotlin.views.c("showsHorizontalScrollIndicator", c5972b6, dVar2));
            C0209e c0209e = C0209e.f13132a;
            Map mapH5 = pVar.h();
            C5972b c5972b7 = (C5972b) c5974d2.a().get(new Pair(O.b(cls4), bool));
            if (c5972b7 == null) {
                c5972b7 = new C5972b(new M(O.b(cls4), false, w.f13147a), null);
            }
            mapH5.put("showsVerticalScrollIndicator", new expo.modules.kotlin.views.c("showsVerticalScrollIndicator", c5972b7, c0209e));
            f fVar = f.f13135a;
            Map mapH6 = pVar.h();
            C5972b c5972b8 = (C5972b) c5974d2.a().get(new Pair(O.b(cls4), bool));
            if (c5972b8 == null) {
                c5972b8 = new C5972b(new M(O.b(cls4), false, x.f13148a), null);
            }
            mapH6.put("nestedScrollEnabled", new expo.modules.kotlin.views.c("nestedScrollEnabled", c5972b8, fVar));
            X xG = pVar.g();
            C5972b c5972b9 = (C5972b) c5974d2.a().get(new Pair(O.b(cls3), bool));
            if (c5972b9 == null) {
                c5972b9 = new C5972b(new M(O.b(cls3), false, l.f13139a), xG);
            }
            C5972b c5972b10 = (C5972b) c5974d2.a().get(new Pair(O.b(cls), bool));
            if (c5972b10 == null) {
                c5972b10 = new C5972b(new M(O.b(cls), false, m.f13140a), xG);
            }
            C5972b[] c5972bArr = {c5972b9, c5972b10};
            n nVar = new n();
            Class cls5 = Integer.TYPE;
            boolean zC = AbstractC5504s.c(L.class, cls5);
            Class cls6 = Float.TYPE;
            Class cls7 = Double.TYPE;
            Class cls8 = Boolean.TYPE;
            pVar.f().put("scrollTo", zC ? new dc.l("scrollTo", c5972bArr, nVar) : AbstractC5504s.c(L.class, cls8) ? new dc.h("scrollTo", c5972bArr, nVar) : AbstractC5504s.c(L.class, cls7) ? new dc.i("scrollTo", c5972bArr, nVar) : AbstractC5504s.c(L.class, cls6) ? new dc.j("scrollTo", c5972bArr, nVar) : AbstractC5504s.c(L.class, String.class) ? new dc.n("scrollTo", c5972bArr, nVar) : new dc.s("scrollTo", c5972bArr, nVar));
            X xG2 = pVar.g();
            C5972b c5972b11 = (C5972b) c5974d2.a().get(new Pair(O.b(cls3), bool));
            if (c5972b11 == null) {
                c5974d = c5974d2;
                c5972b11 = new C5972b(new M(O.b(cls3), false, o.f13141a), xG2);
            } else {
                c5974d = c5974d2;
            }
            C5972b c5972b12 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
            if (c5972b12 == null) {
                c5972b12 = new C5972b(new M(O.b(String.class), false, p.f13142a), xG2);
            }
            C5972b[] c5972bArr2 = {c5972b11, c5972b12};
            q qVar = new q();
            pVar.f().put("injectJavaScript", AbstractC5504s.c(L.class, cls5) ? new dc.l("injectJavaScript", c5972bArr2, qVar) : AbstractC5504s.c(L.class, cls8) ? new dc.h("injectJavaScript", c5972bArr2, qVar) : AbstractC5504s.c(L.class, cls7) ? new dc.i("injectJavaScript", c5972bArr2, qVar) : AbstractC5504s.c(L.class, cls6) ? new dc.j("injectJavaScript", c5972bArr2, qVar) : AbstractC5504s.c(L.class, String.class) ? new dc.n("injectJavaScript", c5972bArr2, qVar) : new dc.s("injectJavaScript", c5972bArr2, qVar));
            pVar.k(new r());
            dVar.y(pVar.c());
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
