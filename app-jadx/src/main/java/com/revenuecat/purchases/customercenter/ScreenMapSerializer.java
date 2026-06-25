package com.revenuecat.purchases.customercenter;

import Rf.b;
import Sf.a;
import Tf.e;
import Uf.f;
import Wf.h;
import Wf.i;
import Wf.j;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/customercenter/ScreenMapSerializer;", "LRf/b;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "<init>", "()V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Ljava/util/Map;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Ljava/util/Map;)V", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScreenMapSerializer implements b {
    public static final ScreenMapSerializer INSTANCE = new ScreenMapSerializer();
    private static final e descriptor = a.i(CustomerCenterConfigData.Screen.ScreenType.INSTANCE.serializer(), CustomerCenterConfigData.Screen.INSTANCE.serializer()).getDescriptor();

    private ScreenMapSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.a
    public Map<CustomerCenterConfigData.Screen.ScreenType, CustomerCenterConfigData.Screen> deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h hVar = decoder instanceof h ? (h) decoder : null;
        if (hVar == null) {
            throw new IllegalStateException("Can be deserialized only by JSON");
        }
        for (Map.Entry<String, i> entry : j.n(hVar.g()).entrySet()) {
            String key = entry.getKey();
            try {
                linkedHashMap.put(CustomerCenterConfigData.Screen.ScreenType.valueOf(key), hVar.d().c(CustomerCenterConfigData.Screen.INSTANCE.serializer(), entry.getValue()));
            } catch (IllegalArgumentException unused) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Unknown CustomerCenter ScreenType: " + key + ". Ignoring.");
                }
            }
        }
        return linkedHashMap;
    }

    @Override // Rf.k
    public void serialize(f encoder, Map<CustomerCenterConfigData.Screen.ScreenType, CustomerCenterConfigData.Screen> value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        a.i(CustomerCenterConfigData.Screen.ScreenType.INSTANCE.serializer(), CustomerCenterConfigData.Screen.INSTANCE.serializer()).serialize(encoder, value);
    }
}
