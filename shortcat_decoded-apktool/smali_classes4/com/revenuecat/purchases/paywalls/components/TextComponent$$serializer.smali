.class public final Lcom/revenuecat/purchases/paywalls/components/TextComponent$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LVf/E;


# annotations
.annotation runtime LTd/e;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/paywalls/components/TextComponent;
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
        "com/revenuecat/purchases/paywalls/components/TextComponent.$serializer",
        "LVf/E;",
        "Lcom/revenuecat/purchases/paywalls/components/TextComponent;",
        "<init>",
        "()V",
        "",
        "LRf/b;",
        "childSerializers",
        "()[LRf/b;",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/TextComponent;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/TextComponent;)V",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/paywalls/components/TextComponent$$serializer;

.field private static final synthetic descriptor:LVf/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/TextComponent$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/paywalls/components/TextComponent$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/TextComponent$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/TextComponent$$serializer;

    .line 7
    .line 8
    new-instance v1, LVf/k0;

    .line 9
    .line 10
    const-string v2, "text"

    .line 11
    .line 12
    const/16 v3, 0xd

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LVf/k0;-><init>(Ljava/lang/String;LVf/E;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "text_lid"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "color"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "visible"

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "background_color"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "font_name"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "font_weight"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "font_weight_int"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "font_size"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "horizontal_alignment"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "size"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "padding"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "margin"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "overrides"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    sput-object v1, Lcom/revenuecat/purchases/paywalls/components/TextComponent$$serializer;->descriptor:LVf/k0;

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
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LRf/b;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/components/TextComponent;->access$get$childSerializers$cp()[LRf/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    .line 6
    .line 7
    sget-object v2, LVf/h;->a:LVf/h;

    .line 8
    .line 9
    invoke-static {v2}, LSf/a;->p(LRf/b;)LRf/b;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    sget-object v4, Lcom/revenuecat/purchases/FontAlias$$serializer;->INSTANCE:Lcom/revenuecat/purchases/FontAlias$$serializer;

    .line 18
    .line 19
    invoke-static {v4}, LSf/a;->p(LRf/b;)LRf/b;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    sget-object v5, LVf/J;->a:LVf/J;

    .line 24
    .line 25
    invoke-static {v5}, LSf/a;->p(LRf/b;)LRf/b;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const/16 v6, 0xc

    .line 30
    .line 31
    aget-object v0, v0, v6

    .line 32
    .line 33
    const/16 v7, 0xd

    .line 34
    .line 35
    new-array v7, v7, [LRf/b;

    .line 36
    .line 37
    sget-object v8, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    aput-object v8, v7, v9

    .line 41
    .line 42
    const/4 v8, 0x1

    .line 43
    aput-object v1, v7, v8

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    aput-object v2, v7, v1

    .line 47
    .line 48
    const/4 v1, 0x3

    .line 49
    aput-object v3, v7, v1

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    aput-object v4, v7, v1

    .line 53
    .line 54
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/FontWeightDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/FontWeightDeserializer;

    .line 55
    .line 56
    const/4 v2, 0x5

    .line 57
    aput-object v1, v7, v2

    .line 58
    .line 59
    const/4 v1, 0x6

    .line 60
    aput-object v5, v7, v1

    .line 61
    .line 62
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/FontSizeSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/FontSizeSerializer;

    .line 63
    .line 64
    const/4 v2, 0x7

    .line 65
    aput-object v1, v7, v2

    .line 66
    .line 67
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignmentDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignmentDeserializer;

    .line 68
    .line 69
    const/16 v2, 0x8

    .line 70
    .line 71
    aput-object v1, v7, v2

    .line 72
    .line 73
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    .line 74
    .line 75
    const/16 v2, 0x9

    .line 76
    .line 77
    aput-object v1, v7, v2

    .line 78
    .line 79
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    .line 80
    .line 81
    const/16 v2, 0xa

    .line 82
    .line 83
    aput-object v1, v7, v2

    .line 84
    .line 85
    const/16 v2, 0xb

    .line 86
    .line 87
    aput-object v1, v7, v2

    .line 88
    .line 89
    aput-object v0, v7, v6

    .line 90
    .line 91
    return-object v7
.end method

.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/TextComponent;
    .locals 41

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/paywalls/components/TextComponent$$serializer;->getDescriptor()LTf/e;

    move-result-object v1

    invoke-interface {v0, v1}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v0

    invoke-static {}, Lcom/revenuecat/purchases/paywalls/components/TextComponent;->access$get$childSerializers$cp()[LRf/b;

    move-result-object v2

    invoke-interface {v0}, LUf/c;->p()Z

    move-result v3

    const/16 v6, 0x9

    const/4 v7, 0x7

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/16 v11, 0x8

    const/4 v12, 0x4

    const/4 v13, 0x2

    const/4 v15, 0x1

    const/16 p1, 0xc

    const/4 v14, 0x0

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;

    invoke-interface {v0, v1, v14, v3, v4}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;->unbox-impl()Ljava/lang/String;

    move-result-object v3

    :goto_0
    move/from16 v17, v14

    goto :goto_1

    :cond_0
    move-object v3, v4

    goto :goto_0

    :goto_1
    sget-object v14, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    invoke-interface {v0, v1, v15, v14, v4}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    sget-object v5, LVf/h;->a:LVf/h;

    invoke-interface {v0, v1, v13, v5, v4}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v10, v14, v4}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    sget-object v13, Lcom/revenuecat/purchases/FontAlias$$serializer;->INSTANCE:Lcom/revenuecat/purchases/FontAlias$$serializer;

    invoke-interface {v0, v1, v12, v13, v4}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/revenuecat/purchases/FontAlias;

    if-eqz v12, :cond_1

    invoke-virtual {v12}, Lcom/revenuecat/purchases/FontAlias;->unbox-impl()Ljava/lang/String;

    move-result-object v12

    goto :goto_2

    :cond_1
    move-object v12, v4

    :goto_2
    sget-object v13, Lcom/revenuecat/purchases/paywalls/components/properties/FontWeightDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/FontWeightDeserializer;

    invoke-interface {v0, v1, v9, v13, v4}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;

    sget-object v13, LVf/J;->a:LVf/J;

    invoke-interface {v0, v1, v8, v13, v4}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    sget-object v13, Lcom/revenuecat/purchases/paywalls/components/FontSizeSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/FontSizeSerializer;

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v0, v1, v7, v13, v14}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    sget-object v13, Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignmentDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignmentDeserializer;

    invoke-interface {v0, v1, v11, v13, v4}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;

    sget-object v13, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    invoke-interface {v0, v1, v6, v13, v4}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    sget-object v13, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    const/16 v14, 0xa

    invoke-interface {v0, v1, v14, v13, v4}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-object/from16 v18, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v13, v4}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    aget-object v13, v18, p1

    move-object/from16 v16, v15

    move/from16 v15, p1

    invoke-interface {v0, v1, v15, v13, v4}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    const/16 v13, 0x1fff

    move-object/from16 v37, v2

    move-object/from16 v26, v3

    move-object/from16 v38, v4

    move-object/from16 v28, v5

    move-object/from16 v35, v6

    move/from16 v33, v7

    move-object/from16 v32, v8

    move-object/from16 v31, v9

    move-object/from16 v29, v10

    move-object/from16 v34, v11

    move-object/from16 v30, v12

    move/from16 v25, v13

    move-object/from16 v36, v14

    move-object/from16 v27, v16

    goto/16 :goto_10

    :cond_2
    move-object/from16 v18, v2

    move/from16 v17, v14

    move v2, v15

    move/from16 v15, p1

    move/from16 v23, v2

    move-object v2, v4

    move-object v3, v2

    move-object v5, v3

    move-object v8, v5

    move-object v10, v8

    move-object v12, v10

    move-object v13, v12

    move-object v14, v13

    move-object/from16 v20, v14

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move/from16 v9, v17

    move/from16 v19, v9

    :goto_3
    if-eqz v23, :cond_7

    invoke-interface {v0, v1}, LUf/c;->i(LTf/e;)I

    move-result v7

    packed-switch v7, :pswitch_data_0

    new-instance v0, LRf/m;

    invoke-direct {v0, v7}, LRf/m;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v7, v18, v15

    invoke-interface {v0, v1, v15, v7, v14}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v14, v7

    check-cast v14, Ljava/util/List;

    or-int/lit16 v9, v9, 0x1000

    const/4 v7, 0x7

    goto :goto_3

    :pswitch_1
    sget-object v7, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    const/16 v15, 0xb

    invoke-interface {v0, v1, v15, v7, v3}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    or-int/lit16 v9, v9, 0x800

    :goto_4
    const/4 v7, 0x7

    :goto_5
    const/16 v15, 0xc

    goto :goto_3

    :pswitch_2
    const/16 v15, 0xb

    sget-object v7, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    const/16 v15, 0xa

    invoke-interface {v0, v1, v15, v7, v8}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    or-int/lit16 v9, v9, 0x400

    goto :goto_4

    :pswitch_3
    const/16 v15, 0xa

    sget-object v7, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    invoke-interface {v0, v1, v6, v7, v2}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    or-int/lit16 v9, v9, 0x200

    goto :goto_4

    :pswitch_4
    const/16 v15, 0xa

    sget-object v7, Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignmentDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignmentDeserializer;

    invoke-interface {v0, v1, v11, v7, v12}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;

    or-int/lit16 v9, v9, 0x100

    goto :goto_4

    :pswitch_5
    const/16 v15, 0xa

    sget-object v7, Lcom/revenuecat/purchases/paywalls/components/FontSizeSerializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/FontSizeSerializer;

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v11, 0x7

    invoke-interface {v0, v1, v11, v7, v6}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v19

    or-int/lit16 v9, v9, 0x80

    :goto_6
    move v7, v11

    const/16 v6, 0x9

    :goto_7
    const/16 v11, 0x8

    goto :goto_5

    :pswitch_6
    const/4 v11, 0x7

    const/16 v15, 0xa

    sget-object v6, LVf/J;->a:LVf/J;

    const/4 v7, 0x6

    invoke-interface {v0, v1, v7, v6, v13}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v13, v6

    check-cast v13, Ljava/lang/Integer;

    or-int/lit8 v9, v9, 0x40

    goto :goto_6

    :pswitch_7
    const/4 v7, 0x6

    const/4 v11, 0x7

    const/16 v15, 0xa

    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/FontWeightDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/FontWeightDeserializer;

    const/4 v7, 0x5

    invoke-interface {v0, v1, v7, v6, v10}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;

    or-int/lit8 v9, v9, 0x20

    goto :goto_6

    :pswitch_8
    const/4 v7, 0x5

    const/4 v11, 0x7

    const/16 v15, 0xa

    sget-object v6, Lcom/revenuecat/purchases/FontAlias$$serializer;->INSTANCE:Lcom/revenuecat/purchases/FontAlias$$serializer;

    if-eqz v21, :cond_3

    invoke-static/range {v21 .. v21}, Lcom/revenuecat/purchases/FontAlias;->box-impl(Ljava/lang/String;)Lcom/revenuecat/purchases/FontAlias;

    move-result-object v21

    move-object/from16 v7, v21

    :goto_8
    const/4 v11, 0x4

    goto :goto_9

    :cond_3
    const/4 v7, 0x0

    goto :goto_8

    :goto_9
    invoke-interface {v0, v1, v11, v6, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/revenuecat/purchases/FontAlias;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/revenuecat/purchases/FontAlias;->unbox-impl()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v21, v6

    goto :goto_a

    :cond_4
    const/16 v21, 0x0

    :goto_a
    or-int/lit8 v9, v9, 0x10

    :goto_b
    const/16 v6, 0x9

    :goto_c
    const/4 v7, 0x7

    goto :goto_7

    :pswitch_9
    const/4 v11, 0x4

    const/16 v15, 0xa

    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    move-object/from16 v7, v20

    const/4 v11, 0x3

    invoke-interface {v0, v1, v11, v6, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v20, v6

    check-cast v20, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    or-int/lit8 v9, v9, 0x8

    goto :goto_b

    :pswitch_a
    move-object/from16 v7, v20

    const/4 v11, 0x3

    const/16 v15, 0xa

    sget-object v6, LVf/h;->a:LVf/h;

    const/4 v11, 0x2

    invoke-interface {v0, v1, v11, v6, v4}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    or-int/lit8 v9, v9, 0x4

    goto :goto_b

    :pswitch_b
    move-object/from16 v7, v20

    const/4 v11, 0x2

    const/16 v15, 0xa

    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    move-object/from16 v11, v22

    const/4 v15, 0x1

    invoke-interface {v0, v1, v15, v6, v11}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v22, v6

    check-cast v22, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    or-int/lit8 v9, v9, 0x2

    goto :goto_b

    :pswitch_c
    move-object/from16 v7, v20

    move-object/from16 v11, v22

    const/4 v15, 0x1

    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;

    if-eqz v5, :cond_5

    invoke-static {v5}, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;->box-impl(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;

    move-result-object v5

    :goto_d
    move/from16 v15, v17

    goto :goto_e

    :cond_5
    const/4 v5, 0x0

    goto :goto_d

    :goto_e
    invoke-interface {v0, v1, v15, v6, v5}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;->unbox-impl()Ljava/lang/String;

    move-result-object v5

    goto :goto_f

    :cond_6
    const/4 v5, 0x0

    :goto_f
    or-int/lit8 v9, v9, 0x1

    move-object/from16 v20, v7

    move-object/from16 v22, v11

    move/from16 v17, v15

    goto :goto_b

    :pswitch_d
    move/from16 v15, v17

    move-object/from16 v7, v20

    move-object/from16 v11, v22

    move/from16 v23, v17

    goto :goto_c

    :cond_7
    move-object/from16 v7, v20

    move-object/from16 v11, v22

    move-object/from16 v35, v2

    move-object/from16 v37, v3

    move-object/from16 v28, v4

    move-object/from16 v26, v5

    move-object/from16 v29, v7

    move-object/from16 v36, v8

    move/from16 v25, v9

    move-object/from16 v31, v10

    move-object/from16 v27, v11

    move-object/from16 v34, v12

    move-object/from16 v32, v13

    move-object/from16 v38, v14

    move/from16 v33, v19

    move-object/from16 v30, v21

    :goto_10
    invoke-interface {v0, v1}, LUf/c;->c(LTf/e;)V

    new-instance v24, Lcom/revenuecat/purchases/paywalls/components/TextComponent;

    const/16 v39, 0x0

    const/16 v40, 0x0

    invoke-direct/range {v24 .. v40}, Lcom/revenuecat/purchases/paywalls/components/TextComponent;-><init>(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;Ljava/lang/Integer;ILcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;LVf/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v24

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
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/paywalls/components/TextComponent$$serializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/TextComponent;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/TextComponent$$serializer;->descriptor:LVf/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/components/TextComponent;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/TextComponent$$serializer;->getDescriptor()LTf/e;

    move-result-object v0

    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/paywalls/components/TextComponent;->write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/paywalls/components/TextComponent;LUf/d;LTf/e;)V

    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/revenuecat/purchases/paywalls/components/TextComponent;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/paywalls/components/TextComponent$$serializer;->serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/components/TextComponent;)V

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
