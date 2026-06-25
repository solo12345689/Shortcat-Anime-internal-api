package com.revenuecat.purchases.ui.revenuecatui.components;

import b4.C2986c;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;", "", "(Ljava/lang/String;I)V", "COMPACT", "MEDIUM", "EXPANDED", "Companion", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum ScreenCondition {
    COMPACT,
    MEDIUM,
    EXPANDED;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition$Companion;", "", "<init>", "()V", "Lb4/c;", "sizeClass", "Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;", "from", "(Lb4/c;)Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ScreenCondition from(C2986c sizeClass) {
            AbstractC5504s.h(sizeClass, "sizeClass");
            if (AbstractC5504s.c(sizeClass, C2986c.f33099c)) {
                return ScreenCondition.COMPACT;
            }
            if (AbstractC5504s.c(sizeClass, C2986c.f33100d)) {
                return ScreenCondition.MEDIUM;
            }
            if (AbstractC5504s.c(sizeClass, C2986c.f33101e)) {
                return ScreenCondition.EXPANDED;
            }
            Logger.INSTANCE.d("Unexpected WindowWidthSizeClass: '" + sizeClass + "'. Falling back to COMPACT.");
            return ScreenCondition.COMPACT;
        }

        private Companion() {
        }
    }
}
