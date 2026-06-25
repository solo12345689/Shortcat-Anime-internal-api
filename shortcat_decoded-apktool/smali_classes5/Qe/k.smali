.class public final LQe/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQe/k$a;
    }
.end annotation


# static fields
.field public static final b:LQe/k$a;


# instance fields
.field private final a:Lmf/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LQe/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LQe/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LQe/k;->b:LQe/k$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lpf/n;Lye/H;Lmf/o;LQe/o;LQe/h;LKe/j;Lye/M;Lmf/w;LGe/c;Lmf/m;Lrf/p;Ltf/a;)V
    .locals 21

    move-object/from16 v1, p1

    const-string v0, "storageManager"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleDescriptor"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    move-object/from16 v3, p3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classDataFinder"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationAndConstantLoader"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageFragmentProvider"

    move-object/from16 v6, p6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    move-object/from16 v12, p7

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    move-object/from16 v8, p8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupTracker"

    move-object/from16 v9, p9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contractDeserializer"

    move-object/from16 v13, p10

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v7, p11

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAttributeTranslators"

    move-object/from16 v10, p12

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-interface {v2}, Lye/H;->n()Lve/i;

    move-result-object v0

    instance-of v11, v0, Lxe/k;

    if-eqz v11, :cond_0

    check-cast v0, Lxe/k;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    new-instance v11, Lmf/n;

    .line 4
    sget-object v7, Lmf/B$a;->a:Lmf/B$a;

    sget-object v10, LQe/p;->a:LQe/p;

    move-object v14, v0

    move-object v0, v11

    .line 5
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v11

    if-eqz v14, :cond_1

    .line 6
    invoke-virtual {v14}, Lxe/k;->M0()Lxe/u;

    move-result-object v15

    if-eqz v15, :cond_1

    goto :goto_1

    :cond_1
    sget-object v15, LAe/a$a;->a:LAe/a$a;

    :goto_1
    if-eqz v14, :cond_2

    .line 7
    invoke-virtual {v14}, Lxe/k;->M0()Lxe/u;

    move-result-object v14

    if-eqz v14, :cond_2

    goto :goto_2

    :cond_2
    sget-object v14, LAe/c$b;->a:LAe/c$b;

    .line 8
    :goto_2
    sget-object v16, LWe/h;->a:LWe/h;

    invoke-virtual/range {v16 .. v16}, LWe/h;->a()LZe/g;

    move-result-object v16

    move-object/from16 v17, v0

    .line 9
    new-instance v0, Lhf/b;

    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lhf/b;-><init>(Lpf/n;Ljava/lang/Iterable;)V

    .line 10
    invoke-virtual/range {p12 .. p12}, Ltf/a;->a()Ljava/util/List;

    move-result-object v19

    .line 11
    sget-object v20, Lmf/z;->a:Lmf/z;

    move-object v2, v15

    move-object v15, v14

    move-object v14, v2

    move-object/from16 v2, p2

    move-object/from16 v18, v0

    move-object/from16 v0, v17

    move-object/from16 v17, p11

    .line 12
    invoke-direct/range {v0 .. v20}, Lmf/n;-><init>(Lpf/n;Lye/H;Lmf/o;Lmf/j;Lmf/e;Lye/O;Lmf/B;Lmf/w;LGe/c;Lmf/x;Ljava/lang/Iterable;Lye/M;Lmf/m;LAe/a;LAe/c;LZe/g;Lrf/p;Lhf/a;Ljava/util/List;Lmf/v;)V

    move-object v1, v0

    move-object/from16 v0, p0

    iput-object v1, v0, LQe/k;->a:Lmf/n;

    return-void
.end method


# virtual methods
.method public final a()Lmf/n;
    .locals 1

    .line 1
    iget-object v0, p0, LQe/k;->a:Lmf/n;

    .line 2
    .line 3
    return-object v0
.end method
