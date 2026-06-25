package com.facebook.react.uimanager;

import Ud.AbstractC2279u;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.bridge.UiThreadUtil;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a */
    private final Map f37872a;

    /* JADX INFO: renamed from: b */
    private final z0 f37873b;

    public y0(z0 viewManagerResolver) {
        AbstractC5504s.h(viewManagerResolver, "viewManagerResolver");
        this.f37872a = new LinkedHashMap();
        this.f37873b = viewManagerResolver;
    }

    private final ViewManager h(String str) {
        z0 z0Var = this.f37873b;
        ViewManager viewManagerB = z0Var != null ? z0Var.b(str) : null;
        if (viewManagerB != null) {
            this.f37872a.put(str, viewManagerB);
        }
        return viewManagerB;
    }

    public static final void k(InterfaceC5082a interfaceC5082a) {
        interfaceC5082a.invoke();
    }

    public static final Td.L l(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).invalidate();
        }
        return Td.L.f17438a;
    }

    public static final Td.L n(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).onSurfaceStopped(i10);
        }
        return Td.L.f17438a;
    }

    public static final void o(InterfaceC5082a interfaceC5082a) {
        interfaceC5082a.invoke();
    }

    public static final Td.L p(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).trimMemory();
        }
        return Td.L.f17438a;
    }

    public static final void q(InterfaceC5082a interfaceC5082a) {
        interfaceC5082a.invoke();
    }

    public final synchronized ViewManager g(String className) {
        try {
            AbstractC5504s.h(className, "className");
            ViewManager viewManager = (ViewManager) this.f37872a.get(className);
            if (viewManager != null) {
                return viewManager;
            }
            String str = "RCT" + className;
            ViewManager viewManager2 = (ViewManager) this.f37872a.get(str);
            if (viewManager2 != null) {
                return viewManager2;
            }
            if (this.f37873b == null) {
                throw new C3299o("No ViewManager found for class " + className);
            }
            ViewManager viewManagerH = h(className);
            if (viewManagerH != null) {
                return viewManagerH;
            }
            ViewManager viewManagerH2 = h(str);
            if (viewManagerH2 != null) {
                return viewManagerH2;
            }
            throw new C3299o("Can't find ViewManager '" + className + "' nor '" + str + "' in ViewManagerRegistry, existing names are: " + this.f37873b.a());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized ViewManager i(String className) {
        AbstractC5504s.h(className, "className");
        ViewManager viewManager = (ViewManager) this.f37872a.get(className);
        if (viewManager != null) {
            return viewManager;
        }
        return this.f37873b != null ? h(className) : null;
    }

    public final void j() {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f37872a.values());
        }
        final InterfaceC5082a interfaceC5082a = new InterfaceC5082a() { // from class: com.facebook.react.uimanager.s0
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return y0.l(arrayList);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            interfaceC5082a.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.t0
                @Override // java.lang.Runnable
                public final void run() {
                    y0.k(interfaceC5082a);
                }
            });
        }
    }

    public final void m(final int i10) {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f37872a.values());
        }
        final InterfaceC5082a interfaceC5082a = new InterfaceC5082a() { // from class: com.facebook.react.uimanager.w0
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return y0.n(arrayList, i10);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            interfaceC5082a.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.x0
                @Override // java.lang.Runnable
                public final void run() {
                    y0.o(interfaceC5082a);
                }
            });
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC5504s.h(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(40);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f37872a.values());
        }
        final InterfaceC5082a interfaceC5082a = new InterfaceC5082a() { // from class: com.facebook.react.uimanager.u0
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return y0.p(arrayList);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            interfaceC5082a.invoke();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.v0
                @Override // java.lang.Runnable
                public final void run() {
                    y0.q(interfaceC5082a);
                }
            });
        }
    }

    public y0(List viewManagerList) {
        AbstractC5504s.h(viewManagerList, "viewManagerList");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(Ud.S.e(AbstractC2279u.x(viewManagerList, 10)), 16));
        for (Object obj : viewManagerList) {
            linkedHashMap.put(((ViewManager) obj).getName(), obj);
        }
        this.f37872a = Ud.S.B(linkedHashMap);
        this.f37873b = null;
    }
}
