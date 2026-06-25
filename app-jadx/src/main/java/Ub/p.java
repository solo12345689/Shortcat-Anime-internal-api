package Ub;

import Td.L;
import Ud.AbstractC2279u;
import Ud.S;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.views.GroupViewManagerWrapper;
import expo.modules.kotlin.views.SimpleViewManagerWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import pb.C5957b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a */
    private final d f19435a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19436a;

        static {
            int[] iArr = new int[expo.modules.kotlin.views.s.values().length];
            try {
                iArr[expo.modules.kotlin.views.s.f46237a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[expo.modules.kotlin.views.s.f46238b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19436a = iArr;
        }
    }

    public p(t modulesProvider, C5957b legacyModuleRegistry, WeakReference reactContext) {
        AbstractC5504s.h(modulesProvider, "modulesProvider");
        AbstractC5504s.h(legacyModuleRegistry, "legacyModuleRegistry");
        AbstractC5504s.h(reactContext, "reactContext");
        this.f19435a = new d(modulesProvider, legacyModuleRegistry, reactContext);
    }

    public final s g() {
        return this.f19435a.C();
    }

    public final void b(String moduleName, String method, ReadableArray arguments, u promise) {
        AbstractC5504s.h(moduleName, "moduleName");
        AbstractC5504s.h(method, "method");
        AbstractC5504s.h(arguments, "arguments");
        AbstractC5504s.h(promise, "promise");
        try {
            r rVarR = g().r(moduleName);
            if (rVarR != null) {
                Object[] array = arguments.toArrayList().toArray();
                AbstractC5504s.g(array, "toArray(...)");
                rVarR.c(method, array, promise);
            } else {
                throw new IllegalArgumentException(("Trying to call '" + method + "' on the non-existing module '" + moduleName + "'").toString());
            }
        } catch (CodedException e10) {
            promise.h(e10);
        } catch (Throwable th2) {
            promise.h(new UnexpectedException(th2));
        }
    }

    public final void c() {
        this.f19435a.K();
    }

    public final List d() {
        BaseViewManager simpleViewManagerWrapper;
        X3.a.c("[ExpoModulesCore] KotlinInteropModuleRegistry.exportViewManagers");
        try {
            s<r> sVarG = g();
            ArrayList arrayList = new ArrayList();
            for (r rVar : sVarG) {
                Map mapH = rVar.e().h();
                ArrayList arrayList2 = new ArrayList(mapH.size());
                for (Map.Entry entry : mapH.entrySet()) {
                    String str = (String) entry.getKey();
                    expo.modules.kotlin.views.r rVar2 = (expo.modules.kotlin.views.r) entry.getValue();
                    expo.modules.kotlin.views.t tVar = new expo.modules.kotlin.views.t(rVar, rVar2, AbstractC5504s.c(str, "DEFAULT_MODULE_VIEW") ? rVar.h() : null);
                    int i10 = a.f19436a[rVar2.j().ordinal()];
                    if (i10 == 1) {
                        simpleViewManagerWrapper = new SimpleViewManagerWrapper(tVar);
                    } else {
                        if (i10 != 2) {
                            throw new Td.r();
                        }
                        simpleViewManagerWrapper = new GroupViewManagerWrapper(tVar);
                    }
                    arrayList2.add(simpleViewManagerWrapper);
                }
                AbstractC2279u.D(arrayList, arrayList2);
            }
            X3.a.f();
            return arrayList;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }

    public final List e(List viewManagers) {
        AbstractC5504s.h(viewManagers, "viewManagers");
        X3.a.c("[ExpoModulesCore] KotlinInteropModuleRegistry.extractViewManagersDelegateHolders");
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : viewManagers) {
                if (obj instanceof expo.modules.kotlin.views.v) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } finally {
            X3.a.f();
        }
    }

    public final d f() {
        return this.f19435a;
    }

    public final boolean h(String name) {
        AbstractC5504s.h(name, "name");
        return g().v(name);
    }

    public final void i() {
        this.f19435a.H();
    }

    public final void j() {
        this.f19435a.L();
        f.a().d("✅ KotlinInteropModuleRegistry was destroyed");
    }

    public final void k(NativeModulesProxy proxyModule) {
        AbstractC5504s.h(proxyModule, "proxyModule");
        this.f19435a.S(new WeakReference(proxyModule));
    }

    public final void l(List viewWrapperHolders) {
        AbstractC5504s.h(viewWrapperHolders, "viewWrapperHolders");
        X3.a.c("[ExpoModulesCore] KotlinInteropModuleRegistry.updateModuleHoldersInViewManagers");
        try {
            ArrayList<expo.modules.kotlin.views.t> arrayList = new ArrayList(AbstractC2279u.x(viewWrapperHolders, 10));
            Iterator it = viewWrapperHolders.iterator();
            while (it.hasNext()) {
                arrayList.add(((expo.modules.kotlin.views.v) it.next()).getViewWrapperDelegate());
            }
            for (expo.modules.kotlin.views.t tVar : arrayList) {
                r rVarR = g().r(tVar.c().h());
                if (rVarR == null) {
                    throw new IllegalArgumentException(("Cannot update the module holder for " + tVar.c().h() + ".").toString());
                }
                tVar.i(rVarR);
            }
            L l10 = L.f17438a;
            X3.a.f();
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }

    public final Map m() {
        X3.a.c("[ExpoModulesCore] KotlinInteropModuleRegistry.viewManagersMetadata");
        try {
            s<r> sVarG = g();
            ArrayList arrayList = new ArrayList();
            for (r rVar : sVarG) {
                Map mapH = rVar.e().h();
                ArrayList arrayList2 = new ArrayList(mapH.size());
                for (Map.Entry entry : mapH.entrySet()) {
                    String str = (String) entry.getKey();
                    expo.modules.kotlin.views.r rVar2 = (expo.modules.kotlin.views.r) entry.getValue();
                    arrayList2.add(Td.z.a(AbstractC5504s.c(str, "DEFAULT_MODULE_VIEW") ? rVar.h() : rVar.h() + "_" + str, S.f(Td.z.a("propsNames", rVar2.h()))));
                }
                AbstractC2279u.D(arrayList, arrayList2);
            }
            Map mapW = S.w(arrayList);
            X3.a.f();
            return mapW;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
