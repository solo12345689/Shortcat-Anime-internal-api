package Y4;

import com.bumptech.glide.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f22813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f22814b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f22815a = new HashMap();

        /* JADX INFO: renamed from: Y4.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0388a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final List f22816a;

            public C0388a(List list) {
                this.f22816a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f22815a.clear();
        }

        public List b(Class cls) {
            C0388a c0388a = (C0388a) this.f22815a.get(cls);
            if (c0388a == null) {
                return null;
            }
            return c0388a.f22816a;
        }

        public void c(Class cls, List list) {
            if (((C0388a) this.f22815a.put(cls, new C0388a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(K1.d dVar) {
        this(new r(dVar));
    }

    private static Class b(Object obj) {
        return obj.getClass();
    }

    private synchronized List e(Class cls) {
        List listB;
        listB = this.f22814b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f22813a.e(cls));
            this.f22814b.c(cls, listB);
        }
        return listB;
    }

    private void h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((o) it.next()).teardown();
        }
    }

    public synchronized void a(Class cls, Class cls2, o oVar) {
        this.f22813a.b(cls, cls2, oVar);
        this.f22814b.a();
    }

    public synchronized List c(Class cls) {
        return this.f22813a.g(cls);
    }

    public List d(Object obj) {
        List listE = e(b(obj));
        if (listE.isEmpty()) {
            throw new h.c(obj);
        }
        int size = listE.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) listE.get(i10);
            if (nVar.a(obj)) {
                if (z10) {
                    arrayList = new ArrayList(size - i10);
                    z10 = false;
                }
                arrayList.add(nVar);
            }
        }
        if (arrayList.isEmpty()) {
            throw new h.c(obj, listE);
        }
        return arrayList;
    }

    public synchronized void f(Class cls, Class cls2, o oVar) {
        this.f22813a.i(cls, cls2, oVar);
        this.f22814b.a();
    }

    public synchronized void g(Class cls, Class cls2, o oVar) {
        h(this.f22813a.k(cls, cls2, oVar));
        this.f22814b.a();
    }

    private p(r rVar) {
        this.f22814b = new a();
        this.f22813a = rVar;
    }
}
