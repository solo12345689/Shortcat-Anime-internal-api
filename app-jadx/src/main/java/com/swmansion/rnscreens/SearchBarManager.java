package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.q0;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = SearchBarManager.REACT_CLASS)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001DB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001aH\u0017¢\u0006\u0004\b#\u0010\u001dJ!\u0010%\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b%\u0010\u0019J!\u0010'\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b'\u0010\u0019J!\u0010(\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b(\u0010!J!\u0010)\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b)\u0010!J!\u0010*\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b*\u0010!J\u001f\u0010,\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u001aH\u0017¢\u0006\u0004\b,\u0010\u001dJ\u001b\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020.0-H\u0016¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b1\u0010\u0016J\u0019\u00102\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b2\u0010\u0016J\u0019\u00103\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b3\u0010\u0016J!\u00105\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u00104\u001a\u00020\u001aH\u0016¢\u0006\u0004\b5\u0010\u001dJ#\u00107\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u00106\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b7\u0010\u0019J\u0019\u00108\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b8\u0010\u0016J!\u00109\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b9\u0010\u0019J\u001f\u0010;\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u001aH\u0016¢\u0006\u0004\b;\u0010\u001dJ!\u0010<\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010:\u001a\u00020\u001aH\u0016¢\u0006\u0004\b<\u0010\u001dJ#\u0010=\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b=\u0010\u0019J#\u0010>\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b>\u0010\u0019J#\u0010?\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b?\u0010\u0019J#\u0010@\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010:\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b@\u0010!R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/swmansion/rnscreens/SearchBarManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/n0;", "LK7/S;", "<init>", "()V", "", "propName", "LTd/L;", "logNotAvailable", "(Ljava/lang/String;)V", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/swmansion/rnscreens/n0;", "view", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/n0;)V", "autoCapitalize", "setAutoCapitalize", "(Lcom/swmansion/rnscreens/n0;Ljava/lang/String;)V", "", "autoFocus", "setAutoFocus", "(Lcom/swmansion/rnscreens/n0;Z)V", "", "color", "setBarTintColor", "(Lcom/swmansion/rnscreens/n0;Ljava/lang/Integer;)V", "disableBackButtonOverride", "setDisableBackButtonOverride", "inputType", "setInputType", "placeholder", "setPlaceholder", "setTextColor", "setHeaderIconColor", "setHintTextColor", "shouldShowHintSearchIcon", "setShouldShowHintSearchIcon", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "blur", "focus", "clearText", "flag", "toggleCancelButton", "text", "setText", "cancelSearch", "setPlacement", "value", "setAllowToolbarIntegration", "setHideWhenScrolling", "setObscureBackground", "setHideNavigationBar", "setCancelButtonText", "setTintColor", "delegate", "Lcom/facebook/react/uimanager/q0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SearchBarManager extends ViewGroupManager<n0> implements K7.S {
    public static final String REACT_CLASS = "RNSSearchBar";
    private final q0 delegate;

    public SearchBarManager() {
        super(null, 1, null);
        this.delegate = new K7.Q(this);
    }

    private final void logNotAvailable(String propName) {
        Log.w("[RNScreens]", propName + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected q0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return Ud.S.k(Td.z.a("topSearchBlur", Ud.S.k(Td.z.a("registrationName", "onSearchBlur"))), Td.z.a("topChangeText", Ud.S.k(Td.z.a("registrationName", "onChangeText"))), Td.z.a("topClose", Ud.S.k(Td.z.a("registrationName", "onClose"))), Td.z.a("topSearchFocus", Ud.S.k(Td.z.a("registrationName", "onSearchFocus"))), Td.z.a("topOpen", Ud.S.k(Td.z.a("registrationName", "onOpen"))), Td.z.a("topSearchButtonPress", Ud.S.k(Td.z.a("registrationName", "onSearchButtonPress"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // K7.S
    public void blur(n0 view) {
        if (view != null) {
            view.H();
        }
    }

    @Override // K7.S
    public void cancelSearch(n0 view) {
        if (view != null) {
            view.I();
        }
    }

    @Override // K7.S
    public void clearText(n0 view) {
        if (view != null) {
            view.J();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public n0 createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return new n0(context);
    }

    @Override // K7.S
    public void focus(n0 view) {
        if (view != null) {
            view.M();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(n0 view) {
        AbstractC5504s.h(view, "view");
        super.onAfterUpdateTransaction(view);
        view.T();
    }

    @Override // K7.S
    public void setAllowToolbarIntegration(n0 view, boolean value) {
        AbstractC5504s.h(view, "view");
        logNotAvailable("allowToolbarIntegration");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r3.equals("none") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r3.equals("systemDefault") != false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // K7.S
    @B7.a(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAutoCapitalize(com.swmansion.rnscreens.n0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r2, r0)
            if (r3 == 0) goto L4a
            int r0 = r3.hashCode()
            switch(r0) {
                case -721225454: goto L39;
                case 3387192: goto L30;
                case 113318569: goto L25;
                case 490141296: goto L1a;
                case 1245424234: goto Lf;
                default: goto Le;
            }
        Le:
            goto L42
        Lf:
            java.lang.String r0 = "characters"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L42
            com.swmansion.rnscreens.n0$a r3 = com.swmansion.rnscreens.n0.a.f44664d
            goto L4c
        L1a:
            java.lang.String r0 = "sentences"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L42
            com.swmansion.rnscreens.n0$a r3 = com.swmansion.rnscreens.n0.a.f44663c
            goto L4c
        L25:
            java.lang.String r0 = "words"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L42
            com.swmansion.rnscreens.n0$a r3 = com.swmansion.rnscreens.n0.a.f44662b
            goto L4c
        L30:
            java.lang.String r0 = "none"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L42
            goto L4a
        L39:
            java.lang.String r0 = "systemDefault"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L42
            goto L4a
        L42:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden auto capitalize value passed"
            r2.<init>(r3)
            throw r2
        L4a:
            com.swmansion.rnscreens.n0$a r3 = com.swmansion.rnscreens.n0.a.f44661a
        L4c:
            r2.setAutoCapitalize(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setAutoCapitalize(com.swmansion.rnscreens.n0, java.lang.String):void");
    }

    @Override // K7.S
    @B7.a(name = "autoFocus")
    public void setAutoFocus(n0 view, boolean autoFocus) {
        AbstractC5504s.h(view, "view");
        view.setAutoFocus(autoFocus);
    }

    @Override // K7.S
    @B7.a(customType = "Color", name = "barTintColor")
    public void setBarTintColor(n0 view, Integer color) {
        AbstractC5504s.h(view, "view");
        view.setTintColor(color);
    }

    @Override // K7.S
    public void setCancelButtonText(n0 view, String value) {
        logNotAvailable("cancelButtonText");
    }

    @Override // K7.S
    @B7.a(name = "disableBackButtonOverride")
    public void setDisableBackButtonOverride(n0 view, boolean disableBackButtonOverride) {
        AbstractC5504s.h(view, "view");
        view.setShouldOverrideBackButton(!disableBackButtonOverride);
    }

    @Override // K7.S
    @B7.a(customType = "Color", name = "headerIconColor")
    public void setHeaderIconColor(n0 view, Integer color) {
        AbstractC5504s.h(view, "view");
        view.setHeaderIconColor(color);
    }

    @Override // K7.S
    public void setHideNavigationBar(n0 view, String value) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // K7.S
    public void setHideWhenScrolling(n0 view, boolean value) {
        logNotAvailable("hideWhenScrolling");
    }

    @Override // K7.S
    @B7.a(customType = "Color", name = "hintTextColor")
    public void setHintTextColor(n0 view, Integer color) {
        AbstractC5504s.h(view, "view");
        view.setHintTextColor(color);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r3.equals("text") != false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // K7.S
    @B7.a(name = "inputType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setInputType(com.swmansion.rnscreens.n0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r2, r0)
            if (r3 == 0) goto L41
            int r0 = r3.hashCode()
            switch(r0) {
                case -1034364087: goto L2e;
                case 3556653: goto L25;
                case 96619420: goto L1a;
                case 106642798: goto Lf;
                default: goto Le;
            }
        Le:
            goto L39
        Lf:
            java.lang.String r0 = "phone"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            com.swmansion.rnscreens.n0$b r3 = com.swmansion.rnscreens.n0.b.f44668b
            goto L43
        L1a:
            java.lang.String r0 = "email"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            com.swmansion.rnscreens.n0$b r3 = com.swmansion.rnscreens.n0.b.f44670d
            goto L43
        L25:
            java.lang.String r0 = "text"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            goto L41
        L2e:
            java.lang.String r0 = "number"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            com.swmansion.rnscreens.n0$b r3 = com.swmansion.rnscreens.n0.b.f44669c
            goto L43
        L39:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden input type value"
            r2.<init>(r3)
            throw r2
        L41:
            com.swmansion.rnscreens.n0$b r3 = com.swmansion.rnscreens.n0.b.f44667a
        L43:
            r2.setInputType(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setInputType(com.swmansion.rnscreens.n0, java.lang.String):void");
    }

    @Override // K7.S
    public void setObscureBackground(n0 view, String value) {
        logNotAvailable("obscureBackground");
    }

    @Override // K7.S
    @B7.a(name = "placeholder")
    public void setPlaceholder(n0 view, String placeholder) {
        AbstractC5504s.h(view, "view");
        if (placeholder != null) {
            view.setPlaceholder(placeholder);
        }
    }

    @Override // K7.S
    public void setPlacement(n0 view, String placeholder) {
        AbstractC5504s.h(view, "view");
        logNotAvailable("setPlacement");
    }

    @Override // K7.S
    @B7.a(name = "shouldShowHintSearchIcon")
    public void setShouldShowHintSearchIcon(n0 view, boolean shouldShowHintSearchIcon) {
        AbstractC5504s.h(view, "view");
        view.setShouldShowHintSearchIcon(shouldShowHintSearchIcon);
    }

    @Override // K7.S
    public void setText(n0 view, String text) {
        if (view != null) {
            view.O(text);
        }
    }

    @Override // K7.S
    @B7.a(customType = "Color", name = "textColor")
    public void setTextColor(n0 view, Integer color) {
        AbstractC5504s.h(view, "view");
        view.setTextColor(color);
    }

    @Override // K7.S
    public void setTintColor(n0 view, Integer value) {
        logNotAvailable("tintColor");
    }

    @Override // K7.S
    public void toggleCancelButton(n0 view, boolean flag) {
        if (view != null) {
            view.R(flag);
        }
    }
}
