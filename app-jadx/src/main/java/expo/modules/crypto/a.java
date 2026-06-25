package expo.modules.crypto;

import Df.AbstractC1268a;
import Df.C1271d;
import Td.AbstractC2163n;
import Td.L;
import Td.r;
import Ud.AbstractC2273n;
import android.util.Base64;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import dc.s;
import expo.modules.crypto.DigestOptions;
import ie.InterfaceC5082a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.U;
import pc.V;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lexpo/modules/crypto/a;", "Lgc/c;", "<init>", "()V", "Lexpo/modules/crypto/DigestAlgorithm;", "algorithm", "", "data", "Lexpo/modules/crypto/DigestOptions;", "options", "D", "(Lexpo/modules/crypto/DigestAlgorithm;Ljava/lang/String;Lexpo/modules/crypto/DigestOptions;)Ljava/lang/String;", "Loc/j;", "output", "LTd/L;", "C", "(Lexpo/modules/crypto/DigestAlgorithm;Loc/j;Loc/j;)V", "typedArray", "F", "(Loc/j;)V", "Lgc/e;", "n", "()Lgc/e;", "Ljava/security/SecureRandom;", "d", "Lkotlin/Lazy;", "G", "()Ljava/security/SecureRandom;", "secureRandom", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends gc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy secureRandom = AbstractC2163n.b(new InterfaceC5082a() { // from class: wb.a
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return expo.modules.crypto.a.H();
        }
    });

    /* JADX INFO: renamed from: expo.modules.crypto.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class C0730a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46052a;

        static {
            int[] iArr = new int[DigestOptions.Encoding.values().length];
            try {
                iArr[DigestOptions.Encoding.BASE64.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DigestOptions.Encoding.HEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46052a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46053a = new b();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(DigestAlgorithm.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f46054a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f46055a = new d();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(DigestOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function1 {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            DigestOptions digestOptions = (DigestOptions) objArr[2];
            DigestAlgorithm digestAlgorithm = (DigestAlgorithm) obj;
            return a.this.D(digestAlgorithm, (String) obj2, digestOptions);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements Function1 {
        public f() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws NoSuchAlgorithmException {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            oc.j jVar = (oc.j) objArr[2];
            a aVar = a.this;
            aVar.C((DigestAlgorithm) obj, (oc.j) obj2, jVar);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f46058a = new g();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(DigestAlgorithm.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f46059a = new h();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f46060a = new i();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(DigestOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements Function1 {
        public j() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            DigestOptions digestOptions = (DigestOptions) objArr[2];
            DigestAlgorithm digestAlgorithm = (DigestAlgorithm) obj;
            return a.this.D(digestAlgorithm, (String) obj2, digestOptions);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f46062a = new k();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(oc.j.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l implements Function1 {
        public l() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            a.this.F((oc.j) objArr[0]);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f46064a = new m();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(DigestAlgorithm.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f46065a = new n();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(oc.j.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f46066a = new o();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(oc.j.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return UUID.randomUUID().toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(DigestAlgorithm algorithm, oc.j output, oc.j data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm.getValue());
        messageDigest.update(data.toDirectBuffer());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC5504s.g(bArrDigest, "digest(...)");
        output.write(bArrDigest, 0, Math.min(bArrDigest.length, output.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D(DigestAlgorithm algorithm, String data, DigestOptions options) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm.getValue());
        byte[] bytes = data.getBytes(C1271d.f3718b);
        AbstractC5504s.g(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bArrDigest = messageDigest.digest();
        AbstractC5504s.g(bArrDigest, "digest(...)");
        int i10 = C0730a.f46052a[options.getEncoding().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return AbstractC2273n.w0(bArrDigest, "", null, null, 0, null, new Function1() { // from class: wb.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return expo.modules.crypto.a.E(((Byte) obj).byteValue());
                    }
                }, 30, null);
            }
            throw new r();
        }
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        AbstractC5504s.e(strEncodeToString);
        return strEncodeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence E(byte b10) {
        String string = Integer.toString((b10 & 255) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, AbstractC1268a.a(16));
        AbstractC5504s.g(string, "toString(...)");
        String strSubstring = string.substring(1);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(oc.j typedArray) {
        byte[] bArr = new byte[typedArray.d()];
        G().nextBytes(bArr);
        typedArray.write(bArr, 0, typedArray.d());
    }

    private final SecureRandom G() {
        return (SecureRandom) this.secureRandom.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SecureRandom H() {
        return new SecureRandom();
    }

    @Override // gc.c
    public gc.e n() {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoCrypto");
            X xM = dVar.m();
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(DigestAlgorithm.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                cls = Object.class;
                cls2 = DigestOptions.class;
                c5972b = new C5972b(new M(O.b(DigestAlgorithm.class), false, g.f46058a), xM);
            } else {
                cls = Object.class;
                cls2 = DigestOptions.class;
            }
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
            if (c5972b2 == null) {
                cls3 = L.class;
                c5972b2 = new C5972b(new M(O.b(String.class), false, h.f46059a), xM);
            } else {
                cls3 = L.class;
            }
            C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(O.b(cls2), bool));
            if (c5972b3 == null) {
                cls4 = oc.j.class;
                c5972b3 = new C5972b(new M(O.b(cls2), false, i.f46060a), xM);
            } else {
                cls4 = oc.j.class;
            }
            C5972b[] c5972bArr = {c5972b, c5972b2, c5972b3};
            V v10 = V.f55908a;
            U u10 = (U) v10.a().get(O.b(String.class));
            if (u10 == null) {
                u10 = new U(O.b(String.class));
                v10.a().put(O.b(String.class), u10);
            }
            dVar.p().put("digestString", new dc.r("digestString", c5972bArr, u10, new j()));
            X xM2 = dVar.m();
            C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(O.b(DigestAlgorithm.class), bool));
            if (c5972b4 == null) {
                c5972b4 = new C5972b(new M(O.b(DigestAlgorithm.class), false, b.f46053a), xM2);
            }
            C5972b c5972b5 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
            if (c5972b5 == null) {
                c5972b5 = new C5972b(new M(O.b(String.class), false, c.f46054a), xM2);
            }
            C5972b c5972b6 = (C5972b) c5974d.a().get(new Pair(O.b(cls2), bool));
            if (c5972b6 == null) {
                c5972b6 = new C5972b(new M(O.b(cls2), false, d.f46055a), xM2);
            }
            C5972b[] c5972bArr2 = {c5972b4, c5972b5, c5972b6};
            e eVar = new e();
            dVar.k().put("digestStringAsync", AbstractC5504s.c(String.class, Integer.TYPE) ? new dc.l("digestStringAsync", c5972bArr2, eVar) : AbstractC5504s.c(String.class, Boolean.TYPE) ? new dc.h("digestStringAsync", c5972bArr2, eVar) : AbstractC5504s.c(String.class, Double.TYPE) ? new dc.i("digestStringAsync", c5972bArr2, eVar) : AbstractC5504s.c(String.class, Float.TYPE) ? new dc.j("digestStringAsync", c5972bArr2, eVar) : AbstractC5504s.c(String.class, String.class) ? new dc.n("digestStringAsync", c5972bArr2, eVar) : new s("digestStringAsync", c5972bArr2, eVar));
            X xM3 = dVar.m();
            C5972b c5972b7 = (C5972b) c5974d.a().get(new Pair(O.b(cls4), bool));
            if (c5972b7 == null) {
                c5972b7 = new C5972b(new M(O.b(cls4), false, k.f46062a), xM3);
            }
            C5972b[] c5972bArr3 = {c5972b7};
            U u11 = (U) v10.a().get(O.b(cls3));
            if (u11 == null) {
                u11 = new U(O.b(cls3));
                v10.a().put(O.b(cls3), u11);
            }
            dVar.p().put("getRandomValues", new dc.r("getRandomValues", c5972bArr3, u11, new l()));
            X xM4 = dVar.m();
            C5972b c5972b8 = (C5972b) c5974d.a().get(new Pair(O.b(DigestAlgorithm.class), bool));
            if (c5972b8 == null) {
                c5972b8 = new C5972b(new M(O.b(DigestAlgorithm.class), false, m.f46064a), xM4);
            }
            C5972b c5972b9 = (C5972b) c5974d.a().get(new Pair(O.b(cls4), bool));
            if (c5972b9 == null) {
                c5972b9 = new C5972b(new M(O.b(cls4), false, n.f46065a), xM4);
            }
            C5972b c5972b10 = (C5972b) c5974d.a().get(new Pair(O.b(cls4), bool));
            if (c5972b10 == null) {
                c5972b10 = new C5972b(new M(O.b(cls4), false, o.f46066a), xM4);
            }
            C5972b[] c5972bArr4 = {c5972b8, c5972b9, c5972b10};
            U u12 = (U) v10.a().get(O.b(cls3));
            if (u12 == null) {
                u12 = new U(O.b(cls3));
                v10.a().put(O.b(cls3), u12);
            }
            dVar.p().put("digest", new dc.r("digest", c5972bArr4, u12, new f()));
            C5972b[] c5972bArr5 = new C5972b[0];
            U u13 = (U) v10.a().get(O.b(cls));
            if (u13 == null) {
                u13 = new U(O.b(cls));
                v10.a().put(O.b(cls), u13);
            }
            dVar.p().put("randomUUID", new dc.r("randomUUID", c5972bArr5, u13, new p()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
