package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC5276t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5114a0 f51338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f51339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f51340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f51341d;

    /* JADX INFO: renamed from: io.sentry.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements io.sentry.hints.e, io.sentry.hints.l, io.sentry.hints.q, io.sentry.hints.i, io.sentry.hints.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f51342a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f51343b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CountDownLatch f51344c = new CountDownLatch(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f51345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ILogger f51346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f51347f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Queue f51348g;

        public a(long j10, ILogger iLogger, String str, Queue queue) {
            this.f51345d = j10;
            this.f51347f = str;
            this.f51348g = queue;
            this.f51346e = iLogger;
        }

        @Override // io.sentry.hints.l
        public boolean a() {
            return this.f51342a;
        }

        @Override // io.sentry.hints.g
        public void b() {
            this.f51348g.add(this.f51347f);
        }

        @Override // io.sentry.hints.q
        public void c(boolean z10) {
            this.f51343b = z10;
            this.f51344c.countDown();
        }

        @Override // io.sentry.hints.l
        public void d(boolean z10) {
            this.f51342a = z10;
        }

        @Override // io.sentry.hints.q
        public boolean e() {
            return this.f51343b;
        }

        @Override // io.sentry.hints.i
        public boolean g() {
            try {
                return this.f51344c.await(this.f51345d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f51346e.b(EnumC5215i3.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }
    }

    AbstractC5276t(InterfaceC5114a0 interfaceC5114a0, ILogger iLogger, long j10, int i10) {
        this.f51338a = interfaceC5114a0;
        this.f51339b = iLogger;
        this.f51340c = j10;
        this.f51341d = d4.d(new C5196f(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c(String str);

    public void d(File file) {
        try {
            ILogger iLogger = this.f51339b;
            EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
            iLogger.c(enumC5215i3, "Processing dir. %s", file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: io.sentry.s
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return this.f51332a.c(str);
                }
            });
            if (fileArrListFiles == null) {
                this.f51339b.c(EnumC5215i3.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
                return;
            }
            this.f51339b.c(enumC5215i3, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String absolutePath = file2.getAbsolutePath();
                    if (this.f51341d.contains(absolutePath)) {
                        this.f51339b.c(EnumC5215i3.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                    } else {
                        io.sentry.transport.z zVarN = this.f51338a.n();
                        if (zVarN != null && zVarN.o(EnumC5221k.All)) {
                            this.f51339b.c(EnumC5215i3.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                            return;
                        } else {
                            this.f51339b.c(EnumC5215i3.DEBUG, "Processing file: %s", absolutePath);
                            e(file2, io.sentry.util.l.c(new a(this.f51340c, this.f51339b, absolutePath, this.f51341d)));
                            Thread.sleep(100L);
                        }
                    }
                } else {
                    this.f51339b.c(EnumC5215i3.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (Throwable th2) {
            this.f51339b.a(EnumC5215i3.ERROR, th2, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    protected abstract void e(File file, H h10);
}
