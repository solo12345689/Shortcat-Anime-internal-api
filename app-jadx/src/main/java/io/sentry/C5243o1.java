package io.sentry;

import com.adjust.sdk.Constants;
import io.sentry.util.AbstractC5290c;
import io.sentry.util.l;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: io.sentry.o1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5243o1 extends AbstractC5276t implements Q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Charset f50879i = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC5114a0 f50880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P f50881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC5197f0 f50882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ILogger f50883h;

    public C5243o1(InterfaceC5114a0 interfaceC5114a0, P p10, InterfaceC5197f0 interfaceC5197f0, ILogger iLogger, long j10, int i10) {
        super(interfaceC5114a0, iLogger, j10, i10);
        this.f50880e = (InterfaceC5114a0) io.sentry.util.w.c(interfaceC5114a0, "Scopes are required.");
        this.f50881f = (P) io.sentry.util.w.c(p10, "Envelope reader is required.");
        this.f50882g = (InterfaceC5197f0) io.sentry.util.w.c(interfaceC5197f0, "Serializer is required.");
        this.f50883h = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(C5243o1 c5243o1, File file, io.sentry.hints.l lVar) {
        c5243o1.getClass();
        if (lVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            c5243o1.f50883h.c(EnumC5215i3.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e10) {
            c5243o1.f50883h.a(EnumC5215i3.ERROR, e10, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    private h4 h(f4 f4Var) {
        String strB;
        if (f4Var != null && (strB = f4Var.b()) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(strB));
                if (io.sentry.util.A.h(dValueOf, false)) {
                    String strA = f4Var.a();
                    if (strA != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(strA));
                        if (io.sentry.util.A.h(dValueOf2, false)) {
                            return new h4(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    return io.sentry.util.A.a(new h4(Boolean.TRUE, dValueOf));
                }
                this.f50883h.c(EnumC5215i3.ERROR, "Invalid sample rate parsed from TraceContext: %s", strB);
            } catch (Exception unused) {
                this.f50883h.c(EnumC5215i3.ERROR, "Unable to parse sample rate from TraceContext: %s", strB);
            }
        }
        return new h4(Boolean.TRUE);
    }

    private void i(T2 t22, int i10) {
        this.f50883h.c(EnumC5215i3.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i10), t22.O().b());
    }

    private void j(int i10) {
        this.f50883h.c(EnumC5215i3.DEBUG, "Item %d is being captured.", Integer.valueOf(i10));
    }

    private void k(io.sentry.protocol.x xVar) {
        this.f50883h.c(EnumC5215i3.WARNING, "Timed out waiting for event id submission: %s", xVar);
    }

    private void l(C5265q2 c5265q2, io.sentry.protocol.x xVar, int i10) {
        this.f50883h.c(EnumC5215i3.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i10), c5265q2.b().a(), xVar);
    }

    private void m(C5265q2 c5265q2, H h10) {
        BufferedReader bufferedReader;
        Object objE;
        this.f50883h.c(EnumC5215i3.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(AbstractC5290c.e(c5265q2.c())));
        int i10 = 0;
        for (T2 t22 : c5265q2.c()) {
            i10++;
            if (t22.O() == null) {
                this.f50883h.c(EnumC5215i3.ERROR, "Item %d has no header", Integer.valueOf(i10));
            } else if (EnumC5210h3.Event.equals(t22.O().b())) {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(t22.M()), f50879i));
                    try {
                        V2 v22 = (V2) this.f50882g.c(bufferedReader, V2.class);
                        if (v22 == null) {
                            i(t22, i10);
                        } else {
                            if (v22.L() != null) {
                                io.sentry.util.l.l(h10, v22.L().f());
                            }
                            if (c5265q2.b().a() == null || c5265q2.b().a().equals(v22.G())) {
                                this.f50880e.y(v22, h10);
                                j(i10);
                                if (!n(h10)) {
                                    k(v22.G());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                l(c5265q2, v22.G(), i10);
                                bufferedReader.close();
                            }
                        }
                        bufferedReader.close();
                    } finally {
                    }
                } catch (Throwable th2) {
                    this.f50883h.b(EnumC5215i3.ERROR, "Item failed to process.", th2);
                }
                objE = io.sentry.util.l.e(h10);
                if (!(objE instanceof io.sentry.hints.q) && !((io.sentry.hints.q) objE).e()) {
                    this.f50883h.c(EnumC5215i3.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i10));
                    return;
                }
                io.sentry.util.l.h(h10, io.sentry.hints.k.class, new l.a() { // from class: io.sentry.n1
                    @Override // io.sentry.util.l.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.k) obj).reset();
                    }
                });
            } else {
                if (EnumC5210h3.Transaction.equals(t22.O().b())) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(t22.M()), f50879i));
                        try {
                            io.sentry.protocol.E e10 = (io.sentry.protocol.E) this.f50882g.c(bufferedReader, io.sentry.protocol.E.class);
                            if (e10 == null) {
                                i(t22, i10);
                            } else if (c5265q2.b().a() == null || c5265q2.b().a().equals(e10.G())) {
                                f4 f4VarC = c5265q2.b().c();
                                if (e10.C().j() != null) {
                                    e10.C().j().u(h(f4VarC));
                                }
                                this.f50880e.q(e10, f4VarC, h10);
                                j(i10);
                                if (!n(h10)) {
                                    k(e10.G());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                l(c5265q2, e10.G(), i10);
                                bufferedReader.close();
                            }
                            bufferedReader.close();
                        } finally {
                        }
                    } catch (Throwable th3) {
                        this.f50883h.b(EnumC5215i3.ERROR, "Item failed to process.", th3);
                    }
                } else {
                    this.f50880e.o(new C5265q2(c5265q2.b().a(), c5265q2.b().b(), t22), h10);
                    this.f50883h.c(EnumC5215i3.DEBUG, "%s item %d is being captured.", t22.O().b().getItemType(), Integer.valueOf(i10));
                    if (!n(h10)) {
                        this.f50883h.c(EnumC5215i3.WARNING, "Timed out waiting for item type submission: %s", t22.O().b().getItemType());
                        return;
                    }
                }
                objE = io.sentry.util.l.e(h10);
                if (!(objE instanceof io.sentry.hints.q)) {
                }
                io.sentry.util.l.h(h10, io.sentry.hints.k.class, new l.a() { // from class: io.sentry.n1
                    @Override // io.sentry.util.l.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.k) obj).reset();
                    }
                });
            }
        }
    }

    private boolean n(H h10) {
        Object objE = io.sentry.util.l.e(h10);
        if (objE instanceof io.sentry.hints.i) {
            return ((io.sentry.hints.i) objE).g();
        }
        io.sentry.util.t.a(io.sentry.hints.i.class, objE, this.f50883h);
        return true;
    }

    @Override // io.sentry.Q
    public void a(String str, H h10) {
        io.sentry.util.w.c(str, "Path is required.");
        e(new File(str), h10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.AbstractC5276t
    public boolean c(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.AbstractC5276t
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.AbstractC5276t
    protected void e(final File file, H h10) {
        io.sentry.util.w.c(file, "File is required.");
        try {
            if (!c(file.getName())) {
                this.f50883h.c(EnumC5215i3.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C5265q2 c5265q2A = this.f50881f.a(bufferedInputStream);
                if (c5265q2A == null) {
                    this.f50883h.c(EnumC5215i3.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                } else {
                    m(c5265q2A, h10);
                    this.f50883h.c(EnumC5215i3.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                }
                bufferedInputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            this.f50883h.b(EnumC5215i3.ERROR, "Error processing envelope.", e10);
        } finally {
            io.sentry.util.l.j(h10, io.sentry.hints.l.class, this.f50883h, new l.a() { // from class: io.sentry.m1
                @Override // io.sentry.util.l.a
                public final void accept(Object obj) {
                    C5243o1.f(this.f50829a, file, (io.sentry.hints.l) obj);
                }
            });
        }
    }
}
