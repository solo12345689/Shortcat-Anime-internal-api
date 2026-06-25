package Y;

import Td.AbstractC2163n;
import a0.C2506b;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import t.C6540F;
import t.C6550P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f22220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f22223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6540F f22224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f22225f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements InterfaceC5082a {
        a() {
        }

        public final C6550P a() {
            C6550P c6550pM = AbstractC2454w.M(T0.this.b().size());
            T0 t02 = T0.this;
            int size = t02.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                C2429n0 c2429n0 = (C2429n0) t02.b().get(i10);
                C2506b.a(c6550pM, AbstractC2454w.E(c2429n0), c2429n0);
            }
            return c6550pM;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C2506b.b(a());
        }
    }

    public T0(List list, int i10) {
        this.f22220a = list;
        this.f22221b = i10;
        if (!(i10 >= 0)) {
            V0.a("Invalid start index");
        }
        this.f22223d = new ArrayList();
        C6540F c6540f = new C6540F(0, 1, null);
        int size = list.size();
        int iC = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C2429n0 c2429n0 = (C2429n0) this.f22220a.get(i11);
            c6540f.s(c2429n0.b(), new C2402e0(i11, iC, c2429n0.c()));
            iC += c2429n0.c();
        }
        this.f22224e = c6540f;
        this.f22225f = AbstractC2163n.b(new a());
    }

    public final int a() {
        return this.f22222c;
    }

    public final List b() {
        return this.f22220a;
    }

    public final C6550P c() {
        return ((C2506b) this.f22225f.getValue()).o();
    }

    public final C2429n0 d(int i10, Object obj) {
        return (C2429n0) C2506b.k(c(), obj != null ? new C2426m0(Integer.valueOf(i10), obj) : Integer.valueOf(i10));
    }

    public final int e() {
        return this.f22221b;
    }

    public final List f() {
        return this.f22223d;
    }

    public final int g(C2429n0 c2429n0) {
        C2402e0 c2402e0 = (C2402e0) this.f22224e.c(c2429n0.b());
        if (c2402e0 != null) {
            return c2402e0.b();
        }
        return -1;
    }

    public final boolean h(C2429n0 c2429n0) {
        return this.f22223d.add(c2429n0);
    }

    public final void i(C2429n0 c2429n0, int i10) {
        this.f22224e.s(c2429n0.b(), new C2402e0(-1, i10, 0));
    }

    public final void j(int i10, int i11, int i12) {
        char c10;
        long j10;
        char c11;
        long j11;
        char c12 = 7;
        long j12 = -9187201950435737472L;
        if (i10 > i11) {
            C6540F c6540f = this.f22224e;
            Object[] objArr = c6540f.f60107c;
            long[] jArr = c6540f.f60105a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << c12) & j13 & j12) != j12) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j13 & 255) < 128) {
                            c11 = c12;
                            C2402e0 c2402e0 = (C2402e0) objArr[(i13 << 3) + i15];
                            j11 = j12;
                            int iB = c2402e0.b();
                            if (i10 <= iB && iB < i10 + i12) {
                                c2402e0.e((iB - i10) + i11);
                            } else if (i11 <= iB && iB < i10) {
                                c2402e0.e(iB + i12);
                            }
                        } else {
                            c11 = c12;
                            j11 = j12;
                        }
                        j13 >>= 8;
                        i15++;
                        c12 = c11;
                        j12 = j11;
                    }
                    c10 = c12;
                    j10 = j12;
                    if (i14 != 8) {
                        return;
                    }
                } else {
                    c10 = c12;
                    j10 = j12;
                }
                if (i13 == length) {
                    return;
                }
                i13++;
                c12 = c10;
                j12 = j10;
            }
        } else {
            if (i11 <= i10) {
                return;
            }
            C6540F c6540f2 = this.f22224e;
            Object[] objArr2 = c6540f2.f60107c;
            long[] jArr2 = c6540f2.f60105a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                long j14 = jArr2[i16];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j14 & 255) < 128) {
                            C2402e0 c2402e02 = (C2402e0) objArr2[(i16 << 3) + i18];
                            int iB2 = c2402e02.b();
                            if (i10 <= iB2 && iB2 < i10 + i12) {
                                c2402e02.e((iB2 - i10) + i11);
                            } else if (i10 + 1 <= iB2 && iB2 < i11) {
                                c2402e02.e(iB2 - i12);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i17 != 8) {
                        return;
                    }
                }
                if (i16 == length2) {
                    return;
                } else {
                    i16++;
                }
            }
        }
    }

    public final void k(int i10, int i11) {
        char c10;
        long j10;
        char c11;
        long j11;
        char c12 = 7;
        long j12 = -9187201950435737472L;
        if (i10 > i11) {
            C6540F c6540f = this.f22224e;
            Object[] objArr = c6540f.f60107c;
            long[] jArr = c6540f.f60105a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j13 = jArr[i12];
                if ((((~j13) << c12) & j13 & j12) != j12) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j13 & 255) < 128) {
                            c11 = c12;
                            C2402e0 c2402e0 = (C2402e0) objArr[(i12 << 3) + i14];
                            j11 = j12;
                            int iC = c2402e0.c();
                            if (iC == i10) {
                                c2402e0.f(i11);
                            } else if (i11 <= iC && iC < i10) {
                                c2402e0.f(iC + 1);
                            }
                        } else {
                            c11 = c12;
                            j11 = j12;
                        }
                        j13 >>= 8;
                        i14++;
                        c12 = c11;
                        j12 = j11;
                    }
                    c10 = c12;
                    j10 = j12;
                    if (i13 != 8) {
                        return;
                    }
                } else {
                    c10 = c12;
                    j10 = j12;
                }
                if (i12 == length) {
                    return;
                }
                i12++;
                c12 = c10;
                j12 = j10;
            }
        } else {
            if (i11 <= i10) {
                return;
            }
            C6540F c6540f2 = this.f22224e;
            Object[] objArr2 = c6540f2.f60107c;
            long[] jArr2 = c6540f2.f60105a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                long j14 = jArr2[i15];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j14 & 255) < 128) {
                            C2402e0 c2402e02 = (C2402e0) objArr2[(i15 << 3) + i17];
                            int iC2 = c2402e02.c();
                            if (iC2 == i10) {
                                c2402e02.f(i11);
                            } else if (i10 + 1 <= iC2 && iC2 < i11) {
                                c2402e02.f(iC2 - 1);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i16 != 8) {
                        return;
                    }
                }
                if (i15 == length2) {
                    return;
                } else {
                    i15++;
                }
            }
        }
    }

    public final void l(int i10) {
        this.f22222c = i10;
    }

    public final int m(C2429n0 c2429n0) {
        C2402e0 c2402e0 = (C2402e0) this.f22224e.c(c2429n0.b());
        if (c2402e0 != null) {
            return c2402e0.c();
        }
        return -1;
    }

    public final boolean n(int i10, int i11) {
        int iB;
        C2402e0 c2402e0 = (C2402e0) this.f22224e.c(i10);
        if (c2402e0 == null) {
            return false;
        }
        int iB2 = c2402e0.b();
        int iA = i11 - c2402e0.a();
        c2402e0.d(i11);
        if (iA == 0) {
            return true;
        }
        C6540F c6540f = this.f22224e;
        Object[] objArr = c6540f.f60107c;
        long[] jArr = c6540f.f60105a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i12 = 0;
        while (true) {
            long j10 = jArr[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        C2402e0 c2402e02 = (C2402e0) objArr[(i12 << 3) + i14];
                        if (c2402e02.b() >= iB2 && !AbstractC5504s.c(c2402e02, c2402e0) && (iB = c2402e02.b() + iA) >= 0) {
                            c2402e02.e(iB);
                        }
                    }
                    j10 >>= 8;
                }
                if (i13 != 8) {
                    return true;
                }
            }
            if (i12 == length) {
                return true;
            }
            i12++;
        }
    }

    public final int o(C2429n0 c2429n0) {
        C2402e0 c2402e0 = (C2402e0) this.f22224e.c(c2429n0.b());
        return c2402e0 != null ? c2402e0.a() : c2429n0.c();
    }
}
