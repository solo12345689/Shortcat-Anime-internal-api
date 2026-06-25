package x6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f63971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f63972b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63973c = 0;

    public m(D d10) {
        this.f63971a = d10;
    }

    private int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return this.f63971a.a(obj);
    }

    public synchronized boolean a(Object obj) {
        return this.f63972b.containsKey(obj);
    }

    public synchronized Object b(Object obj) {
        return this.f63972b.get(obj);
    }

    public synchronized int c() {
        return this.f63972b.size();
    }

    public synchronized Object d() {
        return this.f63972b.isEmpty() ? null : this.f63972b.keySet().iterator().next();
    }

    public synchronized ArrayList e(y5.l lVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f63972b.entrySet().size());
            for (Map.Entry entry : this.f63972b.entrySet()) {
                if (lVar == null || lVar.apply(entry.getKey())) {
                    arrayList.add(entry);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized int f() {
        return this.f63973c;
    }

    public synchronized Object h(Object obj, Object obj2) {
        Object objRemove;
        objRemove = this.f63972b.remove(obj);
        this.f63973c -= g(objRemove);
        this.f63972b.put(obj, obj2);
        this.f63973c += g(obj2);
        return objRemove;
    }

    public synchronized Object i(Object obj) {
        Object objRemove;
        objRemove = this.f63972b.remove(obj);
        this.f63973c -= g(objRemove);
        return objRemove;
    }

    public synchronized ArrayList j(y5.l lVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f63972b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (lVar == null || lVar.apply(entry.getKey())) {
                    arrayList.add(entry.getValue());
                    this.f63973c -= g(entry.getValue());
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized void k() {
        if (this.f63972b.isEmpty()) {
            this.f63973c = 0;
        }
    }
}
