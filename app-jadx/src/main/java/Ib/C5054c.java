package ib;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import android.util.Log;
import com.facebook.react.O;
import com.facebook.react.bridge.ReactApplicationContext;
import ib.C5055d;
import ie.InterfaceC5082a;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pb.C5956a;

/* JADX INFO: renamed from: ib.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5054c implements O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48769b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f48770c = AbstractC2163n.b(new InterfaceC5082a() { // from class: ib.b
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return C5054c.c();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final expo.modules.adapters.react.a f48771a = new expo.modules.adapters.react.a(f48769b.a());

    /* JADX INFO: renamed from: ib.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return (List) C5054c.f48770c.getValue();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ib.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C5956a c5956a = C5956a.f55872a;
            return Xd.a.d(Integer.valueOf(c5956a.a(kotlin.jvm.internal.O.b(((sb.g) obj2).getClass()).u())), Integer.valueOf(c5956a.a(kotlin.jvm.internal.O.b(((sb.g) obj).getClass()).u())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c() {
        try {
            C5055d.a aVar = C5055d.Companion;
            Object objInvoke = C5055d.class.getMethod("getPackageList", null).invoke(null, null);
            AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<expo.modules.core.interfaces.Package>");
            return AbstractC2279u.R0((List) objInvoke, new b());
        } catch (Exception e10) {
            Log.e("ExpoModulesPackage", "Couldn't get expo package list.", e10);
            return AbstractC2279u.m();
        }
    }

    @Override // com.facebook.react.O
    public List createNativeModules(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        List listCreateNativeModules = this.f48771a.createNativeModules(reactContext);
        AbstractC5504s.g(listCreateNativeModules, "createNativeModules(...)");
        return listCreateNativeModules;
    }

    @Override // com.facebook.react.O
    public List createViewManagers(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        List listCreateViewManagers = this.f48771a.createViewManagers(reactContext);
        AbstractC5504s.g(listCreateViewManagers, "createViewManagers(...)");
        return listCreateViewManagers;
    }
}
