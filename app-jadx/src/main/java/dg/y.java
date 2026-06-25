package dg;

import dg.D;
import dg.t;
import dg.x;
import fg.AbstractC4807e;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.C6683h;
import tg.C6686k;
import tg.InterfaceC6684i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class y extends D {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f45612g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f45613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x f45614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f45615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x f45616k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x f45617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f45618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f45619n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f45620o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6686k f45621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f45622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f45623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f45624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f45625f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(StringBuilder sb2, String key) {
            AbstractC5504s.h(sb2, "<this>");
            AbstractC5504s.h(key, "key");
            sb2.append('\"');
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = key.charAt(i10);
                if (cCharAt == '\n') {
                    sb2.append("%0A");
                } else if (cCharAt == '\r') {
                    sb2.append("%0D");
                } else if (cCharAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(cCharAt);
                }
            }
            sb2.append('\"');
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f45629c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f45630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final D f45631b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(t tVar, D body) {
                AbstractC5504s.h(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((tVar != null ? tVar.d("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((tVar != null ? tVar.d("Content-Length") : null) == null) {
                    return new c(tVar, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            public final c b(String name, String value) {
                AbstractC5504s.h(name, "name");
                AbstractC5504s.h(value, "value");
                return c(name, null, D.a.j(D.f45262a, value, null, 1, null));
            }

            public final c c(String name, String str, D body) {
                AbstractC5504s.h(name, "name");
                AbstractC5504s.h(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                b bVar = y.f45612g;
                bVar.a(sb2, name);
                if (str != null) {
                    sb2.append("; filename=");
                    bVar.a(sb2, str);
                }
                String string = sb2.toString();
                AbstractC5504s.g(string, "StringBuilder().apply(builderAction).toString()");
                return a(new t.a().d("Content-Disposition", string).e(), body);
            }

            private a() {
            }
        }

        public /* synthetic */ c(t tVar, D d10, DefaultConstructorMarker defaultConstructorMarker) {
            this(tVar, d10);
        }

        public final D a() {
            return this.f45631b;
        }

        public final t b() {
            return this.f45630a;
        }

        private c(t tVar, D d10) {
            this.f45630a = tVar;
            this.f45631b = d10;
        }
    }

    static {
        x.a aVar = x.f45605e;
        f45613h = aVar.b("multipart/mixed");
        f45614i = aVar.b("multipart/alternative");
        f45615j = aVar.b("multipart/digest");
        f45616k = aVar.b("multipart/parallel");
        f45617l = aVar.b("multipart/form-data");
        f45618m = new byte[]{58, 32};
        f45619n = new byte[]{13, 10};
        f45620o = new byte[]{45, 45};
    }

    public y(C6686k boundaryByteString, x type, List parts) {
        AbstractC5504s.h(boundaryByteString, "boundaryByteString");
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(parts, "parts");
        this.f45621b = boundaryByteString;
        this.f45622c = type;
        this.f45623d = parts;
        this.f45624e = x.f45605e.b(type + "; boundary=" + g());
        this.f45625f = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long h(InterfaceC6684i interfaceC6684i, boolean z10) throws EOFException {
        C6683h c6683h;
        if (z10) {
            interfaceC6684i = new C6683h();
            c6683h = interfaceC6684i;
        } else {
            c6683h = 0;
        }
        int size = this.f45623d.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) this.f45623d.get(i10);
            t tVarB = cVar.b();
            D dA = cVar.a();
            AbstractC5504s.e(interfaceC6684i);
            interfaceC6684i.write(f45620o);
            interfaceC6684i.A0(this.f45621b);
            interfaceC6684i.write(f45619n);
            if (tVarB != null) {
                int size2 = tVarB.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    interfaceC6684i.s0(tVarB.f(i11)).write(f45618m).s0(tVarB.p(i11)).write(f45619n);
                }
            }
            x xVarB = dA.b();
            if (xVarB != null) {
                interfaceC6684i.s0("Content-Type: ").s0(xVarB.toString()).write(f45619n);
            }
            long jA = dA.a();
            if (jA != -1) {
                interfaceC6684i.s0("Content-Length: ").S0(jA).write(f45619n);
            } else if (z10) {
                AbstractC5504s.e(c6683h);
                c6683h.g();
                return -1L;
            }
            byte[] bArr = f45619n;
            interfaceC6684i.write(bArr);
            if (z10) {
                j10 += jA;
            } else {
                dA.f(interfaceC6684i);
            }
            interfaceC6684i.write(bArr);
        }
        AbstractC5504s.e(interfaceC6684i);
        byte[] bArr2 = f45620o;
        interfaceC6684i.write(bArr2);
        interfaceC6684i.A0(this.f45621b);
        interfaceC6684i.write(bArr2);
        interfaceC6684i.write(f45619n);
        if (!z10) {
            return j10;
        }
        AbstractC5504s.e(c6683h);
        long size3 = j10 + c6683h.size();
        c6683h.g();
        return size3;
    }

    @Override // dg.D
    public long a() throws EOFException {
        long j10 = this.f45625f;
        if (j10 != -1) {
            return j10;
        }
        long jH = h(null, true);
        this.f45625f = jH;
        return jH;
    }

    @Override // dg.D
    public x b() {
        return this.f45624e;
    }

    @Override // dg.D
    public void f(InterfaceC6684i sink) throws EOFException {
        AbstractC5504s.h(sink, "sink");
        h(sink, false);
    }

    public final String g() {
        return this.f45621b.Q();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6686k f45626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private x f45627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f45628c;

        public a(String boundary) {
            AbstractC5504s.h(boundary, "boundary");
            this.f45626a = C6686k.f61044d.g(boundary);
            this.f45627b = y.f45613h;
            this.f45628c = new ArrayList();
        }

        public final a a(String name, String value) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(value, "value");
            d(c.f45629c.b(name, value));
            return this;
        }

        public final a b(String name, String str, D body) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(body, "body");
            d(c.f45629c.c(name, str, body));
            return this;
        }

        public final a c(t tVar, D body) {
            AbstractC5504s.h(body, "body");
            d(c.f45629c.a(tVar, body));
            return this;
        }

        public final a d(c part) {
            AbstractC5504s.h(part, "part");
            this.f45628c.add(part);
            return this;
        }

        public final y e() {
            if (this.f45628c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new y(this.f45626a, this.f45627b, AbstractC4807e.V(this.f45628c));
        }

        public final a f(x type) {
            AbstractC5504s.h(type, "type");
            if (AbstractC5504s.c(type.f(), "multipart")) {
                this.f45627b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                AbstractC5504s.g(str, "randomUUID().toString()");
            }
            this(str);
        }
    }
}
