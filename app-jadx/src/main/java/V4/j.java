package V4;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f19751k = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f19752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f19753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f19755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19761j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    j(long j10, k kVar, Set set) {
        this.f19754c = j10;
        this.f19756e = j10;
        this.f19752a = kVar;
        this.f19753b = set;
        this.f19755d = new b();
    }

    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f19751k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f19758g + ", misses=" + this.f19759h + ", puts=" + this.f19760i + ", evictions=" + this.f19761j + ", currentSize=" + this.f19757f + ", maxSize=" + this.f19756e + "\nStrategy=" + this.f19752a);
    }

    private void j() {
        q(this.f19756e);
    }

    private static Set k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static k l() {
        return new m();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapD;
        try {
            f(config);
            bitmapD = this.f19752a.d(i10, i11, config != null ? config : f19751k);
            if (bitmapD == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f19752a.b(i10, i11, config));
                }
                this.f19759h++;
            } else {
                this.f19758g++;
                this.f19757f -= (long) this.f19752a.e(bitmapD);
                this.f19755d.a(bitmapD);
                p(bitmapD);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f19752a.b(i10, i11, config));
            }
            h();
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapD;
    }

    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f19757f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f19752a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f19757f = 0L;
                    return;
                }
                this.f19755d.a(bitmapRemoveLast);
                this.f19757f -= (long) this.f19752a.e(bitmapRemoveLast);
                this.f19761j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f19752a.a(bitmapRemoveLast));
                }
                h();
                bitmapRemoveLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // V4.d
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    @Override // V4.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // V4.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f19752a.e(bitmap) <= this.f19756e && this.f19753b.contains(bitmap.getConfig())) {
                int iE = this.f19752a.e(bitmap);
                this.f19752a.c(bitmap);
                this.f19755d.b(bitmap);
                this.f19760i++;
                this.f19757f += (long) iE;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f19752a.a(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f19752a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f19753b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // V4.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        if (bitmapM == null) {
            return g(i10, i11, config);
        }
        bitmapM.eraseColor(0);
        return bitmapM;
    }

    @Override // V4.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        return bitmapM == null ? g(i10, i11, config) : bitmapM;
    }

    public long n() {
        return this.f19756e;
    }

    public j(long j10) {
        this(j10, l(), k());
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements a {
        b() {
        }

        @Override // V4.j.a
        public void a(Bitmap bitmap) {
        }

        @Override // V4.j.a
        public void b(Bitmap bitmap) {
        }
    }
}
