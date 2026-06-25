package com.revenuecat.purchases.common.diagnostics;

import Td.AbstractC2163n;
import android.content.Context;
import android.content.SharedPreferences;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "", "Landroid/content/Context;", "context", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "diagnosticsFileHelper", "Lkotlin/Lazy;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/Context;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;Lkotlin/Lazy;)V", "LTd/L;", "resetDiagnosticsStatus", "()V", "clearConsecutiveNumberOfErrors", "", "increaseConsecutiveNumberOfErrors", "()I", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "Lkotlin/Lazy;", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticsHelper {
    public static final String CONSECUTIVE_FAILURES_COUNT_KEY = "consecutive_failures_count";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final Lazy sharedPreferences;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsHelper$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // ie.InterfaceC5082a
        public final SharedPreferences invoke() {
            return DiagnosticsHelper.INSTANCE.initializeSharedPreferences(this.$context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper$Companion;", "", "()V", "CONSECUTIVE_FAILURES_COUNT_KEY", "", "getCONSECUTIVE_FAILURES_COUNT_KEY$annotations", "initializeSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            AbstractC5504s.h(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com_revenuecat_purchases_" + context.getPackageName() + "_preferences_diagnostics", 0);
            AbstractC5504s.g(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }

        private Companion() {
        }

        public static /* synthetic */ void getCONSECUTIVE_FAILURES_COUNT_KEY$annotations() {
        }
    }

    public DiagnosticsHelper(Context context, DiagnosticsFileHelper diagnosticsFileHelper, Lazy sharedPreferences) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(diagnosticsFileHelper, "diagnosticsFileHelper");
        AbstractC5504s.h(sharedPreferences, "sharedPreferences");
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.sharedPreferences = sharedPreferences;
    }

    public final void clearConsecutiveNumberOfErrors() {
        ((SharedPreferences) this.sharedPreferences.getValue()).edit().remove(CONSECUTIVE_FAILURES_COUNT_KEY).apply();
    }

    public final int increaseConsecutiveNumberOfErrors() {
        int i10 = ((SharedPreferences) this.sharedPreferences.getValue()).getInt(CONSECUTIVE_FAILURES_COUNT_KEY, 0) + 1;
        ((SharedPreferences) this.sharedPreferences.getValue()).edit().putInt(CONSECUTIVE_FAILURES_COUNT_KEY, i10).apply();
        return i10;
    }

    public final void resetDiagnosticsStatus() {
        clearConsecutiveNumberOfErrors();
        this.diagnosticsFileHelper.deleteFile();
    }

    public /* synthetic */ DiagnosticsHelper(Context context, DiagnosticsFileHelper diagnosticsFileHelper, Lazy lazy, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, diagnosticsFileHelper, (i10 & 4) != 0 ? AbstractC2163n.b(new AnonymousClass1(context)) : lazy);
    }
}
