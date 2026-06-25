.class public final Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LVf/E;


# annotations
.annotation runtime LTd/e;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;
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
        "com/revenuecat/purchases/paywalls/PaywallData.Configuration.$serializer",
        "LVf/E;",
        "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;",
        "<init>",
        "()V",
        "",
        "LRf/b;",
        "childSerializers",
        "()[LRf/b;",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;)V",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$$serializer;

.field private static final synthetic descriptor:LVf/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$$serializer;

    .line 7
    .line 8
    new-instance v1, LVf/k0;

    .line 9
    .line 10
    const-string v2, "com.revenuecat.purchases.paywalls.PaywallData.Configuration"

    .line 11
    .line 12
    const/16 v3, 0xd

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LVf/k0;-><init>(Ljava/lang/String;LVf/E;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "packages"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "default_package"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "images_webp"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "images"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "images_by_tier"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "blurred_background_image"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "display_restore_purchases"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "tos_url"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "privacy_url"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "colors"

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "colors_by_tier"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "tiers"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "default_tier"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    sput-object v1, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$$serializer;->descriptor:LVf/k0;

    .line 85
    .line 86
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
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;->access$get$childSerializers$cp()[LRf/b;

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
    sget-object v3, LVf/x0;->a:LVf/x0;

    .line 9
    .line 10
    invoke-static {v3}, LSf/a;->p(LRf/b;)LRf/b;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    sget-object v5, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images$$serializer;

    .line 15
    .line 16
    invoke-static {v5}, LSf/a;->p(LRf/b;)LRf/b;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    invoke-static {v5}, LSf/a;->p(LRf/b;)LRf/b;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const/4 v7, 0x4

    .line 25
    aget-object v8, v0, v7

    .line 26
    .line 27
    invoke-static {v8}, LSf/a;->p(LRf/b;)LRf/b;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    sget-object v9, Lcom/revenuecat/purchases/utils/serializers/OptionalURLSerializer;->INSTANCE:Lcom/revenuecat/purchases/utils/serializers/OptionalURLSerializer;

    .line 32
    .line 33
    invoke-static {v9}, LSf/a;->p(LRf/b;)LRf/b;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    invoke-static {v9}, LSf/a;->p(LRf/b;)LRf/b;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    const/16 v11, 0xa

    .line 42
    .line 43
    aget-object v12, v0, v11

    .line 44
    .line 45
    invoke-static {v12}, LSf/a;->p(LRf/b;)LRf/b;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    const/16 v13, 0xb

    .line 50
    .line 51
    aget-object v0, v0, v13

    .line 52
    .line 53
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v3}, LSf/a;->p(LRf/b;)LRf/b;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    const/16 v14, 0xd

    .line 62
    .line 63
    new-array v14, v14, [LRf/b;

    .line 64
    .line 65
    aput-object v2, v14, v1

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    aput-object v4, v14, v1

    .line 69
    .line 70
    const/4 v1, 0x2

    .line 71
    aput-object v6, v14, v1

    .line 72
    .line 73
    const/4 v1, 0x3

    .line 74
    aput-object v5, v14, v1

    .line 75
    .line 76
    aput-object v8, v14, v7

    .line 77
    .line 78
    sget-object v1, LVf/h;->a:LVf/h;

    .line 79
    .line 80
    const/4 v2, 0x5

    .line 81
    aput-object v1, v14, v2

    .line 82
    .line 83
    const/4 v2, 0x6

    .line 84
    aput-object v1, v14, v2

    .line 85
    .line 86
    const/4 v1, 0x7

    .line 87
    aput-object v10, v14, v1

    .line 88
    .line 89
    const/16 v1, 0x8

    .line 90
    .line 91
    aput-object v9, v14, v1

    .line 92
    .line 93
    sget-object v1, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation$$serializer;

    .line 94
    .line 95
    const/16 v2, 0x9

    .line 96
    .line 97
    aput-object v1, v14, v2

    .line 98
    .line 99
    aput-object v12, v14, v11

    .line 100
    .line 101
    aput-object v0, v14, v13

    .line 102
    .line 103
    const/16 v0, 0xc

    .line 104
    .line 105
    aput-object v3, v14, v0

    .line 106
    .line 107
    return-object v14
.end method

.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;
    .locals 42

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$$serializer;->getDescriptor()LTf/e;

    move-result-object v1

    invoke-interface {v0, v1}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v0

    invoke-static {}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;->access$get$childSerializers$cp()[LRf/b;

    move-result-object v2

    invoke-interface {v0}, LUf/c;->p()Z

    move-result v3

    const/16 v5, 0x9

    const/4 v6, 0x7

    const/4 v7, 0x6

    const/4 v8, 0x5

    const/4 v9, 0x3

    const/16 v10, 0x8

    const/4 v11, 0x2

    const/4 v14, 0x4

    const/4 v15, 0x1

    const/4 v4, 0x0

    const/16 v16, 0xb

    const/4 v12, 0x0

    if-eqz v3, :cond_0

    aget-object v3, v2, v4

    invoke-interface {v0, v1, v4, v3, v12}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    sget-object v4, LVf/x0;->a:LVf/x0;

    invoke-interface {v0, v1, v15, v4, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    const/16 v17, 0xa

    sget-object v13, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images$$serializer;

    invoke-interface {v0, v1, v11, v13, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    invoke-interface {v0, v1, v9, v13, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    aget-object v13, v2, v14

    invoke-interface {v0, v1, v14, v13, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map;

    invoke-interface {v0, v1, v8}, LUf/c;->w(LTf/e;I)Z

    move-result v8

    invoke-interface {v0, v1, v7}, LUf/c;->w(LTf/e;I)Z

    move-result v7

    sget-object v14, Lcom/revenuecat/purchases/utils/serializers/OptionalURLSerializer;->INSTANCE:Lcom/revenuecat/purchases/utils/serializers/OptionalURLSerializer;

    invoke-interface {v0, v1, v6, v14, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/net/URL;

    invoke-interface {v0, v1, v10, v14, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/net/URL;

    sget-object v14, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation$$serializer;

    invoke-interface {v0, v1, v5, v14, v12}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    aget-object v14, v2, v17

    move-object/from16 v18, v2

    move/from16 v2, v17

    invoke-interface {v0, v1, v2, v14, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    aget-object v14, v18, v16

    move-object/from16 v17, v2

    move/from16 v2, v16

    invoke-interface {v0, v1, v2, v14, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v14, 0xc

    invoke-interface {v0, v1, v14, v4, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/16 v12, 0x1fff

    move-object/from16 v39, v2

    move-object/from16 v28, v3

    move-object/from16 v40, v4

    move-object/from16 v37, v5

    move-object/from16 v35, v6

    move/from16 v34, v7

    move/from16 v33, v8

    move-object/from16 v31, v9

    move-object/from16 v36, v10

    move-object/from16 v30, v11

    move-object/from16 v32, v13

    move-object/from16 v29, v15

    move-object/from16 v38, v17

    :goto_0
    move/from16 v27, v12

    goto/16 :goto_5

    :cond_0
    move-object/from16 v18, v2

    move v2, v4

    move v3, v2

    move/from16 v19, v3

    move-object v5, v12

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v13, v11

    move/from16 v20, v14

    move/from16 v23, v15

    move/from16 v12, v19

    move-object v4, v13

    move-object v14, v4

    move-object v15, v14

    :goto_1
    move/from16 v24, v2

    if-eqz v23, :cond_1

    invoke-interface {v0, v1}, LUf/c;->i(LTf/e;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    new-instance v0, LRf/m;

    invoke-direct {v0, v2}, LRf/m;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v2, LVf/x0;->a:LVf/x0;

    move/from16 v25, v3

    const/16 v3, 0xc

    invoke-interface {v0, v1, v3, v2, v5}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x1000

    :goto_2
    move/from16 v2, v24

    :goto_3
    move/from16 v3, v25

    goto :goto_1

    :pswitch_1
    move/from16 v25, v3

    const/16 v2, 0xb

    aget-object v3, v18, v2

    invoke-interface {v0, v1, v2, v3, v10}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/util/List;

    or-int/lit16 v12, v12, 0x800

    goto :goto_2

    :pswitch_2
    move/from16 v25, v3

    const/16 v3, 0xa

    aget-object v2, v18, v3

    invoke-interface {v0, v1, v3, v2, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/util/Map;

    or-int/lit16 v12, v12, 0x400

    goto :goto_2

    :pswitch_3
    move/from16 v25, v3

    const/16 v3, 0xa

    sget-object v2, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation$$serializer;

    const/16 v3, 0x9

    invoke-interface {v0, v1, v3, v2, v7}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    or-int/lit16 v12, v12, 0x200

    goto :goto_2

    :pswitch_4
    move/from16 v25, v3

    const/16 v3, 0x9

    sget-object v2, Lcom/revenuecat/purchases/utils/serializers/OptionalURLSerializer;->INSTANCE:Lcom/revenuecat/purchases/utils/serializers/OptionalURLSerializer;

    const/16 v3, 0x8

    invoke-interface {v0, v1, v3, v2, v8}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/net/URL;

    or-int/lit16 v12, v12, 0x100

    goto :goto_2

    :pswitch_5
    move/from16 v25, v3

    const/16 v3, 0x8

    sget-object v2, Lcom/revenuecat/purchases/utils/serializers/OptionalURLSerializer;->INSTANCE:Lcom/revenuecat/purchases/utils/serializers/OptionalURLSerializer;

    const/4 v3, 0x7

    invoke-interface {v0, v1, v3, v2, v14}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/net/URL;

    or-int/lit16 v12, v12, 0x80

    goto :goto_2

    :pswitch_6
    move/from16 v25, v3

    const/4 v2, 0x6

    const/4 v3, 0x7

    invoke-interface {v0, v1, v2}, LUf/c;->w(LTf/e;I)Z

    move-result v22

    or-int/lit8 v12, v12, 0x40

    move/from16 v2, v22

    goto :goto_3

    :pswitch_7
    const/4 v2, 0x5

    const/4 v3, 0x7

    invoke-interface {v0, v1, v2}, LUf/c;->w(LTf/e;I)Z

    move-result v21

    or-int/lit8 v12, v12, 0x20

    move/from16 v3, v21

    move/from16 v2, v24

    goto/16 :goto_1

    :pswitch_8
    move/from16 v25, v3

    const/4 v3, 0x7

    aget-object v2, v18, v20

    move/from16 v3, v20

    invoke-interface {v0, v1, v3, v2, v9}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/util/Map;

    or-int/lit8 v12, v12, 0x10

    goto/16 :goto_2

    :pswitch_9
    move/from16 v25, v3

    move/from16 v3, v20

    sget-object v2, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images$$serializer;

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3, v2, v11}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    or-int/lit8 v12, v12, 0x8

    :goto_4
    move/from16 v2, v24

    move/from16 v3, v25

    const/16 v20, 0x4

    goto/16 :goto_1

    :pswitch_a
    move/from16 v25, v3

    const/4 v3, 0x3

    sget-object v2, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images$$serializer;

    const/4 v3, 0x2

    invoke-interface {v0, v1, v3, v2, v15}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    or-int/lit8 v12, v12, 0x4

    goto :goto_4

    :pswitch_b
    move/from16 v25, v3

    const/4 v3, 0x2

    sget-object v2, LVf/x0;->a:LVf/x0;

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v2, v4}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x2

    goto :goto_4

    :pswitch_c
    move/from16 v25, v3

    const/4 v3, 0x1

    aget-object v2, v18, v19

    move/from16 v3, v19

    invoke-interface {v0, v1, v3, v2, v13}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/util/List;

    or-int/lit8 v12, v12, 0x1

    goto :goto_4

    :pswitch_d
    move/from16 v25, v3

    move/from16 v3, v19

    move/from16 v23, v19

    goto :goto_4

    :cond_1
    move/from16 v25, v3

    move-object/from16 v29, v4

    move-object/from16 v40, v5

    move-object/from16 v38, v6

    move-object/from16 v37, v7

    move-object/from16 v36, v8

    move-object/from16 v32, v9

    move-object/from16 v39, v10

    move-object/from16 v31, v11

    move-object/from16 v28, v13

    move-object/from16 v35, v14

    move-object/from16 v30, v15

    move/from16 v34, v24

    move/from16 v33, v25

    goto/16 :goto_0

    :goto_5
    invoke-interface {v0, v1}, LUf/c;->c(LTf/e;)V

    new-instance v26, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    const/16 v41, 0x0

    invoke-direct/range {v26 .. v41}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;-><init>(ILjava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;LVf/t0;)V

    return-object v26

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$$serializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$$serializer;->descriptor:LVf/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$$serializer;->getDescriptor()LTf/e;

    move-result-object v0

    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;->write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;LUf/d;LTf/e;)V

    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$$serializer;->serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;)V

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
