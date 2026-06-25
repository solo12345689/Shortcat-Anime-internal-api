package X1;

import T1.A;
import T1.C2140d;
import Td.L;
import Td.r;
import Ud.AbstractC2279u;
import W1.f;
import W1.g;
import W1.h;
import X1.f;
import androidx.datastore.preferences.protobuf.AbstractC2802f;
import androidx.datastore.preferences.protobuf.AbstractC2815t;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements A {

    /* JADX INFO: renamed from: a */
    public static final h f21619a = new h();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21620a;

        static {
            int[] iArr = new int[h.b.values().length];
            try {
                iArr[h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f21620a = iArr;
        }
    }

    private h() {
    }

    private final void d(String str, W1.h hVar, c cVar) throws C2140d {
        h.b bVarG0 = hVar.g0();
        switch (bVarG0 == null ? -1 : a.f21620a[bVarG0.ordinal()]) {
            case -1:
                throw new C2140d("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new r();
            case 1:
                cVar.i(i.a(str), Boolean.valueOf(hVar.X()));
                return;
            case 2:
                cVar.i(i.d(str), Float.valueOf(hVar.b0()));
                return;
            case 3:
                cVar.i(i.c(str), Double.valueOf(hVar.a0()));
                return;
            case 4:
                cVar.i(i.e(str), Integer.valueOf(hVar.c0()));
                return;
            case 5:
                cVar.i(i.f(str), Long.valueOf(hVar.d0()));
                return;
            case 6:
                f.a aVarG = i.g(str);
                String strE0 = hVar.e0();
                AbstractC5504s.g(strE0, "value.string");
                cVar.i(aVarG, strE0);
                return;
            case 7:
                f.a aVarH = i.h(str);
                List listT = hVar.f0().T();
                AbstractC5504s.g(listT, "value.stringSet.stringsList");
                cVar.i(aVarH, AbstractC2279u.f1(listT));
                return;
            case 8:
                f.a aVarB = i.b(str);
                byte[] bArrX = hVar.Y().x();
                AbstractC5504s.g(bArrX, "value.bytes.toByteArray()");
                cVar.i(aVarB, bArrX);
                return;
            case 9:
                throw new C2140d("Value not set.", null, 2, null);
        }
    }

    private final W1.h f(Object obj) {
        if (obj instanceof Boolean) {
            AbstractC2815t abstractC2815tI = W1.h.h0().s(((Boolean) obj).booleanValue()).i();
            AbstractC5504s.g(abstractC2815tI, "newBuilder().setBoolean(value).build()");
            return (W1.h) abstractC2815tI;
        }
        if (obj instanceof Float) {
            AbstractC2815t abstractC2815tI2 = W1.h.h0().v(((Number) obj).floatValue()).i();
            AbstractC5504s.g(abstractC2815tI2, "newBuilder().setFloat(value).build()");
            return (W1.h) abstractC2815tI2;
        }
        if (obj instanceof Double) {
            AbstractC2815t abstractC2815tI3 = W1.h.h0().u(((Number) obj).doubleValue()).i();
            AbstractC5504s.g(abstractC2815tI3, "newBuilder().setDouble(value).build()");
            return (W1.h) abstractC2815tI3;
        }
        if (obj instanceof Integer) {
            AbstractC2815t abstractC2815tI4 = W1.h.h0().x(((Number) obj).intValue()).i();
            AbstractC5504s.g(abstractC2815tI4, "newBuilder().setInteger(value).build()");
            return (W1.h) abstractC2815tI4;
        }
        if (obj instanceof Long) {
            AbstractC2815t abstractC2815tI5 = W1.h.h0().y(((Number) obj).longValue()).i();
            AbstractC5504s.g(abstractC2815tI5, "newBuilder().setLong(value).build()");
            return (W1.h) abstractC2815tI5;
        }
        if (obj instanceof String) {
            AbstractC2815t abstractC2815tI6 = W1.h.h0().A((String) obj).i();
            AbstractC5504s.g(abstractC2815tI6, "newBuilder().setString(value).build()");
            return (W1.h) abstractC2815tI6;
        }
        if (obj instanceof Set) {
            h.a aVarH0 = W1.h.h0();
            g.a aVarU = W1.g.U();
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            AbstractC2815t abstractC2815tI7 = aVarH0.B(aVarU.s((Set) obj)).i();
            AbstractC5504s.g(abstractC2815tI7, "newBuilder()\n           …                 .build()");
            return (W1.h) abstractC2815tI7;
        }
        if (obj instanceof byte[]) {
            AbstractC2815t abstractC2815tI8 = W1.h.h0().t(AbstractC2802f.f((byte[]) obj)).i();
            AbstractC5504s.g(abstractC2815tI8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (W1.h) abstractC2815tI8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // T1.A
    public Object a(InputStream inputStream, Zd.e eVar) throws C2140d {
        W1.f fVarA = W1.d.f20622a.a(inputStream);
        c cVarB = g.b(new f.b[0]);
        Map mapR = fVarA.R();
        AbstractC5504s.g(mapR, "preferencesProto.preferencesMap");
        for (Map.Entry entry : mapR.entrySet()) {
            String name = (String) entry.getKey();
            W1.h value = (W1.h) entry.getValue();
            h hVar = f21619a;
            AbstractC5504s.g(name, "name");
            AbstractC5504s.g(value, "value");
            hVar.d(name, value, cVarB);
        }
        return cVarB.d();
    }

    @Override // T1.A
    /* JADX INFO: renamed from: e */
    public f c() {
        return g.a();
    }

    @Override // T1.A
    /* JADX INFO: renamed from: g */
    public Object b(f fVar, OutputStream outputStream, Zd.e eVar) {
        Map mapA = fVar.a();
        f.a aVarU = W1.f.U();
        for (Map.Entry entry : mapA.entrySet()) {
            aVarU.s(((f.a) entry.getKey()).a(), f(entry.getValue()));
        }
        ((W1.f) aVarU.i()).h(outputStream);
        return L.f17438a;
    }
}
