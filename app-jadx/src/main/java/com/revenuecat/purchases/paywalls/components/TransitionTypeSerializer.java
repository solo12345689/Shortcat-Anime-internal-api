package com.revenuecat.purchases.paywalls.components;

import Td.r;
import com.revenuecat.purchases.paywalls.components.PaywallTransition;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TransitionTypeSerializer;", "Lcom/revenuecat/purchases/utils/serializers/EnumDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "()V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransitionTypeSerializer extends EnumDeserializerWithDefault<PaywallTransition.TransitionType> {
    public static final TransitionTypeSerializer INSTANCE = new TransitionTypeSerializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.TransitionTypeSerializer$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.TransitionTypeSerializer$1$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PaywallTransition.TransitionType.values().length];
                try {
                    iArr[PaywallTransition.TransitionType.FADE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaywallTransition.TransitionType.FADE_AND_SCALE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PaywallTransition.TransitionType.SCALE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PaywallTransition.TransitionType.SLIDE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(PaywallTransition.TransitionType value) {
            AbstractC5504s.h(value, "value");
            int i10 = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
            if (i10 == 1) {
                return "fade";
            }
            if (i10 == 2) {
                return "fade_and_scale";
            }
            if (i10 == 3) {
                return "scale";
            }
            if (i10 == 4) {
                return "slide";
            }
            throw new r();
        }
    }

    private TransitionTypeSerializer() {
        super(PaywallTransition.TransitionType.FADE, AnonymousClass1.INSTANCE);
    }
}
