package z6;

import K6.b;
import Td.AbstractC2163n;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import com.facebook.imagepipeline.producers.C3181a;
import com.facebook.imagepipeline.producers.C3187g;
import com.facebook.imagepipeline.producers.C3188h;
import com.facebook.imagepipeline.producers.C3189i;
import com.facebook.imagepipeline.producers.C3191k;
import com.facebook.imagepipeline.producers.C3192l;
import com.facebook.imagepipeline.producers.C3195o;
import com.facebook.imagepipeline.producers.C3196p;
import com.facebook.imagepipeline.producers.C3198s;
import com.facebook.imagepipeline.producers.C3201v;
import com.facebook.imagepipeline.producers.C3202w;
import com.facebook.imagepipeline.producers.C3204y;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.r0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u0;
import ie.InterfaceC5082a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class W {

    /* JADX INFO: renamed from: K */
    public static final a f65661K = new a(null);

    /* JADX INFO: renamed from: A */
    private final Lazy f65662A;

    /* JADX INFO: renamed from: B */
    private final Lazy f65663B;

    /* JADX INFO: renamed from: C */
    private final Lazy f65664C;

    /* JADX INFO: renamed from: D */
    private final Lazy f65665D;

    /* JADX INFO: renamed from: E */
    private final Lazy f65666E;

    /* JADX INFO: renamed from: F */
    private final Lazy f65667F;

    /* JADX INFO: renamed from: G */
    private final Lazy f65668G;

    /* JADX INFO: renamed from: H */
    private final Lazy f65669H;

    /* JADX INFO: renamed from: I */
    private final Lazy f65670I;

    /* JADX INFO: renamed from: J */
    private final Lazy f65671J;

    /* JADX INFO: renamed from: a */
    private final ContentResolver f65672a;

    /* JADX INFO: renamed from: b */
    private final C f65673b;

    /* JADX INFO: renamed from: c */
    private final X f65674c;

    /* JADX INFO: renamed from: d */
    private final boolean f65675d;

    /* JADX INFO: renamed from: e */
    private final boolean f65676e;

    /* JADX INFO: renamed from: f */
    private final p0 f65677f;

    /* JADX INFO: renamed from: g */
    private final EnumC7300n f65678g;

    /* JADX INFO: renamed from: h */
    private final boolean f65679h;

    /* JADX INFO: renamed from: i */
    private final boolean f65680i;

    /* JADX INFO: renamed from: j */
    private final boolean f65681j;

    /* JADX INFO: renamed from: k */
    private final M6.d f65682k;

    /* JADX INFO: renamed from: l */
    private final boolean f65683l;

    /* JADX INFO: renamed from: m */
    private final boolean f65684m;

    /* JADX INFO: renamed from: n */
    private final boolean f65685n;

    /* JADX INFO: renamed from: o */
    private final Set f65686o;

    /* JADX INFO: renamed from: p */
    private Map f65687p;

    /* JADX INFO: renamed from: q */
    private Map f65688q;

    /* JADX INFO: renamed from: r */
    private Map f65689r;

    /* JADX INFO: renamed from: s */
    private final Lazy f65690s;

    /* JADX INFO: renamed from: t */
    private final Lazy f65691t;

    /* JADX INFO: renamed from: u */
    private final Lazy f65692u;

    /* JADX INFO: renamed from: v */
    private final Lazy f65693v;

    /* JADX INFO: renamed from: w */
    private final Lazy f65694w;

    /* JADX INFO: renamed from: x */
    private final Lazy f65695x;

    /* JADX INFO: renamed from: y */
    private final Lazy f65696y;

    /* JADX INFO: renamed from: z */
    private final Lazy f65697z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String c(Uri uri) {
            String string = uri.toString();
            AbstractC5504s.g(string, "toString(...)");
            if (string.length() <= 30) {
                return string;
            }
            String strSubstring = string.substring(0, 30);
            AbstractC5504s.g(strSubstring, "substring(...)");
            return strSubstring + "...";
        }

        public final void d(K6.b bVar) {
            y5.k.b(Boolean.valueOf(bVar.k().b() <= b.c.ENCODED_MEMORY_CACHE.b()));
        }

        private a() {
        }
    }

    public W(ContentResolver contentResolver, C producerFactory, X networkFetcher, boolean z10, boolean z11, p0 threadHandoffProducerQueue, EnumC7300n downsampleMode, boolean z12, boolean z13, boolean z14, M6.d imageTranscoderFactory, boolean z15, boolean z16, boolean z17, Set set) {
        AbstractC5504s.h(contentResolver, "contentResolver");
        AbstractC5504s.h(producerFactory, "producerFactory");
        AbstractC5504s.h(networkFetcher, "networkFetcher");
        AbstractC5504s.h(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        AbstractC5504s.h(downsampleMode, "downsampleMode");
        AbstractC5504s.h(imageTranscoderFactory, "imageTranscoderFactory");
        this.f65672a = contentResolver;
        this.f65673b = producerFactory;
        this.f65674c = networkFetcher;
        this.f65675d = z10;
        this.f65676e = z11;
        this.f65677f = threadHandoffProducerQueue;
        this.f65678g = downsampleMode;
        this.f65679h = z12;
        this.f65680i = z13;
        this.f65681j = z14;
        this.f65682k = imageTranscoderFactory;
        this.f65683l = z15;
        this.f65684m = z16;
        this.f65685n = z17;
        this.f65686o = set;
        this.f65687p = new LinkedHashMap();
        this.f65688q = new LinkedHashMap();
        this.f65689r = new LinkedHashMap();
        this.f65690s = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.D
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.b0(this.f65643a);
            }
        });
        this.f65691t = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.V
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.V(this.f65660a);
            }
        });
        this.f65692u = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.E
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.T(this.f65644a);
            }
        });
        this.f65693v = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.F
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.c0(this.f65645a);
            }
        });
        this.f65694w = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.G
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.u(this.f65646a);
            }
        });
        this.f65695x = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.H
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.d0(this.f65647a);
            }
        });
        this.f65696y = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.I
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.v(this.f65648a);
            }
        });
        this.f65697z = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.J
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.W(this.f65649a);
            }
        });
        this.f65662A = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.K
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.t(this.f65650a);
            }
        });
        this.f65663B = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.L
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.s(this.f65651a);
            }
        });
        this.f65664C = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.M
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.X(this.f65652a);
            }
        });
        this.f65665D = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.N
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.a0(this.f65653a);
            }
        });
        this.f65666E = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.O
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.U(this.f65654a);
            }
        });
        this.f65667F = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.P
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.Z(this.f65655a);
            }
        });
        this.f65668G = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.Q
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.n0(this.f65656a);
            }
        });
        this.f65669H = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.S
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.Y(this.f65657a);
            }
        });
        this.f65670I = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.T
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.S(this.f65658a);
            }
        });
        this.f65671J = AbstractC2163n.b(new InterfaceC5082a() { // from class: z6.U
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return W.w(this.f65659a);
            }
        });
    }

    private final d0 A(K6.b bVar) {
        d0 d0VarO;
        if (!L6.b.d()) {
            Uri uriV = bVar.v();
            AbstractC5504s.g(uriV, "getSourceUri(...)");
            if (uriV == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int iW = bVar.w();
            if (iW == 0) {
                return O();
            }
            switch (iW) {
                case 2:
                    return bVar.i() ? M() : N();
                case 3:
                    return bVar.i() ? M() : K();
                case 4:
                    return bVar.i() ? M() : A5.a.c(this.f65672a.getType(uriV)) ? N() : I();
                case 5:
                    return H();
                case 6:
                    return L();
                case 7:
                    return D();
                case 8:
                    return R();
                default:
                    Set set = this.f65686o;
                    if (set != null) {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            android.support.v4.media.session.b.a(it.next());
                            throw null;
                        }
                    }
                    throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + f65661K.c(uriV));
            }
        }
        L6.b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
        try {
            Uri uriV2 = bVar.v();
            AbstractC5504s.g(uriV2, "getSourceUri(...)");
            if (uriV2 == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int iW2 = bVar.w();
            if (iW2 != 0) {
                switch (iW2) {
                    case 2:
                        if (bVar.i()) {
                            d0 d0VarM = M();
                            L6.b.b();
                            return d0VarM;
                        }
                        d0VarO = N();
                        break;
                    case 3:
                        if (bVar.i()) {
                            d0 d0VarM2 = M();
                            L6.b.b();
                            return d0VarM2;
                        }
                        d0VarO = K();
                        break;
                    case 4:
                        if (bVar.i()) {
                            d0 d0VarM3 = M();
                            L6.b.b();
                            return d0VarM3;
                        }
                        if (A5.a.c(this.f65672a.getType(uriV2))) {
                            d0 d0VarN = N();
                            L6.b.b();
                            return d0VarN;
                        }
                        d0VarO = I();
                        break;
                    case 5:
                        d0VarO = H();
                        break;
                    case 6:
                        d0VarO = L();
                        break;
                    case 7:
                        d0VarO = D();
                        break;
                    case 8:
                        d0VarO = R();
                        break;
                    default:
                        Set set2 = this.f65686o;
                        if (set2 != null) {
                            Iterator it2 = set2.iterator();
                            if (it2.hasNext()) {
                                android.support.v4.media.session.b.a(it2.next());
                                throw null;
                            }
                        }
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + f65661K.c(uriV2));
                }
            } else {
                d0VarO = O();
            }
            L6.b.b();
            return d0VarO;
        } catch (Throwable th2) {
            L6.b.b();
            throw th2;
        }
    }

    private final synchronized d0 B(d0 d0Var) {
        d0 d0VarF;
        d0VarF = (d0) this.f65689r.get(d0Var);
        if (d0VarF == null) {
            d0VarF = this.f65673b.f(d0Var);
            this.f65689r.put(d0Var, d0VarF);
        }
        return d0VarF;
    }

    private final synchronized d0 F(d0 d0Var) {
        C3198s c3198sK;
        c3198sK = this.f65673b.k(d0Var);
        AbstractC5504s.g(c3198sK, "newDelayProducer(...)");
        return c3198sK;
    }

    private final synchronized d0 Q(d0 d0Var) {
        d0 d0VarA;
        d0VarA = (d0) this.f65687p.get(d0Var);
        if (d0VarA == null) {
            b0 b0VarB = this.f65673b.B(d0Var);
            AbstractC5504s.g(b0VarB, "newPostprocessorProducer(...)");
            d0VarA = this.f65673b.A(b0VarB);
            this.f65687p.put(d0Var, d0VarA);
        }
        return d0VarA;
    }

    public static final d0 S(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        com.facebook.imagepipeline.producers.H hQ = this$0.f65673b.q();
        AbstractC5504s.g(hQ, "newLocalAssetFetchProducer(...)");
        return this$0.g0(hQ);
    }

    public static final j0 T(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        if (!L6.b.d()) {
            return new j0(this$0.x());
        }
        L6.b.a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
        try {
            return new j0(this$0.x());
        } finally {
            L6.b.b();
        }
    }

    public static final d0 U(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        com.facebook.imagepipeline.producers.I iR = this$0.f65673b.r();
        AbstractC5504s.g(iR, "newLocalContentUriFetchProducer(...)");
        return this$0.h0(iR, new u0[]{this$0.f65673b.s(), this$0.f65673b.t()});
    }

    public static final j0 V(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        if (!L6.b.d()) {
            return new j0(this$0.y());
        }
        L6.b.a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
        try {
            return new j0(this$0.y());
        } finally {
            L6.b.b();
        }
    }

    public static final n0 W(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        if (!L6.b.d()) {
            return this$0.f65673b.E(this$0.y());
        }
        L6.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
        try {
            return this$0.f65673b.E(this$0.y());
        } finally {
            L6.b.b();
        }
    }

    public static final d0 X(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        com.facebook.imagepipeline.producers.M mU = this$0.f65673b.u();
        AbstractC5504s.g(mU, "newLocalFileFetchProducer(...)");
        return this$0.g0(mU);
    }

    public static final d0 Y(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        com.facebook.imagepipeline.producers.N nV = this$0.f65673b.v();
        AbstractC5504s.g(nV, "newLocalResourceFetchProducer(...)");
        return this$0.g0(nV);
    }

    public static final d0 Z(W this$0) throws Throwable {
        AbstractC5504s.h(this$0, "this$0");
        if (Build.VERSION.SDK_INT < 29) {
            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
        }
        com.facebook.imagepipeline.producers.S sW = this$0.f65673b.w();
        AbstractC5504s.g(sW, "newLocalThumbnailBitmapSdk29Producer(...)");
        return this$0.e0(sW);
    }

    public static final d0 a0(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        com.facebook.imagepipeline.producers.T tX = this$0.f65673b.x();
        AbstractC5504s.g(tX, "newLocalVideoThumbnailProducer(...)");
        return this$0.e0(tX);
    }

    public static final j0 b0(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        if (!L6.b.d()) {
            return new j0(this$0.z());
        }
        L6.b.a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
        try {
            return new j0(this$0.z());
        } finally {
            L6.b.b();
        }
    }

    public static final d0 c0(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        if (!L6.b.d()) {
            return this$0.f0(this$0.C());
        }
        L6.b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
        try {
            return this$0.f0(this$0.C());
        } finally {
            L6.b.b();
        }
    }

    public static final n0 d0(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        if (!L6.b.d()) {
            return this$0.f65673b.E(this$0.z());
        }
        L6.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        try {
            return this$0.f65673b.E(this$0.z());
        } finally {
            L6.b.b();
        }
    }

    private final d0 e0(d0 d0Var) {
        C3189i c3189iE = this.f65673b.e(d0Var);
        AbstractC5504s.g(c3189iE, "newBitmapMemoryCacheProducer(...)");
        C3188h c3188hD = this.f65673b.d(c3189iE);
        AbstractC5504s.g(c3188hD, "newBitmapMemoryCacheKeyMultiplexProducer(...)");
        d0 d0VarB = this.f65673b.b(c3188hD, this.f65677f);
        AbstractC5504s.g(d0VarB, "newBackgroundThreadHandoffProducer(...)");
        if (!this.f65683l && !this.f65684m) {
            C3187g c3187gC = this.f65673b.c(d0VarB);
            AbstractC5504s.g(c3187gC, "newBitmapMemoryCacheGetProducer(...)");
            return c3187gC;
        }
        C3187g c3187gC2 = this.f65673b.c(d0VarB);
        AbstractC5504s.g(c3187gC2, "newBitmapMemoryCacheGetProducer(...)");
        C3191k c3191kG = this.f65673b.g(c3187gC2);
        AbstractC5504s.g(c3191kG, "newBitmapProbeProducer(...)");
        return c3191kG;
    }

    private final d0 g0(d0 d0Var) {
        return h0(d0Var, new u0[]{this.f65673b.t()});
    }

    private final d0 h0(d0 d0Var, u0[] u0VarArr) {
        return f0(m0(k0(d0Var), u0VarArr));
    }

    private final d0 j0(d0 d0Var) {
        C3202w c3202wM;
        C3202w c3202wM2;
        if (!L6.b.d()) {
            if (this.f65680i) {
                Y yZ = this.f65673b.z(d0Var);
                AbstractC5504s.g(yZ, "newPartialDiskCacheProducer(...)");
                c3202wM2 = this.f65673b.m(yZ);
            } else {
                c3202wM2 = this.f65673b.m(d0Var);
            }
            AbstractC5504s.e(c3202wM2);
            C3201v c3201vL = this.f65673b.l(c3202wM2);
            AbstractC5504s.g(c3201vL, "newDiskCacheReadProducer(...)");
            return c3201vL;
        }
        L6.b.a("ProducerSequenceFactory#newDiskCacheSequence");
        try {
            if (this.f65680i) {
                Y yZ2 = this.f65673b.z(d0Var);
                AbstractC5504s.g(yZ2, "newPartialDiskCacheProducer(...)");
                c3202wM = this.f65673b.m(yZ2);
            } else {
                c3202wM = this.f65673b.m(d0Var);
            }
            AbstractC5504s.e(c3202wM);
            C3201v c3201vL2 = this.f65673b.l(c3202wM);
            AbstractC5504s.g(c3201vL2, "newDiskCacheReadProducer(...)");
            L6.b.b();
            return c3201vL2;
        } catch (Throwable th2) {
            L6.b.b();
            throw th2;
        }
    }

    private final d0 k0(d0 d0Var) {
        if (this.f65681j) {
            d0Var = j0(d0Var);
        }
        d0 d0VarO = this.f65673b.o(d0Var);
        AbstractC5504s.g(d0VarO, "newEncodedMemoryCacheProducer(...)");
        if (!this.f65684m) {
            C3204y c3204yN = this.f65673b.n(d0VarO);
            AbstractC5504s.g(c3204yN, "newEncodedCacheKeyMultiplexProducer(...)");
            return c3204yN;
        }
        com.facebook.imagepipeline.producers.A aP = this.f65673b.p(d0VarO);
        AbstractC5504s.g(aP, "newEncodedProbeProducer(...)");
        C3204y c3204yN2 = this.f65673b.n(aP);
        AbstractC5504s.g(c3204yN2, "newEncodedCacheKeyMultiplexProducer(...)");
        return c3204yN2;
    }

    private final d0 l0(u0[] u0VarArr) {
        t0 t0VarG = this.f65673b.G(u0VarArr);
        AbstractC5504s.g(t0VarG, "newThumbnailBranchProducer(...)");
        k0 k0VarD = this.f65673b.D(t0VarG, true, this.f65682k);
        AbstractC5504s.g(k0VarD, "newResizeAndRotateProducer(...)");
        return k0VarD;
    }

    private final d0 m0(d0 d0Var, u0[] u0VarArr) {
        C3181a c3181aA = C.a(d0Var);
        AbstractC5504s.g(c3181aA, "newAddImageTransformMetaDataProducer(...)");
        r0 r0VarF = this.f65673b.F(this.f65673b.D(c3181aA, true, this.f65682k));
        AbstractC5504s.g(r0VarF, "newThrottlingProducer(...)");
        C3192l c3192lH = C.h(l0(u0VarArr), r0VarF);
        AbstractC5504s.g(c3192lH, "newBranchOnSeparateImagesProducer(...)");
        return c3192lH;
    }

    public static final d0 n0(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        i0 i0VarC = this$0.f65673b.C();
        AbstractC5504s.g(i0VarC, "newQualifiedResourceFetchProducer(...)");
        return this$0.g0(i0VarC);
    }

    public static final d0 s(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        if (!L6.b.d()) {
            com.facebook.imagepipeline.producers.I iR = this$0.f65673b.r();
            AbstractC5504s.g(iR, "newLocalContentUriFetchProducer(...)");
            return this$0.f65673b.b(this$0.k0(iR), this$0.f65677f);
        }
        L6.b.a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
        try {
            com.facebook.imagepipeline.producers.I iR2 = this$0.f65673b.r();
            AbstractC5504s.g(iR2, "newLocalContentUriFetchProducer(...)");
            return this$0.f65673b.b(this$0.k0(iR2), this$0.f65677f);
        } finally {
            L6.b.b();
        }
    }

    public static final d0 t(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        if (!L6.b.d()) {
            com.facebook.imagepipeline.producers.M mU = this$0.f65673b.u();
            AbstractC5504s.g(mU, "newLocalFileFetchProducer(...)");
            return this$0.f65673b.b(this$0.k0(mU), this$0.f65677f);
        }
        L6.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        try {
            com.facebook.imagepipeline.producers.M mU2 = this$0.f65673b.u();
            AbstractC5504s.g(mU2, "newLocalFileFetchProducer(...)");
            return this$0.f65673b.b(this$0.k0(mU2), this$0.f65677f);
        } finally {
            L6.b.b();
        }
    }

    public static final d0 u(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        if (!L6.b.d()) {
            return this$0.f65673b.b(this$0.C(), this$0.f65677f);
        }
        L6.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
        try {
            return this$0.f65673b.b(this$0.C(), this$0.f65677f);
        } finally {
            L6.b.b();
        }
    }

    public static final d0 v(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        if (!L6.b.d()) {
            return this$0.i0(this$0.f65674c);
        }
        L6.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        try {
            return this$0.i0(this$0.f65674c);
        } finally {
            L6.b.b();
        }
    }

    public static final d0 w(W this$0) {
        AbstractC5504s.h(this$0, "this$0");
        C3195o c3195oI = this$0.f65673b.i();
        AbstractC5504s.g(c3195oI, "newDataFetchProducer(...)");
        return this$0.f0(this$0.f65673b.D(C.a(c3195oI), true, this$0.f65682k));
    }

    public final d0 C() {
        return (d0) this.f65696y.getValue();
    }

    public final d0 D() {
        return (d0) this.f65671J.getValue();
    }

    public final d0 E(K6.b imageRequest) {
        AbstractC5504s.h(imageRequest, "imageRequest");
        if (!L6.b.d()) {
            d0 d0VarA = A(imageRequest);
            if (imageRequest.l() != null) {
                d0VarA = Q(d0VarA);
            }
            if (this.f65679h) {
                d0VarA = B(d0VarA);
            }
            return (!this.f65685n || imageRequest.e() <= 0) ? d0VarA : F(d0VarA);
        }
        L6.b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        try {
            d0 d0VarA2 = A(imageRequest);
            if (imageRequest.l() != null) {
                d0VarA2 = Q(d0VarA2);
            }
            if (this.f65679h) {
                d0VarA2 = B(d0VarA2);
            }
            if (this.f65685n && imageRequest.e() > 0) {
                d0VarA2 = F(d0VarA2);
            }
            L6.b.b();
            return d0VarA2;
        } catch (Throwable th2) {
            L6.b.b();
            throw th2;
        }
    }

    public final d0 G(K6.b imageRequest) {
        AbstractC5504s.h(imageRequest, "imageRequest");
        a aVar = f65661K;
        aVar.d(imageRequest);
        int iW = imageRequest.w();
        if (iW == 0) {
            return P();
        }
        if (iW == 2 || iW == 3) {
            return J();
        }
        Uri uriV = imageRequest.v();
        AbstractC5504s.g(uriV, "getSourceUri(...)");
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + aVar.c(uriV));
    }

    public final d0 H() {
        return (d0) this.f65670I.getValue();
    }

    public final d0 I() {
        return (d0) this.f65666E.getValue();
    }

    public final d0 J() {
        Object value = this.f65697z.getValue();
        AbstractC5504s.g(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 K() {
        return (d0) this.f65664C.getValue();
    }

    public final d0 L() {
        return (d0) this.f65669H.getValue();
    }

    public final d0 M() {
        return (d0) this.f65667F.getValue();
    }

    public final d0 N() {
        return (d0) this.f65665D.getValue();
    }

    public final d0 O() {
        return (d0) this.f65693v.getValue();
    }

    public final d0 P() {
        Object value = this.f65695x.getValue();
        AbstractC5504s.g(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 R() {
        return (d0) this.f65668G.getValue();
    }

    public final d0 f0(d0 inputProducer) {
        AbstractC5504s.h(inputProducer, "inputProducer");
        if (!L6.b.d()) {
            C3196p c3196pJ = this.f65673b.j(inputProducer);
            AbstractC5504s.g(c3196pJ, "newDecodeProducer(...)");
            return e0(c3196pJ);
        }
        L6.b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            C3196p c3196pJ2 = this.f65673b.j(inputProducer);
            AbstractC5504s.g(c3196pJ2, "newDecodeProducer(...)");
            return e0(c3196pJ2);
        } finally {
            L6.b.b();
        }
    }

    public final synchronized d0 i0(X networkFetcher) {
        try {
            AbstractC5504s.h(networkFetcher, "networkFetcher");
            boolean z10 = false;
            if (!L6.b.d()) {
                d0 d0VarY = this.f65673b.y(networkFetcher);
                AbstractC5504s.g(d0VarY, "newNetworkFetchProducer(...)");
                C3181a c3181aA = C.a(k0(d0VarY));
                AbstractC5504s.g(c3181aA, "newAddImageTransformMetaDataProducer(...)");
                C c10 = this.f65673b;
                if (this.f65675d && this.f65678g != EnumC7300n.f65736c) {
                    z10 = true;
                }
                return c10.D(c3181aA, z10, this.f65682k);
            }
            L6.b.a("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            try {
                d0 d0VarY2 = this.f65673b.y(networkFetcher);
                AbstractC5504s.g(d0VarY2, "newNetworkFetchProducer(...)");
                C3181a c3181aA2 = C.a(k0(d0VarY2));
                AbstractC5504s.g(c3181aA2, "newAddImageTransformMetaDataProducer(...)");
                C c11 = this.f65673b;
                if (this.f65675d && this.f65678g != EnumC7300n.f65736c) {
                    z10 = true;
                }
                k0 k0VarD = c11.D(c3181aA2, z10, this.f65682k);
                L6.b.b();
                return k0VarD;
            } catch (Throwable th2) {
                L6.b.b();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final d0 x() {
        Object value = this.f65663B.getValue();
        AbstractC5504s.g(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 y() {
        Object value = this.f65662A.getValue();
        AbstractC5504s.g(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 z() {
        Object value = this.f65694w.getValue();
        AbstractC5504s.g(value, "getValue(...)");
        return (d0) value;
    }
}
