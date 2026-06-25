package q2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: q2.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6088c {

    /* JADX INFO: renamed from: h */
    public static final C6088c f56745h = new e().a();

    /* JADX INFO: renamed from: i */
    private static final String f56746i = t2.a0.H0(0);

    /* JADX INFO: renamed from: j */
    private static final String f56747j = t2.a0.H0(1);

    /* JADX INFO: renamed from: k */
    private static final String f56748k = t2.a0.H0(2);

    /* JADX INFO: renamed from: l */
    private static final String f56749l = t2.a0.H0(3);

    /* JADX INFO: renamed from: m */
    private static final String f56750m = t2.a0.H0(4);

    /* JADX INFO: renamed from: n */
    private static final String f56751n = t2.a0.H0(5);

    /* JADX INFO: renamed from: a */
    public final int f56752a;

    /* JADX INFO: renamed from: b */
    public final int f56753b;

    /* JADX INFO: renamed from: c */
    public final int f56754c;

    /* JADX INFO: renamed from: d */
    public final int f56755d;

    /* JADX INFO: renamed from: e */
    public final int f56756e;

    /* JADX INFO: renamed from: f */
    public final boolean f56757f;

    /* JADX INFO: renamed from: g */
    private d f56758g;

    /* JADX INFO: renamed from: q2.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* JADX INFO: renamed from: q2.c$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0866c {
        public static void a(AudioAttributes.Builder builder, boolean z10) {
            builder.setIsContentSpatialized(z10);
        }

        public static void b(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* JADX INFO: renamed from: q2.c$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final AudioAttributes f56759a;

        /* synthetic */ d(C6088c c6088c, a aVar) {
            this(c6088c);
        }

        private d(C6088c c6088c) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c6088c.f56752a).setFlags(c6088c.f56753b).setUsage(c6088c.f56754c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                b.a(usage, c6088c.f56755d);
            }
            if (i10 >= 32) {
                C0866c.b(usage, c6088c.f56756e);
                C0866c.a(usage, c6088c.f56757f);
            }
            this.f56759a = usage.build();
        }
    }

    /* JADX INFO: renamed from: q2.c$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {

        /* JADX INFO: renamed from: a */
        private int f56760a = 0;

        /* JADX INFO: renamed from: b */
        private int f56761b = 0;

        /* JADX INFO: renamed from: c */
        private int f56762c = 1;

        /* JADX INFO: renamed from: d */
        private int f56763d = 1;

        /* JADX INFO: renamed from: e */
        private int f56764e = 0;

        /* JADX INFO: renamed from: f */
        private boolean f56765f = false;

        public C6088c a() {
            return new C6088c(this.f56760a, this.f56761b, this.f56762c, this.f56763d, this.f56764e, this.f56765f);
        }

        public e b(int i10) {
            this.f56763d = i10;
            return this;
        }

        public e c(int i10) {
            this.f56760a = i10;
            return this;
        }

        public e d(int i10) {
            this.f56761b = i10;
            return this;
        }

        public e e(boolean z10) {
            this.f56765f = z10;
            return this;
        }

        public e f(int i10) {
            this.f56764e = i10;
            return this;
        }

        public e g(int i10) {
            this.f56762c = i10;
            return this;
        }
    }

    /* synthetic */ C6088c(int i10, int i11, int i12, int i13, int i14, boolean z10, a aVar) {
        this(i10, i11, i12, i13, i14, z10);
    }

    public static C6088c a(Bundle bundle) {
        e eVar = new e();
        String str = f56746i;
        if (bundle.containsKey(str)) {
            eVar.c(bundle.getInt(str));
        }
        String str2 = f56747j;
        if (bundle.containsKey(str2)) {
            eVar.d(bundle.getInt(str2));
        }
        String str3 = f56748k;
        if (bundle.containsKey(str3)) {
            eVar.g(bundle.getInt(str3));
        }
        String str4 = f56749l;
        if (bundle.containsKey(str4)) {
            eVar.b(bundle.getInt(str4));
        }
        String str5 = f56750m;
        if (bundle.containsKey(str5)) {
            eVar.f(bundle.getInt(str5));
        }
        String str6 = f56751n;
        if (bundle.containsKey(str6)) {
            eVar.e(bundle.getBoolean(str6));
        }
        return eVar.a();
    }

    public d b() {
        if (this.f56758g == null) {
            this.f56758g = new d();
        }
        return this.f56758g;
    }

    public int c() {
        if ((this.f56753b & 1) == 1) {
            return 1;
        }
        switch (this.f56754c) {
        }
        return 1;
    }

    public Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putInt(f56746i, this.f56752a);
        bundle.putInt(f56747j, this.f56753b);
        bundle.putInt(f56748k, this.f56754c);
        bundle.putInt(f56749l, this.f56755d);
        bundle.putInt(f56750m, this.f56756e);
        bundle.putBoolean(f56751n, this.f56757f);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6088c.class == obj.getClass()) {
            C6088c c6088c = (C6088c) obj;
            if (this.f56752a == c6088c.f56752a && this.f56753b == c6088c.f56753b && this.f56754c == c6088c.f56754c && this.f56755d == c6088c.f56755d && this.f56756e == c6088c.f56756e && this.f56757f == c6088c.f56757f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((527 + this.f56752a) * 31) + this.f56753b) * 31) + this.f56754c) * 31) + this.f56755d) * 31) + this.f56756e) * 31) + (this.f56757f ? 1 : 0);
    }

    private C6088c(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f56752a = i10;
        this.f56753b = i11;
        this.f56754c = i12;
        this.f56755d = i13;
        this.f56756e = i14;
        this.f56757f = z10;
    }
}
