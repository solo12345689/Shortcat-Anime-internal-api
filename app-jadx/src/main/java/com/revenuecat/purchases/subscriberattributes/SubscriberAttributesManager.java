package com.revenuecat.purchases.subscriberattributes;

import Df.r;
import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import android.app.Application;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001IB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142 \u0010\u0017\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\u0004\u0012\u00020\u00110\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001b\u001a\u00020\u00112\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u0013J'\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u00020\u00112\n\u0010\"\u001a\u00060\rj\u0002`!2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010#¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020\u00112\n\u0010&\u001a\u00060\rj\u0002`!2\n\u0010'\u001a\u00060\rj\u0002`!¢\u0006\u0004\b(\u0010)J9\u0010+\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\"\u0010\u0017\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`*\u0012\u0004\u0012\u00020\u00110\u0016¢\u0006\u0004\b+\u0010,J7\u00101\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.¢\u0006\u0004\b1\u00102J'\u00104\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0010\u00103\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f¢\u0006\u0004\b4\u00105J1\u00106\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b8\u00109J/\u0010<\u001a\u00020\u00112\u0006\u0010;\u001a\u00020:2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "backend", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "deviceIdentifiersFetcher", "", "automaticDeviceIdentifierCollectionEnabled", "<init>", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;Z)V", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "attributesAsObjects", "appUserID", "LTd/L;", "storeAttributesIfNeeded", "(Ljava/util/Map;Ljava/lang/String;)V", "Landroid/app/Application;", "applicationContext", "Lkotlin/Function1;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;Lkotlin/jvm/functions/Function1;)V", "attributesToSet", "setAttributes", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", SubscriberAttributeKt.JSON_NAME_KEY, "value", "setAttribute", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "currentAppUserID", "Lkotlin/Function0;", "synchronizeSubscriberAttributesForAllUsers", "(Ljava/lang/String;Lie/a;)V", "originalAppUserId", "newAppUserID", "copyUnsyncedSubscriberAttributes", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "getUnsyncedSubscriberAttributes", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "attributesToMarkAsSynced", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "attributeErrors", "markAsSynced", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "data", "setAppsFlyerConversionData", "(Ljava/lang/String;Ljava/util/Map;)V", "setAppstackAttributionParams", "(Ljava/lang/String;Ljava/util/Map;Landroid/app/Application;)V", "collectDeviceIdentifiers", "(Ljava/lang/String;Landroid/app/Application;)V", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "attributionKey", "setAttributionID", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "getDeviceCache", "()Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "getBackend", "()Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "Z", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "obtainingDeviceIdentifiersObservable", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "ObtainDeviceIdentifiersObservable", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubscriberAttributesManager {
    private final boolean automaticDeviceIdentifierCollectionEnabled;
    private final SubscriberAttributesPoster backend;
    private final SubscriberAttributesCache deviceCache;
    private final DeviceIdentifiersFetcher deviceIdentifiersFetcher;
    private final ObtainDeviceIdentifiersObservable obtainingDeviceIdentifiersObservable;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0011j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\u00128BX\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "Ljava/util/Observable;", "<init>", "()V", "Lkotlin/Function0;", "LTd/L;", "completion", "waitUntilIdle", "(Lie/a;)V", "", "value", "numberOfProcesses", "I", "getNumberOfProcesses", "()I", "setNumberOfProcesses", "(I)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class ObtainDeviceIdentifiersObservable extends Observable {
        private final ArrayList<InterfaceC5082a> listeners = new ArrayList<>();
        private int numberOfProcesses;

        public ObtainDeviceIdentifiersObservable() {
            addObserver(new Observer() { // from class: com.revenuecat.purchases.subscriberattributes.a
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    SubscriberAttributesManager.ObtainDeviceIdentifiersObservable._init_$lambda$2(this.f44178a, observable, obj);
                }
            });
        }

        public static final void _init_$lambda$2(ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable, Observable observable, Object obj) {
            AbstractC5504s.f(observable, "null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable");
            if (((ObtainDeviceIdentifiersObservable) observable).numberOfProcesses == 0) {
                synchronized (obtainDeviceIdentifiersObservable) {
                    try {
                        Iterator<T> it = obtainDeviceIdentifiersObservable.listeners.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC5082a) it.next()).invoke();
                        }
                        obtainDeviceIdentifiersObservable.listeners.clear();
                        L l10 = L.f17438a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final synchronized int getNumberOfProcesses() {
            return this.numberOfProcesses;
        }

        public final synchronized void setNumberOfProcesses(int i10) {
            if (this.numberOfProcesses == i10) {
                return;
            }
            this.numberOfProcesses = i10;
            setChanged();
            notifyObservers();
        }

        public final synchronized void waitUntilIdle(InterfaceC5082a completion) {
            try {
                AbstractC5504s.h(completion, "completion");
                if (this.numberOfProcesses == 0) {
                    completion.invoke();
                } else {
                    this.listeners.add(new SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(completion));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$collectDeviceIdentifiers$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ String $appUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(1);
            this.$appUserID = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, String>) obj);
            return L.f17438a;
        }

        public final void invoke(Map<String, String> deviceIdentifiers) {
            AbstractC5504s.h(deviceIdentifiers, "deviceIdentifiers");
            SubscriberAttributesManager.this.setAttributes(deviceIdentifiers, this.$appUserID);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$getDeviceIdentifiers$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41481 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $completion;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41481(Function1 function1, SubscriberAttributesManager subscriberAttributesManager) {
            super(1);
            this.$completion = function1;
            this.this$0 = subscriberAttributesManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, String>) obj);
            return L.f17438a;
        }

        public final void invoke(Map<String, String> deviceIdentifiers) {
            AbstractC5504s.h(deviceIdentifiers, "deviceIdentifiers");
            this.$completion.invoke(deviceIdentifiers);
            this.this$0.obtainingDeviceIdentifiersObservable.setNumberOfProcesses(r2.getNumberOfProcesses() - 1);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$getUnsyncedSubscriberAttributes$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41491 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Function1 $completion;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41491(Function1 function1, SubscriberAttributesManager subscriberAttributesManager, String str) {
            super(0);
            this.$completion = function1;
            this.this$0 = subscriberAttributesManager;
            this.$appUserID = str;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m365invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m365invoke() {
            this.$completion.invoke(this.this$0.getDeviceCache().getUnsyncedSubscriberAttributes(this.$appUserID));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$setAttributionID$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41501 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $setAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41501(Function1 function1) {
            super(1);
            this.$setAttributes = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, String>) obj);
            return L.f17438a;
        }

        public final void invoke(Map<String, String> deviceIdentifiers) {
            AbstractC5504s.h(deviceIdentifiers, "deviceIdentifiers");
            this.$setAttributes.invoke(deviceIdentifiers);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41511 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ InterfaceC5082a $completion;
        final /* synthetic */ String $currentAppUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41511(InterfaceC5082a interfaceC5082a, String str) {
            super(0);
            this.$completion = interfaceC5082a;
            this.$currentAppUserID = str;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m366invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m366invoke() {
            LogHandler currentLogHandler;
            String str;
            String str2;
            Map<String, Map<String, SubscriberAttribute>> unsyncedSubscriberAttributes = SubscriberAttributesManager.this.getDeviceCache().getUnsyncedSubscriberAttributes();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : unsyncedSubscriberAttributes.entrySet()) {
                if (!r.l0(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (!linkedHashMap.isEmpty()) {
                int size = linkedHashMap.size();
                kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
                SubscriberAttributesManager subscriberAttributesManager = SubscriberAttributesManager.this;
                kotlin.jvm.internal.L l11 = l10;
                String str3 = this.$currentAppUserID;
                InterfaceC5082a interfaceC5082a = this.$completion;
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str4 = (String) entry2.getKey();
                    Map map = (Map) entry2.getValue();
                    SubscriberAttributesPoster backend = subscriberAttributesManager.getBackend();
                    Map<String, Map<String, Object>> backendMap = BackendHelpersKt.toBackendMap(map);
                    SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1 subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1 = new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1(subscriberAttributesManager, str4, map, str3, l11, interfaceC5082a, size);
                    String str5 = str3;
                    kotlin.jvm.internal.L l12 = l11;
                    InterfaceC5082a interfaceC5082a2 = interfaceC5082a;
                    SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2 subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2 = new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2(subscriberAttributesManager, str4, map, l12, interfaceC5082a2, size);
                    interfaceC5082a = interfaceC5082a2;
                    l11 = l12;
                    backend.postSubscriberAttributes(backendMap, str4, subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1, subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2);
                    str3 = str5;
                }
                return;
            }
            LogIntent logIntent = LogIntent.DEBUG;
            SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1 subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1 = new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            InterfaceC5082a interfaceC5082a3 = this.$completion;
            if (interfaceC5082a3 != null) {
                interfaceC5082a3.invoke();
            }
        }
    }

    public SubscriberAttributesManager(SubscriberAttributesCache deviceCache, SubscriberAttributesPoster backend, DeviceIdentifiersFetcher deviceIdentifiersFetcher, boolean z10) {
        AbstractC5504s.h(deviceCache, "deviceCache");
        AbstractC5504s.h(backend, "backend");
        AbstractC5504s.h(deviceIdentifiersFetcher, "deviceIdentifiersFetcher");
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.deviceIdentifiersFetcher = deviceIdentifiersFetcher;
        this.automaticDeviceIdentifierCollectionEnabled = z10;
        this.obtainingDeviceIdentifiersObservable = new ObtainDeviceIdentifiersObservable();
    }

    private final void getDeviceIdentifiers(Application applicationContext, Function1 completion) {
        ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.obtainingDeviceIdentifiersObservable;
        obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() + 1);
        this.deviceIdentifiersFetcher.getDeviceIdentifiers(applicationContext, new C41481(completion, this));
    }

    private final void storeAttributesIfNeeded(Map<String, SubscriberAttribute> attributesAsObjects, String appUserID) {
        Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(appUserID);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, SubscriberAttribute> entry : attributesAsObjects.entrySet()) {
            String key = entry.getKey();
            SubscriberAttribute value = entry.getValue();
            if (allStoredSubscriberAttributes.containsKey(key)) {
                SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
                if (!AbstractC5504s.c(subscriberAttribute != null ? subscriberAttribute.getValue() : null, value.getValue())) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        this.deviceCache.setAttributes(appUserID, linkedHashMap);
    }

    public static /* synthetic */ void synchronizeSubscriberAttributesForAllUsers$default(SubscriberAttributesManager subscriberAttributesManager, String str, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC5082a = null;
        }
        subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, interfaceC5082a);
    }

    public final void collectDeviceIdentifiers(String appUserID, Application applicationContext) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(applicationContext, "applicationContext");
        getDeviceIdentifiers(applicationContext, new AnonymousClass1(appUserID));
    }

    public final synchronized void copyUnsyncedSubscriberAttributes(String originalAppUserId, String newAppUserID) {
        try {
            AbstractC5504s.h(originalAppUserId, "originalAppUserId");
            AbstractC5504s.h(newAppUserID, "newAppUserID");
            Map<String, SubscriberAttribute> unsyncedSubscriberAttributes = this.deviceCache.getUnsyncedSubscriberAttributes(originalAppUserId);
            if (unsyncedSubscriberAttributes.isEmpty()) {
                return;
            }
            LogLevel logLevel = LogLevel.INFO;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                String str = "[Purchases] - " + logLevel.name();
                String str2 = String.format(AttributionStrings.COPYING_ATTRIBUTES_FROM_TO_USER, Arrays.copyOf(new Object[]{originalAppUserId, newAppUserID}, 2));
                AbstractC5504s.g(str2, "format(...)");
                currentLogHandler.i(str, str2);
            }
            this.deviceCache.setAttributes(newAppUserID, unsyncedSubscriberAttributes);
            this.deviceCache.clearAllSubscriberAttributesFromUser(originalAppUserId);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final SubscriberAttributesPoster getBackend() {
        return this.backend;
    }

    public final SubscriberAttributesCache getDeviceCache() {
        return this.deviceCache;
    }

    public final synchronized void getUnsyncedSubscriberAttributes(String appUserID, Function1 completion) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(completion, "completion");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new C41491(completion, this, appUserID));
    }

    public final synchronized void markAsSynced(String appUserID, Map<String, SubscriberAttribute> attributesToMarkAsSynced, List<SubscriberAttributeError> attributeErrors) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            AbstractC5504s.h(appUserID, "appUserID");
            AbstractC5504s.h(attributesToMarkAsSynced, "attributesToMarkAsSynced");
            AbstractC5504s.h(attributeErrors, "attributeErrors");
            if (!attributeErrors.isEmpty()) {
                LogIntent logIntent = LogIntent.RC_ERROR;
                SubscriberAttributesManager$markAsSynced$$inlined$log$1 subscriberAttributesManager$markAsSynced$$inlined$log$1 = new SubscriberAttributesManager$markAsSynced$$inlined$log$1(logIntent, attributeErrors);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                }
            }
            if (attributesToMarkAsSynced.isEmpty()) {
                return;
            }
            LogIntent logIntent2 = LogIntent.INFO;
            SubscriberAttributesManager$markAsSynced$$inlined$log$2 subscriberAttributesManager$markAsSynced$$inlined$log$2 = new SubscriberAttributesManager$markAsSynced$$inlined$log$2(logIntent2, appUserID, attributesToMarkAsSynced);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    break;
            }
            Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(appUserID);
            Map<String, SubscriberAttribute> mapB = S.B(allStoredSubscriberAttributes);
            for (Map.Entry<String, SubscriberAttribute> entry : attributesToMarkAsSynced.entrySet()) {
                String key = entry.getKey();
                SubscriberAttribute value = entry.getValue();
                SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
                if (subscriberAttribute != null) {
                    if (subscriberAttribute.isSynced()) {
                        subscriberAttribute = null;
                    }
                    if (subscriberAttribute != null) {
                        if (!AbstractC5504s.c(subscriberAttribute.getValue(), value.getValue())) {
                            subscriberAttribute = null;
                        }
                        if (subscriberAttribute != null) {
                            mapB.put(key, SubscriberAttribute.copy$default(value, null, null, null, null, true, 15, null));
                        }
                    }
                }
            }
            this.deviceCache.setAttributes(appUserID, mapB);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void setAppsFlyerConversionData(String appUserID, Map<?, ?> data) {
        AbstractC5504s.h(appUserID, "appUserID");
        if (data == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String stringValueForPrimitive = MapExtensionsKt.getStringValueForPrimitive(data, "media_source");
        if (stringValueForPrimitive != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE.getBackendKey(), stringValueForPrimitive);
        } else {
            String stringValueForPrimitive2 = MapExtensionsKt.getStringValueForPrimitive(data, "af_status");
            if (stringValueForPrimitive2 != null && r.B(stringValueForPrimitive2, "Organic", true)) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE.getBackendKey(), "Organic");
            }
        }
        String stringValueForPrimitive3 = MapExtensionsKt.getStringValueForPrimitive(data, "campaign");
        if (stringValueForPrimitive3 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE.getBackendKey(), stringValueForPrimitive3);
        }
        String stringValueForPrimitive4 = MapExtensionsKt.getStringValueForPrimitive(data, "adgroup");
        if (stringValueForPrimitive4 == null) {
            stringValueForPrimitive4 = MapExtensionsKt.getStringValueForPrimitive(data, "adset");
        }
        if (stringValueForPrimitive4 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE.getBackendKey(), stringValueForPrimitive4);
        }
        String stringValueForPrimitive5 = MapExtensionsKt.getStringValueForPrimitive(data, "af_ad");
        if (stringValueForPrimitive5 == null) {
            stringValueForPrimitive5 = MapExtensionsKt.getStringValueForPrimitive(data, "ad_id");
        }
        if (stringValueForPrimitive5 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE.getBackendKey(), stringValueForPrimitive5);
        }
        String stringValueForPrimitive6 = MapExtensionsKt.getStringValueForPrimitive(data, "af_keywords");
        if (stringValueForPrimitive6 == null) {
            stringValueForPrimitive6 = MapExtensionsKt.getStringValueForPrimitive(data, "keyword");
        }
        if (stringValueForPrimitive6 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE.getBackendKey(), stringValueForPrimitive6);
        }
        String stringValueForPrimitive7 = MapExtensionsKt.getStringValueForPrimitive(data, "creative");
        if (stringValueForPrimitive7 == null) {
            stringValueForPrimitive7 = MapExtensionsKt.getStringValueForPrimitive(data, "af_creative");
        }
        if (stringValueForPrimitive7 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Creative.INSTANCE.getBackendKey(), stringValueForPrimitive7);
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        setAttributes(linkedHashMap, appUserID);
    }

    public final void setAppstackAttributionParams(String appUserID, Map<String, String> data, Application applicationContext) {
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(data, "data");
        AbstractC5504s.h(applicationContext, "applicationContext");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = data.get("appstack_adnetwork");
        if (str != null) {
            if (r.l0(str)) {
                str = null;
            }
            if (str != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE.getBackendKey(), str);
                linkedHashMap.put("appstack_adnetwork", str);
            }
        }
        String str2 = data.get("appstack_campaign");
        if (str2 != null) {
            if (r.l0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE.getBackendKey(), str2);
                linkedHashMap.put("appstack_campaign", str2);
            }
        }
        String str3 = data.get("appstack_adset");
        if (str3 != null) {
            if (r.l0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE.getBackendKey(), str3);
                linkedHashMap.put("appstack_adset", str3);
            }
        }
        String str4 = data.get("appstack_ad");
        if (str4 != null) {
            if (r.l0(str4)) {
                str4 = null;
            }
            if (str4 != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE.getBackendKey(), str4);
                linkedHashMap.put("appstack_ad", str4);
            }
        }
        String str5 = data.get("appstack_keywords");
        if (str5 != null) {
            if (r.l0(str5)) {
                str5 = null;
            }
            if (str5 != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE.getBackendKey(), str5);
                linkedHashMap.put("appstack_keywords", str5);
            }
        }
        for (String str6 : AbstractC2279u.p("fbclid", "gclid", "wbraid", "gbraid", "ttclid")) {
            String str7 = data.get(str6);
            if (str7 != null) {
                if (r.l0(str7)) {
                    str7 = null;
                }
                if (str7 != null) {
                    linkedHashMap.put(str6, str7);
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            setAttributes(linkedHashMap, appUserID);
        }
        String str8 = data.get("appstack_id");
        if (str8 != null) {
            String str9 = r.l0(str8) ? null : str8;
            if (str9 != null) {
                setAttributionID(SubscriberAttributeKey.AttributionIds.Appstack.INSTANCE, str9, appUserID, applicationContext);
            }
        }
    }

    public final synchronized void setAttribute(SubscriberAttributeKey subscriberAttributeKey, String value, String appUserID) {
        AbstractC5504s.h(subscriberAttributeKey, "key");
        AbstractC5504s.h(appUserID, "appUserID");
        setAttributes(S.f(z.a(subscriberAttributeKey.getBackendKey(), value)), appUserID);
    }

    public final synchronized void setAttributes(Map<String, String> attributesToSet, String appUserID) {
        try {
            AbstractC5504s.h(attributesToSet, "attributesToSet");
            AbstractC5504s.h(appUserID, "appUserID");
            ArrayList arrayList = new ArrayList(attributesToSet.size());
            for (Map.Entry<String, String> entry : attributesToSet.entrySet()) {
                String key = entry.getKey();
                arrayList.add(z.a(key, new SubscriberAttribute(key, entry.getValue(), (DateProvider) null, (Date) null, false, 28, (DefaultConstructorMarker) null)));
            }
            storeAttributesIfNeeded(S.w(arrayList), appUserID);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void setAttributionID(SubscriberAttributeKey.AttributionIds attributionKey, String value, String appUserID, Application applicationContext) {
        AbstractC5504s.h(attributionKey, "attributionKey");
        AbstractC5504s.h(appUserID, "appUserID");
        AbstractC5504s.h(applicationContext, "applicationContext");
        SubscriberAttributesManager$setAttributionID$setAttributes$1 subscriberAttributesManager$setAttributionID$setAttributes$1 = new SubscriberAttributesManager$setAttributionID$setAttributes$1(attributionKey, value, this, appUserID);
        if (this.automaticDeviceIdentifierCollectionEnabled) {
            getDeviceIdentifiers(applicationContext, new C41501(subscriberAttributesManager$setAttributionID$setAttributes$1));
        } else {
            subscriberAttributesManager$setAttributionID$setAttributes$1.invoke((Object) S.i());
        }
    }

    public final void synchronizeSubscriberAttributesForAllUsers(String currentAppUserID, InterfaceC5082a completion) {
        AbstractC5504s.h(currentAppUserID, "currentAppUserID");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new C41511(completion, currentAppUserID));
    }
}
