.class public final Lcom/revenuecat/purchases/common/ReceiptInfo$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LVf/E;


# annotations
.annotation runtime LTd/e;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/common/ReceiptInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LVf/E;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "com/revenuecat/purchases/common/ReceiptInfo.$serializer",
        "LVf/E;",
        "Lcom/revenuecat/purchases/common/ReceiptInfo;",
        "<init>",
        "()V",
        "",
        "LRf/b;",
        "childSerializers",
        "()[LRf/b;",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/common/ReceiptInfo;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/common/ReceiptInfo;)V",
        "LTf/e;",
        "getDescriptor",
        "()LTf/e;",
        "descriptor",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/common/ReceiptInfo$$serializer;

.field private static final synthetic descriptor:LVf/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/common/ReceiptInfo$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/common/ReceiptInfo$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/common/ReceiptInfo$$serializer;->INSTANCE:Lcom/revenuecat/purchases/common/ReceiptInfo$$serializer;

    .line 7
    .line 8
    new-instance v1, LVf/k0;

    .line 9
    .line 10
    const-string v2, "com.revenuecat.purchases.common.ReceiptInfo"

    .line 11
    .line 12
    const/16 v3, 0xe

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LVf/k0;-><init>(Ljava/lang/String;LVf/E;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "productIDs"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "purchaseTime"

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    const-string v0, "presentedOfferingContext"

    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "price"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "formattedPrice"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "currency"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "period"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "pricingPhases"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "replacementMode"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "platformProductIds"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "sdkOriginated"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "storeUserID"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "marketplace"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    const-string v0, "duration"

    .line 85
    .line 86
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    sput-object v1, Lcom/revenuecat/purchases/common/ReceiptInfo$$serializer;->descriptor:LVf/k0;

    .line 90
    .line 91
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
.method public childSerializers()[LRf/b;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LRf/b;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/revenuecat/purchases/common/ReceiptInfo;->access$get$childSerializers$cp()[LRf/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    aget-object v2, v0, v1

    .line 7
    .line 8
    sget-object v3, LVf/Q;->a:LVf/Q;

    .line 9
    .line 10
    invoke-static {v3}, LSf/a;->p(LRf/b;)LRf/b;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v4, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->INSTANCE:Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;

    .line 15
    .line 16
    invoke-static {v4}, LSf/a;->p(LRf/b;)LRf/b;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    sget-object v5, LVf/t;->a:LVf/t;

    .line 21
    .line 22
    invoke-static {v5}, LSf/a;->p(LRf/b;)LRf/b;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    sget-object v6, LVf/x0;->a:LVf/x0;

    .line 27
    .line 28
    invoke-static {v6}, LSf/a;->p(LRf/b;)LRf/b;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-static {v6}, LSf/a;->p(LRf/b;)LRf/b;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    sget-object v9, Lcom/revenuecat/purchases/models/PeriodSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/PeriodSerializer;

    .line 37
    .line 38
    invoke-static {v9}, LSf/a;->p(LRf/b;)LRf/b;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    const/4 v10, 0x7

    .line 43
    aget-object v11, v0, v10

    .line 44
    .line 45
    invoke-static {v11}, LSf/a;->p(LRf/b;)LRf/b;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    sget-object v12, Lcom/revenuecat/purchases/ReplacementModeSerializer;->INSTANCE:Lcom/revenuecat/purchases/ReplacementModeSerializer;

    .line 50
    .line 51
    invoke-static {v12}, LSf/a;->p(LRf/b;)LRf/b;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    const/16 v13, 0x9

    .line 56
    .line 57
    aget-object v0, v0, v13

    .line 58
    .line 59
    invoke-static {v6}, LSf/a;->p(LRf/b;)LRf/b;

    .line 60
    .line 61
    .line 62
    move-result-object v14

    .line 63
    invoke-static {v6}, LSf/a;->p(LRf/b;)LRf/b;

    .line 64
    .line 65
    .line 66
    move-result-object v15

    .line 67
    invoke-static {v6}, LSf/a;->p(LRf/b;)LRf/b;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    move/from16 v16, v1

    .line 72
    .line 73
    const/16 v1, 0xe

    .line 74
    .line 75
    new-array v1, v1, [LRf/b;

    .line 76
    .line 77
    aput-object v2, v1, v16

    .line 78
    .line 79
    const/4 v2, 0x1

    .line 80
    aput-object v3, v1, v2

    .line 81
    .line 82
    const/4 v2, 0x2

    .line 83
    aput-object v4, v1, v2

    .line 84
    .line 85
    const/4 v2, 0x3

    .line 86
    aput-object v5, v1, v2

    .line 87
    .line 88
    const/4 v2, 0x4

    .line 89
    aput-object v7, v1, v2

    .line 90
    .line 91
    const/4 v2, 0x5

    .line 92
    aput-object v8, v1, v2

    .line 93
    .line 94
    const/4 v2, 0x6

    .line 95
    aput-object v9, v1, v2

    .line 96
    .line 97
    aput-object v11, v1, v10

    .line 98
    .line 99
    const/16 v2, 0x8

    .line 100
    .line 101
    aput-object v12, v1, v2

    .line 102
    .line 103
    aput-object v0, v1, v13

    .line 104
    .line 105
    sget-object v0, LVf/h;->a:LVf/h;

    .line 106
    .line 107
    const/16 v2, 0xa

    .line 108
    .line 109
    aput-object v0, v1, v2

    .line 110
    .line 111
    const/16 v0, 0xb

    .line 112
    .line 113
    aput-object v14, v1, v0

    .line 114
    .line 115
    const/16 v0, 0xc

    .line 116
    .line 117
    aput-object v15, v1, v0

    .line 118
    .line 119
    const/16 v0, 0xd

    .line 120
    .line 121
    aput-object v6, v1, v0

    .line 122
    .line 123
    return-object v1
.end method

.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/common/ReceiptInfo;
    .locals 44

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/common/ReceiptInfo$$serializer;->getDescriptor()LTf/e;

    move-result-object v1

    invoke-interface {v0, v1}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v0

    invoke-static {}, Lcom/revenuecat/purchases/common/ReceiptInfo;->access$get$childSerializers$cp()[LRf/b;

    move-result-object v2

    invoke-interface {v0}, LUf/c;->p()Z

    move-result v3

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/16 v11, 0x8

    const/4 v12, 0x4

    const/4 v13, 0x2

    const/16 v14, 0x9

    const/4 v15, 0x7

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    aget-object v3, v2, v5

    invoke-interface {v0, v1, v5, v3, v6}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    sget-object v5, LVf/Q;->a:LVf/Q;

    invoke-interface {v0, v1, v4, v5, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    sget-object v5, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->INSTANCE:Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;

    invoke-interface {v0, v1, v13, v5, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/revenuecat/purchases/PresentedOfferingContext;

    sget-object v13, LVf/t;->a:LVf/t;

    invoke-interface {v0, v1, v10, v13, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Double;

    sget-object v13, LVf/x0;->a:LVf/x0;

    invoke-interface {v0, v1, v12, v13, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v0, v1, v9, v13, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    sget-object v7, Lcom/revenuecat/purchases/models/PeriodSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/PeriodSerializer;

    invoke-interface {v0, v1, v8, v7, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/revenuecat/purchases/models/Period;

    aget-object v8, v2, v15

    invoke-interface {v0, v1, v15, v8, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    sget-object v15, Lcom/revenuecat/purchases/ReplacementModeSerializer;->INSTANCE:Lcom/revenuecat/purchases/ReplacementModeSerializer;

    invoke-interface {v0, v1, v11, v15, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/revenuecat/purchases/ReplacementMode;

    aget-object v2, v2, v14

    invoke-interface {v0, v1, v14, v2, v6}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v14, 0xa

    invoke-interface {v0, v1, v14}, LUf/c;->w(LTf/e;I)Z

    move-result v14

    const/16 v15, 0xb

    invoke-interface {v0, v1, v15, v13, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move-object/from16 v17, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v13, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v16, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v13, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/16 v6, 0x3fff

    move-object/from16 v42, v2

    move-object/from16 v29, v3

    move-object/from16 v30, v4

    move-object/from16 v35, v7

    move-object/from16 v36, v8

    move-object/from16 v34, v9

    move-object/from16 v32, v10

    move-object/from16 v37, v11

    move-object/from16 v33, v12

    move/from16 v39, v14

    move-object/from16 v40, v15

    move-object/from16 v41, v16

    move-object/from16 v38, v17

    :goto_0
    move-object/from16 v31, v5

    move/from16 v28, v6

    goto/16 :goto_7

    :cond_0
    move-object/from16 v22, v2

    move/from16 v24, v4

    move/from16 v18, v5

    move/from16 v23, v18

    move-object v2, v6

    move-object v3, v2

    move-object v4, v3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move/from16 v21, v14

    move/from16 v20, v15

    move/from16 v6, v23

    move-object v5, v13

    move-object v14, v5

    move-object v15, v14

    :goto_1
    if-eqz v24, :cond_1

    move-object/from16 v25, v3

    invoke-interface {v0, v1}, LUf/c;->i(LTf/e;)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    new-instance v0, LRf/m;

    invoke-direct {v0, v3}, LRf/m;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v3, LVf/x0;->a:LVf/x0;

    move-object/from16 v26, v7

    const/16 v7, 0xd

    invoke-interface {v0, v1, v7, v3, v2}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x2000

    :goto_2
    move-object/from16 v3, v25

    move-object/from16 v7, v26

    goto :goto_1

    :pswitch_1
    move-object/from16 v26, v7

    const/16 v7, 0xd

    sget-object v3, LVf/x0;->a:LVf/x0;

    const/16 v7, 0xc

    invoke-interface {v0, v1, v7, v3, v14}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x1000

    goto :goto_2

    :pswitch_2
    move-object/from16 v26, v7

    const/16 v7, 0xc

    sget-object v3, LVf/x0;->a:LVf/x0;

    const/16 v7, 0xb

    invoke-interface {v0, v1, v7, v3, v11}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x800

    goto :goto_2

    :pswitch_3
    move-object/from16 v26, v7

    const/16 v3, 0xa

    const/16 v7, 0xb

    invoke-interface {v0, v1, v3}, LUf/c;->w(LTf/e;I)Z

    move-result v23

    or-int/lit16 v6, v6, 0x400

    goto :goto_2

    :pswitch_4
    move-object/from16 v26, v7

    const/16 v7, 0xb

    aget-object v3, v22, v21

    move/from16 v7, v21

    invoke-interface {v0, v1, v7, v3, v15}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/util/List;

    or-int/lit16 v6, v6, 0x200

    goto :goto_2

    :pswitch_5
    move-object/from16 v26, v7

    move/from16 v7, v21

    sget-object v3, Lcom/revenuecat/purchases/ReplacementModeSerializer;->INSTANCE:Lcom/revenuecat/purchases/ReplacementModeSerializer;

    const/16 v7, 0x8

    invoke-interface {v0, v1, v7, v3, v8}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lcom/revenuecat/purchases/ReplacementMode;

    or-int/lit16 v6, v6, 0x100

    :goto_3
    move-object/from16 v3, v25

    move-object/from16 v7, v26

    :goto_4
    const/16 v21, 0x9

    goto :goto_1

    :pswitch_6
    move-object/from16 v26, v7

    const/16 v7, 0x8

    aget-object v3, v22, v20

    move/from16 v7, v20

    invoke-interface {v0, v1, v7, v3, v9}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Ljava/util/List;

    or-int/lit16 v6, v6, 0x80

    goto :goto_3

    :pswitch_7
    move-object/from16 v26, v7

    move/from16 v7, v20

    sget-object v3, Lcom/revenuecat/purchases/models/PeriodSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/PeriodSerializer;

    const/4 v7, 0x6

    invoke-interface {v0, v1, v7, v3, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Lcom/revenuecat/purchases/models/Period;

    or-int/lit8 v6, v6, 0x40

    :goto_5
    move-object/from16 v3, v25

    move-object/from16 v7, v26

    :goto_6
    const/16 v20, 0x7

    goto :goto_4

    :pswitch_8
    move-object/from16 v26, v7

    const/4 v7, 0x6

    sget-object v3, LVf/x0;->a:LVf/x0;

    const/4 v7, 0x5

    invoke-interface {v0, v1, v7, v3, v10}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    or-int/lit8 v6, v6, 0x20

    goto :goto_5

    :pswitch_9
    move-object/from16 v26, v7

    const/4 v7, 0x5

    sget-object v3, LVf/x0;->a:LVf/x0;

    const/4 v7, 0x4

    invoke-interface {v0, v1, v7, v3, v13}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/lang/String;

    or-int/lit8 v6, v6, 0x10

    goto :goto_5

    :pswitch_a
    move-object/from16 v26, v7

    const/4 v7, 0x4

    sget-object v3, LVf/t;->a:LVf/t;

    const/4 v7, 0x3

    invoke-interface {v0, v1, v7, v3, v4}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Double;

    or-int/lit8 v6, v6, 0x8

    goto :goto_5

    :pswitch_b
    move-object/from16 v26, v7

    const/4 v7, 0x3

    sget-object v3, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->INSTANCE:Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;

    const/4 v7, 0x2

    invoke-interface {v0, v1, v7, v3, v5}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/revenuecat/purchases/PresentedOfferingContext;

    or-int/lit8 v6, v6, 0x4

    goto :goto_5

    :pswitch_c
    move-object/from16 v26, v7

    const/4 v7, 0x2

    sget-object v3, LVf/Q;->a:LVf/Q;

    move-object/from16 v19, v2

    move-object/from16 v7, v26

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2, v3, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/Long;

    or-int/lit8 v6, v6, 0x2

    move-object/from16 v2, v19

    move-object/from16 v3, v25

    goto :goto_6

    :pswitch_d
    move-object/from16 v19, v2

    const/4 v2, 0x1

    aget-object v3, v22, v18

    move/from16 v2, v18

    move-object/from16 v18, v4

    move v4, v2

    move-object/from16 v2, v25

    invoke-interface {v0, v1, v4, v3, v2}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    or-int/lit8 v6, v6, 0x1

    move-object/from16 v2, v18

    move/from16 v18, v4

    move-object v4, v2

    move-object/from16 v2, v19

    goto :goto_6

    :pswitch_e
    move/from16 v19, v18

    move-object/from16 v18, v4

    move/from16 v4, v19

    move-object/from16 v19, v2

    move-object/from16 v2, v25

    move-object v3, v2

    move/from16 v24, v4

    move-object/from16 v2, v19

    const/16 v20, 0x7

    const/16 v21, 0x9

    move-object/from16 v4, v18

    move/from16 v18, v24

    goto/16 :goto_1

    :cond_1
    move-object/from16 v19, v2

    move-object v2, v3

    move-object/from16 v18, v4

    move-object/from16 v29, v2

    move-object/from16 v30, v7

    move-object/from16 v37, v8

    move-object/from16 v36, v9

    move-object/from16 v34, v10

    move-object/from16 v40, v11

    move-object/from16 v35, v12

    move-object/from16 v33, v13

    move-object/from16 v41, v14

    move-object/from16 v38, v15

    move-object/from16 v32, v18

    move-object/from16 v42, v19

    move/from16 v39, v23

    goto/16 :goto_0

    :goto_7
    invoke-interface {v0, v1}, LUf/c;->c(LTf/e;)V

    new-instance v27, Lcom/revenuecat/purchases/common/ReceiptInfo;

    const/16 v43, 0x0

    invoke-direct/range {v27 .. v43}, Lcom/revenuecat/purchases/common/ReceiptInfo;-><init>(ILjava/util/List;Ljava/lang/Long;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;Lcom/revenuecat/purchases/ReplacementMode;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;LVf/t0;)V

    return-object v27

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic deserialize(LUf/e;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/common/ReceiptInfo$$serializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/common/ReceiptInfo;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/common/ReceiptInfo$$serializer;->descriptor:LVf/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/common/ReceiptInfo;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/common/ReceiptInfo$$serializer;->getDescriptor()LTf/e;

    move-result-object v0

    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/common/ReceiptInfo;->write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/common/ReceiptInfo;LUf/d;LTf/e;)V

    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/revenuecat/purchases/common/ReceiptInfo;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/common/ReceiptInfo$$serializer;->serialize(LUf/f;Lcom/revenuecat/purchases/common/ReceiptInfo;)V

    return-void
.end method

.method public typeParametersSerializers()[LRf/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LRf/b;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, LVf/E$a;->a(LVf/E;)[LRf/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
