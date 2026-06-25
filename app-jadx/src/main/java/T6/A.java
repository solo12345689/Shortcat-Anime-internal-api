package T6;

import Ud.AbstractC2279u;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends AbstractC2149b {

    /* JADX INFO: renamed from: f */
    private final t f17186f;

    /* JADX INFO: renamed from: g */
    private final List f17187g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a extends c {

        /* JADX INFO: renamed from: c */
        private int f17188c;

        public a() {
            super();
        }

        public final int c() {
            return this.f17188c;
        }

        public final void d(int i10) {
            this.f17188c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b extends c {

        /* JADX INFO: renamed from: c */
        private double f17190c;

        public b() {
            super();
        }

        public final double c() {
            return this.f17190c;
        }

        public final void d(double d10) {
            this.f17190c = d10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c {

        /* JADX INFO: renamed from: a */
        private String f17192a;

        public c() {
        }

        public final String a() {
            return this.f17192a;
        }

        public final void b(String str) {
            this.f17192a = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T6.A$b, T6.A$c] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T6.A$a, T6.A$c] */
    public A(ReadableMap config, t nativeAnimatedNodesManager) {
        List listM;
        ?? bVar;
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f17186f = nativeAnimatedNodesManager;
        ReadableArray array = config.getArray("transforms");
        if (array == null) {
            listM = AbstractC2279u.m();
        } else {
            int size = array.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = array.getMap(i10);
                if (map == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                String string = map.getString("property");
                if (AbstractC5504s.c(map.getString("type"), "animated")) {
                    bVar = new a();
                    bVar.b(string);
                    bVar.d(map.getInt("nodeTag"));
                } else {
                    bVar = new b();
                    bVar.b(string);
                    bVar.d(map.getDouble("value"));
                }
                arrayList.add(bVar);
            }
            listM = arrayList;
        }
        this.f17187g = listM;
    }

    @Override // T6.AbstractC2149b
    public String e() {
        return "TransformAnimatedNode[" + this.f17203d + "]: transformConfigs: " + this.f17187g;
    }

    public final void i(JavaOnlyMap propsMap) {
        double dC;
        AbstractC5504s.h(propsMap, "propsMap");
        int size = this.f17187g.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) this.f17187g.get(i10);
            if (cVar instanceof a) {
                AbstractC2149b abstractC2149bK = this.f17186f.k(((a) cVar).c());
                if (abstractC2149bK == null) {
                    throw new IllegalArgumentException("Mapped style node does not exist");
                }
                if (!(abstractC2149bK instanceof B)) {
                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + abstractC2149bK.getClass());
                }
                dC = ((B) abstractC2149bK).l();
            } else {
                AbstractC5504s.f(cVar, "null cannot be cast to non-null type com.facebook.react.animated.TransformAnimatedNode.StaticTransformConfig");
                dC = ((b) cVar).c();
            }
            arrayList.add(JavaOnlyMap.INSTANCE.of(cVar.a(), Double.valueOf(dC)));
        }
        propsMap.putArray("transform", JavaOnlyArray.INSTANCE.from(arrayList));
    }
}
