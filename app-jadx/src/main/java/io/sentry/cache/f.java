package io.sentry.cache;

import io.sentry.AbstractC5226l;
import io.sentry.C5239n2;
import io.sentry.C5265q2;
import io.sentry.C5322z3;
import io.sentry.EnumC5210h3;
import io.sentry.EnumC5215i3;
import io.sentry.H;
import io.sentry.ILogger;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5197f0;
import io.sentry.M3;
import io.sentry.O3;
import io.sentry.T2;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.util.C5288a;
import io.sentry.util.w;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class f extends c implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CountDownLatch f50553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f50554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final C5288a f50555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final C5288a f50556i;

    public f(C5322z3 c5322z3, String str, int i10) {
        super(c5322z3, str, i10);
        this.f50554g = new WeakHashMap();
        this.f50555h = new C5288a();
        this.f50556i = new C5288a();
        this.f50553f = new CountDownLatch(1);
    }

    public static File A(String str) {
        return new File(str, "session.json");
    }

    private File B(C5265q2 c5265q2) {
        String str;
        InterfaceC5192e0 interfaceC5192e0A = this.f50555h.a();
        try {
            if (this.f50554g.containsKey(c5265q2)) {
                str = (String) this.f50554g.get(c5265q2);
            } else {
                String str2 = M3.a() + ".envelope";
                this.f50554g.put(c5265q2, str2);
                str = str2;
            }
            File file = new File(this.f50550c.getAbsolutePath(), str);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return file;
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

    public static File D(String str) {
        return new File(str, "previous_session.json");
    }

    private boolean G(C5265q2 c5265q2, H h10) {
        w.c(c5265q2, "Envelope is required.");
        t(x());
        File fileA = A(this.f50550c.getAbsolutePath());
        File fileD = D(this.f50550c.getAbsolutePath());
        if (io.sentry.util.l.f(h10, io.sentry.hints.m.class) && !fileA.delete()) {
            this.f50548a.getLogger().c(EnumC5215i3.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (io.sentry.util.l.f(h10, io.sentry.hints.a.class) || io.sentry.util.l.f(h10, io.sentry.hints.j.class)) {
            I(h10);
        }
        if (io.sentry.util.l.f(h10, io.sentry.hints.o.class)) {
            F(fileA, fileD);
            K(fileA, c5265q2);
            boolean zExists = new File(this.f50548a.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (!zExists) {
                File file = new File(this.f50548a.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    this.f50548a.getLogger().c(EnumC5215i3.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f50548a.getLogger().c(EnumC5215i3.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    zExists = true;
                }
            }
            C5239n2.a().d(zExists);
            z();
        }
        File fileB = B(c5265q2);
        if (fileB.exists()) {
            this.f50548a.getLogger().c(EnumC5215i3.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileB.getAbsolutePath());
            return true;
        }
        this.f50548a.getLogger().c(EnumC5215i3.DEBUG, "Adding Envelope to offline storage: %s", fileB.getAbsolutePath());
        boolean zN = N(fileB, c5265q2);
        if (io.sentry.util.l.f(h10, UncaughtExceptionHandlerIntegration.a.class)) {
            M();
        }
        return zN;
    }

    private void I(H h10) {
        Date dateE;
        Object objE = io.sentry.util.l.e(h10);
        File fileD = D(this.f50550c.getAbsolutePath());
        if (!fileD.exists()) {
            this.f50548a.getLogger().c(EnumC5215i3.DEBUG, "No previous session file to end.", new Object[0]);
            return;
        }
        ILogger logger = this.f50548a.getLogger();
        EnumC5215i3 enumC5215i3 = EnumC5215i3.WARNING;
        logger.c(enumC5215i3, "Previous session is not ended, we'd need to end it.", new Object[0]);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileD), c.f50547e));
            try {
                O3 o32 = (O3) ((InterfaceC5197f0) this.f50549b.a()).c(bufferedReader, O3.class);
                if (o32 != null) {
                    Date date = null;
                    if (objE instanceof io.sentry.hints.a) {
                        io.sentry.hints.a aVar = (io.sentry.hints.a) objE;
                        Long lA = aVar.a();
                        if (lA != null) {
                            dateE = AbstractC5226l.e(lA.longValue());
                            Date dateK = o32.k();
                            if (dateK != null) {
                                if (dateE.before(dateK)) {
                                }
                            }
                            this.f50548a.getLogger().c(enumC5215i3, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                        } else {
                            dateE = null;
                        }
                        o32.q(O3.b.Abnormal, null, true, aVar.h());
                        date = dateE;
                        o32.d(date);
                        P(fileD, o32);
                    } else if (objE instanceof io.sentry.hints.j) {
                        Date dateE2 = AbstractC5226l.e(((io.sentry.hints.j) objE).a().longValue());
                        Date dateK2 = o32.k();
                        if (dateK2 != null && !dateE2.before(dateK2)) {
                            o32.q(O3.b.Crashed, null, true, null);
                            date = dateE2;
                            o32.d(date);
                            P(fileD, o32);
                        }
                        this.f50548a.getLogger().c(enumC5215i3, "Native crash exit happened before previous session start, not ending the session.", new Object[0]);
                    } else {
                        o32.d(date);
                        P(fileD, o32);
                    }
                }
                bufferedReader.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f50548a.getLogger().b(EnumC5215i3.ERROR, "Error processing previous session.", th2);
        }
    }

    private void K(File file, C5265q2 c5265q2) {
        Iterable iterableC = c5265q2.c();
        if (!iterableC.iterator().hasNext()) {
            this.f50548a.getLogger().c(EnumC5215i3.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        T2 t22 = (T2) iterableC.iterator().next();
        if (!EnumC5210h3.Session.equals(t22.O().b())) {
            this.f50548a.getLogger().c(EnumC5215i3.INFO, "Current envelope has a different envelope type %s", t22.O().b());
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(t22.M()), c.f50547e));
            try {
                O3 o32 = (O3) ((InterfaceC5197f0) this.f50549b.a()).c(bufferedReader, O3.class);
                if (o32 == null) {
                    this.f50548a.getLogger().c(EnumC5215i3.ERROR, "Item of type %s returned null by the parser.", t22.O().b());
                } else {
                    P(file, o32);
                }
                bufferedReader.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f50548a.getLogger().b(EnumC5215i3.ERROR, "Item failed to process.", th2);
        }
    }

    private void M() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f50548a.getCacheDirPath(), "last_crash"));
            try {
                fileOutputStream.write(AbstractC5226l.h(AbstractC5226l.d()).getBytes(c.f50547e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f50548a.getLogger().b(EnumC5215i3.ERROR, "Error writing the crash marker file to the disk", th2);
        }
    }

    private boolean N(File file, C5265q2 c5265q2) {
        if (file.exists()) {
            this.f50548a.getLogger().c(EnumC5215i3.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f50548a.getLogger().c(EnumC5215i3.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((InterfaceC5197f0) this.f50549b.a()).b(c5265q2, fileOutputStream);
                fileOutputStream.close();
                return true;
            } finally {
            }
        } catch (Throwable th2) {
            this.f50548a.getLogger().a(EnumC5215i3.ERROR, th2, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
            return false;
        }
    }

    private void P(File file, O3 o32) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, c.f50547e));
                try {
                    this.f50548a.getLogger().c(EnumC5215i3.DEBUG, "Overwriting session to offline storage: %s", o32.j());
                    ((InterfaceC5197f0) this.f50549b.a()).a(o32, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f50548a.getLogger().a(EnumC5215i3.ERROR, th2, "Error writing Session to offline storage: %s", o32.j());
        }
    }

    private File[] x() {
        File[] fileArrListFiles;
        return (!f() || (fileArrListFiles = this.f50550c.listFiles(new FilenameFilter() { // from class: io.sentry.cache.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return str.endsWith(".envelope");
            }
        })) == null) ? new File[0] : fileArrListFiles;
    }

    public static g y(C5322z3 c5322z3) {
        String cacheDirPath = c5322z3.getCacheDirPath();
        int maxCacheItems = c5322z3.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new f(c5322z3, cacheDirPath, maxCacheItems);
        }
        c5322z3.getLogger().c(EnumC5215i3.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        return io.sentry.transport.r.b();
    }

    public void F(File file, File file2) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50556i.a();
        try {
            if (!file.exists()) {
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                    return;
                }
                return;
            }
            if (file2.exists()) {
                this.f50548a.getLogger().c(EnumC5215i3.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    this.f50548a.getLogger().c(EnumC5215i3.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            this.f50548a.getLogger().c(EnumC5215i3.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    this.f50548a.getLogger().c(EnumC5215i3.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th2) {
                this.f50548a.getLogger().b(EnumC5215i3.ERROR, "Error moving current session to previous session.", th2);
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th3) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public boolean L() {
        try {
            return this.f50553f.await(this.f50548a.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f50548a.getLogger().c(EnumC5215i3.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    @Override // io.sentry.cache.g
    public void O(C5265q2 c5265q2) {
        w.c(c5265q2, "Envelope is required.");
        File fileB = B(c5265q2);
        if (fileB.delete()) {
            this.f50548a.getLogger().c(EnumC5215i3.DEBUG, "Discarding envelope from cache: %s", fileB.getAbsolutePath());
        } else {
            this.f50548a.getLogger().c(EnumC5215i3.DEBUG, "Envelope was not cached or could not be deleted: %s", fileB.getAbsolutePath());
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        BufferedInputStream bufferedInputStream;
        File[] fileArrX = x();
        ArrayList arrayList = new ArrayList(fileArrX.length);
        for (File file : fileArrX) {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (FileNotFoundException unused) {
                this.f50548a.getLogger().c(EnumC5215i3.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e10) {
                this.f50548a.getLogger().b(EnumC5215i3.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e10);
            }
            try {
                arrayList.add(((InterfaceC5197f0) this.f50549b.a()).d(bufferedInputStream));
                bufferedInputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return arrayList.iterator();
    }

    public boolean q1(C5265q2 c5265q2, H h10) {
        return G(c5265q2, h10);
    }

    public void z() {
        this.f50553f.countDown();
    }
}
