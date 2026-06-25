package com.facebook.imagepipeline.producers;

import K6.b;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.imagepipeline.producers.C3196p;
import com.facebook.imagepipeline.producers.G;
import com.facebook.imageutils.BitmapUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;
import z6.C7287a;
import z6.EnumC7300n;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3196p implements d0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f36250m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B5.a f36251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f36252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6.c f36253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6.e f36254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumC7300n f36255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f36256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f36257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d0 f36258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f36259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C7287a f36260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f36261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final y5.n f36262l;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(E6.k kVar, y6.d dVar) {
            return (((long) kVar.getWidth()) * ((long) kVar.getHeight())) * ((long) BitmapUtil.getPixelSizeForBitmapConfig(dVar.f64844h)) > 104857600;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b extends d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ C3196p f36263k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3196p c3196p, InterfaceC3194n consumer, e0 producerContext, boolean z10, int i10) {
            super(c3196p, consumer, producerContext, z10, i10);
            AbstractC5504s.h(consumer, "consumer");
            AbstractC5504s.h(producerContext, "producerContext");
            this.f36263k = c3196p;
        }

        @Override // com.facebook.imagepipeline.producers.C3196p.d
        protected synchronized boolean J(E6.k kVar, int i10) {
            return AbstractC3183c.f(i10) ? false : super.J(kVar, i10);
        }

        @Override // com.facebook.imagepipeline.producers.C3196p.d
        protected int x(E6.k encodedImage) {
            AbstractC5504s.h(encodedImage, "encodedImage");
            return encodedImage.C();
        }

        @Override // com.facebook.imagepipeline.producers.C3196p.d
        protected E6.p z() {
            E6.p pVarD = E6.o.d(0, false, false);
            AbstractC5504s.g(pVarD, "of(...)");
            return pVarD;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c extends d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final C6.f f36264k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final C6.e f36265l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C3196p f36266m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3196p c3196p, InterfaceC3194n consumer, e0 producerContext, C6.f progressiveJpegParser, C6.e progressiveJpegConfig, boolean z10, int i10) {
            super(c3196p, consumer, producerContext, z10, i10);
            AbstractC5504s.h(consumer, "consumer");
            AbstractC5504s.h(producerContext, "producerContext");
            AbstractC5504s.h(progressiveJpegParser, "progressiveJpegParser");
            AbstractC5504s.h(progressiveJpegConfig, "progressiveJpegConfig");
            this.f36266m = c3196p;
            this.f36264k = progressiveJpegParser;
            this.f36265l = progressiveJpegConfig;
            I(0);
        }

        @Override // com.facebook.imagepipeline.producers.C3196p.d
        protected synchronized boolean J(E6.k kVar, int i10) {
            if (kVar == null) {
                return false;
            }
            try {
                boolean zJ = super.J(kVar, i10);
                if (AbstractC3183c.f(i10) || AbstractC3183c.n(i10, 8)) {
                    if (!AbstractC3183c.n(i10, 4) && E6.k.Y(kVar) && kVar.o() == q6.b.f57656b) {
                        if (!this.f36264k.g(kVar)) {
                            return false;
                        }
                        int iD = this.f36264k.d();
                        if (iD <= y()) {
                            return false;
                        }
                        if (iD < this.f36265l.a(y()) && !this.f36264k.e()) {
                            return false;
                        }
                        I(iD);
                    }
                }
                return zJ;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.facebook.imagepipeline.producers.C3196p.d
        protected int x(E6.k encodedImage) {
            AbstractC5504s.h(encodedImage, "encodedImage");
            return this.f36264k.c();
        }

        @Override // com.facebook.imagepipeline.producers.C3196p.d
        protected E6.p z() {
            E6.p pVarB = this.f36265l.b(this.f36264k.d());
            AbstractC5504s.g(pVarB, "getQualityInfo(...)");
            return pVarB;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    abstract class d extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f36267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f36268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final g0 f36269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final y6.d f36270f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f36271g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final G f36272h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f36273i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ C3196p f36274j;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$d$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends AbstractC3186f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f36276b;

            a(boolean z10) {
                this.f36276b = z10;
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3186f, com.facebook.imagepipeline.producers.f0
            public void a() {
                if (d.this.f36267c.o()) {
                    d.this.f36272h.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void b() {
                if (this.f36276b) {
                    d.this.A();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(final C3196p c3196p, InterfaceC3194n consumer, e0 producerContext, boolean z10, final int i10) {
            super(consumer);
            AbstractC5504s.h(consumer, "consumer");
            AbstractC5504s.h(producerContext, "producerContext");
            this.f36274j = c3196p;
            this.f36267c = producerContext;
            this.f36268d = "ProgressiveDecoder";
            this.f36269e = producerContext.m();
            y6.d dVarH = producerContext.q().h();
            AbstractC5504s.g(dVarH, "getImageDecodeOptions(...)");
            this.f36270f = dVarH;
            this.f36272h = new G(c3196p.f(), new G.d() { // from class: com.facebook.imagepipeline.producers.q
                @Override // com.facebook.imagepipeline.producers.G.d
                public final void a(E6.k kVar, int i11) throws Throwable {
                    C3196p.d.r(this.f36277a, c3196p, i10, kVar, i11);
                }
            }, dVarH.f64837a);
            producerContext.b(new a(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void A() {
            E(true);
            p().b();
        }

        private final void B(Throwable th2) {
            E(true);
            p().a(th2);
        }

        private final void C(E6.e eVar, int i10) {
            C5.a aVarB = this.f36274j.c().b(eVar);
            try {
                E(AbstractC3183c.e(i10));
                p().c(aVarB, i10);
            } finally {
                C5.a.m(aVarB);
            }
        }

        private final E6.e D(E6.k kVar, int i10, E6.p pVar) {
            boolean z10 = this.f36274j.h() != null && ((Boolean) this.f36274j.i().get()).booleanValue();
            try {
                return this.f36274j.g().a(kVar, i10, pVar, this.f36270f);
            } catch (OutOfMemoryError e10) {
                if (!z10) {
                    throw e10;
                }
                Runnable runnableH = this.f36274j.h();
                if (runnableH != null) {
                    runnableH.run();
                }
                System.gc();
                return this.f36274j.g().a(kVar, i10, pVar, this.f36270f);
            }
        }

        private final void E(boolean z10) {
            synchronized (this) {
                if (z10) {
                    if (!this.f36271g) {
                        p().d(1.0f);
                        this.f36271g = true;
                        Td.L l10 = Td.L.f17438a;
                        this.f36272h.c();
                    }
                }
            }
        }

        private final void F(E6.k kVar) {
            if (kVar.o() != q6.b.f57656b) {
                return;
            }
            kVar.t1(M6.a.c(kVar, BitmapUtil.getPixelSizeForBitmapConfig(this.f36270f.f64844h), 104857600));
        }

        private final void H(E6.k kVar, E6.e eVar, int i10) {
            this.f36267c.k("encoded_width", Integer.valueOf(kVar.getWidth()));
            this.f36267c.k("encoded_height", Integer.valueOf(kVar.getHeight()));
            this.f36267c.k("encoded_size", Integer.valueOf(kVar.C()));
            this.f36267c.k("image_color_space", kVar.l());
            if (eVar instanceof E6.d) {
                this.f36267c.k("bitmap_config", String.valueOf(((E6.d) eVar).G1().getConfig()));
            }
            if (eVar != null) {
                eVar.w(this.f36267c.getExtras());
            }
            this.f36267c.k("last_scan_num", Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(d this$0, C3196p this$1, int i10, E6.k kVar, int i11) throws Throwable {
            AbstractC5504s.h(this$0, "this$0");
            AbstractC5504s.h(this$1, "this$1");
            if (kVar != null) {
                K6.b bVarQ = this$0.f36267c.q();
                this$0.f36267c.k("image_format", kVar.o().a());
                Uri uriV = bVarQ.v();
                kVar.u1(uriV != null ? uriV.toString() : null);
                EnumC7300n enumC7300nG = bVarQ.g();
                if (enumC7300nG == null) {
                    enumC7300nG = this$1.e();
                }
                boolean zN = AbstractC3183c.n(i11, 16);
                if ((enumC7300nG == EnumC7300n.f65734a || (enumC7300nG == EnumC7300n.f65735b && !zN)) && (this$1.d() || !G5.f.n(bVarQ.v()))) {
                    y6.h hVarT = bVarQ.t();
                    AbstractC5504s.g(hVarT, "getRotationOptions(...)");
                    kVar.t1(M6.a.b(hVarT, bVarQ.r(), kVar, i10));
                }
                if (this$0.f36267c.g().G().i()) {
                    this$0.F(kVar);
                }
                this$0.v(kVar, i11, this$0.f36273i);
            }
        }

        private final void v(E6.k kVar, int i10, int i11) throws Throwable {
            E6.p pVar;
            String str;
            long j10;
            E6.e eVarD;
            int i12 = i10;
            if ((kVar.o() != q6.b.f57656b && AbstractC3183c.f(i12)) || this.f36271g || !E6.k.Y(kVar)) {
                return;
            }
            if (AbstractC5504s.c(kVar.o(), q6.b.f57658d) && C3196p.f36250m.b(kVar, this.f36270f)) {
                IllegalStateException illegalStateException = new IllegalStateException("Image is too big to attempt decoding: w = " + kVar.getWidth() + ", h = " + kVar.getHeight() + ", pixel config = " + this.f36270f.f64844h + ", max bitmap size = 104857600");
                this.f36269e.k(this.f36267c, "DecodeProducer", illegalStateException, null);
                B(illegalStateException);
                return;
            }
            q6.c cVarO = kVar.o();
            AbstractC5504s.g(cVarO, "getImageFormat(...)");
            String strA = cVarO.a();
            String str2 = "unknown";
            String str3 = strA == null ? "unknown" : strA;
            String str4 = kVar.getWidth() + "x" + kVar.getHeight();
            String strValueOf = String.valueOf(kVar.z());
            boolean zE = AbstractC3183c.e(i12);
            boolean z10 = zE && !AbstractC3183c.n(i12, 8);
            boolean zN = AbstractC3183c.n(i12, 4);
            y6.g gVarR = this.f36267c.q().r();
            if (gVarR != null) {
                str2 = gVarR.f64868a + "x" + gVarR.f64869b;
            }
            try {
                long jF = this.f36272h.f();
                String string = this.f36267c.q().v().toString();
                AbstractC5504s.g(string, "toString(...)");
                int iC = (z10 || zN) ? kVar.C() : x(kVar);
                E6.p pVarZ = (z10 || zN) ? E6.o.f5692d : z();
                this.f36269e.d(this.f36267c, "DecodeProducer");
                try {
                    AbstractC5504s.e(pVarZ);
                    eVarD = D(kVar, iC, pVarZ);
                } catch (C6.a e10) {
                    pVar = pVarZ;
                    str = str2;
                    j10 = jF;
                    try {
                        try {
                            E6.k kVarA = e10.a();
                            AbstractC7283a.K(this.f36268d, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e10.getMessage(), string, kVarA.m(10), Integer.valueOf(kVarA.C()));
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            E6.k.g(kVar);
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        eVarD = null;
                        AbstractC5504s.e(pVar);
                        this.f36269e.k(this.f36267c, "DecodeProducer", e, w(eVarD, j10, pVar, zE, str3, str4, str, strValueOf));
                        B(e);
                        E6.k.g(kVar);
                    }
                } catch (Exception e12) {
                    e = e12;
                    pVar = pVarZ;
                    str = str2;
                    j10 = jF;
                    eVarD = null;
                    AbstractC5504s.e(pVar);
                    this.f36269e.k(this.f36267c, "DecodeProducer", e, w(eVarD, j10, pVar, zE, str3, str4, str, strValueOf));
                    B(e);
                    E6.k.g(kVar);
                }
                try {
                    if (kVar.z() != 1) {
                        i12 |= 16;
                    }
                    this.f36269e.j(this.f36267c, "DecodeProducer", w(eVarD, jF, pVarZ, zE, str3, str4, str2, strValueOf));
                    H(kVar, eVarD, i11);
                    C(eVarD, i12);
                    E6.k.g(kVar);
                } catch (Exception e13) {
                    e = e13;
                    pVar = pVarZ;
                    str = str2;
                    j10 = jF;
                    AbstractC5504s.e(pVar);
                    this.f36269e.k(this.f36267c, "DecodeProducer", e, w(eVarD, j10, pVar, zE, str3, str4, str, strValueOf));
                    B(e);
                    E6.k.g(kVar);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private final Map w(E6.e eVar, long j10, E6.p pVar, boolean z10, String str, String str2, String str3, String str4) {
            Map extras;
            Object obj;
            String string = null;
            if (!this.f36269e.f(this.f36267c, "DecodeProducer")) {
                return null;
            }
            String strValueOf = String.valueOf(j10);
            String strValueOf2 = String.valueOf(pVar.b());
            String strValueOf3 = String.valueOf(z10);
            if (eVar != null && (extras = eVar.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
                string = obj.toString();
            }
            if (!(eVar instanceof E6.f)) {
                String str5 = string;
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", str2);
                map.put("imageFormat", str);
                map.put("requestedImageSize", str3);
                map.put("sampleSize", str4);
                if (str5 != null) {
                    map.put("non_fatal_decode_error", str5);
                }
                return y5.g.a(map);
            }
            String str6 = string;
            Bitmap bitmapG1 = ((E6.f) eVar).G1();
            AbstractC5504s.g(bitmapG1, "getUnderlyingBitmap(...)");
            String str7 = bitmapG1.getWidth() + "x" + bitmapG1.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str7);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", str2);
            map2.put("imageFormat", str);
            map2.put("requestedImageSize", str3);
            map2.put("sampleSize", str4);
            int byteCount = bitmapG1.getByteCount();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(byteCount);
            map2.put("byteCount", sb2.toString());
            if (str6 != null) {
                map2.put("non_fatal_decode_error", str6);
            }
            return y5.g.a(map2);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void i(E6.k kVar, int i10) {
            if (!L6.b.d()) {
                boolean zE = AbstractC3183c.e(i10);
                if (zE) {
                    if (kVar == null) {
                        boolean zC = AbstractC5504s.c(this.f36267c.C("cached_value_found"), Boolean.TRUE);
                        if (!this.f36267c.g().G().h() || this.f36267c.E() == b.c.FULL_FETCH || zC) {
                            B(new G5.a("Encoded image is null."));
                            return;
                        }
                    } else if (!kVar.S()) {
                        B(new G5.a("Encoded image is not valid."));
                        return;
                    }
                }
                if (J(kVar, i10)) {
                    boolean zN = AbstractC3183c.n(i10, 4);
                    if (zE || zN || this.f36267c.o()) {
                        this.f36272h.h();
                        return;
                    }
                    return;
                }
                return;
            }
            L6.b.a("DecodeProducer#onNewResultImpl");
            try {
                boolean zE2 = AbstractC3183c.e(i10);
                if (zE2) {
                    if (kVar == null) {
                        boolean zC2 = AbstractC5504s.c(this.f36267c.C("cached_value_found"), Boolean.TRUE);
                        if (this.f36267c.g().G().h()) {
                            if (this.f36267c.E() != b.c.FULL_FETCH) {
                                if (zC2) {
                                }
                            }
                        }
                        B(new G5.a("Encoded image is null."));
                        L6.b.b();
                        return;
                    }
                    if (!kVar.S()) {
                        B(new G5.a("Encoded image is not valid."));
                        L6.b.b();
                        return;
                    }
                }
                if (!J(kVar, i10)) {
                    L6.b.b();
                    return;
                }
                boolean zN2 = AbstractC3183c.n(i10, 4);
                if (zE2 || zN2 || this.f36267c.o()) {
                    this.f36272h.h();
                }
                Td.L l10 = Td.L.f17438a;
                L6.b.b();
            } catch (Throwable th2) {
                L6.b.b();
                throw th2;
            }
        }

        protected final void I(int i10) {
            this.f36273i = i10;
        }

        protected boolean J(E6.k kVar, int i10) {
            return this.f36272h.k(kVar, i10);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3199t, com.facebook.imagepipeline.producers.AbstractC3183c
        public void g() {
            A();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3199t, com.facebook.imagepipeline.producers.AbstractC3183c
        public void h(Throwable t10) {
            AbstractC5504s.h(t10, "t");
            B(t10);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3199t, com.facebook.imagepipeline.producers.AbstractC3183c
        protected void j(float f10) {
            super.j(f10 * 0.99f);
        }

        protected abstract int x(E6.k kVar);

        protected final int y() {
            return this.f36273i;
        }

        protected abstract E6.p z();
    }

    public C3196p(B5.a byteArrayPool, Executor executor, C6.c imageDecoder, C6.e progressiveJpegConfig, EnumC7300n downsampleMode, boolean z10, boolean z11, d0 inputProducer, int i10, C7287a closeableReferenceFactory, Runnable runnable, y5.n recoverFromDecoderOOM) {
        AbstractC5504s.h(byteArrayPool, "byteArrayPool");
        AbstractC5504s.h(executor, "executor");
        AbstractC5504s.h(imageDecoder, "imageDecoder");
        AbstractC5504s.h(progressiveJpegConfig, "progressiveJpegConfig");
        AbstractC5504s.h(downsampleMode, "downsampleMode");
        AbstractC5504s.h(inputProducer, "inputProducer");
        AbstractC5504s.h(closeableReferenceFactory, "closeableReferenceFactory");
        AbstractC5504s.h(recoverFromDecoderOOM, "recoverFromDecoderOOM");
        this.f36251a = byteArrayPool;
        this.f36252b = executor;
        this.f36253c = imageDecoder;
        this.f36254d = progressiveJpegConfig;
        this.f36255e = downsampleMode;
        this.f36256f = z10;
        this.f36257g = z11;
        this.f36258h = inputProducer;
        this.f36259i = i10;
        this.f36260j = closeableReferenceFactory;
        this.f36261k = runnable;
        this.f36262l = recoverFromDecoderOOM;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n consumer, e0 context) {
        C3196p c3196p;
        e0 e0Var;
        InterfaceC3194n cVar;
        AbstractC5504s.h(consumer, "consumer");
        AbstractC5504s.h(context, "context");
        if (L6.b.d()) {
            L6.b.a("DecodeProducer#produceResults");
            try {
                K6.b bVarQ = context.q();
                this.f36258h.a((G5.f.n(bVarQ.v()) || K6.c.s(bVarQ.v())) ? new c(this, consumer, context, new C6.f(this.f36251a), this.f36254d, this.f36257g, this.f36259i) : new b(this, consumer, context, this.f36257g, this.f36259i), context);
                Td.L l10 = Td.L.f17438a;
                L6.b.b();
                return;
            } catch (Throwable th2) {
                L6.b.b();
                throw th2;
            }
        }
        K6.b bVarQ2 = context.q();
        if (G5.f.n(bVarQ2.v()) || K6.c.s(bVarQ2.v())) {
            c3196p = this;
            e0Var = context;
            cVar = new c(c3196p, consumer, e0Var, new C6.f(c3196p.f36251a), c3196p.f36254d, c3196p.f36257g, c3196p.f36259i);
        } else {
            cVar = new b(this, consumer, context, this.f36257g, this.f36259i);
            c3196p = this;
            e0Var = context;
        }
        c3196p.f36258h.a(cVar, e0Var);
    }

    public final C7287a c() {
        return this.f36260j;
    }

    public final boolean d() {
        return this.f36256f;
    }

    public final EnumC7300n e() {
        return this.f36255e;
    }

    public final Executor f() {
        return this.f36252b;
    }

    public final C6.c g() {
        return this.f36253c;
    }

    public final Runnable h() {
        return this.f36261k;
    }

    public final y5.n i() {
        return this.f36262l;
    }
}
