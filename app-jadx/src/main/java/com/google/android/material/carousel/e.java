package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p9.AbstractC5946a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f42191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f42193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f42196f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f42197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f42198b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f42200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f42201e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f42199c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f42202f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f42203g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f42204h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f42205i = -1;

        public b(float f10, int i10) {
            this.f42197a = f10;
            this.f42198b = i10;
        }

        private static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        public b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        public b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        public b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        public b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            int i10 = this.f42198b;
            if (f15 > i10) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, i10));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, fAbs);
        }

        public b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        public b f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f42205i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f42205i = this.f42199c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f42200d == null) {
                    this.f42200d = cVar;
                    this.f42202f = this.f42199c.size();
                }
                if (this.f42203g != -1 && this.f42199c.size() - this.f42203g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f42200d.f42209d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f42201e = cVar;
                this.f42203g = this.f42199c.size();
            } else {
                if (this.f42200d == null && cVar.f42209d < this.f42204h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f42201e != null && cVar.f42209d > this.f42204h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f42204h = cVar.f42209d;
            this.f42199c.add(cVar);
            return this;
        }

        public b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        public b h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        public e i() {
            if (this.f42200d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f42199c.size(); i10++) {
                c cVar = (c) this.f42199c.get(i10);
                arrayList.add(new c(j(this.f42200d.f42207b, this.f42197a, this.f42202f, i10), cVar.f42207b, cVar.f42208c, cVar.f42209d, cVar.f42210e, cVar.f42211f, cVar.f42212g, cVar.f42213h));
            }
            return new e(this.f42197a, arrayList, this.f42202f, this.f42203g, this.f42198b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f42206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f42207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f42208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f42209d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f42210e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f42211f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f42212g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f42213h;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(AbstractC5946a.a(cVar.f42206a, cVar2.f42206a, f10), AbstractC5946a.a(cVar.f42207b, cVar2.f42207b, f10), AbstractC5946a.a(cVar.f42208c, cVar2.f42208c, f10), AbstractC5946a.a(cVar.f42209d, cVar2.f42209d, f10));
        }

        c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f42206a = f10;
            this.f42207b = f11;
            this.f42208c = f12;
            this.f42209d = f13;
            this.f42210e = z10;
            this.f42211f = f14;
            this.f42212g = f15;
            this.f42213h = f16;
        }
    }

    static e o(e eVar, e eVar2, float f10) {
        if (eVar.g() != eVar2.g()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listH = eVar.h();
        List listH2 = eVar2.h();
        if (listH.size() != listH2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < eVar.h().size(); i10++) {
            arrayList.add(c.a((c) listH.get(i10), (c) listH2.get(i10), f10));
        }
        return new e(eVar.g(), arrayList, AbstractC5946a.c(eVar.c(), eVar2.c(), f10), AbstractC5946a.c(eVar.j(), eVar2.j(), f10), eVar.f42196f);
    }

    static e p(e eVar, int i10) {
        b bVar = new b(eVar.g(), i10);
        float f10 = (i10 - eVar.k().f42207b) - (eVar.k().f42209d / 2.0f);
        int size = eVar.h().size() - 1;
        while (size >= 0) {
            c cVar = (c) eVar.h().get(size);
            bVar.d((cVar.f42209d / 2.0f) + f10, cVar.f42208c, cVar.f42209d, size >= eVar.c() && size <= eVar.j(), cVar.f42210e);
            f10 += cVar.f42209d;
            size--;
        }
        return bVar.i();
    }

    int a() {
        return this.f42196f;
    }

    c b() {
        return (c) this.f42193c.get(this.f42194d);
    }

    int c() {
        return this.f42194d;
    }

    c d() {
        return (c) this.f42193c.get(0);
    }

    c e() {
        for (int i10 = 0; i10 < this.f42193c.size(); i10++) {
            c cVar = (c) this.f42193c.get(i10);
            if (!cVar.f42210e) {
                return cVar;
            }
        }
        return null;
    }

    List f() {
        return this.f42193c.subList(this.f42194d, this.f42195e + 1);
    }

    float g() {
        return this.f42191a;
    }

    List h() {
        return this.f42193c;
    }

    c i() {
        return (c) this.f42193c.get(this.f42195e);
    }

    int j() {
        return this.f42195e;
    }

    c k() {
        return (c) this.f42193c.get(r0.size() - 1);
    }

    c l() {
        for (int size = this.f42193c.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f42193c.get(size);
            if (!cVar.f42210e) {
                return cVar;
            }
        }
        return null;
    }

    int m() {
        Iterator it = this.f42193c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f42210e) {
                i10++;
            }
        }
        return this.f42193c.size() - i10;
    }

    int n() {
        return this.f42192b;
    }

    private e(float f10, List list, int i10, int i11, int i12) {
        this.f42191a = f10;
        this.f42193c = Collections.unmodifiableList(list);
        this.f42194d = i10;
        this.f42195e = i11;
        while (i10 <= i11) {
            if (((c) list.get(i10)).f42211f == 0.0f) {
                this.f42192b++;
            }
            i10++;
        }
        this.f42196f = i12;
    }
}
