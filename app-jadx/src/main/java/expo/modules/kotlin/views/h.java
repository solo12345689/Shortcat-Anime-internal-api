package expo.modules.kotlin.views;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.InterfaceC3282a0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends LinearLayout {
    private final Ub.d appContext;
    private final n shadowNodeProxy;
    private final boolean shouldUseAndroidLayout;
    private InterfaceC3282a0 stateWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Ub.d appContext) {
        super(context);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(appContext, "appContext");
        this.appContext = appContext;
        this.shadowNodeProxy = new n(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(h hVar) {
        hVar.measureAndLayout();
    }

    public void clipToPaddingBox(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        if (getClipToPadding()) {
            C3281a.a(this, canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        clipToPaddingBox(canvas);
        super.dispatchDraw(canvas);
    }

    public final Ub.d getAppContext() {
        return this.appContext;
    }

    public final n getShadowNodeProxy() {
        return this.shadowNodeProxy;
    }

    public boolean getShouldUseAndroidLayout() {
        return this.shouldUseAndroidLayout;
    }

    public final InterfaceC3282a0 getStateWrapper() {
        return this.stateWrapper;
    }

    public final void measureAndLayout() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (getShouldUseAndroidLayout()) {
            post(new Runnable() { // from class: expo.modules.kotlin.views.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.b(this.f46207a);
                }
            });
        }
    }

    public final void setStateWrapper(InterfaceC3282a0 interfaceC3282a0) {
        this.stateWrapper = interfaceC3282a0;
    }
}
