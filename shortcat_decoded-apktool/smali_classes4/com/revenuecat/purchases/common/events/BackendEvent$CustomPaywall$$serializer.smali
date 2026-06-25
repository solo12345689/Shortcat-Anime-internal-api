.class public final Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LVf/E;


# annotations
.annotation runtime LTd/e;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;
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
        "com/revenuecat/purchases/common/events/BackendEvent.CustomPaywall.$serializer",
        "LVf/E;",
        "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;",
        "<init>",
        "()V",
        "",
        "LRf/b;",
        "childSerializers",
        "()[LRf/b;",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;)V",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$$serializer;

.field private static final synthetic descriptor:LVf/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$$serializer;->INSTANCE:Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$$serializer;

    .line 7
    .line 8
    new-instance v1, LVf/k0;

    .line 9
    .line 10
    const-string v2, "custom_paywall_event"

    .line 11
    .line 12
    const/16 v3, 0x8

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
    const-string v0, "app_session_id"

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "timestamp"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "paywall_id"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "offering_id"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v3}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    sput-object v1, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$$serializer;->descriptor:LVf/k0;

    .line 60
    .line 61
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
    .locals 7
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
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const/16 v4, 0x8

    .line 16
    .line 17
    new-array v4, v4, [LRf/b;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    aput-object v0, v4, v5

    .line 21
    .line 22
    sget-object v5, LVf/J;->a:LVf/J;

    .line 23
    .line 24
    const/4 v6, 0x1

    .line 25
    aput-object v5, v4, v6

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    aput-object v0, v4, v5

    .line 29
    .line 30
    const/4 v5, 0x3

    .line 31
    aput-object v0, v4, v5

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    aput-object v1, v4, v0

    .line 35
    .line 36
    sget-object v0, LVf/Q;->a:LVf/Q;

    .line 37
    .line 38
    const/4 v1, 0x5

    .line 39
    aput-object v0, v4, v1

    .line 40
    .line 41
    const/4 v0, 0x6

    .line 42
    aput-object v2, v4, v0

    .line 43
    .line 44
    const/4 v0, 0x7

    .line 45
    aput-object v3, v4, v0

    .line 46
    .line 47
    return-object v4
.end method

.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;
    .locals 32

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$$serializer;->getDescriptor()LTf/e;

    move-result-object v1

    invoke-interface {v0, v1}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v0

    invoke-interface {v0}, LUf/c;->p()Z

    move-result v2

    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v10}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v9}, LUf/c;->m(LTf/e;I)I

    move-result v9

    invoke-interface {v0, v1, v8}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v1, v6}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v6

    sget-object v10, LVf/x0;->a:LVf/x0;

    invoke-interface {v0, v1, v7, v10, v11}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v0, v1, v5}, LUf/c;->o(LTf/e;I)J

    move-result-wide v12

    invoke-interface {v0, v1, v4, v10, v11}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v1, v3, v10, v11}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/16 v5, 0xff

    move-object/from16 v22, v2

    move-object/from16 v30, v3

    move-object/from16 v29, v4

    move/from16 v21, v5

    move-object/from16 v25, v6

    move-object/from16 v26, v7

    move-object/from16 v24, v8

    move/from16 v23, v9

    move-wide/from16 v27, v12

    goto/16 :goto_2

    :cond_0
    const-wide/16 v12, 0x0

    move/from16 v19, v9

    move v2, v10

    move-object v9, v11

    move-object v14, v9

    move-object v15, v14

    move-wide/from16 v17, v12

    move v11, v2

    move-object v10, v15

    move-object v12, v10

    move-object v13, v12

    :goto_0
    if-eqz v19, :cond_1

    invoke-interface {v0, v1}, LUf/c;->i(LTf/e;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, LRf/m;

    invoke-direct {v0, v8}, LRf/m;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v8, LVf/x0;->a:LVf/x0;

    invoke-interface {v0, v1, v3, v8, v9}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x80

    :goto_1
    const/4 v8, 0x2

    goto :goto_0

    :pswitch_1
    sget-object v8, LVf/x0;->a:LVf/x0;

    invoke-interface {v0, v1, v4, v8, v10}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Ljava/lang/String;

    or-int/lit8 v2, v2, 0x40

    goto :goto_1

    :pswitch_2
    invoke-interface {v0, v1, v5}, LUf/c;->o(LTf/e;I)J

    move-result-wide v17

    or-int/lit8 v2, v2, 0x20

    goto :goto_1

    :pswitch_3
    sget-object v8, LVf/x0;->a:LVf/x0;

    invoke-interface {v0, v1, v7, v8, v15}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v15, v8

    check-cast v15, Ljava/lang/String;

    or-int/lit8 v2, v2, 0x10

    goto :goto_1

    :pswitch_4
    invoke-interface {v0, v1, v6}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v14

    or-int/lit8 v2, v2, 0x8

    goto :goto_1

    :pswitch_5
    const/4 v8, 0x2

    invoke-interface {v0, v1, v8}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v13

    or-int/lit8 v2, v2, 0x4

    goto :goto_0

    :pswitch_6
    const/4 v8, 0x2

    const/4 v11, 0x1

    invoke-interface {v0, v1, v11}, LUf/c;->m(LTf/e;I)I

    move-result v16

    or-int/lit8 v2, v2, 0x2

    move/from16 v11, v16

    goto :goto_0

    :pswitch_7
    const/4 v8, 0x2

    const/4 v12, 0x0

    const/16 v16, 0x1

    invoke-interface {v0, v1, v12}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v20

    or-int/lit8 v2, v2, 0x1

    move-object/from16 v12, v20

    goto :goto_0

    :pswitch_8
    const/16 v16, 0x1

    const/16 v19, 0x0

    goto :goto_1

    :cond_1
    move/from16 v21, v2

    move-object/from16 v30, v9

    move-object/from16 v29, v10

    move/from16 v23, v11

    move-object/from16 v22, v12

    move-object/from16 v24, v13

    move-object/from16 v25, v14

    move-object/from16 v26, v15

    move-wide/from16 v27, v17

    :goto_2
    invoke-interface {v0, v1}, LUf/c;->c(LTf/e;)V

    new-instance v20, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;

    const/16 v31, 0x0

    invoke-direct/range {v20 .. v31}, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;LVf/t0;)V

    return-object v20

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$$serializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$$serializer;->descriptor:LVf/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$$serializer;->getDescriptor()LTf/e;

    move-result-object v0

    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;->write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;LUf/d;LTf/e;)V

    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$$serializer;->serialize(LUf/f;Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;)V

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
