package ia;

import com.adjust.sdk.Constants;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ia.InterfaceC5049d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ia.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C5051f implements fa.e {

    /* JADX INFO: renamed from: f */
    private static final Charset f48746f = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: g */
    private static final fa.c f48747g = fa.c.a(SubscriberAttributeKt.JSON_NAME_KEY).b(C5046a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h */
    private static final fa.c f48748h = fa.c.a("value").b(C5046a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i */
    private static final fa.d f48749i = new fa.d() { // from class: ia.e
        @Override // fa.d
        public final void a(Object obj, Object obj2) {
            C5051f.a((Map.Entry) obj, (fa.e) obj2);
        }
    };

    /* JADX INFO: renamed from: a */
    private OutputStream f48750a;

    /* JADX INFO: renamed from: b */
    private final Map f48751b;

    /* JADX INFO: renamed from: c */
    private final Map f48752c;

    /* JADX INFO: renamed from: d */
    private final fa.d f48753d;

    /* JADX INFO: renamed from: e */
    private final i f48754e = new i(this);

    /* JADX INFO: renamed from: ia.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f48755a;

        static {
            int[] iArr = new int[InterfaceC5049d.a.values().length];
            f48755a = iArr;
            try {
                iArr[InterfaceC5049d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48755a[InterfaceC5049d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48755a[InterfaceC5049d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C5051f(OutputStream outputStream, Map map, Map map2, fa.d dVar) {
        this.f48750a = outputStream;
        this.f48751b = map;
        this.f48752c = map2;
        this.f48753d = dVar;
    }

    public static /* synthetic */ void a(Map.Entry entry, fa.e eVar) {
        eVar.b(f48747g, entry.getKey());
        eVar.b(f48748h, entry.getValue());
    }

    private static ByteBuffer m(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long n(fa.d dVar, Object obj) throws IOException {
        C5047b c5047b = new C5047b();
        try {
            OutputStream outputStream = this.f48750a;
            this.f48750a = c5047b;
            try {
                dVar.a(obj, this);
                this.f48750a = outputStream;
                long jA = c5047b.a();
                c5047b.close();
                return jA;
            } catch (Throwable th2) {
                this.f48750a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c5047b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private C5051f o(fa.d dVar, fa.c cVar, Object obj, boolean z10) throws IOException {
        long jN = n(dVar, obj);
        if (z10 && jN == 0) {
            return this;
        }
        t((s(cVar) << 3) | 2);
        u(jN);
        dVar.a(obj, this);
        return this;
    }

    private C5051f p(fa.f fVar, fa.c cVar, Object obj, boolean z10) {
        this.f48754e.c(cVar, z10);
        fVar.a(obj, this.f48754e);
        return this;
    }

    private static InterfaceC5049d r(fa.c cVar) {
        InterfaceC5049d interfaceC5049d = (InterfaceC5049d) cVar.c(InterfaceC5049d.class);
        if (interfaceC5049d != null) {
            return interfaceC5049d;
        }
        throw new fa.b("Field has no @Protobuf config");
    }

    private static int s(fa.c cVar) {
        InterfaceC5049d interfaceC5049d = (InterfaceC5049d) cVar.c(InterfaceC5049d.class);
        if (interfaceC5049d != null) {
            return interfaceC5049d.tag();
        }
        throw new fa.b("Field has no @Protobuf config");
    }

    private void t(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f48750a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f48750a.write(i10 & 127);
    }

    private void u(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f48750a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f48750a.write(((int) j10) & 127);
    }

    @Override // fa.e
    public fa.e b(fa.c cVar, Object obj) {
        return g(cVar, obj, true);
    }

    fa.e e(fa.c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        t((s(cVar) << 3) | 1);
        this.f48750a.write(m(8).putDouble(d10).array());
        return this;
    }

    fa.e f(fa.c cVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        t((s(cVar) << 3) | 5);
        this.f48750a.write(m(4).putFloat(f10).array());
        return this;
    }

    fa.e g(fa.c cVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    t((s(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f48746f);
                    t(bytes.length);
                    this.f48750a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    g(cVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    o(f48749i, cVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return e(cVar, ((Double) obj).doubleValue(), z10);
                }
                if (obj instanceof Float) {
                    return f(cVar, ((Float) obj).floatValue(), z10);
                }
                if (obj instanceof Number) {
                    return k(cVar, ((Number) obj).longValue(), z10);
                }
                if (obj instanceof Boolean) {
                    return l(cVar, ((Boolean) obj).booleanValue(), z10);
                }
                if (!(obj instanceof byte[])) {
                    fa.d dVar = (fa.d) this.f48751b.get(obj.getClass());
                    if (dVar != null) {
                        return o(dVar, cVar, obj, z10);
                    }
                    fa.f fVar = (fa.f) this.f48752c.get(obj.getClass());
                    return fVar != null ? p(fVar, cVar, obj, z10) : obj instanceof InterfaceC5048c ? c(cVar, ((InterfaceC5048c) obj).d()) : obj instanceof Enum ? c(cVar, ((Enum) obj).ordinal()) : o(this.f48753d, cVar, obj, z10);
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    t((s(cVar) << 3) | 2);
                    t(bArr.length);
                    this.f48750a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // fa.e
    /* JADX INFO: renamed from: h */
    public C5051f c(fa.c cVar, int i10) {
        return i(cVar, i10, true);
    }

    C5051f i(fa.c cVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            InterfaceC5049d interfaceC5049dR = r(cVar);
            int i11 = a.f48755a[interfaceC5049dR.intEncoding().ordinal()];
            if (i11 == 1) {
                t(interfaceC5049dR.tag() << 3);
                t(i10);
                return this;
            }
            if (i11 == 2) {
                t(interfaceC5049dR.tag() << 3);
                t((i10 << 1) ^ (i10 >> 31));
                return this;
            }
            if (i11 == 3) {
                t((interfaceC5049dR.tag() << 3) | 5);
                this.f48750a.write(m(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    @Override // fa.e
    /* JADX INFO: renamed from: j */
    public C5051f d(fa.c cVar, long j10) {
        return k(cVar, j10, true);
    }

    C5051f k(fa.c cVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            InterfaceC5049d interfaceC5049dR = r(cVar);
            int i10 = a.f48755a[interfaceC5049dR.intEncoding().ordinal()];
            if (i10 == 1) {
                t(interfaceC5049dR.tag() << 3);
                u(j10);
                return this;
            }
            if (i10 == 2) {
                t(interfaceC5049dR.tag() << 3);
                u((j10 >> 63) ^ (j10 << 1));
                return this;
            }
            if (i10 == 3) {
                t((interfaceC5049dR.tag() << 3) | 1);
                this.f48750a.write(m(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    C5051f l(fa.c cVar, boolean z10, boolean z11) {
        return i(cVar, z10 ? 1 : 0, z11);
    }

    C5051f q(Object obj) {
        if (obj == null) {
            return this;
        }
        fa.d dVar = (fa.d) this.f48751b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new fa.b("No encoder for " + obj.getClass());
    }
}
