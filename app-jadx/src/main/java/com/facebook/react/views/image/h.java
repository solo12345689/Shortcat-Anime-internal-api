package com.facebook.react.views.image;

import E6.m;
import H7.t;
import K6.b;
import N7.a;
import N7.b;
import V5.RunnableC2311b;
import V5.q;
import W5.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.EnumC3304u;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import com.facebook.react.views.image.b;
import h7.C4921i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u7.C6742b;
import u7.EnumC6741a;
import z6.EnumC7300n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends Z5.d {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f37915B = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final Matrix f37916C = new Matrix();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private com.facebook.react.views.image.c f37917A;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final S5.b f37918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f37919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f37920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private N7.a f37921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private N7.a f37922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f37923m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f37924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f37925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private q f37926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Shader.TileMode f37927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f37928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b f37929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private J6.a f37930t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private g f37931u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private S5.d f37932v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f37933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f37934x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ReadableMap f37935y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f37936z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final W5.a b(Context context) {
            W5.b bVar = new W5.b(context.getResources());
            W5.d dVarA = W5.d.a(0.0f);
            dVarA.o(true);
            W5.a aVarA = bVar.u(dVarA).a();
            AbstractC5504s.g(aVarA, "build(...)");
            return aVarA;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b extends K6.a {
        public b() {
        }

        @Override // K6.a, K6.d
        public C5.a a(Bitmap source, w6.d bitmapFactory) {
            AbstractC5504s.h(source, "source");
            AbstractC5504s.h(bitmapFactory, "bitmapFactory");
            Rect rect = new Rect(0, 0, h.this.getWidth(), h.this.getHeight());
            h.this.f37926p.a(h.f37916C, rect, source.getWidth(), source.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(source, h.this.f37927q, h.this.f37927q);
            bitmapShader.setLocalMatrix(h.f37916C);
            paint.setShader(bitmapShader);
            C5.a aVarA = bitmapFactory.a(h.this.getWidth(), h.this.getHeight());
            AbstractC5504s.g(aVarA, "createBitmap(...)");
            try {
                new Canvas((Bitmap) aVarA.C()).drawRect(rect, paint);
                C5.a aVarClone = aVarA.clone();
                AbstractC5504s.g(aVarClone, "clone(...)");
                return aVarClone;
            } finally {
                C5.a.m(aVarA);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37939b;

        static {
            int[] iArr = new int[EnumC6741a.values().length];
            try {
                iArr[EnumC6741a.f61405d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f37938a = iArr;
            int[] iArr2 = new int[com.facebook.react.views.image.c.values().length];
            try {
                iArr2[com.facebook.react.views.image.c.f37905b.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[com.facebook.react.views.image.c.f37906c.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f37939b = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ EventDispatcher f37940f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h f37941g;

        d(EventDispatcher eventDispatcher, h hVar) {
            this.f37940f = eventDispatcher;
            this.f37941g = hVar;
        }

        @Override // S5.d
        public void g(String id2, Throwable throwable) {
            AbstractC5504s.h(id2, "id");
            AbstractC5504s.h(throwable, "throwable");
            EventDispatcher eventDispatcher = this.f37940f;
            if (eventDispatcher == null) {
                return;
            }
            eventDispatcher.d(com.facebook.react.views.image.b.f37896h.a(f0.f(this.f37941g), this.f37941g.getId(), throwable));
        }

        @Override // S5.d
        public void r(String id2, Object obj) {
            AbstractC5504s.h(id2, "id");
            EventDispatcher eventDispatcher = this.f37940f;
            if (eventDispatcher == null) {
                return;
            }
            eventDispatcher.d(com.facebook.react.views.image.b.f37896h.d(f0.f(this.f37941g), this.f37941g.getId()));
        }

        @Override // com.facebook.react.views.image.g
        public void x(int i10, int i11) {
            if (this.f37940f == null || this.f37941g.getImageSource$ReactAndroid_release() == null) {
                return;
            }
            EventDispatcher eventDispatcher = this.f37940f;
            b.a aVar = com.facebook.react.views.image.b.f37896h;
            int iF = f0.f(this.f37941g);
            int id2 = this.f37941g.getId();
            N7.a imageSource$ReactAndroid_release = this.f37941g.getImageSource$ReactAndroid_release();
            eventDispatcher.d(aVar.e(iF, id2, imageSource$ReactAndroid_release != null ? imageSource$ReactAndroid_release.e() : null, i10, i11));
        }

        @Override // S5.d
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void n(String id2, m mVar, Animatable animatable) {
            EventDispatcher eventDispatcher;
            AbstractC5504s.h(id2, "id");
            if (mVar == null || this.f37941g.getImageSource$ReactAndroid_release() == null || (eventDispatcher = this.f37940f) == null) {
                return;
            }
            b.a aVar = com.facebook.react.views.image.b.f37896h;
            int iF = f0.f(this.f37941g);
            int id3 = this.f37941g.getId();
            N7.a imageSource$ReactAndroid_release = this.f37941g.getImageSource$ReactAndroid_release();
            eventDispatcher.d(aVar.c(iF, id3, imageSource$ReactAndroid_release != null ? imageSource$ReactAndroid_release.e() : null, mVar.getWidth(), mVar.getHeight()));
            this.f37940f.d(aVar.b(f0.f(this.f37941g), this.f37941g.getId()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, S5.b draweeControllerBuilder, com.facebook.react.views.image.a aVar, Object obj) {
        super(context, f37915B.b(context));
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(draweeControllerBuilder, "draweeControllerBuilder");
        this.f37918h = draweeControllerBuilder;
        this.f37919i = obj;
        this.f37920j = new ArrayList();
        this.f37926p = com.facebook.react.views.image.d.b();
        this.f37927q = com.facebook.react.views.image.d.a();
        this.f37933w = -1;
        this.f37936z = 1.0f;
        this.f37917A = com.facebook.react.views.image.c.f37905b;
        setLegacyVisibilityHandlingEnabled(true);
    }

    private final y6.g getResizeOptions() {
        int iRound = Math.round(getWidth() * this.f37936z);
        int iRound2 = Math.round(getHeight() * this.f37936z);
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        return new y6.g(iRound, iRound2, 0.0f, 0.0f, 12, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r2.equals("default") == false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final u7.EnumC6741a j(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L39
            int r0 = r2.hashCode()
            switch(r0) {
                case -1564134880: goto L2b;
                case -934641255: goto L1f;
                case 706834161: goto L13;
                case 1544803905: goto La;
                default: goto L9;
            }
        L9:
            goto L33
        La:
            java.lang.String r0 = "default"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L39
            goto L33
        L13:
            java.lang.String r0 = "only-if-cached"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L33
        L1c:
            u7.a r2 = u7.EnumC6741a.f61405d
            return r2
        L1f:
            java.lang.String r0 = "reload"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L28
            goto L33
        L28:
            u7.a r2 = u7.EnumC6741a.f61403b
            return r2
        L2b:
            java.lang.String r0 = "force-cache"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L36
        L33:
            u7.a r2 = u7.EnumC6741a.f61402a
            return r2
        L36:
            u7.a r2 = u7.EnumC6741a.f61404c
            return r2
        L39:
            u7.a r2 = u7.EnumC6741a.f61402a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.h.j(java.lang.String):u7.a");
    }

    private final b.c k(EnumC6741a enumC6741a) {
        return c.f37938a[enumC6741a.ordinal()] == 1 ? b.c.DISK_CACHE : b.c.FULL_FETCH;
    }

    private final boolean l() {
        return this.f37920j.size() > 1;
    }

    private final boolean m() {
        return this.f37927q != Shader.TileMode.CLAMP;
    }

    private final void o(boolean z10) {
        N7.a aVar = this.f37921k;
        if (aVar == null) {
            return;
        }
        Uri uriF = aVar.f();
        EnumC6741a enumC6741aC = aVar.c();
        b.c cVarK = k(enumC6741aC);
        ArrayList arrayList = new ArrayList();
        J6.a aVar2 = this.f37930t;
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
        b bVar = this.f37929s;
        if (bVar != null) {
            arrayList.add(bVar);
        }
        K6.d dVarA = e.f37912b.a(arrayList);
        y6.g resizeOptions = z10 ? getResizeOptions() : null;
        if (enumC6741aC == EnumC6741a.f61403b) {
            O5.d.a().g(uriF);
        }
        K6.c cVarI = K6.c.x(uriF).J(dVarA).N(resizeOptions).y(true).K(this.f37934x).I(cVarK);
        com.facebook.react.views.image.c cVar = this.f37917A;
        com.facebook.react.views.image.c cVar2 = com.facebook.react.views.image.c.f37908e;
        if (cVar == cVar2) {
            cVarI.E(EnumC7300n.f65736c);
        }
        C6742b.a aVar3 = C6742b.f61408D;
        AbstractC5504s.e(cVarI);
        C6742b c6742bA = aVar3.a(cVarI, this.f37935y, enumC6741aC);
        S5.b bVar2 = this.f37918h;
        AbstractC5504s.f(bVar2, "null cannot be cast to non-null type com.facebook.drawee.controller.AbstractDraweeControllerBuilder<*, com.facebook.imagepipeline.request.ImageRequest, com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>, com.facebook.imagepipeline.image.ImageInfo>");
        bVar2.x();
        bVar2.B(c6742bA).y(true).D(getController());
        Object obj = this.f37919i;
        if (obj != null) {
            AbstractC5504s.g(bVar2.z(obj), "setCallerContext(...)");
        }
        N7.a aVar4 = this.f37922l;
        if (aVar4 != null) {
            K6.c cVarK2 = K6.c.x(aVar4.f()).J(dVarA).N(resizeOptions).y(true).K(this.f37934x);
            if (this.f37917A == cVar2) {
                cVarK2.E(EnumC7300n.f65736c);
            }
            AbstractC5504s.g(bVar2.C(cVarK2.a()), "setLowResImageRequest(...)");
        }
        g gVar = this.f37931u;
        if (gVar == null || this.f37932v == null) {
            S5.d dVar = this.f37932v;
            if (dVar != null) {
                bVar2.A(dVar);
            } else if (gVar != null) {
                bVar2.A(gVar);
            }
        } else {
            S5.f fVar = new S5.f();
            fVar.b(this.f37931u);
            fVar.b(this.f37932v);
            bVar2.A(fVar);
        }
        if (this.f37931u != null) {
            ((W5.a) getHierarchy()).y(this.f37931u);
        }
        setController(bVar2.a());
        bVar2.x();
    }

    private final void p() {
        this.f37921k = null;
        if (this.f37920j.isEmpty()) {
            List list = this.f37920j;
            a.C0197a c0197a = N7.a.f12684f;
            Context context = getContext();
            AbstractC5504s.g(context, "getContext(...)");
            list.add(c0197a.a(context));
        } else if (l()) {
            b.a aVarA = N7.b.a(getWidth(), getHeight(), this.f37920j);
            this.f37921k = aVarA.f12691a;
            this.f37922l = aVarA.f12692b;
            return;
        }
        this.f37921k = (N7.a) this.f37920j.get(0);
    }

    private final boolean q(N7.a aVar) {
        int i10 = c.f37939b[this.f37917A.ordinal()];
        return i10 != 1 ? i10 == 2 : G5.f.k(aVar.f()) || G5.f.l(aVar.f());
    }

    private final void r(String str) {
        if (!Y6.a.f22860b || C4921i.a()) {
            return;
        }
        Context context = getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        J7.d.d((ReactContext) context, "ReactImageView: Image source \"" + str + "\" doesn't exist");
    }

    public final N7.a getImageSource$ReactAndroid_release() {
        return this.f37921k;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void n() {
        if (this.f37928r) {
            if (!l() || (getWidth() > 0 && getHeight() > 0)) {
                p();
                N7.a aVar = this.f37921k;
                if (aVar == null) {
                    return;
                }
                boolean zQ = q(aVar);
                if (!zQ || (getWidth() > 0 && getHeight() > 0)) {
                    if (!m() || (getWidth() > 0 && getHeight() > 0)) {
                        W5.a aVar2 = (W5.a) getHierarchy();
                        aVar2.t(this.f37926p);
                        Drawable drawable = this.f37923m;
                        if (drawable != null) {
                            aVar2.w(drawable, this.f37926p);
                        }
                        Drawable drawable2 = this.f37924n;
                        if (drawable2 != null) {
                            aVar2.w(drawable2, q.f19907g);
                        }
                        W5.d dVarO = aVar2.o();
                        if (dVarO != null) {
                            int i10 = this.f37925o;
                            if (i10 != 0) {
                                dVarO.n(i10);
                            } else {
                                dVarO.p(d.a.BITMAP_ONLY);
                            }
                            aVar2.z(dVarO);
                        }
                        int i11 = this.f37933w;
                        if (i11 < 0) {
                            i11 = aVar.g() ? 0 : 300;
                        }
                        aVar2.v(i11);
                        o(zQ);
                        this.f37928r = false;
                    }
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        C3281a.a(this, canvas);
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e10) {
            if (this.f37931u != null) {
                Context context = getContext();
                AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherC = f0.c((ReactContext) context, getId());
                if (eventDispatcherC != null) {
                    eventDispatcherC.d(com.facebook.react.views.image.b.f37896h.a(f0.f(this), getId(), e10));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f37928r = this.f37928r || l() || m();
        n();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        C3281a.m(this, Integer.valueOf(i10));
    }

    public final void setBlurRadius(float f10) {
        int iB = ((int) B.f37368a.b(f10)) / 2;
        this.f37930t = iB == 0 ? null : new J6.a(2, iB);
        this.f37928r = true;
    }

    public final void setBorderColor(int i10) {
        C3281a.r(this, t.f8115b, Integer.valueOf(i10));
    }

    public final void setBorderRadius(float f10) {
        C3281a.s(this, H7.i.f8043a, Float.isNaN(f10) ? null : new C3303t(B.f37368a.e(f10), EnumC3304u.f37832a));
    }

    public final void setBorderWidth(float f10) {
        C3281a.u(this, t.f8115b, Float.valueOf(f10));
    }

    public final void setControllerListener(S5.d dVar) {
        this.f37932v = dVar;
        this.f37928r = true;
        n();
    }

    public final void setDefaultSource(String str) {
        Context context = getContext();
        AbstractC5504s.g(context, "getContext(...)");
        Drawable drawableD = N7.c.d(context, str);
        if (AbstractC5504s.c(this.f37923m, drawableD)) {
            return;
        }
        this.f37923m = drawableD;
        this.f37928r = true;
    }

    public final void setFadeDuration(int i10) {
        this.f37933w = i10;
    }

    public final void setHeaders(ReadableMap readableMap) {
        this.f37935y = readableMap;
    }

    public final void setImageSource$ReactAndroid_release(N7.a aVar) {
        this.f37921k = aVar;
    }

    public final void setLoadingIndicatorSource(String str) {
        Context context = getContext();
        AbstractC5504s.g(context, "getContext(...)");
        Drawable drawableD = N7.c.d(context, str);
        RunnableC2311b runnableC2311b = drawableD != null ? new RunnableC2311b(drawableD, 1000) : null;
        if (AbstractC5504s.c(this.f37924n, runnableC2311b)) {
            return;
        }
        this.f37924n = runnableC2311b;
        this.f37928r = true;
    }

    public final void setOverlayColor(int i10) {
        if (this.f37925o != i10) {
            this.f37925o = i10;
            this.f37928r = true;
        }
    }

    public final void setProgressiveRenderingEnabled(boolean z10) {
        this.f37934x = z10;
    }

    public final void setResizeMethod(com.facebook.react.views.image.c resizeMethod) {
        AbstractC5504s.h(resizeMethod, "resizeMethod");
        if (this.f37917A != resizeMethod) {
            this.f37917A = resizeMethod;
            this.f37928r = true;
        }
    }

    public final void setResizeMultiplier(float f10) {
        if (Math.abs(this.f37936z - f10) > 9.999999747378752E-5d) {
            this.f37936z = f10;
            this.f37928r = true;
        }
    }

    public final void setScaleType(q scaleType) {
        AbstractC5504s.h(scaleType, "scaleType");
        if (this.f37926p != scaleType) {
            this.f37926p = scaleType;
            this.f37928r = true;
        }
    }

    public final void setShouldNotifyLoadEvents(boolean z10) {
        if (z10 == (this.f37931u != null)) {
            return;
        }
        if (z10) {
            Context context = getContext();
            AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.f37931u = new d(f0.c((ReactContext) context, getId()), this);
        } else {
            this.f37931u = null;
        }
        this.f37928r = true;
    }

    public final void setSource(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        if (readableArray == null || readableArray.size() == 0) {
            a.C0197a c0197a = N7.a.f12684f;
            Context context = getContext();
            AbstractC5504s.g(context, "getContext(...)");
            arrayList.add(c0197a.a(context));
        } else {
            if (readableArray.size() == 1) {
                ReadableMap map = readableArray.getMap(0);
                if (map == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                EnumC6741a enumC6741aJ = j(map.getString("cache"));
                Context context2 = getContext();
                AbstractC5504s.g(context2, "getContext(...)");
                N7.a aVar = new N7.a(context2, map.getString("uri"), 0.0d, 0.0d, enumC6741aJ, 12, null);
                if (AbstractC5504s.c(Uri.EMPTY, aVar.f())) {
                    r(map.getString("uri"));
                    a.C0197a c0197a2 = N7.a.f12684f;
                    Context context3 = getContext();
                    AbstractC5504s.g(context3, "getContext(...)");
                    aVar = c0197a2.a(context3);
                }
                arrayList.add(aVar);
            } else {
                int size = readableArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ReadableMap map2 = readableArray.getMap(i10);
                    if (map2 != null) {
                        EnumC6741a enumC6741aJ2 = j(map2.getString("cache"));
                        Context context4 = getContext();
                        AbstractC5504s.g(context4, "getContext(...)");
                        N7.a aVar2 = new N7.a(context4, map2.getString("uri"), map2.getDouble("width"), map2.getDouble("height"), enumC6741aJ2);
                        if (AbstractC5504s.c(Uri.EMPTY, aVar2.f())) {
                            r(map2.getString("uri"));
                            a.C0197a c0197a3 = N7.a.f12684f;
                            Context context5 = getContext();
                            AbstractC5504s.g(context5, "getContext(...)");
                            aVar2 = c0197a3.a(context5);
                        }
                        arrayList.add(aVar2);
                    }
                }
            }
        }
        if (AbstractC5504s.c(this.f37920j, arrayList)) {
            return;
        }
        this.f37920j.clear();
        this.f37920j.addAll(arrayList);
        this.f37928r = true;
    }

    public final void setTileMode(Shader.TileMode tileMode) {
        AbstractC5504s.h(tileMode, "tileMode");
        if (this.f37927q != tileMode) {
            this.f37927q = tileMode;
            this.f37929s = m() ? new b() : null;
            this.f37928r = true;
        }
    }
}
