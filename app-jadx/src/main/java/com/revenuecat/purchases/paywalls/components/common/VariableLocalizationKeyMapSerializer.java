package com.revenuecat.purchases.paywalls.components.common;

import Rf.b;
import Sf.a;
import Tf.e;
import Uf.f;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKeyMapSerializer;", "LRf/b;", "", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "<init>", "()V", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Ljava/util/Map;)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Ljava/util/Map;", "delegate", "LRf/b;", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VariableLocalizationKeyMapSerializer implements b {
    public static final VariableLocalizationKeyMapSerializer INSTANCE = new VariableLocalizationKeyMapSerializer();
    private static final b delegate;
    private static final e descriptor;

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKeyMapSerializer$deserialize$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "<name for destructuring parameter 0>", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final VariableLocalizationKey invoke(Map.Entry<String, String> entry) {
            AbstractC5504s.h(entry, "<name for destructuring parameter 0>");
            try {
                String upperCase = entry.getKey().toUpperCase(Locale.ROOT);
                AbstractC5504s.g(upperCase, "toUpperCase(...)");
                return VariableLocalizationKey.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    static {
        U u10 = U.f52264a;
        b bVarI = a.i(a.F(u10), a.F(u10));
        delegate = bVarI;
        descriptor = bVarI.getDescriptor();
    }

    private VariableLocalizationKeyMapSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, Map<VariableLocalizationKey, String> value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
    }

    @Override // Rf.a
    public Map<VariableLocalizationKey, String> deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return MapExtensionsKt.mapNotNullKeys((Map) decoder.C(delegate), AnonymousClass1.INSTANCE);
    }
}
