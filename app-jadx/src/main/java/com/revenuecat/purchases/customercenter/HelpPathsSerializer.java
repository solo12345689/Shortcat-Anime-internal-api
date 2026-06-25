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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/customercenter/HelpPathsSerializer;", "LRf/b;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "<init>", "()V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Ljava/util/List;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Ljava/util/List;)V", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HelpPathsSerializer implements b {
    public static final HelpPathsSerializer INSTANCE = new HelpPathsSerializer();
    private static final e descriptor = a.g(CustomerCenterConfigData.HelpPath.INSTANCE.serializer()).getDescriptor();

    private HelpPathsSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.a
    public List<CustomerCenterConfigData.HelpPath> deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        ArrayList arrayList = new ArrayList();
        h hVar = decoder instanceof h ? (h) decoder : null;
        if (hVar == null) {
            throw new IllegalStateException("Can be deserialized only by JSON");
        }
        Iterator<i> it = j.m(hVar.g()).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(hVar.d().c(CustomerCenterConfigData.HelpPath.INSTANCE.serializer(), it.next()));
            } catch (IllegalArgumentException e10) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Issue deserializing CustomerCenter HelpPath. Ignoring. Error: " + e10);
                }
            }
        }
        return arrayList;
    }

    @Override // Rf.k
    public void serialize(f encoder, List<CustomerCenterConfigData.HelpPath> value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        a.g(CustomerCenterConfigData.HelpPath.INSTANCE.serializer()).serialize(encoder, value);
    }
}
