package androidx.coordinatorlayout.widget;

import K1.d;
import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import t.i0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f28724a = new Pools$SimplePool(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f28725b = new i0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f28726c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f28727d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f28725b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f28724a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void l(ArrayList arrayList) {
        arrayList.clear();
        this.f28724a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f28725b.containsKey(obj) || !this.f28725b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListF = (ArrayList) this.f28725b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f28725b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(Object obj) {
        if (this.f28725b.containsKey(obj)) {
            return;
        }
        this.f28725b.put(obj, null);
    }

    public void c() {
        int size = this.f28725b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f28725b.k(i10);
            if (arrayList != null) {
                l(arrayList);
            }
        }
        this.f28725b.clear();
    }

    public boolean d(Object obj) {
        return this.f28725b.containsKey(obj);
    }

    public List g(Object obj) {
        ArrayList arrayListH = h(obj);
        if (arrayListH == null) {
            return null;
        }
        return new ArrayList(arrayListH);
    }

    ArrayList h(Object obj) {
        return (ArrayList) this.f28725b.get(obj);
    }

    public List i(Object obj) {
        int size = this.f28725b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f28725b.k(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f28725b.g(i10));
            }
        }
        return arrayList;
    }

    public ArrayList j() {
        this.f28726c.clear();
        this.f28727d.clear();
        int size = this.f28725b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f28725b.g(i10), this.f28726c, this.f28727d);
        }
        return this.f28726c;
    }

    public boolean k(Object obj) {
        int size = this.f28725b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f28725b.k(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
