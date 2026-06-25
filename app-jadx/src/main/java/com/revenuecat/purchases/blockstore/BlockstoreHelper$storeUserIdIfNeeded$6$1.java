package com.revenuecat.purchases.blockstore;

import Td.L;
import Td.u;
import Zd.e;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "LTd/L;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BlockstoreHelper$storeUserIdIfNeeded$6$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ e $cont;
    final /* synthetic */ String $userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlockstoreHelper$storeUserIdIfNeeded$6$1(e eVar, String str) {
        super(1);
        this.$cont = eVar;
        this.$userId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Integer) obj);
        return L.f17438a;
    }

    public final void invoke(Integer num) {
        String str = this.$userId;
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "Block store: User ID: " + str + " stored in Block store.");
        }
        e eVar = this.$cont;
        u.a aVar = u.f17466b;
        eVar.resumeWith(u.b(L.f17438a));
    }
}
