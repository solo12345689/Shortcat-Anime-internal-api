package io.sentry;

import com.adjust.sdk.Constants;
import io.sentry.util.AbstractC5296i;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class T2 {

    /* JADX INFO: renamed from: d */
    private static final Charset f49323d = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a */
    private final U2 f49324a;

    /* JADX INFO: renamed from: b */
    private final Callable f49325b;

    /* JADX INFO: renamed from: c */
    private byte[] f49326c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a */
        private byte[] f49327a;

        /* JADX INFO: renamed from: b */
        private final Callable f49328b;

        public a(Callable callable) {
            this.f49328b = callable;
        }

        private static byte[] b(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public byte[] a() {
            Callable callable;
            if (this.f49327a == null && (callable = this.f49328b) != null) {
                this.f49327a = (byte[]) callable.call();
            }
            return b(this.f49327a);
        }
    }

    T2(U2 u22, byte[] bArr) {
        this.f49324a = (U2) io.sentry.util.w.c(u22, "SentryEnvelopeItemHeader is required.");
        this.f49326c = bArr;
        this.f49325b = null;
    }

    public static /* synthetic */ byte[] A(C5176b c5176b, long j10, InterfaceC5197f0 interfaceC5197f0, ILogger iLogger) throws io.sentry.exception.b {
        byte[] bArr;
        if (c5176b.f() != null) {
            byte[] bArrF = c5176b.f();
            B(bArrF.length, j10, c5176b.h());
            return bArrF;
        }
        if (c5176b.j() != null) {
            byte[] bArrC = io.sentry.util.o.c(interfaceC5197f0, iLogger, c5176b.j());
            if (bArrC != null) {
                B(bArrC.length, j10, c5176b.h());
                return bArrC;
            }
        } else {
            if (c5176b.i() != null) {
                return AbstractC5296i.b(c5176b.i(), j10);
            }
            if (c5176b.e() != null && (bArr = (byte[]) c5176b.e().call()) != null) {
                B(bArr.length, j10, c5176b.h());
                return bArr;
            }
        }
        throw new io.sentry.exception.b(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable, path or provider is set.", c5176b.h()));
    }

    private static void B(long j10, long j11, String str) throws io.sentry.exception.b {
        if (j10 > j11) {
            throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static T2 C(final InterfaceC5197f0 interfaceC5197f0, final ILogger iLogger, final C5176b c5176b, final long j10) {
        final a aVar = new a(new Callable() { // from class: io.sentry.S2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T2.A(c5176b, j10, interfaceC5197f0, iLogger);
            }
        });
        return new T2(new U2(EnumC5210h3.Attachment, new Callable() { // from class: io.sentry.t2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, c5176b.g(), c5176b.h(), c5176b.d()), new Callable() { // from class: io.sentry.u2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static T2 D(final InterfaceC5197f0 interfaceC5197f0, final io.sentry.clientreport.c cVar) {
        io.sentry.util.w.c(interfaceC5197f0, "ISerializer is required.");
        io.sentry.util.w.c(cVar, "ClientReport is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.B2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T2.d(interfaceC5197f0, cVar);
            }
        });
        return new T2(new U2(EnumC5210h3.resolve(cVar), new Callable() { // from class: io.sentry.C2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.E2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static T2 E(final InterfaceC5197f0 interfaceC5197f0, final AbstractC5219j2 abstractC5219j2) {
        io.sentry.util.w.c(interfaceC5197f0, "ISerializer is required.");
        io.sentry.util.w.c(abstractC5219j2, "SentryEvent is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.y2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T2.o(interfaceC5197f0, abstractC5219j2);
            }
        });
        return new T2(new U2(EnumC5210h3.resolve(abstractC5219j2), new Callable() { // from class: io.sentry.z2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.A2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static T2 F(final InterfaceC5197f0 interfaceC5197f0, final C5235m3 c5235m3) {
        io.sentry.util.w.c(interfaceC5197f0, "ISerializer is required.");
        io.sentry.util.w.c(c5235m3, "SentryLogEvents is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.F2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T2.v(interfaceC5197f0, c5235m3);
            }
        });
        return new T2(new U2(EnumC5210h3.Log, new Callable() { // from class: io.sentry.G2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(c5235m3.a().size())), new Callable() { // from class: io.sentry.H2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static T2 G(final InterfaceC5197f0 interfaceC5197f0, final C5266q3 c5266q3) {
        io.sentry.util.w.c(interfaceC5197f0, "ISerializer is required.");
        io.sentry.util.w.c(c5266q3, "SentryMetricsEvents is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.P2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T2.t(interfaceC5197f0, c5266q3);
            }
        });
        return new T2(new U2(EnumC5210h3.TraceMetric, new Callable() { // from class: io.sentry.Q2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(c5266q3.a().size())), new Callable() { // from class: io.sentry.R2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static T2 H(final C5268r1 c5268r1, final InterfaceC5197f0 interfaceC5197f0, final X x10) {
        final File fileQ = c5268r1.q();
        final a aVar = new a(new Callable() { // from class: io.sentry.M2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T2.x(fileQ, c5268r1, x10, interfaceC5197f0);
            }
        });
        return new T2(new U2(EnumC5210h3.ProfileChunk, new Callable() { // from class: io.sentry.N2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application-json", fileQ.getName(), (String) null, c5268r1.p(), (Integer) null), new Callable() { // from class: io.sentry.O2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static T2 I(final C5300v1 c5300v1, final long j10, final InterfaceC5197f0 interfaceC5197f0) {
        final File fileC = c5300v1.C();
        final a aVar = new a(new Callable() { // from class: io.sentry.v2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T2.p(fileC, j10, c5300v1, interfaceC5197f0);
            }
        });
        return new T2(new U2(EnumC5210h3.Profile, new Callable() { // from class: io.sentry.w2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application-json", fileC.getName()), new Callable() { // from class: io.sentry.x2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static T2 J(final InterfaceC5197f0 interfaceC5197f0, final ILogger iLogger, final A3 a32, final A1 a12, final boolean z10) {
        final File fileH0 = a32.h0();
        final a aVar = new a(new Callable() { // from class: io.sentry.I2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T2.c(interfaceC5197f0, a32, a12, fileH0, iLogger, z10);
            }
        });
        return new T2(new U2(EnumC5210h3.ReplayVideo, new Callable() { // from class: io.sentry.J2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, null, null), new Callable() { // from class: io.sentry.K2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static T2 K(final InterfaceC5197f0 interfaceC5197f0, final O3 o32) {
        io.sentry.util.w.c(interfaceC5197f0, "ISerializer is required.");
        io.sentry.util.w.c(o32, "Session is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.s2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T2.w(interfaceC5197f0, o32);
            }
        });
        return new T2(new U2(EnumC5210h3.Session, new Callable() { // from class: io.sentry.D2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.L2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    private static byte[] S(Map map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (Map.Entry entry : map.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(f49323d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] c(InterfaceC5197f0 interfaceC5197f0, A3 a32, A1 a12, File file, ILogger iLogger, boolean z10) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f49323d));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    interfaceC5197f0.a(a32, bufferedWriter);
                    linkedHashMap.put(EnumC5210h3.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (a12 != null) {
                        interfaceC5197f0.a(a12, bufferedWriter);
                        linkedHashMap.put(EnumC5210h3.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] bArrB = AbstractC5296i.b(file.getPath(), 10485760L);
                        if (bArrB.length > 0) {
                            linkedHashMap.put(EnumC5210h3.ReplayVideo.getItemType(), bArrB);
                        }
                    }
                    byte[] bArrS = S(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z10) {
                            return bArrS;
                        }
                    }
                    return bArrS;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                iLogger.b(EnumC5215i3.ERROR, "Could not serialize replay recording", th2);
                if (file == null) {
                    return null;
                }
                if (z10) {
                    AbstractC5296i.a(file.getParentFile());
                    return null;
                }
                file.delete();
                return null;
            } finally {
                if (file != null) {
                    if (z10) {
                        AbstractC5296i.a(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    public static /* synthetic */ byte[] d(InterfaceC5197f0 interfaceC5197f0, io.sentry.clientreport.c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f49323d));
            try {
                interfaceC5197f0.a(cVar, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] o(InterfaceC5197f0 interfaceC5197f0, AbstractC5219j2 abstractC5219j2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f49323d));
            try {
                interfaceC5197f0.a(abstractC5219j2, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] p(File file, long j10, C5300v1 c5300v1, InterfaceC5197f0 interfaceC5197f0) throws io.sentry.exception.b {
        if (!file.exists()) {
            throw new io.sentry.exception.b(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
        String strF = io.sentry.vendor.a.f(AbstractC5296i.b(file.getPath(), j10), 3);
        if (strF.isEmpty()) {
            throw new io.sentry.exception.b("Profiling trace file is empty");
        }
        c5300v1.F(strF);
        c5300v1.E();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f49323d));
                    try {
                        interfaceC5197f0.a(c5300v1, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                throw new io.sentry.exception.b(String.format("Failed to serialize profiling trace data\n%s", e10.getMessage()));
            }
        } finally {
            file.delete();
        }
    }

    public static /* synthetic */ byte[] t(InterfaceC5197f0 interfaceC5197f0, C5266q3 c5266q3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f49323d));
            try {
                interfaceC5197f0.a(c5266q3, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] v(InterfaceC5197f0 interfaceC5197f0, C5235m3 c5235m3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f49323d));
            try {
                interfaceC5197f0.a(c5235m3, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] w(InterfaceC5197f0 interfaceC5197f0, O3 o32) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f49323d));
            try {
                interfaceC5197f0.a(o32, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] x(File file, C5268r1 c5268r1, X x10, InterfaceC5197f0 interfaceC5197f0) throws io.sentry.exception.b {
        if (!file.exists()) {
            throw new io.sentry.exception.b(String.format("Dropping profile chunk, because the file '%s' doesn't exists", file.getName()));
        }
        if (!"java".equals(c5268r1.p())) {
            String strF = io.sentry.vendor.a.f(AbstractC5296i.b(file.getPath(), 52428800L), 3);
            if (strF.isEmpty()) {
                throw new io.sentry.exception.b("Profiling trace file is empty");
            }
            c5268r1.s(strF);
        } else {
            if (O0.b().equals(x10)) {
                throw new io.sentry.exception.b("No ProfileConverter available, dropping chunk.");
            }
            try {
                c5268r1.t(x10.a(file.getAbsolutePath()));
            } catch (Exception e10) {
                throw new io.sentry.exception.b("Profile conversion failed", e10);
            }
        }
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f49323d));
                    try {
                        interfaceC5197f0.a(c5268r1, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                throw new io.sentry.exception.b(String.format("Failed to serialize profile chunk\n%s", e11.getMessage()));
            }
        } finally {
            file.delete();
        }
    }

    public io.sentry.clientreport.c L(InterfaceC5197f0 interfaceC5197f0) throws IOException {
        U2 u22 = this.f49324a;
        if (u22 == null || u22.b() != EnumC5210h3.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f49323d));
        try {
            io.sentry.clientreport.c cVar = (io.sentry.clientreport.c) interfaceC5197f0.c(bufferedReader, io.sentry.clientreport.c.class);
            bufferedReader.close();
            return cVar;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public byte[] M() {
        Callable callable;
        if (this.f49326c == null && (callable = this.f49325b) != null) {
            this.f49326c = (byte[]) callable.call();
        }
        return this.f49326c;
    }

    public V2 N(InterfaceC5197f0 interfaceC5197f0) throws IOException {
        U2 u22 = this.f49324a;
        if (u22 == null || u22.b() != EnumC5210h3.Event) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f49323d));
        try {
            V2 v22 = (V2) interfaceC5197f0.c(bufferedReader, V2.class);
            bufferedReader.close();
            return v22;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public U2 O() {
        return this.f49324a;
    }

    public C5235m3 P(InterfaceC5197f0 interfaceC5197f0) throws IOException {
        U2 u22 = this.f49324a;
        if (u22 == null || u22.b() != EnumC5210h3.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f49323d));
        try {
            C5235m3 c5235m3 = (C5235m3) interfaceC5197f0.c(bufferedReader, C5235m3.class);
            bufferedReader.close();
            return c5235m3;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public C5266q3 Q(InterfaceC5197f0 interfaceC5197f0) throws IOException {
        U2 u22 = this.f49324a;
        if (u22 == null || u22.b() != EnumC5210h3.TraceMetric) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f49323d));
        try {
            C5266q3 c5266q3 = (C5266q3) interfaceC5197f0.c(bufferedReader, C5266q3.class);
            bufferedReader.close();
            return c5266q3;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public io.sentry.protocol.E R(InterfaceC5197f0 interfaceC5197f0) throws IOException {
        U2 u22 = this.f49324a;
        if (u22 == null || u22.b() != EnumC5210h3.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f49323d));
        try {
            io.sentry.protocol.E e10 = (io.sentry.protocol.E) interfaceC5197f0.c(bufferedReader, io.sentry.protocol.E.class);
            bufferedReader.close();
            return e10;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    T2(U2 u22, Callable callable) {
        this.f49324a = (U2) io.sentry.util.w.c(u22, "SentryEnvelopeItemHeader is required.");
        this.f49325b = (Callable) io.sentry.util.w.c(callable, "DataFactory is required.");
        this.f49326c = null;
    }
}
