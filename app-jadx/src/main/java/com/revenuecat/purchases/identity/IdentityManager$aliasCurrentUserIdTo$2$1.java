package com.revenuecat.purchases.identity;

import Td.L;
import Td.u;
import Zd.e;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.verification.SigningManager;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class IdentityManager$aliasCurrentUserIdTo$2$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ e $continuation;
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ String $oldAppUserID;
    final /* synthetic */ IdentityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityManager$aliasCurrentUserIdTo$2$1(IdentityManager identityManager, e eVar, String str, String str2) {
        super(0);
        this.this$0 = identityManager;
        this.$continuation = eVar;
        this.$newAppUserID = str;
        this.$oldAppUserID = str2;
    }

    @Override // ie.InterfaceC5082a
    public /* bridge */ /* synthetic */ Object invoke() {
        m261invoke();
        return L.f17438a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m261invoke() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        IdentityManager identityManager = this.this$0;
        String str3 = this.$newAppUserID;
        String str4 = this.$oldAppUserID;
        synchronized (identityManager) {
            try {
                LogIntent logIntent = LogIntent.USER;
                IdentityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1 identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1 = new IdentityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1(logIntent, str4, str3);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                        break;
                }
                identityManager.offeringsCache.clearCache();
                identityManager.deviceCache.clearCustomerInfoCache$purchases_defaultsBc8Release(str3);
                identityManager.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e eVar = this.$continuation;
        u.a aVar = u.f17466b;
        eVar.resumeWith(u.b(L.f17438a));
    }
}
