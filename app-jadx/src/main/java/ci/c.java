package ci;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: s */
    private static final d f33708s = new d();

    /* JADX INFO: renamed from: t */
    private static final Map f33709t = new HashMap();

    /* JADX INFO: renamed from: e */
    private final h f33714e;

    /* JADX INFO: renamed from: f */
    private final l f33715f;

    /* JADX INFO: renamed from: g */
    private final ci.b f33716g;

    /* JADX INFO: renamed from: h */
    private final ci.a f33717h;

    /* JADX INFO: renamed from: i */
    private final p f33718i;

    /* JADX INFO: renamed from: j */
    private final ExecutorService f33719j;

    /* JADX INFO: renamed from: k */
    private final boolean f33720k;

    /* JADX INFO: renamed from: l */
    private final boolean f33721l;

    /* JADX INFO: renamed from: m */
    private final boolean f33722m;

    /* JADX INFO: renamed from: n */
    private final boolean f33723n;

    /* JADX INFO: renamed from: o */
    private final boolean f33724o;

    /* JADX INFO: renamed from: p */
    private final boolean f33725p;

    /* JADX INFO: renamed from: q */
    private final int f33726q;

    /* JADX INFO: renamed from: r */
    private final g f33727r;

    /* JADX INFO: renamed from: d */
    private final ThreadLocal f33713d = new a();

    /* JADX INFO: renamed from: a */
    private final Map f33710a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map f33711b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final Map f33712c = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends ThreadLocal {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a */
        public C0574c initialValue() {
            return new C0574c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f33729a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f33729a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33729a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33729a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33729a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33729a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: ci.c$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0574c {

        /* JADX INFO: renamed from: a */
        final List f33730a = new ArrayList();

        /* JADX INFO: renamed from: b */
        boolean f33731b;

        /* JADX INFO: renamed from: c */
        boolean f33732c;

        /* JADX INFO: renamed from: d */
        q f33733d;

        /* JADX INFO: renamed from: e */
        Object f33734e;

        /* JADX INFO: renamed from: f */
        boolean f33735f;

        C0574c() {
        }
    }

    c(d dVar) {
        this.f33727r = dVar.b();
        h hVarC = dVar.c();
        this.f33714e = hVarC;
        this.f33715f = hVarC != null ? hVarC.b(this) : null;
        this.f33716g = new ci.b(this);
        this.f33717h = new ci.a(this);
        List list = dVar.f33746j;
        this.f33726q = list != null ? list.size() : 0;
        this.f33718i = new p(dVar.f33746j, dVar.f33744h, dVar.f33743g);
        this.f33721l = dVar.f33737a;
        this.f33722m = dVar.f33738b;
        this.f33723n = dVar.f33739c;
        this.f33724o = dVar.f33740d;
        this.f33720k = dVar.f33741e;
        this.f33725p = dVar.f33742f;
        this.f33719j = dVar.f33745i;
    }

    static void a(List list, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static d b() {
        return new d();
    }

    private void c(q qVar, Object obj) {
        if (obj != null) {
            o(qVar, obj, i());
        }
    }

    private void f(q qVar, Object obj, Throwable th2) {
        if (!(obj instanceof n)) {
            if (this.f33720k) {
                throw new e("Invoking subscriber failed", th2);
            }
            if (this.f33721l) {
                this.f33727r.a(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + qVar.f33783a.getClass(), th2);
            }
            if (this.f33723n) {
                k(new n(this, th2, obj, qVar.f33783a));
                return;
            }
            return;
        }
        if (this.f33721l) {
            g gVar = this.f33727r;
            Level level = Level.SEVERE;
            gVar.a(level, "SubscriberExceptionEvent subscriber " + qVar.f33783a.getClass() + " threw an exception", th2);
            n nVar = (n) obj;
            this.f33727r.a(level, "Initial event " + nVar.f33763c + " caused exception in " + nVar.f33764d, nVar.f33762b);
        }
    }

    private boolean i() {
        h hVar = this.f33714e;
        return hVar == null || hVar.a();
    }

    private static List j(Class cls) {
        List arrayList;
        Map map = f33709t;
        synchronized (map) {
            try {
                arrayList = (List) map.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    f33709t.put(cls, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    private void l(Object obj, C0574c c0574c) {
        boolean zM;
        Class<?> cls = obj.getClass();
        if (this.f33725p) {
            List listJ = j(cls);
            int size = listJ.size();
            zM = false;
            for (int i10 = 0; i10 < size; i10++) {
                zM |= m(obj, c0574c, (Class) listJ.get(i10));
            }
        } else {
            zM = m(obj, c0574c, cls);
        }
        if (zM) {
            return;
        }
        if (this.f33722m) {
            this.f33727r.b(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f33724o || cls == i.class || cls == n.class) {
            return;
        }
        k(new i(this, obj));
    }

    private boolean m(Object obj, C0574c c0574c, Class cls) {
        CopyOnWriteArrayList<q> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f33710a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (q qVar : copyOnWriteArrayList) {
            c0574c.f33734e = obj;
            c0574c.f33733d = qVar;
            try {
                o(qVar, obj, c0574c.f33732c);
                if (c0574c.f33735f) {
                    return true;
                }
            } finally {
                c0574c.f33734e = null;
                c0574c.f33733d = null;
                c0574c.f33735f = false;
            }
        }
        return true;
    }

    private void o(q qVar, Object obj, boolean z10) {
        int i10 = b.f33729a[qVar.f33784b.f33766b.ordinal()];
        if (i10 == 1) {
            h(qVar, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                h(qVar, obj);
                return;
            } else {
                this.f33715f.a(qVar, obj);
                return;
            }
        }
        if (i10 == 3) {
            l lVar = this.f33715f;
            if (lVar != null) {
                lVar.a(qVar, obj);
                return;
            } else {
                h(qVar, obj);
                return;
            }
        }
        if (i10 == 4) {
            if (z10) {
                this.f33716g.a(qVar, obj);
                return;
            } else {
                h(qVar, obj);
                return;
            }
        }
        if (i10 == 5) {
            this.f33717h.a(qVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + qVar.f33784b.f33766b);
    }

    private void r(Object obj, o oVar) {
        Class cls = oVar.f33767c;
        q qVar = new q(obj, oVar);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f33710a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f33710a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(qVar)) {
            throw new e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i10 = 0; i10 <= size; i10++) {
            if (i10 == size || oVar.f33768d > ((q) copyOnWriteArrayList.get(i10)).f33784b.f33768d) {
                copyOnWriteArrayList.add(i10, qVar);
                break;
            }
        }
        List arrayList = (List) this.f33711b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f33711b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (oVar.f33769e) {
            if (!this.f33725p) {
                c(qVar, this.f33712c.get(cls));
                return;
            }
            for (Map.Entry entry : this.f33712c.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey())) {
                    c(qVar, entry.getValue());
                }
            }
        }
    }

    ExecutorService d() {
        return this.f33719j;
    }

    public g e() {
        return this.f33727r;
    }

    void g(j jVar) {
        Object obj = jVar.f33756a;
        q qVar = jVar.f33757b;
        j.b(jVar);
        if (qVar.f33785c) {
            h(qVar, obj);
        }
    }

    void h(q qVar, Object obj) {
        try {
            qVar.f33784b.f33765a.invoke(qVar.f33783a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            f(qVar, obj, e11.getCause());
        }
    }

    public void k(Object obj) {
        C0574c c0574c = (C0574c) this.f33713d.get();
        List list = c0574c.f33730a;
        list.add(obj);
        if (c0574c.f33731b) {
            return;
        }
        c0574c.f33732c = i();
        c0574c.f33731b = true;
        if (c0574c.f33735f) {
            throw new e("Internal error. Abort state was not reset");
        }
        while (true) {
            try {
                if (list.isEmpty()) {
                    return;
                } else {
                    l(list.remove(0), c0574c);
                }
            } finally {
                c0574c.f33731b = false;
                c0574c.f33732c = false;
            }
        }
    }

    public void n(Object obj) {
        synchronized (this.f33712c) {
            this.f33712c.put(obj.getClass(), obj);
        }
        k(obj);
    }

    public void p(Object obj) {
        if (di.b.c() && !di.b.a()) {
            throw new RuntimeException("It looks like you are using EventBus on Android, make sure to add the \"eventbus\" Android library to your dependencies.");
        }
        List listA = this.f33718i.a(obj.getClass());
        synchronized (this) {
            try {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    r(obj, (o) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object q(Class cls) {
        Object objCast;
        synchronized (this.f33712c) {
            objCast = cls.cast(this.f33712c.remove(cls));
        }
        return objCast;
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f33726q + ", eventInheritance=" + this.f33725p + "]";
    }
}
