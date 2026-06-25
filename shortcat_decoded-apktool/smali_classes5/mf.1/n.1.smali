.class public final Lmf/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lpf/n;

.field private final b:Lye/H;

.field private final c:Lmf/o;

.field private final d:Lmf/j;

.field private final e:Lmf/e;

.field private final f:Lye/O;

.field private final g:Lmf/B;

.field private final h:Lmf/w;

.field private final i:LGe/c;

.field private final j:Lmf/x;

.field private final k:Ljava/lang/Iterable;

.field private final l:Lye/M;

.field private final m:Lmf/m;

.field private final n:LAe/a;

.field private final o:LAe/c;

.field private final p:LZe/g;

.field private final q:Lrf/p;

.field private final r:Lhf/a;

.field private final s:Ljava/util/List;

.field private final t:Lmf/v;

.field private final u:Lmf/l;


# direct methods
.method public constructor <init>(Lpf/n;Lye/H;Lmf/o;Lmf/j;Lmf/e;Lye/O;Lmf/B;Lmf/w;LGe/c;Lmf/x;Ljava/lang/Iterable;Lye/M;Lmf/m;LAe/a;LAe/c;LZe/g;Lrf/p;Lhf/a;Ljava/util/List;Lmf/v;)V
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

    const-string v0, "moduleDescriptor"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classDataFinder"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationAndConstantLoader"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageFragmentProvider"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localClassifierTypeSettings"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupTracker"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flexibleTypeDeserializer"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fictitiousClassDescriptorFactories"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contractDeserializer"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalClassPartsProvider"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformDependentDeclarationFilter"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extensionRegistryLite"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samConversionResolver"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAttributeTranslators"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumEntriesDeserializationSupport"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 2
    iput-object v1, v0, Lmf/n;->a:Lpf/n;

    .line 3
    iput-object v2, v0, Lmf/n;->b:Lye/H;

    .line 4
    iput-object v3, v0, Lmf/n;->c:Lmf/o;

    .line 5
    iput-object v4, v0, Lmf/n;->d:Lmf/j;

    .line 6
    iput-object v5, v0, Lmf/n;->e:Lmf/e;

    .line 7
    iput-object v6, v0, Lmf/n;->f:Lye/O;

    .line 8
    iput-object v7, v0, Lmf/n;->g:Lmf/B;

    .line 9
    iput-object v8, v0, Lmf/n;->h:Lmf/w;

    .line 10
    iput-object v9, v0, Lmf/n;->i:LGe/c;

    .line 11
    iput-object v10, v0, Lmf/n;->j:Lmf/x;

    .line 12
    iput-object v11, v0, Lmf/n;->k:Ljava/lang/Iterable;

    .line 13
    iput-object v12, v0, Lmf/n;->l:Lye/M;

    .line 14
    iput-object v13, v0, Lmf/n;->m:Lmf/m;

    .line 15
    iput-object v14, v0, Lmf/n;->n:LAe/a;

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, Lmf/n;->o:LAe/c;

    move-object/from16 v1, p16

    .line 17
    iput-object v1, v0, Lmf/n;->p:LZe/g;

    move-object/from16 v1, p17

    .line 18
    iput-object v1, v0, Lmf/n;->q:Lrf/p;

    move-object/from16 v1, p18

    .line 19
    iput-object v1, v0, Lmf/n;->r:Lhf/a;

    move-object/from16 v1, p19

    .line 20
    iput-object v1, v0, Lmf/n;->s:Ljava/util/List;

    .line 21
    iput-object v15, v0, Lmf/n;->t:Lmf/v;

    .line 22
    new-instance v1, Lmf/l;

    invoke-direct {v1, v0}, Lmf/l;-><init>(Lmf/n;)V

    iput-object v1, v0, Lmf/n;->u:Lmf/l;

    return-void
.end method

.method public synthetic constructor <init>(Lpf/n;Lye/H;Lmf/o;Lmf/j;Lmf/e;Lye/O;Lmf/B;Lmf/w;LGe/c;Lmf/x;Ljava/lang/Iterable;Lye/M;Lmf/m;LAe/a;LAe/c;LZe/g;Lrf/p;Lhf/a;Ljava/util/List;Lmf/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p21

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_0

    .line 23
    sget-object v1, LAe/a$a;->a:LAe/a$a;

    move-object/from16 v16, v1

    goto :goto_0

    :cond_0
    move-object/from16 v16, p14

    :goto_0
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_1

    .line 24
    sget-object v1, LAe/c$a;->a:LAe/c$a;

    move-object/from16 v17, v1

    goto :goto_1

    :cond_1
    move-object/from16 v17, p15

    :goto_1
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_2

    .line 25
    sget-object v1, Lrf/p;->b:Lrf/p$a;

    invoke-virtual {v1}, Lrf/p$a;->a()Lrf/q;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_2

    :cond_2
    move-object/from16 v19, p17

    :goto_2
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_3

    .line 26
    sget-object v1, Lqf/x;->a:Lqf/x;

    invoke-static {v1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v21, v1

    goto :goto_3

    :cond_3
    move-object/from16 v21, p19

    :goto_3
    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_4

    .line 27
    sget-object v0, Lmf/v$a;->a:Lmf/v$a;

    move-object/from16 v22, v0

    :goto_4
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v18, p16

    move-object/from16 v20, p18

    goto :goto_5

    :cond_4
    move-object/from16 v22, p20

    goto :goto_4

    .line 28
    :goto_5
    invoke-direct/range {v2 .. v22}, Lmf/n;-><init>(Lpf/n;Lye/H;Lmf/o;Lmf/j;Lmf/e;Lye/O;Lmf/B;Lmf/w;LGe/c;Lmf/x;Ljava/lang/Iterable;Lye/M;Lmf/m;LAe/a;LAe/c;LZe/g;Lrf/p;Lhf/a;Ljava/util/List;Lmf/v;)V

    return-void
.end method


# virtual methods
.method public final a(Lye/N;LUe/d;LUe/h;LUe/i;LUe/a;Lof/s;)Lmf/p;
    .locals 11

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "typeTable"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "versionRequirementTable"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "metadataVersion"

    .line 22
    .line 23
    move-object/from16 v7, p5

    .line 24
    .line 25
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lmf/p;

    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v10

    .line 35
    move-object v2, p0

    .line 36
    move-object v4, p1

    .line 37
    move-object v3, p2

    .line 38
    move-object v5, p3

    .line 39
    move-object v6, p4

    .line 40
    move-object/from16 v8, p6

    .line 41
    .line 42
    invoke-direct/range {v1 .. v10}, Lmf/p;-><init>(Lmf/n;LUe/d;Lye/m;LUe/h;LUe/i;LUe/a;Lof/s;Lmf/X;Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    return-object v1
.end method

.method public final b(LXe/b;)Lye/e;
    .locals 3

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmf/n;->u:Lmf/l;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-static {v0, p1, v1, v2, v1}, Lmf/l;->f(Lmf/l;LXe/b;Lmf/i;ILjava/lang/Object;)Lye/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final c()LAe/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->n:LAe/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lmf/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->e:Lmf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lmf/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->d:Lmf/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lmf/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->u:Lmf/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lmf/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->c:Lmf/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lmf/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->m:Lmf/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Lmf/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->t:Lmf/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Lmf/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->h:Lmf/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()LZe/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->p:LZe/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ljava/lang/Iterable;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->k:Ljava/lang/Iterable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Lmf/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->j:Lmf/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Lrf/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->q:Lrf/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Lmf/B;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->g:Lmf/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()LGe/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->i:LGe/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Lye/H;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->b:Lye/H;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Lye/M;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->l:Lye/M;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Lye/O;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->f:Lye/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()LAe/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->o:LAe/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Lpf/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->a:Lpf/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/n;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
