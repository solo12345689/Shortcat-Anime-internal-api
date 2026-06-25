package K7;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface L extends com.facebook.react.uimanager.A0 {
    void setBackButtonDisplayMode(View view, String str);

    void setBackButtonInCustomView(View view, boolean z10);

    void setBackTitle(View view, String str);

    void setBackTitleFontFamily(View view, String str);

    void setBackTitleFontSize(View view, int i10);

    void setBackTitleVisible(View view, boolean z10);

    void setBackgroundColor(View view, Integer num);

    void setBlurEffect(View view, String str);

    void setColor(View view, Integer num);

    void setDirection(View view, String str);

    void setDisableBackButtonMenu(View view, boolean z10);

    void setHeaderLeftBarButtonItems(View view, ReadableArray readableArray);

    void setHeaderRightBarButtonItems(View view, ReadableArray readableArray);

    void setHidden(View view, boolean z10);

    void setHideBackButton(View view, boolean z10);

    void setHideShadow(View view, boolean z10);

    void setLargeTitle(View view, boolean z10);

    void setLargeTitleBackgroundColor(View view, Integer num);

    void setLargeTitleColor(View view, Integer num);

    void setLargeTitleFontFamily(View view, String str);

    void setLargeTitleFontSize(View view, int i10);

    void setLargeTitleFontWeight(View view, String str);

    void setLargeTitleHideShadow(View view, boolean z10);

    void setSynchronousShadowStateUpdatesEnabled(View view, boolean z10);

    void setTitle(View view, String str);

    void setTitleColor(View view, Integer num);

    void setTitleFontFamily(View view, String str);

    void setTitleFontSize(View view, int i10);

    void setTitleFontWeight(View view, String str);

    void setTopInsetEnabled(View view, boolean z10);

    void setTranslucent(View view, boolean z10);

    void setUserInterfaceStyle(View view, String str);
}
