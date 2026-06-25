package Ub;

import Gf.C1608f0;
import Gf.N;
import Gf.O;
import Gf.P;
import Gf.X0;
import Td.AbstractC2163n;
import Td.L;
import bc.EnumC3046e;
import ie.InterfaceC5082a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: a */
    private final WeakReference f19446a;

    /* JADX INFO: renamed from: b */
    private final Map f19447b;

    /* JADX INFO: renamed from: c */
    private final List f19448c;

    /* JADX INFO: renamed from: d */
    private boolean f19449d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final EnumC3046e f19450a;

        /* JADX INFO: renamed from: b */
        private final Object f19451b;

        /* JADX INFO: renamed from: c */
        private final Object f19452c;

        public a(EnumC3046e eventName, Object obj, Object obj2) {
            AbstractC5504s.h(eventName, "eventName");
            this.f19450a = eventName;
            this.f19451b = obj;
            this.f19452c = obj2;
        }

        public final void a(r moduleHolder) {
            Object obj;
            AbstractC5504s.h(moduleHolder, "moduleHolder");
            Object obj2 = this.f19451b;
            if (obj2 != null && (obj = this.f19452c) != null) {
                moduleHolder.m(this.f19450a, obj2, obj);
            } else if (obj2 != null) {
                moduleHolder.l(this.f19450a, obj2);
            } else {
                moduleHolder.k(this.f19450a);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19450a == aVar.f19450a && AbstractC5504s.c(this.f19451b, aVar.f19451b) && AbstractC5504s.c(this.f19452c, aVar.f19452c);
        }

        public int hashCode() {
            int iHashCode = this.f19450a.hashCode() * 31;
            Object obj = this.f19451b;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f19452c;
            return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
        }

        public String toString() {
            return "PostponedEvent(eventName=" + this.f19450a + ", sender=" + this.f19451b + ", payload=" + this.f19452c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ r f19453a;

        b(r rVar) {
            this.f19453a = rVar;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final O invoke() {
            return P.a(C1608f0.a().w(X0.b(null, 1, null)).w(new N(this.f19453a.h())));
        }
    }

    public s(WeakReference appContextHolder) {
        AbstractC5504s.h(appContextHolder, "appContextHolder");
        this.f19446a = appContextHolder;
        this.f19447b = new LinkedHashMap();
        this.f19448c = new ArrayList();
    }

    private final void B() {
        synchronized (this) {
            this.f19449d = true;
            L l10 = L.f17438a;
        }
    }

    private final boolean d(EnumC3046e enumC3046e, Object obj, Object obj2) {
        synchronized (this) {
            if (this.f19449d) {
                return false;
            }
            this.f19448c.add(new a(enumC3046e, obj, obj2));
            return true;
        }
    }

    static /* synthetic */ boolean e(s sVar, EnumC3046e enumC3046e, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            obj2 = null;
        }
        return sVar.d(enumC3046e, obj, obj2);
    }

    private final void i() {
        synchronized (this) {
            try {
                for (a aVar : this.f19448c) {
                    Iterator it = iterator();
                    while (it.hasNext()) {
                        aVar.a((r) it.next());
                    }
                }
                this.f19448c.clear();
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void A() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((r) it.next()).k(EnumC3046e.f33268a);
        }
        G();
        B();
        i();
    }

    public final s D(t provider) {
        AbstractC5504s.h(provider, "provider");
        for (Map.Entry entry : provider.getModulesMap().entrySet()) {
            Class cls = (Class) entry.getKey();
            String str = (String) entry.getValue();
            gc.c cVar = (gc.c) cls.getDeclaredConstructor(null).newInstance(null);
            AbstractC5504s.e(cVar);
            F(cVar, str);
        }
        return this;
    }

    public final void F(gc.c module, String str) {
        AbstractC5504s.h(module, "module");
        X3.a.c("[ExpoModulesCore] " + ("ModuleRegistry.register(" + module.getClass() + ")"));
        try {
            if (this.f19446a.get() == null) {
                throw new IllegalArgumentException("Cannot register a module to an invalid app context.");
            }
            module.w(this.f19446a);
            r rVar = new r(module, str);
            module.v(AbstractC2163n.b(new b(rVar)));
            t().put(rVar.h(), rVar);
            L l10 = L.f17438a;
        } finally {
            X3.a.f();
        }
    }

    public final void G() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((r) it.next()).n();
        }
    }

    public final void f() {
        this.f19447b.clear();
        f.a().d("✅ ModuleRegistry was destroyed");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f19447b.values().iterator();
    }

    public final gc.c l(String name) {
        AbstractC5504s.h(name, "name");
        r rVar = (r) this.f19447b.get(name);
        if (rVar != null) {
            return rVar.g();
        }
        return null;
    }

    public final r n(gc.c module) {
        Object next;
        AbstractC5504s.h(module, "module");
        Iterator it = this.f19447b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((r) next).g() == module) {
                break;
            }
        }
        if (next instanceof r) {
            return (r) next;
        }
        return null;
    }

    public final r p(Class viewClass) {
        r rVar;
        AbstractC5504s.h(viewClass, "viewClass");
        Iterator it = this.f19447b.entrySet().iterator();
        do {
            rVar = null;
            if (!it.hasNext()) {
                break;
            }
            r rVar2 = (r) ((Map.Entry) it.next()).getValue();
            if (u(rVar2, viewClass) != null) {
                rVar = rVar2;
            }
        } while (rVar == null);
        return rVar;
    }

    public final r r(String name) {
        AbstractC5504s.h(name, "name");
        return (r) this.f19447b.get(name);
    }

    public final Map t() {
        return this.f19447b;
    }

    public final expo.modules.kotlin.views.r u(r holder, Class viewClass) {
        Object next;
        AbstractC5504s.h(holder, "holder");
        AbstractC5504s.h(viewClass, "viewClass");
        Iterator it = holder.e().h().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5504s.c(((expo.modules.kotlin.views.r) next).k(), viewClass)) {
                break;
            }
        }
        return (expo.modules.kotlin.views.r) next;
    }

    public final boolean v(String name) {
        AbstractC5504s.h(name, "name");
        return this.f19447b.containsKey(name);
    }

    public final void w(EnumC3046e eventName) {
        AbstractC5504s.h(eventName, "eventName");
        if (e(this, eventName, null, null, 6, null)) {
            return;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            ((r) it.next()).k(eventName);
        }
    }

    public final void y(EnumC3046e eventName, Object obj) {
        AbstractC5504s.h(eventName, "eventName");
        if (e(this, eventName, obj, null, 4, null)) {
            return;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            ((r) it.next()).l(eventName, obj);
        }
    }

    public final void z(EnumC3046e eventName, Object obj, Object obj2) {
        AbstractC5504s.h(eventName, "eventName");
        if (d(eventName, obj, obj2)) {
            return;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            ((r) it.next()).m(eventName, obj, obj2);
        }
    }
}
