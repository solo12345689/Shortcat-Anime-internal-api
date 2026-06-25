package Sa;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.L;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends ViewGroup implements I, L {

    /* JADX INFO: renamed from: b */
    public static final a f16023b = new a(null);

    /* JADX INFO: renamed from: a */
    private final i f16024a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, float f10, i pointerEventsProxy) {
        super(context);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(pointerEventsProxy, "pointerEventsProxy");
        this.f16024a = pointerEventsProxy;
        pointerEventsProxy.a(new h(this));
        setBackgroundColor(-16777216);
        setAlpha(f10);
    }

    public final boolean getBlockGestures$react_native_screens_release() {
        return !Ua.b.b(getAlpha(), 0.0f, 0.0f, 2, null);
    }

    @Override // com.facebook.react.uimanager.L
    public C getPointerEvents() {
        return this.f16024a.getPointerEvents();
    }

    @Override // com.facebook.react.uimanager.I
    public boolean interceptsTouchEvent(float f10, float f11) {
        return getBlockGestures$react_native_screens_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16024a.a(null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBlockGestures$react_native_screens_release()) {
            callOnClick();
        }
        return getBlockGestures$react_native_screens_release();
    }

    @Override // com.facebook.react.uimanager.H
    public int reactTagForTouch(float f10, float f11) {
        throw new IllegalStateException("[RNScreens] DimmingView should never be asked for the view tag!");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, float f10) {
        this(context, f10, new i(null));
        AbstractC5504s.h(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
