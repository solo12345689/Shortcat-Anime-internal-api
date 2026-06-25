package io.sentry.android.core.cache;

import io.sentry.C5265q2;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.H;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.TombstoneIntegration;
import io.sentry.android.core.cache.f;
import io.sentry.android.core.internal.util.h;
import io.sentry.android.core.performance.i;
import io.sentry.transport.o;
import io.sentry.util.AbstractC5296i;
import io.sentry.util.l;
import io.sentry.util.runtime.a;
import io.sentry.util.w;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends io.sentry.cache.f {

    /* JADX INFO: renamed from: k */
    private static final List f49695k = Arrays.asList(new a(AnrV2Integration.a.class, "ANR", "last_anr_report", new a.InterfaceC0780a() { // from class: io.sentry.android.core.cache.a
        @Override // io.sentry.android.core.cache.f.a.InterfaceC0780a
        public final Long a(Object obj) {
            return ((AnrV2Integration.a) obj).a();
        }
    }), new a(TombstoneIntegration.a.class, "Tombstone", "last_tombstone_report", new a.InterfaceC0780a() { // from class: io.sentry.android.core.cache.b
        @Override // io.sentry.android.core.cache.f.a.InterfaceC0780a
        public final Long a(Object obj) {
            return ((TombstoneIntegration.a) obj).a();
        }
    }));

    /* JADX INFO: renamed from: j */
    private final o f49696j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a */
        private final Class f49697a;

        /* JADX INFO: renamed from: b */
        private final String f49698b;

        /* JADX INFO: renamed from: c */
        private final String f49699c;

        /* JADX INFO: renamed from: d */
        private final InterfaceC0780a f49700d;

        /* JADX INFO: renamed from: io.sentry.android.core.cache.f$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        interface InterfaceC0780a {
            Long a(Object obj);
        }

        a(Class cls, String str, String str2, InterfaceC0780a interfaceC0780a) {
            this.f49697a = cls;
            this.f49698b = str;
            this.f49699c = str2;
            this.f49700d = interfaceC0780a;
        }

        public static /* synthetic */ void a(a aVar, SentryAndroidOptions sentryAndroidOptions, f fVar, Object obj) {
            Long lA = aVar.f49700d.a(obj);
            sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "Writing last reported %s marker with timestamp %d", aVar.f49698b, lA);
            fVar.c0(lA, aVar.f49699c, aVar.f49698b);
        }

        void b(final f fVar, H h10, final SentryAndroidOptions sentryAndroidOptions) {
            l.h(h10, this.f49697a, new l.a() { // from class: io.sentry.android.core.cache.e
                @Override // io.sentry.util.l.a
                public final void accept(Object obj) {
                    f.a.a(this.f49692a, sentryAndroidOptions, fVar, obj);
                }
            });
        }
    }

    public f(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, h.a());
    }

    public static boolean W(C5322z3 c5322z3) {
        String outboxPath = c5322z3.getOutboxPath();
        if (outboxPath == null) {
            c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        final File file = new File(outboxPath, "startup_crash");
        try {
            boolean zBooleanValue = ((Boolean) c5322z3.getRuntimeManager().a(new a.InterfaceC0806a() { // from class: io.sentry.android.core.cache.c
                @Override // io.sentry.util.runtime.a.InterfaceC0806a
                public final Object run() {
                    return Boolean.valueOf(file.exists());
                }
            })).booleanValue();
            if (!zBooleanValue || ((Boolean) c5322z3.getRuntimeManager().a(new a.InterfaceC0806a() { // from class: io.sentry.android.core.cache.d
                @Override // io.sentry.util.runtime.a.InterfaceC0806a
                public final Object run() {
                    return Boolean.valueOf(file.delete());
                }
            })).booleanValue()) {
                return zBooleanValue;
            }
            c5322z3.getLogger().c(EnumC5215i3.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            return zBooleanValue;
        } catch (Throwable th2) {
            c5322z3.getLogger().b(EnumC5215i3.ERROR, "Error reading/deleting the startup crash marker file on the disk", th2);
            return false;
        }
    }

    public static Long X(C5322z3 c5322z3) {
        return Z(c5322z3, "last_anr_report", "ANR");
    }

    private static Long Z(C5322z3 c5322z3, String str, String str2) {
        File file = new File((String) w.c(c5322z3.getCacheDirPath(), "Cache dir path should be set for getting " + str2 + "s reported"), str);
        try {
            String strC = AbstractC5296i.c(file);
            if (strC != null && !strC.equals("null")) {
                return Long.valueOf(Long.parseLong(strC.trim()));
            }
            return null;
        } catch (Throwable th2) {
            if (th2 instanceof FileNotFoundException) {
                c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Last " + str2 + " marker does not exist. %s.", file.getAbsolutePath());
            } else {
                c5322z3.getLogger().b(EnumC5215i3.ERROR, "Error reading last " + str2 + " marker", th2);
            }
            return null;
        }
    }

    public static Long a0(C5322z3 c5322z3) {
        return Z(c5322z3, "last_tombstone_report", "Tombstone");
    }

    private boolean b0(C5265q2 c5265q2, H h10) {
        boolean zQ1 = super.q1(c5265q2, h10);
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f50548a;
        i iVarR = io.sentry.android.core.performance.h.q().r();
        if (l.f(h10, UncaughtExceptionHandlerIntegration.a.class) && iVarR.u()) {
            long currentTimeMillis = this.f49696j.getCurrentTimeMillis() - iVarR.r();
            if (currentTimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(currentTimeMillis));
                d0();
            }
        }
        Iterator it = f49695k.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(this, h10, sentryAndroidOptions);
        }
        return zQ1;
    }

    public void c0(Long l10, String str, String str2) {
        String cacheDirPath = this.f50548a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f50548a.getLogger().c(EnumC5215i3.DEBUG, "Cache dir path is null, the " + str2 + " marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str));
            try {
                fileOutputStream.write(String.valueOf(l10).getBytes(f50547e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f50548a.getLogger().b(EnumC5215i3.ERROR, "Error writing the " + str2 + " marker to the disk", th2);
        }
    }

    private void d0() {
        String outboxPath = this.f50548a.getOutboxPath();
        if (outboxPath == null) {
            this.f50548a.getLogger().c(EnumC5215i3.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, "startup_crash").createNewFile();
        } catch (Throwable th2) {
            this.f50548a.getLogger().b(EnumC5215i3.ERROR, "Error writing the startup crash marker file to the disk", th2);
        }
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public boolean q1(C5265q2 c5265q2, H h10) {
        return b0(c5265q2, h10);
    }

    f(SentryAndroidOptions sentryAndroidOptions, o oVar) {
        super(sentryAndroidOptions, (String) w.c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.f49696j = oVar;
    }
}
