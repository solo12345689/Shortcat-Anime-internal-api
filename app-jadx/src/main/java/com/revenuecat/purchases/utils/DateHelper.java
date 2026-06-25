package com.revenuecat.purchases.utils;

import Ef.a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/utils/DateHelper;", "", "()V", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DateHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ENTITLEMENT_GRACE_PERIOD;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/utils/DateHelper$Companion;", "", "<init>", "()V", "Ljava/util/Date;", "expirationDate", "requestDate", "LEf/a;", "gracePeriod", "Lcom/revenuecat/purchases/utils/DateActive;", "isDateActive-SxA4cEA", "(Ljava/util/Date;Ljava/util/Date;J)Lcom/revenuecat/purchases/utils/DateActive;", "isDateActive", "ENTITLEMENT_GRACE_PERIOD", "J", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: isDateActive-SxA4cEA$default */
        public static /* synthetic */ DateActive m933isDateActiveSxA4cEA$default(Companion companion, Date date, Date date2, long j10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                j10 = DateHelper.ENTITLEMENT_GRACE_PERIOD;
            }
            return companion.m934isDateActiveSxA4cEA(date, date2, j10);
        }

        /* JADX INFO: renamed from: isDateActive-SxA4cEA */
        public final DateActive m934isDateActiveSxA4cEA(Date expirationDate, Date requestDate, long gracePeriod) {
            AbstractC5504s.h(requestDate, "requestDate");
            if (expirationDate == null) {
                return new DateActive(true, true);
            }
            boolean z10 = new Date().getTime() - requestDate.getTime() <= Ef.a.w(gracePeriod);
            if (!z10) {
                requestDate = new Date();
            }
            return new DateActive(expirationDate.after(requestDate), z10);
        }

        private Companion() {
        }
    }

    static {
        a.C0060a c0060a = Ef.a.f5961b;
        ENTITLEMENT_GRACE_PERIOD = Ef.c.s(3, Ef.d.f5974h);
    }

    private DateHelper() {
    }
}
