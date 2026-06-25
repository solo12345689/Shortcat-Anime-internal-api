.class public final Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LVf/E;


# annotations
.annotation runtime LTd/e;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;
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
        "com/revenuecat/purchases/paywalls/components/TimelineComponent.$serializer",
        "LVf/E;",
        "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;",
        "<init>",
        "()V",
        "",
        "LRf/b;",
        "childSerializers",
        "()[LRf/b;",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;)V",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;

.field private static final synthetic descriptor:LVf/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;

    .line 7
    .line 8
    new-instance v1, LVf/k0;

    .line 9
    .line 10
    const-string v2, "timeline"

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LVf/k0;-><init>(Ljava/lang/String;LVf/E;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "item_spacing"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "text_spacing"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "column_gutter"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "icon_alignment"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "visible"

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "size"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "padding"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "margin"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "items"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "overrides"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    sput-object v1, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;->descriptor:LVf/k0;

    .line 70
    .line 71
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
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LRf/b;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->access$get$childSerializers$cp()[LRf/b;

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
    const/16 v2, 0x8

    .line 12
    .line 13
    aget-object v3, v0, v2

    .line 14
    .line 15
    const/16 v4, 0x9

    .line 16
    .line 17
    aget-object v0, v0, v4

    .line 18
    .line 19
    const/16 v5, 0xa

    .line 20
    .line 21
    new-array v5, v5, [LRf/b;

    .line 22
    .line 23
    sget-object v6, LVf/J;->a:LVf/J;

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    aput-object v6, v5, v7

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    aput-object v6, v5, v7

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    aput-object v6, v5, v7

    .line 33
    .line 34
    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/TimelineIconAlignmentDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/TimelineIconAlignmentDeserializer;

    .line 35
    .line 36
    const/4 v7, 0x3

    .line 37
    aput-object v6, v5, v7

    .line 38
    .line 39
    const/4 v6, 0x4

    .line 40
    aput-object v1, v5, v6

    .line 41
    .line 42
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    .line 43
    .line 44
    const/4 v6, 0x5

    .line 45
    aput-object v1, v5, v6

    .line 46
    .line 47
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    .line 48
    .line 49
    const/4 v6, 0x6

    .line 50
    aput-object v1, v5, v6

    .line 51
    .line 52
    const/4 v6, 0x7

    .line 53
    aput-object v1, v5, v6

    .line 54
    .line 55
    aput-object v3, v5, v2

    .line 56
    .line 57
    aput-object v0, v5, v4

    .line 58
    .line 59
    return-object v5
.end method

.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;
    .locals 32

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;->getDescriptor()LTf/e;

    move-result-object v1

    invoke-interface {v0, v1}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v0

    invoke-static {}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->access$get$childSerializers$cp()[LRf/b;

    move-result-object v2

    invoke-interface {v0}, LUf/c;->p()Z

    move-result v3

    const/4 v4, 0x7

    const/4 v5, 0x6

    const/4 v6, 0x5

    const/4 v7, 0x3

    const/4 v8, 0x4

    const/4 v9, 0x2

    const/16 v10, 0x9

    const/16 v11, 0x8

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v13}, LUf/c;->m(LTf/e;I)I

    move-result v3

    invoke-interface {v0, v1, v12}, LUf/c;->m(LTf/e;I)I

    move-result v12

    invoke-interface {v0, v1, v9}, LUf/c;->m(LTf/e;I)I

    move-result v9

    sget-object v13, Lcom/revenuecat/purchases/paywalls/components/TimelineIconAlignmentDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/TimelineIconAlignmentDeserializer;

    invoke-interface {v0, v1, v7, v13, v14}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

    sget-object v13, LVf/h;->a:LVf/h;

    invoke-interface {v0, v1, v8, v13, v14}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    sget-object v13, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    invoke-interface {v0, v1, v6, v13, v14}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    sget-object v13, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    invoke-interface {v0, v1, v5, v13, v14}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    invoke-interface {v0, v1, v4, v13, v14}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    aget-object v13, v2, v11

    invoke-interface {v0, v1, v11, v13, v14}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    aget-object v2, v2, v10

    invoke-interface {v0, v1, v10, v2, v14}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v10, 0x3ff

    move-object/from16 v30, v2

    move-object/from16 v28, v4

    move-object/from16 v27, v5

    move-object/from16 v26, v6

    move-object/from16 v24, v7

    move-object/from16 v25, v8

    move/from16 v23, v9

    move/from16 v20, v10

    move-object/from16 v29, v11

    move/from16 v22, v12

    :goto_0
    move/from16 v21, v3

    goto/16 :goto_5

    :cond_0
    move/from16 v18, v12

    move v3, v13

    move v15, v3

    move/from16 v16, v15

    move-object v5, v14

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v12, v9

    move/from16 v14, v16

    move-object v13, v12

    :goto_1
    if-eqz v18, :cond_1

    invoke-interface {v0, v1}, LUf/c;->i(LTf/e;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    new-instance v0, LRf/m;

    invoke-direct {v0, v4}, LRf/m;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v4, v2, v10

    invoke-interface {v0, v1, v10, v4, v5}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/List;

    or-int/lit16 v15, v15, 0x200

    :goto_2
    const/4 v4, 0x7

    goto :goto_1

    :pswitch_1
    aget-object v4, v2, v11

    invoke-interface {v0, v1, v11, v4, v6}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Ljava/util/List;

    or-int/lit16 v15, v15, 0x100

    goto :goto_2

    :pswitch_2
    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    const/4 v10, 0x7

    invoke-interface {v0, v1, v10, v4, v8}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    or-int/lit16 v15, v15, 0x80

    move v4, v10

    :goto_3
    const/16 v10, 0x9

    goto :goto_1

    :pswitch_3
    const/4 v10, 0x7

    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    const/4 v10, 0x6

    invoke-interface {v0, v1, v10, v4, v7}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    or-int/lit8 v15, v15, 0x40

    :goto_4
    const/4 v4, 0x7

    goto :goto_3

    :pswitch_4
    const/4 v10, 0x6

    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    const/4 v10, 0x5

    invoke-interface {v0, v1, v10, v4, v9}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    or-int/lit8 v15, v15, 0x20

    goto :goto_4

    :pswitch_5
    const/4 v10, 0x5

    sget-object v4, LVf/h;->a:LVf/h;

    const/4 v10, 0x4

    invoke-interface {v0, v1, v10, v4, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Ljava/lang/Boolean;

    or-int/lit8 v15, v15, 0x10

    goto :goto_4

    :pswitch_6
    const/4 v10, 0x4

    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/TimelineIconAlignmentDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/TimelineIconAlignmentDeserializer;

    const/4 v10, 0x3

    invoke-interface {v0, v1, v10, v4, v13}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;

    or-int/lit8 v15, v15, 0x8

    goto :goto_4

    :pswitch_7
    const/4 v4, 0x2

    const/4 v10, 0x3

    invoke-interface {v0, v1, v4}, LUf/c;->m(LTf/e;I)I

    move-result v14

    or-int/lit8 v15, v15, 0x4

    goto :goto_4

    :pswitch_8
    const/4 v4, 0x1

    const/4 v10, 0x3

    invoke-interface {v0, v1, v4}, LUf/c;->m(LTf/e;I)I

    move-result v16

    or-int/lit8 v15, v15, 0x2

    goto :goto_4

    :pswitch_9
    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v10, 0x3

    invoke-interface {v0, v1, v3}, LUf/c;->m(LTf/e;I)I

    move-result v17

    or-int/lit8 v15, v15, 0x1

    move/from16 v3, v17

    goto :goto_4

    :pswitch_a
    const/4 v4, 0x1

    const/16 v17, 0x0

    move/from16 v18, v17

    goto :goto_2

    :cond_1
    move-object/from16 v30, v5

    move-object/from16 v29, v6

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    move-object/from16 v26, v9

    move-object/from16 v25, v12

    move-object/from16 v24, v13

    move/from16 v23, v14

    move/from16 v20, v15

    move/from16 v22, v16

    goto/16 :goto_0

    :goto_5
    invoke-interface {v0, v1}, LUf/c;->c(LTf/e;)V

    new-instance v19, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;

    const/16 v31, 0x0

    invoke-direct/range {v19 .. v31}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;-><init>(IIIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Ljava/util/List;LVf/t0;)V

    return-object v19

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;->descriptor:LVf/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;->getDescriptor()LTf/e;

    move-result-object v0

    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;LUf/d;LTf/e;)V

    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$$serializer;->serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;)V

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
