package io.sentry;

import com.adjust.sdk.Constants;
import io.sentry.O3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: renamed from: io.sentry.q1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC5264q1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f51164c = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f51165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5114a0 f51166b;

    RunnableC5264q1(C5322z3 c5322z3, InterfaceC5114a0 interfaceC5114a0) {
        this.f51165a = c5322z3;
        this.f51166b = interfaceC5114a0;
    }

    private Date a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f51164c));
            try {
                String line = bufferedReader.readLine();
                this.f51165a.getLogger().c(EnumC5215i3.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateF = AbstractC5226l.f(line);
                bufferedReader.close();
                return dateF;
            } finally {
            }
        } catch (IOException e10) {
            this.f51165a.getLogger().b(EnumC5215i3.ERROR, "Error reading the crash marker file.", e10);
            return null;
        } catch (IllegalArgumentException e11) {
            this.f51165a.getLogger().a(EnumC5215i3.ERROR, e11, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f51165a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f51165a.getLogger().c(EnumC5215i3.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!this.f51165a.isEnableAutoSessionTracking()) {
            this.f51165a.getLogger().c(EnumC5215i3.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f51165a.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.f) && !((io.sentry.cache.f) envelopeDiskCache).L()) {
            this.f51165a.getLogger().c(EnumC5215i3.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        File fileD = io.sentry.cache.f.D(cacheDirPath);
        InterfaceC5197f0 serializer = this.f51165a.getSerializer();
        if (fileD.exists()) {
            this.f51165a.getLogger().c(EnumC5215i3.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileD), f51164c));
                try {
                    O3 o32 = (O3) serializer.c(bufferedReader, O3.class);
                    if (o32 == null) {
                        this.f51165a.getLogger().c(EnumC5215i3.ERROR, "Stream from path %s resulted in a null envelope.", fileD.getAbsolutePath());
                    } else {
                        File file = new File(this.f51165a.getCacheDirPath(), ".sentry-native/last_crash");
                        O3.b bVarL = o32.l();
                        O3.b bVar = O3.b.Crashed;
                        if (bVarL == bVar) {
                            C5239n2 c5239n2A = C5239n2.a();
                            c5239n2A.c();
                            c5239n2A.d(true);
                        } else if (file.exists()) {
                            this.f51165a.getLogger().c(EnumC5215i3.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date dateA = a(file);
                            o32.p(bVar, null, true);
                            o32.d(dateA);
                        } else if (o32.f() == null) {
                            o32.c();
                        }
                        if (file.exists() && !file.delete()) {
                            this.f51165a.getLogger().c(EnumC5215i3.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                        }
                        this.f51166b.x(C5265q2.a(serializer, o32, this.f51165a.getSdkVersion()));
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th2) {
                this.f51165a.getLogger().b(EnumC5215i3.ERROR, "Error processing previous session.", th2);
            }
            if (fileD.delete()) {
                return;
            }
            this.f51165a.getLogger().c(EnumC5215i3.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
