package A1;

import H1.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import z1.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class z {

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap f133a = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements b {
        a() {
        }

        @Override // A1.z.b
        /* JADX INFO: renamed from: c */
        public int b(j.b bVar) {
            return bVar.g();
        }

        @Override // A1.z.b
        /* JADX INFO: renamed from: d */
        public boolean a(j.b bVar) {
            return bVar.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface b {
        boolean a(Object obj);

        int b(Object obj);
    }

    z() {
    }

    private static Object f(Object[] objArr, int i10, b bVar) {
        return g(objArr, (i10 & 1) == 0 ? 400 : ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD, (i10 & 2) != 0, bVar);
    }

    private static Object g(Object[] objArr, int i10, boolean z10, b bVar) {
        Object obj = null;
        int i11 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.b(obj2) - i10) * 2) + (bVar.a(obj2) == z10 ? 0 : 1);
            if (obj == null || i11 > iAbs) {
                obj = obj2;
                i11 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, h.c cVar, Resources resources, int i10);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, j.b[] bVarArr, int i10);

    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface d(Context context, InputStream inputStream) {
        File fileE = A.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (A.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        File fileE = A.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (A.c(fileE, resources, i10)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected j.b h(j.b[] bVarArr, int i10) {
        return (j.b) f(bVarArr, i10, new a());
    }
}
