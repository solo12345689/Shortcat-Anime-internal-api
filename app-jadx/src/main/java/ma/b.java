package Ma;

import android.content.res.Configuration;
import android.view.WindowInsets;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.views.view.g;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3284b0 f12314a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C3284b0 reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f12314a = reactContext;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        super.setBackgroundColor(c.b(this.f12314a));
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        AbstractC5504s.g(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        super.setBackgroundColor(c.b(this.f12314a));
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        super.setBackgroundColor(c.b(this.f12314a));
    }

    @Override // com.facebook.react.views.view.g, android.view.View
    public void setBackgroundColor(int i10) {
    }
}
