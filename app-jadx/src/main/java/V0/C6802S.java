package v0;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6230l;
import s0.C6335D;
import s0.C6367k0;
import s0.InterfaceC6364j0;
import u0.AbstractC6710e;
import u0.C6706a;
import u0.InterfaceC6709d;

/* JADX INFO: renamed from: v0.S, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6802S extends View {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f61769k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ViewOutlineProvider f61770l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f61771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6367k0 f61772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6706a f61773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f61774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Outline f61775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f61776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC5011d f61777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private EnumC5027t f61778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Function1 f61779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C6811c f61780j;

    /* JADX INFO: renamed from: v0.S$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof C6802S) || (outline2 = ((C6802S) view).f61775e) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    /* JADX INFO: renamed from: v0.S$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C6802S(View view, C6367k0 c6367k0, C6706a c6706a) {
        super(view.getContext());
        this.f61771a = view;
        this.f61772b = c6367k0;
        this.f61773c = c6706a;
        setOutlineProvider(f61770l);
        this.f61776f = true;
        this.f61777g = AbstractC6710e.a();
        this.f61778h = EnumC5027t.f48573a;
        this.f61779i = InterfaceC6812d.f61821a.a();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    public final void b(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, C6811c c6811c, Function1 function1) {
        this.f61777g = interfaceC5011d;
        this.f61778h = enumC5027t;
        this.f61779i = function1;
        this.f61780j = c6811c;
    }

    public final boolean c(Outline outline) {
        this.f61775e = outline;
        return C6794J.f61763a.a(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        C6367k0 c6367k0 = this.f61772b;
        Canvas canvasA = c6367k0.a().a();
        c6367k0.a().y(canvas);
        C6335D c6335dA = c6367k0.a();
        C6706a c6706a = this.f61773c;
        InterfaceC5011d interfaceC5011d = this.f61777g;
        EnumC5027t enumC5027t = this.f61778h;
        float width = getWidth();
        long jD = C6230l.d((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        C6811c c6811c = this.f61780j;
        Function1 function1 = this.f61779i;
        InterfaceC5011d density = c6706a.n1().getDensity();
        EnumC5027t layoutDirection = c6706a.n1().getLayoutDirection();
        InterfaceC6364j0 interfaceC6364j0B = c6706a.n1().b();
        long jF = c6706a.n1().f();
        C6811c c6811cG = c6706a.n1().g();
        InterfaceC6709d interfaceC6709dN1 = c6706a.n1();
        interfaceC6709dN1.c(interfaceC5011d);
        interfaceC6709dN1.d(enumC5027t);
        interfaceC6709dN1.h(c6335dA);
        interfaceC6709dN1.e(jD);
        interfaceC6709dN1.i(c6811c);
        c6335dA.p();
        try {
            function1.invoke(c6706a);
            c6335dA.k();
            InterfaceC6709d interfaceC6709dN12 = c6706a.n1();
            interfaceC6709dN12.c(density);
            interfaceC6709dN12.d(layoutDirection);
            interfaceC6709dN12.h(interfaceC6364j0B);
            interfaceC6709dN12.e(jF);
            interfaceC6709dN12.i(c6811cG);
            c6367k0.a().y(canvasA);
            this.f61774d = false;
        } catch (Throwable th2) {
            c6335dA.k();
            InterfaceC6709d interfaceC6709dN13 = c6706a.n1();
            interfaceC6709dN13.c(density);
            interfaceC6709dN13.d(layoutDirection);
            interfaceC6709dN13.h(interfaceC6364j0B);
            interfaceC6709dN13.e(jF);
            interfaceC6709dN13.i(c6811cG);
            throw th2;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f61776f;
    }

    public final C6367k0 getCanvasHolder() {
        return this.f61772b;
    }

    public final View getOwnerView() {
        return this.f61771a;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f61776f;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.f61774d) {
            return;
        }
        this.f61774d = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.f61776f != z10) {
            this.f61776f = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.f61774d = z10;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
