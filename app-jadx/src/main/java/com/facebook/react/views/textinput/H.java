package com.facebook.react.views.textinput;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class H implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3320j f38388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventDispatcher f38389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38391d;

    public H(ReactContext reactContext, C3320j editText) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(editText, "editText");
        this.f38388a = editText;
        this.f38389b = f0.c(reactContext, editText.getId());
        this.f38390c = f0.e(reactContext);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s10) {
        AbstractC5504s.h(s10, "s");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s10, int i10, int i11, int i12) {
        AbstractC5504s.h(s10, "s");
        this.f38391d = s10.toString();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s10, int i10, int i11, int i12) {
        AbstractC5504s.h(s10, "s");
        if (this.f38388a.getDisableTextDiffing$ReactAndroid_release()) {
            return;
        }
        if (i12 == 0 && i11 == 0) {
            return;
        }
        String strSubstring = s10.toString().substring(i10, i10 + i12);
        AbstractC5504s.g(strSubstring, "substring(...)");
        String str = this.f38391d;
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String strSubstring2 = str.substring(i10, i10 + i11);
        AbstractC5504s.g(strSubstring2, "substring(...)");
        if (i12 == i11 && AbstractC5504s.c(strSubstring, strSubstring2)) {
            return;
        }
        InterfaceC3282a0 stateWrapper = this.f38388a.getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt("mostRecentEventCount", this.f38388a.B());
            writableNativeMap.putInt("opaqueCacheId", this.f38388a.getId());
            stateWrapper.updateState(writableNativeMap);
        }
        EventDispatcher eventDispatcher = this.f38389b;
        if (eventDispatcher != null) {
            eventDispatcher.d(new C3322l(this.f38390c, this.f38388a.getId(), s10.toString(), this.f38388a.B()));
        }
    }
}
