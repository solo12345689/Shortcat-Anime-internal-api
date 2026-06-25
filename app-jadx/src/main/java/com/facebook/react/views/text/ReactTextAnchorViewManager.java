package com.facebook.react.views.text;

import android.content.Context;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.EnumC3304u;
import com.facebook.react.views.text.d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b,\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001bH\u0001¢\u0006\u0004\b!\u0010\u001eJ!\u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b$\u0010\u0016J\u001f\u0010(\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\bH\u0001¢\u0006\u0004\b'\u0010\fJ!\u0010,\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b.\u0010\u0016J'\u00104\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u001bH\u0001¢\u0006\u0004\b2\u00103J!\u00107\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b6\u0010\u0016J'\u0010:\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u001bH\u0001¢\u0006\u0004\b9\u00103J)\u0010=\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b;\u0010<J\u001f\u0010@\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\bH\u0001¢\u0006\u0004\b?\u0010\fJ\u001f\u0010C\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\bH\u0001¢\u0006\u0004\bB\u0010\fJ!\u0010F\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010D\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\bE\u0010\u0016¨\u0006G"}, d2 = {"Lcom/facebook/react/views/text/ReactTextAnchorViewManager;", "Lcom/facebook/react/views/text/d;", "C", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/text/m;", "<init>", "()V", "view", "", "accessible", "LTd/L;", "setAccessible$ReactAndroid_release", "(Lcom/facebook/react/views/text/m;Z)V", "setAccessible", "", "numberOfLines", "setNumberOfLines$ReactAndroid_release", "(Lcom/facebook/react/views/text/m;I)V", "setNumberOfLines", "", "ellipsizeMode", "setEllipsizeMode$ReactAndroid_release", "(Lcom/facebook/react/views/text/m;Ljava/lang/String;)V", "setEllipsizeMode", "adjustsFontSizeToFit", "setAdjustFontSizeToFit$ReactAndroid_release", "setAdjustFontSizeToFit", "", "fontSize", "setFontSize$ReactAndroid_release", "(Lcom/facebook/react/views/text/m;F)V", "setFontSize", "letterSpacing", "setLetterSpacing$ReactAndroid_release", "setLetterSpacing", "textAlignVertical", "setTextAlignVertical$ReactAndroid_release", "setTextAlignVertical", "isSelectable", "setSelectable$ReactAndroid_release", "setSelectable", "color", "setSelectionColor$ReactAndroid_release", "(Lcom/facebook/react/views/text/m;Ljava/lang/Integer;)V", "setSelectionColor", "frequency", "setAndroidHyphenationFrequency$ReactAndroid_release", "setAndroidHyphenationFrequency", "index", "borderRadius", "setBorderRadius$ReactAndroid_release", "(Lcom/facebook/react/views/text/m;IF)V", "setBorderRadius", "borderStyle", "setBorderStyle$ReactAndroid_release", "setBorderStyle", "width", "setBorderWidth$ReactAndroid_release", "setBorderWidth", "setBorderColor$ReactAndroid_release", "(Lcom/facebook/react/views/text/m;ILjava/lang/Integer;)V", "setBorderColor", "includepad", "setIncludeFontPadding$ReactAndroid_release", "setIncludeFontPadding", "disabled", "setDisabled$ReactAndroid_release", "setDisabled", "type", "setDataDetectorType$ReactAndroid_release", "setDataDetectorType", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ReactTextAnchorViewManager<C extends d> extends BaseViewManager<m, C> {
    @B7.a(name = "accessible")
    public final void setAccessible$ReactAndroid_release(m view, boolean accessible) {
        AbstractC5504s.h(view, "view");
        view.setFocusable(accessible);
    }

    @B7.a(name = "adjustsFontSizeToFit")
    public final void setAdjustFontSizeToFit$ReactAndroid_release(m view, boolean adjustsFontSizeToFit) {
        AbstractC5504s.h(view, "view");
        view.setAdjustFontSizeToFit(adjustsFontSizeToFit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r5.equals("none") == false) goto L21;
     */
    @B7.a(name = "android_hyphenationFrequency")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setAndroidHyphenationFrequency$ReactAndroid_release(com.facebook.react.views.text.m r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r4, r0)
            r0 = 0
            if (r5 == 0) goto L5a
            int r1 = r5.hashCode()
            r2 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r1 == r2) goto L33
            r2 = 3154575(0x30228f, float:4.420501E-39)
            if (r1 == r2) goto L25
            r2 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 == r2) goto L1c
            goto L3b
        L1c:
            java.lang.String r1 = "none"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L5a
            goto L3b
        L25:
            java.lang.String r1 = "full"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L2e
            goto L3b
        L2e:
            r5 = 2
            r4.setHyphenationFrequency(r5)
            return
        L33:
            java.lang.String r1 = "normal"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L55
        L3b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid android_hyphenationFrequency: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "ReactNative"
            z5.AbstractC7283a.I(r1, r5)
            r4.setHyphenationFrequency(r0)
            return
        L55:
            r5 = 1
            r4.setHyphenationFrequency(r5)
            return
        L5a:
            r4.setHyphenationFrequency(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextAnchorViewManager.setAndroidHyphenationFrequency$ReactAndroid_release(com.facebook.react.views.text.m, java.lang.String):void");
    }

    @B7.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public final void setBorderColor$ReactAndroid_release(m view, int index, Integer color) {
        AbstractC5504s.h(view, "view");
        C3281a.r(view, H7.t.values()[index], color);
    }

    @B7.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius$ReactAndroid_release(m view, int index, float borderRadius) {
        AbstractC5504s.h(view, "view");
        C3281a.s(view, H7.i.values()[index], Float.isNaN(borderRadius) ? null : new C3303t(borderRadius, EnumC3304u.f37832a));
    }

    @B7.a(name = "borderStyle")
    public final void setBorderStyle$ReactAndroid_release(m view, String borderStyle) {
        AbstractC5504s.h(view, "view");
        C3281a.t(view, borderStyle == null ? null : H7.k.f8072a.a(borderStyle));
    }

    @B7.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public final void setBorderWidth$ReactAndroid_release(m view, int index, float width) {
        AbstractC5504s.h(view, "view");
        C3281a.u(view, H7.t.values()[index], Float.valueOf(width));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @B7.a(name = "dataDetectorType")
    public final void setDataDetectorType$ReactAndroid_release(m view, String type) {
        AbstractC5504s.h(view, "view");
        if (type != null) {
            switch (type.hashCode()) {
                case -1192969641:
                    if (type.equals("phoneNumber")) {
                        view.setLinkifyMask(4);
                        return;
                    }
                    break;
                case 96673:
                    if (type.equals("all")) {
                        view.setLinkifyMask(15);
                        return;
                    }
                    break;
                case 3321850:
                    if (type.equals("link")) {
                        view.setLinkifyMask(1);
                        return;
                    }
                    break;
                case 96619420:
                    if (type.equals("email")) {
                        view.setLinkifyMask(2);
                        return;
                    }
                    break;
            }
        }
        view.setLinkifyMask(0);
    }

    @B7.a(defaultBoolean = false, name = "disabled")
    public final void setDisabled$ReactAndroid_release(m view, boolean disabled) {
        AbstractC5504s.h(view, "view");
        view.setEnabled(!disabled);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r4.equals("tail") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @B7.a(name = "ellipsizeMode")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setEllipsizeMode$ReactAndroid_release(com.facebook.react.views.text.m r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r3, r0)
            if (r4 == 0) goto L5f
            int r0 = r4.hashCode()
            switch(r0) {
                case -1074341483: goto L35;
                case 3056464: goto L27;
                case 3198432: goto L18;
                case 3552336: goto Lf;
                default: goto Le;
            }
        Le:
            goto L3d
        Lf:
            java.lang.String r0 = "tail"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L5f
            goto L3d
        L18:
            java.lang.String r0 = "head"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L21
            goto L3d
        L21:
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.START
            r3.setEllipsizeLocation(r4)
            return
        L27:
            java.lang.String r0 = "clip"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L30
            goto L3d
        L30:
            r4 = 0
            r3.setEllipsizeLocation(r4)
            return
        L35:
            java.lang.String r0 = "middle"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L59
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid ellipsizeMode: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "ReactNative"
            z5.AbstractC7283a.I(r0, r4)
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsizeLocation(r4)
            return
        L59:
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.MIDDLE
            r3.setEllipsizeLocation(r4)
            return
        L5f:
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsizeLocation(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextAnchorViewManager.setEllipsizeMode$ReactAndroid_release(com.facebook.react.views.text.m, java.lang.String):void");
    }

    @B7.a(name = "fontSize")
    public final void setFontSize$ReactAndroid_release(m view, float fontSize) {
        AbstractC5504s.h(view, "view");
        view.setFontSize(fontSize);
    }

    @B7.a(defaultBoolean = true, name = "includeFontPadding")
    public final void setIncludeFontPadding$ReactAndroid_release(m view, boolean includepad) {
        AbstractC5504s.h(view, "view");
        view.setIncludeFontPadding(includepad);
    }

    @B7.a(defaultFloat = 0.0f, name = "letterSpacing")
    public final void setLetterSpacing$ReactAndroid_release(m view, float letterSpacing) {
        AbstractC5504s.h(view, "view");
        view.setLetterSpacing(letterSpacing);
    }

    @B7.a(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public final void setNumberOfLines$ReactAndroid_release(m view, int numberOfLines) {
        AbstractC5504s.h(view, "view");
        view.setNumberOfLines(numberOfLines);
    }

    @B7.a(name = "selectable")
    public final void setSelectable$ReactAndroid_release(m view, boolean isSelectable) {
        AbstractC5504s.h(view, "view");
        view.setTextIsSelectable(isSelectable);
    }

    @B7.a(customType = "Color", name = "selectionColor")
    public final void setSelectionColor$ReactAndroid_release(m view, Integer color) {
        int iC;
        AbstractC5504s.h(view, "view");
        if (color != null) {
            iC = color.intValue();
        } else {
            Context context = view.getContext();
            AbstractC5504s.g(context, "getContext(...)");
            iC = a.c(context);
        }
        view.setHighlightColor(iC);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r5.equals("auto") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @B7.a(name = "textAlignVertical")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTextAlignVertical$ReactAndroid_release(com.facebook.react.views.text.m r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r4, r0)
            r0 = 0
            if (r5 == 0) goto L5f
            int r1 = r5.hashCode()
            switch(r1) {
                case -1383228885: goto L37;
                case -1364013995: goto L28;
                case 115029: goto L19;
                case 3005871: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L3f
        L10:
            java.lang.String r1 = "auto"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L5f
            goto L3f
        L19:
            java.lang.String r1 = "top"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L22
            goto L3f
        L22:
            r5 = 48
            r4.setGravityVertical(r5)
            return
        L28:
            java.lang.String r1 = "center"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L31
            goto L3f
        L31:
            r5 = 16
            r4.setGravityVertical(r5)
            return
        L37:
            java.lang.String r1 = "bottom"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L59
        L3f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid textAlignVertical: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "ReactNative"
            z5.AbstractC7283a.I(r1, r5)
            r4.setGravityVertical(r0)
            return
        L59:
            r5 = 80
            r4.setGravityVertical(r5)
            return
        L5f:
            r4.setGravityVertical(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextAnchorViewManager.setTextAlignVertical$ReactAndroid_release(com.facebook.react.views.text.m, java.lang.String):void");
    }
}
