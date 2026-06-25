package expo.modules.adapters.react;

import Ub.f;
import Ub.p;
import Ub.t;
import com.facebook.react.O;
import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.kotlin.ExpoBridgeModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import pb.C5957b;
import sb.d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements O {

    /* JADX INFO: renamed from: a */
    protected b f46010a;

    /* JADX INFO: renamed from: b */
    protected t f46011b;

    /* JADX INFO: renamed from: d */
    private NativeModulesProxy f46013d;

    /* JADX INFO: renamed from: c */
    protected ReactAdapterPackage f46012c = new ReactAdapterPackage();

    /* JADX INFO: renamed from: e */
    private List f46014e = null;

    /* JADX INFO: renamed from: f */
    private FabricComponentsRegistry f46015f = null;

    public a(List list) {
        this.f46010a = new b(list, null);
    }

    private synchronized NativeModulesProxy b(ReactApplicationContext reactApplicationContext, C5957b c5957b) {
        try {
            NativeModulesProxy nativeModulesProxy = this.f46013d;
            if (nativeModulesProxy != null && nativeModulesProxy.getReactContext() != reactApplicationContext) {
                c(null);
            }
            if (this.f46013d == null) {
                C5957b c5957bB = c5957b != null ? c5957b : this.f46010a.b(reactApplicationContext);
                t tVar = this.f46011b;
                if (tVar != null) {
                    c(new NativeModulesProxy(reactApplicationContext, c5957bB, tVar));
                } else {
                    c(new NativeModulesProxy(reactApplicationContext, c5957bB));
                }
            }
            if (c5957b != null && c5957b != this.f46013d.getModuleRegistry()) {
                f.a().b("❌ NativeModuleProxy was configured with a different instance of the modules registry.", null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f46013d;
    }

    private void c(NativeModulesProxy nativeModulesProxy) {
        this.f46013d = nativeModulesProxy;
        if (nativeModulesProxy != null) {
            nativeModulesProxy.getKotlinInteropModuleRegistry().k(this.f46013d);
        }
    }

    protected List a(ReactApplicationContext reactApplicationContext, C5957b c5957b, sb.c cVar) {
        ArrayList arrayList = new ArrayList(2);
        NativeModulesProxy nativeModulesProxyB = b(reactApplicationContext, c5957b);
        if (cVar != null) {
            cVar.apply(nativeModulesProxyB.getKotlinInteropModuleRegistry().f());
        }
        arrayList.add(nativeModulesProxyB);
        arrayList.add(new ModuleRegistryReadyNotifier(c5957b));
        Iterator it = ((c) c5957b.b(c.class)).b().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((O) it.next()).createNativeModules(reactApplicationContext));
        }
        arrayList.add(new ExpoBridgeModule(reactApplicationContext, new WeakReference(nativeModulesProxyB)));
        return arrayList;
    }

    @Override // com.facebook.react.O
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        NativeModulesProxy nativeModulesProxyB = b(reactApplicationContext, null);
        C5957b moduleRegistry = nativeModulesProxyB.getModuleRegistry();
        Iterator it = this.f46012c.f(reactApplicationContext).iterator();
        while (it.hasNext()) {
            moduleRegistry.e((d) it.next());
        }
        List listA = a(reactApplicationContext, moduleRegistry, null);
        if (this.f46014e != null) {
            nativeModulesProxyB.getKotlinInteropModuleRegistry().l(this.f46014e);
        }
        return listA;
    }

    @Override // com.facebook.react.O
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList(this.f46010a.c(reactApplicationContext));
        NativeModulesProxy nativeModulesProxyB = b(reactApplicationContext, null);
        Objects.requireNonNull(nativeModulesProxyB);
        p kotlinInteropModuleRegistry = nativeModulesProxyB.getKotlinInteropModuleRegistry();
        List listD = kotlinInteropModuleRegistry.d();
        this.f46014e = kotlinInteropModuleRegistry.e(listD);
        arrayList.addAll(listD);
        this.f46015f = new FabricComponentsRegistry(listD);
        return arrayList;
    }
}
