package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import t.C6573x;
import t.i0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i0 f32159a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C6573x f32160b = new C6573x();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static K1.d f32161d = new Pools$SimplePool(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView.m.b f32163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RecyclerView.m.b f32164c;

        private a() {
        }

        static void a() {
            while (f32161d.b() != null) {
            }
        }

        static a b() {
            a aVar = (a) f32161d.b();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f32162a = 0;
            aVar.f32163b = null;
            aVar.f32164c = null;
            f32161d.a(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
        void a(RecyclerView.E e10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void b(RecyclerView.E e10);

        void c(RecyclerView.E e10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void d(RecyclerView.E e10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);
    }

    p() {
    }

    private RecyclerView.m.b l(RecyclerView.E e10, int i10) {
        a aVar;
        RecyclerView.m.b bVar;
        int iE = this.f32159a.e(e10);
        if (iE >= 0 && (aVar = (a) this.f32159a.k(iE)) != null) {
            int i11 = aVar.f32162a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f32162a = i12;
                if (i10 == 4) {
                    bVar = aVar.f32163b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f32164c;
                }
                if ((i12 & 12) == 0) {
                    this.f32159a.i(iE);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    void a(RecyclerView.E e10, RecyclerView.m.b bVar) {
        a aVarB = (a) this.f32159a.get(e10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f32159a.put(e10, aVarB);
        }
        aVarB.f32162a |= 2;
        aVarB.f32163b = bVar;
    }

    void b(RecyclerView.E e10) {
        a aVarB = (a) this.f32159a.get(e10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f32159a.put(e10, aVarB);
        }
        aVarB.f32162a |= 1;
    }

    void c(long j10, RecyclerView.E e10) {
        this.f32160b.i(j10, e10);
    }

    void d(RecyclerView.E e10, RecyclerView.m.b bVar) {
        a aVarB = (a) this.f32159a.get(e10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f32159a.put(e10, aVarB);
        }
        aVarB.f32164c = bVar;
        aVarB.f32162a |= 8;
    }

    void e(RecyclerView.E e10, RecyclerView.m.b bVar) {
        a aVarB = (a) this.f32159a.get(e10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f32159a.put(e10, aVarB);
        }
        aVarB.f32163b = bVar;
        aVarB.f32162a |= 4;
    }

    void f() {
        this.f32159a.clear();
        this.f32160b.a();
    }

    RecyclerView.E g(long j10) {
        return (RecyclerView.E) this.f32160b.e(j10);
    }

    boolean h(RecyclerView.E e10) {
        a aVar = (a) this.f32159a.get(e10);
        return (aVar == null || (aVar.f32162a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.E e10) {
        a aVar = (a) this.f32159a.get(e10);
        return (aVar == null || (aVar.f32162a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.E e10) {
        p(e10);
    }

    RecyclerView.m.b m(RecyclerView.E e10) {
        return l(e10, 8);
    }

    RecyclerView.m.b n(RecyclerView.E e10) {
        return l(e10, 4);
    }

    void o(b bVar) {
        for (int size = this.f32159a.size() - 1; size >= 0; size--) {
            RecyclerView.E e10 = (RecyclerView.E) this.f32159a.g(size);
            a aVar = (a) this.f32159a.i(size);
            int i10 = aVar.f32162a;
            if ((i10 & 3) == 3) {
                bVar.b(e10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.m.b bVar2 = aVar.f32163b;
                if (bVar2 == null) {
                    bVar.b(e10);
                } else {
                    bVar.c(e10, bVar2, aVar.f32164c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(e10, aVar.f32163b, aVar.f32164c);
            } else if ((i10 & 12) == 12) {
                bVar.d(e10, aVar.f32163b, aVar.f32164c);
            } else if ((i10 & 4) != 0) {
                bVar.c(e10, aVar.f32163b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(e10, aVar.f32163b, aVar.f32164c);
            }
            a.c(aVar);
        }
    }

    void p(RecyclerView.E e10) {
        a aVar = (a) this.f32159a.get(e10);
        if (aVar == null) {
            return;
        }
        aVar.f32162a &= -2;
    }

    void q(RecyclerView.E e10) {
        int iM = this.f32160b.m() - 1;
        while (true) {
            if (iM < 0) {
                break;
            }
            if (e10 == this.f32160b.n(iM)) {
                this.f32160b.k(iM);
                break;
            }
            iM--;
        }
        a aVar = (a) this.f32159a.remove(e10);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
