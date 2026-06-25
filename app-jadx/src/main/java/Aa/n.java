package aa;

import aa.n;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import ea.InterfaceC4664a;
import ja.InterfaceC5358c;
import ja.InterfaceC5359d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ma.InterfaceC5655b;
import w.Y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class n implements InterfaceC2596d, InterfaceC4664a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final InterfaceC5655b f23875i = new InterfaceC5655b() { // from class: aa.j
        @Override // ma.InterfaceC5655b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f23876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f23877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f23878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f23879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f23880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f23881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f23882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f23883h;

    public static /* synthetic */ Object h(n nVar, C2595c c2595c) {
        nVar.getClass();
        return c2595c.h().a(new C2592E(c2595c, nVar));
    }

    public static b k(Executor executor) {
        return new b(executor);
    }

    private void l(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f23879d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC5655b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f23883h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C2595c) it2.next()).j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f23880e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f23880e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f23876a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f23876a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C2595c c2595c = (C2595c) it3.next();
                this.f23876a.put(c2595c, new w(new InterfaceC5655b() { // from class: aa.k
                    @Override // ma.InterfaceC5655b
                    public final Object get() {
                        return n.h(this.f23869a, c2595c);
                    }
                }));
            }
            arrayList.addAll(r(list));
            arrayList.addAll(s());
            q();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        p();
    }

    private void m(Map map, boolean z10) {
        for (Map.Entry entry : map.entrySet()) {
            C2595c c2595c = (C2595c) entry.getKey();
            InterfaceC5655b interfaceC5655b = (InterfaceC5655b) entry.getValue();
            if (c2595c.n() || (c2595c.o() && z10)) {
                interfaceC5655b.get();
            }
        }
        this.f23881f.f();
    }

    private static List o(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void p() {
        Boolean bool = (Boolean) this.f23882g.get();
        if (bool != null) {
            m(this.f23876a, bool.booleanValue());
        }
    }

    private void q() {
        for (C2595c c2595c : this.f23876a.keySet()) {
            for (q qVar : c2595c.g()) {
                if (qVar.f() && !this.f23878c.containsKey(qVar.b())) {
                    this.f23878c.put(qVar.b(), x.b(Collections.EMPTY_SET));
                } else if (this.f23877b.containsKey(qVar.b())) {
                    continue;
                } else {
                    if (qVar.e()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", c2595c, qVar.b()));
                    }
                    if (!qVar.f()) {
                        this.f23877b.put(qVar.b(), C2589B.c());
                    }
                }
            }
        }
    }

    private List r(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2595c c2595c = (C2595c) it.next();
            if (c2595c.p()) {
                final InterfaceC5655b interfaceC5655b = (InterfaceC5655b) this.f23876a.get(c2595c);
                for (C2591D c2591d : c2595c.j()) {
                    if (this.f23877b.containsKey(c2591d)) {
                        final C2589B c2589b = (C2589B) ((InterfaceC5655b) this.f23877b.get(c2591d));
                        arrayList.add(new Runnable() { // from class: aa.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                c2589b.d(interfaceC5655b);
                            }
                        });
                    } else {
                        this.f23877b.put(c2591d, interfaceC5655b);
                    }
                }
            }
        }
        return arrayList;
    }

    private List s() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f23876a.entrySet()) {
            C2595c c2595c = (C2595c) entry.getKey();
            if (!c2595c.p()) {
                InterfaceC5655b interfaceC5655b = (InterfaceC5655b) entry.getValue();
                for (C2591D c2591d : c2595c.j()) {
                    if (!map.containsKey(c2591d)) {
                        map.put(c2591d, new HashSet());
                    }
                    ((Set) map.get(c2591d)).add(interfaceC5655b);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f23878c.containsKey(entry2.getKey())) {
                final x xVar = (x) this.f23878c.get(entry2.getKey());
                for (final InterfaceC5655b interfaceC5655b2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: aa.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            xVar.a(interfaceC5655b2);
                        }
                    });
                }
            } else {
                this.f23878c.put((C2591D) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // aa.InterfaceC2596d
    public synchronized InterfaceC5655b b(C2591D c2591d) {
        AbstractC2590C.c(c2591d, "Null interface requested.");
        return (InterfaceC5655b) this.f23877b.get(c2591d);
    }

    @Override // aa.InterfaceC2596d
    public synchronized InterfaceC5655b d(C2591D c2591d) {
        x xVar = (x) this.f23878c.get(c2591d);
        if (xVar != null) {
            return xVar;
        }
        return f23875i;
    }

    public void n(boolean z10) {
        HashMap map;
        if (Y.a(this.f23882g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f23876a);
            }
            m(map, z10);
        }
    }

    private n(Executor executor, Iterable iterable, Collection collection, i iVar) {
        this.f23876a = new HashMap();
        this.f23877b = new HashMap();
        this.f23878c = new HashMap();
        this.f23880e = new HashSet();
        this.f23882g = new AtomicReference();
        u uVar = new u(executor);
        this.f23881f = uVar;
        this.f23883h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C2595c.q(uVar, u.class, InterfaceC5359d.class, InterfaceC5358c.class));
        arrayList.add(C2595c.q(this, InterfaceC4664a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C2595c c2595c = (C2595c) it.next();
            if (c2595c != null) {
                arrayList.add(c2595c);
            }
        }
        this.f23879d = o(iterable);
        l(arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f23884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f23885b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f23886c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i f23887d = i.f23868a;

        b(Executor executor) {
            this.f23884a = executor;
        }

        public b b(C2595c c2595c) {
            this.f23886c.add(c2595c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f23885b.add(new InterfaceC5655b() { // from class: aa.o
                @Override // ma.InterfaceC5655b
                public final Object get() {
                    return n.b.a(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f23885b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f23884a, this.f23885b, this.f23886c, this.f23887d);
        }

        public b f(i iVar) {
            this.f23887d = iVar;
            return this;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
