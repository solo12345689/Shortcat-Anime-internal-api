.class public final Lcom/revenuecat/purchases/BillingFactory;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/BillingFactory$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JX\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/revenuecat/purchases/BillingFactory;",
        "",
        "()V",
        "createBilling",
        "Lcom/revenuecat/purchases/common/BillingAbstract;",
        "store",
        "Lcom/revenuecat/purchases/Store;",
        "application",
        "Landroid/app/Application;",
        "backendHelper",
        "Lcom/revenuecat/purchases/common/BackendHelper;",
        "cache",
        "Lcom/revenuecat/purchases/common/caching/DeviceCache;",
        "finishTransactions",
        "",
        "diagnosticsTrackerIfEnabled",
        "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;",
        "stateProvider",
        "Lcom/revenuecat/purchases/PurchasesStateProvider;",
        "pendingTransactionsForPrepaidPlansEnabled",
        "galaxyBillingMode",
        "Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;",
        "backend",
        "Lcom/revenuecat/purchases/common/Backend;",
        "purchases_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/revenuecat/purchases/BillingFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/BillingFactory;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/BillingFactory;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/BillingFactory;->INSTANCE:Lcom/revenuecat/purchases/BillingFactory;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final createBilling(Lcom/revenuecat/purchases/Store;Landroid/app/Application;Lcom/revenuecat/purchases/common/BackendHelper;Lcom/revenuecat/purchases/common/caching/DeviceCache;ZLcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/PurchasesStateProvider;ZLcom/revenuecat/purchases/galaxy/GalaxyBillingMode;Lcom/revenuecat/purchases/common/Backend;)Lcom/revenuecat/purchases/common/BillingAbstract;
    .locals 12

    .line 1
    move-object/from16 v1, p4

    .line 2
    .line 3
    move-object/from16 v5, p7

    .line 4
    .line 5
    move-object/from16 v0, p9

    .line 6
    .line 7
    const-string v2, "store"

    .line 8
    .line 9
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "application"

    .line 13
    .line 14
    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v2, "backendHelper"

    .line 18
    .line 19
    invoke-static {p3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v2, "cache"

    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v2, "stateProvider"

    .line 28
    .line 29
    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v2, "galaxyBillingMode"

    .line 33
    .line 34
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v2, "backend"

    .line 38
    .line 39
    move-object/from16 v4, p10

    .line 40
    .line 41
    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sget-object v2, Lcom/revenuecat/purchases/BillingFactory$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    aget v2, v2, v3

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    if-eq v2, v3, :cond_3

    .line 54
    .line 55
    const/4 v3, 0x2

    .line 56
    if-eq v2, v3, :cond_2

    .line 57
    .line 58
    const/4 v3, 0x3

    .line 59
    const-string v4, "application.applicationContext"

    .line 60
    .line 61
    const-string v8, "[Purchases] - ERROR"

    .line 62
    .line 63
    if-eq v2, v3, :cond_1

    .line 64
    .line 65
    const/4 p3, 0x4

    .line 66
    if-ne v2, p3, :cond_0

    .line 67
    .line 68
    :try_start_0
    sget-object p1, Lcom/revenuecat/purchases/galaxy/GalaxyBillingWrapperFactory;->INSTANCE:Lcom/revenuecat/purchases/galaxy/GalaxyBillingWrapperFactory;

    .line 69
    .line 70
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-static {p2, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v5, p2, v0, v1}, Lcom/revenuecat/purchases/galaxy/GalaxyBillingWrapperFactory;->createGalaxyBillingWrapper(Lcom/revenuecat/purchases/PurchasesStateProvider;Landroid/content/Context;Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;Lcom/revenuecat/purchases/common/caching/DeviceCache;)Lcom/revenuecat/purchases/common/BillingAbstract;

    .line 78
    .line 79
    .line 80
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    return-object p1

    .line 82
    :catch_0
    move-exception v0

    .line 83
    move-object p1, v0

    .line 84
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    const-string p3, "Make sure purchases-galaxy is added as dependency"

    .line 89
    .line 90
    invoke-interface {p2, v8, p3, p1}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_0
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    new-instance p3, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v0, "Incompatible store ("

    .line 104
    .line 105
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, ") used"

    .line 112
    .line 113
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    const/4 v1, 0x0

    .line 121
    invoke-interface {p2, v8, p3, v1}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 125
    .line 126
    new-instance p3, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v1, "Couldn\'t configure SDK. Incompatible store ("

    .line 132
    .line 133
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p2

    .line 150
    :cond_1
    :try_start_1
    new-instance v0, Lcom/revenuecat/purchases/amazon/AmazonBilling;

    .line 151
    .line 152
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    new-instance v4, Landroid/os/Handler;

    .line 160
    .line 161
    invoke-virtual {p2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-direct {v4, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 166
    .line 167
    .line 168
    move-object/from16 v2, p4

    .line 169
    .line 170
    move/from16 v3, p5

    .line 171
    .line 172
    move-object/from16 v7, p6

    .line 173
    .line 174
    move-object v6, v5

    .line 175
    move-object v5, p3

    .line 176
    invoke-direct/range {v0 .. v7}, Lcom/revenuecat/purchases/amazon/AmazonBilling;-><init>(Landroid/content/Context;Lcom/revenuecat/purchases/common/caching/DeviceCache;ZLandroid/os/Handler;Lcom/revenuecat/purchases/common/BackendHelper;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;)V
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_1

    .line 177
    .line 178
    .line 179
    return-object v0

    .line 180
    :catch_1
    move-exception v0

    .line 181
    move-object p1, v0

    .line 182
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    const-string p3, "Make sure purchases-amazon is added as dependency"

    .line 187
    .line 188
    invoke-interface {p2, v8, p3, p1}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    throw p1

    .line 192
    :cond_2
    new-instance v0, Lcom/revenuecat/purchases/google/BillingWrapper;

    .line 193
    .line 194
    new-instance v1, Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;

    .line 195
    .line 196
    move/from16 p1, p8

    .line 197
    .line 198
    invoke-direct {v1, p2, p1}, Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;-><init>(Landroid/content/Context;Z)V

    .line 199
    .line 200
    .line 201
    new-instance v2, Landroid/os/Handler;

    .line 202
    .line 203
    invoke-virtual {p2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-direct {v2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 208
    .line 209
    .line 210
    new-instance v6, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;

    .line 211
    .line 212
    invoke-direct {v6, p2}, Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;-><init>(Landroid/content/Context;)V

    .line 213
    .line 214
    .line 215
    const/16 v10, 0x1c0

    .line 216
    .line 217
    const/4 v11, 0x0

    .line 218
    const/4 v7, 0x0

    .line 219
    const/4 v8, 0x0

    .line 220
    const/4 v9, 0x0

    .line 221
    move-object/from16 v3, p4

    .line 222
    .line 223
    move-object/from16 v4, p6

    .line 224
    .line 225
    move-object/from16 v5, p7

    .line 226
    .line 227
    invoke-direct/range {v0 .. v11}, Lcom/revenuecat/purchases/google/BillingWrapper;-><init>(Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;Landroid/os/Handler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;Lcom/revenuecat/purchases/common/DateProvider;LGf/O;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 228
    .line 229
    .line 230
    return-object v0

    .line 231
    :cond_3
    new-instance v0, Lcom/revenuecat/purchases/simulatedstore/SimulatedStoreBillingWrapper;

    .line 232
    .line 233
    new-instance v2, Landroid/os/Handler;

    .line 234
    .line 235
    invoke-virtual {p2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-direct {v2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 240
    .line 241
    .line 242
    const/16 v6, 0x10

    .line 243
    .line 244
    const/4 v7, 0x0

    .line 245
    const/4 v5, 0x0

    .line 246
    move-object/from16 v1, p4

    .line 247
    .line 248
    move-object/from16 v3, p7

    .line 249
    .line 250
    invoke-direct/range {v0 .. v7}, Lcom/revenuecat/purchases/simulatedstore/SimulatedStoreBillingWrapper;-><init>(Lcom/revenuecat/purchases/common/caching/DeviceCache;Landroid/os/Handler;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/utils/AlertDialogHelper;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 251
    .line 252
    .line 253
    return-object v0
.end method
