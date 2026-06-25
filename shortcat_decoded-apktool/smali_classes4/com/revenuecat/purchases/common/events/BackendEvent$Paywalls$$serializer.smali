.class public final Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LVf/E;


# annotations
.annotation runtime LTd/e;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;
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
        "com/revenuecat/purchases/common/events/BackendEvent.Paywalls.$serializer",
        "LVf/E;",
        "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;",
        "<init>",
        "()V",
        "",
        "LRf/b;",
        "childSerializers",
        "()[LRf/b;",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;)V",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$$serializer;

.field private static final synthetic descriptor:LVf/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$$serializer;->INSTANCE:Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$$serializer;

    .line 7
    .line 8
    new-instance v1, LVf/k0;

    .line 9
    .line 10
    const-string v2, "paywalls"

    .line 11
    .line 12
    const/16 v3, 0x12

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LVf/k0;-><init>(Ljava/lang/String;LVf/E;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "id"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "version"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "type"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "app_user_id"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "session_id"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "offering_id"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "paywall_id"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "paywall_revision"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "timestamp"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "display_mode"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "dark_mode"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "locale"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "exit_offer_type"

    .line 79
    .line 80
    const/4 v2, 0x1

    .line 81
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    const-string v0, "exit_offering_id"

    .line 85
    .line 86
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    const-string v0, "package_id"

    .line 90
    .line 91
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    const-string v0, "product_id"

    .line 95
    .line 96
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    const-string v0, "error_code"

    .line 100
    .line 101
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    const-string v0, "error_message"

    .line 105
    .line 106
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    sput-object v1, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$$serializer;->descriptor:LVf/k0;

    .line 110
    .line 111
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
    sget-object v0, LVf/x0;->a:LVf/x0;

    .line 2
    .line 3
    sget-object v1, LVf/J;->a:LVf/J;

    .line 4
    .line 5
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    const/16 v9, 0x12

    .line 34
    .line 35
    new-array v9, v9, [LRf/b;

    .line 36
    .line 37
    const/4 v10, 0x0

    .line 38
    aput-object v0, v9, v10

    .line 39
    .line 40
    const/4 v10, 0x1

    .line 41
    aput-object v1, v9, v10

    .line 42
    .line 43
    const/4 v10, 0x2

    .line 44
    aput-object v0, v9, v10

    .line 45
    .line 46
    const/4 v10, 0x3

    .line 47
    aput-object v0, v9, v10

    .line 48
    .line 49
    const/4 v10, 0x4

    .line 50
    aput-object v0, v9, v10

    .line 51
    .line 52
    const/4 v10, 0x5

    .line 53
    aput-object v0, v9, v10

    .line 54
    .line 55
    const/4 v10, 0x6

    .line 56
    aput-object v2, v9, v10

    .line 57
    .line 58
    const/4 v2, 0x7

    .line 59
    aput-object v1, v9, v2

    .line 60
    .line 61
    sget-object v1, LVf/Q;->a:LVf/Q;

    .line 62
    .line 63
    const/16 v2, 0x8

    .line 64
    .line 65
    aput-object v1, v9, v2

    .line 66
    .line 67
    const/16 v1, 0x9

    .line 68
    .line 69
    aput-object v0, v9, v1

    .line 70
    .line 71
    sget-object v1, LVf/h;->a:LVf/h;

    .line 72
    .line 73
    const/16 v2, 0xa

    .line 74
    .line 75
    aput-object v1, v9, v2

    .line 76
    .line 77
    const/16 v1, 0xb

    .line 78
    .line 79
    aput-object v0, v9, v1

    .line 80
    .line 81
    const/16 v0, 0xc

    .line 82
    .line 83
    aput-object v3, v9, v0

    .line 84
    .line 85
    const/16 v0, 0xd

    .line 86
    .line 87
    aput-object v4, v9, v0

    .line 88
    .line 89
    const/16 v0, 0xe

    .line 90
    .line 91
    aput-object v5, v9, v0

    .line 92
    .line 93
    const/16 v0, 0xf

    .line 94
    .line 95
    aput-object v6, v9, v0

    .line 96
    .line 97
    const/16 v0, 0x10

    .line 98
    .line 99
    aput-object v7, v9, v0

    .line 100
    .line 101
    const/16 v0, 0x11

    .line 102
    .line 103
    aput-object v8, v9, v0

    .line 104
    .line 105
    return-object v9
.end method

.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;
    .locals 56

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$$serializer;->getDescriptor()LTf/e;

    move-result-object v1

    invoke-interface {v0, v1}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v0

    invoke-interface {v0}, LUf/c;->p()Z

    move-result v2

    const/16 v8, 0xb

    const/16 v9, 0xa

    const/16 v10, 0x9

    const/4 v11, 0x7

    const/4 v12, 0x6

    const/4 v13, 0x5

    const/4 v14, 0x3

    const/16 v3, 0x8

    const/4 v15, 0x4

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v6}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v5}, LUf/c;->m(LTf/e;I)I

    move-result v5

    invoke-interface {v0, v1, v4}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v14}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v1, v15}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v1, v13}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v13

    sget-object v15, LVf/x0;->a:LVf/x0;

    invoke-interface {v0, v1, v12, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v0, v1, v11}, LUf/c;->m(LTf/e;I)I

    move-result v11

    invoke-interface {v0, v1, v3}, LUf/c;->o(LTf/e;I)J

    move-result-wide v20

    invoke-interface {v0, v1, v10}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v9}, LUf/c;->w(LTf/e;I)Z

    move-result v9

    invoke-interface {v0, v1, v8}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v8

    const/16 v10, 0xc

    invoke-interface {v0, v1, v10, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    move-object/from16 v19, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v18, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v17, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v16, v2

    sget-object v2, LVf/J;->a:LVf/J;

    move-object/from16 v22, v3

    const/16 v3, 0x10

    invoke-interface {v0, v1, v3, v2, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const/16 v3, 0x11

    invoke-interface {v0, v1, v3, v15, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const v7, 0x3ffff

    move-object/from16 v52, v2

    move-object/from16 v53, v3

    move-object/from16 v37, v4

    move/from16 v36, v5

    move-object/from16 v38, v6

    move-object/from16 v47, v8

    move/from16 v46, v9

    move-object/from16 v48, v10

    move/from16 v42, v11

    move-object/from16 v41, v12

    move-object/from16 v40, v13

    move-object/from16 v39, v14

    move-object/from16 v51, v16

    move-object/from16 v50, v17

    move-object/from16 v49, v18

    move-object/from16 v35, v19

    move-wide/from16 v43, v20

    move-object/from16 v45, v22

    :goto_0
    move/from16 v34, v7

    goto/16 :goto_8

    :cond_0
    const-wide/16 v20, 0x0

    move/from16 v32, v5

    move v2, v6

    move/from16 v28, v2

    move/from16 v29, v28

    move-object v4, v7

    move-object v5, v4

    move-object v12, v5

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v22, v15

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-wide/from16 v30, v20

    move/from16 v7, v29

    move-object/from16 v6, v26

    move-object/from16 v20, v6

    move-object/from16 v21, v20

    :goto_1
    if-eqz v32, :cond_1

    invoke-interface {v0, v1}, LUf/c;->i(LTf/e;)I

    move-result v11

    packed-switch v11, :pswitch_data_0

    new-instance v0, LRf/m;

    invoke-direct {v0, v11}, LRf/m;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v11, LVf/x0;->a:LVf/x0;

    const/16 v3, 0x11

    invoke-interface {v0, v1, v3, v11, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ljava/lang/String;

    const/high16 v11, 0x20000

    :goto_2
    or-int/2addr v7, v11

    :goto_3
    const/16 v3, 0x8

    :goto_4
    const/4 v11, 0x7

    goto :goto_1

    :pswitch_1
    const/16 v3, 0x11

    sget-object v11, LVf/J;->a:LVf/J;

    const/16 v3, 0x10

    invoke-interface {v0, v1, v3, v11, v13}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v13, v11

    check-cast v13, Ljava/lang/Integer;

    const/high16 v11, 0x10000

    goto :goto_2

    :pswitch_2
    const/16 v3, 0x10

    sget-object v11, LVf/x0;->a:LVf/x0;

    const/16 v3, 0xf

    invoke-interface {v0, v1, v3, v11, v15}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v15, v11

    check-cast v15, Ljava/lang/String;

    const v11, 0x8000

    goto :goto_2

    :pswitch_3
    const/16 v3, 0xf

    sget-object v11, LVf/x0;->a:LVf/x0;

    const/16 v3, 0xe

    invoke-interface {v0, v1, v3, v11, v14}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v14, v11

    check-cast v14, Ljava/lang/String;

    or-int/lit16 v7, v7, 0x4000

    goto :goto_3

    :pswitch_4
    const/16 v3, 0xe

    sget-object v11, LVf/x0;->a:LVf/x0;

    const/16 v3, 0xd

    invoke-interface {v0, v1, v3, v11, v4}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit16 v7, v7, 0x2000

    goto :goto_3

    :pswitch_5
    const/16 v3, 0xd

    sget-object v11, LVf/x0;->a:LVf/x0;

    const/16 v3, 0xc

    invoke-interface {v0, v1, v3, v11, v5}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    or-int/lit16 v7, v7, 0x1000

    goto :goto_3

    :pswitch_6
    const/16 v3, 0xc

    invoke-interface {v0, v1, v8}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v26

    or-int/lit16 v7, v7, 0x800

    goto :goto_3

    :pswitch_7
    const/16 v3, 0xc

    invoke-interface {v0, v1, v9}, LUf/c;->w(LTf/e;I)Z

    move-result v28

    or-int/lit16 v7, v7, 0x400

    goto :goto_3

    :pswitch_8
    const/16 v3, 0xc

    invoke-interface {v0, v1, v10}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v25

    or-int/lit16 v7, v7, 0x200

    goto :goto_3

    :pswitch_9
    move v11, v3

    const/16 v3, 0xc

    invoke-interface {v0, v1, v11}, LUf/c;->o(LTf/e;I)J

    move-result-wide v30

    or-int/lit16 v7, v7, 0x100

    :goto_5
    move v3, v11

    goto :goto_4

    :pswitch_a
    move v11, v3

    const/4 v3, 0x7

    invoke-interface {v0, v1, v3}, LUf/c;->m(LTf/e;I)I

    move-result v29

    or-int/lit16 v7, v7, 0x80

    move/from16 v55, v11

    move v11, v3

    move/from16 v3, v55

    goto/16 :goto_1

    :pswitch_b
    move v11, v3

    sget-object v3, LVf/x0;->a:LVf/x0;

    const/4 v8, 0x6

    invoke-interface {v0, v1, v8, v3, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    or-int/lit8 v7, v7, 0x40

    :goto_6
    move v3, v11

    :goto_7
    const/16 v8, 0xb

    goto/16 :goto_4

    :pswitch_c
    move v11, v3

    const/4 v3, 0x5

    const/4 v8, 0x6

    invoke-interface {v0, v1, v3}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v24

    or-int/lit8 v7, v7, 0x20

    goto :goto_6

    :pswitch_d
    move v11, v3

    const/4 v3, 0x4

    const/4 v8, 0x6

    invoke-interface {v0, v1, v3}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v23

    or-int/lit8 v7, v7, 0x10

    goto :goto_6

    :pswitch_e
    move v11, v3

    const/4 v3, 0x3

    const/4 v8, 0x6

    invoke-interface {v0, v1, v3}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v22

    or-int/lit8 v7, v7, 0x8

    goto :goto_6

    :pswitch_f
    move v11, v3

    const/4 v3, 0x2

    const/4 v8, 0x6

    invoke-interface {v0, v1, v3}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit8 v7, v7, 0x4

    goto :goto_6

    :pswitch_10
    move v11, v3

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/4 v8, 0x6

    invoke-interface {v0, v1, v2}, LUf/c;->m(LTf/e;I)I

    move-result v27

    or-int/lit8 v7, v7, 0x2

    move v3, v11

    move/from16 v2, v27

    goto :goto_7

    :pswitch_11
    move v11, v3

    const/4 v3, 0x0

    const/4 v8, 0x6

    const/16 v27, 0x1

    invoke-interface {v0, v1, v3}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v20

    or-int/lit8 v7, v7, 0x1

    goto :goto_6

    :pswitch_12
    move v11, v3

    const/4 v3, 0x0

    const/16 v27, 0x1

    move/from16 v32, v3

    goto :goto_5

    :cond_1
    move/from16 v36, v2

    move-object/from16 v49, v4

    move-object/from16 v48, v5

    move-object/from16 v41, v6

    move-object/from16 v53, v12

    move-object/from16 v52, v13

    move-object/from16 v50, v14

    move-object/from16 v51, v15

    move-object/from16 v35, v20

    move-object/from16 v37, v21

    move-object/from16 v38, v22

    move-object/from16 v39, v23

    move-object/from16 v40, v24

    move-object/from16 v45, v25

    move-object/from16 v47, v26

    move/from16 v46, v28

    move/from16 v42, v29

    move-wide/from16 v43, v30

    goto/16 :goto_0

    :goto_8
    invoke-interface {v0, v1}, LUf/c;->c(LTf/e;)V

    new-instance v33, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;

    const/16 v54, 0x0

    invoke-direct/range {v33 .. v54}, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;LVf/t0;)V

    return-object v33

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_12
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
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$$serializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$$serializer;->descriptor:LVf/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$$serializer;->getDescriptor()LTf/e;

    move-result-object v0

    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;->write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;LUf/d;LTf/e;)V

    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$$serializer;->serialize(LUf/f;Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;)V

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
