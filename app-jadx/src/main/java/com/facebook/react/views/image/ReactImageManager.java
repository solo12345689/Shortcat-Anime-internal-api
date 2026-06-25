package com.facebook.react.views.image;

import H7.t;
import Td.InterfaceC2154e;
import Td.z;
import Ud.S;
import android.graphics.PorterDuff;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.EnumC3304u;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.views.image.b;
import java.util.LinkedHashMap;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = ReactImageManager.REACT_CLASS)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000b\b\u0007\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001TB=\b\u0007\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB-\b\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rB7\b\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b)\u0010'J!\u0010*\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b*\u0010'J!\u0010-\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b0\u0010.J\u001f\u00102\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00101\u001a\u00020!H\u0007¢\u0006\u0004\b2\u0010$J'\u00105\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020!H\u0007¢\u0006\u0004\b5\u00106J!\u00108\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b8\u0010'J!\u0010:\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b:\u0010'J\u001f\u0010<\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010;\u001a\u00020!H\u0007¢\u0006\u0004\b<\u0010$J!\u0010>\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b>\u0010.J\u001f\u0010@\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0017H\u0007¢\u0006\u0004\b@\u0010\u001bJ\u001f\u0010B\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010A\u001a\u00020+H\u0007¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0017H\u0007¢\u0006\u0004\bE\u0010\u001bJ!\u0010H\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010FH\u0007¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0JH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\bM\u0010NR&\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010OR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010PR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010QR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010R¨\u0006U"}, d2 = {"Lcom/facebook/react/views/image/ReactImageManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/views/image/h;", "LS5/b;", "draweeControllerBuilder", "Lcom/facebook/react/views/image/a;", "globalImageLoadListener", "Lcom/facebook/react/views/image/f;", "callerContextFactory", "<init>", "(LS5/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;)V", "", "callerContext", "(LS5/b;Ljava/lang/Object;)V", "(LS5/b;Lcom/facebook/react/views/image/a;Ljava/lang/Object;)V", "Lcom/facebook/react/uimanager/b0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/image/h;", "", "getName", "()Ljava/lang/String;", "view", "", "accessible", "LTd/L;", "setAccessible", "(Lcom/facebook/react/views/image/h;Z)V", "Lcom/facebook/react/bridge/ReadableArray;", "sources", "setSrc", "(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableArray;)V", "setSource", "", "blurRadius", "setBlurRadius", "(Lcom/facebook/react/views/image/h;F)V", "analyticTag", "setInternal_AnalyticsTag", "(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V", "source", "setDefaultSource", "setLoadingIndicatorSource", "", "borderColor", "setBorderColor", "(Lcom/facebook/react/views/image/h;Ljava/lang/Integer;)V", "overlayColor", "setOverlayColor", "borderWidth", "setBorderWidth", "index", "borderRadius", "setBorderRadius", "(Lcom/facebook/react/views/image/h;IF)V", "resizeMode", "setResizeMode", "resizeMethod", "setResizeMethod", "resizeMultiplier", "setResizeMultiplier", "tintColor", "setTintColor", "enabled", "setProgressiveRenderingEnabled", "durationMs", "setFadeDuration", "(Lcom/facebook/react/views/image/h;I)V", "shouldNotifyLoadEvents", "setLoadHandlersRegistered", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "setHeaders", "(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableMap;)V", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/image/h;)V", "LS5/b;", "Lcom/facebook/react/views/image/a;", "Lcom/facebook/react/views/image/f;", "Ljava/lang/Object;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactImageManager extends SimpleViewManager<h> {
    private static final String ON_ERROR = "onError";
    private static final String ON_LOAD = "onLoad";
    private static final String ON_LOAD_END = "onLoadEnd";
    private static final String ON_LOAD_START = "onLoadStart";
    private static final String ON_PROGRESS = "onProgress";
    public static final String REACT_CLASS = "RCTImageView";
    private static final String REGISTRATION_NAME = "registrationName";
    private Object callerContext;
    private final f callerContextFactory;
    private final S5.b draweeControllerBuilder;
    private final a globalImageLoadListener;

    public ReactImageManager() {
        this(null, null, null, 7, null);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        b.a aVar = b.f37896h;
        exportedCustomDirectEventTypeConstants.put(aVar.f(4), S.f(z.a(REGISTRATION_NAME, ON_LOAD_START)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(5), S.f(z.a(REGISTRATION_NAME, ON_PROGRESS)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(2), S.f(z.a(REGISTRATION_NAME, ON_LOAD)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(1), S.f(z.a(REGISTRATION_NAME, ON_ERROR)));
        exportedCustomDirectEventTypeConstants.put(aVar.f(3), S.f(z.a(REGISTRATION_NAME, ON_LOAD_END)));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @B7.a(name = "accessible")
    public final void setAccessible(h view, boolean accessible) {
        AbstractC5504s.h(view, "view");
        view.setFocusable(accessible);
    }

    @B7.a(name = "blurRadius")
    public final void setBlurRadius(h view, float blurRadius) {
        AbstractC5504s.h(view, "view");
        view.setBlurRadius(blurRadius);
    }

    @B7.a(customType = "Color", name = "borderColor")
    public final void setBorderColor(h view, Integer borderColor) {
        AbstractC5504s.h(view, "view");
        C3281a.r(view, t.f8115b, borderColor);
    }

    @B7.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(h view, int index, float borderRadius) {
        AbstractC5504s.h(view, "view");
        C3281a.s(view, H7.i.values()[index], Float.isNaN(borderRadius) ? null : new C3303t(borderRadius, EnumC3304u.f37832a));
    }

    @B7.a(name = "borderWidth")
    public final void setBorderWidth(h view, float borderWidth) {
        AbstractC5504s.h(view, "view");
        C3281a.u(view, t.f8115b, Float.valueOf(borderWidth));
    }

    @B7.a(name = "defaultSource")
    public final void setDefaultSource(h view, String source) {
        AbstractC5504s.h(view, "view");
        view.setDefaultSource(source);
    }

    @B7.a(name = "fadeDuration")
    public final void setFadeDuration(h view, int durationMs) {
        AbstractC5504s.h(view, "view");
        view.setFadeDuration(durationMs);
    }

    @B7.a(name = "headers")
    public final void setHeaders(h view, ReadableMap headers) {
        AbstractC5504s.h(view, "view");
        if (headers != null) {
            view.setHeaders(headers);
        }
    }

    @B7.a(name = "internal_analyticTag")
    public final void setInternal_AnalyticsTag(h view, String analyticTag) {
        AbstractC5504s.h(view, "view");
    }

    @B7.a(name = "shouldNotifyLoadEvents")
    public final void setLoadHandlersRegistered(h view, boolean shouldNotifyLoadEvents) {
        AbstractC5504s.h(view, "view");
        view.setShouldNotifyLoadEvents(shouldNotifyLoadEvents);
    }

    @B7.a(name = "loadingIndicatorSrc")
    public final void setLoadingIndicatorSource(h view, String source) {
        AbstractC5504s.h(view, "view");
        view.setLoadingIndicatorSource(source);
    }

    @B7.a(customType = "Color", name = "overlayColor")
    public final void setOverlayColor(h view, Integer overlayColor) {
        AbstractC5504s.h(view, "view");
        if (overlayColor == null) {
            view.setOverlayColor(0);
        } else {
            view.setOverlayColor(overlayColor.intValue());
        }
    }

    @B7.a(name = "progressiveRenderingEnabled")
    public final void setProgressiveRenderingEnabled(h view, boolean enabled) {
        AbstractC5504s.h(view, "view");
        view.setProgressiveRenderingEnabled(enabled);
    }

    @B7.a(name = "resizeMethod")
    public final void setResizeMethod(h view, String resizeMethod) {
        AbstractC5504s.h(view, "view");
        view.setResizeMethod(c.f37904a.a(resizeMethod));
    }

    @B7.a(name = "resizeMode")
    public final void setResizeMode(h view, String resizeMode) {
        AbstractC5504s.h(view, "view");
        view.setScaleType(d.c(resizeMode));
        view.setTileMode(d.d(resizeMode));
    }

    @B7.a(name = "resizeMultiplier")
    public final void setResizeMultiplier(h view, float resizeMultiplier) {
        AbstractC5504s.h(view, "view");
        if (resizeMultiplier < 0.01f) {
            AbstractC7283a.I("ReactNative", "Invalid resize multiplier: '" + resizeMultiplier + "'");
        }
        view.setResizeMultiplier(resizeMultiplier);
    }

    @B7.a(name = "source")
    public final void setSource(h view, ReadableArray sources) {
        AbstractC5504s.h(view, "view");
        view.setSource(sources);
    }

    @B7.a(name = "src")
    public final void setSrc(h view, ReadableArray sources) {
        AbstractC5504s.h(view, "view");
        setSource(view, sources);
    }

    @B7.a(customType = "Color", name = "tintColor")
    public final void setTintColor(h view, Integer tintColor) {
        AbstractC5504s.h(view, "view");
        if (tintColor == null) {
            view.clearColorFilter();
        } else {
            view.setColorFilter(tintColor.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public ReactImageManager(S5.b bVar) {
        this(bVar, null, null, 6, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        Object obj = this.callerContext;
        if (obj == null) {
            obj = null;
        }
        S5.b bVarH = this.draweeControllerBuilder;
        if (bVarH == null) {
            bVarH = O5.d.h();
        }
        AbstractC5504s.e(bVarH);
        return new h(context, bVarH, null, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(h view) {
        AbstractC5504s.h(view, "view");
        super.onAfterUpdateTransaction(view);
        view.n();
    }

    public ReactImageManager(S5.b bVar, a aVar) {
        this(bVar, aVar, null, 4, null);
    }

    public /* synthetic */ ReactImageManager(S5.b bVar, a aVar, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : fVar);
    }

    public ReactImageManager(S5.b bVar, a aVar, f fVar) {
        this.draweeControllerBuilder = bVar;
    }

    @InterfaceC2154e
    public ReactImageManager(S5.b bVar, Object obj) {
        this(bVar, (a) null, (f) null);
        this.callerContext = obj;
    }

    @InterfaceC2154e
    public ReactImageManager(S5.b bVar, a aVar, Object obj) {
        this(bVar, aVar, (f) null);
        this.callerContext = obj;
    }
}
