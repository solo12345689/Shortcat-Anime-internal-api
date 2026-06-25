.class public final LKe/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lpf/n;

.field private final b:LHe/u;

.field private final c:LQe/v;

.field private final d:LQe/n;

.field private final e:LIe/o;

.field private final f:Lmf/w;

.field private final g:LIe/j;

.field private final h:LIe/i;

.field private final i:Lhf/a;

.field private final j:LNe/b;

.field private final k:LKe/n;

.field private final l:LQe/D;

.field private final m:Lye/k0;

.field private final n:LGe/c;

.field private final o:Lye/H;

.field private final p:Lve/n;

.field private final q:LHe/d;

.field private final r:LPe/m0;

.field private final s:LHe/v;

.field private final t:LKe/e;

.field private final u:Lrf/p;

.field private final v:LHe/D;

.field private final w:LHe/A;

.field private final x:Lgf/f;


# direct methods
.method public constructor <init>(Lpf/n;LHe/u;LQe/v;LQe/n;LIe/o;Lmf/w;LIe/j;LIe/i;Lhf/a;LNe/b;LKe/n;LQe/D;Lye/k0;LGe/c;Lye/H;Lve/n;LHe/d;LPe/m0;LHe/v;LKe/e;Lrf/p;LHe/D;LHe/A;Lgf/f;)V
    .locals 16

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    const-string v0, "storageManager"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializedDescriptorResolver"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signaturePropagator"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaResolverCache"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaPropertyInitializerEvaluator"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samConversionResolver"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceElementFactory"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleClassResolver"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packagePartProvider"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supertypeLoopChecker"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupTracker"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reflectionTypes"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationTypeQualifierResolver"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signatureEnhancement"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaClassesTracker"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v15, p21

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaTypeEnhancementState"

    move-object/from16 v15, p22

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaModuleResolver"

    move-object/from16 v15, p23

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syntheticPartsProvider"

    move-object/from16 v15, p24

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 2
    iput-object v1, v0, LKe/d;->a:Lpf/n;

    .line 3
    iput-object v2, v0, LKe/d;->b:LHe/u;

    .line 4
    iput-object v3, v0, LKe/d;->c:LQe/v;

    .line 5
    iput-object v4, v0, LKe/d;->d:LQe/n;

    .line 6
    iput-object v5, v0, LKe/d;->e:LIe/o;

    .line 7
    iput-object v6, v0, LKe/d;->f:Lmf/w;

    .line 8
    iput-object v7, v0, LKe/d;->g:LIe/j;

    .line 9
    iput-object v8, v0, LKe/d;->h:LIe/i;

    .line 10
    iput-object v9, v0, LKe/d;->i:Lhf/a;

    .line 11
    iput-object v10, v0, LKe/d;->j:LNe/b;

    .line 12
    iput-object v11, v0, LKe/d;->k:LKe/n;

    .line 13
    iput-object v12, v0, LKe/d;->l:LQe/D;

    .line 14
    iput-object v13, v0, LKe/d;->m:Lye/k0;

    .line 15
    iput-object v14, v0, LKe/d;->n:LGe/c;

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, LKe/d;->o:Lye/H;

    move-object/from16 v1, p16

    .line 17
    iput-object v1, v0, LKe/d;->p:Lve/n;

    move-object/from16 v1, p17

    .line 18
    iput-object v1, v0, LKe/d;->q:LHe/d;

    move-object/from16 v1, p18

    .line 19
    iput-object v1, v0, LKe/d;->r:LPe/m0;

    move-object/from16 v1, p19

    .line 20
    iput-object v1, v0, LKe/d;->s:LHe/v;

    move-object/from16 v1, p20

    .line 21
    iput-object v1, v0, LKe/d;->t:LKe/e;

    move-object/from16 v1, p21

    .line 22
    iput-object v1, v0, LKe/d;->u:Lrf/p;

    move-object/from16 v1, p22

    .line 23
    iput-object v1, v0, LKe/d;->v:LHe/D;

    move-object/from16 v1, p23

    .line 24
    iput-object v1, v0, LKe/d;->w:LHe/A;

    .line 25
    iput-object v15, v0, LKe/d;->x:Lgf/f;

    return-void
.end method

.method public synthetic constructor <init>(Lpf/n;LHe/u;LQe/v;LQe/n;LIe/o;Lmf/w;LIe/j;LIe/i;Lhf/a;LNe/b;LKe/n;LQe/D;Lye/k0;LGe/c;Lye/H;Lve/n;LHe/d;LPe/m0;LHe/v;LKe/e;Lrf/p;LHe/D;LHe/A;Lgf/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 26

    const/high16 v0, 0x800000

    and-int v0, p25, v0

    if-eqz v0, :cond_0

    .line 26
    sget-object v0, Lgf/f;->a:Lgf/f$a;

    invoke-virtual {v0}, Lgf/f$a;->a()Lgf/a;

    move-result-object v0

    move-object/from16 v25, v0

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    goto :goto_1

    :cond_0
    move-object/from16 v25, p24

    goto :goto_0

    .line 27
    :goto_1
    invoke-direct/range {v1 .. v25}, LKe/d;-><init>(Lpf/n;LHe/u;LQe/v;LQe/n;LIe/o;Lmf/w;LIe/j;LIe/i;Lhf/a;LNe/b;LKe/n;LQe/D;Lye/k0;LGe/c;Lye/H;Lve/n;LHe/d;LPe/m0;LHe/v;LKe/e;Lrf/p;LHe/D;LHe/A;Lgf/f;)V

    return-void
.end method


# virtual methods
.method public final a()LHe/d;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->q:LHe/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LQe/n;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->d:LQe/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lmf/w;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->f:Lmf/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LHe/u;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->b:LHe/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()LHe/v;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->s:LHe/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()LHe/A;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->w:LHe/A;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()LIe/i;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->h:LIe/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()LIe/j;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->g:LIe/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()LHe/D;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->v:LHe/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()LQe/v;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->c:LQe/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Lrf/p;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->u:Lrf/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()LGe/c;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->n:LGe/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Lye/H;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->o:Lye/H;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()LKe/n;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->k:LKe/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()LQe/D;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->l:LQe/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Lve/n;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->p:Lve/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()LKe/e;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->t:LKe/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()LPe/m0;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->r:LPe/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()LIe/o;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->e:LIe/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()LNe/b;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->j:LNe/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Lpf/n;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->a:Lpf/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Lye/k0;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->m:Lye/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()Lgf/f;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/d;->x:Lgf/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x(LIe/j;)LKe/d;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "javaResolverCache"

    .line 4
    .line 5
    move-object/from16 v9, p1

    .line 6
    .line 7
    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, LKe/d;

    .line 11
    .line 12
    iget-object v3, v0, LKe/d;->a:Lpf/n;

    .line 13
    .line 14
    iget-object v4, v0, LKe/d;->b:LHe/u;

    .line 15
    .line 16
    iget-object v5, v0, LKe/d;->c:LQe/v;

    .line 17
    .line 18
    iget-object v6, v0, LKe/d;->d:LQe/n;

    .line 19
    .line 20
    iget-object v7, v0, LKe/d;->e:LIe/o;

    .line 21
    .line 22
    iget-object v8, v0, LKe/d;->f:Lmf/w;

    .line 23
    .line 24
    iget-object v10, v0, LKe/d;->h:LIe/i;

    .line 25
    .line 26
    iget-object v11, v0, LKe/d;->i:Lhf/a;

    .line 27
    .line 28
    iget-object v12, v0, LKe/d;->j:LNe/b;

    .line 29
    .line 30
    iget-object v13, v0, LKe/d;->k:LKe/n;

    .line 31
    .line 32
    iget-object v14, v0, LKe/d;->l:LQe/D;

    .line 33
    .line 34
    iget-object v15, v0, LKe/d;->m:Lye/k0;

    .line 35
    .line 36
    iget-object v1, v0, LKe/d;->n:LGe/c;

    .line 37
    .line 38
    move-object/from16 v16, v1

    .line 39
    .line 40
    iget-object v1, v0, LKe/d;->o:Lye/H;

    .line 41
    .line 42
    move-object/from16 v17, v1

    .line 43
    .line 44
    iget-object v1, v0, LKe/d;->p:Lve/n;

    .line 45
    .line 46
    move-object/from16 v18, v1

    .line 47
    .line 48
    iget-object v1, v0, LKe/d;->q:LHe/d;

    .line 49
    .line 50
    move-object/from16 v19, v1

    .line 51
    .line 52
    iget-object v1, v0, LKe/d;->r:LPe/m0;

    .line 53
    .line 54
    move-object/from16 v20, v1

    .line 55
    .line 56
    iget-object v1, v0, LKe/d;->s:LHe/v;

    .line 57
    .line 58
    move-object/from16 v21, v1

    .line 59
    .line 60
    iget-object v1, v0, LKe/d;->t:LKe/e;

    .line 61
    .line 62
    move-object/from16 v22, v1

    .line 63
    .line 64
    iget-object v1, v0, LKe/d;->u:Lrf/p;

    .line 65
    .line 66
    move-object/from16 v23, v1

    .line 67
    .line 68
    iget-object v1, v0, LKe/d;->v:LHe/D;

    .line 69
    .line 70
    move-object/from16 v24, v1

    .line 71
    .line 72
    iget-object v1, v0, LKe/d;->w:LHe/A;

    .line 73
    .line 74
    const/high16 v27, 0x800000

    .line 75
    .line 76
    const/16 v28, 0x0

    .line 77
    .line 78
    const/16 v26, 0x0

    .line 79
    .line 80
    move-object/from16 v25, v1

    .line 81
    .line 82
    invoke-direct/range {v2 .. v28}, LKe/d;-><init>(Lpf/n;LHe/u;LQe/v;LQe/n;LIe/o;Lmf/w;LIe/j;LIe/i;Lhf/a;LNe/b;LKe/n;LQe/D;Lye/k0;LGe/c;Lye/H;Lve/n;LHe/d;LPe/m0;LHe/v;LKe/e;Lrf/p;LHe/D;LHe/A;Lgf/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 83
    .line 84
    .line 85
    return-object v2
.end method
