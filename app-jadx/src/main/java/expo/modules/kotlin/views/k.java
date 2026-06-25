package expo.modules.kotlin.views;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements ReadableMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadableMap f46210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f46211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ub.m f46212c;

    public k(ReadableMap backingMap, List filteredKeys) {
        AbstractC5504s.h(backingMap, "backingMap");
        AbstractC5504s.h(filteredKeys, "filteredKeys");
        this.f46210a = backingMap;
        this.f46211b = filteredKeys;
        this.f46212c = new Ub.m(backingMap.getEntryIterator(), new Ub.l() { // from class: expo.modules.kotlin.views.j
            @Override // Ub.l
            public final boolean apply(Object obj) {
                return k.c(this.f46209a, (Map.Entry) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(k kVar, Map.Entry it) {
        AbstractC5504s.h(it, "it");
        return !kVar.f46211b.contains(it.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(k kVar, String it) {
        AbstractC5504s.h(it, "it");
        return !kVar.f46211b.contains(it);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Ub.m getEntryIterator() {
        return this.f46212c;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableArray getArray(String name) {
        AbstractC5504s.h(name, "name");
        return this.f46210a.getArray(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(String name) {
        AbstractC5504s.h(name, "name");
        return this.f46210a.getBoolean(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(String name) {
        AbstractC5504s.h(name, "name");
        return this.f46210a.getDouble(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Dynamic getDynamic(String name) {
        AbstractC5504s.h(name, "name");
        return this.f46210a.getDynamic(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(String name) {
        AbstractC5504s.h(name, "name");
        return this.f46210a.getInt(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public long getLong(String name) {
        AbstractC5504s.h(name, "name");
        return this.f46210a.getLong(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMap getMap(String name) {
        AbstractC5504s.h(name, "name");
        return this.f46210a.getMap(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public String getString(String name) {
        AbstractC5504s.h(name, "name");
        return this.f46210a.getString(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableType getType(String name) {
        AbstractC5504s.h(name, "name");
        return this.f46210a.getType(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(String name) {
        AbstractC5504s.h(name, "name");
        return this.f46210a.hasKey(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(String name) {
        AbstractC5504s.h(name, "name");
        return this.f46210a.isNull(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new l(this.f46210a.keySetIterator(), new Ub.l() { // from class: expo.modules.kotlin.views.i
            @Override // Ub.l
            public final boolean apply(Object obj) {
                return k.e(this.f46208a, (String) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public HashMap toHashMap() {
        return this.f46210a.toHashMap();
    }
}
