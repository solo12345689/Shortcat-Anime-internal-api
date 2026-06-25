package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.B0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f37819a = new r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f37820b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f37821c = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f37822a;

        public a(Class shadowNodeClass) {
            AbstractC5504s.h(shadowNodeClass, "shadowNodeClass");
            Map mapH = B0.h(shadowNodeClass);
            AbstractC5504s.g(mapH, "getNativePropSettersForShadowNodeClass(...)");
            this.f37822a = mapH;
        }

        @Override // com.facebook.react.uimanager.r0.d
        public void a(Map props) {
            AbstractC5504s.h(props, "props");
            for (B0.m mVar : this.f37822a.values()) {
                props.put(mVar.a(), mVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.r0.e
        public void c(O node, String name, Object obj) {
            AbstractC5504s.h(node, "node");
            AbstractC5504s.h(name, "name");
            B0.m mVar = (B0.m) this.f37822a.get(name);
            if (mVar != null) {
                mVar.d(node, obj);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f37823a;

        public b(Class viewManagerClass) {
            AbstractC5504s.h(viewManagerClass, "viewManagerClass");
            Map mapI = B0.i(viewManagerClass);
            AbstractC5504s.g(mapI, "getNativePropSettersForViewManagerClass(...)");
            this.f37823a = mapI;
        }

        @Override // com.facebook.react.uimanager.r0.d
        public void a(Map props) {
            AbstractC5504s.h(props, "props");
            for (B0.m mVar : this.f37823a.values()) {
                props.put(mVar.a(), mVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.r0.f
        public void b(ViewManager manager, View view, String name, Object obj) {
            AbstractC5504s.h(manager, "manager");
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(name, "name");
            B0.m mVar = (B0.m) this.f37823a.get(name);
            if (mVar != null) {
                mVar.e(manager, view, obj);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewManager f37824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f37825b;

        public c(ViewManager manager) {
            AbstractC5504s.h(manager, "manager");
            this.f37824a = manager;
            this.f37825b = r0.f37819a.d(manager.getClass());
        }

        @Override // com.facebook.react.uimanager.q0
        public void a(View view, String propName, Object obj) {
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(propName, "propName");
            this.f37825b.b(this.f37824a, view, propName, obj);
        }

        @Override // com.facebook.react.uimanager.q0
        public void b(View view, String commandName, ReadableArray args) {
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(commandName, "commandName");
            AbstractC5504s.h(args, "args");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        void a(Map map);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e extends d {
        void c(O o10, String str, Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface f extends d {
        void b(ViewManager viewManager, View view, String str, Object obj);
    }

    private r0() {
    }

    public static final void b() {
        B0.b();
        f37820b.clear();
        f37821c.clear();
    }

    private final Object c(Class cls) {
        String name = cls.getName();
        try {
            return Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            AbstractC7283a.I("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f d(Class cls) {
        Map map = f37820b;
        f bVar = (f) map.get(cls);
        if (bVar == null) {
            bVar = (f) c(cls);
            if (bVar == null) {
                bVar = new b(cls);
            }
            map.put(cls, bVar);
        }
        return bVar;
    }

    private final e e(Class cls) {
        Map map = f37821c;
        e aVar = (e) map.get(cls);
        if (aVar == null) {
            aVar = (e) c(cls);
            if (aVar == null) {
                AbstractC5504s.f(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Nothing>");
                aVar = new a(cls);
            }
            map.put(cls, aVar);
        }
        return aVar;
    }

    public static final Map f(Class viewManagerTopClass, Class cls) {
        AbstractC5504s.h(viewManagerTopClass, "viewManagerTopClass");
        HashMap map = new HashMap();
        r0 r0Var = f37819a;
        r0Var.d(viewManagerTopClass).a(map);
        if (cls != null) {
            r0Var.e(cls).a(map);
        }
        return map;
    }

    public static final void g(O node, Q props) {
        AbstractC5504s.h(node, "node");
        AbstractC5504s.h(props, "props");
        e eVarE = f37819a.e(node.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = props.d().getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            eVarE.c(node, next.getKey(), next.getValue());
        }
    }
}
