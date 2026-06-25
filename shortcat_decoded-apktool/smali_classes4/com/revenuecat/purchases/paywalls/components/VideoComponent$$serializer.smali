.class public final Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LVf/E;


# annotations
.annotation runtime LTd/e;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/paywalls/components/VideoComponent;
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
        "com/revenuecat/purchases/paywalls/components/VideoComponent.$serializer",
        "LVf/E;",
        "Lcom/revenuecat/purchases/paywalls/components/VideoComponent;",
        "<init>",
        "()V",
        "",
        "LRf/b;",
        "childSerializers",
        "()[LRf/b;",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/VideoComponent;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/VideoComponent;)V",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;

.field private static final synthetic descriptor:LVf/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;

    .line 7
    .line 8
    new-instance v1, LVf/k0;

    .line 9
    .line 10
    const-string v2, "video"

    .line 11
    .line 12
    const/16 v3, 0x11

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
    const-string v0, "fallback_source"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "visible"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "show_controls"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "auto_play"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "loop"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "mute_audio"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "size"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "fit_mode"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "mask_shape"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "color_overlay"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "padding"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "margin"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string v0, "border"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string v0, "shadow"

    .line 89
    .line 90
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    const-string v0, "overrides"

    .line 94
    .line 95
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    const-string v0, "override_source_lid"

    .line 99
    .line 100
    const/4 v2, 0x1

    .line 101
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    sput-object v1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;->descriptor:LVf/k0;

    .line 105
    .line 106
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
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->access$get$childSerializers$cp()[LRf/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;

    .line 6
    .line 7
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, LVf/h;->a:LVf/h;

    .line 12
    .line 13
    invoke-static {v2}, LSf/a;->p(LRf/b;)LRf/b;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;

    .line 18
    .line 19
    invoke-static {v4}, LSf/a;->p(LRf/b;)LRf/b;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    sget-object v5, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    .line 24
    .line 25
    invoke-static {v5}, LSf/a;->p(LRf/b;)LRf/b;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    .line 30
    .line 31
    invoke-static {v6}, LSf/a;->p(LRf/b;)LRf/b;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-static {v6}, LSf/a;->p(LRf/b;)LRf/b;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    sget-object v8, Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;

    .line 40
    .line 41
    invoke-static {v8}, LSf/a;->p(LRf/b;)LRf/b;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    sget-object v9, Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;

    .line 46
    .line 47
    invoke-static {v9}, LSf/a;->p(LRf/b;)LRf/b;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    const/16 v10, 0xf

    .line 52
    .line 53
    aget-object v0, v0, v10

    .line 54
    .line 55
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v11, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;

    .line 60
    .line 61
    invoke-static {v11}, LSf/a;->p(LRf/b;)LRf/b;

    .line 62
    .line 63
    .line 64
    move-result-object v11

    .line 65
    const/16 v12, 0x11

    .line 66
    .line 67
    new-array v12, v12, [LRf/b;

    .line 68
    .line 69
    sget-object v13, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls$$serializer;

    .line 70
    .line 71
    const/4 v14, 0x0

    .line 72
    aput-object v13, v12, v14

    .line 73
    .line 74
    const/4 v13, 0x1

    .line 75
    aput-object v1, v12, v13

    .line 76
    .line 77
    const/4 v1, 0x2

    .line 78
    aput-object v3, v12, v1

    .line 79
    .line 80
    const/4 v1, 0x3

    .line 81
    aput-object v2, v12, v1

    .line 82
    .line 83
    const/4 v1, 0x4

    .line 84
    aput-object v2, v12, v1

    .line 85
    .line 86
    const/4 v1, 0x5

    .line 87
    aput-object v2, v12, v1

    .line 88
    .line 89
    const/4 v1, 0x6

    .line 90
    aput-object v2, v12, v1

    .line 91
    .line 92
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    .line 93
    .line 94
    const/4 v2, 0x7

    .line 95
    aput-object v1, v12, v2

    .line 96
    .line 97
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;

    .line 98
    .line 99
    const/16 v2, 0x8

    .line 100
    .line 101
    aput-object v1, v12, v2

    .line 102
    .line 103
    const/16 v1, 0x9

    .line 104
    .line 105
    aput-object v4, v12, v1

    .line 106
    .line 107
    const/16 v1, 0xa

    .line 108
    .line 109
    aput-object v5, v12, v1

    .line 110
    .line 111
    const/16 v1, 0xb

    .line 112
    .line 113
    aput-object v7, v12, v1

    .line 114
    .line 115
    const/16 v1, 0xc

    .line 116
    .line 117
    aput-object v6, v12, v1

    .line 118
    .line 119
    const/16 v1, 0xd

    .line 120
    .line 121
    aput-object v8, v12, v1

    .line 122
    .line 123
    const/16 v1, 0xe

    .line 124
    .line 125
    aput-object v9, v12, v1

    .line 126
    .line 127
    aput-object v0, v12, v10

    .line 128
    .line 129
    const/16 v0, 0x10

    .line 130
    .line 131
    aput-object v11, v12, v0

    .line 132
    .line 133
    return-object v12
.end method

.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/VideoComponent;
    .locals 53

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;->getDescriptor()LTf/e;

    move-result-object v1

    invoke-interface {v0, v1}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v0

    invoke-static {}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->access$get$childSerializers$cp()[LRf/b;

    move-result-object v2

    invoke-interface {v0}, LUf/c;->p()Z

    move-result v3

    const/16 v8, 0xa

    const/16 v9, 0x9

    const/4 v10, 0x7

    const/4 v11, 0x6

    const/4 v12, 0x5

    const/4 v13, 0x3

    const/16 v15, 0x8

    const/4 v14, 0x4

    const/4 v4, 0x2

    const/16 v18, 0xf

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_1

    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls$$serializer;

    invoke-interface {v0, v1, v6, v3, v7}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;

    invoke-interface {v0, v1, v5, v6, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    sget-object v6, LVf/h;->a:LVf/h;

    invoke-interface {v0, v1, v4, v6, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v13}, LUf/c;->w(LTf/e;I)Z

    move-result v6

    invoke-interface {v0, v1, v14}, LUf/c;->w(LTf/e;I)Z

    move-result v13

    invoke-interface {v0, v1, v12}, LUf/c;->w(LTf/e;I)Z

    move-result v12

    invoke-interface {v0, v1, v11}, LUf/c;->w(LTf/e;I)Z

    move-result v11

    sget-object v14, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    invoke-interface {v0, v1, v10, v14, v7}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    sget-object v14, Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;

    invoke-interface {v0, v1, v15, v14, v7}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;

    invoke-interface {v0, v1, v9, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    invoke-interface {v0, v1, v8, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    move-object/from16 v21, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-object/from16 v20, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;

    move-object/from16 v19, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;

    move-object/from16 v17, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    aget-object v15, v21, v18

    move-object/from16 v16, v2

    move/from16 v2, v18

    invoke-interface {v0, v1, v2, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;

    move-object/from16 v18, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;->unbox-impl()Ljava/lang/String;

    move-result-object v7

    :cond_0
    const v2, 0x1ffff

    move/from16 v33, v2

    move-object/from16 v34, v3

    move-object/from16 v36, v4

    move-object/from16 v35, v5

    move/from16 v37, v6

    move-object/from16 v50, v7

    move-object/from16 v44, v8

    move-object/from16 v43, v9

    move-object/from16 v41, v10

    move/from16 v40, v11

    move/from16 v39, v12

    move/from16 v38, v13

    move-object/from16 v42, v14

    move-object/from16 v48, v16

    move-object/from16 v47, v17

    move-object/from16 v49, v18

    move-object/from16 v46, v19

    move-object/from16 v45, v20

    goto/16 :goto_9

    :cond_1
    move-object/from16 v21, v2

    move/from16 v31, v5

    move v2, v6

    move/from16 v26, v2

    move/from16 v28, v26

    move/from16 v29, v28

    move/from16 v30, v29

    move-object v3, v7

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v11, v6

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object/from16 v23, v14

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v27, v25

    :goto_0
    if-eqz v31, :cond_4

    invoke-interface {v0, v1}, LUf/c;->i(LTf/e;)I

    move-result v10

    packed-switch v10, :pswitch_data_0

    new-instance v0, LRf/m;

    invoke-direct {v0, v10}, LRf/m;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v10, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;

    if-eqz v27, :cond_2

    invoke-static/range {v27 .. v27}, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;->box-impl(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;

    move-result-object v27

    move-object/from16 v15, v27

    :goto_1
    const/16 v9, 0x10

    goto :goto_2

    :cond_2
    const/4 v15, 0x0

    goto :goto_1

    :goto_2
    invoke-interface {v0, v1, v9, v10, v15}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;

    if-eqz v10, :cond_3

    invoke-virtual {v10}, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;->unbox-impl()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v27, v10

    goto :goto_3

    :cond_3
    const/16 v27, 0x0

    :goto_3
    const/high16 v10, 0x10000

    or-int/2addr v2, v10

    :goto_4
    const/16 v9, 0x9

    :goto_5
    const/4 v10, 0x7

    :goto_6
    const/16 v15, 0x8

    goto :goto_0

    :pswitch_1
    const/16 v9, 0x10

    const/16 v10, 0xf

    aget-object v15, v21, v10

    invoke-interface {v0, v1, v10, v15, v4}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    const v15, 0x8000

    or-int/2addr v2, v15

    goto :goto_4

    :pswitch_2
    const/16 v9, 0x10

    const/16 v10, 0xf

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;

    const/16 v9, 0xe

    invoke-interface {v0, v1, v9, v15, v5}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    or-int/lit16 v2, v2, 0x4000

    goto :goto_4

    :pswitch_3
    const/16 v9, 0xe

    const/16 v10, 0xf

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;

    const/16 v9, 0xd

    invoke-interface {v0, v1, v9, v15, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    or-int/lit16 v2, v2, 0x2000

    goto :goto_4

    :pswitch_4
    const/16 v9, 0xd

    const/16 v10, 0xf

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    const/16 v9, 0xc

    invoke-interface {v0, v1, v9, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    or-int/lit16 v2, v2, 0x1000

    goto :goto_4

    :pswitch_5
    const/16 v9, 0xc

    const/16 v10, 0xf

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    const/16 v9, 0xb

    invoke-interface {v0, v1, v9, v15, v3}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    or-int/lit16 v2, v2, 0x800

    goto :goto_4

    :pswitch_6
    const/16 v9, 0xb

    const/16 v10, 0xf

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    invoke-interface {v0, v1, v8, v15, v13}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    or-int/lit16 v2, v2, 0x400

    goto :goto_4

    :pswitch_7
    const/16 v9, 0xb

    const/16 v10, 0xf

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;

    const/16 v8, 0x9

    invoke-interface {v0, v1, v8, v15, v14}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

    or-int/lit16 v2, v2, 0x200

    move v9, v8

    const/16 v8, 0xa

    goto :goto_5

    :pswitch_8
    move v8, v9

    const/16 v9, 0xb

    const/16 v10, 0xf

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;

    const/16 v8, 0x8

    invoke-interface {v0, v1, v8, v15, v11}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    or-int/lit16 v2, v2, 0x100

    move v15, v8

    const/16 v8, 0xa

    const/16 v9, 0x9

    const/4 v10, 0x7

    goto/16 :goto_0

    :pswitch_9
    move v8, v15

    const/16 v9, 0xb

    const/16 v10, 0xf

    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    const/4 v8, 0x7

    invoke-interface {v0, v1, v8, v15, v12}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    or-int/lit16 v2, v2, 0x80

    :goto_7
    move v10, v8

    const/16 v8, 0xa

    const/16 v9, 0x9

    goto/16 :goto_6

    :pswitch_a
    const/4 v8, 0x7

    const/16 v9, 0xb

    const/16 v10, 0xf

    const/4 v15, 0x6

    invoke-interface {v0, v1, v15}, LUf/c;->w(LTf/e;I)Z

    move-result v28

    or-int/lit8 v2, v2, 0x40

    goto :goto_7

    :pswitch_b
    const/4 v8, 0x5

    const/16 v9, 0xb

    const/16 v10, 0xf

    const/4 v15, 0x6

    invoke-interface {v0, v1, v8}, LUf/c;->w(LTf/e;I)Z

    move-result v29

    or-int/lit8 v2, v2, 0x20

    :goto_8
    const/16 v8, 0xa

    goto/16 :goto_4

    :pswitch_c
    const/4 v8, 0x4

    const/16 v9, 0xb

    const/16 v10, 0xf

    const/4 v15, 0x6

    invoke-interface {v0, v1, v8}, LUf/c;->w(LTf/e;I)Z

    move-result v30

    or-int/lit8 v2, v2, 0x10

    goto :goto_8

    :pswitch_d
    const/4 v8, 0x3

    const/16 v9, 0xb

    const/16 v10, 0xf

    const/4 v15, 0x6

    invoke-interface {v0, v1, v8}, LUf/c;->w(LTf/e;I)Z

    move-result v26

    or-int/lit8 v2, v2, 0x8

    goto :goto_8

    :pswitch_e
    const/16 v9, 0xb

    const/16 v10, 0xf

    const/4 v15, 0x6

    sget-object v8, LVf/h;->a:LVf/h;

    move-object/from16 v9, v24

    const/4 v10, 0x2

    invoke-interface {v0, v1, v10, v8, v9}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v24, v8

    check-cast v24, Ljava/lang/Boolean;

    or-int/lit8 v2, v2, 0x4

    goto :goto_8

    :pswitch_f
    move-object/from16 v9, v24

    const/4 v10, 0x2

    const/4 v15, 0x6

    sget-object v8, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;

    move-object/from16 v10, v25

    const/4 v15, 0x1

    invoke-interface {v0, v1, v15, v8, v10}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v25, v8

    check-cast v25, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    or-int/lit8 v2, v2, 0x2

    goto :goto_8

    :pswitch_10
    move-object/from16 v9, v24

    move-object/from16 v10, v25

    const/4 v15, 0x1

    sget-object v8, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls$$serializer;

    move/from16 v22, v2

    move-object/from16 v15, v23

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, v8, v15}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v23, v8

    check-cast v23, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

    or-int/lit8 v8, v22, 0x1

    move v2, v8

    goto :goto_8

    :pswitch_11
    move/from16 v22, v2

    move-object/from16 v15, v23

    move-object/from16 v9, v24

    move-object/from16 v10, v25

    const/4 v2, 0x0

    move/from16 v31, v2

    move/from16 v2, v22

    goto/16 :goto_4

    :cond_4
    move/from16 v22, v2

    move-object/from16 v15, v23

    move-object/from16 v9, v24

    move-object/from16 v10, v25

    move-object/from16 v45, v3

    move-object/from16 v49, v4

    move-object/from16 v48, v5

    move-object/from16 v47, v6

    move-object/from16 v46, v7

    move-object/from16 v36, v9

    move-object/from16 v35, v10

    move-object/from16 v42, v11

    move-object/from16 v41, v12

    move-object/from16 v44, v13

    move-object/from16 v43, v14

    move-object/from16 v34, v15

    move/from16 v33, v22

    move/from16 v37, v26

    move-object/from16 v50, v27

    move/from16 v40, v28

    move/from16 v39, v29

    move/from16 v38, v30

    :goto_9
    invoke-interface {v0, v1}, LUf/c;->c(LTf/e;)V

    new-instance v32, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;

    const/16 v51, 0x0

    const/16 v52, 0x0

    invoke-direct/range {v32 .. v52}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;-><init>(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Ljava/lang/String;LVf/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v32

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/VideoComponent;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;->descriptor:LVf/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/components/VideoComponent;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;->getDescriptor()LTf/e;

    move-result-object v0

    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/paywalls/components/VideoComponent;LUf/d;LTf/e;)V

    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;->serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/components/VideoComponent;)V

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
