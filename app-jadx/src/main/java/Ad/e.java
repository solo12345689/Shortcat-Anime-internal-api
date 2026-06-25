package Ad;

import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.O;
import Gf.P;
import Td.L;
import Td.r;
import Td.v;
import ae.AbstractC2605b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import expo.modules.updates.reloadscreen.ImageResizeMode;
import expo.modules.updates.reloadscreen.ReloadScreenImageSource;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ProgressBar f387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Ad.a f389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O f390d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f391a;

        static {
            int[] iArr = new int[ImageResizeMode.values().length];
            try {
                iArr[ImageResizeMode.CONTAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageResizeMode.COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageResizeMode.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageResizeMode.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f391a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ImageView f395d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f396a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bitmap f397b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f398c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ImageView f399d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, e eVar, ImageView imageView, Zd.e eVar2) {
                super(2, eVar2);
                this.f397b = bitmap;
                this.f398c = eVar;
                this.f399d = imageView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new a(this.f397b, this.f398c, this.f399d, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f396a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                Bitmap bitmap = this.f397b;
                if (bitmap != null) {
                    this.f399d.setImageBitmap(bitmap);
                } else {
                    this.f398c.e();
                }
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: Ad.e$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0009b extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f400a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f401b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0009b(e eVar, Zd.e eVar2) {
                super(2, eVar2);
                this.f401b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0009b(this.f401b, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((C0009b) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f400a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                this.f401b.e();
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Uri uri, e eVar, ImageView imageView, Zd.e eVar2) {
            super(2, eVar2);
            this.f393b = uri;
            this.f394c = eVar;
            this.f395d = imageView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new b(this.f393b, this.f394c, this.f395d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
        
            if (Gf.AbstractC1613i.g(r1, r5, r11) != r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00e9, code lost:
        
            if (Gf.AbstractC1613i.g(r12, r1, r11) != r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00eb, code lost:
        
            return r0;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Ad.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void b(Ad.a aVar) {
        ImageView.ScaleType scaleType;
        ReloadScreenImageSource reloadScreenImageSourceC = aVar.c();
        if (reloadScreenImageSourceC == null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        int i10 = a.f391a[aVar.e().ordinal()];
        if (i10 == 1) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else if (i10 == 2) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else if (i10 == 3) {
            scaleType = ImageView.ScaleType.CENTER;
        } else {
            if (i10 != 4) {
                throw new r();
            }
            scaleType = ImageView.ScaleType.FIT_XY;
        }
        imageView.setScaleType(scaleType);
        if (aVar.d() || reloadScreenImageSourceC.getWidth() == null || reloadScreenImageSourceC.getHeight() == null || reloadScreenImageSourceC.getWidth().doubleValue() <= 0.0d || reloadScreenImageSourceC.getHeight().doubleValue() <= 0.0d) {
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else {
            Double scale = reloadScreenImageSourceC.getScale();
            double dDoubleValue = scale != null ? scale.doubleValue() : 1.0d;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(d((float) (reloadScreenImageSourceC.getWidth().doubleValue() * dDoubleValue)), d((float) (reloadScreenImageSourceC.getHeight().doubleValue() * dDoubleValue)));
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
        }
        this.f388b = imageView;
        addView(imageView);
        f(reloadScreenImageSourceC);
    }

    private final void c(f fVar) {
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        int iD = d(fVar.e().getSize());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iD, iD);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setTint(fVar.c());
        }
        this.f387a = progressBar;
        addView(progressBar);
    }

    private final int d(float f10) {
        return (int) (f10 * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        ImageView imageView = this.f388b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        Ad.a aVar = this.f389c;
        if (aVar != null) {
            setBackgroundColor(aVar.a());
            c(f.b(aVar.f(), true, 0, null, 6, null));
        }
    }

    private final void f(ReloadScreenImageSource reloadScreenImageSource) {
        Uri url;
        ImageView imageView = this.f388b;
        if (imageView == null || (url = reloadScreenImageSource.getUrl()) == null) {
            return;
        }
        g(url, imageView);
    }

    private final void g(Uri uri, ImageView imageView) {
        AbstractC1617k.d(this.f390d, null, null, new b(uri, this, imageView, null), 3, null);
    }

    public final void h(Ad.a configuration) {
        AbstractC5504s.h(configuration, "configuration");
        this.f389c = configuration;
        removeAllViews();
        if (configuration.c() == null || !configuration.d()) {
            setBackgroundColor(configuration.a());
        } else {
            setBackgroundColor(0);
        }
        if (configuration.c() != null) {
            b(configuration);
        }
        if (configuration.f().d()) {
            c(configuration.f());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        P.d(this.f390d, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5504s.h(context, "context");
        this.f390d = P.a(C1608f0.b());
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }
}
