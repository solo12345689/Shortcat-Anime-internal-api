package s6;

import B5.h;
import E6.f;
import E6.k;
import E6.o;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import r6.InterfaceC6273a;
import t6.C6648d;
import t6.InterfaceC6646b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements d {

    /* JADX INFO: renamed from: e */
    static c f59252e = g("com.facebook.animated.gif.GifImage");

    /* JADX INFO: renamed from: f */
    static c f59253f = g("com.facebook.animated.webp.WebPImage");

    /* JADX INFO: renamed from: a */
    private final InterfaceC6646b f59254a;

    /* JADX INFO: renamed from: b */
    private final w6.d f59255b;

    /* JADX INFO: renamed from: c */
    private final boolean f59256c;

    /* JADX INFO: renamed from: d */
    private final boolean f59257d;

    public e(InterfaceC6646b interfaceC6646b, w6.d dVar, boolean z10) {
        this(interfaceC6646b, dVar, z10, true);
    }

    private C5.a c(int i10, int i11, Bitmap.Config config) {
        C5.a aVarD = this.f59255b.d(i10, i11, config);
        ((Bitmap) aVarD.C()).eraseColor(0);
        ((Bitmap) aVarD.C()).setHasAlpha(true);
        return aVarD;
    }

    private C5.a d(r6.c cVar, Bitmap.Config config, int i10) {
        C5.a aVarC = c(cVar.getWidth(), cVar.getHeight(), config);
        new C6648d(this.f59254a.a(r6.e.b(cVar), null), this.f59256c, new a()).h(i10, (Bitmap) aVarC.C());
        return aVarC;
    }

    private List e(r6.c cVar, Bitmap.Config config) {
        InterfaceC6273a interfaceC6273aA = this.f59254a.a(r6.e.b(cVar), null);
        ArrayList arrayList = new ArrayList(interfaceC6273aA.a());
        C6648d c6648d = new C6648d(interfaceC6273aA, this.f59256c, new b(arrayList));
        for (int i10 = 0; i10 < interfaceC6273aA.a(); i10++) {
            C5.a aVarC = c(interfaceC6273aA.getWidth(), interfaceC6273aA.getHeight(), config);
            c6648d.h(i10, (Bitmap) aVarC.C());
            arrayList.add(aVarC);
        }
        return arrayList;
    }

    private E6.e f(String str, y6.d dVar, r6.c cVar, Bitmap.Config config) throws Throwable {
        List listE;
        C5.a aVarD;
        C5.a aVar = null;
        try {
            int iA = dVar.f64840d ? cVar.a() - 1 : 0;
            if (dVar.f64843g) {
                f fVarU1 = f.U1(d(cVar, config, iA), o.f5692d, 0);
                C5.a.m(null);
                C5.a.q(null);
                return fVarU1;
            }
            if (dVar.f64842f) {
                listE = e(cVar, config);
                try {
                    aVarD = C5.a.j((C5.a) listE.get(iA));
                } catch (Throwable th2) {
                    th = th2;
                    C5.a.m(aVar);
                    C5.a.q(listE);
                    throw th;
                }
            } else {
                listE = null;
                aVarD = null;
            }
            try {
                if (dVar.f64839c && aVarD == null) {
                    aVarD = d(cVar, config, iA);
                }
                E6.c cVar2 = new E6.c(r6.e.f(cVar).k(aVarD).j(iA).i(listE).h(null).l(str).a(), this.f59257d);
                C5.a.m(aVarD);
                C5.a.q(listE);
                return cVar2;
            } catch (Throwable th3) {
                th = th3;
                aVar = aVarD;
                C5.a.m(aVar);
                C5.a.q(listE);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            listE = null;
        }
    }

    private static c g(String str) {
        try {
            return (c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // s6.d
    public E6.e a(k kVar, y6.d dVar, Bitmap.Config config) {
        if (f59253f == null) {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
        C5.a aVarJ = kVar.j();
        y5.k.g(aVarJ);
        try {
            h hVar = (h) aVarJ.C();
            E6.e eVarF = f(kVar.D(), dVar, hVar.v() != null ? f59253f.g(hVar.v(), dVar) : f59253f.i(hVar.K(), hVar.size(), dVar), config);
            C5.a.m(aVarJ);
            return eVarF;
        } catch (Throwable th2) {
            C5.a.m(aVarJ);
            throw th2;
        }
    }

    @Override // s6.d
    public E6.e b(k kVar, y6.d dVar, Bitmap.Config config) {
        if (f59252e == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        C5.a aVarJ = kVar.j();
        y5.k.g(aVarJ);
        try {
            h hVar = (h) aVarJ.C();
            E6.e eVarF = f(kVar.D(), dVar, hVar.v() != null ? f59252e.g(hVar.v(), dVar) : f59252e.i(hVar.K(), hVar.size(), dVar), config);
            C5.a.m(aVarJ);
            return eVarF;
        } catch (Throwable th2) {
            C5.a.m(aVarJ);
            throw th2;
        }
    }

    public e(InterfaceC6646b interfaceC6646b, w6.d dVar, boolean z10, boolean z11) {
        this.f59254a = interfaceC6646b;
        this.f59255b = dVar;
        this.f59256c = z10;
        this.f59257d = z11;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements C6648d.b {
        a() {
        }

        @Override // t6.C6648d.b
        public C5.a b(int i10) {
            return null;
        }

        @Override // t6.C6648d.b
        public void a(int i10, Bitmap bitmap) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements C6648d.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f59259a;

        b(List list) {
            this.f59259a = list;
        }

        @Override // t6.C6648d.b
        public C5.a b(int i10) {
            return C5.a.j((C5.a) this.f59259a.get(i10));
        }

        @Override // t6.C6648d.b
        public void a(int i10, Bitmap bitmap) {
        }
    }
}
