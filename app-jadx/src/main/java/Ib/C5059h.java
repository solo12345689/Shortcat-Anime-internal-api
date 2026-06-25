package ib;

import Df.r;
import Ud.AbstractC2279u;
import android.content.Context;
import com.facebook.react.ReactHost;
import com.facebook.react.T;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.defaults.DefaultComponentsRegistry;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.InterfaceC3258f;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.facebook.react.z;
import ib.C5059h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ib.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5059h {

    /* JADX INFO: renamed from: a */
    public static final C5059h f48776a = new C5059h();

    /* JADX INFO: renamed from: b */
    private static ReactHost f48777b;

    /* JADX INFO: renamed from: ib.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements z {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f48788a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f48789b;

        b(List list, boolean z10) {
            this.f48788a = list;
            this.f48789b = z10;
        }

        @Override // com.facebook.react.z
        public void a(ReactContext context) {
            AbstractC5504s.h(context, "context");
            List list = this.f48788a;
            boolean z10 = this.f48789b;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((sb.j) it.next()).f(z10, context);
            }
        }
    }

    private C5059h() {
    }

    public static final ReactHost a(Context context, List packageList, String jsMainModulePath, String jsBundleAssetPath, String str, JSRuntimeFactory jSRuntimeFactory, boolean z10, BindingsInstaller bindingsInstaller) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(packageList, "packageList");
        AbstractC5504s.h(jsMainModulePath, "jsMainModulePath");
        AbstractC5504s.h(jsBundleAssetPath, "jsBundleAssetPath");
        if (f48777b == null) {
            List listA = C5054c.f48769b.a();
            ArrayList<sb.j> arrayList = new ArrayList();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                List listA2 = ((sb.g) it.next()).a(context);
                AbstractC5504s.g(listA2, "createReactNativeHostHandlers(...)");
                AbstractC2279u.D(arrayList, listA2);
            }
            a aVar = new a(new WeakReference(context), packageList, jsMainModulePath, jsBundleAssetPath, str, z10, bindingsInstaller, null, arrayList, 128, null);
            ComponentFactory componentFactory = new ComponentFactory();
            DefaultComponentsRegistry.register(componentFactory);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((sb.j) it2.next()).h(z10);
            }
            ReactHostImpl reactHostImpl = new ReactHostImpl(context, aVar, componentFactory, true, z10);
            for (sb.j jVar : arrayList) {
                jVar.c(context, reactHostImpl);
                jVar.a(reactHostImpl.getDevSupportManager());
            }
            reactHostImpl.addReactInstanceEventListener(new b(arrayList, z10));
            f48777b = reactHostImpl;
        }
        ReactHost reactHost = f48777b;
        AbstractC5504s.f(reactHost, "null cannot be cast to non-null type com.facebook.react.ReactHost");
        return reactHost;
    }

    /* JADX INFO: renamed from: ib.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements InterfaceC3258f {

        /* JADX INFO: renamed from: a */
        private final WeakReference f48778a;

        /* JADX INFO: renamed from: b */
        private final List f48779b;

        /* JADX INFO: renamed from: c */
        private final String f48780c;

        /* JADX INFO: renamed from: d */
        private final String f48781d;

        /* JADX INFO: renamed from: e */
        private final String f48782e;

        /* JADX INFO: renamed from: f */
        private final boolean f48783f;

        /* JADX INFO: renamed from: g */
        private final BindingsInstaller f48784g;

        /* JADX INFO: renamed from: h */
        private final T.a f48785h;

        /* JADX INFO: renamed from: i */
        private final List f48786i;

        /* JADX INFO: renamed from: j */
        private JSBundleLoader f48787j;

        public a(WeakReference weakContext, List packageList, String jsMainModulePath, String str, String str2, boolean z10, BindingsInstaller bindingsInstaller, T.a turboModuleManagerDelegateBuilder, List hostHandlers) {
            AbstractC5504s.h(weakContext, "weakContext");
            AbstractC5504s.h(packageList, "packageList");
            AbstractC5504s.h(jsMainModulePath, "jsMainModulePath");
            AbstractC5504s.h(turboModuleManagerDelegateBuilder, "turboModuleManagerDelegateBuilder");
            AbstractC5504s.h(hostHandlers, "hostHandlers");
            this.f48778a = weakContext;
            this.f48779b = packageList;
            this.f48780c = jsMainModulePath;
            this.f48781d = str;
            this.f48782e = str2;
            this.f48783f = z10;
            this.f48784g = bindingsInstaller;
            this.f48785h = turboModuleManagerDelegateBuilder;
            this.f48786i = hostHandlers;
        }

        public static final String j(a aVar, sb.j it) {
            AbstractC5504s.h(it, "it");
            return it.b(aVar.f48783f);
        }

        public static final String k(a aVar, sb.j it) {
            AbstractC5504s.h(it, "it");
            return it.d(aVar.f48783f);
        }

        public static final Boolean l(sb.j it) {
            AbstractC5504s.h(it, "it");
            return it.g();
        }

        @Override // com.facebook.react.runtime.InterfaceC3258f
        /* JADX INFO: renamed from: a */
        public JSRuntimeFactory getJsRuntimeFactory() {
            return new HermesInstance();
        }

        @Override // com.facebook.react.runtime.InterfaceC3258f
        /* JADX INFO: renamed from: b */
        public JSBundleLoader getJsBundleLoader() {
            JSBundleLoader jSBundleLoader = this.f48787j;
            if (jSBundleLoader != null) {
                return jSBundleLoader;
            }
            Context context = (Context) this.f48778a.get();
            if (context == null) {
                throw new IllegalStateException("Unable to get concrete Context");
            }
            String strN = n();
            if (strN != null) {
                return r.Q(strN, "assets://", false, 2, null) ? JSBundleLoader.INSTANCE.createAssetLoader(context, strN, true) : JSBundleLoader.INSTANCE.createFileLoader(strN);
            }
            return JSBundleLoader.INSTANCE.createAssetLoader(context, "assets://" + m(), true);
        }

        @Override // com.facebook.react.runtime.InterfaceC3258f
        /* JADX INFO: renamed from: c */
        public String getJsMainModulePath() {
            return this.f48780c;
        }

        @Override // com.facebook.react.runtime.InterfaceC3258f
        /* JADX INFO: renamed from: d */
        public List getReactPackages() {
            return this.f48779b;
        }

        @Override // com.facebook.react.runtime.InterfaceC3258f
        public void e(Exception error) throws Exception {
            AbstractC5504s.h(error, "error");
            if (this.f48786i.isEmpty()) {
                throw error;
            }
            Iterator it = this.f48786i.iterator();
            while (it.hasNext()) {
                ((sb.j) it.next()).e(o(), error);
            }
        }

        @Override // com.facebook.react.runtime.InterfaceC3258f
        /* JADX INFO: renamed from: f */
        public T.a getTurboModuleManagerDelegateBuilder() {
            return this.f48785h;
        }

        @Override // com.facebook.react.runtime.InterfaceC3258f
        public BindingsInstaller getBindingsInstaller() {
            return this.f48784g;
        }

        public final String m() {
            String str = (String) Cf.l.D(Cf.l.L(AbstractC2279u.c0(this.f48786i), new Function1() { // from class: ib.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5059h.a.j(this.f48774a, (sb.j) obj);
                }
            }));
            return str == null ? this.f48781d : str;
        }

        public final String n() {
            String str = (String) Cf.l.D(Cf.l.L(AbstractC2279u.c0(this.f48786i), new Function1() { // from class: ib.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5059h.a.k(this.f48775a, (sb.j) obj);
                }
            }));
            return str == null ? this.f48782e : str;
        }

        public final boolean o() {
            Boolean bool = (Boolean) Cf.l.D(Cf.l.L(AbstractC2279u.c0(this.f48786i), new Function1() { // from class: ib.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5059h.a.l((sb.j) obj);
                }
            }));
            return bool != null ? bool.booleanValue() : this.f48783f;
        }

        public /* synthetic */ a(WeakReference weakReference, List list, String str, String str2, String str3, boolean z10, BindingsInstaller bindingsInstaller, T.a aVar, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(weakReference, list, str, str2, (i10 & 16) != 0 ? null : str3, z10, (i10 & 64) != 0 ? null : bindingsInstaller, (i10 & 128) != 0 ? new DefaultTurboModuleManagerDelegate.a() : aVar, list2);
        }
    }
}
