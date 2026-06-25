package com.revenuecat.purchases.blockstore;

import Df.C1271d;
import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.O;
import Gf.P;
import Gf.X0;
import L8.c;
import L8.d;
import L8.e;
import L8.f;
import Td.L;
import Td.u;
import Td.v;
import Ud.AbstractC2279u;
import Ud.S;
import Zd.e;
import Zd.k;
import ae.AbstractC2605b;
import android.content.Context;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.identity.IdentityManager;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n9.InterfaceC5761e;
import n9.InterfaceC5762f;
import n9.i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0013\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;", "", "Landroid/content/Context;", "applicationContext", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "LL8/b;", "blockstoreClient", "LGf/O;", "ioScope", "mainScope", "<init>", "(Landroid/content/Context;Lcom/revenuecat/purchases/identity/IdentityManager;LL8/b;LGf/O;LGf/O;)V", "", "", "LL8/e$a;", "getBlockstoreData", "(LZd/e;)Ljava/lang/Object;", "blockstoreDataMap", "userId", "LTd/L;", "storeUserIdIfNeeded", "(Ljava/util/Map;Ljava/lang/String;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "Lkotlin/Function0;", "callback", "aliasCurrentAndStoredUserIdsIfNeeded", "(Lie/a;)V", "clearUserIdBackupIfNeeded", "Lcom/revenuecat/purchases/identity/IdentityManager;", "LL8/b;", "LGf/O;", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BlockstoreHelper {

    @Deprecated
    public static final int BLOCKSTORE_MAX_ENTRIES = 16;

    @Deprecated
    public static final String BLOCKSTORE_USER_ID_KEY = "com.revenuecat.purchases.app_user_id";
    private static final Companion Companion = new Companion(null);
    private final L8.b blockstoreClient;
    private final IdentityManager identityManager;
    private final O ioScope;
    private final O mainScope;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "LL8/b;", "initializeBlockstoreClient", "(Landroid/content/Context;)LL8/b;", "", "BLOCKSTORE_MAX_ENTRIES", "I", "", "BLOCKSTORE_USER_ID_KEY", "Ljava/lang/String;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final L8.b initializeBlockstoreClient(Context applicationContext) {
            AbstractC5504s.h(applicationContext, "applicationContext");
            try {
                return L8.a.a(applicationContext);
            } catch (NoClassDefFoundError e10) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Cannot find Blockstore at runtime. Disabling automatic backups.", e10);
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.blockstore.BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$1", f = "BlockstoreHelper.kt", l = {87, com.amazon.device.iap.internal.a.f34980a}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ InterfaceC5082a $callback;
        final /* synthetic */ String $currentUserId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, InterfaceC5082a interfaceC5082a, e eVar) {
            super(2, eVar);
            this.$currentUserId = str;
            this.$callback = interfaceC5082a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BlockstoreHelper.this.new AnonymousClass1(this.$currentUserId, this.$callback, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((AnonymousClass1) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
        
            if (r8.aliasCurrentUserIdTo(r1, r7) == r0) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 285
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.blockstore.BlockstoreHelper.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.blockstore.BlockstoreHelper$clearUserIdBackupIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$clearUserIdBackupIfNeeded$1", f = "BlockstoreHelper.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class C40771 extends l implements Function2 {
        final /* synthetic */ L8.b $blockstoreClient;
        final /* synthetic */ InterfaceC5082a $callback;
        final /* synthetic */ c $request;
        int label;

        /* JADX INFO: renamed from: com.revenuecat.purchases.blockstore.BlockstoreHelper$clearUserIdBackupIfNeeded$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "LTd/L;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06691 extends AbstractC5506u implements Function1 {
            final /* synthetic */ InterfaceC5082a $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06691(InterfaceC5082a interfaceC5082a) {
                super(1);
                this.$callback = interfaceC5082a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return L.f17438a;
            }

            public final void invoke(Boolean bool) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Block store cached UserID cleared if any");
                }
                this.$callback.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40771(L8.b bVar, c cVar, InterfaceC5082a interfaceC5082a, e eVar) {
            super(2, eVar);
            this.$blockstoreClient = bVar;
            this.$request = cVar;
            this.$callback = interfaceC5082a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(InterfaceC5082a interfaceC5082a, Exception exc) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Tried to clear Block store cached UserID but failed: " + exc.getMessage(), exc);
            interfaceC5082a.invoke();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C40771(this.$blockstoreClient, this.$request, this.$callback, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((C40771) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            i iVarB = this.$blockstoreClient.b(this.$request);
            final C06691 c06691 = new C06691(this.$callback);
            i iVarG = iVarB.g(new InterfaceC5762f() { // from class: com.revenuecat.purchases.blockstore.a
                @Override // n9.InterfaceC5762f
                public final void onSuccess(Object obj2) {
                    c06691.invoke(obj2);
                }
            });
            final InterfaceC5082a interfaceC5082a = this.$callback;
            iVarG.e(new InterfaceC5761e() { // from class: com.revenuecat.purchases.blockstore.b
                @Override // n9.InterfaceC5761e
                public final void onFailure(Exception exc) {
                    BlockstoreHelper.C40771.invokeSuspend$lambda$2(interfaceC5082a, exc);
                }
            });
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.blockstore.BlockstoreHelper$storeUserIdIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$storeUserIdIfNeeded$1", f = "BlockstoreHelper.kt", l = {61, 67}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class C40781 extends l implements Function2 {
        final /* synthetic */ String $currentUserId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40781(String str, e eVar) {
            super(2, eVar);
            this.$currentUserId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BlockstoreHelper.this.new C40781(this.$currentUserId, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((C40781) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
        
            if (r1.storeUserIdIfNeeded(r6, r4, r5) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r5.label
                java.lang.String r2 = "[Purchases] - ERROR"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                Td.v.b(r6)     // Catch: java.lang.Exception -> L14
                goto L5d
            L14:
                r6 = move-exception
                goto L41
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                Td.v.b(r6)     // Catch: java.lang.Exception -> L22
                goto L32
            L22:
                r6 = move-exception
                goto L60
            L24:
                Td.v.b(r6)
                com.revenuecat.purchases.blockstore.BlockstoreHelper r6 = com.revenuecat.purchases.blockstore.BlockstoreHelper.this     // Catch: java.lang.Exception -> L22
                r5.label = r4     // Catch: java.lang.Exception -> L22
                java.lang.Object r6 = com.revenuecat.purchases.blockstore.BlockstoreHelper.access$getBlockstoreData(r6, r5)     // Catch: java.lang.Exception -> L22
                if (r6 != r0) goto L32
                goto L40
            L32:
                java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L22
                com.revenuecat.purchases.blockstore.BlockstoreHelper r1 = com.revenuecat.purchases.blockstore.BlockstoreHelper.this     // Catch: java.lang.Exception -> L14
                java.lang.String r4 = r5.$currentUserId     // Catch: java.lang.Exception -> L14
                r5.label = r3     // Catch: java.lang.Exception -> L14
                java.lang.Object r6 = com.revenuecat.purchases.blockstore.BlockstoreHelper.access$storeUserIdIfNeeded(r1, r6, r4, r5)     // Catch: java.lang.Exception -> L14
                if (r6 != r0) goto L5d
            L40:
                return r0
            L41:
                com.revenuecat.purchases.LogHandler r0 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Failed to store user Id in Block store: "
                r1.append(r3)
                java.lang.String r3 = r6.getMessage()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.e(r2, r1, r6)
            L5d:
                Td.L r6 = Td.L.f17438a
                return r6
            L60:
                com.revenuecat.purchases.LogHandler r0 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Failed to retrieve Block store data. Will not store userId. Error: "
                r1.append(r3)
                java.lang.String r3 = r6.getMessage()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.e(r2, r1, r6)
                Td.L r6 = Td.L.f17438a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.blockstore.BlockstoreHelper.C40781.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public BlockstoreHelper(Context applicationContext, IdentityManager identityManager, L8.b bVar, O ioScope, O mainScope) {
        AbstractC5504s.h(applicationContext, "applicationContext");
        AbstractC5504s.h(identityManager, "identityManager");
        AbstractC5504s.h(ioScope, "ioScope");
        AbstractC5504s.h(mainScope, "mainScope");
        this.identityManager = identityManager;
        this.blockstoreClient = bVar;
        this.ioScope = ioScope;
        this.mainScope = mainScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(BlockstoreHelper blockstoreHelper, InterfaceC5082a interfaceC5082a) {
        AbstractC1617k.d(blockstoreHelper.mainScope, null, null, new BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1(interfaceC5082a, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getBlockstoreData(e eVar) throws Throwable {
        L8.b bVar = this.blockstoreClient;
        if (bVar == null) {
            return S.i();
        }
        d dVarA = new d.a().b(true).a();
        AbstractC5504s.g(dVarA, "Builder()\n            .s…rue)\n            .build()");
        final k kVar = new k(AbstractC2605b.c(eVar));
        bVar.e(dVarA).g(new BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0(new BlockstoreHelper$getBlockstoreData$2$1(kVar))).e(new InterfaceC5761e() { // from class: com.revenuecat.purchases.blockstore.BlockstoreHelper$getBlockstoreData$2$2
            @Override // n9.InterfaceC5761e
            public final void onFailure(Exception it) {
                AbstractC5504s.h(it, "it");
                e eVar2 = kVar;
                u.a aVar = u.f17466b;
                eVar2.resumeWith(u.b(v.a(it)));
            }
        });
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            h.c(eVar);
        }
        return objA;
    }

    public final void aliasCurrentAndStoredUserIdsIfNeeded(InterfaceC5082a callback) {
        AbstractC5504s.h(callback, "callback");
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        if (IdentityManager.INSTANCE.isUserIDAnonymous(currentAppUserID)) {
            AbstractC1617k.d(this.ioScope, null, null, new AnonymousClass1(currentAppUserID, callback, null), 3, null);
        } else {
            aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(this, callback);
        }
    }

    public final void clearUserIdBackupIfNeeded(InterfaceC5082a callback) {
        AbstractC5504s.h(callback, "callback");
        L8.b bVar = this.blockstoreClient;
        if (bVar == null) {
            callback.invoke();
            return;
        }
        c cVarA = new c.a().b(AbstractC2279u.e(BLOCKSTORE_USER_ID_KEY)).a();
        AbstractC5504s.g(cVarA, "Builder()\n            .s…EY))\n            .build()");
        AbstractC1617k.d(this.ioScope, null, null, new C40771(bVar, cVarA, callback, null), 3, null);
    }

    public final void storeUserIdIfNeeded(CustomerInfo customerInfo) {
        AbstractC5504s.h(customerInfo, "customerInfo");
        if (this.blockstoreClient == null) {
            return;
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        if (!IdentityManager.INSTANCE.isUserIDAnonymous(currentAppUserID) || customerInfo.getAllPurchasedProductIds().isEmpty()) {
            return;
        }
        AbstractC1617k.d(this.ioScope, null, null, new C40781(currentAppUserID, null), 3, null);
    }

    public /* synthetic */ BlockstoreHelper(Context context, IdentityManager identityManager, L8.b bVar, O o10, O o11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, identityManager, (i10 & 4) != 0 ? Companion.initializeBlockstoreClient(context) : bVar, (i10 & 8) != 0 ? P.a(X0.b(null, 1, null).w(C1608f0.b().Y1(1))) : o10, (i10 & 16) != 0 ? P.a(X0.b(null, 1, null).w(C1608f0.c())) : o11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object storeUserIdIfNeeded(Map<String, ? extends e.a> map, String str, Zd.e eVar) throws Throwable {
        L8.b bVar = this.blockstoreClient;
        if (bVar == null) {
            return L.f17438a;
        }
        if (map.get(BLOCKSTORE_USER_ID_KEY) != null) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Block store: Not storing user id since there is one already present.");
            }
            return L.f17438a;
        }
        if (map.size() >= 16) {
            LogLevel logLevel2 = LogLevel.DEBUG;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Block store: Not storing user id since block store is already full.");
            }
            return L.f17438a;
        }
        LogLevel logLevel3 = LogLevel.DEBUG;
        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
            currentLogHandler3.d("[Purchases] - " + logLevel3.name(), "Block store: Storing UserID: " + str + " in Block store.");
        }
        f.a aVar = new f.a();
        byte[] bytes = str.getBytes(C1271d.f3718b);
        AbstractC5504s.g(bytes, "getBytes(...)");
        L8.f fVarA = aVar.b(bytes).c(BLOCKSTORE_USER_ID_KEY).d(true).a();
        AbstractC5504s.g(fVarA, "Builder()\n            .s…rue)\n            .build()");
        final k kVar = new k(AbstractC2605b.c(eVar));
        bVar.a(fVarA).g(new BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0(new BlockstoreHelper$storeUserIdIfNeeded$6$1(kVar, str))).e(new InterfaceC5761e() { // from class: com.revenuecat.purchases.blockstore.BlockstoreHelper$storeUserIdIfNeeded$6$2
            @Override // n9.InterfaceC5761e
            public final void onFailure(Exception it) {
                AbstractC5504s.h(it, "it");
                Zd.e eVar2 = kVar;
                u.a aVar2 = u.f17466b;
                eVar2.resumeWith(u.b(v.a(it)));
            }
        });
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            h.c(eVar);
        }
        return objA == AbstractC2605b.f() ? objA : L.f17438a;
    }
}
