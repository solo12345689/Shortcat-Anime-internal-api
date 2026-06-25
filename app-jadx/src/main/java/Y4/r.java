package Y4;

import Y4.n;
import com.bumptech.glide.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f22826e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final n f22827f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f22828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f22829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f22830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K1.d f22831d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements n {
        a() {
        }

        @Override // Y4.n
        public boolean a(Object obj) {
            return false;
        }

        @Override // Y4.n
        public n.a b(Object obj, int i10, int i11, S4.h hVar) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f22832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f22833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o f22834c;

        public b(Class cls, Class cls2, o oVar) {
            this.f22832a = cls;
            this.f22833b = cls2;
            this.f22834c = oVar;
        }

        public boolean a(Class cls) {
            return this.f22832a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            return a(cls) && this.f22833b.isAssignableFrom(cls2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c {
        c() {
        }

        public q a(List list, K1.d dVar) {
            return new q(list, dVar);
        }
    }

    public r(K1.d dVar) {
        this(dVar, f22826e);
    }

    private void a(Class cls, Class cls2, o oVar, boolean z10) {
        b bVar = new b(cls, cls2, oVar);
        List list = this.f22828a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private n c(b bVar) {
        return (n) o5.k.e(bVar.f22834c.d(this));
    }

    private static n f() {
        return f22827f;
    }

    private o h(b bVar) {
        return bVar.f22834c;
    }

    synchronized void b(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, true);
    }

    public synchronized n d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f22828a) {
                if (this.f22830c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f22830c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f22830c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f22829b.a(arrayList, this.f22831d);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z10) {
                throw new h.c(cls, cls2);
            }
            return f();
        } catch (Throwable th2) {
            this.f22830c.clear();
            throw th2;
        }
    }

    synchronized List e(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f22828a) {
                if (!this.f22830c.contains(bVar) && bVar.a(cls)) {
                    this.f22830c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f22830c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f22828a) {
            if (!arrayList.contains(bVar.f22833b) && bVar.a(cls)) {
                arrayList.add(bVar.f22833b);
            }
        }
        return arrayList;
    }

    synchronized void i(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, false);
    }

    synchronized List j(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f22828a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(bVar));
            }
        }
        return arrayList;
    }

    synchronized List k(Class cls, Class cls2, o oVar) {
        List listJ;
        listJ = j(cls, cls2);
        b(cls, cls2, oVar);
        return listJ;
    }

    r(K1.d dVar, c cVar) {
        this.f22828a = new ArrayList();
        this.f22830c = new HashSet();
        this.f22831d = dVar;
        this.f22829b = cVar;
    }
}
