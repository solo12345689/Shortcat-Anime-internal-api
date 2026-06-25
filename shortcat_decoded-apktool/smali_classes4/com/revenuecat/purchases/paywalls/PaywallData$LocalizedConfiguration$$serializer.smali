.class public final Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LVf/E;


# annotations
.annotation runtime LTd/e;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;
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
        "com/revenuecat/purchases/paywalls/PaywallData.LocalizedConfiguration.$serializer",
        "LVf/E;",
        "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;",
        "<init>",
        "()V",
        "",
        "LRf/b;",
        "childSerializers",
        "()[LRf/b;",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;)V",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$$serializer;

.field private static final synthetic descriptor:LVf/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$$serializer;

    .line 7
    .line 8
    new-instance v1, LVf/k0;

    .line 9
    .line 10
    const-string v2, "com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration"

    .line 11
    .line 12
    const/16 v3, 0xc

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LVf/k0;-><init>(Ljava/lang/String;LVf/E;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "title"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "subtitle"

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    const-string v0, "call_to_action"

    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "call_to_action_with_intro_offer"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "call_to_action_with_multiple_intro_offers"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "offer_details"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "offer_details_with_intro_offer"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "offer_details_with_multiple_intro_offers"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "offer_name"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "features"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "tier_name"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "offer_overrides"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    sput-object v1, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$$serializer;->descriptor:LVf/k0;

    .line 80
    .line 81
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
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LRf/b;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->access$get$childSerializers$cp()[LRf/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;

    .line 6
    .line 7
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    const/16 v9, 0x9

    .line 36
    .line 37
    aget-object v10, v0, v9

    .line 38
    .line 39
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/16 v11, 0xb

    .line 44
    .line 45
    aget-object v0, v0, v11

    .line 46
    .line 47
    const/16 v12, 0xc

    .line 48
    .line 49
    new-array v12, v12, [LRf/b;

    .line 50
    .line 51
    sget-object v13, LVf/x0;->a:LVf/x0;

    .line 52
    .line 53
    const/4 v14, 0x0

    .line 54
    aput-object v13, v12, v14

    .line 55
    .line 56
    const/4 v14, 0x1

    .line 57
    aput-object v2, v12, v14

    .line 58
    .line 59
    const/4 v2, 0x2

    .line 60
    aput-object v13, v12, v2

    .line 61
    .line 62
    const/4 v2, 0x3

    .line 63
    aput-object v3, v12, v2

    .line 64
    .line 65
    const/4 v2, 0x4

    .line 66
    aput-object v4, v12, v2

    .line 67
    .line 68
    const/4 v2, 0x5

    .line 69
    aput-object v5, v12, v2

    .line 70
    .line 71
    const/4 v2, 0x6

    .line 72
    aput-object v6, v12, v2

    .line 73
    .line 74
    const/4 v2, 0x7

    .line 75
    aput-object v7, v12, v2

    .line 76
    .line 77
    const/16 v2, 0x8

    .line 78
    .line 79
    aput-object v8, v12, v2

    .line 80
    .line 81
    aput-object v10, v12, v9

    .line 82
    .line 83
    const/16 v2, 0xa

    .line 84
    .line 85
    aput-object v1, v12, v2

    .line 86
    .line 87
    aput-object v0, v12, v11

    .line 88
    .line 89
    return-object v12
.end method

.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;
    .locals 36

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$$serializer;->getDescriptor()LTf/e;

    move-result-object v1

    invoke-interface {v0, v1}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v0

    invoke-static {}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->access$get$childSerializers$cp()[LRf/b;

    move-result-object v2

    invoke-interface {v0}, LUf/c;->p()Z

    move-result v3

    const/4 v5, 0x7

    const/4 v6, 0x6

    const/4 v7, 0x5

    const/4 v8, 0x3

    const/16 v9, 0x8

    const/4 v10, 0x4

    const/4 v11, 0x2

    const/16 v13, 0x9

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 p1, 0xb

    const/4 v12, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v15}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v3

    sget-object v15, Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;

    invoke-interface {v0, v1, v14, v15, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v11}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v1, v8, v15, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v10, v15, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v7, v15, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v0, v1, v6, v15, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v0, v1, v5, v15, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v0, v1, v9, v15, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    aget-object v4, v2, v13

    invoke-interface {v0, v1, v13, v4, v12}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    const/16 v13, 0xa

    invoke-interface {v0, v1, v13, v15, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    aget-object v2, v2, p1

    move/from16 v15, p1

    invoke-interface {v0, v1, v15, v2, v12}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    const/16 v12, 0xfff

    move-object/from16 v34, v2

    move-object/from16 v23, v3

    move-object/from16 v32, v4

    move-object/from16 v30, v5

    move-object/from16 v29, v6

    move-object/from16 v28, v7

    move-object/from16 v26, v8

    move-object/from16 v31, v9

    move-object/from16 v27, v10

    move-object/from16 v25, v11

    move-object/from16 v33, v13

    move-object/from16 v24, v14

    :goto_0
    move/from16 v22, v12

    goto/16 :goto_4

    :cond_0
    move/from16 v3, p1

    move-object v4, v12

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object/from16 v16, v11

    move/from16 v17, v13

    move/from16 v18, v14

    move-object/from16 v13, v16

    move-object v14, v13

    move v12, v15

    move-object v15, v14

    :goto_1
    if-eqz v18, :cond_1

    move/from16 v19, v3

    invoke-interface {v0, v1}, LUf/c;->i(LTf/e;)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    new-instance v0, LRf/m;

    invoke-direct {v0, v3}, LRf/m;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v3, v2, v19

    move-object/from16 v20, v2

    move/from16 v2, v19

    invoke-interface {v0, v1, v2, v3, v13}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/util/Map;

    or-int/lit16 v12, v12, 0x800

    move v3, v2

    move-object/from16 v2, v20

    goto :goto_1

    :pswitch_1
    move-object/from16 v20, v2

    move/from16 v2, v19

    sget-object v3, Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v3, v9}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x400

    :goto_2
    move-object/from16 v2, v20

    const/16 v3, 0xb

    goto :goto_1

    :pswitch_2
    move-object/from16 v20, v2

    const/16 v2, 0xa

    aget-object v3, v20, v17

    move/from16 v2, v17

    invoke-interface {v0, v1, v2, v3, v5}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/util/List;

    or-int/lit16 v12, v12, 0x200

    goto :goto_2

    :pswitch_3
    move-object/from16 v20, v2

    move/from16 v2, v17

    sget-object v3, Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;

    const/16 v2, 0x8

    invoke-interface {v0, v1, v2, v3, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x100

    :goto_3
    move-object/from16 v2, v20

    const/16 v3, 0xb

    const/16 v17, 0x9

    goto :goto_1

    :pswitch_4
    move-object/from16 v20, v2

    const/16 v2, 0x8

    sget-object v3, Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;

    const/4 v2, 0x7

    invoke-interface {v0, v1, v2, v3, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x80

    goto :goto_3

    :pswitch_5
    move-object/from16 v20, v2

    const/4 v2, 0x7

    sget-object v3, Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;

    const/4 v2, 0x6

    invoke-interface {v0, v1, v2, v3, v10}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x40

    goto :goto_3

    :pswitch_6
    move-object/from16 v20, v2

    const/4 v2, 0x6

    sget-object v3, Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;

    const/4 v2, 0x5

    invoke-interface {v0, v1, v2, v3, v8}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x20

    goto :goto_3

    :pswitch_7
    move-object/from16 v20, v2

    const/4 v2, 0x5

    sget-object v3, Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2, v3, v11}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x10

    goto :goto_3

    :pswitch_8
    move-object/from16 v20, v2

    const/4 v2, 0x4

    sget-object v3, Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2, v3, v14}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x8

    goto :goto_3

    :pswitch_9
    move-object/from16 v20, v2

    const/4 v2, 0x3

    const/4 v3, 0x2

    invoke-interface {v0, v1, v3}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v16

    or-int/lit8 v12, v12, 0x4

    goto :goto_3

    :pswitch_a
    move-object/from16 v20, v2

    const/4 v3, 0x2

    sget-object v2, Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v2, v15}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x2

    goto :goto_3

    :pswitch_b
    move-object/from16 v20, v2

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v4

    or-int/lit8 v12, v12, 0x1

    goto :goto_3

    :pswitch_c
    move-object/from16 v20, v2

    const/4 v2, 0x0

    move/from16 v18, v2

    goto/16 :goto_3

    :cond_1
    move-object/from16 v23, v4

    move-object/from16 v32, v5

    move-object/from16 v31, v6

    move-object/from16 v30, v7

    move-object/from16 v28, v8

    move-object/from16 v33, v9

    move-object/from16 v29, v10

    move-object/from16 v27, v11

    move-object/from16 v34, v13

    move-object/from16 v26, v14

    move-object/from16 v24, v15

    move-object/from16 v25, v16

    goto/16 :goto_0

    :goto_4
    invoke-interface {v0, v1}, LUf/c;->c(LTf/e;)V

    new-instance v21, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    const/16 v35, 0x0

    invoke-direct/range {v21 .. v35}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;LVf/t0;)V

    return-object v21

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$$serializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$$serializer;->descriptor:LVf/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$$serializer;->getDescriptor()LTf/e;

    move-result-object v0

    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;LUf/d;LTf/e;)V

    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$$serializer;->serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;)V

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
