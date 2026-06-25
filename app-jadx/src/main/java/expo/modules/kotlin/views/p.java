package expo.modules.kotlin.views;

import Ud.AbstractC2279u;
import Ud.S;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import dc.C4581b;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import he.AbstractC4945a;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6014d f46218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6027q f46219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X f46220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f46222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Function1 f46223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Function1 f46224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f46225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f46226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f46227j;

    public p(InterfaceC6014d viewClass, InterfaceC6027q viewType, X x10) {
        AbstractC5504s.h(viewClass, "viewClass");
        AbstractC5504s.h(viewType, "viewType");
        this.f46218a = viewClass;
        this.f46219b = viewType;
        this.f46220c = x10;
        String strV = viewClass.v();
        if (strV == null) {
            strV = AbstractC4945a.b(viewClass).getSimpleName();
            AbstractC5504s.g(strV, "getSimpleName(...)");
        }
        this.f46221d = strV;
        this.f46222e = new LinkedHashMap();
        this.f46226i = new LinkedHashMap();
        this.f46227j = new LinkedHashMap();
    }

    private final Function2 d() {
        return new Function2() { // from class: expo.modules.kotlin.views.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return p.e(this.f46217a, (Context) obj, (Ub.d) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View e(p pVar, Context context, Ub.d appContext) {
        Constructor constructor;
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(appContext, "appContext");
        Constructor constructor2 = null;
        try {
            constructor = AbstractC4945a.b(pVar.f46218a).getConstructor(Context.class, Ub.d.class);
        } catch (NoSuchMethodException unused) {
            constructor = null;
        }
        if (constructor != null) {
            try {
                Object objNewInstance = constructor.newInstance(context, appContext);
                AbstractC5504s.e(objNewInstance);
                return (View) objNewInstance;
            } catch (Throwable th2) {
                return pVar.i(context, appContext, th2);
            }
        }
        try {
            constructor2 = AbstractC4945a.b(pVar.f46218a).getConstructor(Context.class);
        } catch (NoSuchMethodException unused2) {
        }
        if (constructor2 != null) {
            try {
                Object objNewInstance2 = constructor2.newInstance(context);
                AbstractC5504s.e(objNewInstance2);
                return (View) objNewInstance2;
            } catch (Throwable th3) {
                return pVar.i(context, appContext, th3);
            }
        }
        throw new IllegalStateException("Didn't find a correct constructor for " + pVar.f46218a);
    }

    private final View i(Context context, Ub.d dVar, Throwable th2) {
        Log.e("ExpoModulesCore", "Couldn't create view of type " + this.f46218a, th2);
        Zb.b bVarR = dVar.r();
        if (bVarR != null) {
            CodedException unexpectedException = th2 instanceof CodedException ? (CodedException) th2 : null;
            if (unexpectedException == null) {
                unexpectedException = new UnexpectedException(th2);
            }
            bVarR.B(unexpectedException);
        }
        return ViewGroup.class.isAssignableFrom(AbstractC4945a.b(this.f46218a)) ? new d(context) : new e(context);
    }

    public final void b(String... callbacks) {
        AbstractC5504s.h(callbacks, "callbacks");
        this.f46225h = new b(callbacks);
    }

    public final r c() {
        Map map = this.f46226i;
        Map map2 = this.f46227j;
        LinkedHashMap linkedHashMap = new LinkedHashMap(S.e(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C4581b) entry.getValue()).a());
        }
        Map mapP = S.p(map, linkedHashMap);
        Iterator it = mapP.entrySet().iterator();
        while (it.hasNext()) {
            dc.g gVar = (dc.g) ((Map.Entry) it.next()).getValue();
            gVar.n(dc.m.f45116a);
            gVar.l(this.f46219b);
            gVar.k(true);
        }
        return new r(d(), AbstractC4945a.b(this.f46218a), this.f46222e, this.f46221d, this.f46223f, this.f46225h, null, this.f46224g, AbstractC2279u.b1(mapP.values()));
    }

    public final Map f() {
        return this.f46226i;
    }

    public final X g() {
        return this.f46220c;
    }

    public final Map h() {
        return this.f46222e;
    }

    public final void j(Function1 function1) {
        this.f46223f = function1;
    }

    public final void k(Function1 function1) {
        this.f46224g = function1;
    }
}
