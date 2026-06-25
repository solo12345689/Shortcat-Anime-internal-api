package L4;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a */
    private static final G4.c f11272a = new G4.c(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11273a;

        static {
            int[] iArr = new int[H4.e.values().length];
            try {
                iArr[H4.e.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H4.e.INEXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H4.e.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11273a = iArr;
        }
    }

    public static final boolean a(G4.h hVar) {
        int i10 = a.f11273a[hVar.H().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 != 3) {
            throw new Td.r();
        }
        if (hVar.q().m() == null && (hVar.K() instanceof H4.d)) {
            return true;
        }
        hVar.M();
        return false;
    }

    public static final G4.c b() {
        return f11272a;
    }

    public static final Drawable c(G4.h hVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return d.a(hVar.l(), num.intValue());
    }
}
