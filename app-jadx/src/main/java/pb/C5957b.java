package pb;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sb.d;
import sb.k;
import sb.l;

/* JADX INFO: renamed from: pb.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5957b {

    /* JADX INFO: renamed from: a */
    private final Map f55874a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map f55875b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final List f55876c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private volatile boolean f55877d = false;

    /* JADX INFO: renamed from: e */
    private WeakReference f55878e = new WeakReference(null);

    public C5957b(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            e((d) it.next());
        }
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            f(null);
        }
    }

    public synchronized void a() {
        if (!this.f55877d) {
            c();
            this.f55877d = true;
        }
    }

    public Object b(Class cls) {
        return this.f55874a.get(cls);
    }

    public void c() {
        ArrayList arrayList = new ArrayList(this.f55874a.values());
        Iterator it = this.f55876c.iterator();
        while (it.hasNext()) {
            k kVar = (k) ((WeakReference) it.next()).get();
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).f(this);
        }
    }

    public void d() {
        ArrayList arrayList = new ArrayList(this.f55874a.values());
        Iterator it = this.f55876c.iterator();
        while (it.hasNext()) {
            k kVar = (k) ((WeakReference) it.next()).get();
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).d();
        }
    }

    public void e(d dVar) {
        Iterator it = dVar.c().iterator();
        while (it.hasNext()) {
            this.f55874a.put((Class) it.next(), dVar);
        }
    }

    public void f(l lVar) {
        this.f55875b.put(lVar.getName(), lVar);
    }

    public void g(Ub.d dVar) {
        this.f55878e = new WeakReference(dVar);
    }
}
