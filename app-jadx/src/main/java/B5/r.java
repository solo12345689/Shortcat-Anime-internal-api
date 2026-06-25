package b5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import b5.AbstractC3012n;
import b5.Q;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import o5.AbstractC5830g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: f */
    public static final S4.g f33186f = S4.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", S4.b.f15935c);

    /* JADX INFO: renamed from: g */
    public static final S4.g f33187g = S4.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: h */
    public static final S4.g f33188h = AbstractC3012n.f33181h;

    /* JADX INFO: renamed from: i */
    public static final S4.g f33189i;

    /* JADX INFO: renamed from: j */
    public static final S4.g f33190j;

    /* JADX INFO: renamed from: k */
    private static final Set f33191k;

    /* JADX INFO: renamed from: l */
    private static final b f33192l;

    /* JADX INFO: renamed from: m */
    private static final Set f33193m;

    /* JADX INFO: renamed from: n */
    private static final Queue f33194n;

    /* JADX INFO: renamed from: a */
    private final V4.d f33195a;

    /* JADX INFO: renamed from: b */
    private final DisplayMetrics f33196b;

    /* JADX INFO: renamed from: c */
    private final V4.b f33197c;

    /* JADX INFO: renamed from: d */
    private final List f33198d;

    /* JADX INFO: renamed from: e */
    private final P f33199e = P.b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a();

        void b(V4.d dVar, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        f33189i = S4.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f33190j = S4.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f33191k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f33192l = new a();
        f33193m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f33194n = o5.l.g(0);
    }

    public r(List list, DisplayMetrics displayMetrics, V4.d dVar, V4.b bVar) {
        this.f33198d = list;
        this.f33196b = (DisplayMetrics) o5.k.e(displayMetrics);
        this.f33195a = (V4.d) o5.k.e(dVar);
        this.f33197c = (V4.b) o5.k.e(bVar);
    }

    private static int a(double d10) {
        int iL = l(d10);
        int iX = x(((double) iL) * d10);
        return x((d10 / ((double) (iX / iL))) * ((double) iX));
    }

    private void b(Q q10, S4.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean zHasAlpha;
        if (this.f33199e.g(i10, i11, options, z10, z11)) {
            return;
        }
        if (bVar == S4.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = q10.e().hasAlpha();
        } catch (IOException e10) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, Q q10, b bVar, V4.d dVar, AbstractC3012n abstractC3012n, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15;
        int i16;
        int i17;
        int iFloor;
        int iFloor2;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i13 + "x" + i14 + "]");
                return;
            }
            return;
        }
        if (r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float fB = abstractC3012n.b(i15, i16, i13, i14);
        if (fB <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + abstractC3012n + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        AbstractC3012n.g gVarA = abstractC3012n.a(i15, i16, i13, i14);
        if (gVarA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int i18 = i15;
        int i19 = i16;
        int iX = i18 / x(fB * f10);
        int iX2 = i19 / x(fB * f11);
        AbstractC3012n.g gVar = AbstractC3012n.g.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(gVarA == gVar ? Math.max(iX, iX2) : Math.min(iX, iX2)));
        if (gVarA == gVar && iMax < 1.0f / fB) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            i17 = 0;
            iFloor = (int) Math.ceil(f10 / fMin);
            iFloor2 = (int) Math.ceil(f11 / fMin);
            int i20 = iMax / 8;
            if (i20 > 0) {
                iFloor /= i20;
                iFloor2 /= i20;
            }
        } else {
            i17 = 0;
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f12 = iMax;
                iFloor = (int) Math.floor(f10 / f12);
                iFloor2 = (int) Math.floor(f11 / f12);
            } else if (imageType.isWebp()) {
                float f13 = iMax;
                iFloor = Math.round(f10 / f13);
                iFloor2 = Math.round(f11 / f13);
            } else if (i18 % iMax == 0 && i19 % iMax == 0) {
                iFloor = i18 / iMax;
                iFloor2 = i19 / iMax;
            } else {
                int[] iArrM = m(q10, options, bVar, dVar);
                iFloor = iArrM[0];
                iFloor2 = iArrM[1];
            }
        }
        double dB = abstractC3012n.b(iFloor, iFloor2, i13, i14);
        options.inTargetDensity = a(dB);
        options.inDensity = l(dB);
        if (s(options)) {
            options.inScaled = true;
        } else {
            int i21 = i17;
            options.inTargetDensity = i21;
            options.inDensity = i21;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + iFloor + "x" + iFloor2 + "], exact scale factor: " + fB + ", power of 2 sample size: " + iMax + ", adjusted scale factor: " + dB + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private U4.v e(Q q10, int i10, int i11, S4.h hVar, b bVar) {
        byte[] bArr = (byte[]) this.f33197c.c(65536, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        S4.b bVar2 = (S4.b) hVar.c(f33186f);
        S4.i iVar = (S4.i) hVar.c(f33187g);
        AbstractC3012n abstractC3012n = (AbstractC3012n) hVar.c(AbstractC3012n.f33181h);
        boolean zBooleanValue = ((Boolean) hVar.c(f33189i)).booleanValue();
        S4.g gVar = f33190j;
        try {
            return C3005g.c(h(q10, optionsK, abstractC3012n, bVar2, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f33195a);
        } finally {
            v(optionsK);
            this.f33197c.put(bArr);
        }
    }

    private Bitmap h(Q q10, BitmapFactory.Options options, AbstractC3012n abstractC3012n, S4.b bVar, S4.i iVar, boolean z10, int i10, int i11, boolean z11, b bVar2) {
        int i12;
        String str;
        int i13;
        long jB = AbstractC5830g.b();
        int[] iArrM = m(q10, options, bVar2, this.f33195a);
        int i14 = iArrM[0];
        int i15 = iArrM[1];
        String str2 = options.outMimeType;
        boolean z12 = (i14 == -1 || i15 == -1) ? false : z10;
        int iD = q10.d();
        int iF = Y.f(iD);
        boolean zI = Y.i(iD);
        int i16 = i10;
        if (i16 != Integer.MIN_VALUE) {
            i12 = i11;
        } else if (r(iF)) {
            i12 = i11;
            i16 = i15;
        } else {
            i12 = i11;
            i16 = i14;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = r(iF) ? i14 : i15;
        }
        ImageHeaderParser.ImageType imageTypeE = q10.e();
        c(imageTypeE, q10, bVar2, this.f33195a, abstractC3012n, iF, i14, i15, i16, i12, options);
        int i17 = i16;
        int i18 = i12;
        b(q10, bVar, z12, zI, options, i17, i18);
        int i19 = Build.VERSION.SDK_INT;
        if (z(imageTypeE)) {
            if (i14 < 0 || i15 < 0 || !z11) {
                float f10 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i20 = options.inSampleSize;
                float f11 = i20;
                int iCeil = (int) Math.ceil(i14 / f11);
                int iCeil2 = (int) Math.ceil(i15 / f11);
                int iRound = Math.round(iCeil * f10);
                int iRound2 = Math.round(iCeil2 * f10);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculated target [");
                    sb2.append(iRound);
                    sb2.append("x");
                    sb2.append(iRound2);
                    i13 = iRound;
                    sb2.append("] for source [");
                    sb2.append(i14);
                    sb2.append("x");
                    sb2.append(i15);
                    sb2.append("], sampleSize: ");
                    sb2.append(i20);
                    sb2.append(", targetDensity: ");
                    sb2.append(options.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options.inDensity);
                    sb2.append(", density multiplier: ");
                    sb2.append(f10);
                    Log.v(str, sb2.toString());
                } else {
                    i13 = iRound;
                }
                i17 = i13;
                i18 = iRound2;
            } else {
                str = "Downsampler";
            }
            if (i17 > 0 && i18 > 0) {
                y(options, this.f33195a, i17, i18);
            }
        } else {
            str = "Downsampler";
        }
        if (iVar != null) {
            if (i19 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((iVar == S4.i.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i19 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapI = i(q10, options, bVar2, this.f33195a);
        bVar2.b(this.f33195a, bitmapI);
        if (Log.isLoggable(str, 2)) {
            t(i14, i15, str2, options, bitmapI, i10, i11, jB);
        }
        if (bitmapI == null) {
            return null;
        }
        bitmapI.setDensity(this.f33196b.densityDpi);
        Bitmap bitmapJ = Y.j(this.f33195a, bitmapI, iD);
        if (!bitmapI.equals(bitmapJ)) {
            this.f33195a.c(bitmapI);
        }
        return bitmapJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap i(b5.Q r5, android.graphics.BitmapFactory.Options r6, b5.r.b r7, V4.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.a()
            r5.c()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = b5.Y.e()
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L47
        L1d:
            java.util.concurrent.locks.Lock r6 = b5.Y.e()
            r6.unlock()
            return r5
        L25:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L47
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L36
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L47
        L36:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L46
            r8.c(r0)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            r0 = 0
            r6.inBitmap = r0     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            goto L1d
        L45:
            throw r1     // Catch: java.lang.Throwable -> L47
        L46:
            throw r1     // Catch: java.lang.Throwable -> L47
        L47:
            r5 = move-exception
            java.util.concurrent.locks.Lock r6 = b5.Y.e()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.r.i(b5.Q, android.graphics.BitmapFactory$Options, b5.r$b, V4.d):android.graphics.Bitmap");
    }

    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options options;
        Queue queue = f33194n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            w(options);
        }
        return options;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(Q q10, BitmapFactory.Options options, b bVar, V4.d dVar) {
        options.inJustDecodeBounds = true;
        i(q10, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC5830g.a(j10));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue queue = f33194n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    private static void y(BitmapFactory.Options options, V4.d dVar, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.e(i10, i11, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public U4.v d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, S4.h hVar) {
        return e(new Q.c(parcelFileDescriptor, this.f33198d, this.f33197c), i10, i11, hVar, f33192l);
    }

    public U4.v f(InputStream inputStream, int i10, int i11, S4.h hVar, b bVar) {
        return e(new Q.b(inputStream, this.f33198d, this.f33197c), i10, i11, hVar, bVar);
    }

    public U4.v g(ByteBuffer byteBuffer, int i10, int i11, S4.h hVar) {
        return e(new Q.a(byteBuffer, this.f33198d, this.f33197c), i10, i11, hVar, f33192l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements b {
        a() {
        }

        @Override // b5.r.b
        public void a() {
        }

        @Override // b5.r.b
        public void b(V4.d dVar, Bitmap bitmap) {
        }
    }
}
