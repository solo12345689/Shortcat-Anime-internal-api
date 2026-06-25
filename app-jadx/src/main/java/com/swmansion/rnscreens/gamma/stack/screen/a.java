package com.swmansion.rnscreens.gamma.stack.screen;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import androidx.lifecycle.r;
import be.AbstractC3048a;
import com.facebook.react.uimanager.C3284b0;
import com.swmansion.rnscreens.gamma.stack.host.k;
import java.lang.ref.WeakReference;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.z;
import le.AbstractC5591b;
import le.C5590a;
import le.InterfaceC5593d;
import pe.InterfaceC6023m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends ViewGroup implements Va.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f44515g = {O.e(new z(a.class, "activityMode", "getActivityMode()Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen$ActivityMode;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3284b0 f44516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f44518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC5593d f44519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f44520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f44521f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.swmansion.rnscreens.gamma.stack.screen.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class EnumC0698a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC0698a f44522a = new EnumC0698a("DETACHED", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC0698a f44523b = new EnumC0698a("ATTACHED", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0698a[] f44524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f44525d;

        static {
            EnumC0698a[] enumC0698aArrA = a();
            f44524c = enumC0698aArrA;
            f44525d = AbstractC3048a.a(enumC0698aArrA);
        }

        private EnumC0698a(String str, int i10) {
        }

        private static final /* synthetic */ EnumC0698a[] a() {
            return new EnumC0698a[]{f44522a, f44523b};
        }

        public static EnumC0698a valueOf(String str) {
            return (EnumC0698a) Enum.valueOf(EnumC0698a.class, str);
        }

        public static EnumC0698a[] values() {
            return (EnumC0698a[]) f44524c.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5591b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f44526b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, a aVar) {
            super(obj);
            this.f44526b = aVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            k kVar;
            AbstractC5504s.h(property, "property");
            if (((EnumC0698a) obj) == ((EnumC0698a) obj2) || (kVar = this.f44526b.getStackHost$react_native_screens_release().get()) == null) {
                return;
            }
            kVar.e(this.f44526b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C3284b0 reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f44516a = reactContext;
        this.f44518c = new WeakReference(null);
        C5590a c5590a = C5590a.f52755a;
        this.f44519d = new b(EnumC0698a.f44522a, this);
    }

    public final com.swmansion.rnscreens.gamma.stack.screen.b a(r viewLifecycleOwner) {
        AbstractC5504s.h(viewLifecycleOwner, "viewLifecycleOwner");
        return new com.swmansion.rnscreens.gamma.stack.screen.b(viewLifecycleOwner.getLifecycle(), getEventEmitter$react_native_screens_release());
    }

    public final boolean b() {
        return this.f44517b;
    }

    public final void c() {
        if (getActivityMode() == EnumC0698a.f44523b) {
            setNativelyDismissed$react_native_screens_release(true);
        }
        getEventEmitter$react_native_screens_release().h(this.f44517b);
    }

    public final void d() {
        if (getId() == -1) {
            throw new IllegalStateException("[RNScreens] StackScreen must have its tag set when registering event emitters");
        }
        setEventEmitter$react_native_screens_release(new c(this.f44516a, getId()));
    }

    public final EnumC0698a getActivityMode() {
        return (EnumC0698a) this.f44519d.a(this, f44515g[0]);
    }

    @Override // Va.a
    public AbstractComponentCallbacksC2838q getAssociatedFragment() {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qA = Ua.c.a(this);
        if (abstractComponentCallbacksC2838qA == null) {
            return null;
        }
        if (abstractComponentCallbacksC2838qA instanceof d) {
            return abstractComponentCallbacksC2838qA;
        }
        throw new IllegalStateException(("[RNScreens] Unexpected fragment type: " + abstractComponentCallbacksC2838qA.getClass().getSimpleName()).toString());
    }

    public final c getEventEmitter$react_native_screens_release() {
        c cVar = this.f44521f;
        if (cVar != null) {
            return cVar;
        }
        AbstractC5504s.u("eventEmitter");
        return null;
    }

    public final String getScreenKey() {
        return this.f44520e;
    }

    public final WeakReference<k> getStackHost$react_native_screens_release() {
        return this.f44518c;
    }

    public final void setActivityMode(EnumC0698a enumC0698a) {
        AbstractC5504s.h(enumC0698a, "<set-?>");
        this.f44519d.b(this, f44515g[0], enumC0698a);
    }

    public final void setEventEmitter$react_native_screens_release(c cVar) {
        AbstractC5504s.h(cVar, "<set-?>");
        this.f44521f = cVar;
    }

    public final void setNativelyDismissed$react_native_screens_release(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException("[RNScreens] Natively dismissed StackScreen must remain dismissed.");
        }
        this.f44517b = true;
    }

    public final void setScreenKey(String str) {
        if (this.f44520e != null) {
            throw new IllegalArgumentException("[RNScreens] StackScreen can't change its screenKey.");
        }
        this.f44520e = str;
    }

    public final void setStackHost$react_native_screens_release(WeakReference<k> weakReference) {
        AbstractC5504s.h(weakReference, "<set-?>");
        this.f44518c = weakReference;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
