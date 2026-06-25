package com.facebook.react.views.textinput;

import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.view.AbstractC2747a0;
import com.facebook.react.AbstractC3251p;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.j0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends com.facebook.react.views.text.d implements com.facebook.yoga.o {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final a f38380I = new a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f38381D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private EditText f38382E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p f38383F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private String f38384G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private String f38385H;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        W6.b.a("ReactTextInputShadowNode", W6.a.f20778b);
    }

    public /* synthetic */ F(com.facebook.react.views.text.o oVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : oVar);
    }

    private final EditText I() {
        return new EditText(new androidx.appcompat.view.d(getThemedContext(), AbstractC3251p.f37157g));
    }

    @Override // com.facebook.react.uimanager.P
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.uimanager.P
    public boolean isYogaLeafNode() {
        return true;
    }

    @Override // com.facebook.yoga.o
    public long measure(com.facebook.yoga.r node, float f10, com.facebook.yoga.p widthMode, float f11, com.facebook.yoga.p heightMode) {
        AbstractC5504s.h(node, "node");
        AbstractC5504s.h(widthMode, "widthMode");
        AbstractC5504s.h(heightMode, "heightMode");
        EditText editText = this.f38382E;
        if (editText == null) {
            throw new IllegalStateException("Required value was null.");
        }
        p pVar = this.f38383F;
        if (pVar == null) {
            editText.setTextSize(0, w().c());
            if (t() != -1) {
                editText.setLines(t());
            }
            if (editText.getBreakStrategy() != x()) {
                editText.setBreakStrategy(x());
            }
        } else if (pVar != null) {
            pVar.a(editText);
        }
        editText.setHint(this.f38385H);
        editText.measure(com.facebook.react.views.view.c.a(f10, widthMode), com.facebook.react.views.view.c.a(f11, heightMode));
        return com.facebook.yoga.q.b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // com.facebook.react.uimanager.P
    public void onCollectExtraUpdates(j0 uiViewOperationQueue) {
        AbstractC5504s.h(uiViewOperationQueue, "uiViewOperationQueue");
        super.onCollectExtraUpdates(uiViewOperationQueue);
        if (this.f38381D != -1) {
            uiViewOperationQueue.O(getReactTag(), new com.facebook.react.views.text.i(H(this, this.f38384G, false, null), this.f38381D, j(), getPadding(0), getPadding(1), getPadding(2), getPadding(3), v(), x(), r()));
        }
    }

    @Override // com.facebook.react.uimanager.P, com.facebook.react.uimanager.O
    public void setLocalData(Object data) {
        AbstractC5504s.h(data, "data");
        Q6.a.a(data instanceof p);
        this.f38383F = (p) data;
        dirty();
    }

    @B7.a(name = "mostRecentEventCount")
    public final void setMostRecentEventCount(int i10) {
        this.f38381D = i10;
    }

    @Override // com.facebook.react.uimanager.P, com.facebook.react.uimanager.O
    public void setPadding(int i10, float f10) {
        super.setPadding(i10, f10);
        markUpdated();
    }

    @B7.a(name = "placeholder")
    public final void setPlaceholder(String str) {
        this.f38385H = str;
        markUpdated();
    }

    @B7.a(name = "text")
    public final void setText(String str) {
        this.f38384G = str;
        markUpdated();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r4.equals("simple") == false) goto L21;
     */
    @Override // com.facebook.react.views.text.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTextBreakStrategy(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L55
            int r1 = r4.hashCode()
            r2 = -1924829944(0xffffffff8d456d08, float:-6.0836553E-31)
            if (r1 == r2) goto L2e
            r2 = -902286926(0xffffffffca3831b2, float:-3017836.5)
            if (r1 == r2) goto L25
            r2 = 336871677(0x141440fd, float:7.484907E-27)
            if (r1 == r2) goto L17
            goto L36
        L17:
            java.lang.String r1 = "highQuality"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L20
            goto L36
        L20:
            r4 = 1
            r3.G(r4)
            return
        L25:
            java.lang.String r1 = "simple"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L55
            goto L36
        L2e:
            java.lang.String r1 = "balanced"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L50
        L36:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid textBreakStrategy: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "ReactNative"
            z5.AbstractC7283a.I(r1, r4)
            r3.G(r0)
            return
        L50:
            r4 = 2
            r3.G(r4)
            return
        L55:
            r3.G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.F.setTextBreakStrategy(java.lang.String):void");
    }

    @Override // com.facebook.react.uimanager.P, com.facebook.react.uimanager.O
    public void setThemedContext(C3284b0 themedContext) {
        AbstractC5504s.h(themedContext, "themedContext");
        super.setThemedContext(themedContext);
        EditText editTextI = I();
        setDefaultPadding(4, AbstractC2747a0.D(editTextI));
        setDefaultPadding(1, editTextI.getPaddingTop());
        setDefaultPadding(5, AbstractC2747a0.C(editTextI));
        setDefaultPadding(3, editTextI.getPaddingBottom());
        this.f38382E = editTextI;
        editTextI.setPadding(0, 0, 0, 0);
        EditText editText = this.f38382E;
        if (editText != null) {
            editText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
    }

    public F(com.facebook.react.views.text.o oVar) {
        super(oVar);
        this.f38381D = -1;
        G(1);
        setMeasureFunction(this);
    }
}
