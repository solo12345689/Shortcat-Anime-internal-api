package com.facebook.react.views.debuggingoverlay;

import K7.C1829i;
import K7.InterfaceC1831j;
import Td.L;
import android.graphics.RectF;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.q0;
import java.util.ArrayList;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = DebuggingOverlayManager.REACT_CLASS)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/views/debuggingoverlay/b;", "LK7/j;", "<init>", "()V", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "view", "Lcom/facebook/react/bridge/ReadableArray;", "updates", "LTd/L;", "highlightTraceUpdates", "(Lcom/facebook/react/views/debuggingoverlay/b;Lcom/facebook/react/bridge/ReadableArray;)V", "elements", "highlightElements", "clearElementsHighlights", "(Lcom/facebook/react/views/debuggingoverlay/b;)V", "Lcom/facebook/react/uimanager/b0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/debuggingoverlay/b;", "", "getName", "()Ljava/lang/String;", "delegate", "Lcom/facebook/react/uimanager/q0;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebuggingOverlayManager extends SimpleViewManager<b> implements InterfaceC1831j {
    public static final String REACT_CLASS = "DebuggingOverlay";
    private final q0 delegate = new C1829i(this);

    @Override // com.facebook.react.uimanager.ViewManager
    protected q0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // K7.InterfaceC1831j
    public void clearElementsHighlights(b view) {
        AbstractC5504s.h(view, "view");
        view.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return new b(context);
    }

    @Override // K7.InterfaceC1831j
    public void highlightElements(b view, ReadableArray elements) throws Exception {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(elements, "elements");
        ArrayList arrayList = new ArrayList();
        int size = elements.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = elements.getMap(i10);
            if (map != null) {
                try {
                    float f10 = (float) map.getDouble("x");
                    float f11 = (float) map.getDouble("y");
                    float f12 = (float) (((double) f10) + map.getDouble("width"));
                    float f13 = (float) (((double) f11) + map.getDouble("height"));
                    B b10 = B.f37368a;
                    arrayList.add(new RectF(b10.b(f10), b10.b(f11), b10.b(f12), b10.b(f13)));
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchKeyException) && !(e10 instanceof UnexpectedNativeTypeException)) {
                        throw e10;
                    }
                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting elements: every element should have x, y, width, height fields"));
                    L l10 = L.f17438a;
                    z10 = false;
                }
            }
        }
        if (z10) {
            view.setHighlightedElementsRectangles(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        if (r5 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        r20.setTraceUpdates(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    @Override // K7.InterfaceC1831j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void highlightTraceUpdates(com.facebook.react.views.debuggingoverlay.b r20, com.facebook.react.bridge.ReadableArray r21) throws java.lang.Exception {
        /*
            r19 = this;
            r1 = r20
            r2 = r21
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r1, r0)
            java.lang.String r0 = "updates"
            kotlin.jvm.internal.AbstractC5504s.h(r2, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.size()
            r0 = 1
            r6 = 0
        L19:
            if (r6 >= r4) goto La2
            com.facebook.react.bridge.ReadableMap r7 = r2.getMap(r6)
            if (r7 != 0) goto L23
            goto L9e
        L23:
            java.lang.String r8 = "rectangle"
            com.facebook.react.bridge.ReadableMap r8 = r7.getMap(r8)
            java.lang.String r9 = "DebuggingOverlay"
            if (r8 != 0) goto L39
            com.facebook.react.bridge.ReactNoCrashSoftException r0 = new com.facebook.react.bridge.ReactNoCrashSoftException
            java.lang.String r2 = "Unexpected payload for highlighting trace updates: rectangle field is null"
            r0.<init>(r2)
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r9, r0)
            r5 = 0
            goto La3
        L39:
            java.lang.String r10 = "id"
            int r10 = r7.getInt(r10)
            java.lang.String r11 = "color"
            int r7 = r7.getInt(r11)
            java.lang.String r11 = "x"
            double r11 = r8.getDouble(r11)     // Catch: java.lang.Exception -> L86
            float r11 = (float) r11     // Catch: java.lang.Exception -> L86
            java.lang.String r12 = "y"
            double r12 = r8.getDouble(r12)     // Catch: java.lang.Exception -> L86
            float r12 = (float) r12     // Catch: java.lang.Exception -> L86
            double r13 = (double) r11     // Catch: java.lang.Exception -> L86
            java.lang.String r15 = "width"
            double r15 = r8.getDouble(r15)     // Catch: java.lang.Exception -> L86
            double r13 = r13 + r15
            float r13 = (float) r13     // Catch: java.lang.Exception -> L86
            double r14 = (double) r12     // Catch: java.lang.Exception -> L86
            java.lang.String r5 = "height"
            double r17 = r8.getDouble(r5)     // Catch: java.lang.Exception -> L86
            double r14 = r14 + r17
            float r5 = (float) r14     // Catch: java.lang.Exception -> L86
            android.graphics.RectF r8 = new android.graphics.RectF     // Catch: java.lang.Exception -> L86
            com.facebook.react.uimanager.B r14 = com.facebook.react.uimanager.B.f37368a     // Catch: java.lang.Exception -> L86
            float r11 = r14.b(r11)     // Catch: java.lang.Exception -> L86
            float r12 = r14.b(r12)     // Catch: java.lang.Exception -> L86
            float r13 = r14.b(r13)     // Catch: java.lang.Exception -> L86
            float r5 = r14.b(r5)     // Catch: java.lang.Exception -> L86
            r8.<init>(r11, r12, r13, r5)     // Catch: java.lang.Exception -> L86
            com.facebook.react.views.debuggingoverlay.c r5 = new com.facebook.react.views.debuggingoverlay.c     // Catch: java.lang.Exception -> L86
            r5.<init>(r10, r8, r7)     // Catch: java.lang.Exception -> L86
            r3.add(r5)     // Catch: java.lang.Exception -> L86
            goto L9e
        L86:
            r0 = move-exception
            boolean r5 = r0 instanceof com.facebook.react.bridge.NoSuchKeyException
            if (r5 != 0) goto L91
            boolean r5 = r0 instanceof com.facebook.react.bridge.UnexpectedNativeTypeException
            if (r5 == 0) goto L90
            goto L91
        L90:
            throw r0
        L91:
            com.facebook.react.bridge.ReactNoCrashSoftException r0 = new com.facebook.react.bridge.ReactNoCrashSoftException
            java.lang.String r5 = "Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields"
            r0.<init>(r5)
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r9, r0)
            Td.L r0 = Td.L.f17438a
            r0 = 0
        L9e:
            int r6 = r6 + 1
            goto L19
        La2:
            r5 = r0
        La3:
            if (r5 == 0) goto La8
            r1.setTraceUpdates(r3)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager.highlightTraceUpdates(com.facebook.react.views.debuggingoverlay.b, com.facebook.react.bridge.ReadableArray):void");
    }
}
