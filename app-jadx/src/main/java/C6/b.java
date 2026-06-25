package C6;

import E6.k;
import E6.o;
import E6.p;
import android.graphics.ColorSpace;
import java.io.InputStream;
import java.util.Map;
import y5.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f2876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f2877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f2878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I6.d f2879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f2880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f2881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f2882g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements c {
        a() {
        }

        @Override // C6.c
        public E6.e a(k kVar, int i10, p pVar, y6.d dVar) {
            ColorSpace colorSpaceL;
            q6.c cVarO = kVar.o();
            if (((Boolean) b.this.f2880e.get()).booleanValue()) {
                colorSpaceL = dVar.f64847k;
                if (colorSpaceL == null) {
                    colorSpaceL = kVar.l();
                }
            } else {
                colorSpaceL = dVar.f64847k;
            }
            ColorSpace colorSpace = colorSpaceL;
            if (cVarO == q6.b.f57656b) {
                return b.this.f(kVar, i10, pVar, dVar, colorSpace);
            }
            if (cVarO == q6.b.f57658d) {
                return b.this.e(kVar, i10, pVar, dVar);
            }
            if (cVarO == q6.b.f57665k) {
                return b.this.d(kVar, i10, pVar, dVar);
            }
            if (cVarO == q6.b.f57668n) {
                return b.this.h(kVar, i10, pVar, dVar);
            }
            if (cVarO != q6.c.f57672d) {
                return b.this.g(kVar, dVar);
            }
            throw new C6.a("unknown image format", kVar);
        }
    }

    public b(c cVar, c cVar2, c cVar3, I6.d dVar) {
        this(cVar, cVar2, cVar3, dVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E6.e h(k kVar, int i10, p pVar, y6.d dVar) {
        c cVar = this.f2878c;
        if (cVar != null) {
            return cVar.a(kVar, i10, pVar, dVar);
        }
        return null;
    }

    @Override // C6.c
    public E6.e a(k kVar, int i10, p pVar, y6.d dVar) {
        InputStream inputStreamQ;
        c cVar;
        c cVar2 = dVar.f64846j;
        if (cVar2 != null) {
            return cVar2.a(kVar, i10, pVar, dVar);
        }
        q6.c cVarO = kVar.o();
        if ((cVarO == null || cVarO == q6.c.f57672d) && (inputStreamQ = kVar.q()) != null) {
            cVarO = q6.e.d(inputStreamQ);
            kVar.a1(cVarO);
        }
        Map map = this.f2882g;
        return (map == null || (cVar = (c) map.get(cVarO)) == null) ? this.f2881f.a(kVar, i10, pVar, dVar) : cVar.a(kVar, i10, pVar, dVar);
    }

    public E6.e d(k kVar, int i10, p pVar, y6.d dVar) {
        c cVar;
        return (dVar.f64843g || (cVar = this.f2877b) == null) ? g(kVar, dVar) : cVar.a(kVar, i10, pVar, dVar);
    }

    public E6.e e(k kVar, int i10, p pVar, y6.d dVar) {
        c cVar;
        if (kVar.getWidth() == -1 || kVar.getHeight() == -1) {
            throw new C6.a("image width or height is incorrect", kVar);
        }
        return (dVar.f64843g || (cVar = this.f2876a) == null) ? g(kVar, dVar) : cVar.a(kVar, i10, pVar, dVar);
    }

    public E6.f f(k kVar, int i10, p pVar, y6.d dVar, ColorSpace colorSpace) {
        C5.a aVarA = this.f2879d.a(kVar, dVar.f64844h, null, i10, colorSpace);
        try {
            N6.b.a(null, aVarA);
            y5.k.g(aVarA);
            E6.f fVarW0 = E6.f.W0(aVarA, pVar, kVar.h1(), kVar.U0());
            fVarW0.k("is_rounded", false);
            return fVarW0;
        } finally {
            C5.a.m(aVarA);
        }
    }

    public E6.f g(k kVar, y6.d dVar) {
        C5.a aVarB = this.f2879d.b(kVar, dVar.f64844h, null, dVar.f64847k);
        try {
            N6.b.a(null, aVarB);
            y5.k.g(aVarB);
            E6.f fVarW0 = E6.f.W0(aVarB, o.f5692d, kVar.h1(), kVar.U0());
            fVarW0.k("is_rounded", false);
            return fVarW0;
        } finally {
            C5.a.m(aVarB);
        }
    }

    public b(c cVar, c cVar2, c cVar3, I6.d dVar, Map map) {
        this(cVar, cVar2, cVar3, dVar, map, y5.o.f64829b);
    }

    public b(c cVar, c cVar2, c cVar3, I6.d dVar, Map map, n nVar) {
        this.f2881f = new a();
        this.f2876a = cVar;
        this.f2877b = cVar2;
        this.f2878c = cVar3;
        this.f2879d = dVar;
        this.f2882g = map;
        this.f2880e = nVar;
    }
}
