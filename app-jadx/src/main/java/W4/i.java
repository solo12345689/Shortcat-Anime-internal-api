package W4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f20717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20718d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f20719i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f20720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ActivityManager f20721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f20722c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f20724e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f20723d = 2.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f20725f = 0.4f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f20726g = 0.33f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20727h = 4194304;

        static {
            f20719i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f20724e = f20719i;
            this.f20720a = context;
            this.f20721b = (ActivityManager) context.getSystemService("activity");
            this.f20722c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f20721b)) {
                return;
            }
            this.f20724e = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f20728a;

        b(DisplayMetrics displayMetrics) {
            this.f20728a = displayMetrics;
        }

        @Override // W4.i.c
        public int a() {
            return this.f20728a.heightPixels;
        }

        @Override // W4.i.c
        public int b() {
            return this.f20728a.widthPixels;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f20717c = aVar.f20720a;
        int i10 = e(aVar.f20721b) ? aVar.f20727h / 2 : aVar.f20727h;
        this.f20718d = i10;
        int iC = c(aVar.f20721b, aVar.f20725f, aVar.f20726g);
        float fB = aVar.f20722c.b() * aVar.f20722c.a() * 4;
        int iRound = Math.round(aVar.f20724e * fB);
        int iRound2 = Math.round(fB * aVar.f20723d);
        int i11 = iC - i10;
        int i12 = iRound2 + iRound;
        if (i12 <= i11) {
            this.f20716b = iRound2;
            this.f20715a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f20724e;
            float f12 = aVar.f20723d;
            float f13 = f10 / (f11 + f12);
            this.f20716b = Math.round(f12 * f13);
            this.f20715a = Math.round(f13 * aVar.f20724e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f20716b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f20715a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > iC);
            sb2.append(", max size: ");
            sb2.append(f(iC));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f20721b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f20721b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f20717c, i10);
    }

    public int a() {
        return this.f20718d;
    }

    public int b() {
        return this.f20715a;
    }

    public int d() {
        return this.f20716b;
    }
}
