package i4;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f48666a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile i f48667b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f48668c = 20;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f48669d;

        public a(int i10) {
            super(i10);
            this.f48669d = i10;
        }

        @Override // i4.i
        public void a(String str, String str2) {
            if (this.f48669d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // i4.i
        public void b(String str, String str2, Throwable th2) {
            if (this.f48669d <= 3) {
                Log.d(str, str2, th2);
            }
        }

        @Override // i4.i
        public void c(String str, String str2) {
            if (this.f48669d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // i4.i
        public void d(String str, String str2, Throwable th2) {
            if (this.f48669d <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // i4.i
        public void f(String str, String str2) {
            if (this.f48669d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // i4.i
        public void g(String str, String str2, Throwable th2) {
            if (this.f48669d <= 4) {
                Log.i(str, str2, th2);
            }
        }

        @Override // i4.i
        public void j(String str, String str2) {
            if (this.f48669d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // i4.i
        public void k(String str, String str2) {
            if (this.f48669d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // i4.i
        public void l(String str, String str2, Throwable th2) {
            if (this.f48669d <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }

    public i(int i10) {
    }

    public static i e() {
        i iVar;
        synchronized (f48666a) {
            try {
                if (f48667b == null) {
                    f48667b = new a(3);
                }
                iVar = f48667b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public static void h(i iVar) {
        synchronized (f48666a) {
            f48667b = iVar;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f48668c;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th2);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th2);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th2);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th2);
}
