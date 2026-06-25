package E4;

import B4.a;
import B4.b;
import E4.c;
import G4.m;
import G4.p;
import G4.q;
import H4.c;
import L4.j;
import L4.r;
import Ud.S;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import v4.InterfaceC6843b;
import v4.InterfaceC6845d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: c */
    public static final a f5637c = new a(null);

    /* JADX INFO: renamed from: a */
    private final InterfaceC6845d f5638a;

    /* JADX INFO: renamed from: b */
    private final p f5639b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(InterfaceC6845d interfaceC6845d, p pVar, r rVar) {
        this.f5638a = interfaceC6845d;
        this.f5639b = pVar;
    }

    private final String b(c.C0055c c0055c) {
        Object obj = c0055c.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(c.C0055c c0055c) {
        Object obj = c0055c.b().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean e(G4.h hVar, c.b bVar, c.C0055c c0055c, H4.h hVar2, H4.g gVar) {
        boolean z10;
        double d10;
        int i10;
        boolean zD = d(c0055c);
        if (H4.b.a(hVar2)) {
            return !zD;
        }
        String str = (String) bVar.c().get("coil#transformation_size");
        if (str != null) {
            return AbstractC5504s.c(str, hVar2.toString());
        }
        int width = c0055c.a().getWidth();
        int height = c0055c.a().getHeight();
        H4.c cVarB = hVar2.b();
        int i11 = cVarB instanceof c.a ? ((c.a) cVarB).f7909a : Integer.MAX_VALUE;
        H4.c cVarA = hVar2.a();
        int i12 = cVarA instanceof c.a ? ((c.a) cVarA).f7909a : Integer.MAX_VALUE;
        double dC = x4.h.c(width, height, i11, i12, gVar);
        boolean zA = L4.i.a(hVar);
        if (zA) {
            double dG = AbstractC5874j.g(dC, 1.0d);
            d10 = 1.0d;
            z10 = false;
            if (Math.abs(((double) i11) - (((double) width) * dG)) <= 1.0d || Math.abs(((double) i12) - (dG * ((double) height))) <= 1.0d) {
                return true;
            }
        } else {
            z10 = false;
            d10 = 1.0d;
            if (j.r(i11)) {
                i10 = 1;
            } else {
                i10 = 1;
                if (Math.abs(i11 - width) <= 1) {
                }
            }
            if (j.r(i12) || Math.abs(i12 - height) <= i10) {
                return i10;
            }
        }
        if (dC != d10 && !zA) {
            return z10;
        }
        if (dC <= d10 || !zD) {
            return true;
        }
        return z10;
    }

    public final c.C0055c a(G4.h hVar, c.b bVar, H4.h hVar2, H4.g gVar) {
        if (!hVar.C().b()) {
            return null;
        }
        c cVarD = this.f5638a.d();
        c.C0055c c0055cB = cVarD != null ? cVarD.b(bVar) : null;
        if (c0055cB == null || !c(hVar, bVar, c0055cB, hVar2, gVar)) {
            return null;
        }
        return c0055cB;
    }

    public final boolean c(G4.h hVar, c.b bVar, c.C0055c c0055c, H4.h hVar2, H4.g gVar) {
        if (this.f5639b.c(hVar, L4.a.c(c0055c.a()))) {
            return e(hVar, bVar, c0055c, hVar2, gVar);
        }
        return false;
    }

    public final c.b f(G4.h hVar, Object obj, m mVar, InterfaceC6843b interfaceC6843b) {
        c.b bVarB = hVar.B();
        if (bVarB != null) {
            return bVarB;
        }
        interfaceC6843b.h(hVar, obj);
        String strF = this.f5638a.getComponents().f(obj, mVar);
        interfaceC6843b.i(hVar, strF);
        if (strF == null) {
            return null;
        }
        List listO = hVar.O();
        Map mapD = hVar.E().d();
        if (listO.isEmpty() && mapD.isEmpty()) {
            return new c.b(strF, null, 2, null);
        }
        Map mapB = S.B(mapD);
        if (!listO.isEmpty()) {
            List listO2 = hVar.O();
            int size = listO2.size();
            for (int i10 = 0; i10 < size; i10++) {
                mapB.put("coil#transformation_" + i10, ((J4.a) listO2.get(i10)).a());
            }
            mapB.put("coil#transformation_size", mVar.n().toString());
        }
        return new c.b(strF, mapB);
    }

    public final q g(b.a aVar, G4.h hVar, c.b bVar, c.C0055c c0055c) {
        return new q(new BitmapDrawable(hVar.l().getResources(), c0055c.a()), hVar, x4.f.MEMORY_CACHE, bVar, b(c0055c), d(c0055c), j.s(aVar));
    }

    public final boolean h(c.b bVar, G4.h hVar, a.b bVar2) {
        c cVarD;
        Bitmap bitmap;
        if (hVar.C().c() && (cVarD = this.f5638a.d()) != null && bVar != null) {
            Drawable drawableE = bVar2.e();
            BitmapDrawable bitmapDrawable = drawableE instanceof BitmapDrawable ? (BitmapDrawable) drawableE : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(bVar2.f()));
                String strD = bVar2.d();
                if (strD != null) {
                    linkedHashMap.put("coil#disk_cache_key", strD);
                }
                cVarD.c(bVar, new c.C0055c(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
