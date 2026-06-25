package H6;

import android.util.SparseArray;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final SparseArray f7989a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f7990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a f7991c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f7992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinkedList f7994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f7995d;

        public String toString() {
            return "LinkedEntry(key: " + this.f7993b + ")";
        }

        private a(a aVar, int i10, LinkedList linkedList, a aVar2) {
            this.f7992a = aVar;
            this.f7993b = i10;
            this.f7994c = linkedList;
            this.f7995d = aVar2;
        }
    }

    private void b(a aVar) {
        if (aVar == null || !aVar.f7994c.isEmpty()) {
            return;
        }
        d(aVar);
        this.f7989a.remove(aVar.f7993b);
    }

    private void c(a aVar) {
        if (this.f7990b == aVar) {
            return;
        }
        d(aVar);
        a aVar2 = this.f7990b;
        if (aVar2 == null) {
            this.f7990b = aVar;
            this.f7991c = aVar;
        } else {
            aVar.f7995d = aVar2;
            aVar2.f7992a = aVar;
            this.f7990b = aVar;
        }
    }

    private synchronized void d(a aVar) {
        try {
            a aVar2 = aVar.f7992a;
            a aVar3 = aVar.f7995d;
            if (aVar2 != null) {
                aVar2.f7995d = aVar3;
            }
            if (aVar3 != null) {
                aVar3.f7992a = aVar2;
            }
            aVar.f7992a = null;
            aVar.f7995d = null;
            if (aVar == this.f7990b) {
                this.f7990b = aVar3;
            }
            if (aVar == this.f7991c) {
                this.f7991c = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Object a(int i10) {
        a aVar = (a) this.f7989a.get(i10);
        if (aVar == null) {
            return null;
        }
        Object objPollFirst = aVar.f7994c.pollFirst();
        c(aVar);
        return objPollFirst;
    }

    public synchronized void e(int i10, Object obj) {
        try {
            a aVar = (a) this.f7989a.get(i10);
            if (aVar == null) {
                a aVar2 = new a(null, i10, new LinkedList(), null);
                this.f7989a.put(i10, aVar2);
                aVar = aVar2;
            }
            aVar.f7994c.addLast(obj);
            c(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Object f() {
        a aVar = this.f7991c;
        if (aVar == null) {
            return null;
        }
        Object objPollLast = aVar.f7994c.pollLast();
        b(aVar);
        return objPollLast;
    }
}
