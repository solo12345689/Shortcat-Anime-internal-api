package androidx.work.impl;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o4.RunnableC5822c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class x extends i4.r {

    /* JADX INFO: renamed from: j */
    private static final String f32954j = i4.i.i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a */
    private final E f32955a;

    /* JADX INFO: renamed from: b */
    private final String f32956b;

    /* JADX INFO: renamed from: c */
    private final i4.d f32957c;

    /* JADX INFO: renamed from: d */
    private final List f32958d;

    /* JADX INFO: renamed from: e */
    private final List f32959e;

    /* JADX INFO: renamed from: f */
    private final List f32960f;

    /* JADX INFO: renamed from: g */
    private final List f32961g;

    /* JADX INFO: renamed from: h */
    private boolean f32962h;

    /* JADX INFO: renamed from: i */
    private i4.l f32963i;

    public x(E e10, List list) {
        this(e10, null, i4.d.KEEP, list, null);
    }

    private static boolean i(x xVar, Set set) {
        set.addAll(xVar.c());
        Set setL = l(xVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setL.contains((String) it.next())) {
                return true;
            }
        }
        List listE = xVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                if (i((x) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(xVar.c());
        return false;
    }

    public static Set l(x xVar) {
        HashSet hashSet = new HashSet();
        List listE = xVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((x) it.next()).c());
            }
        }
        return hashSet;
    }

    public i4.l a() {
        if (this.f32962h) {
            i4.i.e().k(f32954j, "Already enqueued work ids (" + TextUtils.join(", ", this.f32959e) + ")");
        } else {
            RunnableC5822c runnableC5822c = new RunnableC5822c(this);
            this.f32955a.w().c(runnableC5822c);
            this.f32963i = runnableC5822c.d();
        }
        return this.f32963i;
    }

    public i4.d b() {
        return this.f32957c;
    }

    public List c() {
        return this.f32959e;
    }

    public String d() {
        return this.f32956b;
    }

    public List e() {
        return this.f32961g;
    }

    public List f() {
        return this.f32958d;
    }

    public E g() {
        return this.f32955a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f32962h;
    }

    public void k() {
        this.f32962h = true;
    }

    public x(E e10, String str, i4.d dVar, List list) {
        this(e10, str, dVar, list, null);
    }

    public x(E e10, String str, i4.d dVar, List list, List list2) {
        this.f32955a = e10;
        this.f32956b = str;
        this.f32957c = dVar;
        this.f32958d = list;
        this.f32961g = list2;
        this.f32959e = new ArrayList(list.size());
        this.f32960f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f32960f.addAll(((x) it.next()).f32960f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strB = ((i4.u) list.get(i10)).b();
            this.f32959e.add(strB);
            this.f32960f.add(strB);
        }
    }
}
