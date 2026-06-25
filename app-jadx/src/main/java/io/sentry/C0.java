package io.sentry;

import com.adjust.sdk.Constants;
import io.sentry.A1;
import io.sentry.A3;
import io.sentry.C5191e;
import io.sentry.C5209h2;
import io.sentry.C5220j3;
import io.sentry.C5235m3;
import io.sentry.C5266q3;
import io.sentry.C5268r1;
import io.sentry.C5269r2;
import io.sentry.C5273s1;
import io.sentry.C5300v1;
import io.sentry.C5305w1;
import io.sentry.EnumC5210h3;
import io.sentry.EnumC5215i3;
import io.sentry.O3;
import io.sentry.T3;
import io.sentry.U2;
import io.sentry.V2;
import io.sentry.Y3;
import io.sentry.a4;
import io.sentry.clientreport.c;
import io.sentry.m4;
import io.sentry.profilemeasurements.a;
import io.sentry.profilemeasurements.b;
import io.sentry.protocol.A;
import io.sentry.protocol.B;
import io.sentry.protocol.C;
import io.sentry.protocol.C5251a;
import io.sentry.protocol.C5252b;
import io.sentry.protocol.C5253c;
import io.sentry.protocol.C5254d;
import io.sentry.protocol.C5255e;
import io.sentry.protocol.C5258h;
import io.sentry.protocol.C5259i;
import io.sentry.protocol.C5260j;
import io.sentry.protocol.C5261k;
import io.sentry.protocol.D;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.E;
import io.sentry.protocol.I;
import io.sentry.protocol.J;
import io.sentry.protocol.K;
import io.sentry.protocol.l;
import io.sentry.protocol.m;
import io.sentry.protocol.n;
import io.sentry.protocol.o;
import io.sentry.protocol.q;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import io.sentry.rrweb.a;
import io.sentry.rrweb.c;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.rrweb.g;
import io.sentry.rrweb.i;
import io.sentry.rrweb.j;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0 implements InterfaceC5197f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f49082c = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f49083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f49084b;

    public C0(C5322z3 c5322z3) {
        this.f49083a = c5322z3;
        HashMap map = new HashMap();
        this.f49084b = map;
        map.put(C5251a.class, new C5251a.C0800a());
        map.put(C5191e.class, new C5191e.a());
        map.put(C5252b.class, new C5252b.a());
        map.put(C5253c.class, new C5253c.a());
        map.put(DebugImage.class, new DebugImage.a());
        map.put(C5254d.class, new C5254d.a());
        map.put(C5255e.class, new C5255e.a());
        map.put(C5255e.b.class, new C5255e.b.a());
        map.put(C5258h.class, new C5258h.a());
        map.put(C5260j.class, new C5260j.a());
        map.put(C.b.class, new C.b.a());
        map.put(C5261k.class, new C5261k.a());
        map.put(io.sentry.protocol.l.class, new l.a());
        map.put(io.sentry.protocol.m.class, new m.a());
        map.put(io.sentry.protocol.n.class, new n.a());
        map.put(C5268r1.class, new C5268r1.b());
        map.put(C5273s1.class, new C5273s1.a());
        map.put(C5300v1.class, new C5300v1.b());
        map.put(C5305w1.class, new C5305w1.a());
        map.put(io.sentry.profilemeasurements.a.class, new a.C0799a());
        map.put(io.sentry.profilemeasurements.b.class, new b.a());
        map.put(io.sentry.protocol.o.class, new o.a());
        map.put(A1.class, new A1.b());
        map.put(io.sentry.rrweb.a.class, new a.C0803a());
        map.put(io.sentry.rrweb.c.class, new c.a());
        map.put(io.sentry.rrweb.e.class, new e.a());
        map.put(io.sentry.rrweb.f.class, new f.a());
        map.put(io.sentry.rrweb.g.class, new g.a());
        map.put(io.sentry.rrweb.i.class, new i.a());
        map.put(io.sentry.rrweb.j.class, new j.a());
        map.put(io.sentry.protocol.q.class, new q.a());
        map.put(io.sentry.protocol.r.class, new r.a());
        map.put(C5269r2.class, new C5269r2.a());
        map.put(U2.class, new U2.a());
        map.put(V2.class, new V2.a());
        map.put(io.sentry.protocol.s.class, new s.a());
        map.put(EnumC5210h3.class, new EnumC5210h3.a());
        map.put(EnumC5215i3.class, new EnumC5215i3.a());
        map.put(C5220j3.class, new C5220j3.a());
        map.put(C5235m3.class, new C5235m3.a());
        map.put(C5266q3.class, new C5266q3.a());
        map.put(io.sentry.protocol.y.class, new y.a());
        map.put(io.sentry.protocol.z.class, new z.a());
        map.put(A3.class, new A3.a());
        map.put(io.sentry.protocol.A.class, new A.a());
        map.put(io.sentry.protocol.B.class, new B.a());
        map.put(io.sentry.protocol.C.class, new C.a());
        map.put(C5209h2.class, new C5209h2.a());
        map.put(io.sentry.protocol.D.class, new D.a());
        map.put(io.sentry.protocol.E.class, new E.a());
        map.put(O3.class, new O3.a());
        map.put(T3.class, new T3.a());
        map.put(Y3.class, new Y3.a());
        map.put(a4.class, new a4.a());
        map.put(io.sentry.protocol.I.class, new I.a());
        map.put(C5259i.class, new C5259i.a());
        map.put(m4.class, new m4.a());
        map.put(io.sentry.clientreport.c.class, new c.a());
        map.put(io.sentry.protocol.K.class, new K.a());
        map.put(io.sentry.protocol.J.class, new J.a());
    }

    private boolean g(Class cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || String.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    private String h(Object obj, boolean z10) {
        StringWriter stringWriter = new StringWriter();
        C5319z0 c5319z0 = new C5319z0(stringWriter, this.f49083a.getMaxDepth());
        if (z10) {
            c5319z0.h("\t");
        }
        c5319z0.j(this.f49083a.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.InterfaceC5197f0
    public void a(Object obj, Writer writer) throws IOException {
        io.sentry.util.w.c(obj, "The entity is required.");
        io.sentry.util.w.c(writer, "The Writer object is required.");
        ILogger logger = this.f49083a.getLogger();
        EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
        if (logger.d(enumC5215i3)) {
            this.f49083a.getLogger().c(enumC5215i3, "Serializing object: %s", h(obj, this.f49083a.isEnablePrettySerializationOutput()));
        }
        new C5319z0(writer, this.f49083a.getMaxDepth()).j(this.f49083a.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.InterfaceC5197f0
    public void b(C5265q2 c5265q2, OutputStream outputStream) throws IOException {
        io.sentry.util.w.c(c5265q2, "The SentryEnvelope object is required.");
        io.sentry.util.w.c(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f49082c));
        try {
            c5265q2.b().serialize(new C5319z0(bufferedWriter, this.f49083a.getMaxDepth()), this.f49083a.getLogger());
            bufferedWriter.write("\n");
            for (T2 t22 : c5265q2.c()) {
                try {
                    byte[] bArrM = t22.M();
                    t22.O().serialize(new C5319z0(bufferedWriter, this.f49083a.getMaxDepth()), this.f49083a.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrM);
                    bufferedWriter.write("\n");
                } catch (Exception e10) {
                    this.f49083a.getLogger().b(EnumC5215i3.ERROR, "Failed to create envelope item. Dropping it.", e10);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.InterfaceC5197f0
    public Object c(Reader reader, Class cls) {
        Object objN1;
        try {
            C5309x0 c5309x0 = new C5309x0(reader);
            try {
                InterfaceC5267r0 interfaceC5267r0 = (InterfaceC5267r0) this.f49084b.get(cls);
                if (interfaceC5267r0 != null) {
                    objN1 = cls.cast(interfaceC5267r0.a(c5309x0, this.f49083a.getLogger()));
                } else {
                    if (!g(cls)) {
                        c5309x0.close();
                        return null;
                    }
                    objN1 = c5309x0.N1();
                }
                c5309x0.close();
                return objN1;
            } finally {
            }
        } catch (Exception e10) {
            this.f49083a.getLogger().b(EnumC5215i3.ERROR, "Error when deserializing", e10);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC5197f0
    public C5265q2 d(InputStream inputStream) {
        io.sentry.util.w.c(inputStream, "The InputStream object is required.");
        try {
            return this.f49083a.getEnvelopeReader().a(inputStream);
        } catch (IOException e10) {
            this.f49083a.getLogger().b(EnumC5215i3.ERROR, "Error deserializing envelope.", e10);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC5197f0
    public Object e(Reader reader, Class cls, InterfaceC5267r0 interfaceC5267r0) {
        try {
            C5309x0 c5309x0 = new C5309x0(reader);
            try {
                Object objN1 = (!Collection.class.isAssignableFrom(cls) || interfaceC5267r0 == null) ? c5309x0.N1() : c5309x0.T1(this.f49083a.getLogger(), interfaceC5267r0);
                c5309x0.close();
                return objN1;
            } finally {
            }
        } catch (Throwable th2) {
            this.f49083a.getLogger().b(EnumC5215i3.ERROR, "Error when deserializing", th2);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC5197f0
    public String f(Map map) {
        return h(map, false);
    }
}
