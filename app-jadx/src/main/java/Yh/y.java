package Yh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f23030a;

    public static y c() {
        return new y();
    }

    public void a(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f23030a == null) {
            this.f23030a = new ArrayList();
        }
        if (this.f23030a.isEmpty()) {
            this.f23030a.addAll(list);
            return;
        }
        int size = this.f23030a.size() - 1;
        x xVar = (x) this.f23030a.get(size);
        x xVar2 = (x) list.get(0);
        if (xVar.c() != xVar2.c() || xVar.a() + xVar.b() != xVar2.a()) {
            this.f23030a.addAll(list);
        } else {
            this.f23030a.set(size, x.d(xVar.c(), xVar.a(), xVar.b() + xVar2.b()));
            this.f23030a.addAll(list.subList(1, list.size()));
        }
    }

    public void b(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(((s) it.next()).g());
        }
    }

    public List d() {
        List list = this.f23030a;
        return list != null ? list : Collections.EMPTY_LIST;
    }
}
