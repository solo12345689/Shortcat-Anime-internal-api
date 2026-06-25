package T6;

import Ud.S;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends AbstractC2149b {

    /* JADX INFO: renamed from: f */
    private final t f17310f;

    /* JADX INFO: renamed from: g */
    private final Map f17311g;

    public x(ReadableMap config, t nativeAnimatedNodesManager) {
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f17310f = nativeAnimatedNodesManager;
        ReadableMap map = config.getMap("style");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map != null ? map.keySetIterator() : null;
        Map mapC = S.c();
        while (readableMapKeySetIteratorKeySetIterator != null && readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            mapC.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
        this.f17311g = S.b(mapC);
    }

    @Override // T6.AbstractC2149b
    public String e() {
        return "StyleAnimatedNode[" + this.f17203d + "] mPropMapping: " + this.f17311g;
    }

    public final void i(JavaOnlyMap propsMap) {
        AbstractC5504s.h(propsMap, "propsMap");
        for (Map.Entry entry : this.f17311g.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC2149b abstractC2149bK = this.f17310f.k(((Number) entry.getValue()).intValue());
            if (abstractC2149bK == null) {
                throw new IllegalArgumentException("Mapped style node does not exist");
            }
            if (abstractC2149bK instanceof A) {
                ((A) abstractC2149bK).i(propsMap);
            } else if (abstractC2149bK instanceof B) {
                B b10 = (B) abstractC2149bK;
                Object objK = b10.k();
                if (objK instanceof Integer) {
                    propsMap.putInt(str, ((Number) objK).intValue());
                } else if (objK instanceof String) {
                    propsMap.putString(str, (String) objK);
                } else {
                    propsMap.putDouble(str, b10.l());
                }
            } else if (abstractC2149bK instanceof f) {
                propsMap.putInt(str, ((f) abstractC2149bK).i());
            } else {
                if (!(abstractC2149bK instanceof u)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + abstractC2149bK.getClass());
                }
                ((u) abstractC2149bK).i(str, propsMap);
            }
        }
    }
}
