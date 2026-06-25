package com.revenuecat.purchases.common.caching;

import Df.r;
import Rf.j;
import Ud.AbstractC2279u;
import Wf.AbstractC2358b;
import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.JsonTools;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\b\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;", "", "Landroid/content/Context;", "context", "", "apiKey", "Landroid/content/SharedPreferences;", "sharedPreferences", "LWf/b;", "json", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/SharedPreferences;LWf/b;)V", "tokenHash", "", "hasCachedData", "(Ljava/lang/String;)Z", "purchaseToken", "getTokenHash", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "data", "LTd/L;", "cacheLocalTransactionMetadata", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;)V", "getLocalTransactionMetadata", "(Ljava/lang/String;)Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "", "getAllLocalTransactionMetadata", "()Ljava/util/List;", "", "purchaseTokens", "clearLocalTransactionMetadata", "(Ljava/util/Set;)V", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "LWf/b;", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocalTransactionMetadataStore {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_PREFIX = "local_transaction_metadata_";
    private final String apiKey;
    private final AbstractC2358b json;
    private final SharedPreferences sharedPreferences;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore$Companion;", "", "()V", "KEY_PREFIX", "", "initializeSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "apiKey", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SharedPreferences initializeSharedPreferences(Context context, String apiKey) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(apiKey, "apiKey");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.revenuecat.purchases.transaction_metadata." + apiKey, 0);
            AbstractC5504s.g(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }

        private Companion() {
        }
    }

    public LocalTransactionMetadataStore(Context context, String apiKey, SharedPreferences sharedPreferences, AbstractC2358b json) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(sharedPreferences, "sharedPreferences");
        AbstractC5504s.h(json, "json");
        this.apiKey = apiKey;
        this.sharedPreferences = sharedPreferences;
        this.json = json;
    }

    private final String getTokenHash(String purchaseToken) {
        return UtilsKt.sha1(purchaseToken);
    }

    private final boolean hasCachedData(String tokenHash) {
        return this.sharedPreferences.contains(KEY_PREFIX + tokenHash);
    }

    public final synchronized void cacheLocalTransactionMetadata(String purchaseToken, LocalTransactionMetadata data) {
        AbstractC5504s.h(purchaseToken, "purchaseToken");
        AbstractC5504s.h(data, "data");
        String tokenHash = getTokenHash(purchaseToken);
        if (hasCachedData(tokenHash)) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Purchase data already cached for token: " + purchaseToken + ". Skipping cache.");
            }
            return;
        }
        try {
            String str = KEY_PREFIX + tokenHash;
            String strB = this.json.b(LocalTransactionMetadata.INSTANCE.serializer(), data);
            SharedPreferences.Editor editor = this.sharedPreferences.edit();
            AbstractC5504s.g(editor, "editor");
            editor.putString(str, strB);
            editor.apply();
            LogLevel logLevel2 = LogLevel.DEBUG;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Local transaction metadata cache updated");
            }
        } catch (j e10) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to serialize local transaction metadata", e10);
        }
    }

    public final synchronized void clearLocalTransactionMetadata(Set<String> purchaseTokens) {
        try {
            AbstractC5504s.h(purchaseTokens, "purchaseTokens");
            if (purchaseTokens.isEmpty()) {
                return;
            }
            Set<String> set = purchaseTokens;
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(getTokenHash((String) it.next()));
            }
            SharedPreferences.Editor editor = this.sharedPreferences.edit();
            AbstractC5504s.g(editor, "editor");
            Iterator it2 = arrayList.iterator();
            int i10 = 0;
            while (it2.hasNext()) {
                String str = KEY_PREFIX + ((String) it2.next());
                if (this.sharedPreferences.contains(str)) {
                    editor.remove(str);
                    i10++;
                }
            }
            editor.apply();
            if (i10 > 0) {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Cleared local transaction metadata for " + i10 + " token(s)");
                }
            } else {
                LogLevel logLevel2 = LogLevel.DEBUG;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "No transaction metadata found to clear from local cache.");
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final List<LocalTransactionMetadata> getAllLocalTransactionMetadata() {
        Set<String> setKeySet = this.sharedPreferences.getAll().keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String it = (String) obj;
            AbstractC5504s.g(it, "it");
            if (r.Q(it, KEY_PREFIX, false, 2, null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            String string = this.sharedPreferences.getString(str, null);
            if (string != null) {
                try {
                    arrayList2.add((LocalTransactionMetadata) this.json.d(LocalTransactionMetadata.INSTANCE.serializer(), string));
                } catch (j e10) {
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to deserialize transaction metadata for key: " + str, e10);
                    SharedPreferences.Editor editor = this.sharedPreferences.edit();
                    AbstractC5504s.g(editor, "editor");
                    editor.remove(str);
                    editor.apply();
                }
            }
        }
        return arrayList2;
    }

    public final LocalTransactionMetadata getLocalTransactionMetadata(String purchaseToken) {
        AbstractC5504s.h(purchaseToken, "purchaseToken");
        String str = KEY_PREFIX + getTokenHash(purchaseToken);
        String string = this.sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return (LocalTransactionMetadata) this.json.d(LocalTransactionMetadata.INSTANCE.serializer(), string);
        } catch (j e10) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to deserialize local transaction metadata. Clearing cache.", e10);
            SharedPreferences.Editor editor = this.sharedPreferences.edit();
            AbstractC5504s.g(editor, "editor");
            editor.remove(str);
            editor.apply();
            return null;
        }
    }

    public /* synthetic */ LocalTransactionMetadataStore(Context context, String str, SharedPreferences sharedPreferences, AbstractC2358b abstractC2358b, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? Companion.initializeSharedPreferences(context, str) : sharedPreferences, (i10 & 8) != 0 ? JsonTools.INSTANCE.getJson() : abstractC2358b);
    }
}
