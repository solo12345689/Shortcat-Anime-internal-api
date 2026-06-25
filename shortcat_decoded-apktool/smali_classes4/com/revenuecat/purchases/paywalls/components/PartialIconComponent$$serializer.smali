.class public final Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LVf/E;


# annotations
.annotation runtime LTd/e;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;
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
        "com/revenuecat/purchases/paywalls/components/PartialIconComponent.$serializer",
        "LVf/E;",
        "Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;",
        "<init>",
        "()V",
        "",
        "LRf/b;",
        "childSerializers",
        "()[LRf/b;",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;)V",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$$serializer;

.field private static final synthetic descriptor:LVf/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$$serializer;

    .line 7
    .line 8
    new-instance v1, LVf/k0;

    .line 9
    .line 10
    const-string v2, "com.revenuecat.purchases.paywalls.components.PartialIconComponent"

    .line 11
    .line 12
    const/16 v3, 0x9

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LVf/k0;-><init>(Ljava/lang/String;LVf/E;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "visible"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "base_url"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "icon_name"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "formats"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "size"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "color"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "padding"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "margin"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "icon_background"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    sput-object v1, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$$serializer;->descriptor:LVf/k0;

    .line 64
    .line 65
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
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LRf/b;"
        }
    .end annotation

    .line 1
    sget-object v0, LVf/h;->a:LVf/h;

    .line 2
    .line 3
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, LVf/x0;->a:LVf/x0;

    .line 8
    .line 9
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats$$serializer;

    .line 18
    .line 19
    invoke-static {v3}, LSf/a;->p(LRf/b;)LRf/b;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    .line 24
    .line 25
    invoke-static {v4}, LSf/a;->p(LRf/b;)LRf/b;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    sget-object v5, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    .line 30
    .line 31
    invoke-static {v5}, LSf/a;->p(LRf/b;)LRf/b;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    .line 36
    .line 37
    invoke-static {v6}, LSf/a;->p(LRf/b;)LRf/b;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-static {v6}, LSf/a;->p(LRf/b;)LRf/b;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    sget-object v8, Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground$$serializer;

    .line 46
    .line 47
    invoke-static {v8}, LSf/a;->p(LRf/b;)LRf/b;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    const/16 v9, 0x9

    .line 52
    .line 53
    new-array v9, v9, [LRf/b;

    .line 54
    .line 55
    const/4 v10, 0x0

    .line 56
    aput-object v0, v9, v10

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    aput-object v2, v9, v0

    .line 60
    .line 61
    const/4 v0, 0x2

    .line 62
    aput-object v1, v9, v0

    .line 63
    .line 64
    const/4 v0, 0x3

    .line 65
    aput-object v3, v9, v0

    .line 66
    .line 67
    const/4 v0, 0x4

    .line 68
    aput-object v4, v9, v0

    .line 69
    .line 70
    const/4 v0, 0x5

    .line 71
    aput-object v5, v9, v0

    .line 72
    .line 73
    const/4 v0, 0x6

    .line 74
    aput-object v7, v9, v0

    .line 75
    .line 76
    const/4 v0, 0x7

    .line 77
    aput-object v6, v9, v0

    .line 78
    .line 79
    const/16 v0, 0x8

    .line 80
    .line 81
    aput-object v8, v9, v0

    .line 82
    .line 83
    return-object v9
.end method

.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;
    .locals 29

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$$serializer;->getDescriptor()LTf/e;

    move-result-object v1

    invoke-interface {v0, v1}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v0

    invoke-interface {v0}, LUf/c;->p()Z

    move-result v2

    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/16 v7, 0x8

    const/4 v8, 0x4

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-eqz v2, :cond_0

    sget-object v2, LVf/h;->a:LVf/h;

    invoke-interface {v0, v1, v11, v2, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    sget-object v11, LVf/x0;->a:LVf/x0;

    invoke-interface {v0, v1, v10, v11, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v9, v11, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    sget-object v11, Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats$$serializer;

    invoke-interface {v0, v1, v6, v11, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;

    sget-object v11, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    invoke-interface {v0, v1, v8, v11, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    sget-object v11, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    invoke-interface {v0, v1, v5, v11, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    sget-object v11, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    invoke-interface {v0, v1, v4, v11, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    invoke-interface {v0, v1, v3, v11, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    sget-object v11, Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground$$serializer;

    invoke-interface {v0, v1, v7, v11, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;

    const/16 v11, 0x1ff

    move-object/from16 v19, v2

    move-object/from16 v26, v3

    move-object/from16 v25, v4

    move-object/from16 v24, v5

    move-object/from16 v22, v6

    move-object/from16 v27, v7

    move-object/from16 v23, v8

    move-object/from16 v21, v9

    move-object/from16 v20, v10

    move/from16 v18, v11

    goto/16 :goto_3

    :cond_0
    move/from16 v16, v10

    move v2, v11

    move-object v6, v12

    move-object v8, v6

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v13, v11

    move-object v14, v13

    move-object v15, v14

    :goto_0
    if-eqz v16, :cond_1

    invoke-interface {v0, v1}, LUf/c;->i(LTf/e;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, LRf/m;

    invoke-direct {v0, v5}, LRf/m;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v5, Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground$$serializer;

    invoke-interface {v0, v1, v7, v5, v8}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;

    or-int/lit16 v2, v2, 0x100

    :goto_1
    const/4 v5, 0x5

    goto :goto_0

    :pswitch_1
    sget-object v5, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    invoke-interface {v0, v1, v3, v5, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    or-int/lit16 v2, v2, 0x80

    goto :goto_1

    :pswitch_2
    sget-object v5, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    invoke-interface {v0, v1, v4, v5, v9}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    or-int/lit8 v2, v2, 0x40

    goto :goto_1

    :pswitch_3
    sget-object v5, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3, v5, v10}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    or-int/lit8 v2, v2, 0x20

    move v5, v3

    const/4 v3, 0x7

    goto :goto_0

    :pswitch_4
    const/4 v3, 0x5

    sget-object v5, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    const/4 v3, 0x4

    invoke-interface {v0, v1, v3, v5, v11}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    or-int/lit8 v2, v2, 0x10

    :goto_2
    const/4 v3, 0x7

    goto :goto_1

    :pswitch_5
    const/4 v3, 0x4

    sget-object v5, Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats$$serializer;

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3, v5, v15}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v15, v5

    check-cast v15, Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;

    or-int/lit8 v2, v2, 0x8

    goto :goto_2

    :pswitch_6
    const/4 v3, 0x3

    sget-object v5, LVf/x0;->a:LVf/x0;

    const/4 v3, 0x2

    invoke-interface {v0, v1, v3, v5, v14}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v14, v5

    check-cast v14, Ljava/lang/String;

    or-int/lit8 v2, v2, 0x4

    goto :goto_2

    :pswitch_7
    const/4 v3, 0x2

    sget-object v5, LVf/x0;->a:LVf/x0;

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v5, v13}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Ljava/lang/String;

    or-int/lit8 v2, v2, 0x2

    goto :goto_2

    :pswitch_8
    const/4 v3, 0x1

    sget-object v5, LVf/h;->a:LVf/h;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v5, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v12, v5

    check-cast v12, Ljava/lang/Boolean;

    or-int/lit8 v2, v2, 0x1

    goto :goto_2

    :pswitch_9
    const/4 v3, 0x0

    move/from16 v16, v3

    goto :goto_2

    :cond_1
    move/from16 v18, v2

    move-object/from16 v26, v6

    move-object/from16 v27, v8

    move-object/from16 v25, v9

    move-object/from16 v24, v10

    move-object/from16 v23, v11

    move-object/from16 v19, v12

    move-object/from16 v20, v13

    move-object/from16 v21, v14

    move-object/from16 v22, v15

    :goto_3
    invoke-interface {v0, v1}, LUf/c;->c(LTf/e;)V

    new-instance v17, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    const/16 v28, 0x0

    invoke-direct/range {v17 .. v28}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;-><init>(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;LVf/t0;)V

    return-object v17

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$$serializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$$serializer;->descriptor:LVf/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$$serializer;->getDescriptor()LTf/e;

    move-result-object v0

    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;->write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;LUf/d;LTf/e;)V

    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$$serializer;->serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;)V

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
