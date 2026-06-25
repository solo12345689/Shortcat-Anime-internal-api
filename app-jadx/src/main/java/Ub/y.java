package Ub;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19457a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f19457a = iArr;
        }
    }

    public static final InterfaceC6014d a(ReadableType readableType) {
        Class cls;
        AbstractC5504s.h(readableType, "<this>");
        switch (a.f19457a[readableType.ordinal()]) {
            case 1:
                cls = Object.class;
                break;
            case 2:
                cls = Boolean.TYPE;
                break;
            case 3:
                cls = Number.class;
                break;
            case 4:
                cls = String.class;
                break;
            case 5:
                cls = ReadableMap.class;
                break;
            case 6:
                cls = ReadableArray.class;
                break;
            default:
                throw new Td.r();
        }
        return O.b(cls);
    }
}
