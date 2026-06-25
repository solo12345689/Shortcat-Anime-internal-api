package com.margelo.nitro.core;

import com.facebook.jni.HybridData;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001UB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\tJ.\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0013H\u0082 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0019\u0010\u001bJ0\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u001dH\u0086 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000fH\u0087 ¢\u0006\u0004\b(\u0010\u0003J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0)H\u0086 ¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b,\u0010%J\u0018\u0010-\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b-\u0010%J\u0018\u0010.\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b.\u0010%J\u0018\u0010/\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b/\u0010%J\u0018\u00100\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b0\u0010%J\u0018\u00101\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b1\u0010%J\u0018\u00102\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b2\u0010%J\u0018\u00104\u001a\u0002032\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b6\u0010%J\u0018\u00108\u001a\u0002072\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b:\u0010;J\"\u0010=\u001a\f\u0012\u0004\u0012\u00020\u00130)j\u0002`<2\u0006\u0010\u0012\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b=\u0010>J(\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00130\nj\u0002`?2\u0006\u0010\u0012\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\bB\u0010'J \u0010C\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u000203H\u0087 ¢\u0006\u0004\bC\u0010DJ \u0010E\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\rH\u0087 ¢\u0006\u0004\bE\u0010FJ \u0010G\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u000207H\u0087 ¢\u0006\u0004\bG\u0010HJ \u0010I\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\bI\u0010JJ*\u0010K\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00130)j\u0002`<H\u0086 ¢\u0006\u0004\bK\u0010LJ0\u0010M\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00130\nj\u0002`?H\u0086 ¢\u0006\u0004\bM\u0010NJ\u0018\u0010P\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u0000H\u0086 ¢\u0006\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lcom/margelo/nitro/core/AnyMap;", "", "<init>", "()V", "", "preallocatedSize", "(I)V", "Lcom/facebook/jni/HybridData;", "hybridData", "(Lcom/facebook/jni/HybridData;)V", "", "", "map", "", "ignoreIncompatible", "LTd/L;", "fromHashMap", "(Ljava/util/Map;Z)V", SubscriberAttributeKt.JSON_NAME_KEY, "Lcom/margelo/nitro/core/AnyValue;", "getAnyValue", "(Ljava/lang/String;)Lcom/margelo/nitro/core/AnyValue;", "value", "setAnyValue", "(Ljava/lang/String;Lcom/margelo/nitro/core/AnyValue;)V", "initHybrid", "()Lcom/facebook/jni/HybridData;", "(I)Lcom/facebook/jni/HybridData;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "toHashMap", "()Ljava/util/HashMap;", "setAny", "(Ljava/lang/String;Ljava/lang/Object;)V", "getAny", "(Ljava/lang/String;)Ljava/lang/Object;", "contains", "(Ljava/lang/String;)Z", "remove", "(Ljava/lang/String;)V", "clear", "", "getAllKeys", "()[Ljava/lang/String;", "isNull", "isDouble", "isBoolean", "isInt64", "isString", "isArray", "isObject", "", "getDouble", "(Ljava/lang/String;)D", "getBoolean", "", "getInt64", "(Ljava/lang/String;)J", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/margelo/nitro/core/AnyArray;", "getAnyArray", "(Ljava/lang/String;)[Lcom/margelo/nitro/core/AnyValue;", "Lcom/margelo/nitro/core/AnyObject;", "getAnyObject", "(Ljava/lang/String;)Ljava/util/Map;", "setNull", "setDouble", "(Ljava/lang/String;D)V", "setBoolean", "(Ljava/lang/String;Z)V", "setInt64", "(Ljava/lang/String;J)V", "setString", "(Ljava/lang/String;Ljava/lang/String;)V", "setAnyArray", "(Ljava/lang/String;[Lcom/margelo/nitro/core/AnyValue;)V", "setAnyObject", "(Ljava/lang/String;Ljava/util/Map;)V", "other", "merge", "(Lcom/margelo/nitro/core/AnyMap;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "Companion", "a", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnyMap {
    private final HybridData mHybridData;

    public AnyMap() {
        this.mHybridData = initHybrid();
    }

    private final native void fromHashMap(Map<String, ? extends Object> map, boolean ignoreIncompatible);

    public static final native AnyMap fromMap(Map<String, ? extends Object> map, boolean z10);

    private final native AnyValue getAnyValue(String str);

    private final native HybridData initHybrid();

    private final native HybridData initHybrid(int preallocatedSize);

    private final native void setAnyValue(String str, AnyValue value);

    public final native void clear();

    public final native boolean contains(String str);

    public final native String[] getAllKeys();

    public final Object getAny(String str) {
        AbstractC5504s.h(str, "key");
        return getAnyValue(str).toAny();
    }

    public final native AnyValue[] getAnyArray(String str);

    public final native Map<String, AnyValue> getAnyObject(String str);

    public final native boolean getBoolean(String str);

    public final native double getDouble(String str);

    public final native long getInt64(String str);

    public final native String getString(String str);

    public final native boolean isArray(String str);

    public final native boolean isBoolean(String str);

    public final native boolean isDouble(String str);

    public final native boolean isInt64(String str);

    public final native boolean isNull(String str);

    public final native boolean isObject(String str);

    public final native boolean isString(String str);

    public final native void merge(AnyMap other);

    public final native void remove(String str);

    public final void setAny(String str, Object value) {
        AbstractC5504s.h(str, "key");
        setAnyValue(str, AnyValue.INSTANCE.a(value));
    }

    public final native void setAnyArray(String str, AnyValue[] value);

    public final native void setAnyObject(String str, Map<String, AnyValue> value);

    public final native void setBoolean(String str, boolean value);

    public final native void setDouble(String str, double value);

    public final native void setInt64(String str, long value);

    public final native void setNull(String str);

    public final native void setString(String str, String value);

    public final native HashMap<String, Object> toHashMap();

    public AnyMap(int i10) {
        this.mHybridData = initHybrid(i10);
    }

    private AnyMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
