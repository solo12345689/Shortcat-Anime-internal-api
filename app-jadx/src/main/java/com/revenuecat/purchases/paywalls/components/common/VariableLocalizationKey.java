package com.revenuecat.purchases.paywalls.components.common;

import Rf.b;
import Td.AbstractC2163n;
import Td.q;
import Vf.A;
import ie.InterfaceC5082a;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b1\b\u0087\u0001\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "(Ljava/lang/String;I)V", "DAY", "DAILY", "DAY_SHORT", "WEEK", "WEEKLY", "WEEK_SHORT", "MONTH", "MONTHLY", "MONTH_SHORT", "YEAR", "YEARLY", "YEAR_SHORT", "ANNUAL", "ANNUALLY", "ANNUAL_SHORT", "LIFETIME", "FREE_PRICE", "PERCENT", "NUM_DAY_ZERO", "NUM_DAY_ONE", "NUM_DAY_TWO", "NUM_DAY_FEW", "NUM_DAY_MANY", "NUM_DAY_OTHER", "NUM_WEEK_ZERO", "NUM_WEEK_ONE", "NUM_WEEK_TWO", "NUM_WEEK_FEW", "NUM_WEEK_MANY", "NUM_WEEK_OTHER", "NUM_MONTH_ZERO", "NUM_MONTH_ONE", "NUM_MONTH_TWO", "NUM_MONTH_FEW", "NUM_MONTH_MANY", "NUM_MONTH_OTHER", "NUM_YEAR_ZERO", "NUM_YEAR_ONE", "NUM_YEAR_TWO", "NUM_YEAR_FEW", "NUM_YEAR_MANY", "NUM_YEAR_OTHER", "NUM_DAYS_SHORT", "NUM_WEEKS_SHORT", "NUM_MONTHS_SHORT", "NUM_YEARS_SHORT", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum VariableLocalizationKey {
    DAY,
    DAILY,
    DAY_SHORT,
    WEEK,
    WEEKLY,
    WEEK_SHORT,
    MONTH,
    MONTHLY,
    MONTH_SHORT,
    YEAR,
    YEARLY,
    YEAR_SHORT,
    ANNUAL,
    ANNUALLY,
    ANNUAL_SHORT,
    LIFETIME,
    FREE_PRICE,
    PERCENT,
    NUM_DAY_ZERO,
    NUM_DAY_ONE,
    NUM_DAY_TWO,
    NUM_DAY_FEW,
    NUM_DAY_MANY,
    NUM_DAY_OTHER,
    NUM_WEEK_ZERO,
    NUM_WEEK_ONE,
    NUM_WEEK_TWO,
    NUM_WEEK_FEW,
    NUM_WEEK_MANY,
    NUM_WEEK_OTHER,
    NUM_MONTH_ZERO,
    NUM_MONTH_ONE,
    NUM_MONTH_TWO,
    NUM_MONTH_FEW,
    NUM_MONTH_MANY,
    NUM_MONTH_OTHER,
    NUM_YEAR_ZERO,
    NUM_YEAR_ONE,
    NUM_YEAR_TWO,
    NUM_YEAR_FEW,
    NUM_YEAR_MANY,
    NUM_YEAR_OTHER,
    NUM_DAYS_SHORT,
    NUM_WEEKS_SHORT,
    NUM_MONTHS_SHORT,
    NUM_YEARS_SHORT;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, Companion.AnonymousClass1.INSTANCE);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey$Companion$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // ie.InterfaceC5082a
            public final b invoke() {
                return A.a("com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey", VariableLocalizationKey.values(), new String[]{"day", "daily", "day_short", "week", "weekly", "week_short", "month", "monthly", "month_short", "year", "yearly", "year_short", "annual", "annually", "annual_short", "lifetime", "free_price", "percent", "num_day_zero", "num_day_one", "num_day_two", "num_day_few", "num_day_many", "num_day_other", "num_week_zero", "num_week_one", "num_week_two", "num_week_few", "num_week_many", "num_week_other", "num_month_zero", "num_month_one", "num_month_two", "num_month_few", "num_month_many", "num_month_other", "num_year_zero", "num_year_one", "num_year_two", "num_year_few", "num_year_many", "num_year_other", "num_days_short", "num_weeks_short", "num_months_short", "num_years_short"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) VariableLocalizationKey.$cachedSerializer$delegate.getValue();
        }

        public final b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
