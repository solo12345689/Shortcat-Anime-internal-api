package com.facebook.react.views.progressbar;

import K7.C1817c;
import K7.InterfaceC1819d;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.q0;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import java.util.WeakHashMap;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = ReactProgressBarViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 E2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001FB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u001c\u0010\u0018J!\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0012J!\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0014¢\u0006\u0004\b,\u0010-JY\u0010<\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020.2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002032\u0006\u00108\u001a\u0002052\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b<\u0010=R2\u0010@\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130?0>8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b@\u0010A\u0012\u0004\bB\u0010\u0006R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/progressbar/a;", "Lcom/facebook/react/views/progressbar/b;", "LK7/d;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/progressbar/a;", "view", "value", "LTd/L;", "setStyleAttr", "(Lcom/facebook/react/views/progressbar/a;Ljava/lang/String;)V", "", "setColor", "(Lcom/facebook/react/views/progressbar/a;Ljava/lang/Integer;)V", "", "setIndeterminate", "(Lcom/facebook/react/views/progressbar/a;Z)V", "", "setProgress", "(Lcom/facebook/react/views/progressbar/a;D)V", "setAnimating", "setTestID", "setTypeAttr", "createShadowNodeInstance", "()Lcom/facebook/react/views/progressbar/b;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "root", "", "extraData", "updateExtraData", "(Lcom/facebook/react/views/progressbar/a;Ljava/lang/Object;)V", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/progressbar/a;)V", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "Landroid/content/Context;", "Lcom/facebook/react/bridge/ReadableMap;", "localData", "props", "state", "", "width", "Lcom/facebook/yoga/p;", "widthMode", "height", "heightMode", "", "attachmentsPositions", "", "measure", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;[F)J", "Ljava/util/WeakHashMap;", "Landroid/util/Pair;", "measuredStyles", "Ljava/util/WeakHashMap;", "getMeasuredStyles$annotations", "delegate", "Lcom/facebook/react/uimanager/q0;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactProgressBarViewManager extends BaseViewManager<a, b> implements InterfaceC1819d {
    public static final String DEFAULT_STYLE = "Normal";
    public static final String PROP_ANIMATING = "animating";
    public static final String PROP_ATTR = "typeAttr";
    public static final String PROP_INDETERMINATE = "indeterminate";
    public static final String PROP_PROGRESS = "progress";
    public static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Object progressBarCtorLock = new Object();
    private final WeakHashMap<Integer, Pair<Integer, Integer>> measuredStyles = new WeakHashMap<>();
    private final q0 delegate = new C1817c(this);

    /* JADX INFO: renamed from: com.facebook.react.views.progressbar.ReactProgressBarViewManager$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProgressBar a(Context context, int i10) {
            ProgressBar progressBar;
            synchronized (ReactProgressBarViewManager.progressBarCtorLock) {
                progressBar = new ProgressBar(context, null, i10);
            }
            return progressBar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int b(java.lang.String r5) {
            /*
                r4 = this;
                java.lang.String r0 = "ReactNative"
                r1 = 16842871(0x1010077, float:2.3693892E-38)
                if (r5 == 0) goto L7a
                int r2 = r5.hashCode()
                switch(r2) {
                    case -1955878649: goto L5d;
                    case -1414214583: goto L50;
                    case -913872828: goto L43;
                    case -670403824: goto L36;
                    case -142408811: goto L29;
                    case 73190171: goto L1c;
                    case 79996135: goto Lf;
                    default: goto Le;
                }
            Le:
                goto L65
            Lf:
                java.lang.String r2 = "Small"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L18
                goto L65
            L18:
                r5 = 16842873(0x1010079, float:2.3693897E-38)
                return r5
            L1c:
                java.lang.String r2 = "Large"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L25
                goto L65
            L25:
                r5 = 16842874(0x101007a, float:2.36939E-38)
                return r5
            L29:
                java.lang.String r2 = "LargeInverse"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L32
                goto L65
            L32:
                r5 = 16843401(0x1010289, float:2.3695377E-38)
                return r5
            L36:
                java.lang.String r2 = "Inverse"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L3f
                goto L65
            L3f:
                r5 = 16843399(0x1010287, float:2.369537E-38)
                return r5
            L43:
                java.lang.String r2 = "Horizontal"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L4c
                goto L65
            L4c:
                r5 = 16842872(0x1010078, float:2.3693894E-38)
                return r5
            L50:
                java.lang.String r2 = "SmallInverse"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L59
                goto L65
            L59:
                r5 = 16843400(0x1010288, float:2.3695374E-38)
                return r5
            L5d:
                java.lang.String r2 = "Normal"
                boolean r2 = r5.equals(r2)
                if (r2 != 0) goto L79
            L65:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unknown ProgressBar style: "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                z5.AbstractC7283a.I(r0, r5)
            L79:
                return r1
            L7a:
                java.lang.String r5 = "ProgressBar needs to have a style, null received"
                z5.AbstractC7283a.I(r0, r5)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.progressbar.ReactProgressBarViewManager.Companion.b(java.lang.String):int");
        }

        private Companion() {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected q0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<b> getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap localData, ReadableMap props, ReadableMap state, float width, p widthMode, float height, p heightMode, float[] attachmentsPositions) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(localData, "localData");
        AbstractC5504s.h(props, "props");
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(widthMode, "widthMode");
        AbstractC5504s.h(heightMode, "heightMode");
        Companion companion = INSTANCE;
        int iB = companion.b(props.getString(PROP_STYLE));
        WeakHashMap<Integer, Pair<Integer, Integer>> weakHashMap = this.measuredStyles;
        Integer numValueOf = Integer.valueOf(iB);
        Pair<Integer, Integer> pairCreate = weakHashMap.get(numValueOf);
        if (pairCreate == null) {
            ProgressBar progressBarA = companion.a(context, iB);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            progressBarA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            pairCreate = Pair.create(Integer.valueOf(progressBarA.getMeasuredWidth()), Integer.valueOf(progressBarA.getMeasuredHeight()));
            weakHashMap.put(numValueOf, pairCreate);
        }
        Pair<Integer, Integer> pair = pairCreate;
        return q.a(B.g(((Number) pair.first).intValue()), B.g(((Number) pair.second).intValue()));
    }

    @Override // K7.InterfaceC1819d
    @B7.a(name = PROP_ATTR)
    public void setTypeAttr(a view, String value) {
        AbstractC5504s.h(view, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(a root, Object extraData) {
        AbstractC5504s.h(root, "root");
        AbstractC5504s.h(extraData, "extraData");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createShadowNodeInstance() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return new a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a view) {
        AbstractC5504s.h(view, "view");
        view.a();
    }

    @Override // K7.InterfaceC1819d
    @B7.a(name = PROP_ANIMATING)
    public void setAnimating(a view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setAnimating$ReactAndroid_release(value);
    }

    @Override // K7.InterfaceC1819d
    @B7.a(customType = "Color", name = "color")
    public void setColor(a view, Integer value) {
        AbstractC5504s.h(view, "view");
        view.setColor$ReactAndroid_release(value);
    }

    @Override // K7.InterfaceC1819d
    @B7.a(name = PROP_INDETERMINATE)
    public void setIndeterminate(a view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setIndeterminate$ReactAndroid_release(value);
    }

    @Override // K7.InterfaceC1819d
    @B7.a(name = PROP_PROGRESS)
    public void setProgress(a view, double value) {
        AbstractC5504s.h(view, "view");
        view.setProgress$ReactAndroid_release(value);
    }

    @Override // K7.InterfaceC1819d
    @B7.a(name = PROP_STYLE)
    public void setStyleAttr(a view, String value) {
        AbstractC5504s.h(view, "view");
        view.setStyle$ReactAndroid_release(value);
    }

    @Override // K7.InterfaceC1819d
    public void setTestID(a view, String value) {
        AbstractC5504s.h(view, "view");
        super.setTestId(view, value);
    }

    private static /* synthetic */ void getMeasuredStyles$annotations() {
    }
}
