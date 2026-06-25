package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class a implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K1.d f31999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f32000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f32001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC0527a f32002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f32003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f32004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final h f32005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32006h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface InterfaceC0527a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.E f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f32008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f32009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f32010d;

        b(int i10, int i11, int i12, Object obj) {
            this.f32007a = i10;
            this.f32008b = i11;
            this.f32010d = i12;
            this.f32009c = obj;
        }

        String a() {
            int i10 = this.f32007a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f32007a;
            if (i10 != bVar.f32007a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f32010d - this.f32008b) == 1 && this.f32010d == bVar.f32008b && this.f32008b == bVar.f32010d) {
                return true;
            }
            if (this.f32010d != bVar.f32010d || this.f32008b != bVar.f32008b) {
                return false;
            }
            Object obj2 = this.f32009c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f32009c)) {
                    return false;
                }
            } else if (bVar.f32009c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f32007a * 31) + this.f32008b) * 31) + this.f32010d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f32008b + "c:" + this.f32010d + ",p:" + this.f32009c + "]";
        }
    }

    a(InterfaceC0527a interfaceC0527a) {
        this(interfaceC0527a, false);
    }

    private void c(b bVar) {
        r(bVar);
    }

    private void d(b bVar) {
        r(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        byte b10;
        int i10 = bVar.f32008b;
        int i11 = bVar.f32010d + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f32002d.f(i12) != null || h(i12)) {
                if (b11 == 0) {
                    k(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    r(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            b11 = b10;
        }
        if (i13 != bVar.f32010d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (b11 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f32008b;
        int i11 = bVar.f32010d + i10;
        int i12 = 0;
        byte b10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f32002d.f(i10) != null || h(i10)) {
                if (b10 == 0) {
                    k(a(4, i13, i12, bVar.f32009c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    r(a(4, i13, i12, bVar.f32009c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 0;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f32010d) {
            Object obj = bVar.f32009c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (b10 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f32001c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f32001c.get(i11);
            int i12 = bVar.f32007a;
            if (i12 == 8) {
                if (n(bVar.f32010d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f32008b;
                int i14 = bVar.f32010d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f32007a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iV = v(bVar.f32008b, i11);
        int i12 = bVar.f32008b;
        int i13 = bVar.f32007a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f32010d; i15++) {
            int iV2 = v(bVar.f32008b + (i10 * i15), bVar.f32007a);
            int i16 = bVar.f32007a;
            if (i16 == 2 ? iV2 != iV : !(i16 == 4 && iV2 == iV + 1)) {
                b bVarA = a(i16, iV, i14, bVar.f32009c);
                l(bVarA, i12);
                b(bVarA);
                if (bVar.f32007a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iV = iV2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f32009c;
        b(bVar);
        if (i14 > 0) {
            b bVarA2 = a(bVar.f32007a, iV, i14, obj);
            l(bVarA2, i12);
            b(bVarA2);
        }
    }

    private void r(b bVar) {
        this.f32001c.add(bVar);
        int i10 = bVar.f32007a;
        if (i10 == 1) {
            this.f32002d.g(bVar.f32008b, bVar.f32010d);
            return;
        }
        if (i10 == 2) {
            this.f32002d.d(bVar.f32008b, bVar.f32010d);
            return;
        }
        if (i10 == 4) {
            this.f32002d.e(bVar.f32008b, bVar.f32010d, bVar.f32009c);
        } else {
            if (i10 == 8) {
                this.f32002d.a(bVar.f32008b, bVar.f32010d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int v(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f32001c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f32001c.get(size);
            int i14 = bVar.f32007a;
            if (i14 == 8) {
                int i15 = bVar.f32008b;
                int i16 = bVar.f32010d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f32008b = i15 + 1;
                            bVar.f32010d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f32008b = i15 - 1;
                            bVar.f32010d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f32010d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f32010d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f32008b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f32008b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f32008b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f32010d;
                    } else if (i14 == 2) {
                        i10 += bVar.f32010d;
                    }
                } else if (i11 == 1) {
                    bVar.f32008b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f32008b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f32001c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f32001c.get(size2);
            if (bVar2.f32007a == 8) {
                int i18 = bVar2.f32010d;
                if (i18 == bVar2.f32008b || i18 < 0) {
                    this.f32001c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f32010d <= 0) {
                this.f32001c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.h.a
    public b a(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f31999a.b();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f32007a = i10;
        bVar.f32008b = i11;
        bVar.f32010d = i12;
        bVar.f32009c = obj;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void b(b bVar) {
        if (this.f32004f) {
            return;
        }
        bVar.f32009c = null;
        this.f31999a.a(bVar);
    }

    public int e(int i10) {
        int size = this.f32000b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f32000b.get(i11);
            int i12 = bVar.f32007a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f32008b;
                    if (i13 <= i10) {
                        int i14 = bVar.f32010d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f32008b;
                    if (i15 == i10) {
                        i10 = bVar.f32010d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f32010d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f32008b <= i10) {
                i10 += bVar.f32010d;
            }
        }
        return i10;
    }

    void i() {
        int size = this.f32001c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f32002d.c((b) this.f32001c.get(i10));
        }
        t(this.f32001c);
        this.f32006h = 0;
    }

    void j() {
        i();
        int size = this.f32000b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f32000b.get(i10);
            int i11 = bVar.f32007a;
            if (i11 == 1) {
                this.f32002d.c(bVar);
                this.f32002d.g(bVar.f32008b, bVar.f32010d);
            } else if (i11 == 2) {
                this.f32002d.c(bVar);
                this.f32002d.h(bVar.f32008b, bVar.f32010d);
            } else if (i11 == 4) {
                this.f32002d.c(bVar);
                this.f32002d.e(bVar.f32008b, bVar.f32010d, bVar.f32009c);
            } else if (i11 == 8) {
                this.f32002d.c(bVar);
                this.f32002d.a(bVar.f32008b, bVar.f32010d);
            }
            Runnable runnable = this.f32003e;
            if (runnable != null) {
                runnable.run();
            }
        }
        t(this.f32000b);
        this.f32006h = 0;
    }

    void l(b bVar, int i10) {
        this.f32002d.b(bVar);
        int i11 = bVar.f32007a;
        if (i11 == 2) {
            this.f32002d.h(i10, bVar.f32010d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f32002d.e(i10, bVar.f32010d, bVar.f32009c);
        }
    }

    int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f32001c.size();
        while (i11 < size) {
            b bVar = (b) this.f32001c.get(i11);
            int i12 = bVar.f32007a;
            if (i12 == 8) {
                int i13 = bVar.f32008b;
                if (i13 == i10) {
                    i10 = bVar.f32010d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f32010d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f32008b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f32010d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f32010d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean o(int i10) {
        return (i10 & this.f32006h) != 0;
    }

    boolean p() {
        return this.f32000b.size() > 0;
    }

    boolean q() {
        return (this.f32001c.isEmpty() || this.f32000b.isEmpty()) ? false : true;
    }

    void s() {
        this.f32005g.b(this.f32000b);
        int size = this.f32000b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f32000b.get(i10);
            int i11 = bVar.f32007a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f32003e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f32000b.clear();
    }

    void t(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((b) list.get(i10));
        }
        list.clear();
    }

    void u() {
        t(this.f32000b);
        t(this.f32001c);
        this.f32006h = 0;
    }

    a(InterfaceC0527a interfaceC0527a, boolean z10) {
        this.f31999a = new Pools$SimplePool(30);
        this.f32000b = new ArrayList();
        this.f32001c = new ArrayList();
        this.f32006h = 0;
        this.f32002d = interfaceC0527a;
        this.f32004f = z10;
        this.f32005g = new h(this);
    }
}
