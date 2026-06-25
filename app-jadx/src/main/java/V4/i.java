package V4;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements V4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f19742a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f19743b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f19744c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f19745d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19747f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f19748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f19749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class f19750c;

        a(b bVar) {
            this.f19748a = bVar;
        }

        @Override // V4.l
        public void a() {
            this.f19748a.c(this);
        }

        void b(int i10, Class cls) {
            this.f19749b = i10;
            this.f19750c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f19749b == aVar.f19749b && this.f19750c == aVar.f19750c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f19749b * 31;
            Class cls = this.f19750c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f19749b + "array=" + this.f19750c + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends c {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // V4.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i10, Class cls) {
            a aVar = (a) b();
            aVar.b(i10, cls);
            return aVar;
        }
    }

    public i(int i10) {
        this.f19746e = i10;
    }

    private void e(int i10, Class cls) {
        NavigableMap navigableMapL = l(cls);
        Integer num = (Integer) navigableMapL.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapL.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapL.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    private void f() {
        g(this.f19746e);
    }

    private void g(int i10) {
        while (this.f19747f > i10) {
            Object objF = this.f19742a.f();
            o5.k.e(objF);
            V4.a aVarH = h(objF);
            this.f19747f -= aVarH.b(objF) * aVarH.a();
            e(aVarH.b(objF), objF.getClass());
            if (Log.isLoggable(aVarH.q(), 2)) {
                Log.v(aVarH.q(), "evicted: " + aVarH.b(objF));
            }
        }
    }

    private V4.a h(Object obj) {
        return i(obj.getClass());
    }

    private V4.a i(Class cls) {
        V4.a fVar;
        V4.a aVar = (V4.a) this.f19745d.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            fVar = new f();
        }
        this.f19745d.put(cls, fVar);
        return fVar;
    }

    private Object j(a aVar) {
        return this.f19742a.a(aVar);
    }

    private Object k(a aVar, Class cls) {
        V4.a aVarI = i(cls);
        Object objJ = j(aVar);
        if (objJ != null) {
            this.f19747f -= aVarI.b(objJ) * aVarI.a();
            e(aVarI.b(objJ), cls);
        }
        if (objJ != null) {
            return objJ;
        }
        if (Log.isLoggable(aVarI.q(), 2)) {
            Log.v(aVarI.q(), "Allocated " + aVar.f19749b + " bytes");
        }
        return aVarI.newArray(aVar.f19749b);
    }

    private NavigableMap l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f19744c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f19744c.put(cls, treeMap);
        return treeMap;
    }

    private boolean m() {
        int i10 = this.f19747f;
        return i10 == 0 || this.f19746e / i10 >= 2;
    }

    private boolean n(int i10) {
        return i10 <= this.f19746e / 2;
    }

    private boolean o(int i10, Integer num) {
        if (num != null) {
            return m() || num.intValue() <= i10 * 8;
        }
        return false;
    }

    @Override // V4.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                g(this.f19746e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // V4.b
    public synchronized void b() {
        g(0);
    }

    @Override // V4.b
    public synchronized Object c(int i10, Class cls) {
        Integer num;
        try {
            num = (Integer) l(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th2) {
            throw th2;
        }
        return k(o(i10, num) ? this.f19743b.e(num.intValue(), cls) : this.f19743b.e(i10, cls), cls);
    }

    @Override // V4.b
    public synchronized Object d(int i10, Class cls) {
        return k(this.f19743b.e(i10, cls), cls);
    }

    @Override // V4.b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        V4.a aVarI = i(cls);
        int iB = aVarI.b(obj);
        int iA = aVarI.a() * iB;
        if (n(iA)) {
            a aVarE = this.f19743b.e(iB, cls);
            this.f19742a.d(aVarE, obj);
            NavigableMap navigableMapL = l(cls);
            Integer num = (Integer) navigableMapL.get(Integer.valueOf(aVarE.f19749b));
            Integer numValueOf = Integer.valueOf(aVarE.f19749b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapL.put(numValueOf, Integer.valueOf(iIntValue));
            this.f19747f += iA;
            f();
        }
    }
}
