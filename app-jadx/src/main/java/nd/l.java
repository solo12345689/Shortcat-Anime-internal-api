package Nd;

import Td.L;
import Td.z;
import Ub.u;
import Ud.AbstractC2279u;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.d;
import bc.C3042a;
import bc.EnumC3046e;
import dc.s;
import expo.modules.webbrowser.OpenBrowserOptions;
import ie.InterfaceC5082a;
import java.util.ArrayList;
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

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LNd/l;", "Lgc/c;", "<init>", "()V", "Lexpo/modules/webbrowser/OpenBrowserOptions;", "options", "Landroidx/browser/customtabs/d;", "A", "(Lexpo/modules/webbrowser/OpenBrowserOptions;)Landroidx/browser/customtabs/d;", "", "packageName", "E", "(Ljava/lang/String;)Ljava/lang/String;", "Lgc/e;", "n", "()Lgc/e;", "LNd/a;", "d", "LNd/a;", "D", "()LNd/a;", "G", "(LNd/a;)V", "customTabsResolver", "LNd/f;", "e", "LNd/f;", "B", "()LNd/f;", "F", "(LNd/f;)V", "connectionHelper", "Landroid/content/Context;", "C", "()Landroid/content/Context;", "context", "expo-web-browser_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends gc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Nd.a customTabsResolver;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Nd.f connectionHelper;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Function1 {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            ArrayList<String> arrayListC = l.this.D().c();
            ArrayList<String> arrayListD = l.this.D().d();
            String strG = l.this.D().g(arrayListC);
            String strE = l.this.D().e();
            if (!AbstractC2279u.e0(arrayListC, strE)) {
                strE = null;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("browserPackages", arrayListC);
            bundle.putStringArrayList("servicePackages", arrayListD);
            bundle.putString("preferredBrowserPackage", strG);
            bundle.putString("defaultBrowserPackage", strE);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12815a = new b();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f12816a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(OpenBrowserOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws Nd.h, Nd.j {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            OpenBrowserOptions openBrowserOptions = (OpenBrowserOptions) objArr[1];
            androidx.browser.customtabs.d dVarA = l.this.A(openBrowserOptions);
            dVarA.f25542a.setData(Uri.parse((String) obj));
            if (!l.this.D().a(dVarA)) {
                throw new Nd.h();
            }
            l.this.D().i(dVarA, openBrowserOptions);
            return G1.c.a(z.a("type", "opened"));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function2 {
        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) throws Nd.i {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            String strE = l.this.E((String) promise);
            l.this.B().o(strE);
            G1.c.a(z.a("servicePackage", strE));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Nd.i {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f12819a = new f();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements Function1 {
        public g() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws Nd.i {
            AbstractC5504s.h(objArr, "<destruct>");
            String strE = l.this.E((String) objArr[0]);
            l.this.B().o(strE);
            return G1.c.a(z.a("servicePackage", strE));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements Function2 {
        public h() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) throws Nd.i {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            String strE = l.this.E((String) promise);
            if (l.this.B().g(strE)) {
                G1.c.a(z.a("servicePackage", strE));
            } else {
                new Bundle();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Nd.i {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f12822a = new i();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements Function1 {
        public j() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws Nd.i {
            AbstractC5504s.h(objArr, "<destruct>");
            String strE = l.this.E((String) objArr[0]);
            return l.this.B().g(strE) ? G1.c.a(z.a("servicePackage", strE)) : new Bundle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f12824a = new k();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: renamed from: Nd.l$l, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0201l implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0201l f12825a = new C0201l();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m implements Function1 {
        public m() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws Nd.i {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            String strE = l.this.E((String) objArr[1]);
            l.this.B().m(strE, Uri.parse((String) obj));
            return G1.c.a(z.a("servicePackage", strE));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n implements InterfaceC5082a {
        public n() {
        }

        public final void a() {
            l.this.B().h();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o implements InterfaceC5082a {
        public o() {
        }

        public final void a() {
            l lVar = l.this;
            lVar.G(new Nd.a(lVar.i()));
            l lVar2 = l.this;
            lVar2.F(new Nd.f(lVar2.C()));
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.browser.customtabs.d A(OpenBrowserOptions options) {
        d.C0430d c0430d = new d.C0430d();
        Integer toolbarColor = options.getToolbarColor();
        if (toolbarColor != null) {
            androidx.browser.customtabs.a aVarA = new a.C0429a().b(toolbarColor.intValue()).a();
            AbstractC5504s.g(aVarA, "build(...)");
            c0430d.c(aVarA);
        }
        Integer secondaryToolbarColor = options.getSecondaryToolbarColor();
        if (secondaryToolbarColor != null) {
            androidx.browser.customtabs.a aVarA2 = new a.C0429a().b(secondaryToolbarColor.intValue()).a();
            AbstractC5504s.g(aVarA2, "build(...)");
            c0430d.c(aVarA2);
        }
        c0430d.g(options.getShowTitle());
        if (options.getEnableDefaultShareMenuItem()) {
            c0430d.f(1);
        }
        c0430d.h(options.getEnableBarCollapsing());
        androidx.browser.customtabs.d dVarA = c0430d.a();
        AbstractC5504s.g(dVarA, "build(...)");
        String browserPackage = options.getBrowserPackage();
        if (!TextUtils.isEmpty(browserPackage)) {
            dVarA.f25542a.setPackage(browserPackage);
        }
        return dVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context C() throws cc.i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new cc.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String E(java.lang.String r3) throws Nd.i {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto La
            int r1 = r3.length()     // Catch: Nd.k -> L16
            if (r1 <= 0) goto La
            goto Lb
        La:
            r3 = r0
        Lb:
            if (r3 != 0) goto L1c
            Nd.a r3 = r2.D()     // Catch: Nd.k -> L16
            java.lang.String r3 = r3.g(r0)     // Catch: Nd.k -> L16
            goto L1c
        L16:
            Nd.i r3 = new Nd.i
            r3.<init>()
            throw r3
        L1c:
            if (r3 == 0) goto L28
            int r1 = r3.length()
            if (r1 <= 0) goto L25
            r0 = r3
        L25:
            if (r0 == 0) goto L28
            return r0
        L28:
            Nd.i r3 = new Nd.i
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Nd.l.E(java.lang.String):java.lang.String");
    }

    public final Nd.f B() {
        Nd.f fVar = this.connectionHelper;
        if (fVar != null) {
            return fVar;
        }
        AbstractC5504s.u("connectionHelper");
        return null;
    }

    public final Nd.a D() {
        Nd.a aVar = this.customTabsResolver;
        if (aVar != null) {
            return aVar;
        }
        AbstractC5504s.u("customTabsResolver");
        return null;
    }

    public final void F(Nd.f fVar) {
        AbstractC5504s.h(fVar, "<set-?>");
        this.connectionHelper = fVar;
    }

    public final void G(Nd.a aVar) {
        AbstractC5504s.h(aVar, "<set-?>");
        this.customTabsResolver = aVar;
    }

    @Override // gc.c
    public gc.e n() {
        Class cls;
        dc.g lVar;
        dc.g lVar2;
        gc.d dVar;
        C5974d c5974d;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar2 = new gc.d(this);
            dVar2.s("ExpoWebBrowser");
            Map mapW = dVar2.w();
            EnumC3046e enumC3046e = EnumC3046e.f33268a;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new o()));
            Map mapW2 = dVar2.w();
            EnumC3046e enumC3046e2 = EnumC3046e.f33272e;
            mapW2.put(enumC3046e2, new C3042a(enumC3046e2, new n()));
            boolean zC = AbstractC5504s.c(String.class, u.class);
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            Class cls4 = Double.TYPE;
            Class cls5 = Boolean.TYPE;
            if (zC) {
                lVar = new dc.f("warmUpAsync", new C5972b[0], new e());
                cls = OpenBrowserOptions.class;
            } else {
                X xM = dVar2.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(String.class), Boolean.TRUE));
                if (c5972b == null) {
                    cls = OpenBrowserOptions.class;
                    c5972b = new C5972b(new M(O.b(String.class), true, f.f12819a), xM);
                } else {
                    cls = OpenBrowserOptions.class;
                }
                C5972b[] c5972bArr = {c5972b};
                g gVar = new g();
                lVar = AbstractC5504s.c(Bundle.class, cls2) ? new dc.l("warmUpAsync", c5972bArr, gVar) : AbstractC5504s.c(Bundle.class, cls5) ? new dc.h("warmUpAsync", c5972bArr, gVar) : AbstractC5504s.c(Bundle.class, cls4) ? new dc.i("warmUpAsync", c5972bArr, gVar) : AbstractC5504s.c(Bundle.class, cls3) ? new dc.j("warmUpAsync", c5972bArr, gVar) : AbstractC5504s.c(Bundle.class, String.class) ? new dc.n("warmUpAsync", c5972bArr, gVar) : new s("warmUpAsync", c5972bArr, gVar);
            }
            dVar2.k().put("warmUpAsync", lVar);
            if (AbstractC5504s.c(String.class, u.class)) {
                lVar2 = new dc.f("coolDownAsync", new C5972b[0], new h());
            } else {
                X xM2 = dVar2.m();
                C5972b c5972b2 = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(String.class), Boolean.TRUE));
                if (c5972b2 == null) {
                    c5972b2 = new C5972b(new M(O.b(String.class), true, i.f12822a), xM2);
                }
                C5972b[] c5972bArr2 = {c5972b2};
                j jVar = new j();
                lVar2 = AbstractC5504s.c(Bundle.class, cls2) ? new dc.l("coolDownAsync", c5972bArr2, jVar) : AbstractC5504s.c(Bundle.class, cls5) ? new dc.h("coolDownAsync", c5972bArr2, jVar) : AbstractC5504s.c(Bundle.class, cls4) ? new dc.i("coolDownAsync", c5972bArr2, jVar) : AbstractC5504s.c(Bundle.class, cls3) ? new dc.j("coolDownAsync", c5972bArr2, jVar) : AbstractC5504s.c(Bundle.class, String.class) ? new dc.n("coolDownAsync", c5972bArr2, jVar) : new s("coolDownAsync", c5972bArr2, jVar);
            }
            dVar2.k().put("coolDownAsync", lVar2);
            X xM3 = dVar2.m();
            C5974d c5974d2 = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b3 = (C5972b) c5974d2.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b3 == null) {
                dVar = dVar2;
                c5972b3 = new C5972b(new M(O.b(String.class), false, k.f12824a), xM3);
            } else {
                dVar = dVar2;
            }
            C5972b c5972b4 = (C5972b) c5974d2.a().get(new Pair(O.b(String.class), Boolean.TRUE));
            if (c5972b4 == null) {
                c5974d = c5974d2;
                c5972b4 = new C5972b(new M(O.b(String.class), true, C0201l.f12825a), xM3);
            } else {
                c5974d = c5974d2;
            }
            C5972b[] c5972bArr3 = {c5972b3, c5972b4};
            m mVar = new m();
            dVar.k().put("mayInitWithUrlAsync", AbstractC5504s.c(Bundle.class, cls2) ? new dc.l("mayInitWithUrlAsync", c5972bArr3, mVar) : AbstractC5504s.c(Bundle.class, cls5) ? new dc.h("mayInitWithUrlAsync", c5972bArr3, mVar) : AbstractC5504s.c(Bundle.class, cls4) ? new dc.i("mayInitWithUrlAsync", c5972bArr3, mVar) : AbstractC5504s.c(Bundle.class, cls3) ? new dc.j("mayInitWithUrlAsync", c5972bArr3, mVar) : AbstractC5504s.c(Bundle.class, String.class) ? new dc.n("mayInitWithUrlAsync", c5972bArr3, mVar) : new s("mayInitWithUrlAsync", c5972bArr3, mVar));
            C5972b[] c5972bArr4 = new C5972b[0];
            a aVar = new a();
            dVar.k().put("getCustomTabsSupportingBrowsersAsync", AbstractC5504s.c(Bundle.class, cls2) ? new dc.l("getCustomTabsSupportingBrowsersAsync", c5972bArr4, aVar) : AbstractC5504s.c(Bundle.class, cls5) ? new dc.h("getCustomTabsSupportingBrowsersAsync", c5972bArr4, aVar) : AbstractC5504s.c(Bundle.class, cls4) ? new dc.i("getCustomTabsSupportingBrowsersAsync", c5972bArr4, aVar) : AbstractC5504s.c(Bundle.class, cls3) ? new dc.j("getCustomTabsSupportingBrowsersAsync", c5972bArr4, aVar) : AbstractC5504s.c(Bundle.class, String.class) ? new dc.n("getCustomTabsSupportingBrowsersAsync", c5972bArr4, aVar) : new s("getCustomTabsSupportingBrowsersAsync", c5972bArr4, aVar));
            X xM4 = dVar.m();
            C5972b c5972b5 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
            if (c5972b5 == null) {
                c5972b5 = new C5972b(new M(O.b(String.class), false, b.f12815a), xM4);
            }
            C5972b c5972b6 = (C5972b) c5974d.a().get(new Pair(O.b(cls), bool));
            if (c5972b6 == null) {
                c5972b6 = new C5972b(new M(O.b(cls), false, c.f12816a), xM4);
            }
            C5972b[] c5972bArr5 = {c5972b5, c5972b6};
            d dVar3 = new d();
            dVar.k().put("openBrowserAsync", AbstractC5504s.c(Bundle.class, cls2) ? new dc.l("openBrowserAsync", c5972bArr5, dVar3) : AbstractC5504s.c(Bundle.class, cls5) ? new dc.h("openBrowserAsync", c5972bArr5, dVar3) : AbstractC5504s.c(Bundle.class, cls4) ? new dc.i("openBrowserAsync", c5972bArr5, dVar3) : AbstractC5504s.c(Bundle.class, cls3) ? new dc.j("openBrowserAsync", c5972bArr5, dVar3) : AbstractC5504s.c(Bundle.class, String.class) ? new dc.n("openBrowserAsync", c5972bArr5, dVar3) : new s("openBrowserAsync", c5972bArr5, dVar3));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
