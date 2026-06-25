package j5;

import S4.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f51651a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f51652b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f51653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f51654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final j f51655c;

        public a(Class cls, Class cls2, j jVar) {
            this.f51653a = cls;
            this.f51654b = cls2;
            this.f51655c = jVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f51653a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f51654b);
        }
    }

    private synchronized List c(String str) {
        List arrayList;
        try {
            if (!this.f51651a.contains(str)) {
                this.f51651a.add(str);
            }
            arrayList = (List) this.f51652b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f51652b.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized void a(String str, j jVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, jVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f51651a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f51652b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f51655c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f51651a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f51652b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f51654b)) {
                        arrayList.add(aVar.f51654b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(String str, j jVar, Class cls, Class cls2) {
        c(str).add(0, new a(cls, cls2, jVar));
    }

    public synchronized void f(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f51651a);
            this.f51651a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f51651a.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f51651a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
