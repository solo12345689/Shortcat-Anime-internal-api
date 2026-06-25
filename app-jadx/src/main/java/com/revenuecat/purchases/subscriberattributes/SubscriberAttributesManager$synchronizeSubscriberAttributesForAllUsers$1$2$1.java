package com.revenuecat.purchases.subscriberattributes;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.verification.SigningManager;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.L;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ InterfaceC5082a $completion;
    final /* synthetic */ String $currentAppUserID;
    final /* synthetic */ L $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, String str2, L l10, InterfaceC5082a interfaceC5082a, int i10) {
        super(0);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentAppUserID = str2;
        this.$currentSyncedAttributeCount = l10;
        this.$completion = interfaceC5082a;
        this.$unsyncedStoredAttributesCount = i10;
    }

    @Override // ie.InterfaceC5082a
    public /* bridge */ /* synthetic */ Object invoke() {
        m367invoke();
        return Td.L.f17438a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m367invoke() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, AbstractC2279u.m());
        LogIntent logIntent = LogIntent.RC_SUCCESS;
        SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1 subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1 = new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1(logIntent, this.$syncingAppUserID);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke());
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1$invoke$$inlined$log$1.invoke(), null);
                break;
        }
        if (!AbstractC5504s.c(this.$currentAppUserID, this.$syncingAppUserID)) {
            this.this$0.getDeviceCache().clearSubscriberAttributesIfSyncedForSubscriber(this.$syncingAppUserID);
        }
        L l10 = this.$currentSyncedAttributeCount;
        int i10 = l10.f52257a + 1;
        l10.f52257a = i10;
        InterfaceC5082a interfaceC5082a = this.$completion;
        if (interfaceC5082a == null || i10 != this.$unsyncedStoredAttributesCount) {
            return;
        }
        interfaceC5082a.invoke();
    }
}
