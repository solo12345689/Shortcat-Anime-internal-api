package pc;

import Ud.AbstractC2279u;
import cc.C3093a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import pe.C6029s;
import pe.InterfaceC6027q;
import rb.AbstractC6300a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class O extends AbstractC5990u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6027q f55900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55901b;

    public O(X converterProvider, InterfaceC6027q mapType) {
        AbstractC5504s.h(converterProvider, "converterProvider");
        AbstractC5504s.h(mapType, "mapType");
        this.f55900a = mapType;
        InterfaceC6027q interfaceC6027qC = ((C6029s) AbstractC2279u.m0(mapType.e())).c();
        if (AbstractC5504s.c(interfaceC6027qC != null ? interfaceC6027qC.c() : null, kotlin.jvm.internal.O.b(String.class))) {
            C6029s c6029s = (C6029s) AbstractC2279u.p0(mapType.e(), 1);
            InterfaceC6027q interfaceC6027qC2 = c6029s != null ? c6029s.c() : null;
            if (interfaceC6027qC2 == null) {
                throw new IllegalArgumentException("The map type should contain the key type.");
            }
            this.f55901b = converterProvider.a(interfaceC6027qC2);
            return;
        }
        throw new IllegalArgumentException(("The map key type should be String, but received " + AbstractC2279u.m0(mapType.e()) + ".").toString());
    }

    private final Map k(ReadableMap readableMap, Ub.d dVar, boolean z10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            String key = next.getKey();
            DynamicFromObject dynamicFromObject = new DynamicFromObject(next.getValue());
            try {
                linkedHashMap.put(key, this.f55901b.a(dynamicFromObject, dVar, z10));
                Td.L l10 = Td.L.f17438a;
                dynamicFromObject.recycle();
            } finally {
            }
        }
        return linkedHashMap;
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return this.f55901b.b();
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return ExpectedType.INSTANCE.d(this.f55901b.c());
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Map e(Object value, Ub.d dVar, boolean z10) throws C3093a {
        CodedException unexpectedException;
        AbstractC5504s.h(value, "value");
        if (this.f55901b.b() && !z10) {
            return (Map) value;
        }
        Map map = (Map) value;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ud.S.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value2 = entry.getValue();
            try {
                linkedHashMap.put(key, this.f55901b.a(value2, dVar, z10));
            } catch (Throwable th2) {
                if (th2 instanceof CodedException) {
                    unexpectedException = (CodedException) th2;
                } else if (th2 instanceof AbstractC6300a) {
                    AbstractC6300a abstractC6300a = (AbstractC6300a) th2;
                    String strA = abstractC6300a.a();
                    AbstractC5504s.g(strA, "getCode(...)");
                    unexpectedException = new CodedException(strA, abstractC6300a.getMessage(), abstractC6300a.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th2);
                }
                InterfaceC6027q interfaceC6027q = this.f55900a;
                InterfaceC6027q interfaceC6027qC = ((C6029s) this.f55900a.e().get(1)).c();
                AbstractC5504s.e(interfaceC6027qC);
                AbstractC5504s.e(value2);
                throw new C3093a(interfaceC6027q, interfaceC6027qC, kotlin.jvm.internal.O.b(value2.getClass()), unexpectedException);
            }
        }
        return linkedHashMap;
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException {
        AbstractC5504s.h(value, "value");
        ReadableMap readableMapAsMap = value.asMap();
        if (readableMapAsMap != null) {
            return k(readableMapAsMap, dVar, z10);
        }
        throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableMap.class));
    }
}
