package androidx.compose.ui.window;

import I0.AbstractC1691q;
import I0.InterfaceC1690p;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.AbstractC2460y;
import Y.B1;
import Y.C0;
import Y.InterfaceC2425m;
import Y.U1;
import Y.b2;
import Y.h2;
import android.R;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractC2680a;
import androidx.compose.ui.platform.C1;
import androidx.compose.ui.window.m;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import com.adjust.sdk.network.ErrorCodes;
import i0.C4968L;
import i1.AbstractC5024q;
import i1.C5015h;
import i1.C5021n;
import i1.C5023p;
import i1.C5025r;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.M;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC2680a implements C1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final c f27856u = new c(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f27857v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Function1 f27858w = b.f27879a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC5082a f27859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t f27860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f27862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o f27863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WindowManager f27864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WindowManager.LayoutParams f27865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s f27866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EnumC5027t f27867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C0 f27868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C0 f27869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C5023p f27870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final h2 f27871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f27872n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f27873o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C4968L f27874p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Object f27875q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C0 f27876r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f27877s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f27878t;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27879a = new b();

        b() {
            super(1);
        }

        public final void a(m mVar) {
            if (mVar.isAttachedToWindow()) {
                mVar.s();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((m) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27881b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(2);
            this.f27881b = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            m.this.Content(interfaceC2425m, AbstractC2409g1.a(this.f27881b | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27882a;

        static {
            int[] iArr = new int[EnumC5027t.values().length];
            try {
                iArr[EnumC5027t.f48573a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5027t.f48574b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27882a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements InterfaceC5082a {
        f() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            InterfaceC1690p parentLayoutCoordinates = m.this.getParentLayoutCoordinates();
            if (parentLayoutCoordinates == null || !parentLayoutCoordinates.b()) {
                parentLayoutCoordinates = null;
            }
            return Boolean.valueOf((parentLayoutCoordinates == null || m.this.m97getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements Function1 {
        g() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC5082a interfaceC5082a) {
            interfaceC5082a.invoke();
        }

        public final void b(final InterfaceC5082a interfaceC5082a) {
            Handler handler = m.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                interfaceC5082a.invoke();
                return;
            }
            Handler handler2 = m.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.window.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.g.c(interfaceC5082a);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InterfaceC5082a) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f27885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f27886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5023p f27887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f27888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f27889e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(M m10, m mVar, C5023p c5023p, long j10, long j11) {
            super(0);
            this.f27885a = m10;
            this.f27886b = mVar;
            this.f27887c = c5023p;
            this.f27888d = j10;
            this.f27889e = j11;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m99invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m99invoke() {
            this.f27885a.f52258a = this.f27886b.getPositionProvider().a(this.f27887c, this.f27888d, this.f27886b.getParentLayoutDirection(), this.f27889e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ m(InterfaceC5082a interfaceC5082a, t tVar, String str, View view, InterfaceC5011d interfaceC5011d, s sVar, UUID uuid, o oVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        o qVar;
        if ((i10 & 128) != 0) {
            qVar = Build.VERSION.SDK_INT >= 29 ? new q() : new r();
        } else {
            qVar = oVar;
        }
        this(interfaceC5082a, tVar, str, view, interfaceC5011d, sVar, uuid, qVar);
    }

    private final Function2 getContent() {
        return (Function2) this.f27876r.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1690p getParentLayoutCoordinates() {
        return (InterfaceC1690p) this.f27869k.getValue();
    }

    private final C5023p getVisibleDisplayBounds() {
        Rect rect = this.f27873o;
        this.f27863e.a(this.f27862d, rect);
        return androidx.compose.ui.window.b.j(rect);
    }

    private final WindowManager.LayoutParams h() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = androidx.compose.ui.window.b.h(this.f27860b, androidx.compose.ui.window.b.i(this.f27862d));
        layoutParams.type = ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION;
        layoutParams.token = this.f27862d.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f27862d.getContext().getResources().getString(l0.m.f52388c));
        return layoutParams;
    }

    private final void i() {
        if (!this.f27860b.a() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f27875q == null) {
            this.f27875q = androidx.compose.ui.window.g.b(this.f27859a);
        }
        androidx.compose.ui.window.g.d(this, this.f27875q);
    }

    private final void j() {
        if (Build.VERSION.SDK_INT >= 33) {
            androidx.compose.ui.window.g.e(this, this.f27875q);
        }
        this.f27875q = null;
    }

    private final void n(EnumC5027t enumC5027t) {
        int i10 = e.f27882a[enumC5027t.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new Td.r();
        }
        super.setLayoutDirection(i11);
    }

    private final void r(t tVar) {
        if (AbstractC5504s.c(this.f27860b, tVar)) {
            return;
        }
        if (tVar.f() && !this.f27860b.f()) {
            WindowManager.LayoutParams layoutParams = this.f27865g;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.f27860b = tVar;
        this.f27865g.flags = androidx.compose.ui.window.b.h(tVar, androidx.compose.ui.window.b.i(this.f27862d));
        this.f27863e.b(this.f27864f, this, this.f27865g);
    }

    private final void setContent(Function2 function2) {
        this.f27876r.setValue(function2);
    }

    private final void setParentLayoutCoordinates(InterfaceC1690p interfaceC1690p) {
        this.f27869k.setValue(interfaceC1690p);
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a
    public void Content(InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-857613600);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (interfaceC2425mG.p((i11 & 3) != 2, i11 & 1)) {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-857613600, i11, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            getContent().invoke(interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        } else {
            interfaceC2425mG.K();
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new d(i10));
        }
    }

    public final void dismiss() {
        Z.b(this, null);
        this.f27864f.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f27860b.a()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC5082a interfaceC5082a = this.f27859a;
                if (interfaceC5082a != null) {
                    interfaceC5082a.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f27871m.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f27865g;
    }

    public final EnumC5027t getParentLayoutDirection() {
        return this.f27867i;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C5025r m97getPopupContentSizebOM6tXw() {
        return (C5025r) this.f27868j.getValue();
    }

    public final s getPositionProvider() {
        return this.f27866h;
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f27877s;
    }

    public final String getTestTag() {
        return this.f27861c;
    }

    @Override // androidx.compose.ui.platform.C1
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a
    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt;
        super.internalOnLayout$ui_release(z10, i10, i11, i12, i13);
        if (this.f27860b.f() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f27865g.width = childAt.getMeasuredWidth();
        this.f27865g.height = childAt.getMeasuredHeight();
        this.f27863e.b(this.f27864f, this, this.f27865g);
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a
    public void internalOnMeasure$ui_release(int i10, int i11) {
        if (this.f27860b.f()) {
            super.internalOnMeasure$ui_release(i10, i11);
        } else {
            C5023p visibleDisplayBounds = getVisibleDisplayBounds();
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.j(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.e(), Integer.MIN_VALUE));
        }
    }

    public final void k() {
        int[] iArr = this.f27878t;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.f27862d.getLocationOnScreen(iArr);
        int[] iArr2 = this.f27878t;
        if (i10 == iArr2[0] && i11 == iArr2[1]) {
            return;
        }
        p();
    }

    public final void l(AbstractC2460y abstractC2460y, Function2 function2) {
        setParentCompositionContext(abstractC2460y);
        setContent(function2);
        this.f27877s = true;
    }

    public final void m() {
        this.f27864f.addView(this, this.f27865g);
    }

    public final void o(InterfaceC5082a interfaceC5082a, t tVar, String str, EnumC5027t enumC5027t) {
        this.f27859a = interfaceC5082a;
        this.f27861c = str;
        r(tVar);
        n(enumC5027t);
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27874p.q();
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27874p.r();
        this.f27874p.f();
        j();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27860b.b()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC5082a interfaceC5082a = this.f27859a;
            if (interfaceC5082a != null) {
                interfaceC5082a.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC5082a interfaceC5082a2 = this.f27859a;
        if (interfaceC5082a2 != null) {
            interfaceC5082a2.invoke();
        }
        return true;
    }

    public final void p() {
        InterfaceC1690p parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.b()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jA = parentLayoutCoordinates.a();
            long jF = AbstractC1691q.f(parentLayoutCoordinates);
            C5023p c5023pA = AbstractC5024q.a(C5021n.f((((long) Math.round(Float.intBitsToFloat((int) (jF >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jF & 4294967295L)))))), jA);
            if (AbstractC5504s.c(c5023pA, this.f27870l)) {
                return;
            }
            this.f27870l = c5023pA;
            s();
        }
    }

    public final void q(InterfaceC1690p interfaceC1690p) {
        setParentLayoutCoordinates(interfaceC1690p);
        p();
    }

    public final void s() {
        C5025r c5025rM97getPopupContentSizebOM6tXw;
        C5023p c5023p = this.f27870l;
        if (c5023p == null || (c5025rM97getPopupContentSizebOM6tXw = m97getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j10 = c5025rM97getPopupContentSizebOM6tXw.j();
        C5023p visibleDisplayBounds = getVisibleDisplayBounds();
        long jC = C5025r.c((((long) visibleDisplayBounds.j()) << 32) | (((long) visibleDisplayBounds.e()) & 4294967295L));
        M m10 = new M();
        m10.f52258a = C5021n.f48560b.b();
        this.f27874p.k(this, f27858w, new h(m10, this, c5023p, jC, j10));
        this.f27865g.x = C5021n.k(m10.f52258a);
        this.f27865g.y = C5021n.l(m10.f52258a);
        if (this.f27860b.c()) {
            this.f27863e.c(this, (int) (jC >> 32), (int) (jC & 4294967295L));
        }
        this.f27863e.b(this.f27864f, this, this.f27865g);
    }

    public final void setParentLayoutDirection(EnumC5027t enumC5027t) {
        this.f27867i = enumC5027t;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m98setPopupContentSizefhxjrPA(C5025r c5025r) {
        this.f27868j.setValue(c5025r);
    }

    public final void setPositionProvider(s sVar) {
        this.f27866h = sVar;
    }

    public final void setTestTag(String str) {
        this.f27861c = str;
    }

    public m(InterfaceC5082a interfaceC5082a, t tVar, String str, View view, InterfaceC5011d interfaceC5011d, s sVar, UUID uuid, o oVar) {
        super(view.getContext(), null, 0, 6, null);
        this.f27859a = interfaceC5082a;
        this.f27860b = tVar;
        this.f27861c = str;
        this.f27862d = view;
        this.f27863e = oVar;
        Object systemService = view.getContext().getSystemService("window");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f27864f = (WindowManager) systemService;
        this.f27865g = h();
        this.f27866h = sVar;
        this.f27867i = EnumC5027t.f48573a;
        this.f27868j = b2.e(null, null, 2, null);
        this.f27869k = b2.e(null, null, 2, null);
        this.f27871m = U1.d(new f());
        float fN = C5015h.n(8);
        this.f27872n = fN;
        this.f27873o = new Rect();
        this.f27874p = new C4968L(new g());
        setId(R.id.content);
        Z.b(this, Z.a(view));
        a0.b(this, a0.a(view));
        P3.m.b(this, P3.m.a(view));
        setTag(l0.l.f52355H, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC5011d.l1(fN));
        setOutlineProvider(new a());
        this.f27876r = b2.e(i.f27830a.a(), null, 2, null);
        this.f27878t = new int[2];
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    @Override // androidx.compose.ui.platform.C1
    public AbstractC2680a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }
}
