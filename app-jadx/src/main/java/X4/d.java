package x4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import ie.InterfaceC5082a;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import tg.C6683h;
import tg.InterfaceC6685j;
import tg.K;
import tg.Z;
import v4.InterfaceC6845d;
import x4.i;
import x4.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f63876e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f63877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G4.m f63878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Pf.h f63879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f63880d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends tg.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Exception f63881b;

        public b(Z z10) {
            super(z10);
        }

        @Override // tg.r, tg.Z
        public long N0(C6683h c6683h, long j10) throws Exception {
            try {
                return super.N0(c6683h, j10);
            } catch (Exception e10) {
                this.f63881b = e10;
                throw e10;
            }
        }

        public final Exception b() {
            return this.f63881b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f63882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Pf.h f63883b;

        public c(int i10, l lVar) {
            this.f63882a = lVar;
            this.f63883b = Pf.l.b(i10, 0, 2, null);
        }

        @Override // x4.i.a
        public i a(A4.m mVar, G4.m mVar2, InterfaceC6845d interfaceC6845d) {
            return new d(mVar.b(), mVar2, this.f63883b, this.f63882a);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }
    }

    /* JADX INFO: renamed from: x4.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0962d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f63884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f63885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f63886c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63888e;

        C0962d(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63886c = obj;
            this.f63888e |= Integer.MIN_VALUE;
            return d.this.a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements InterfaceC5082a {
        e() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return d.this.e(new BitmapFactory.Options());
        }
    }

    public d(p pVar, G4.m mVar, Pf.h hVar, l lVar) {
        this.f63877a = pVar;
        this.f63878b = mVar;
        this.f63879c = hVar;
        this.f63880d = lVar;
    }

    private final void c(BitmapFactory.Options options, j jVar) {
        Bitmap.Config configF = this.f63878b.f();
        if (jVar.b() || n.a(jVar)) {
            configF = L4.a.e(configF);
        }
        if (this.f63878b.d() && configF == Bitmap.Config.ARGB_8888 && AbstractC5504s.c(options.outMimeType, "image/jpeg")) {
            configF = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && configF != Bitmap.Config.HARDWARE) {
            configF = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = configF;
    }

    private final void d(BitmapFactory.Options options, j jVar) {
        p.a aVarA = this.f63877a.a();
        if ((aVarA instanceof r) && H4.b.a(this.f63878b.n())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((r) aVarA).a();
            options.inTargetDensity = this.f63878b.g().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i10 = n.b(jVar) ? options.outHeight : options.outWidth;
        int i11 = n.b(jVar) ? options.outWidth : options.outHeight;
        H4.h hVarN = this.f63878b.n();
        int iZ = H4.b.a(hVarN) ? i10 : L4.j.z(hVarN.b(), this.f63878b.m());
        H4.h hVarN2 = this.f63878b.n();
        int iZ2 = H4.b.a(hVarN2) ? i11 : L4.j.z(hVarN2.a(), this.f63878b.m());
        int iA = h.a(i10, i11, iZ, iZ2, this.f63878b.m());
        options.inSampleSize = iA;
        double dB = h.b(((double) i10) / ((double) iA), ((double) i11) / ((double) iA), iZ, iZ2, this.f63878b.m());
        if (this.f63878b.c()) {
            dB = AbstractC5874j.g(dB, 1.0d);
        }
        boolean z10 = dB == 1.0d;
        options.inScaled = !z10;
        if (z10) {
            return;
        }
        if (dB > 1.0d) {
            options.inDensity = AbstractC5466a.c(((double) Integer.MAX_VALUE) / dB);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = AbstractC5466a.c(((double) Integer.MAX_VALUE) * dB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g e(BitmapFactory.Options options) throws Exception {
        b bVar = new b(this.f63877a.b());
        InterfaceC6685j interfaceC6685jD = K.d(bVar);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(interfaceC6685jD.peek().L(), null, options);
        Exception excB = bVar.b();
        if (excB != null) {
            throw excB;
        }
        options.inJustDecodeBounds = false;
        m mVar = m.f63910a;
        j jVarA = mVar.a(options.outMimeType, interfaceC6685jD, this.f63880d);
        Exception excB2 = bVar.b();
        if (excB2 != null) {
            throw excB2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && this.f63878b.e() != null) {
            options.inPreferredColorSpace = this.f63878b.e();
        }
        options.inPremultiplied = this.f63878b.l();
        c(options, jVarA);
        d(options, jVarA);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(interfaceC6685jD.L(), null, options);
            fe.c.a(interfaceC6685jD, null);
            Exception excB3 = bVar.b();
            if (excB3 != null) {
                throw excB3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.f63878b.g().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f63878b.g().getResources(), mVar.b(bitmapDecodeStream, jVarA));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z10 = false;
            }
            return new g(bitmapDrawable, z10);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // x4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(Zd.e r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof x4.d.C0962d
            if (r0 == 0) goto L13
            r0 = r8
            x4.d$d r0 = (x4.d.C0962d) r0
            int r1 = r0.f63888e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63888e = r1
            goto L18
        L13:
            x4.d$d r0 = new x4.d$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f63886c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f63888e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f63884a
            Pf.h r0 = (Pf.h) r0
            Td.v.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L70
        L30:
            r8 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.f63885b
            Pf.h r2 = (Pf.h) r2
            java.lang.Object r5 = r0.f63884a
            x4.d r5 = (x4.d) r5
            Td.v.b(r8)
            r8 = r2
            goto L5a
        L47:
            Td.v.b(r8)
            Pf.h r8 = r7.f63879c
            r0.f63884a = r7
            r0.f63885b = r8
            r0.f63888e = r4
            java.lang.Object r2 = r8.b(r0)
            if (r2 != r1) goto L59
            goto L6c
        L59:
            r5 = r7
        L5a:
            x4.d$e r2 = new x4.d$e     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            r0.f63884a = r8     // Catch: java.lang.Throwable -> L76
            r5 = 0
            r0.f63885b = r5     // Catch: java.lang.Throwable -> L76
            r0.f63888e = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = Gf.AbstractC1647z0.c(r5, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L76
            if (r0 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            x4.g r8 = (x4.g) r8     // Catch: java.lang.Throwable -> L30
            r0.a()
            return r8
        L76:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7a:
            r0.a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.d.a(Zd.e):java.lang.Object");
    }
}
