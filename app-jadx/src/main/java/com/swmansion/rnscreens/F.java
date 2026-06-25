package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractActivityC2842v;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import be.AbstractC3048a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0012\b\u0016\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0003D&<B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\"J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0004J\u001f\u0010+\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\b2\u0006\u0010\r\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\b2\u0006\u0010\r\u001a\u00020-H\u0016¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0004J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0004J\u000f\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0004J\u0017\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u00020\u0014H\u0002¢\u0006\u0004\b:\u0010;R(\u0010B\u001a\u00020\u00058\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bA\u0010\u0004\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0007R \u0010H\u001a\b\u0012\u0004\u0012\u00020-0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010IR\u0016\u0010L\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010:R\u0016\u0010M\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010IR\u0016\u0010O\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010IR\u0016\u0010Q\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010IR\u0014\u0010S\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010R¨\u0006U"}, d2 = {"Lcom/swmansion/rnscreens/F;", "Landroidx/fragment/app/q;", "Lcom/swmansion/rnscreens/G;", "<init>", "()V", "Lcom/swmansion/rnscreens/y;", "screenView", "(Lcom/swmansion/rnscreens/y;)V", "LTd/L;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "p", "", "l", "()Z", "Landroid/app/Activity;", "m", "()Landroid/app/Activity;", "Lcom/facebook/react/bridge/ReactContext;", "r", "()Lcom/facebook/react/bridge/ReactContext;", "Lcom/swmansion/rnscreens/F$b;", "event", "x", "(Lcom/swmansion/rnscreens/F$b;)Z", "e", "(Lcom/swmansion/rnscreens/F$b;)V", "fragmentWrapper", "z", "(Lcom/swmansion/rnscreens/F$b;Lcom/swmansion/rnscreens/G;)V", "c", "y", "", "alpha", "closing", "E", "(FZ)V", "Lcom/swmansion/rnscreens/A;", "o", "(Lcom/swmansion/rnscreens/A;)V", "q", "I", "H", "onDestroy", "K", "C", "A", "D", "B", "animationEnd", "F", "(Z)V", "a", "Lcom/swmansion/rnscreens/y;", "k", "()Lcom/swmansion/rnscreens/y;", "J", "getScreen$annotations", "screen", "", "b", "Ljava/util/List;", "n", "()Ljava/util/List;", "childScreenContainers", "Z", "shouldUpdateOnResume", "d", "transitionProgress", "canDispatchWillAppear", "f", "canDispatchAppear", "g", "isTransitioning", "()Landroidx/fragment/app/q;", "fragment", "h", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class F extends AbstractComponentCallbacksC2838q implements G {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public C4546y screen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List childScreenContainers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean shouldUpdateOnResume;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float transitionProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean canDispatchWillAppear;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean canDispatchAppear;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isTransitioning;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.F$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final short a(float f10) {
            return (short) (f10 == 0.0f ? 1 : f10 == 1.0f ? 2 : 3);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f44361a = new b("DID_APPEAR", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f44362b = new b("WILL_APPEAR", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44363c = new b("DID_DISAPPEAR", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f44364d = new b("WILL_DISAPPEAR", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f44365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f44366f;

        static {
            b[] bVarArrA = a();
            f44365e = bVarArrA;
            f44366f = AbstractC3048a.a(bVarArrA);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f44361a, f44362b, f44363c, f44364d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f44365e.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context);
            AbstractC5504s.h(context, "context");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44367a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f44362b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f44361a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f44364d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f44363c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f44367a = iArr;
        }
    }

    public F() {
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    private final void A() {
        z(b.f44361a, this);
        E(1.0f, false);
    }

    private final void B() {
        z(b.f44363c, this);
        E(1.0f, true);
    }

    private final void C() {
        z(b.f44362b, this);
        E(0.0f, false);
    }

    private final void D() {
        z(b.f44364d, this);
        E(0.0f, true);
    }

    private final void F(final boolean animationEnd) {
        this.isTransitioning = !animationEnd;
        AbstractComponentCallbacksC2838q parentFragment = getParentFragment();
        if (parentFragment == null || ((parentFragment instanceof F) && !((F) parentFragment).isTransitioning)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        F.G(animationEnd, this);
                    }
                });
            } else if (animationEnd) {
                B();
            } else {
                D();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(boolean z10, F f10) {
        if (z10) {
            f10.A();
        } else {
            f10.C();
        }
    }

    private final void K() {
        AbstractActivityC2842v activity = getActivity();
        if (activity == null) {
            this.shouldUpdateOnResume = true;
        } else {
            g0.f44486a.p(k(), activity, r());
        }
    }

    public void E(float alpha, boolean closing) {
        if (!(this instanceof X) || this.transitionProgress == alpha) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, alpha));
        this.transitionProgress = fMax;
        short sA = INSTANCE.a(fMax);
        X x10 = (X) this;
        A container = x10.k().getContainer();
        boolean goingForward = container instanceof S ? ((S) container).getGoingForward() : false;
        Context context = x10.k().getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.f0.c(reactContext, x10.k().getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new Ta.j(com.facebook.react.uimanager.f0.e(reactContext), x10.k().getId(), this.transitionProgress, closing, goingForward, sA));
        }
    }

    public void H() {
        F(true);
    }

    public void I() {
        F(false);
    }

    public void J(C4546y c4546y) {
        AbstractC5504s.h(c4546y, "<set-?>");
        this.screen = c4546y;
    }

    @Override // com.swmansion.rnscreens.C
    public void c(b event) {
        G fragmentWrapper;
        AbstractC5504s.h(event, "event");
        List childScreenContainers = getChildScreenContainers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : childScreenContainers) {
            if (((A) obj).getScreenCount() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4546y topScreen = ((A) it.next()).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                z(event, fragmentWrapper);
            }
        }
    }

    @Override // com.swmansion.rnscreens.C
    public void e(b event) {
        AbstractC5504s.h(event, "event");
        int i10 = d.f44367a[event.ordinal()];
        if (i10 == 1) {
            this.canDispatchWillAppear = false;
            return;
        }
        if (i10 == 2) {
            this.canDispatchAppear = false;
        } else if (i10 == 3) {
            this.canDispatchWillAppear = true;
        } else {
            if (i10 != 4) {
                throw new Td.r();
            }
            this.canDispatchAppear = true;
        }
    }

    @Override // com.swmansion.rnscreens.G
    public C4546y k() {
        C4546y c4546y = this.screen;
        if (c4546y != null) {
            return c4546y;
        }
        AbstractC5504s.u("screen");
        return null;
    }

    @Override // com.swmansion.rnscreens.G
    public boolean l() {
        return false;
    }

    @Override // com.swmansion.rnscreens.G
    public Activity m() {
        AbstractComponentCallbacksC2838q fragment;
        AbstractActivityC2842v activity;
        AbstractActivityC2842v activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = k().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = k().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof C4546y) && (fragment = ((C4546y) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.G
    /* JADX INFO: renamed from: n, reason: from getter */
    public List getChildScreenContainers() {
        return this.childScreenContainers;
    }

    @Override // com.swmansion.rnscreens.G
    public void o(A container) {
        AbstractC5504s.h(container, "container");
        getChildScreenContainers().add(container);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC5504s.h(inflater, "inflater");
        k().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        c cVar = new c(context);
        cVar.addView(Ua.c.c(k()));
        return cVar;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onDestroy() {
        super.onDestroy();
        A container = k().getContainer();
        if (container == null || !container.n(k().getFragmentWrapper())) {
            Context context = k().getContext();
            if (context instanceof ReactContext) {
                int iE = com.facebook.react.uimanager.f0.e(context);
                EventDispatcher eventDispatcherC = com.facebook.react.uimanager.f0.c((ReactContext) context, k().getId());
                if (eventDispatcherC != null) {
                    eventDispatcherC.d(new Ta.h(iE, k().getId()));
                }
            }
        }
        getChildScreenContainers().clear();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onResume() {
        super.onResume();
        if (this.shouldUpdateOnResume) {
            this.shouldUpdateOnResume = false;
            g0.f44486a.p(k(), m(), r());
        }
    }

    @Override // com.swmansion.rnscreens.G
    public void p() {
        K();
    }

    @Override // com.swmansion.rnscreens.G
    public void q(A container) {
        AbstractC5504s.h(container, "container");
        getChildScreenContainers().remove(container);
    }

    @Override // com.swmansion.rnscreens.G
    public ReactContext r() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        }
        if (k().getContext() instanceof ReactContext) {
            Context context2 = k().getContext();
            AbstractC5504s.f(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        }
        for (ViewParent container = k().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof C4546y) {
                C4546y c4546y = (C4546y) container;
                if (c4546y.getContext() instanceof ReactContext) {
                    Context context3 = c4546y.getContext();
                    AbstractC5504s.f(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    return (ReactContext) context3;
                }
            }
        }
        return null;
    }

    public boolean x(b event) {
        AbstractC5504s.h(event, "event");
        int i10 = d.f44367a[event.ordinal()];
        if (i10 == 1) {
            return this.canDispatchWillAppear;
        }
        if (i10 == 2) {
            return this.canDispatchAppear;
        }
        if (i10 == 3) {
            return !this.canDispatchWillAppear;
        }
        if (i10 == 4) {
            return !this.canDispatchAppear;
        }
        throw new Td.r();
    }

    public void y() {
        Context context = k().getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iE = com.facebook.react.uimanager.f0.e(reactContext);
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.f0.c(reactContext, k().getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new Ta.b(iE, k().getId()));
        }
    }

    public void z(b event, G fragmentWrapper) {
        com.facebook.react.uimanager.events.d kVar;
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(fragmentWrapper, "fragmentWrapper");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qA = fragmentWrapper.a();
        if (abstractComponentCallbacksC2838qA instanceof X) {
            X x10 = (X) abstractComponentCallbacksC2838qA;
            if (x10.x(event)) {
                C4546y c4546yK = x10.k();
                fragmentWrapper.e(event);
                int iF = com.facebook.react.uimanager.f0.f(c4546yK);
                int i10 = d.f44367a[event.ordinal()];
                if (i10 == 1) {
                    kVar = new Ta.k(iF, c4546yK.getId());
                } else if (i10 == 2) {
                    kVar = new Ta.f(iF, c4546yK.getId());
                } else if (i10 == 3) {
                    kVar = new Ta.l(iF, c4546yK.getId());
                } else {
                    if (i10 != 4) {
                        throw new Td.r();
                    }
                    kVar = new Ta.g(iF, c4546yK.getId());
                }
                Context context = k().getContext();
                AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherC = com.facebook.react.uimanager.f0.c((ReactContext) context, k().getId());
                if (eventDispatcherC != null) {
                    eventDispatcherC.d(kVar);
                }
                fragmentWrapper.c(event);
            }
        }
    }

    public F(C4546y screenView) {
        AbstractC5504s.h(screenView, "screenView");
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        J(screenView);
    }

    @Override // com.swmansion.rnscreens.InterfaceC4532j
    public AbstractComponentCallbacksC2838q a() {
        return this;
    }
}
