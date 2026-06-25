package com.revenuecat.purchases.paywalls.components.common.serializers;

import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/serializers/DowngradeReplacementModeDeserializer;", "Lcom/revenuecat/purchases/utils/serializers/EnumDeserializerWithDefault;", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "()V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DowngradeReplacementModeDeserializer extends EnumDeserializerWithDefault<GoogleReplacementMode> {
    public static final DowngradeReplacementModeDeserializer INSTANCE = new DowngradeReplacementModeDeserializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.serializers.DowngradeReplacementModeDeserializer$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(GoogleReplacementMode value) {
            AbstractC5504s.h(value, "value");
            String lowerCase = value.name().toLowerCase(Locale.ROOT);
            AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
    }

    private DowngradeReplacementModeDeserializer() {
        super(GoogleReplacementMode.DEFERRED, AnonymousClass1.INSTANCE);
    }
}
