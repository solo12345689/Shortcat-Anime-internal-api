package com.facebook.react.bridge;

import ce.AbstractC3098c;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0005\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001TB\u0007¢\u0006\u0004\b\u0003\u0010\u0004B!\b\u0012\u0012\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0003\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0013H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020+2\u0006\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u00107J!\u00108\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020+2\u0006\u0010:\u001a\u00020\u0001H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0002H\u0016¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020+2\u0006\u0010)\u001a\u00020\t¢\u0006\u0004\bA\u00107J\u001d\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\tH\u0016¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020\u000b2\b\u0010G\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0013H\u0016¢\u0006\u0004\bJ\u0010KR\"\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR(\u0010S\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060P0O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lcom/facebook/react/bridge/JavaOnlyMap;", "Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/bridge/WritableMap;", "<init>", "()V", "", "", "keysAndValues", "([Ljava/lang/Object;)V", "", "name", "", "hasKey", "(Ljava/lang/String;)Z", "isNull", "getBoolean", "", "getDouble", "(Ljava/lang/String;)D", "", "getInt", "(Ljava/lang/String;)I", "", "getLong", "(Ljava/lang/String;)J", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "getMap", "(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/bridge/ReadableArray;", "getArray", "(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;", "Lcom/facebook/react/bridge/Dynamic;", "getDynamic", "(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;", "Lcom/facebook/react/bridge/ReadableType;", "getType", "(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "keySetIterator", "()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", SubscriberAttributeKt.JSON_NAME_KEY, "value", "LTd/L;", "putBoolean", "(Ljava/lang/String;Z)V", "putDouble", "(Ljava/lang/String;D)V", "putInt", "(Ljava/lang/String;I)V", "putLong", "(Ljava/lang/String;J)V", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "putNull", "(Ljava/lang/String;)V", "putMap", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "source", "merge", "(Lcom/facebook/react/bridge/ReadableMap;)V", "copy", "()Lcom/facebook/react/bridge/WritableMap;", "putArray", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "remove", "Ljava/util/HashMap;", "toHashMap", "()Ljava/util/HashMap;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "backingMap", "Ljava/util/Map;", "", "", "getEntryIterator", "()Ljava/util/Iterator;", "entryIterator", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaOnlyMap implements ReadableMap, WritableMap {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, Object> backingMap;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\u00052\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0007J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/bridge/JavaOnlyMap$Companion;", "", "<init>", "()V", "of", "Lcom/facebook/react/bridge/JavaOnlyMap;", "keysAndValues", "", "([Ljava/lang/Object;)Lcom/facebook/react/bridge/JavaOnlyMap;", "from", "map", "", "", "deepClone", "Lcom/facebook/react/bridge/ReadableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JavaOnlyMap deepClone(ReadableMap map) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            if (map != null) {
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    switch (WhenMappings.$EnumSwitchMapping$0[map.getType(strNextKey).ordinal()]) {
                        case 1:
                            javaOnlyMap.putNull(strNextKey);
                            break;
                        case 2:
                            javaOnlyMap.putBoolean(strNextKey, map.getBoolean(strNextKey));
                            break;
                        case 3:
                            javaOnlyMap.putDouble(strNextKey, map.getDouble(strNextKey));
                            break;
                        case 4:
                            javaOnlyMap.putString(strNextKey, map.getString(strNextKey));
                            break;
                        case 5:
                            javaOnlyMap.putMap(strNextKey, deepClone(map.getMap(strNextKey)));
                            break;
                        case 6:
                            javaOnlyMap.putArray(strNextKey, JavaOnlyArray.INSTANCE.deepClone(map.getArray(strNextKey)));
                            break;
                        default:
                            throw new Td.r();
                    }
                }
            }
            return javaOnlyMap;
        }

        public final JavaOnlyMap from(Map<String, ? extends Object> map) {
            AbstractC5504s.h(map, "map");
            return new JavaOnlyMap(new Object[]{map}, null);
        }

        public final JavaOnlyMap of(Object... keysAndValues) {
            AbstractC5504s.h(keysAndValues, "keysAndValues");
            return new JavaOnlyMap(Arrays.copyOf(keysAndValues, keysAndValues.length), null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.bridge.JavaOnlyMap$keySetIterator$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016R\"\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"com/facebook/react/bridge/JavaOnlyMap$keySetIterator$1", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "iterator", "", "", "", "", "hasNextKey", "", "nextKey", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 implements ReadableMapKeySetIterator {
        private final Iterator<Map.Entry<String, Object>> iterator;

        AnonymousClass1(JavaOnlyMap javaOnlyMap) {
            this.iterator = javaOnlyMap.backingMap.entrySet().iterator();
        }

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public boolean hasNextKey() {
            return this.iterator.hasNext();
        }

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public String nextKey() {
            return this.iterator.next().getKey();
        }
    }

    public /* synthetic */ JavaOnlyMap(Object[] objArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(objArr);
    }

    public static final JavaOnlyMap deepClone(ReadableMap readableMap) {
        return INSTANCE.deepClone(readableMap);
    }

    public static final JavaOnlyMap from(Map<String, ? extends Object> map) {
        return INSTANCE.from(map);
    }

    public static final JavaOnlyMap of(Object... objArr) {
        return INSTANCE.of(objArr);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public WritableMap copy() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.merge(this);
        return javaOnlyMap;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !AbstractC5504s.c(JavaOnlyMap.class, other.getClass())) {
            return false;
        }
        return AbstractC5504s.c(this.backingMap, ((JavaOnlyMap) other).backingMap);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableArray getArray(String name) {
        AbstractC5504s.h(name, "name");
        return (ReadableArray) this.backingMap.get(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(String name) {
        AbstractC5504s.h(name, "name");
        Object obj = this.backingMap.get(name);
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj).booleanValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(String name) {
        AbstractC5504s.h(name, "name");
        Object obj = this.backingMap.get(name);
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) obj).doubleValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Dynamic getDynamic(String name) {
        AbstractC5504s.h(name, "name");
        return DynamicFromMap.INSTANCE.create(this, name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        return this.backingMap.entrySet().iterator();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(String name) {
        AbstractC5504s.h(name, "name");
        Object obj = this.backingMap.get(name);
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) obj).intValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public long getLong(String name) {
        AbstractC5504s.h(name, "name");
        Object obj = this.backingMap.get(name);
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) obj).longValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMap getMap(String name) {
        AbstractC5504s.h(name, "name");
        return (ReadableMap) this.backingMap.get(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public String getString(String name) {
        AbstractC5504s.h(name, "name");
        return (String) this.backingMap.get(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableType getType(String name) {
        AbstractC5504s.h(name, "name");
        Object obj = this.backingMap.get(name);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof Dynamic) {
            return ((Dynamic) obj).getType();
        }
        throw new IllegalArgumentException("Invalid value " + obj + " for key " + name + " contained in JavaOnlyMap");
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(String name) {
        AbstractC5504s.h(name, "name");
        return this.backingMap.containsKey(name);
    }

    public int hashCode() {
        return this.backingMap.hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(String name) {
        AbstractC5504s.h(name, "name");
        return this.backingMap.get(name) == null;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableMapKeySetIterator(this) { // from class: com.facebook.react.bridge.JavaOnlyMap.keySetIterator.1
            private final Iterator<Map.Entry<String, Object>> iterator;

            AnonymousClass1(JavaOnlyMap this) {
                this.iterator = this.backingMap.entrySet().iterator();
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public boolean hasNextKey() {
                return this.iterator.hasNext();
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public String nextKey() {
                return this.iterator.next().getKey();
            }
        };
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void merge(ReadableMap source) {
        AbstractC5504s.h(source, "source");
        this.backingMap.putAll(((JavaOnlyMap) source).backingMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(String str, ReadableArray value) {
        AbstractC5504s.h(str, "key");
        this.backingMap.put(str, value);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putBoolean(String str, boolean value) {
        AbstractC5504s.h(str, "key");
        this.backingMap.put(str, Boolean.valueOf(value));
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putDouble(String str, double value) {
        AbstractC5504s.h(str, "key");
        this.backingMap.put(str, Double.valueOf(value));
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putInt(String str, int value) {
        AbstractC5504s.h(str, "key");
        this.backingMap.put(str, Double.valueOf(value));
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putLong(String str, long value) {
        AbstractC5504s.h(str, "key");
        this.backingMap.put(str, Double.valueOf(value));
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(String str, ReadableMap value) {
        AbstractC5504s.h(str, "key");
        this.backingMap.put(str, value);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putNull(String str) {
        AbstractC5504s.h(str, "key");
        this.backingMap.put(str, null);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putString(String str, String value) {
        AbstractC5504s.h(str, "key");
        this.backingMap.put(str, value);
    }

    public final void remove(String str) {
        AbstractC5504s.h(str, "key");
        this.backingMap.remove(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public HashMap<String, Object> toHashMap() {
        return new HashMap<>(this.backingMap);
    }

    public String toString() {
        return this.backingMap.toString();
    }

    public JavaOnlyMap() {
        this.backingMap = new HashMap();
    }

    private JavaOnlyMap(Object... objArr) {
        this();
        if (objArr.length % 2 == 0) {
            int i10 = 0;
            int iC = AbstractC3098c.c(0, objArr.length - 1, 2);
            if (iC < 0) {
                return;
            }
            while (true) {
                Object objValueOf = objArr[i10 + 1];
                objValueOf = objValueOf instanceof Number ? Double.valueOf(((Number) objValueOf).doubleValue()) : objValueOf;
                Map<String, Object> map = this.backingMap;
                Object obj = objArr[i10];
                AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.String");
                map.put((String) obj, objValueOf);
                if (i10 == iC) {
                    return;
                } else {
                    i10 += 2;
                }
            }
        } else {
            throw new IllegalArgumentException("You must provide the same number of keys and values");
        }
    }
}
