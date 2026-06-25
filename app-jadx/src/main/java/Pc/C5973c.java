package pc;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import ec.EnumC4666a;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.jni.ExpectedType;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: pc.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5973c extends AbstractC5990u {

    /* JADX INFO: renamed from: pc.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55937a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Null.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f55937a = iArr;
        }
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(EnumC4666a.f45850w);
    }

    @Override // pc.AbstractC5990u
    public Object e(Object value, Ub.d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        return value;
    }

    @Override // pc.AbstractC5990u
    public Object f(Dynamic value, Ub.d dVar, boolean z10) throws cc.s, DynamicCastException {
        AbstractC5504s.h(value, "value");
        switch (a.f55937a[value.getType().ordinal()]) {
            case 1:
                return Boolean.valueOf(value.asBoolean());
            case 2:
                return Double.valueOf(value.asDouble());
            case 3:
                String strAsString = value.asString();
                if (strAsString != null) {
                    return strAsString;
                }
                throw new DynamicCastException(kotlin.jvm.internal.O.b(String.class));
            case 4:
                ReadableMap readableMapAsMap = value.asMap();
                if (readableMapAsMap != null) {
                    return readableMapAsMap.toHashMap();
                }
                throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableMap.class));
            case 5:
                ReadableArray readableArrayAsArray = value.asArray();
                if (readableArrayAsArray != null) {
                    return readableArrayAsArray.toArrayList();
                }
                throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableArray.class));
            case 6:
                throw new cc.s();
            default:
                throw new Td.r();
        }
    }
}
