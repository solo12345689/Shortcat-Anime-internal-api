package L4;

import B4.b;
import H4.c;
import Ud.AbstractC2279u;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import dg.E;
import dg.F;
import dg.t;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;
import v4.InterfaceC6843b;
import y1.AbstractC7194b;
import y4.InterfaceC7199a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a */
    private static final Bitmap.Config[] f11274a;

    /* JADX INFO: renamed from: b */
    private static final Bitmap.Config f11275b;

    /* JADX INFO: renamed from: c */
    private static final dg.t f11276c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11277a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f11278b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f11279c;

        static {
            int[] iArr = new int[x4.f.values().length];
            try {
                iArr[x4.f.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x4.f.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x4.f.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x4.f.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11277a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f11278b = iArr2;
            int[] iArr3 = new int[H4.g.values().length];
            try {
                iArr3[H4.g.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[H4.g.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f11279c = iArr3;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f11274a = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f11275b = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f11276c = new t.a().e();
    }

    public static final void a(InterfaceC7199a.b bVar) {
        try {
            bVar.a();
        } catch (Exception unused) {
        }
    }

    public static final t.a b(t.a aVar, String str) {
        int iI0 = Df.r.i0(str, ':', 0, false, 6, null);
        if (iI0 == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iI0);
        AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String string = Df.r.k1(strSubstring).toString();
        String strSubstring2 = str.substring(iI0 + 1);
        AbstractC5504s.g(strSubstring2, "this as java.lang.String).substring(startIndex)");
        aVar.d(string, strSubstring2);
        return aVar;
    }

    public static final int c(Context context, double d10) {
        int largeMemoryClass;
        try {
            Object objJ = AbstractC7194b.j(context, ActivityManager.class);
            AbstractC5504s.e(objJ);
            ActivityManager activityManager = (ActivityManager) objJ;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        double d11 = d10 * ((double) largeMemoryClass);
        double d12 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        return (int) (d11 * d12 * d12);
    }

    public static final void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final double e(Context context) {
        try {
            Object objJ = AbstractC7194b.j(context, ActivityManager.class);
            AbstractC5504s.e(objJ);
            return ((ActivityManager) objJ).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Bitmap.Config f() {
        return f11275b;
    }

    public static final InterfaceC6843b g(b.a aVar) {
        return aVar instanceof B4.c ? ((B4.c) aVar).e() : InterfaceC6843b.f61911b;
    }

    public static final String h(Uri uri) {
        return (String) AbstractC2279u.o0(uri.getPathSegments());
    }

    public static final int i(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final String j(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || Df.r.l0(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(Df.r.X0(Df.r.Z0(Df.r.h1(Df.r.h1(str, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), com.amazon.a.a.o.c.a.b.f34706a, ""));
    }

    public static final int k(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final File l(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null");
        }
        cacheDir.mkdirs();
        return cacheDir;
    }

    public static final H4.g m(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : a.f11278b[scaleType.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? H4.g.FIT : H4.g.FILL;
    }

    public static final Bitmap.Config[] n() {
        return f11274a;
    }

    public static final int o(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean p(Uri uri) {
        return AbstractC5504s.c(uri.getScheme(), "file") && AbstractC5504s.c(h(uri), "android_asset");
    }

    public static final boolean q() {
        return AbstractC5504s.c(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean r(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    public static final boolean s(b.a aVar) {
        return (aVar instanceof B4.c) && ((B4.c) aVar).f();
    }

    public static final boolean t(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof androidx.vectordrawable.graphics.drawable.f);
    }

    public static final G4.n u(G4.n nVar) {
        return nVar == null ? G4.n.f7370c : nVar;
    }

    public static final G4.r v(G4.r rVar) {
        return rVar == null ? G4.r.f7384c : rVar;
    }

    public static final dg.t w(dg.t tVar) {
        return tVar == null ? f11276c : tVar;
    }

    public static final F x(E e10) {
        F fJ = e10.j();
        if (fJ != null) {
            return fJ;
        }
        throw new IllegalStateException("response body == null");
    }

    public static final int y(String str, int i10) {
        Long lT = Df.r.t(str);
        if (lT == null) {
            return i10;
        }
        long jLongValue = lT.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final int z(H4.c cVar, H4.g gVar) {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).f7909a;
        }
        int i10 = a.f11279c[gVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new Td.r();
    }
}
