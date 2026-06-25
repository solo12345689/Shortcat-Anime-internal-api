.class public Lo4/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private final a:Landroidx/work/impl/x;

.field private final b:Landroidx/work/impl/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "EnqueueRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Li4/i;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lo4/c;->c:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/x;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/work/impl/o;

    invoke-direct {v0}, Landroidx/work/impl/o;-><init>()V

    invoke-direct {p0, p1, v0}, Lo4/c;-><init>(Landroidx/work/impl/x;Landroidx/work/impl/o;)V

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/x;Landroidx/work/impl/o;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lo4/c;->a:Landroidx/work/impl/x;

    .line 4
    iput-object p2, p0, Lo4/c;->b:Landroidx/work/impl/o;

    return-void
.end method

.method private static b(Landroidx/work/impl/x;)Z
    .locals 5

    .line 1
    invoke-static {p0}, Landroidx/work/impl/x;->l(Landroidx/work/impl/x;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/work/impl/x;->g()Landroidx/work/impl/E;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Landroidx/work/impl/x;->f()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    new-array v3, v3, [Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {v0, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, [Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/work/impl/x;->d()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {p0}, Landroidx/work/impl/x;->b()Li4/d;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-static {v1, v2, v0, v3, v4}, Lo4/c;->c(Landroidx/work/impl/E;Ljava/util/List;[Ljava/lang/String;Ljava/lang/String;Li4/d;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0}, Landroidx/work/impl/x;->k()V

    .line 35
    .line 36
    .line 37
    return v0
.end method

.method private static c(Landroidx/work/impl/E;Ljava/util/List;[Ljava/lang/String;Ljava/lang/String;Li4/d;)Z
    .locals 18

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 2
    invoke-virtual/range {p0 .. p0}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    move-result-object v5

    const/4 v7, 0x0

    if-eqz v0, :cond_0

    .line 3
    array-length v8, v0

    if-lez v8, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    move v8, v7

    :goto_0
    if-eqz v8, :cond_5

    .line 4
    array-length v9, v0

    move v10, v7

    move v12, v10

    move v13, v12

    const/4 v11, 0x1

    :goto_1
    if-ge v10, v9, :cond_6

    aget-object v14, v0, v10

    .line 5
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->J()Ln4/v;

    move-result-object v15

    invoke-interface {v15, v14}, Ln4/v;->h(Ljava/lang/String;)Ln4/u;

    move-result-object v15

    if-nez v15, :cond_1

    .line 6
    invoke-static {}, Li4/i;->e()Li4/i;

    move-result-object v0

    sget-object v1, Lo4/c;->c:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Prerequisite "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " doesn\'t exist; not enqueuing"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Li4/i;->c(Ljava/lang/String;Ljava/lang/String;)V

    return v7

    .line 7
    :cond_1
    iget-object v14, v15, Ln4/u;->b:Li4/s;

    .line 8
    sget-object v15, Li4/s;->c:Li4/s;

    if-ne v14, v15, :cond_2

    const/4 v15, 0x1

    goto :goto_2

    :cond_2
    move v15, v7

    :goto_2
    and-int/2addr v11, v15

    .line 9
    sget-object v15, Li4/s;->d:Li4/s;

    if-ne v14, v15, :cond_3

    const/4 v13, 0x1

    goto :goto_3

    .line 10
    :cond_3
    sget-object v15, Li4/s;->f:Li4/s;

    if-ne v14, v15, :cond_4

    const/4 v12, 0x1

    :cond_4
    :goto_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_5
    move v12, v7

    move v13, v12

    const/4 v11, 0x1

    .line 11
    :cond_6
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_16

    if-nez v8, :cond_16

    .line 12
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->J()Ln4/v;

    move-result-object v10

    invoke-interface {v10, v1}, Ln4/v;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    .line 13
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_16

    .line 14
    sget-object v14, Li4/d;->c:Li4/d;

    if-eq v2, v14, :cond_7

    sget-object v14, Li4/d;->d:Li4/d;

    if-ne v2, v14, :cond_8

    :cond_7
    move-object/from16 v14, p0

    goto :goto_5

    .line 15
    :cond_8
    sget-object v14, Li4/d;->b:Li4/d;

    if-ne v2, v14, :cond_b

    .line 16
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ln4/u$b;

    .line 17
    iget-object v14, v14, Ln4/u$b;->b:Li4/s;

    sget-object v15, Li4/s;->a:Li4/s;

    if-eq v14, v15, :cond_a

    sget-object v15, Li4/s;->b:Li4/s;

    if-ne v14, v15, :cond_9

    :cond_a
    return v7

    :cond_b
    move-object/from16 v14, p0

    .line 18
    invoke-static {v1, v14, v7}, Lo4/b;->c(Ljava/lang/String;Landroidx/work/impl/E;Z)Lo4/b;

    move-result-object v2

    invoke-virtual {v2}, Lo4/b;->run()V

    .line 19
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->J()Ln4/v;

    move-result-object v2

    .line 20
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ln4/u$b;

    .line 21
    iget-object v15, v15, Ln4/u$b;->a:Ljava/lang/String;

    invoke-interface {v2, v15}, Ln4/v;->a(Ljava/lang/String;)V

    goto :goto_4

    :cond_c
    move-object/from16 v17, v5

    const/4 v6, 0x1

    goto/16 :goto_c

    .line 22
    :goto_5
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->E()Ln4/b;

    move-result-object v8

    .line 23
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 24
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_11

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v6, v16

    check-cast v6, Ln4/u$b;

    .line 25
    iget-object v7, v6, Ln4/u$b;->a:Ljava/lang/String;

    invoke-interface {v8, v7}, Ln4/b;->d(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_10

    .line 26
    iget-object v7, v6, Ln4/u$b;->b:Li4/s;

    move-object/from16 v17, v5

    sget-object v5, Li4/s;->c:Li4/s;

    if-ne v7, v5, :cond_d

    const/4 v5, 0x1

    goto :goto_7

    :cond_d
    const/4 v5, 0x0

    :goto_7
    and-int/2addr v5, v11

    .line 27
    sget-object v11, Li4/s;->d:Li4/s;

    if-ne v7, v11, :cond_e

    const/4 v13, 0x1

    goto :goto_8

    .line 28
    :cond_e
    sget-object v11, Li4/s;->f:Li4/s;

    if-ne v7, v11, :cond_f

    const/4 v12, 0x1

    .line 29
    :cond_f
    :goto_8
    iget-object v6, v6, Ln4/u$b;->a:Ljava/lang/String;

    invoke-interface {v15, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v11, v5

    goto :goto_9

    :cond_10
    move-object/from16 v17, v5

    :goto_9
    move-object/from16 v5, v17

    const/4 v7, 0x0

    goto :goto_6

    :cond_11
    move-object/from16 v17, v5

    .line 30
    sget-object v5, Li4/d;->d:Li4/d;

    if-ne v2, v5, :cond_14

    if-nez v12, :cond_12

    if-eqz v13, :cond_14

    .line 31
    :cond_12
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->J()Ln4/v;

    move-result-object v2

    .line 32
    invoke-interface {v2, v1}, Ln4/v;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 33
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln4/u$b;

    .line 34
    iget-object v6, v6, Ln4/u$b;->a:Ljava/lang/String;

    invoke-interface {v2, v6}, Ln4/v;->a(Ljava/lang/String;)V

    goto :goto_a

    .line 35
    :cond_13
    sget-object v15, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 36
    :cond_14
    invoke-interface {v15, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 37
    array-length v2, v0

    if-lez v2, :cond_15

    const/4 v8, 0x1

    goto :goto_b

    :cond_15
    const/4 v8, 0x0

    :goto_b
    const/4 v6, 0x0

    goto :goto_c

    :cond_16
    move-object/from16 v14, p0

    move-object/from16 v17, v5

    goto :goto_b

    .line 38
    :goto_c
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li4/u;

    .line 39
    invoke-virtual {v5}, Li4/u;->d()Ln4/u;

    move-result-object v7

    if-eqz v8, :cond_19

    if-nez v11, :cond_19

    if-eqz v13, :cond_17

    .line 40
    sget-object v10, Li4/s;->d:Li4/s;

    iput-object v10, v7, Ln4/u;->b:Li4/s;

    goto :goto_e

    :cond_17
    if-eqz v12, :cond_18

    .line 41
    sget-object v10, Li4/s;->f:Li4/s;

    iput-object v10, v7, Ln4/u;->b:Li4/s;

    goto :goto_e

    .line 42
    :cond_18
    sget-object v10, Li4/s;->e:Li4/s;

    iput-object v10, v7, Ln4/u;->b:Li4/s;

    goto :goto_e

    .line 43
    :cond_19
    iput-wide v3, v7, Ln4/u;->n:J

    .line 44
    :goto_e
    iget-object v10, v7, Ln4/u;->b:Li4/s;

    sget-object v15, Li4/s;->a:Li4/s;

    if-ne v10, v15, :cond_1a

    const/4 v6, 0x1

    .line 45
    :cond_1a
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->J()Ln4/v;

    move-result-object v10

    .line 46
    invoke-virtual {v14}, Landroidx/work/impl/E;->t()Ljava/util/List;

    move-result-object v15

    .line 47
    invoke-static {v15, v7}, Lo4/d;->b(Ljava/util/List;Ln4/u;)Ln4/u;

    move-result-object v7

    .line 48
    invoke-interface {v10, v7}, Ln4/v;->s(Ln4/u;)V

    if-eqz v8, :cond_1b

    .line 49
    array-length v7, v0

    const/4 v10, 0x0

    :goto_f
    if-ge v10, v7, :cond_1b

    aget-object v15, v0, v10

    move-object/from16 p2, v0

    .line 50
    new-instance v0, Ln4/a;

    move-object/from16 p1, v2

    invoke-virtual {v5}, Li4/u;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v15}, Ln4/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->E()Ln4/b;

    move-result-object v2

    invoke-interface {v2, v0}, Ln4/b;->b(Ln4/a;)V

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    goto :goto_f

    :cond_1b
    move-object/from16 p2, v0

    move-object/from16 p1, v2

    .line 52
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->K()Ln4/z;

    move-result-object v0

    invoke-virtual {v5}, Li4/u;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Li4/u;->c()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v0, v2, v7}, Ln4/z;->c(Ljava/lang/String;Ljava/util/Set;)V

    if-nez v9, :cond_1c

    .line 53
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->H()Ln4/o;

    move-result-object v0

    new-instance v2, Ln4/n;

    invoke-virtual {v5}, Li4/u;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v1, v5}, Ln4/n;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ln4/o;->a(Ln4/n;)V

    :cond_1c
    move-object/from16 v2, p1

    move-object/from16 v0, p2

    goto/16 :goto_d

    :cond_1d
    return v6
.end method

.method private static e(Landroidx/work/impl/x;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/work/impl/x;->e()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Landroidx/work/impl/x;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroidx/work/impl/x;->j()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    invoke-static {v2}, Lo4/c;->e(Landroidx/work/impl/x;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    or-int/2addr v1, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {}, Li4/i;->e()Li4/i;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    sget-object v4, Lo4/c;->c:Ljava/lang/String;

    .line 41
    .line 42
    new-instance v5, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v6, "Already enqueued work ids ("

    .line 48
    .line 49
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v6, ", "

    .line 53
    .line 54
    invoke-virtual {v2}, Landroidx/work/impl/x;->c()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v6, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v2, ")"

    .line 66
    .line 67
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v3, v4, v2}, Li4/i;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-static {p0}, Lo4/c;->b(Landroidx/work/impl/x;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    or-int/2addr p0, v1

    .line 83
    return p0
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lo4/c;->a:Landroidx/work/impl/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/work/impl/x;->g()Landroidx/work/impl/E;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LM3/q;->e()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v1, p0, Lo4/c;->a:Landroidx/work/impl/x;

    .line 15
    .line 16
    invoke-static {v1}, Lo4/c;->e(Landroidx/work/impl/x;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, LM3/q;->i()V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    invoke-virtual {v0}, LM3/q;->i()V

    .line 29
    .line 30
    .line 31
    throw v1
.end method

.method public d()Li4/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lo4/c;->b:Landroidx/work/impl/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lo4/c;->a:Landroidx/work/impl/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/work/impl/x;->g()Landroidx/work/impl/E;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/work/impl/E;->o()Landroidx/work/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0}, Landroidx/work/impl/E;->t()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v1, v2, v0}, Landroidx/work/impl/u;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lo4/c;->a:Landroidx/work/impl/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/work/impl/x;->h()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lo4/c;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lo4/c;->a:Landroidx/work/impl/x;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/work/impl/x;->g()Landroidx/work/impl/E;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroidx/work/impl/E;->n()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-class v1, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-static {v0, v1, v2}, Lo4/p;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lo4/c;->f()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    iget-object v0, p0, Lo4/c;->b:Landroidx/work/impl/o;

    .line 38
    .line 39
    sget-object v1, Li4/l;->a:Li4/l$b$c;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroidx/work/impl/o;->a(Li4/l$b;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v2, "WorkContinuation has cycles ("

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v2, p0, Lo4/c;->a:Landroidx/work/impl/x;

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v2, ")"

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    :goto_1
    iget-object v1, p0, Lo4/c;->b:Landroidx/work/impl/o;

    .line 76
    .line 77
    new-instance v2, Li4/l$b$a;

    .line 78
    .line 79
    invoke-direct {v2, v0}, Li4/l$b$a;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroidx/work/impl/o;->a(Li4/l$b;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method
