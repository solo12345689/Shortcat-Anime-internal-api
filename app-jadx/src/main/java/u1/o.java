package u1;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import m1.C5625d;
import t1.AbstractC6589b;
import t1.C6592e;
import t1.C6593f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static int f61188g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f61190b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f61192d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f61189a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f61191c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f61193e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f61194f = -1;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference f61195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f61196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f61197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f61198d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61199e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f61200f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f61201g;

        a(C6592e c6592e, C5625d c5625d, int i10) {
            this.f61195a = new WeakReference(c6592e);
            this.f61196b = c5625d.x(c6592e.f60341O);
            this.f61197c = c5625d.x(c6592e.f60342P);
            this.f61198d = c5625d.x(c6592e.f60343Q);
            this.f61199e = c5625d.x(c6592e.f60344R);
            this.f61200f = c5625d.x(c6592e.f60345S);
            this.f61201g = i10;
        }
    }

    public o(int i10) {
        int i11 = f61188g;
        f61188g = i11 + 1;
        this.f61190b = i11;
        this.f61192d = i10;
    }

    private String e() {
        int i10 = this.f61192d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    private int j(C5625d c5625d, ArrayList arrayList, int i10) {
        int iX;
        int iX2;
        C6593f c6593f = (C6593f) ((C6592e) arrayList.get(0)).L();
        c5625d.D();
        c6593f.g(c5625d, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((C6592e) arrayList.get(i11)).g(c5625d, false);
        }
        if (i10 == 0 && c6593f.f60421W0 > 0) {
            AbstractC6589b.b(c6593f, c5625d, arrayList, 0);
        }
        if (i10 == 1 && c6593f.f60422X0 > 0) {
            AbstractC6589b.b(c6593f, c5625d, arrayList, 1);
        }
        try {
            c5625d.z();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(com.amazon.a.a.o.b.f.f34694a, "\n   at").replace("]", ""));
        }
        this.f61193e = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f61193e.add(new a((C6592e) arrayList.get(i12), c5625d, i10));
        }
        if (i10 == 0) {
            iX = c5625d.x(c6593f.f60341O);
            iX2 = c5625d.x(c6593f.f60343Q);
            c5625d.D();
        } else {
            iX = c5625d.x(c6593f.f60342P);
            iX2 = c5625d.x(c6593f.f60344R);
            c5625d.D();
        }
        return iX2 - iX;
    }

    public boolean a(C6592e c6592e) {
        if (this.f61189a.contains(c6592e)) {
            return false;
        }
        this.f61189a.add(c6592e);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f61189a.size();
        if (this.f61194f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = (o) arrayList.get(i10);
                if (this.f61194f == oVar.f61190b) {
                    g(this.f61192d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f61190b;
    }

    public int d() {
        return this.f61192d;
    }

    public int f(C5625d c5625d, int i10) {
        if (this.f61189a.size() == 0) {
            return 0;
        }
        return j(c5625d, this.f61189a, i10);
    }

    public void g(int i10, o oVar) {
        for (C6592e c6592e : this.f61189a) {
            oVar.a(c6592e);
            if (i10 == 0) {
                c6592e.f60334I0 = oVar.c();
            } else {
                c6592e.f60336J0 = oVar.c();
            }
        }
        this.f61194f = oVar.f61190b;
    }

    public void h(boolean z10) {
        this.f61191c = z10;
    }

    public void i(int i10) {
        this.f61192d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f61190b + "] <";
        Iterator it = this.f61189a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((C6592e) it.next()).t();
        }
        return str + " >";
    }
}
