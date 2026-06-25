package io.sentry;

import io.sentry.util.l;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class B extends AbstractC5276t implements Q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC5114a0 f49054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC5197f0 f49055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ILogger f49056g;

    public B(InterfaceC5114a0 interfaceC5114a0, InterfaceC5197f0 interfaceC5197f0, ILogger iLogger, long j10, int i10) {
        super(interfaceC5114a0, iLogger, j10, i10);
        this.f49054e = (InterfaceC5114a0) io.sentry.util.w.c(interfaceC5114a0, "Scopes are required.");
        this.f49055f = (InterfaceC5197f0) io.sentry.util.w.c(interfaceC5197f0, "Serializer is required.");
        this.f49056g = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(B b10, io.sentry.hints.i iVar) {
        b10.getClass();
        if (iVar.g()) {
            return;
        }
        b10.f49056g.c(EnumC5215i3.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    public static /* synthetic */ void g(B b10, File file, io.sentry.hints.l lVar) {
        b10.getClass();
        if (lVar.a()) {
            b10.f49056g.c(EnumC5215i3.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            b10.i(file, "after trying to capture it");
            b10.f49056g.c(EnumC5215i3.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    public static /* synthetic */ void h(B b10, Throwable th2, File file, io.sentry.hints.l lVar) {
        b10.getClass();
        lVar.d(false);
        b10.f49056g.a(EnumC5215i3.INFO, th2, "File '%s' won't retry.", file.getAbsolutePath());
    }

    private void i(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.f49056g.c(EnumC5215i3.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th2) {
            this.f49056g.a(EnumC5215i3.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.Q
    public void a(String str, H h10) {
        io.sentry.util.w.c(str, "Path is required.");
        e(new File(str), h10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.AbstractC5276t
    public boolean c(String str) {
        return str.endsWith(".envelope");
    }

    @Override // io.sentry.AbstractC5276t
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.AbstractC5276t
    protected void e(final File file, H h10) {
        ILogger iLogger;
        l.a aVar;
        if (!file.isFile()) {
            this.f49056g.c(EnumC5215i3.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!c(file.getName())) {
            this.f49056g.c(EnumC5215i3.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.f49056g.c(EnumC5215i3.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        C5265q2 c5265q2D = this.f49055f.d(bufferedInputStream);
                        if (c5265q2D == null) {
                            this.f49056g.c(EnumC5215i3.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.f49054e.o(c5265q2D, h10);
                        }
                        io.sentry.util.l.j(h10, io.sentry.hints.i.class, this.f49056g, new l.a() { // from class: io.sentry.y
                            @Override // io.sentry.util.l.a
                            public final void accept(Object obj) {
                                B.f(this.f51556a, (io.sentry.hints.i) obj);
                            }
                        });
                        bufferedInputStream.close();
                        io.sentry.util.l.j(h10, io.sentry.hints.l.class, this.f49056g, new l.a() { // from class: io.sentry.z
                            @Override // io.sentry.util.l.a
                            public final void accept(Object obj) {
                                B.g(this.f51561a, file, (io.sentry.hints.l) obj);
                            }
                        });
                    } catch (Throwable th2) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    this.f49056g.a(EnumC5215i3.ERROR, e10, "I/O on file '%s' failed.", file.getAbsolutePath());
                    iLogger = this.f49056g;
                    aVar = new l.a() { // from class: io.sentry.z
                        @Override // io.sentry.util.l.a
                        public final void accept(Object obj) {
                            B.g(this.f51561a, file, (io.sentry.hints.l) obj);
                        }
                    };
                    io.sentry.util.l.j(h10, io.sentry.hints.l.class, iLogger, aVar);
                } catch (Throwable th4) {
                    this.f49056g.a(EnumC5215i3.ERROR, th4, "Failed to capture cached envelope %s", file.getAbsolutePath());
                    io.sentry.util.l.j(h10, io.sentry.hints.l.class, this.f49056g, new l.a() { // from class: io.sentry.A
                        @Override // io.sentry.util.l.a
                        public final void accept(Object obj) {
                            B.h(this.f49032a, th4, file, (io.sentry.hints.l) obj);
                        }
                    });
                    iLogger = this.f49056g;
                    aVar = new l.a() { // from class: io.sentry.z
                        @Override // io.sentry.util.l.a
                        public final void accept(Object obj) {
                            B.g(this.f51561a, file, (io.sentry.hints.l) obj);
                        }
                    };
                    io.sentry.util.l.j(h10, io.sentry.hints.l.class, iLogger, aVar);
                }
            } catch (FileNotFoundException e11) {
                this.f49056g.a(EnumC5215i3.ERROR, e11, "File '%s' cannot be found.", file.getAbsolutePath());
                iLogger = this.f49056g;
                aVar = new l.a() { // from class: io.sentry.z
                    @Override // io.sentry.util.l.a
                    public final void accept(Object obj) {
                        B.g(this.f51561a, file, (io.sentry.hints.l) obj);
                    }
                };
                io.sentry.util.l.j(h10, io.sentry.hints.l.class, iLogger, aVar);
            }
        } catch (Throwable th5) {
            io.sentry.util.l.j(h10, io.sentry.hints.l.class, this.f49056g, new l.a() { // from class: io.sentry.z
                @Override // io.sentry.util.l.a
                public final void accept(Object obj) {
                    B.g(this.f51561a, file, (io.sentry.hints.l) obj);
                }
            });
            throw th5;
        }
    }
}
