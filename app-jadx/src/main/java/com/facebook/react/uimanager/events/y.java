package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.B;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a */
    public static final y f37687a = new y();

    /* JADX INFO: renamed from: b */
    public static final String f37688b = "target";

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37689a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.f37680c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.f37681d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.f37682e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x.f37683f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f37689a = iArr;
        }
    }

    private y() {
    }

    private final WritableMap[] a(v vVar) {
        MotionEvent motionEventD = vVar.d();
        WritableMap[] writableMapArr = new WritableMap[motionEventD.getPointerCount()];
        float x10 = motionEventD.getX() - vVar.f();
        float y10 = motionEventD.getY() - vVar.g();
        int pointerCount = motionEventD.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            B b10 = B.f37368a;
            writableMapCreateMap.putDouble("pageX", b10.e(motionEventD.getX(i10)));
            writableMapCreateMap.putDouble("pageY", b10.e(motionEventD.getY(i10)));
            float x11 = motionEventD.getX(i10) - x10;
            float y11 = motionEventD.getY(i10) - y10;
            writableMapCreateMap.putDouble("locationX", b10.e(x11));
            writableMapCreateMap.putDouble("locationY", b10.e(y11));
            writableMapCreateMap.putInt("targetSurface", vVar.getSurfaceId());
            writableMapCreateMap.putInt(f37688b, vVar.getViewTag());
            writableMapCreateMap.putDouble(DiagnosticsEntry.TIMESTAMP_KEY, vVar.getTimestampMs());
            writableMapCreateMap.putDouble("identifier", motionEventD.getPointerId(i10));
            writableMapArr[i10] = writableMapCreateMap;
        }
        return writableMapArr;
    }

    private final WritableArray b(boolean z10, WritableMap[] writableMapArr) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (WritableMap writableMapCopy : writableMapArr) {
            if (writableMapCopy != null) {
                if (z10) {
                    writableMapCopy = writableMapCopy.copy();
                }
                writableArrayCreateArray.pushMap(writableMapCopy);
            }
        }
        return writableArrayCreateArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00a1 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:52:0x002d, B:60:0x0051, B:80:0x0097, B:81:0x009b, B:83:0x00a1, B:85:0x00a9, B:87:0x00c4, B:63:0x0059, B:64:0x005e, B:65:0x005f, B:66:0x0062, B:68:0x0065, B:70:0x0069, B:72:0x006f, B:74:0x0076, B:75:0x0083, B:77:0x008b, B:79:0x0091), top: B:93:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(com.facebook.react.uimanager.events.RCTModernEventEmitter r16, com.facebook.react.uimanager.events.v r17) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.y.c(com.facebook.react.uimanager.events.RCTModernEventEmitter, com.facebook.react.uimanager.events.v):void");
    }

    public static final void d(RCTEventEmitter rctEventEmitter, v touchEvent) {
        AbstractC5504s.h(rctEventEmitter, "rctEventEmitter");
        AbstractC5504s.h(touchEvent, "touchEvent");
        x xVarE = touchEvent.e();
        y yVar = f37687a;
        WritableArray writableArrayB = yVar.b(false, yVar.a(touchEvent));
        MotionEvent motionEventD = touchEvent.d();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (xVarE == x.f37682e || xVarE == x.f37683f) {
            int pointerCount = motionEventD.getPointerCount();
            for (int i10 = 0; i10 < pointerCount; i10++) {
                writableArrayCreateArray.pushInt(i10);
            }
        } else {
            if (xVarE != x.f37680c && xVarE != x.f37681d) {
                throw new RuntimeException("Unknown touch type: " + xVarE);
            }
            writableArrayCreateArray.pushInt(motionEventD.getActionIndex());
        }
        rctEventEmitter.receiveTouches(x.f37679b.a(xVarE), writableArrayB, writableArrayCreateArray);
    }
}
