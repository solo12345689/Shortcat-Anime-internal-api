package T6;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends AbstractC2149b {

    /* JADX INFO: renamed from: h */
    public static final a f17282h = new a(null);

    /* JADX INFO: renamed from: f */
    private final t f17283f;

    /* JADX INFO: renamed from: g */
    private final JavaOnlyMap f17284g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17285a;

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
            f17285a = iArr;
        }
    }

    public u(ReadableMap config, t nativeAnimatedNodesManager) {
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f17283f = nativeAnimatedNodesManager;
        this.f17284g = JavaOnlyMap.INSTANCE.deepClone(config);
    }

    private final JavaOnlyArray j(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            switch (b.f17285a[readableArray.getType(i10).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i10));
                    break;
                case 3:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i10));
                    break;
                case 4:
                    javaOnlyArray.pushString(readableArray.getString(i10));
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i10);
                    if (map != null && map.hasKey("nodeTag") && map.getType("nodeTag") == ReadableType.Number) {
                        AbstractC2149b abstractC2149bK = this.f17283f.k(map.getInt("nodeTag"));
                        if (abstractC2149bK == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (abstractC2149bK instanceof B) {
                            B b10 = (B) abstractC2149bK;
                            Object objK = b10.k();
                            if (objK instanceof Integer) {
                                javaOnlyArray.pushInt(((Number) objK).intValue());
                            } else if (objK instanceof String) {
                                javaOnlyArray.pushString((String) objK);
                            } else {
                                javaOnlyArray.pushDouble(b10.l());
                            }
                        } else if (abstractC2149bK instanceof f) {
                            javaOnlyArray.pushInt(((f) abstractC2149bK).i());
                        }
                    } else {
                        javaOnlyArray.pushMap(k(readableArray.getMap(i10)));
                    }
                    break;
                case 6:
                    javaOnlyArray.pushArray(j(readableArray.getArray(i10)));
                    break;
                default:
                    throw new Td.r();
            }
        }
        return javaOnlyArray;
    }

    private final JavaOnlyMap k(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (b.f17285a[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(strNextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(strNextKey, readableMap.getBoolean(strNextKey));
                    break;
                case 3:
                    javaOnlyMap.putDouble(strNextKey, readableMap.getDouble(strNextKey));
                    break;
                case 4:
                    javaOnlyMap.putString(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(strNextKey);
                    if (map != null && map.hasKey("nodeTag") && map.getType("nodeTag") == ReadableType.Number) {
                        AbstractC2149b abstractC2149bK = this.f17283f.k(map.getInt("nodeTag"));
                        if (abstractC2149bK == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (abstractC2149bK instanceof B) {
                            B b10 = (B) abstractC2149bK;
                            Object objK = b10.k();
                            if (objK instanceof Integer) {
                                javaOnlyMap.putInt(strNextKey, ((Number) objK).intValue());
                            } else if (!(objK instanceof String)) {
                                javaOnlyMap.putDouble(strNextKey, b10.l());
                            } else {
                                javaOnlyMap.putString(strNextKey, (String) objK);
                            }
                        } else if (abstractC2149bK instanceof f) {
                            javaOnlyMap.putInt(strNextKey, ((f) abstractC2149bK).i());
                        }
                    } else {
                        javaOnlyMap.putMap(strNextKey, k(map));
                    }
                    break;
                case 6:
                    javaOnlyMap.putArray(strNextKey, j(readableMap.getArray(strNextKey)));
                    break;
                default:
                    throw new Td.r();
            }
        }
        return javaOnlyMap;
    }

    @Override // T6.AbstractC2149b
    public String e() {
        return "ObjectAnimatedNode[" + this.f17203d + "]: mConfig: " + this.f17284g;
    }

    public final void i(String propKey, JavaOnlyMap propsMap) {
        AbstractC5504s.h(propKey, "propKey");
        AbstractC5504s.h(propsMap, "propsMap");
        ReadableType type = this.f17284g.getType("value");
        if (type == ReadableType.Map) {
            propsMap.putMap(propKey, k(this.f17284g.getMap("value")));
        } else {
            if (type != ReadableType.Array) {
                throw new IllegalArgumentException("Invalid value type for ObjectAnimatedNode");
            }
            propsMap.putArray(propKey, j(this.f17284g.getArray("value")));
        }
    }
}
