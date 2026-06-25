package K7;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface S extends com.facebook.react.uimanager.A0 {
    void blur(View view);

    void cancelSearch(View view);

    void clearText(View view);

    void focus(View view);

    void setAllowToolbarIntegration(View view, boolean z10);

    void setAutoCapitalize(View view, String str);

    void setAutoFocus(View view, boolean z10);

    void setBarTintColor(View view, Integer num);

    void setCancelButtonText(View view, String str);

    void setDisableBackButtonOverride(View view, boolean z10);

    void setHeaderIconColor(View view, Integer num);

    void setHideNavigationBar(View view, String str);

    void setHideWhenScrolling(View view, boolean z10);

    void setHintTextColor(View view, Integer num);

    void setInputType(View view, String str);

    void setObscureBackground(View view, String str);

    void setPlaceholder(View view, String str);

    void setPlacement(View view, String str);

    void setShouldShowHintSearchIcon(View view, boolean z10);

    void setText(View view, String str);

    void setTextColor(View view, Integer num);

    void setTintColor(View view, Integer num);

    void toggleCancelButton(View view, boolean z10);
}
