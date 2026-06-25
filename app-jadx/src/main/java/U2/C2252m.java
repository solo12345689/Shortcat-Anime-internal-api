package U2;

import B3.C1084b;
import B3.C1087e;
import B3.C1090h;
import B3.C1092j;
import P9.AbstractC2011u;
import a3.C2562c;
import android.net.Uri;
import b3.C2983a;
import c3.C3068a;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.C5637e;
import p3.C5923d;
import q2.AbstractC6104s;
import q3.C6112a;
import r3.r;

/* JADX INFO: renamed from: U2.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2252m implements u {

    /* JADX INFO: renamed from: s */
    private static final int[] f19053s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: t */
    private static final a f19054t = new a(new a.InterfaceC0324a() { // from class: U2.k
        @Override // U2.C2252m.a.InterfaceC0324a
        public final Constructor a() {
            return C2252m.l();
        }
    });

    /* JADX INFO: renamed from: u */
    private static final a f19055u = new a(new a.InterfaceC0324a() { // from class: U2.l
        @Override // U2.C2252m.a.InterfaceC0324a
        public final Constructor a() {
            return C2252m.m();
        }
    });

    /* JADX INFO: renamed from: b */
    private boolean f19056b;

    /* JADX INFO: renamed from: c */
    private boolean f19057c;

    /* JADX INFO: renamed from: d */
    private int f19058d;

    /* JADX INFO: renamed from: e */
    private int f19059e;

    /* JADX INFO: renamed from: f */
    private int f19060f;

    /* JADX INFO: renamed from: g */
    private int f19061g;

    /* JADX INFO: renamed from: h */
    private int f19062h;

    /* JADX INFO: renamed from: i */
    private int f19063i;

    /* JADX INFO: renamed from: j */
    private int f19064j;

    /* JADX INFO: renamed from: l */
    private int f19066l;

    /* JADX INFO: renamed from: m */
    private AbstractC2011u f19067m;

    /* JADX INFO: renamed from: q */
    private int f19071q;

    /* JADX INFO: renamed from: r */
    private int f19072r;

    /* JADX INFO: renamed from: k */
    private int f19065k = 1;

    /* JADX INFO: renamed from: n */
    private int f19068n = 112800;

    /* JADX INFO: renamed from: p */
    private r.a f19070p = new r3.g();

    /* JADX INFO: renamed from: o */
    private boolean f19069o = true;

    /* JADX INFO: renamed from: U2.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC0324a f19073a;

        /* JADX INFO: renamed from: b */
        private final AtomicBoolean f19074b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c */
        private Constructor f19075c;

        /* JADX INFO: renamed from: U2.m$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public interface InterfaceC0324a {
            Constructor a();
        }

        public a(InterfaceC0324a interfaceC0324a) {
            this.f19073a = interfaceC0324a;
        }

        private Constructor b() {
            synchronized (this.f19074b) {
                if (this.f19074b.get()) {
                    return this.f19075c;
                }
                try {
                    return this.f19073a.a();
                } catch (ClassNotFoundException unused) {
                    this.f19074b.set(true);
                    return this.f19075c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public InterfaceC2255p a(Object... objArr) {
            Constructor constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return (InterfaceC2255p) constructorB.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void i(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new C1084b());
                break;
            case 1:
                list.add(new C1087e());
                break;
            case 2:
                list.add(new C1090h((this.f19057c ? 2 : 0) | this.f19058d | (this.f19056b ? 1 : 0)));
                break;
            case 3:
                list.add(new V2.b((this.f19057c ? 2 : 0) | this.f19059e | (this.f19056b ? 1 : 0)));
                break;
            case 4:
                InterfaceC2255p interfaceC2255pA = f19054t.a(Integer.valueOf(this.f19060f));
                if (interfaceC2255pA == null) {
                    list.add(new Z2.d(this.f19060f));
                } else {
                    list.add(interfaceC2255pA);
                }
                break;
            case 5:
                list.add(new C2562c());
                break;
            case 6:
                list.add(new C5637e(this.f19070p, (this.f19069o ? 0 : 2) | this.f19061g));
                break;
            case 7:
                list.add(new n3.f((this.f19057c ? 2 : 0) | this.f19064j | (this.f19056b ? 1 : 0)));
                break;
            case 8:
                list.add(new o3.h(this.f19070p, this.f19063i | o3.h.k(this.f19071q) | (this.f19069o ? 0 : 32)));
                list.add(new o3.n(this.f19070p, (this.f19069o ? 0 : 16) | this.f19062h | o3.n.t(this.f19071q)));
                break;
            case 9:
                list.add(new C5923d());
                break;
            case 10:
                list.add(new B3.C());
                break;
            case 11:
                if (this.f19067m == null) {
                    this.f19067m = AbstractC2011u.A();
                }
                list.add(new B3.K(this.f19065k, !this.f19069o ? 1 : 0, this.f19070p, new t2.O(0L), new C1092j(this.f19066l, this.f19067m), this.f19068n));
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                list.add(new C3.b());
                break;
            case 14:
                list.add(new C3068a(this.f19072r));
                break;
            case 15:
                InterfaceC2255p interfaceC2255pA2 = f19055u.a(new Object[0]);
                if (interfaceC2255pA2 != null) {
                    list.add(interfaceC2255pA2);
                }
                break;
            case 16:
                list.add(new W2.b(!this.f19069o ? 1 : 0, this.f19070p));
                break;
            case 17:
                list.add(new C6112a());
                break;
            case 18:
                list.add(new D3.a());
                break;
            case 19:
                list.add(new Y2.a());
                break;
            case 20:
                int i11 = this.f19062h;
                if ((i11 & 2) == 0 && (i11 & 4) == 0) {
                    list.add(new C2983a());
                    break;
                }
                break;
            case 21:
                list.add(new X2.a());
                break;
        }
    }

    public static Constructor l() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC2255p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    public static Constructor m() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC2255p.class).getConstructor(null);
    }

    @Override // U2.u
    public synchronized InterfaceC2255p[] d(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f19053s;
            arrayList = new ArrayList(iArr.length);
            int iB = AbstractC6104s.b(map);
            if (iB != -1) {
                i(iB, arrayList);
            }
            int iC = AbstractC6104s.c(uri);
            if (iC != -1 && iC != iB) {
                i(iC, arrayList);
            }
            for (int i10 : iArr) {
                if (i10 != iB && i10 != iC) {
                    i(i10, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (InterfaceC2255p[]) arrayList.toArray(new InterfaceC2255p[0]);
    }

    @Override // U2.u
    public synchronized InterfaceC2255p[] f() {
        return d(Uri.EMPTY, new HashMap());
    }

    @Override // U2.u
    /* JADX INFO: renamed from: j */
    public synchronized C2252m b(int i10) {
        this.f19071q = i10;
        return this;
    }

    @Override // U2.u
    /* JADX INFO: renamed from: k */
    public synchronized C2252m c(boolean z10) {
        this.f19069o = z10;
        return this;
    }

    public synchronized C2252m n(int i10) {
        this.f19072r = i10;
        return this;
    }

    @Override // U2.u
    /* JADX INFO: renamed from: o */
    public synchronized C2252m a(r.a aVar) {
        this.f19070p = aVar;
        return this;
    }
}
