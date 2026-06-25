package com.facebook.react.fabric.mounting.mountitems;

import Td.z;
import Ud.S;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;", "", "<init>", "()V", "componentNames", "", "", "getFabricComponentName", "componentName", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FabricNameComponentMapping {
    public static final FabricNameComponentMapping INSTANCE = new FabricNameComponentMapping();
    private static final Map<String, String> componentNames = S.l(z.a("View", ReactViewManager.REACT_CLASS), z.a("Image", ReactImageManager.REACT_CLASS), z.a("ScrollView", ReactScrollViewManager.REACT_CLASS), z.a("Slider", "RCTSlider"), z.a("ModalHostView", ReactModalHostManager.REACT_CLASS), z.a("Paragraph", "RCTText"), z.a("Text", "RCTText"), z.a("RawText", "RCTRawText"), z.a("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS), z.a("ShimmeringView", "RKShimmeringView"), z.a("TemplateView", "RCTTemplateView"), z.a("AxialGradientView", "RCTAxialGradientView"), z.a("Video", "RCTVideo"), z.a("Map", "RCTMap"), z.a("WebView", "RCTWebView"), z.a("Keyframes", "RCTKeyframes"), z.a("ImpressionTrackingView", "RCTImpressionTrackingView"));

    private FabricNameComponentMapping() {
    }

    public static final String getFabricComponentName(String componentName) {
        AbstractC5504s.h(componentName, "componentName");
        String str = componentNames.get(componentName);
        return str == null ? componentName : str;
    }
}
