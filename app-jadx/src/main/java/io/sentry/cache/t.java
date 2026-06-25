package io.sentry.cache;

import com.adjust.sdk.Constants;
import io.sentry.C5191e;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.H1;
import io.sentry.T3;
import io.sentry.Y;
import io.sentry.cache.tape.c;
import io.sentry.cache.tape.d;
import io.sentry.protocol.C5253c;
import io.sentry.protocol.I;
import io.sentry.protocol.x;
import io.sentry.util.p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends H1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f50579c = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C5322z3 f50580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.p f50581b = new io.sentry.util.p(new p.a() { // from class: io.sentry.cache.k
        @Override // io.sentry.util.p.a
        public final Object a() {
            return t.u(this.f50563a);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements c.a {
        a() {
        }

        @Override // io.sentry.cache.tape.c.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C5191e b(byte[] bArr) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), t.f50579c));
                try {
                    C5191e c5191e = (C5191e) t.this.f50580a.getSerializer().c(bufferedReader, C5191e.class);
                    bufferedReader.close();
                    return c5191e;
                } finally {
                }
            } catch (Throwable th2) {
                t.this.f50580a.getLogger().a(EnumC5215i3.ERROR, th2, "Error reading entity from scope cache", new Object[0]);
                return null;
            }
        }

        @Override // io.sentry.cache.tape.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(C5191e c5191e, OutputStream outputStream) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, t.f50579c));
            try {
                t.this.f50580a.getSerializer().a(c5191e, bufferedWriter);
                bufferedWriter.close();
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public t(C5322z3 c5322z3) {
        this.f50580a = c5322z3;
    }

    private void A(String str) {
        d.a(this.f50580a, ".scope-cache", str);
    }

    private void D(final Runnable runnable) {
        if (this.f50580a.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    this.f50580a.getLogger().b(EnumC5215i3.ERROR, "Serialization task failed", th2);
                    return;
                }
            }
            try {
                this.f50580a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.v(this.f50564a, runnable);
                    }
                });
            } catch (Throwable th3) {
                this.f50580a.getLogger().b(EnumC5215i3.ERROR, "Serialization task could not be scheduled", th3);
            }
        }
    }

    public static void E(C5322z3 c5322z3, Object obj, String str) {
        d.d(c5322z3, obj, ".scope-cache", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(Object obj, String str) {
        E(this.f50580a, obj, str);
    }

    public static /* synthetic */ void n(t tVar, T3 t32, Y y10) {
        if (t32 != null) {
            tVar.F(t32, "trace.json");
        } else {
            tVar.getClass();
            tVar.F(y10.H().g(), "trace.json");
        }
    }

    public static /* synthetic */ void p(t tVar, I i10) {
        if (i10 == null) {
            tVar.A("user.json");
        } else {
            tVar.F(i10, "user.json");
        }
    }

    public static /* synthetic */ void s(t tVar) {
        tVar.getClass();
        try {
            ((io.sentry.cache.tape.c) tVar.f50581b.a()).clear();
        } catch (IOException e10) {
            tVar.f50580a.getLogger().b(EnumC5215i3.ERROR, "Failed to clear breadcrumbs from file queue", e10);
        }
    }

    public static /* synthetic */ void t(t tVar, String str) {
        if (str == null) {
            tVar.A("transaction.json");
        } else {
            tVar.F(str, "transaction.json");
        }
    }

    public static /* synthetic */ io.sentry.cache.tape.c u(t tVar) {
        io.sentry.cache.tape.d dVarA;
        File fileB = d.b(tVar.f50580a, ".scope-cache");
        if (fileB == null) {
            tVar.f50580a.getLogger().c(EnumC5215i3.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return io.sentry.cache.tape.c.z();
        }
        File file = new File(fileB, "breadcrumbs.json");
        try {
            try {
                dVarA = new d.a(file).b(tVar.f50580a.getMaxBreadcrumbs()).a();
            } catch (IOException unused) {
                file.delete();
                dVarA = new d.a(file).b(tVar.f50580a.getMaxBreadcrumbs()).a();
            }
            return io.sentry.cache.tape.c.w(dVarA, tVar.new a());
        } catch (IOException e10) {
            tVar.f50580a.getLogger().b(EnumC5215i3.ERROR, "Failed to create breadcrumbs queue", e10);
            return io.sentry.cache.tape.c.z();
        }
    }

    public static /* synthetic */ void v(t tVar, Runnable runnable) {
        tVar.getClass();
        try {
            runnable.run();
        } catch (Throwable th2) {
            tVar.f50580a.getLogger().b(EnumC5215i3.ERROR, "Serialization task failed", th2);
        }
    }

    public static /* synthetic */ void x(t tVar, C5191e c5191e) {
        tVar.getClass();
        try {
            ((io.sentry.cache.tape.c) tVar.f50581b.a()).b(c5191e);
        } catch (IOException e10) {
            tVar.f50580a.getLogger().b(EnumC5215i3.ERROR, "Failed to add breadcrumb to file queue", e10);
        }
    }

    public Object B(C5322z3 c5322z3, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return d.c(c5322z3, ".scope-cache", str, cls, null);
        }
        try {
            return cls.cast(((io.sentry.cache.tape.c) this.f50581b.a()).l());
        } catch (IOException unused) {
            c5322z3.getLogger().c(EnumC5215i3.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public void C() {
        try {
            ((io.sentry.cache.tape.c) this.f50581b.a()).clear();
        } catch (IOException e10) {
            this.f50580a.getLogger().b(EnumC5215i3.ERROR, "Failed to clear breadcrumbs from file queue", e10);
        }
        A("user.json");
        A("level.json");
        A("request.json");
        A("fingerprint.json");
        A("contexts.json");
        A("extras.json");
        A("tags.json");
        A("trace.json");
        A("transaction.json");
    }

    @Override // io.sentry.Z
    public void a(final C5191e c5191e) {
        D(new Runnable() { // from class: io.sentry.cache.n
            @Override // java.lang.Runnable
            public final void run() {
                t.x(this.f50568a, c5191e);
            }
        });
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void e(final Map map) {
        D(new Runnable() { // from class: io.sentry.cache.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f50566a.F(map, "tags.json");
            }
        });
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void g(Collection collection) {
        if (collection.isEmpty()) {
            D(new Runnable() { // from class: io.sentry.cache.q
                @Override // java.lang.Runnable
                public final void run() {
                    t.s(this.f50574a);
                }
            });
        }
    }

    @Override // io.sentry.Z
    public void h(final T3 t32, final Y y10) {
        D(new Runnable() { // from class: io.sentry.cache.j
            @Override // java.lang.Runnable
            public final void run() {
                t.n(this.f50560a, t32, y10);
            }
        });
    }

    @Override // io.sentry.Z
    public void i(final I i10) {
        D(new Runnable() { // from class: io.sentry.cache.i
            @Override // java.lang.Runnable
            public final void run() {
                t.p(this.f50558a, i10);
            }
        });
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void j(final C5253c c5253c) {
        D(new Runnable() { // from class: io.sentry.cache.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f50570a.F(c5253c, "contexts.json");
            }
        });
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void k(final Map map) {
        D(new Runnable() { // from class: io.sentry.cache.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f50572a.F(map, "extras.json");
            }
        });
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void l(final String str) {
        D(new Runnable() { // from class: io.sentry.cache.s
            @Override // java.lang.Runnable
            public final void run() {
                t.t(this.f50577a, str);
            }
        });
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void o(final x xVar) {
        D(new Runnable() { // from class: io.sentry.cache.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f50575a.F(xVar, "replay.json");
            }
        });
    }
}
