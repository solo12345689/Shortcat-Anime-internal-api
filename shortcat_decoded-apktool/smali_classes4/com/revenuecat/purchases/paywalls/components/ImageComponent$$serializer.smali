.class public final Lcom/revenuecat/purchases/paywalls/components/ImageComponent$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LVf/E;


# annotations
.annotation runtime LTd/e;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/paywalls/components/ImageComponent;
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
        "com/revenuecat/purchases/paywalls/components/ImageComponent.$serializer",
        "LVf/E;",
        "Lcom/revenuecat/purchases/paywalls/components/ImageComponent;",
        "<init>",
        "()V",
        "",
        "LRf/b;",
        "childSerializers",
        "()[LRf/b;",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/ImageComponent;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/ImageComponent;)V",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/paywalls/components/ImageComponent$$serializer;

.field private static final synthetic descriptor:LVf/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/ImageComponent$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/paywalls/components/ImageComponent$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/ImageComponent$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/ImageComponent$$serializer;

    .line 7
    .line 8
    new-instance v1, LVf/k0;

    .line 9
    .line 10
    const-string v2, "image"

    .line 11
    .line 12
    const/16 v3, 0xc

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LVf/k0;-><init>(Ljava/lang/String;LVf/E;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "source"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "visible"

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    const-string v0, "size"

    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "override_source_lid"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "mask_shape"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "color_overlay"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "fit_mode"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "padding"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "margin"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "border"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "shadow"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "overrides"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    sput-object v1, Lcom/revenuecat/purchases/paywalls/components/ImageComponent$$serializer;->descriptor:LVf/k0;

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
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LRf/b;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/components/ImageComponent;->access$get$childSerializers$cp()[LRf/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LVf/h;->a:LVf/h;

    .line 6
    .line 7
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;

    .line 12
    .line 13
    invoke-static {v2}, LSf/a;->p(LRf/b;)LRf/b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;

    .line 18
    .line 19
    invoke-static {v3}, LSf/a;->p(LRf/b;)LRf/b;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    .line 24
    .line 25
    invoke-static {v4}, LSf/a;->p(LRf/b;)LRf/b;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    sget-object v5, Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;

    .line 30
    .line 31
    invoke-static {v5}, LSf/a;->p(LRf/b;)LRf/b;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;

    .line 36
    .line 37
    invoke-static {v6}, LSf/a;->p(LRf/b;)LRf/b;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const/16 v7, 0xb

    .line 42
    .line 43
    aget-object v0, v0, v7

    .line 44
    .line 45
    const/16 v8, 0xc

    .line 46
    .line 47
    new-array v8, v8, [LRf/b;

    .line 48
    .line 49
    sget-object v9, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;

    .line 50
    .line 51
    const/4 v10, 0x0

    .line 52
    aput-object v9, v8, v10

    .line 53
    .line 54
    const/4 v9, 0x1

    .line 55
    aput-object v1, v8, v9

    .line 56
    .line 57
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    .line 58
    .line 59
    const/4 v9, 0x2

    .line 60
    aput-object v1, v8, v9

    .line 61
    .line 62
    const/4 v1, 0x3

    .line 63
    aput-object v2, v8, v1

    .line 64
    .line 65
    const/4 v1, 0x4

    .line 66
    aput-object v3, v8, v1

    .line 67
    .line 68
    const/4 v1, 0x5

    .line 69
    aput-object v4, v8, v1

    .line 70
    .line 71
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;

    .line 72
    .line 73
    const/4 v2, 0x6

    .line 74
    aput-object v1, v8, v2

    .line 75
    .line 76
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    .line 77
    .line 78
    const/4 v2, 0x7

    .line 79
    aput-object v1, v8, v2

    .line 80
    .line 81
    const/16 v2, 0x8

    .line 82
    .line 83
    aput-object v1, v8, v2

    .line 84
    .line 85
    const/16 v1, 0x9

    .line 86
    .line 87
    aput-object v5, v8, v1

    .line 88
    .line 89
    const/16 v1, 0xa

    .line 90
    .line 91
    aput-object v6, v8, v1

    .line 92
    .line 93
    aput-object v0, v8, v7

    .line 94
    .line 95
    return-object v8
.end method

.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/ImageComponent;
    .locals 38

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/paywalls/components/ImageComponent$$serializer;->getDescriptor()LTf/e;

    move-result-object v1

    invoke-interface {v0, v1}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v0

    invoke-static {}, Lcom/revenuecat/purchases/paywalls/components/ImageComponent;->access$get$childSerializers$cp()[LRf/b;

    move-result-object v2

    invoke-interface {v0}, LUf/c;->p()Z

    move-result v3

    const/16 v4, 0xa

    const/16 v5, 0x9

    const/4 v6, 0x7

    const/4 v7, 0x6

    const/4 v8, 0x5

    const/4 v9, 0x3

    const/16 v10, 0x8

    const/4 v11, 0x4

    const/4 v12, 0x2

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 p1, 0xb

    const/4 v13, 0x0

    if-eqz v3, :cond_1

    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;

    invoke-interface {v0, v1, v15, v3, v13}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    sget-object v15, LVf/h;->a:LVf/h;

    invoke-interface {v0, v1, v14, v15, v13}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    invoke-interface {v0, v1, v12, v15, v13}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;

    invoke-interface {v0, v1, v9, v15, v13}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;

    if-eqz v9, :cond_0

    invoke-virtual {v9}, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;->unbox-impl()Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    :cond_0
    move-object v9, v13

    :goto_0
    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;

    invoke-interface {v0, v1, v11, v15, v13}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    invoke-interface {v0, v1, v8, v15, v13}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;

    invoke-interface {v0, v1, v7, v15, v13}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    invoke-interface {v0, v1, v6, v15, v13}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    invoke-interface {v0, v1, v10, v15, v13}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;

    invoke-interface {v0, v1, v5, v15, v13}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;

    invoke-interface {v0, v1, v4, v15, v13}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    aget-object v2, v2, p1

    move/from16 v15, p1

    invoke-interface {v0, v1, v15, v2, v13}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v13, 0xfff

    move-object/from16 v35, v2

    move-object/from16 v24, v3

    move-object/from16 v34, v4

    move-object/from16 v33, v5

    move-object/from16 v31, v6

    move-object/from16 v30, v7

    move-object/from16 v29, v8

    move-object/from16 v27, v9

    move-object/from16 v32, v10

    move-object/from16 v28, v11

    move-object/from16 v26, v12

    move/from16 v23, v13

    move-object/from16 v25, v14

    goto/16 :goto_9

    :cond_1
    move/from16 v3, p1

    move-object v8, v13

    move-object v9, v8

    move-object v11, v9

    move-object v12, v11

    move-object/from16 v16, v12

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move/from16 v21, v14

    move v7, v15

    move-object/from16 v14, v20

    move-object v15, v14

    :goto_1
    if-eqz v21, :cond_4

    invoke-interface {v0, v1}, LUf/c;->i(LTf/e;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, LRf/m;

    invoke-direct {v0, v6}, LRf/m;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v6, v2, v3

    invoke-interface {v0, v1, v3, v6, v13}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v13, v6

    check-cast v13, Ljava/util/List;

    or-int/lit16 v7, v7, 0x800

    :goto_2
    const/4 v6, 0x7

    goto :goto_1

    :pswitch_1
    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;

    invoke-interface {v0, v1, v4, v6, v15}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    or-int/lit16 v7, v7, 0x400

    goto :goto_2

    :pswitch_2
    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;

    invoke-interface {v0, v1, v5, v6, v14}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v14, v6

    check-cast v14, Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    or-int/lit16 v7, v7, 0x200

    goto :goto_2

    :pswitch_3
    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    invoke-interface {v0, v1, v10, v6, v8}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    or-int/lit16 v7, v7, 0x100

    goto :goto_2

    :pswitch_4
    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    const/4 v3, 0x7

    invoke-interface {v0, v1, v3, v6, v12}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v12, v6

    check-cast v12, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    or-int/lit16 v7, v7, 0x80

    move v6, v3

    const/16 v3, 0xb

    goto :goto_1

    :pswitch_5
    const/4 v3, 0x7

    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;

    const/4 v3, 0x6

    invoke-interface {v0, v1, v3, v6, v9}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    or-int/lit8 v7, v7, 0x40

    :goto_3
    const/16 v3, 0xb

    goto :goto_2

    :pswitch_6
    const/4 v3, 0x6

    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3, v6, v11}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    or-int/lit8 v7, v7, 0x20

    goto :goto_3

    :pswitch_7
    const/4 v3, 0x5

    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;

    move-object/from16 v3, v18

    const/4 v4, 0x4

    invoke-interface {v0, v1, v4, v6, v3}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    check-cast v18, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

    or-int/lit8 v7, v7, 0x10

    const/16 v3, 0xb

    const/16 v4, 0xa

    goto :goto_2

    :pswitch_8
    move-object/from16 v3, v18

    const/4 v4, 0x4

    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;

    if-eqz v17, :cond_2

    invoke-static/range {v17 .. v17}, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;->box-impl(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;

    move-result-object v17

    move-object/from16 v4, v17

    :goto_4
    const/4 v5, 0x3

    goto :goto_5

    :cond_2
    const/4 v4, 0x0

    goto :goto_4

    :goto_5
    invoke-interface {v0, v1, v5, v6, v4}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;->unbox-impl()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v17, v4

    goto :goto_6

    :cond_3
    const/16 v17, 0x0

    :goto_6
    or-int/lit8 v7, v7, 0x8

    move-object/from16 v18, v3

    :goto_7
    const/16 v3, 0xb

    const/16 v4, 0xa

    const/16 v5, 0x9

    goto/16 :goto_2

    :pswitch_9
    move-object/from16 v3, v18

    const/4 v5, 0x3

    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    move-object/from16 v6, v19

    const/4 v5, 0x2

    invoke-interface {v0, v1, v5, v4, v6}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v19, v4

    check-cast v19, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    or-int/lit8 v7, v7, 0x4

    goto :goto_7

    :pswitch_a
    move-object/from16 v3, v18

    move-object/from16 v6, v19

    const/4 v5, 0x2

    sget-object v4, LVf/h;->a:LVf/h;

    move-object/from16 v5, v20

    const/4 v10, 0x1

    invoke-interface {v0, v1, v10, v4, v5}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v20, v4

    check-cast v20, Ljava/lang/Boolean;

    or-int/lit8 v7, v7, 0x2

    const/16 v3, 0xb

    const/16 v4, 0xa

    const/16 v5, 0x9

    const/4 v6, 0x7

    :goto_8
    const/16 v10, 0x8

    goto/16 :goto_1

    :pswitch_b
    move-object/from16 v3, v18

    move-object/from16 v6, v19

    move-object/from16 v5, v20

    const/4 v10, 0x1

    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;

    move-object/from16 v10, v16

    move-object/from16 v16, v2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, v4, v10}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    or-int/lit8 v7, v7, 0x1

    move-object/from16 v2, v16

    const/16 v3, 0xb

    const/16 v5, 0x9

    const/4 v6, 0x7

    const/16 v10, 0x8

    move-object/from16 v16, v4

    const/16 v4, 0xa

    goto/16 :goto_1

    :pswitch_c
    move-object/from16 v10, v16

    move-object/from16 v3, v18

    move-object/from16 v6, v19

    move-object/from16 v5, v20

    move-object/from16 v16, v2

    const/4 v2, 0x0

    move/from16 v21, v2

    move-object/from16 v2, v16

    const/16 v3, 0xb

    const/16 v5, 0x9

    const/4 v6, 0x7

    move-object/from16 v16, v10

    goto :goto_8

    :cond_4
    move-object/from16 v10, v16

    move-object/from16 v3, v18

    move-object/from16 v6, v19

    move-object/from16 v5, v20

    move-object/from16 v28, v3

    move-object/from16 v25, v5

    move-object/from16 v26, v6

    move/from16 v23, v7

    move-object/from16 v32, v8

    move-object/from16 v30, v9

    move-object/from16 v24, v10

    move-object/from16 v29, v11

    move-object/from16 v31, v12

    move-object/from16 v35, v13

    move-object/from16 v33, v14

    move-object/from16 v34, v15

    move-object/from16 v27, v17

    :goto_9
    invoke-interface {v0, v1}, LUf/c;->c(LTf/e;)V

    new-instance v22, Lcom/revenuecat/purchases/paywalls/components/ImageComponent;

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v22 .. v37}, Lcom/revenuecat/purchases/paywalls/components/ImageComponent;-><init>(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;LVf/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v22

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
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/paywalls/components/ImageComponent$$serializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/ImageComponent;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/ImageComponent$$serializer;->descriptor:LVf/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/components/ImageComponent;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/ImageComponent$$serializer;->getDescriptor()LTf/e;

    move-result-object v0

    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/paywalls/components/ImageComponent;->write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/paywalls/components/ImageComponent;LUf/d;LTf/e;)V

    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/revenuecat/purchases/paywalls/components/ImageComponent;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/paywalls/components/ImageComponent$$serializer;->serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/components/ImageComponent;)V

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
