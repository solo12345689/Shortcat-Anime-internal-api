.class public final Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LVf/E;


# annotations
.annotation runtime LTd/e;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;
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
        "com/revenuecat/purchases/common/events/BackendEvent.Ad.$serializer",
        "LVf/E;",
        "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;",
        "<init>",
        "()V",
        "",
        "LRf/b;",
        "childSerializers",
        "()[LRf/b;",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;)V",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$$serializer;

.field private static final synthetic descriptor:LVf/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$$serializer;->INSTANCE:Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$$serializer;

    .line 7
    .line 8
    new-instance v1, LVf/k0;

    .line 9
    .line 10
    const-string v2, "ad"

    .line 11
    .line 12
    const/16 v3, 0x10

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
    const-string v0, "timestamp_ms"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "network_name"

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "mediator_name"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "ad_format"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "placement"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "ad_unit_id"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "impression_id"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "app_user_id"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "app_session_id"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "revenue_micros"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    const-string v0, "currency"

    .line 85
    .line 86
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    const-string v0, "precision"

    .line 90
    .line 91
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    const-string v0, "mediator_error_code"

    .line 95
    .line 96
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    sput-object v1, Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$$serializer;->descriptor:LVf/k0;

    .line 100
    .line 101
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
    .locals 13
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
    sget-object v2, LVf/Q;->a:LVf/Q;

    .line 6
    .line 7
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-static {v2}, LSf/a;->p(LRf/b;)LRf/b;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    const/16 v11, 0x10

    .line 40
    .line 41
    new-array v11, v11, [LRf/b;

    .line 42
    .line 43
    const/4 v12, 0x0

    .line 44
    aput-object v0, v11, v12

    .line 45
    .line 46
    const/4 v12, 0x1

    .line 47
    aput-object v1, v11, v12

    .line 48
    .line 49
    const/4 v1, 0x2

    .line 50
    aput-object v0, v11, v1

    .line 51
    .line 52
    const/4 v1, 0x3

    .line 53
    aput-object v2, v11, v1

    .line 54
    .line 55
    const/4 v1, 0x4

    .line 56
    aput-object v3, v11, v1

    .line 57
    .line 58
    const/4 v1, 0x5

    .line 59
    aput-object v0, v11, v1

    .line 60
    .line 61
    const/4 v1, 0x6

    .line 62
    aput-object v4, v11, v1

    .line 63
    .line 64
    const/4 v1, 0x7

    .line 65
    aput-object v5, v11, v1

    .line 66
    .line 67
    const/16 v1, 0x8

    .line 68
    .line 69
    aput-object v0, v11, v1

    .line 70
    .line 71
    const/16 v1, 0x9

    .line 72
    .line 73
    aput-object v6, v11, v1

    .line 74
    .line 75
    const/16 v1, 0xa

    .line 76
    .line 77
    aput-object v0, v11, v1

    .line 78
    .line 79
    const/16 v1, 0xb

    .line 80
    .line 81
    aput-object v0, v11, v1

    .line 82
    .line 83
    const/16 v0, 0xc

    .line 84
    .line 85
    aput-object v7, v11, v0

    .line 86
    .line 87
    const/16 v0, 0xd

    .line 88
    .line 89
    aput-object v8, v11, v0

    .line 90
    .line 91
    const/16 v0, 0xe

    .line 92
    .line 93
    aput-object v9, v11, v0

    .line 94
    .line 95
    const/16 v0, 0xf

    .line 96
    .line 97
    aput-object v10, v11, v0

    .line 98
    .line 99
    return-object v11
.end method

.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;
    .locals 49

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$$serializer;->getDescriptor()LTf/e;

    move-result-object v1

    invoke-interface {v0, v1}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v0

    invoke-interface {v0}, LUf/c;->p()Z

    move-result v2

    const/16 v7, 0xb

    const/16 v8, 0xa

    const/16 v9, 0x9

    const/4 v10, 0x7

    const/4 v11, 0x6

    const/4 v12, 0x5

    const/4 v13, 0x3

    const/16 v14, 0x8

    const/4 v15, 0x4

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v5}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v4}, LUf/c;->m(LTf/e;I)I

    move-result v4

    invoke-interface {v0, v1, v3}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v13}, LUf/c;->o(LTf/e;I)J

    move-result-wide v18

    sget-object v5, LVf/x0;->a:LVf/x0;

    invoke-interface {v0, v1, v15, v5, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v0, v1, v12}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v1, v11, v5, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v0, v1, v10, v5, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v14}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v1, v9, v5, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v0, v1, v8}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v1, v7}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v7

    sget-object v15, LVf/Q;->a:LVf/Q;

    move-object/from16 v20, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    const/16 v15, 0xd

    invoke-interface {v0, v1, v15, v5, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move-object/from16 v17, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v5, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v5, LVf/J;->a:LVf/J;

    move-object/from16 v16, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v5, v6}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const v5, 0xffff

    move-object/from16 v47, v2

    move-object/from16 v33, v3

    move/from16 v32, v4

    move/from16 v30, v5

    move-object/from16 v43, v7

    move-object/from16 v42, v8

    move-object/from16 v41, v9

    move-object/from16 v39, v10

    move-object/from16 v38, v11

    move-object/from16 v37, v12

    move-object/from16 v36, v13

    move-object/from16 v40, v14

    move-object/from16 v45, v15

    move-object/from16 v46, v16

    move-object/from16 v44, v17

    move-wide/from16 v34, v18

    move-object/from16 v31, v20

    goto/16 :goto_5

    :cond_0
    const-wide/16 v18, 0x0

    move/from16 v28, v4

    move v2, v5

    move-object v3, v6

    move-object v4, v3

    move-object v10, v4

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v15, v13

    move-object/from16 v21, v15

    move-object/from16 v23, v21

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-wide/from16 v26, v18

    move v6, v2

    move-object/from16 v5, v25

    move-object/from16 v18, v5

    move-object/from16 v19, v18

    :goto_0
    if-eqz v28, :cond_1

    invoke-interface {v0, v1}, LUf/c;->i(LTf/e;)I

    move-result v14

    packed-switch v14, :pswitch_data_0

    new-instance v0, LRf/m;

    invoke-direct {v0, v14}, LRf/m;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v14, LVf/J;->a:LVf/J;

    const/16 v9, 0xf

    invoke-interface {v0, v1, v9, v14, v10}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    const v14, 0x8000

    or-int/2addr v6, v14

    :goto_1
    const/16 v9, 0x9

    :goto_2
    const/16 v14, 0x8

    goto :goto_0

    :pswitch_1
    const/16 v9, 0xf

    sget-object v14, LVf/x0;->a:LVf/x0;

    const/16 v9, 0xe

    invoke-interface {v0, v1, v9, v14, v11}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x4000

    goto :goto_1

    :pswitch_2
    const/16 v9, 0xe

    sget-object v14, LVf/x0;->a:LVf/x0;

    const/16 v9, 0xd

    invoke-interface {v0, v1, v9, v14, v12}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x2000

    goto :goto_1

    :pswitch_3
    const/16 v9, 0xd

    sget-object v14, LVf/Q;->a:LVf/Q;

    const/16 v9, 0xc

    invoke-interface {v0, v1, v9, v14, v15}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Ljava/lang/Long;

    or-int/lit16 v6, v6, 0x1000

    goto :goto_1

    :pswitch_4
    const/16 v9, 0xc

    invoke-interface {v0, v1, v7}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v25

    or-int/lit16 v6, v6, 0x800

    goto :goto_1

    :pswitch_5
    const/16 v9, 0xc

    invoke-interface {v0, v1, v8}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v24

    or-int/lit16 v6, v6, 0x400

    goto :goto_1

    :pswitch_6
    const/16 v9, 0xc

    sget-object v14, LVf/x0;->a:LVf/x0;

    const/16 v7, 0x9

    invoke-interface {v0, v1, v7, v14, v13}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x200

    move v9, v7

    const/16 v7, 0xb

    goto :goto_2

    :pswitch_7
    move v7, v9

    const/16 v9, 0xc

    const/16 v14, 0x8

    invoke-interface {v0, v1, v14}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v23

    or-int/lit16 v6, v6, 0x100

    move v9, v7

    const/16 v7, 0xb

    goto/16 :goto_0

    :pswitch_8
    const/16 v9, 0xc

    const/16 v14, 0x8

    sget-object v7, LVf/x0;->a:LVf/x0;

    const/4 v8, 0x7

    invoke-interface {v0, v1, v8, v7, v3}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x80

    :goto_3
    const/16 v7, 0xb

    const/16 v8, 0xa

    :goto_4
    const/16 v9, 0x9

    goto/16 :goto_0

    :pswitch_9
    const/4 v8, 0x7

    const/16 v9, 0xc

    const/16 v14, 0x8

    sget-object v7, LVf/x0;->a:LVf/x0;

    const/4 v8, 0x6

    invoke-interface {v0, v1, v8, v7, v4}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit8 v6, v6, 0x40

    goto :goto_3

    :pswitch_a
    const/4 v7, 0x5

    const/4 v8, 0x6

    const/16 v9, 0xc

    const/16 v14, 0x8

    invoke-interface {v0, v1, v7}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit8 v6, v6, 0x20

    goto :goto_3

    :pswitch_b
    const/4 v8, 0x6

    const/16 v9, 0xc

    const/16 v14, 0x8

    sget-object v7, LVf/x0;->a:LVf/x0;

    const/4 v8, 0x4

    invoke-interface {v0, v1, v8, v7, v5}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    or-int/lit8 v6, v6, 0x10

    goto :goto_3

    :pswitch_c
    const/4 v7, 0x3

    const/4 v8, 0x4

    const/16 v9, 0xc

    const/16 v14, 0x8

    invoke-interface {v0, v1, v7}, LUf/c;->o(LTf/e;I)J

    move-result-wide v26

    or-int/lit8 v6, v6, 0x8

    goto :goto_3

    :pswitch_d
    const/4 v7, 0x2

    const/4 v8, 0x4

    const/16 v9, 0xc

    const/16 v14, 0x8

    invoke-interface {v0, v1, v7}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit8 v6, v6, 0x4

    goto :goto_3

    :pswitch_e
    const/4 v2, 0x1

    const/4 v7, 0x2

    const/4 v8, 0x4

    const/16 v9, 0xc

    const/16 v14, 0x8

    invoke-interface {v0, v1, v2}, LUf/c;->m(LTf/e;I)I

    move-result v22

    or-int/lit8 v6, v6, 0x2

    move/from16 v2, v22

    goto :goto_3

    :pswitch_f
    const/4 v7, 0x0

    const/4 v8, 0x4

    const/16 v9, 0xc

    const/16 v14, 0x8

    const/16 v22, 0x1

    invoke-interface {v0, v1, v7}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit8 v6, v6, 0x1

    goto :goto_3

    :pswitch_10
    const/4 v7, 0x0

    const/16 v9, 0xc

    const/16 v14, 0x8

    const/16 v22, 0x1

    move/from16 v28, v7

    const/16 v7, 0xb

    goto :goto_4

    :cond_1
    move/from16 v32, v2

    move-object/from16 v39, v3

    move-object/from16 v38, v4

    move-object/from16 v36, v5

    move/from16 v30, v6

    move-object/from16 v47, v10

    move-object/from16 v46, v11

    move-object/from16 v45, v12

    move-object/from16 v41, v13

    move-object/from16 v44, v15

    move-object/from16 v31, v18

    move-object/from16 v33, v19

    move-object/from16 v37, v21

    move-object/from16 v40, v23

    move-object/from16 v42, v24

    move-object/from16 v43, v25

    move-wide/from16 v34, v26

    :goto_5
    invoke-interface {v0, v1}, LUf/c;->c(LTf/e;)V

    new-instance v29, Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;

    const/16 v48, 0x0

    invoke-direct/range {v29 .. v48}, Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;-><init>(ILjava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LVf/t0;)V

    return-object v29

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$$serializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$$serializer;->descriptor:LVf/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$$serializer;->getDescriptor()LTf/e;

    move-result-object v0

    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;->write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;LUf/d;LTf/e;)V

    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$$serializer;->serialize(LUf/f;Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;)V

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
