package m3;

import U2.C2246g;
import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import U2.O;
import U2.P;
import U2.r;
import U2.u;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.imageutils.JfifUtil;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import q2.AbstractC6096k;
import q2.C6080L;
import q2.C6097l;
import q2.C6102q;
import r3.r;
import r3.s;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.C6636x;
import t2.a0;
import u2.AbstractC6726h;

/* JADX INFO: renamed from: m3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C5637e implements InterfaceC2255p {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final u f53064f0 = new u() { // from class: m3.d
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return C5637e.d();
        }
    };

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final byte[] f53065g0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final byte[] f53066h0 = a0.z0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final byte[] f53067i0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final byte[] f53068j0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final UUID f53069k0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Map f53070l0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f53071A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f53072B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f53073C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f53074D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f53075E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private C6636x f53076F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private C6636x f53077G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f53078H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f53079I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f53080J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f53081K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f53082L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f53083M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f53084N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int[] f53085O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f53086P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f53087Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f53088R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f53089S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f53090T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private long f53091U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f53092V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f53093W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f53094X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f53095Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f53096Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5635c f53097a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f53098a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5639g f53099b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f53100b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f53101c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private byte f53102c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f53103d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f53104d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f53105e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private r f53106e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r.a f53107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C6609I f53108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C6609I f53109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C6609I f53110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C6609I f53111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C6609I f53112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C6609I f53113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C6609I f53114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C6609I f53115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C6609I f53116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C6609I f53117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ByteBuffer f53118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f53119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f53120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f53121t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f53122u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f53123v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f53124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c f53125x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f53126y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f53127z;

    /* JADX INFO: renamed from: m3.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements InterfaceC5634b {
        private b() {
        }

        @Override // m3.InterfaceC5634b
        public void a(int i10) throws C6080L {
            C5637e.this.r(i10);
        }

        @Override // m3.InterfaceC5634b
        public void b(int i10, double d10) {
            C5637e.this.u(i10, d10);
        }

        @Override // m3.InterfaceC5634b
        public void c(int i10, int i11, InterfaceC2256q interfaceC2256q) throws C6080L {
            C5637e.this.o(i10, i11, interfaceC2256q);
        }

        @Override // m3.InterfaceC5634b
        public void d(int i10, long j10) throws C6080L {
            C5637e.this.A(i10, j10);
        }

        @Override // m3.InterfaceC5634b
        public int e(int i10) {
            return C5637e.this.x(i10);
        }

        @Override // m3.InterfaceC5634b
        public boolean f(int i10) {
            return C5637e.this.C(i10);
        }

        @Override // m3.InterfaceC5634b
        public void g(int i10, String str) throws C6080L {
            C5637e.this.J(i10, str);
        }

        @Override // m3.InterfaceC5634b
        public void h(int i10, long j10, long j11) throws C6080L {
            C5637e.this.I(i10, j10, j11);
        }
    }

    /* JADX INFO: renamed from: m3.e$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static final class c {

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public byte[] f53144P;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public P f53150V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public boolean f53151W;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public O f53154Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f53155a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f53156a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f53157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f53158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f53159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f53160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f53161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f53162g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f53163h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f53164i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f53165j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public O.a f53166k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f53167l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public C6102q f53168m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f53169n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f53170o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f53171p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f53172q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f53173r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f53174s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f53175t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f53176u = 0.0f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f53177v = 0.0f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public float f53178w = 0.0f;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public byte[] f53179x = null;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f53180y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f53181z = false;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f53129A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f53130B = -1;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f53131C = -1;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f53132D = 1000;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f53133E = 200;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f53134F = -1.0f;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public float f53135G = -1.0f;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public float f53136H = -1.0f;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public float f53137I = -1.0f;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public float f53138J = -1.0f;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public float f53139K = -1.0f;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public float f53140L = -1.0f;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public float f53141M = -1.0f;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public float f53142N = -1.0f;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f53143O = -1.0f;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f53145Q = 1;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f53146R = -1;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f53147S = 8000;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public long f53148T = 0;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public long f53149U = 0;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public boolean f53152X = true;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private String f53153Y = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            AbstractC6614a.e(this.f53154Z);
        }

        private byte[] g(String str) throws C6080L {
            byte[] bArr = this.f53167l;
            if (bArr != null) {
                return bArr;
            }
            throw C6080L.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.f53134F == -1.0f || this.f53135G == -1.0f || this.f53136H == -1.0f || this.f53137I == -1.0f || this.f53138J == -1.0f || this.f53139K == -1.0f || this.f53140L == -1.0f || this.f53141M == -1.0f || this.f53142N == -1.0f || this.f53143O == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.f53134F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f53135G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f53136H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f53137I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f53138J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f53139K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f53140L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f53141M * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f53142N + 0.5f));
            byteBufferOrder.putShort((short) (this.f53143O + 0.5f));
            byteBufferOrder.putShort((short) this.f53132D);
            byteBufferOrder.putShort((short) this.f53133E);
            return bArr;
        }

        private static Pair k(C6609I c6609i) throws C6080L {
            try {
                c6609i.c0(16);
                long jC = c6609i.C();
                if (jC == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (jC == 859189832) {
                    return new Pair("video/3gpp", null);
                }
                if (jC != 826496599) {
                    AbstractC6635w.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair("video/x-unknown", null);
                }
                byte[] bArrF = c6609i.f();
                for (int iG = c6609i.g() + 20; iG < bArrF.length - 4; iG++) {
                    if (bArrF[iG] == 0 && bArrF[iG + 1] == 0 && bArrF[iG + 2] == 1 && bArrF[iG + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrF, iG, bArrF.length)));
                    }
                }
                throw C6080L.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C6080L.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(C6609I c6609i) throws C6080L {
            try {
                int iE = c6609i.E();
                if (iE == 1) {
                    return true;
                }
                if (iE == 65534) {
                    c6609i.b0(24);
                    if (c6609i.F() == C5637e.f53069k0.getMostSignificantBits()) {
                        if (c6609i.F() == C5637e.f53069k0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C6080L.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List m(byte[] bArr) throws C6080L {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw C6080L.a("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & 255);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & 255);
                if (bArr[i17] != 1) {
                    throw C6080L.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw C6080L.a("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw C6080L.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C6080L.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z10) {
            return "A_OPUS".equals(this.f53158c) ? z10 : this.f53162g > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:225:0x0458  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x0471  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x0473  */
        /* JADX WARN: Removed duplicated region for block: B:234:0x0480  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x0492  */
        /* JADX WARN: Removed duplicated region for block: B:301:0x05bc  */
        /* JADX WARN: Removed duplicated region for block: B:306:0x05d7  */
        /* JADX WARN: Removed duplicated region for block: B:307:0x05da  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void i(U2.r r19, int r20) throws q2.C6080L {
            /*
                Method dump skipped, instruction units count: 1764
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C5637e.c.i(U2.r, int):void");
        }

        public void j() {
            P p10 = this.f53150V;
            if (p10 != null) {
                p10.a(this.f53154Z, this.f53166k);
            }
        }

        public void n() {
            P p10 = this.f53150V;
            if (p10 != null) {
                p10.b();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", Integer.valueOf(SensibleDefaults.X_OFFSET));
        map.put("htc_video_rotA-270", 270);
        f53070l0 = Collections.unmodifiableMap(map);
    }

    public C5637e(r.a aVar, int i10) {
        this(new C5633a(), i10, aVar);
    }

    private static boolean B(String str) {
        str.getClass();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    private boolean D(I i10, long j10) {
        if (this.f53072B) {
            this.f53074D = j10;
            i10.f18917a = this.f53073C;
            this.f53072B = false;
            return true;
        }
        if (this.f53126y) {
            long j11 = this.f53074D;
            if (j11 != -1) {
                i10.f18917a = j11;
                this.f53074D = -1L;
                return true;
            }
        }
        return false;
    }

    private void E(InterfaceC2256q interfaceC2256q, int i10) {
        if (this.f53110i.j() >= i10) {
            return;
        }
        if (this.f53110i.b() < i10) {
            C6609I c6609i = this.f53110i;
            c6609i.d(Math.max(c6609i.b() * 2, i10));
        }
        interfaceC2256q.readFully(this.f53110i.f(), this.f53110i.j(), i10 - this.f53110i.j());
        this.f53110i.a0(i10);
    }

    private void F() {
        this.f53092V = 0;
        this.f53093W = 0;
        this.f53094X = 0;
        this.f53095Y = false;
        this.f53096Z = false;
        this.f53098a0 = false;
        this.f53100b0 = 0;
        this.f53102c0 = (byte) 0;
        this.f53104d0 = false;
        this.f53113l.X(0);
    }

    private long G(long j10) throws C6080L {
        long j11 = this.f53121t;
        if (j11 != -9223372036854775807L) {
            return a0.m1(j10, j11, 1000L);
        }
        throw C6080L.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void H(String str, long j10, byte[] bArr) {
        byte[] bArrV;
        int i10;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
                bArrV = v(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrV = v(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrV = v(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrV, 0, bArr, i10, bArrV.length);
    }

    private int K(InterfaceC2256q interfaceC2256q, c cVar, int i10, boolean z10) throws C6080L {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f53158c)) {
            L(interfaceC2256q, f53065g0, i10);
            return t();
        }
        if ("S_TEXT/ASS".equals(cVar.f53158c) || "S_TEXT/SSA".equals(cVar.f53158c)) {
            L(interfaceC2256q, f53067i0, i10);
            return t();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f53158c)) {
            L(interfaceC2256q, f53068j0, i10);
            return t();
        }
        O o10 = cVar.f53154Z;
        if (!this.f53095Y) {
            if (cVar.f53164i) {
                this.f53088R &= -1073741825;
                if (!this.f53096Z) {
                    interfaceC2256q.readFully(this.f53110i.f(), 0, 1);
                    this.f53092V++;
                    if ((this.f53110i.f()[0] & 128) == 128) {
                        throw C6080L.a("Extension bit is set in signal byte", null);
                    }
                    this.f53102c0 = this.f53110i.f()[0];
                    this.f53096Z = true;
                }
                byte b10 = this.f53102c0;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.f53088R |= 1073741824;
                    if (!this.f53104d0) {
                        interfaceC2256q.readFully(this.f53115n.f(), 0, 8);
                        this.f53092V += 8;
                        this.f53104d0 = true;
                        this.f53110i.f()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.f53110i.b0(0);
                        o10.g(this.f53110i, 1, 1);
                        this.f53093W++;
                        this.f53115n.b0(0);
                        o10.g(this.f53115n, 8, 1);
                        this.f53093W += 8;
                    }
                    if (z11) {
                        if (!this.f53098a0) {
                            interfaceC2256q.readFully(this.f53110i.f(), 0, 1);
                            this.f53092V++;
                            this.f53110i.b0(0);
                            this.f53100b0 = this.f53110i.M();
                            this.f53098a0 = true;
                        }
                        int i12 = this.f53100b0 * 4;
                        this.f53110i.X(i12);
                        interfaceC2256q.readFully(this.f53110i.f(), 0, i12);
                        this.f53092V += i12;
                        short s10 = (short) ((this.f53100b0 / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f53118q;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f53118q = ByteBuffer.allocate(i13);
                        }
                        this.f53118q.position(0);
                        this.f53118q.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.f53100b0;
                            if (i14 >= i11) {
                                break;
                            }
                            int iQ = this.f53110i.Q();
                            if (i14 % 2 == 0) {
                                this.f53118q.putShort((short) (iQ - i15));
                            } else {
                                this.f53118q.putInt(iQ - i15);
                            }
                            i14++;
                            i15 = iQ;
                        }
                        int i16 = (i10 - this.f53092V) - i15;
                        if (i11 % 2 == 1) {
                            this.f53118q.putInt(i16);
                        } else {
                            this.f53118q.putShort((short) i16);
                            this.f53118q.putInt(0);
                        }
                        this.f53116o.Z(this.f53118q.array(), i13);
                        o10.g(this.f53116o, i13, 1);
                        this.f53093W += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f53165j;
                if (bArr != null) {
                    this.f53113l.Z(bArr, bArr.length);
                }
            }
            if (cVar.o(z10)) {
                this.f53088R |= 268435456;
                this.f53117p.X(0);
                int iJ = (this.f53113l.j() + i10) - this.f53092V;
                this.f53110i.X(4);
                this.f53110i.f()[0] = (byte) ((iJ >> 24) & 255);
                this.f53110i.f()[1] = (byte) ((iJ >> 16) & 255);
                this.f53110i.f()[2] = (byte) ((iJ >> 8) & 255);
                this.f53110i.f()[3] = (byte) (iJ & 255);
                o10.g(this.f53110i, 4, 2);
                this.f53093W += 4;
            }
            this.f53095Y = true;
        }
        int iJ2 = i10 + this.f53113l.j();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f53158c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f53158c)) {
            if (cVar.f53150V != null) {
                AbstractC6614a.g(this.f53113l.j() == 0);
                cVar.f53150V.d(interfaceC2256q);
            }
            while (true) {
                int i17 = this.f53092V;
                if (i17 >= iJ2) {
                    break;
                }
                int iM = M(interfaceC2256q, o10, iJ2 - i17);
                this.f53092V += iM;
                this.f53093W += iM;
            }
        } else {
            byte[] bArrF = this.f53109h.f();
            bArrF[0] = 0;
            bArrF[1] = 0;
            bArrF[2] = 0;
            int i18 = cVar.f53156a0;
            int i19 = 4 - i18;
            while (this.f53092V < iJ2) {
                int i20 = this.f53094X;
                if (i20 == 0) {
                    N(interfaceC2256q, bArrF, i19, i18);
                    this.f53092V += i18;
                    this.f53109h.b0(0);
                    this.f53094X = this.f53109h.Q();
                    this.f53108g.b0(0);
                    o10.f(this.f53108g, 4);
                    this.f53093W += 4;
                } else {
                    int iM2 = M(interfaceC2256q, o10, i20);
                    this.f53092V += iM2;
                    this.f53093W += iM2;
                    this.f53094X -= iM2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f53158c)) {
            this.f53111j.b0(0);
            o10.f(this.f53111j, 4);
            this.f53093W += 4;
        }
        return t();
    }

    private void L(InterfaceC2256q interfaceC2256q, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f53114m.b() < length) {
            this.f53114m.Y(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f53114m.f(), 0, bArr.length);
        }
        interfaceC2256q.readFully(this.f53114m.f(), bArr.length, i10);
        this.f53114m.b0(0);
        this.f53114m.a0(length);
    }

    private int M(InterfaceC2256q interfaceC2256q, O o10, int i10) {
        int iA = this.f53113l.a();
        if (iA <= 0) {
            return o10.e(interfaceC2256q, i10, false);
        }
        int iMin = Math.min(i10, iA);
        o10.f(this.f53113l, iMin);
        return iMin;
    }

    private void N(InterfaceC2256q interfaceC2256q, byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, this.f53113l.a());
        interfaceC2256q.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f53113l.q(bArr, i10, iMin);
        }
    }

    public static /* synthetic */ InterfaceC2255p[] d() {
        return new InterfaceC2255p[]{new C5637e(r.a.f58521a, 2)};
    }

    private void k(int i10) throws C6080L {
        if (this.f53076F == null || this.f53077G == null) {
            throw C6080L.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private void m(int i10) throws C6080L {
        if (this.f53125x != null) {
            return;
        }
        throw C6080L.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    private void n() {
        AbstractC6614a.i(this.f53106e0);
    }

    private J p(C6636x c6636x, C6636x c6636x2) {
        int i10;
        if (this.f53120s == -1 || this.f53123v == -9223372036854775807L || c6636x == null || c6636x.d() == 0 || c6636x2 == null || c6636x2.d() != c6636x.d()) {
            return new J.b(this.f53123v);
        }
        int iD = c6636x.d();
        int[] iArrCopyOf = new int[iD];
        long[] jArrCopyOf = new long[iD];
        long[] jArrCopyOf2 = new long[iD];
        long[] jArrCopyOf3 = new long[iD];
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            jArrCopyOf3[i12] = c6636x.c(i12);
            jArrCopyOf[i12] = this.f53120s + c6636x2.c(i12);
        }
        while (true) {
            i10 = iD - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
            jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
            i11 = i13;
        }
        int i14 = i10;
        while (i14 > 0 && jArrCopyOf3[i14] > this.f53123v) {
            i14--;
        }
        iArrCopyOf[i14] = (int) ((this.f53120s + this.f53119r) - jArrCopyOf[i14]);
        jArrCopyOf2[i14] = this.f53123v - jArrCopyOf3[i14];
        if (i14 < i10) {
            AbstractC6635w.i("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
            int i15 = i14 + 1;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
        }
        return new C2246g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void q(m3.C5637e.c r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C5637e.q(m3.e$c, long, int, int, int):void");
    }

    private static int[] s(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int t() {
        int i10 = this.f53093W;
        F();
        return i10;
    }

    private static byte[] v(long j10, String str, long j11) {
        AbstractC6614a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        return a0.z0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    protected void A(int i10, long j10) throws C6080L {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw C6080L.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw C6080L.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                w(i10).f53160e = (int) j10;
                return;
            case 136:
                w(i10).f53152X = j10 == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.f53082L = G(j10);
                return;
            case 159:
                w(i10).f53145Q = (int) j10;
                return;
            case 176:
                w(i10).f53169n = (int) j10;
                return;
            case 179:
                k(i10);
                this.f53076F.a(G(j10));
                return;
            case 186:
                w(i10).f53170o = (int) j10;
                return;
            case JfifUtil.MARKER_RST7 /* 215 */:
                w(i10).f53159d = (int) j10;
                return;
            case 231:
                this.f53075E = G(j10);
                return;
            case 238:
                this.f53089S = (int) j10;
                return;
            case 241:
                if (this.f53078H) {
                    return;
                }
                k(i10);
                this.f53077G.a(j10);
                this.f53078H = true;
                return;
            case 251:
                this.f53090T = true;
                return;
            case 16871:
                w(i10).f53163h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw C6080L.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw C6080L.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw C6080L.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw C6080L.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw C6080L.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f53071A = j10 + this.f53120s;
                return;
            case 21432:
                int i11 = (int) j10;
                m(i10);
                if (i11 == 0) {
                    this.f53125x.f53180y = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f53125x.f53180y = 2;
                    return;
                } else if (i11 == 3) {
                    this.f53125x.f53180y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f53125x.f53180y = 3;
                    return;
                }
            case 21680:
                w(i10).f53172q = (int) j10;
                return;
            case 21682:
                w(i10).f53174s = (int) j10;
                return;
            case 21690:
                w(i10).f53173r = (int) j10;
                return;
            case 21930:
                w(i10).f53151W = j10 == 1;
                return;
            case 21938:
                m(i10);
                c cVar = this.f53125x;
                cVar.f53181z = true;
                cVar.f53171p = (int) j10;
                return;
            case 21998:
                w(i10).f53162g = (int) j10;
                return;
            case 22186:
                w(i10).f53148T = j10;
                return;
            case 22203:
                w(i10).f53149U = j10;
                return;
            case 25188:
                w(i10).f53146R = (int) j10;
                return;
            case 30114:
                this.f53091U = j10;
                return;
            case 30321:
                m(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f53125x.f53175t = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f53125x.f53175t = 1;
                    return;
                } else if (i12 == 2) {
                    this.f53125x.f53175t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f53125x.f53175t = 3;
                    return;
                }
            case 2352003:
                w(i10).f53161f = (int) j10;
                return;
            case 2807729:
                this.f53121t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        m(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f53125x.f53131C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f53125x.f53131C = 1;
                            return;
                        }
                    case 21946:
                        m(i10);
                        int iL = C6097l.l((int) j10);
                        if (iL != -1) {
                            this.f53125x.f53130B = iL;
                            return;
                        }
                        return;
                    case 21947:
                        m(i10);
                        this.f53125x.f53181z = true;
                        int iK = C6097l.k((int) j10);
                        if (iK != -1) {
                            this.f53125x.f53129A = iK;
                            return;
                        }
                        return;
                    case 21948:
                        w(i10).f53132D = (int) j10;
                        return;
                    case 21949:
                        w(i10).f53133E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    protected boolean C(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    protected void I(int i10, long j10, long j11) throws C6080L {
        n();
        if (i10 == 160) {
            this.f53090T = false;
            this.f53091U = 0L;
            return;
        }
        if (i10 == 174) {
            c cVar = new c();
            this.f53125x = cVar;
            cVar.f53155a = this.f53124w;
            return;
        }
        if (i10 == 187) {
            this.f53078H = false;
            return;
        }
        if (i10 == 19899) {
            this.f53127z = -1;
            this.f53071A = -1L;
            return;
        }
        if (i10 == 20533) {
            w(i10).f53164i = true;
            return;
        }
        if (i10 == 21968) {
            w(i10).f53181z = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f53120s;
            if (j12 != -1 && j12 != j10) {
                throw C6080L.a("Multiple Segment elements not supported", null);
            }
            this.f53120s = j10;
            this.f53119r = j11;
            return;
        }
        if (i10 == 475249515) {
            this.f53076F = new C6636x();
            this.f53077G = new C6636x();
        } else if (i10 == 524531317 && !this.f53126y) {
            if (this.f53103d && this.f53073C != -1) {
                this.f53072B = true;
            } else {
                this.f53106e0.t(new J.b(this.f53123v));
                this.f53126y = true;
            }
        }
    }

    protected void J(int i10, String str) throws C6080L {
        if (i10 == 134) {
            w(i10).f53158c = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                w(i10).f53157b = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                w(i10).f53153Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.f53124w = Objects.equals(str, "webm");
            return;
        }
        throw C6080L.a("DocType " + str + " not supported", null);
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        this.f53075E = -9223372036854775807L;
        this.f53080J = 0;
        this.f53097a.reset();
        this.f53099b.e();
        F();
        for (int i10 = 0; i10 < this.f53101c.size(); i10++) {
            ((c) this.f53101c.valueAt(i10)).n();
        }
    }

    @Override // U2.InterfaceC2255p
    public final void c(U2.r rVar) {
        if (this.f53105e) {
            rVar = new s(rVar, this.f53107f);
        }
        this.f53106e0 = rVar;
    }

    @Override // U2.InterfaceC2255p
    public final boolean f(InterfaceC2256q interfaceC2256q) {
        return new C5638f().b(interfaceC2256q);
    }

    @Override // U2.InterfaceC2255p
    public final int h(InterfaceC2256q interfaceC2256q, I i10) {
        this.f53079I = false;
        boolean zB = true;
        while (zB && !this.f53079I) {
            zB = this.f53097a.b(interfaceC2256q);
            if (zB && D(i10, interfaceC2256q.getPosition())) {
                return 1;
            }
        }
        if (zB) {
            return 0;
        }
        for (int i11 = 0; i11 < this.f53101c.size(); i11++) {
            c cVar = (c) this.f53101c.valueAt(i11);
            cVar.f();
            cVar.j();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void o(int i10, int i11, InterfaceC2256q interfaceC2256q) throws C6080L {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        InterfaceC2256q interfaceC2256q2 = interfaceC2256q;
        int i20 = 0;
        int i21 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.f53080J != 2) {
                    return;
                }
                z((c) this.f53101c.get(this.f53086P), this.f53089S, interfaceC2256q2, i11);
                return;
            }
            if (i10 == 16877) {
                y(w(i10), interfaceC2256q2, i11);
                return;
            }
            if (i10 == 16981) {
                m(i10);
                byte[] bArr = new byte[i11];
                this.f53125x.f53165j = bArr;
                interfaceC2256q2.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr2 = new byte[i11];
                interfaceC2256q2.readFully(bArr2, 0, i11);
                w(i10).f53166k = new O.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.f53112k.f(), (byte) 0);
                interfaceC2256q2.readFully(this.f53112k.f(), 4 - i11, i11);
                this.f53112k.b0(0);
                this.f53127z = (int) this.f53112k.O();
                return;
            }
            if (i10 == 25506) {
                m(i10);
                byte[] bArr3 = new byte[i11];
                this.f53125x.f53167l = bArr3;
                interfaceC2256q2.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw C6080L.a("Unexpected id: " + i10, null);
            }
            m(i10);
            byte[] bArr4 = new byte[i11];
            this.f53125x.f53179x = bArr4;
            interfaceC2256q2.readFully(bArr4, 0, i11);
            return;
        }
        int i22 = 8;
        if (this.f53080J == 0) {
            this.f53086P = (int) this.f53099b.d(interfaceC2256q2, false, true, 8);
            this.f53087Q = this.f53099b.b();
            this.f53082L = -9223372036854775807L;
            this.f53080J = 1;
            this.f53110i.X(0);
        }
        c cVar = (c) this.f53101c.get(this.f53086P);
        if (cVar == null) {
            interfaceC2256q2.m(i11 - this.f53087Q);
            this.f53080J = 0;
            return;
        }
        cVar.f();
        if (this.f53080J == 1) {
            E(interfaceC2256q2, 3);
            int i23 = (this.f53110i.f()[2] & 6) >> 1;
            if (i23 == 0) {
                this.f53084N = 1;
                int[] iArrS = s(this.f53085O, 1);
                this.f53085O = iArrS;
                iArrS[0] = (i11 - this.f53087Q) - 3;
            } else {
                E(interfaceC2256q2, 4);
                int i24 = (this.f53110i.f()[3] & 255) + 1;
                this.f53084N = i24;
                int[] iArrS2 = s(this.f53085O, i24);
                this.f53085O = iArrS2;
                if (i23 == 2) {
                    int i25 = (i11 - this.f53087Q) - 4;
                    int i26 = this.f53084N;
                    Arrays.fill(iArrS2, 0, i26, i25 / i26);
                } else {
                    if (i23 != 1) {
                        if (i23 != 3) {
                            throw C6080L.a("Unexpected lacing value: " + i23, null);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = 4;
                        while (true) {
                            int i30 = this.f53084N;
                            i12 = i21;
                            if (i27 >= i30 - 1) {
                                i13 = i20;
                                this.f53085O[i30 - 1] = ((i11 - this.f53087Q) - i29) - i28;
                                break;
                            }
                            this.f53085O[i27] = i20;
                            int i31 = i29 + 1;
                            E(interfaceC2256q2, i31);
                            if (this.f53110i.f()[i29] == 0) {
                                throw C6080L.a("No valid varint length mask found", null);
                            }
                            int i32 = i20;
                            while (true) {
                                if (i32 >= i22) {
                                    i14 = i20;
                                    i15 = i22;
                                    i16 = i27;
                                    j10 = 0;
                                    break;
                                }
                                i15 = i22;
                                int i33 = i12 << (7 - i32);
                                i14 = i20;
                                if ((this.f53110i.f()[i29] & i33) != 0) {
                                    i31 += i32;
                                    E(interfaceC2256q2, i31);
                                    int i34 = i29 + 1;
                                    j10 = this.f53110i.f()[i29] & 255 & (~i33);
                                    while (true) {
                                        int i35 = i34;
                                        if (i35 >= i31) {
                                            break;
                                        }
                                        i34 = i35 + 1;
                                        j10 = (j10 << i15) | ((long) (this.f53110i.f()[i35] & 255));
                                        i27 = i27;
                                    }
                                    i16 = i27;
                                    if (i16 > 0) {
                                        j10 -= (1 << ((i32 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i32++;
                                    interfaceC2256q2 = interfaceC2256q;
                                    i20 = i14;
                                    i22 = i15;
                                }
                            }
                            i29 = i31;
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i36 = (int) j10;
                            int[] iArr = this.f53085O;
                            if (i16 != 0) {
                                i36 += iArr[i16 - 1];
                            }
                            iArr[i16] = i36;
                            i28 += i36;
                            i27 = i16 + 1;
                            interfaceC2256q2 = interfaceC2256q;
                            i21 = i12;
                            i20 = i14;
                            i22 = i15;
                        }
                        throw C6080L.a("EBML lacing sample size out of range.", null);
                    }
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 4;
                    while (true) {
                        i17 = this.f53084N;
                        if (i37 >= i17 - 1) {
                            break;
                        }
                        this.f53085O[i37] = 0;
                        while (true) {
                            i18 = i39 + 1;
                            E(interfaceC2256q2, i18);
                            int i40 = this.f53110i.f()[i39] & 255;
                            int[] iArr2 = this.f53085O;
                            i19 = iArr2[i37] + i40;
                            iArr2[i37] = i19;
                            if (i40 != 255) {
                                break;
                            } else {
                                i39 = i18;
                            }
                        }
                        i38 += i19;
                        i37++;
                        i39 = i18;
                    }
                    this.f53085O[i17 - 1] = ((i11 - this.f53087Q) - i39) - i38;
                }
            }
            i13 = 0;
            i12 = 1;
            this.f53081K = this.f53075E + G((this.f53110i.f()[i13] << 8) | (this.f53110i.f()[i12] & 255));
            this.f53088R = (cVar.f53160e == 2 || (i10 == 163 && (this.f53110i.f()[2] & 128) == 128)) ? i12 : i13;
            this.f53080J = 2;
            this.f53083M = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i41 = this.f53083M;
                if (i41 >= this.f53084N) {
                    this.f53080J = 0;
                    return;
                }
                int iK = K(interfaceC2256q, cVar, this.f53085O[i41], false);
                c cVar2 = cVar;
                q(cVar2, this.f53081K + ((long) ((this.f53083M * cVar.f53161f) / 1000)), this.f53088R, iK, 0);
                this.f53083M++;
                cVar = cVar2;
            }
        } else {
            while (true) {
                int i42 = this.f53083M;
                if (i42 >= this.f53084N) {
                    return;
                }
                int[] iArr3 = this.f53085O;
                boolean z10 = i12;
                iArr3[i42] = K(interfaceC2256q, cVar, iArr3[i42], z10);
                this.f53083M += z10 ? 1 : 0;
            }
        }
    }

    protected void r(int i10) throws C6080L {
        n();
        if (i10 == 160) {
            if (this.f53080J != 2) {
                return;
            }
            c cVar = (c) this.f53101c.get(this.f53086P);
            cVar.f();
            if (this.f53091U > 0 && "A_OPUS".equals(cVar.f53158c)) {
                this.f53117p.Y(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f53091U).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f53084N; i12++) {
                i11 += this.f53085O[i12];
            }
            int i13 = 0;
            while (i13 < this.f53084N) {
                long j10 = this.f53081K + ((long) ((cVar.f53161f * i13) / 1000));
                int i14 = this.f53088R;
                if (i13 == 0 && !this.f53090T) {
                    i14 |= 1;
                }
                int i15 = this.f53085O[i13];
                int i16 = i11 - i15;
                q(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.f53080J = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) AbstractC6614a.i(this.f53125x);
            String str = cVar2.f53158c;
            if (str == null) {
                throw C6080L.a("CodecId is missing in TrackEntry element", null);
            }
            if (B(str)) {
                cVar2.i(this.f53106e0, cVar2.f53159d);
                this.f53101c.put(cVar2.f53159d, cVar2);
            }
            this.f53125x = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f53127z;
            if (i17 != -1) {
                long j11 = this.f53071A;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.f53073C = j11;
                        return;
                    }
                    return;
                }
            }
            throw C6080L.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            m(i10);
            c cVar3 = this.f53125x;
            if (cVar3.f53164i) {
                if (cVar3.f53166k == null) {
                    throw C6080L.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f53168m = new C6102q(new C6102q.b(AbstractC6096k.f56893a, "video/webm", this.f53125x.f53166k.f18935b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            m(i10);
            c cVar4 = this.f53125x;
            if (cVar4.f53164i && cVar4.f53165j != null) {
                throw C6080L.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f53121t == -9223372036854775807L) {
                this.f53121t = 1000000L;
            }
            long j12 = this.f53122u;
            if (j12 != -9223372036854775807L) {
                this.f53123v = G(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f53101c.size() == 0) {
                throw C6080L.a("No valid tracks were found", null);
            }
            this.f53106e0.p();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f53126y) {
                this.f53106e0.t(p(this.f53076F, this.f53077G));
                this.f53126y = true;
            }
            this.f53076F = null;
            this.f53077G = null;
        }
    }

    protected void u(int i10, double d10) {
        if (i10 == 181) {
            w(i10).f53147S = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f53122u = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                w(i10).f53134F = (float) d10;
                break;
            case 21970:
                w(i10).f53135G = (float) d10;
                break;
            case 21971:
                w(i10).f53136H = (float) d10;
                break;
            case 21972:
                w(i10).f53137I = (float) d10;
                break;
            case 21973:
                w(i10).f53138J = (float) d10;
                break;
            case 21974:
                w(i10).f53139K = (float) d10;
                break;
            case 21975:
                w(i10).f53140L = (float) d10;
                break;
            case 21976:
                w(i10).f53141M = (float) d10;
                break;
            case 21977:
                w(i10).f53142N = (float) d10;
                break;
            case 21978:
                w(i10).f53143O = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        w(i10).f53176u = (float) d10;
                        break;
                    case 30324:
                        w(i10).f53177v = (float) d10;
                        break;
                    case 30325:
                        w(i10).f53178w = (float) d10;
                        break;
                }
                break;
        }
    }

    protected c w(int i10) throws C6080L {
        m(i10);
        return this.f53125x;
    }

    protected int x(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 159:
            case 176:
            case 179:
            case 186:
            case JfifUtil.MARKER_RST7 /* 215 */:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case JfifUtil.MARKER_APP1 /* 225 */:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void y(c cVar, InterfaceC2256q interfaceC2256q, int i10) {
        if (cVar.f53163h != 1685485123 && cVar.f53163h != 1685480259) {
            interfaceC2256q.m(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.f53144P = bArr;
        interfaceC2256q.readFully(bArr, 0, i10);
    }

    protected void z(c cVar, int i10, InterfaceC2256q interfaceC2256q, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f53158c)) {
            interfaceC2256q.m(i11);
        } else {
            this.f53117p.X(i11);
            interfaceC2256q.readFully(this.f53117p.f(), 0, i11);
        }
    }

    C5637e(InterfaceC5635c interfaceC5635c, int i10, r.a aVar) {
        this.f53120s = -1L;
        this.f53121t = -9223372036854775807L;
        this.f53122u = -9223372036854775807L;
        this.f53123v = -9223372036854775807L;
        this.f53073C = -1L;
        this.f53074D = -1L;
        this.f53075E = -9223372036854775807L;
        this.f53097a = interfaceC5635c;
        interfaceC5635c.a(new b());
        this.f53107f = aVar;
        this.f53103d = (i10 & 1) == 0;
        this.f53105e = (i10 & 2) == 0;
        this.f53099b = new C5639g();
        this.f53101c = new SparseArray();
        this.f53110i = new C6609I(4);
        this.f53111j = new C6609I(ByteBuffer.allocate(4).putInt(-1).array());
        this.f53112k = new C6609I(4);
        this.f53108g = new C6609I(AbstractC6726h.f61236a);
        this.f53109h = new C6609I(4);
        this.f53113l = new C6609I();
        this.f53114m = new C6609I();
        this.f53115n = new C6609I(8);
        this.f53116o = new C6609I();
        this.f53117p = new C6609I();
        this.f53085O = new int[1];
    }

    @Override // U2.InterfaceC2255p
    public final void a() {
    }
}
