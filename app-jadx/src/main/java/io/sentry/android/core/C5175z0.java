package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.AbstractC5226l;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5192e0;
import io.sentry.M;
import io.sentry.android.core.AbstractC5156p0;
import io.sentry.protocol.C5255e;
import io.sentry.util.C5288a;
import io.sentry.util.runtime.a;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: io.sentry.android.core.z0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5175z0 {

    /* JADX INFO: renamed from: i */
    private static volatile C5175z0 f50064i;

    /* JADX INFO: renamed from: j */
    private static final C5288a f50065j = new C5288a();

    /* JADX INFO: renamed from: a */
    private final Context f50066a;

    /* JADX INFO: renamed from: b */
    private final SentryAndroidOptions f50067b;

    /* JADX INFO: renamed from: c */
    private final C5131g0 f50068c;

    /* JADX INFO: renamed from: d */
    private final Boolean f50069d;

    /* JADX INFO: renamed from: e */
    private final AbstractC5156p0.a f50070e;

    /* JADX INFO: renamed from: f */
    private final AbstractC5156p0.b f50071f;

    /* JADX INFO: renamed from: g */
    private final io.sentry.protocol.n f50072g;

    /* JADX INFO: renamed from: h */
    private final Long f50073h;

    /* JADX INFO: renamed from: io.sentry.android.core.z0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f50074a;

        static {
            int[] iArr = new int[M.a.values().length];
            f50074a = iArr;
            try {
                iArr[M.a.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50074a[M.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C5175z0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.f50066a = context;
        this.f50067b = sentryAndroidOptions;
        C5131g0 c5131g0 = new C5131g0(sentryAndroidOptions.getLogger());
        this.f50068c = c5131g0;
        io.sentry.android.core.internal.util.o.a().c();
        this.f50072g = w();
        this.f50069d = c5131g0.f();
        this.f50070e = AbstractC5156p0.v(context, sentryAndroidOptions.getLogger(), c5131g0);
        this.f50071f = AbstractC5156p0.w(context, c5131g0);
        ActivityManager.MemoryInfo memoryInfoN = AbstractC5156p0.n(context, sentryAndroidOptions.getLogger());
        if (memoryInfoN != null) {
            this.f50073h = Long.valueOf(memoryInfoN.totalMem);
        } else {
            this.f50073h = null;
        }
    }

    public static /* synthetic */ void b(C5175z0 c5175z0, C5255e c5255e, boolean z10) {
        StatFs statFsJ;
        c5175z0.getClass();
        File dataDirectory = Environment.getDataDirectory();
        if (dataDirectory != null) {
            StatFs statFs = new StatFs(dataDirectory.getPath());
            c5255e.o0(c5175z0.r(statFs));
            c5255e.X(c5175z0.u(statFs));
        }
        if (!z10 || (statFsJ = c5175z0.j(c5175z0.f50066a.getExternalFilesDir(null))) == null) {
            return;
        }
        c5255e.U(c5175z0.q(statFsJ));
        c5255e.T(c5175z0.t(statFsJ));
    }

    private Intent d() {
        return AbstractC5156p0.u(this.f50066a, this.f50068c, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
    }

    public static Float e(Intent intent, C5322z3 c5322z3) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th2) {
            c5322z3.getLogger().b(EnumC5215i3.ERROR, "Error getting device battery level.", th2);
            return null;
        }
    }

    private Float f(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th2) {
            this.f50067b.getLogger().b(EnumC5215i3.ERROR, "Error getting battery temperature.", th2);
            return null;
        }
    }

    private Date g() {
        try {
            return AbstractC5226l.e(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e10) {
            this.f50067b.getLogger().a(EnumC5215i3.ERROR, e10, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    private String h() {
        try {
            return (String) this.f50067b.getRuntimeManager().a(new a.InterfaceC0806a() { // from class: io.sentry.android.core.x0
                @Override // io.sentry.util.runtime.a.InterfaceC0806a
                public final Object run() {
                    return E0.a(this.f50057a.f50066a);
                }
            });
        } catch (Throwable th2) {
            this.f50067b.getLogger().b(EnumC5215i3.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    private File i(File file) {
        File[] externalFilesDirs = this.f50066a.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : externalFilesDirs) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f50067b.getLogger().c(EnumC5215i3.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    private StatFs j(File file) {
        try {
            File fileI = i(file);
            if (fileI != null) {
                return new StatFs(fileI.getPath());
            }
            return null;
        } catch (Throwable unused) {
            this.f50067b.getLogger().c(EnumC5215i3.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
    }

    public static C5175z0 k(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f50064i == null) {
            InterfaceC5192e0 interfaceC5192e0A = f50065j.a();
            try {
                if (f50064i == null) {
                    f50064i = new C5175z0(AbstractC5156p0.g(context), sentryAndroidOptions);
                }
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            } catch (Throwable th2) {
                if (interfaceC5192e0A != null) {
                    try {
                        interfaceC5192e0A.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f50064i;
    }

    private C5255e.b m() {
        C5255e.b bVarA;
        Throwable th2;
        try {
            bVarA = io.sentry.android.core.internal.util.q.a(this.f50066a.getResources().getConfiguration().orientation);
            if (bVarA != null) {
                return bVarA;
            }
            try {
                this.f50067b.getLogger().c(EnumC5215i3.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                this.f50067b.getLogger().b(EnumC5215i3.ERROR, "Error getting device orientation.", th2);
                return bVarA;
            }
        } catch (Throwable th4) {
            bVarA = null;
            th2 = th4;
        }
    }

    private TimeZone p() {
        if (this.f50068c.d() >= 24) {
            LocaleList locales = this.f50066a.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    private Long q(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f50067b.getLogger().b(EnumC5215i3.ERROR, "Error getting total external storage amount.", th2);
            return null;
        }
    }

    private Long r(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f50067b.getLogger().b(EnumC5215i3.ERROR, "Error getting total internal storage amount.", th2);
            return null;
        }
    }

    private Long t(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f50067b.getLogger().b(EnumC5215i3.ERROR, "Error getting unused external storage amount.", th2);
            return null;
        }
    }

    private Long u(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f50067b.getLogger().b(EnumC5215i3.ERROR, "Error getting unused internal storage amount.", th2);
            return null;
        }
    }

    public static Boolean v(Intent intent, C5322z3 c5322z3) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z10 = true;
            if (intExtra != 1 && intExtra != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Throwable th2) {
            c5322z3.getLogger().b(EnumC5215i3.ERROR, "Error getting device charging state.", th2);
            return null;
        }
    }

    private io.sentry.protocol.n w() {
        io.sentry.protocol.n nVar = new io.sentry.protocol.n();
        nVar.j("Android");
        nVar.m(Build.VERSION.RELEASE);
        nVar.h(Build.DISPLAY);
        String strM = AbstractC5156p0.m(this.f50067b.getLogger());
        if (strM != null) {
            nVar.i(strM);
        }
        if (this.f50067b.isEnableRootCheck()) {
            nVar.k(Boolean.valueOf(new io.sentry.android.core.internal.util.w(this.f50066a, this.f50068c, this.f50067b.getLogger()).e()));
        }
        return nVar;
    }

    private void x(final C5255e c5255e, boolean z10, final boolean z11) {
        Intent intentD = d();
        if (intentD != null) {
            c5255e.M(e(intentD, this.f50067b));
            c5255e.Q(v(intentD, this.f50067b));
            c5255e.N(f(intentD));
        }
        int i10 = a.f50074a[this.f50067b.getConnectionStatusProvider().x0().ordinal()];
        c5255e.f0(i10 != 1 ? i10 != 2 ? null : Boolean.TRUE : Boolean.FALSE);
        ActivityManager.MemoryInfo memoryInfoN = AbstractC5156p0.n(this.f50066a, this.f50067b.getLogger());
        if (memoryInfoN != null && z10) {
            c5255e.W(Long.valueOf(memoryInfoN.availMem));
            c5255e.a0(Boolean.valueOf(memoryInfoN.lowMemory));
        }
        this.f50067b.getRuntimeManager().b(new Runnable() { // from class: io.sentry.android.core.y0
            @Override // java.lang.Runnable
            public final void run() {
                C5175z0.b(this.f50059a, c5255e, z11);
            }
        });
        if (c5255e.I() == null) {
            c5255e.S(this.f50067b.getConnectionStatusProvider().a0());
        }
    }

    public C5255e c(boolean z10, boolean z11) {
        C5255e c5255e = new C5255e();
        c5255e.b0(Build.MANUFACTURER);
        c5255e.P(Build.BRAND);
        c5255e.V(AbstractC5156p0.l(this.f50067b.getLogger()));
        c5255e.d0(Build.MODEL);
        c5255e.e0(Build.ID);
        c5255e.L(AbstractC5156p0.j());
        if (this.f50068c.d() >= 31) {
            c5255e.R(Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL);
        }
        c5255e.g0(m());
        Boolean bool = this.f50069d;
        if (bool != null) {
            c5255e.n0(bool);
        }
        DisplayMetrics displayMetricsK = AbstractC5156p0.k(this.f50066a, this.f50067b.getLogger());
        if (displayMetricsK != null) {
            c5255e.m0(Integer.valueOf(displayMetricsK.widthPixels));
            c5255e.l0(Integer.valueOf(displayMetricsK.heightPixels));
            c5255e.j0(Float.valueOf(displayMetricsK.density));
            c5255e.k0(Integer.valueOf(displayMetricsK.densityDpi));
        }
        c5255e.O(g());
        c5255e.p0(p());
        if (c5255e.J() == null) {
            c5255e.Y(h());
        }
        Locale locale = Locale.getDefault();
        if (c5255e.K() == null) {
            c5255e.Z(locale.toString());
        }
        List listC = io.sentry.android.core.internal.util.o.a().c();
        if (!listC.isEmpty()) {
            c5255e.i0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            c5255e.h0(Integer.valueOf(listC.size()));
        }
        c5255e.c0(this.f50073h);
        if (z10 && this.f50067b.isCollectAdditionalContext()) {
            x(c5255e, z11, this.f50067b.isCollectExternalStorageContext());
        }
        return c5255e;
    }

    public io.sentry.protocol.n l() {
        return this.f50072g;
    }

    public AbstractC5156p0.a n() {
        return this.f50070e;
    }

    public AbstractC5156p0.b o() {
        return this.f50071f;
    }

    public Long s() {
        return this.f50073h;
    }
}
