.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J*\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;",
        "",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;",
        "purchases",
        "<init>",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;)V",
        "Lcom/revenuecat/purchases/SubscriptionInfo;",
        "activePlayStoreSubscription",
        "Lcom/revenuecat/purchases/Package;",
        "packageToPurchase",
        "Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;",
        "productChangeConfig",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeInfo;",
        "calculateProductChange",
        "(Lcom/revenuecat/purchases/SubscriptionInfo;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;LZd/e;)Ljava/lang/Object;",
        "calculateProductChangeInfo",
        "(Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;LZd/e;)Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;",
        "Companion",
        "revenuecatui_defaultsBc8Release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$Companion;

.field private static final MONTHS_IN_HALF_YEAR:I = 0x6

.field private static final MONTHS_IN_QUARTER:I = 0x3

.field private static final MONTHS_IN_YEAR:I = 0xc

.field private static final SANDBOX_HALF_YEAR_MINUTES:J = 0xfL

.field private static final SANDBOX_MONTHLY_MINUTES:J = 0x5L

.field private static final SANDBOX_QUARTER_MINUTES:J = 0xaL

.field private static final SANDBOX_YEARLY_MINUTES:J = 0x1eL


# instance fields
.field private final purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;->$stable:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;)V
    .locals 1

    .line 1
    const-string v0, "purchases"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic access$calculateProductChange(Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;Lcom/revenuecat/purchases/SubscriptionInfo;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;->calculateProductChange(Lcom/revenuecat/purchases/SubscriptionInfo;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final calculateProductChange(Lcom/revenuecat/purchases/SubscriptionInfo;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;LZd/e;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/SubscriptionInfo;",
            "Lcom/revenuecat/purchases/Package;",
            "Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->L$4:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/lang/String;

    .line 42
    .line 43
    iget-object p2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->L$3:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/String;

    .line 46
    .line 47
    iget-object p3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->L$2:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p3, Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;

    .line 50
    .line 51
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lcom/revenuecat/purchases/Package;

    .line 54
    .line 55
    iget-object v0, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lcom/revenuecat/purchases/SubscriptionInfo;

    .line 58
    .line 59
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object v5, p1

    .line 63
    move-object p1, v0

    .line 64
    move-object v0, p4

    .line 65
    move-object p4, p2

    .line 66
    move-object p2, v1

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :cond_2
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/revenuecat/purchases/SubscriptionInfo;->getProductIdentifier()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p4

    .line 83
    invoke-virtual {p1}, Lcom/revenuecat/purchases/SubscriptionInfo;->getProductPlanIdentifier()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$Companion;

    .line 88
    .line 89
    invoke-virtual {p2}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-virtual {v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$Companion;->subscriptionIdentifiers$revenuecatui_defaultsBc8Release(Lcom/revenuecat/purchases/models/StoreProduct;)Lkotlin/Pair;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-virtual {v5}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    check-cast v5, Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {p4, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-eqz v6, :cond_3

    .line 108
    .line 109
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 110
    .line 111
    new-instance p2, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string p3, "Same product ("

    .line 117
    .line 118
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string p3, "), Google handles base plan change automatically"

    .line 125
    .line 126
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-object v3

    .line 137
    :cond_3
    iget-object v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 138
    .line 139
    iput-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->L$0:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object p2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->L$1:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object p3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->L$2:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object p4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->L$3:Ljava/lang/Object;

    .line 146
    .line 147
    iput-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->L$4:Ljava/lang/Object;

    .line 148
    .line 149
    iput v4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChange$1;->label:I

    .line 150
    .line 151
    invoke-interface {v6, p4, v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->awaitGetProduct(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-ne v0, v1, :cond_4

    .line 156
    .line 157
    return-object v1

    .line 158
    :cond_4
    :goto_1
    check-cast v0, Lcom/revenuecat/purchases/models/StoreProduct;

    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/revenuecat/purchases/SubscriptionInfo;->isSandbox()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-eqz v0, :cond_5

    .line 165
    .line 166
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$Companion;

    .line 167
    .line 168
    invoke-virtual {v1, v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$Companion;->getNormalizedPrice$revenuecatui_defaultsBc8Release(Lcom/revenuecat/purchases/models/StoreProduct;Z)Ljava/lang/Long;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    :cond_5
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$Companion;

    .line 173
    .line 174
    invoke-virtual {p2}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    invoke-virtual {v0, p2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$Companion;->getNormalizedPrice$revenuecatui_defaultsBc8Release(Lcom/revenuecat/purchases/models/StoreProduct;Z)Ljava/lang/Long;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    const/16 v0, 0x29

    .line 183
    .line 184
    const-string v1, ", sandbox: "

    .line 185
    .line 186
    const-string v2, ", new: "

    .line 187
    .line 188
    const-string v4, " (old: "

    .line 189
    .line 190
    const-string v6, " -> "

    .line 191
    .line 192
    if-eqz v3, :cond_6

    .line 193
    .line 194
    if-eqz p2, :cond_6

    .line 195
    .line 196
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 197
    .line 198
    .line 199
    move-result-wide v7

    .line 200
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 201
    .line 202
    .line 203
    move-result-wide v9

    .line 204
    cmp-long v7, v7, v9

    .line 205
    .line 206
    if-lez v7, :cond_6

    .line 207
    .line 208
    sget-object v7, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 209
    .line 210
    new-instance v8, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const-string v9, "Detected upgrade: "

    .line 216
    .line 217
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v8, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {v7, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p3}, Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;->getUpgradeReplacementMode()Lcom/revenuecat/purchases/models/GoogleReplacementMode;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    goto :goto_2

    .line 262
    :cond_6
    sget-object v7, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 263
    .line 264
    new-instance v8, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    const-string v9, "Detected downgrade: "

    .line 270
    .line 271
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v8, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-virtual {v7, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p3}, Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;->getDowngradeReplacementMode()Lcom/revenuecat/purchases/models/GoogleReplacementMode;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    :goto_2
    new-instance p2, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeInfo;

    .line 316
    .line 317
    invoke-direct {p2, p4, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeInfo;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;)V

    .line 318
    .line 319
    .line 320
    return-object p2
.end method


# virtual methods
.method public final calculateProductChangeInfo(Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;LZd/e;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/Package;",
            "Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    :try_start_0
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :catch_0
    move-exception p1

    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    iget-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->L$2:Ljava/lang/Object;

    .line 59
    .line 60
    move-object p2, p1

    .line 61
    check-cast p2, Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;

    .line 62
    .line 63
    iget-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Lcom/revenuecat/purchases/Package;

    .line 66
    .line 67
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;

    .line 70
    .line 71
    :try_start_1
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_1 .. :try_end_1} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    invoke-interface {p3}, Lcom/revenuecat/purchases/models/StoreProduct;->getType()Lcom/revenuecat/purchases/ProductType;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    sget-object v2, Lcom/revenuecat/purchases/ProductType;->SUBS:Lcom/revenuecat/purchases/ProductType;

    .line 87
    .line 88
    if-eq p3, v2, :cond_4

    .line 89
    .line 90
    return-object v5

    .line 91
    :cond_4
    :try_start_2
    iget-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 92
    .line 93
    iput-object p0, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->L$0:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->L$1:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object p2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->L$2:Ljava/lang/Object;

    .line 98
    .line 99
    iput v4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->label:I

    .line 100
    .line 101
    invoke-static {p3, v5, v0, v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType$DefaultImpls;->awaitCustomerInfo$default(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;Lcom/revenuecat/purchases/CacheFetchPolicy;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    if-ne p3, v1, :cond_5

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_5
    move-object v2, p0

    .line 109
    :goto_1
    check-cast p3, Lcom/revenuecat/purchases/CustomerInfo;

    .line 110
    .line 111
    invoke-virtual {p3}, Lcom/revenuecat/purchases/CustomerInfo;->getSubscriptionsByProductIdentifier()Ljava/util/Map;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    check-cast p3, Ljava/lang/Iterable;

    .line 120
    .line 121
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    :cond_6
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-eqz v4, :cond_7

    .line 130
    .line 131
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    move-object v6, v4

    .line 136
    check-cast v6, Lcom/revenuecat/purchases/SubscriptionInfo;

    .line 137
    .line 138
    invoke-virtual {v6}, Lcom/revenuecat/purchases/SubscriptionInfo;->isActive()Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-eqz v7, :cond_6

    .line 143
    .line 144
    invoke-virtual {v6}, Lcom/revenuecat/purchases/SubscriptionInfo;->getStore()Lcom/revenuecat/purchases/Store;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    sget-object v7, Lcom/revenuecat/purchases/Store;->PLAY_STORE:Lcom/revenuecat/purchases/Store;

    .line 149
    .line 150
    if-ne v6, v7, :cond_6

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_7
    move-object v4, v5

    .line 154
    :goto_2
    check-cast v4, Lcom/revenuecat/purchases/SubscriptionInfo;

    .line 155
    .line 156
    if-eqz v4, :cond_9

    .line 157
    .line 158
    iput-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->L$0:Ljava/lang/Object;

    .line 159
    .line 160
    iput-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->L$1:Ljava/lang/Object;

    .line 161
    .line 162
    iput-object v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->L$2:Ljava/lang/Object;

    .line 163
    .line 164
    iput v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$calculateProductChangeInfo$1;->label:I

    .line 165
    .line 166
    invoke-direct {v2, v4, p1, p2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;->calculateProductChange(Lcom/revenuecat/purchases/SubscriptionInfo;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;LZd/e;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    if-ne p3, v1, :cond_8

    .line 171
    .line 172
    :goto_3
    return-object v1

    .line 173
    :cond_8
    :goto_4
    check-cast p3, Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeInfo;
    :try_end_2
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_2 .. :try_end_2} :catch_0

    .line 174
    .line 175
    return-object p3

    .line 176
    :cond_9
    return-object v5

    .line 177
    :goto_5
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 178
    .line 179
    new-instance p3, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    const-string v0, "Error determining product change info: "

    .line 185
    .line 186
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1}, Lcom/revenuecat/purchases/PurchasesException;->getMessage()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-object v5
.end method
