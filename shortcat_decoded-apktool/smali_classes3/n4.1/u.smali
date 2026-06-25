.class public final Ln4/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln4/u$b;,
        Ln4/u$a;
    }
.end annotation


# static fields
.field public static final u:Ln4/u$a;

.field private static final v:Ljava/lang/String;

.field public static final w:Lq/a;


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Li4/s;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Landroidx/work/b;

.field public f:Landroidx/work/b;

.field public g:J

.field public h:J

.field public i:J

.field public j:Li4/b;

.field public k:I

.field public l:Li4/a;

.field public m:J

.field public n:J

.field public o:J

.field public p:J

.field public q:Z

.field public r:Li4/m;

.field private s:I

.field private final t:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln4/u$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ln4/u$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ln4/u;->u:Ln4/u$a;

    .line 8
    .line 9
    const-string v0, "WorkSpec"

    .line 10
    .line 11
    invoke-static {v0}, Li4/i;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "tagWithPrefix(\"WorkSpec\")"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Ln4/u;->v:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v0, Ln4/t;

    .line 23
    .line 24
    invoke-direct {v0}, Ln4/t;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Ln4/u;->w:Lq/a;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Li4/s;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLi4/b;ILi4/a;JJJJZLi4/m;II)V
    .locals 4

    move-object/from16 v0, p13

    move-object/from16 v1, p15

    move-object/from16 v2, p25

    const-string v3, "id"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "state"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "workerClassName"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "input"

    invoke-static {p5, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "output"

    invoke-static {p6, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "constraints"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "backoffPolicy"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "outOfQuotaPolicy"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln4/u;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Ln4/u;->b:Li4/s;

    .line 4
    iput-object p3, p0, Ln4/u;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Ln4/u;->d:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Ln4/u;->e:Landroidx/work/b;

    .line 7
    iput-object p6, p0, Ln4/u;->f:Landroidx/work/b;

    .line 8
    iput-wide p7, p0, Ln4/u;->g:J

    .line 9
    iput-wide p9, p0, Ln4/u;->h:J

    move-wide p1, p11

    .line 10
    iput-wide p1, p0, Ln4/u;->i:J

    .line 11
    iput-object v0, p0, Ln4/u;->j:Li4/b;

    move/from16 p1, p14

    .line 12
    iput p1, p0, Ln4/u;->k:I

    .line 13
    iput-object v1, p0, Ln4/u;->l:Li4/a;

    move-wide/from16 p1, p16

    .line 14
    iput-wide p1, p0, Ln4/u;->m:J

    move-wide/from16 p1, p18

    .line 15
    iput-wide p1, p0, Ln4/u;->n:J

    move-wide/from16 p1, p20

    .line 16
    iput-wide p1, p0, Ln4/u;->o:J

    move-wide/from16 p1, p22

    .line 17
    iput-wide p1, p0, Ln4/u;->p:J

    move/from16 p1, p24

    .line 18
    iput-boolean p1, p0, Ln4/u;->q:Z

    .line 19
    iput-object v2, p0, Ln4/u;->r:Li4/m;

    move/from16 p1, p26

    .line 20
    iput p1, p0, Ln4/u;->s:I

    move/from16 p1, p27

    .line 21
    iput p1, p0, Ln4/u;->t:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Li4/s;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLi4/b;ILi4/a;JJJJZLi4/m;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 30

    move/from16 v0, p28

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 22
    sget-object v1, Li4/s;->a:Li4/s;

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object/from16 v4, p2

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    .line 23
    const-string v2, "EMPTY"

    if-eqz v1, :cond_2

    .line 24
    sget-object v1, Landroidx/work/b;->c:Landroidx/work/b;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v1

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    .line 25
    sget-object v1, Landroidx/work/b;->c:Landroidx/work/b;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, v1

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_4

    move-wide v9, v2

    goto :goto_4

    :cond_4
    move-wide/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-wide v11, v2

    goto :goto_5

    :cond_5
    move-wide/from16 v11, p9

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move-wide v13, v2

    goto :goto_6

    :cond_6
    move-wide/from16 v13, p11

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    .line 26
    sget-object v1, Li4/b;->j:Li4/b;

    move-object v15, v1

    goto :goto_7

    :cond_7
    move-object/from16 v15, p13

    :goto_7
    and-int/lit16 v1, v0, 0x400

    const/4 v5, 0x0

    if-eqz v1, :cond_8

    move/from16 v16, v5

    goto :goto_8

    :cond_8
    move/from16 v16, p14

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    .line 27
    sget-object v1, Li4/a;->a:Li4/a;

    move-object/from16 v17, v1

    goto :goto_9

    :cond_9
    move-object/from16 v17, p15

    :goto_9
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_a

    const-wide/16 v18, 0x7530

    goto :goto_a

    :cond_a
    move-wide/from16 v18, p16

    :goto_a
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_b

    move-wide/from16 v20, v2

    goto :goto_b

    :cond_b
    move-wide/from16 v20, p18

    :goto_b
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_c

    move-wide/from16 v22, v2

    goto :goto_c

    :cond_c
    move-wide/from16 v22, p20

    :goto_c
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    const-wide/16 v1, -0x1

    move-wide/from16 v24, v1

    goto :goto_d

    :cond_d
    move-wide/from16 v24, p22

    :goto_d
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move/from16 v26, v5

    goto :goto_e

    :cond_e
    move/from16 v26, p24

    :goto_e
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    .line 28
    sget-object v1, Li4/m;->a:Li4/m;

    move-object/from16 v27, v1

    goto :goto_f

    :cond_f
    move-object/from16 v27, p25

    :goto_f
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move/from16 v28, v5

    goto :goto_10

    :cond_10
    move/from16 v28, p26

    :goto_10
    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_11

    move/from16 v29, v5

    :goto_11
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v5, p3

    goto :goto_12

    :cond_11
    move/from16 v29, p27

    goto :goto_11

    .line 29
    :goto_12
    invoke-direct/range {v2 .. v29}, Ln4/u;-><init>(Ljava/lang/String;Li4/s;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLi4/b;ILi4/a;JJJJZLi4/m;II)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 31

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerClassName_"

    move-object/from16 v4, p2

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v29, 0xffffa

    const/16 v30, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v1, p0

    .line 30
    invoke-direct/range {v1 .. v30}, Ln4/u;-><init>(Ljava/lang/String;Li4/s;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLi4/b;ILi4/a;JJJJZLi4/m;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ln4/u;)V
    .locals 32

    move-object/from16 v0, p2

    const-string v1, "newId"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "other"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iget-object v5, v0, Ln4/u;->c:Ljava/lang/String;

    .line 32
    iget-object v4, v0, Ln4/u;->b:Li4/s;

    .line 33
    iget-object v6, v0, Ln4/u;->d:Ljava/lang/String;

    .line 34
    new-instance v7, Landroidx/work/b;

    iget-object v1, v0, Ln4/u;->e:Landroidx/work/b;

    invoke-direct {v7, v1}, Landroidx/work/b;-><init>(Landroidx/work/b;)V

    .line 35
    new-instance v8, Landroidx/work/b;

    iget-object v1, v0, Ln4/u;->f:Landroidx/work/b;

    invoke-direct {v8, v1}, Landroidx/work/b;-><init>(Landroidx/work/b;)V

    .line 36
    iget-wide v9, v0, Ln4/u;->g:J

    .line 37
    iget-wide v11, v0, Ln4/u;->h:J

    .line 38
    iget-wide v13, v0, Ln4/u;->i:J

    .line 39
    new-instance v15, Li4/b;

    iget-object v1, v0, Ln4/u;->j:Li4/b;

    invoke-direct {v15, v1}, Li4/b;-><init>(Li4/b;)V

    .line 40
    iget v1, v0, Ln4/u;->k:I

    .line 41
    iget-object v2, v0, Ln4/u;->l:Li4/a;

    move/from16 v16, v1

    move-object/from16 v17, v2

    .line 42
    iget-wide v1, v0, Ln4/u;->m:J

    move-wide/from16 v18, v1

    .line 43
    iget-wide v1, v0, Ln4/u;->n:J

    move-wide/from16 v20, v1

    .line 44
    iget-wide v1, v0, Ln4/u;->o:J

    move-wide/from16 v22, v1

    .line 45
    iget-wide v1, v0, Ln4/u;->p:J

    move-wide/from16 v24, v1

    .line 46
    iget-boolean v1, v0, Ln4/u;->q:Z

    .line 47
    iget-object v2, v0, Ln4/u;->r:Li4/m;

    .line 48
    iget v0, v0, Ln4/u;->s:I

    const/high16 v30, 0x80000

    const/16 v31, 0x0

    const/16 v29, 0x0

    move/from16 v28, v0

    move/from16 v26, v1

    move-object/from16 v27, v2

    move-object/from16 v2, p0

    .line 49
    invoke-direct/range {v2 .. v31}, Ln4/u;-><init>(Ljava/lang/String;Li4/s;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLi4/b;ILi4/a;JJJJZLi4/m;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic a(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Ln4/u;->b(Ljava/util/List;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final b(Ljava/util/List;)Ljava/util/List;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 v2, 0xa

    .line 7
    .line 8
    invoke-static {p0, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :cond_1
    return-object v0
.end method

.method public static synthetic e(Ln4/u;Ljava/lang/String;Li4/s;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLi4/b;ILi4/a;JJJJZLi4/m;IIILjava/lang/Object;)Ln4/u;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p28

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    .line 1
    iget-object v2, v0, Ln4/u;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Ln4/u;->b:Li4/s;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Ln4/u;->c:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Ln4/u;->d:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Ln4/u;->e:Landroidx/work/b;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Ln4/u;->f:Landroidx/work/b;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-wide v8, v0, Ln4/u;->g:J

    goto :goto_6

    :cond_6
    move-wide/from16 v8, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-wide v10, v0, Ln4/u;->h:J

    goto :goto_7

    :cond_7
    move-wide/from16 v10, p9

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget-wide v12, v0, Ln4/u;->i:J

    goto :goto_8

    :cond_8
    move-wide/from16 v12, p11

    :goto_8
    and-int/lit16 v14, v1, 0x200

    if-eqz v14, :cond_9

    iget-object v14, v0, Ln4/u;->j:Li4/b;

    goto :goto_9

    :cond_9
    move-object/from16 v14, p13

    :goto_9
    and-int/lit16 v15, v1, 0x400

    if-eqz v15, :cond_a

    iget v15, v0, Ln4/u;->k:I

    goto :goto_a

    :cond_a
    move/from16 v15, p14

    :goto_a
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x800

    if-eqz v2, :cond_b

    iget-object v2, v0, Ln4/u;->l:Li4/a;

    goto :goto_b

    :cond_b
    move-object/from16 v2, p15

    :goto_b
    move-object/from16 p2, v2

    and-int/lit16 v2, v1, 0x1000

    move-object/from16 p29, v3

    if-eqz v2, :cond_c

    iget-wide v2, v0, Ln4/u;->m:J

    goto :goto_c

    :cond_c
    move-wide/from16 v2, p16

    :goto_c
    move-wide/from16 p3, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-wide v2, v0, Ln4/u;->n:J

    goto :goto_d

    :cond_d
    move-wide/from16 v2, p18

    :goto_d
    move-wide/from16 p5, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-wide v2, v0, Ln4/u;->o:J

    goto :goto_e

    :cond_e
    move-wide/from16 v2, p20

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-wide/from16 p7, v2

    if-eqz v16, :cond_f

    iget-wide v1, v0, Ln4/u;->p:J

    goto :goto_f

    :cond_f
    move-wide/from16 v1, p22

    :goto_f
    const/high16 v3, 0x10000

    and-int v3, p28, v3

    if-eqz v3, :cond_10

    iget-boolean v3, v0, Ln4/u;->q:Z

    goto :goto_10

    :cond_10
    move/from16 v3, p24

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p28, v16

    move-wide/from16 p9, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Ln4/u;->r:Li4/m;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p25

    :goto_11
    const/high16 v2, 0x40000

    and-int v2, p28, v2

    if-eqz v2, :cond_12

    iget v2, v0, Ln4/u;->s:I

    goto :goto_12

    :cond_12
    move/from16 v2, p26

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p28, v16

    if-eqz v16, :cond_13

    move-object/from16 p11, v1

    iget v1, v0, Ln4/u;->t:I

    move-object/from16 p26, p11

    move/from16 p28, v1

    :goto_13
    move-object/from16 p16, p2

    move-wide/from16 p17, p3

    move-wide/from16 p19, p5

    move-wide/from16 p21, p7

    move-wide/from16 p23, p9

    move-object/from16 p3, p29

    move/from16 p27, v2

    move/from16 p25, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-wide/from16 p8, v8

    move-wide/from16 p10, v10

    move-wide/from16 p12, v12

    move-object/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_14

    :cond_13
    move/from16 p28, p27

    move-object/from16 p26, v1

    goto :goto_13

    :goto_14
    invoke-virtual/range {p1 .. p28}, Ln4/u;->d(Ljava/lang/String;Li4/s;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLi4/b;ILi4/a;JJJJZLi4/m;II)Ln4/u;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final c()J
    .locals 10

    .line 1
    invoke-virtual {p0}, Ln4/u;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Ln4/u;->l:Li4/a;

    .line 8
    .line 9
    sget-object v1, Li4/a;->b:Li4/a;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Ln4/u;->m:J

    .line 14
    .line 15
    iget v2, p0, Ln4/u;->k:I

    .line 16
    .line 17
    int-to-long v2, v2

    .line 18
    mul-long/2addr v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-wide v0, p0, Ln4/u;->m:J

    .line 21
    .line 22
    long-to-float v0, v0

    .line 23
    iget v1, p0, Ln4/u;->k:I

    .line 24
    .line 25
    add-int/lit8 v1, v1, -0x1

    .line 26
    .line 27
    invoke-static {v0, v1}, Ljava/lang/Math;->scalb(FI)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    float-to-long v0, v0

    .line 32
    :goto_0
    iget-wide v2, p0, Ln4/u;->n:J

    .line 33
    .line 34
    const-wide/32 v4, 0x112a880

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1, v4, v5}, Loe/j;->j(JJ)J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    add-long/2addr v2, v0

    .line 42
    return-wide v2

    .line 43
    :cond_1
    invoke-virtual {p0}, Ln4/u;->j()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const-wide/16 v1, 0x0

    .line 48
    .line 49
    if-eqz v0, :cond_6

    .line 50
    .line 51
    iget v0, p0, Ln4/u;->s:I

    .line 52
    .line 53
    iget-wide v3, p0, Ln4/u;->n:J

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    iget-wide v5, p0, Ln4/u;->g:J

    .line 58
    .line 59
    add-long/2addr v3, v5

    .line 60
    :cond_2
    iget-wide v5, p0, Ln4/u;->i:J

    .line 61
    .line 62
    iget-wide v7, p0, Ln4/u;->h:J

    .line 63
    .line 64
    cmp-long v9, v5, v7

    .line 65
    .line 66
    if-eqz v9, :cond_4

    .line 67
    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    const/4 v0, -0x1

    .line 71
    int-to-long v0, v0

    .line 72
    mul-long v1, v0, v5

    .line 73
    .line 74
    :cond_3
    add-long/2addr v3, v7

    .line 75
    add-long/2addr v3, v1

    .line 76
    return-wide v3

    .line 77
    :cond_4
    if-nez v0, :cond_5

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    move-wide v1, v7

    .line 81
    :goto_1
    add-long/2addr v3, v1

    .line 82
    return-wide v3

    .line 83
    :cond_6
    iget-wide v3, p0, Ln4/u;->n:J

    .line 84
    .line 85
    cmp-long v0, v3, v1

    .line 86
    .line 87
    if-nez v0, :cond_7

    .line 88
    .line 89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 90
    .line 91
    .line 92
    move-result-wide v3

    .line 93
    :cond_7
    iget-wide v0, p0, Ln4/u;->g:J

    .line 94
    .line 95
    add-long/2addr v3, v0

    .line 96
    return-wide v3
.end method

.method public final d(Ljava/lang/String;Li4/s;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLi4/b;ILi4/a;JJJJZLi4/m;II)Ln4/u;
    .locals 29

    .line 1
    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerClassName"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constraints"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backoffPolicy"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outOfQuotaPolicy"

    move-object/from16 v5, p25

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ln4/u;

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    move-wide/from16 v12, p11

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-wide/from16 v17, p16

    move-wide/from16 v19, p18

    move-wide/from16 v21, p20

    move-wide/from16 v23, p22

    move/from16 v25, p24

    move/from16 v27, p26

    move/from16 v28, p27

    move-object/from16 v26, v5

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v28}, Ln4/u;-><init>(Ljava/lang/String;Li4/s;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLi4/b;ILi4/a;JJJJZLi4/m;II)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ln4/u;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Ln4/u;

    .line 12
    .line 13
    iget-object v1, p0, Ln4/u;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Ln4/u;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Ln4/u;->b:Li4/s;

    .line 25
    .line 26
    iget-object v3, p1, Ln4/u;->b:Li4/s;

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, Ln4/u;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p1, Ln4/u;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, Ln4/u;->d:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v3, p1, Ln4/u;->d:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-object v1, p0, Ln4/u;->e:Landroidx/work/b;

    .line 54
    .line 55
    iget-object v3, p1, Ln4/u;->e:Landroidx/work/b;

    .line 56
    .line 57
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object v1, p0, Ln4/u;->f:Landroidx/work/b;

    .line 65
    .line 66
    iget-object v3, p1, Ln4/u;->f:Landroidx/work/b;

    .line 67
    .line 68
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget-wide v3, p0, Ln4/u;->g:J

    .line 76
    .line 77
    iget-wide v5, p1, Ln4/u;->g:J

    .line 78
    .line 79
    cmp-long v1, v3, v5

    .line 80
    .line 81
    if-eqz v1, :cond_8

    .line 82
    .line 83
    return v2

    .line 84
    :cond_8
    iget-wide v3, p0, Ln4/u;->h:J

    .line 85
    .line 86
    iget-wide v5, p1, Ln4/u;->h:J

    .line 87
    .line 88
    cmp-long v1, v3, v5

    .line 89
    .line 90
    if-eqz v1, :cond_9

    .line 91
    .line 92
    return v2

    .line 93
    :cond_9
    iget-wide v3, p0, Ln4/u;->i:J

    .line 94
    .line 95
    iget-wide v5, p1, Ln4/u;->i:J

    .line 96
    .line 97
    cmp-long v1, v3, v5

    .line 98
    .line 99
    if-eqz v1, :cond_a

    .line 100
    .line 101
    return v2

    .line 102
    :cond_a
    iget-object v1, p0, Ln4/u;->j:Li4/b;

    .line 103
    .line 104
    iget-object v3, p1, Ln4/u;->j:Li4/b;

    .line 105
    .line 106
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-nez v1, :cond_b

    .line 111
    .line 112
    return v2

    .line 113
    :cond_b
    iget v1, p0, Ln4/u;->k:I

    .line 114
    .line 115
    iget v3, p1, Ln4/u;->k:I

    .line 116
    .line 117
    if-eq v1, v3, :cond_c

    .line 118
    .line 119
    return v2

    .line 120
    :cond_c
    iget-object v1, p0, Ln4/u;->l:Li4/a;

    .line 121
    .line 122
    iget-object v3, p1, Ln4/u;->l:Li4/a;

    .line 123
    .line 124
    if-eq v1, v3, :cond_d

    .line 125
    .line 126
    return v2

    .line 127
    :cond_d
    iget-wide v3, p0, Ln4/u;->m:J

    .line 128
    .line 129
    iget-wide v5, p1, Ln4/u;->m:J

    .line 130
    .line 131
    cmp-long v1, v3, v5

    .line 132
    .line 133
    if-eqz v1, :cond_e

    .line 134
    .line 135
    return v2

    .line 136
    :cond_e
    iget-wide v3, p0, Ln4/u;->n:J

    .line 137
    .line 138
    iget-wide v5, p1, Ln4/u;->n:J

    .line 139
    .line 140
    cmp-long v1, v3, v5

    .line 141
    .line 142
    if-eqz v1, :cond_f

    .line 143
    .line 144
    return v2

    .line 145
    :cond_f
    iget-wide v3, p0, Ln4/u;->o:J

    .line 146
    .line 147
    iget-wide v5, p1, Ln4/u;->o:J

    .line 148
    .line 149
    cmp-long v1, v3, v5

    .line 150
    .line 151
    if-eqz v1, :cond_10

    .line 152
    .line 153
    return v2

    .line 154
    :cond_10
    iget-wide v3, p0, Ln4/u;->p:J

    .line 155
    .line 156
    iget-wide v5, p1, Ln4/u;->p:J

    .line 157
    .line 158
    cmp-long v1, v3, v5

    .line 159
    .line 160
    if-eqz v1, :cond_11

    .line 161
    .line 162
    return v2

    .line 163
    :cond_11
    iget-boolean v1, p0, Ln4/u;->q:Z

    .line 164
    .line 165
    iget-boolean v3, p1, Ln4/u;->q:Z

    .line 166
    .line 167
    if-eq v1, v3, :cond_12

    .line 168
    .line 169
    return v2

    .line 170
    :cond_12
    iget-object v1, p0, Ln4/u;->r:Li4/m;

    .line 171
    .line 172
    iget-object v3, p1, Ln4/u;->r:Li4/m;

    .line 173
    .line 174
    if-eq v1, v3, :cond_13

    .line 175
    .line 176
    return v2

    .line 177
    :cond_13
    iget v1, p0, Ln4/u;->s:I

    .line 178
    .line 179
    iget v3, p1, Ln4/u;->s:I

    .line 180
    .line 181
    if-eq v1, v3, :cond_14

    .line 182
    .line 183
    return v2

    .line 184
    :cond_14
    iget v1, p0, Ln4/u;->t:I

    .line 185
    .line 186
    iget p1, p1, Ln4/u;->t:I

    .line 187
    .line 188
    if-eq v1, p1, :cond_15

    .line 189
    .line 190
    return v2

    .line 191
    :cond_15
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/u;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/u;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()Z
    .locals 2

    .line 1
    sget-object v0, Li4/b;->j:Li4/b;

    .line 2
    .line 3
    iget-object v1, p0, Ln4/u;->j:Li4/b;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Ln4/u;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Ln4/u;->b:Li4/s;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, Ln4/u;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Ln4/u;->d:Ljava/lang/String;

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    :goto_0
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v1, p0, Ln4/u;->e:Landroidx/work/b;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/work/b;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v0, v1

    .line 47
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    .line 49
    iget-object v1, p0, Ln4/u;->f:Landroidx/work/b;

    .line 50
    .line 51
    invoke-virtual {v1}, Landroidx/work/b;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/2addr v0, v1

    .line 56
    mul-int/lit8 v0, v0, 0x1f

    .line 57
    .line 58
    iget-wide v1, p0, Ln4/u;->g:J

    .line 59
    .line 60
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v0, v1

    .line 65
    mul-int/lit8 v0, v0, 0x1f

    .line 66
    .line 67
    iget-wide v1, p0, Ln4/u;->h:J

    .line 68
    .line 69
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    add-int/2addr v0, v1

    .line 74
    mul-int/lit8 v0, v0, 0x1f

    .line 75
    .line 76
    iget-wide v1, p0, Ln4/u;->i:J

    .line 77
    .line 78
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    add-int/2addr v0, v1

    .line 83
    mul-int/lit8 v0, v0, 0x1f

    .line 84
    .line 85
    iget-object v1, p0, Ln4/u;->j:Li4/b;

    .line 86
    .line 87
    invoke-virtual {v1}, Li4/b;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    add-int/2addr v0, v1

    .line 92
    mul-int/lit8 v0, v0, 0x1f

    .line 93
    .line 94
    iget v1, p0, Ln4/u;->k:I

    .line 95
    .line 96
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    add-int/2addr v0, v1

    .line 101
    mul-int/lit8 v0, v0, 0x1f

    .line 102
    .line 103
    iget-object v1, p0, Ln4/u;->l:Li4/a;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    add-int/2addr v0, v1

    .line 110
    mul-int/lit8 v0, v0, 0x1f

    .line 111
    .line 112
    iget-wide v1, p0, Ln4/u;->m:J

    .line 113
    .line 114
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    add-int/2addr v0, v1

    .line 119
    mul-int/lit8 v0, v0, 0x1f

    .line 120
    .line 121
    iget-wide v1, p0, Ln4/u;->n:J

    .line 122
    .line 123
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    add-int/2addr v0, v1

    .line 128
    mul-int/lit8 v0, v0, 0x1f

    .line 129
    .line 130
    iget-wide v1, p0, Ln4/u;->o:J

    .line 131
    .line 132
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    add-int/2addr v0, v1

    .line 137
    mul-int/lit8 v0, v0, 0x1f

    .line 138
    .line 139
    iget-wide v1, p0, Ln4/u;->p:J

    .line 140
    .line 141
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    add-int/2addr v0, v1

    .line 146
    mul-int/lit8 v0, v0, 0x1f

    .line 147
    .line 148
    iget-boolean v1, p0, Ln4/u;->q:Z

    .line 149
    .line 150
    if-eqz v1, :cond_1

    .line 151
    .line 152
    const/4 v1, 0x1

    .line 153
    :cond_1
    add-int/2addr v0, v1

    .line 154
    mul-int/lit8 v0, v0, 0x1f

    .line 155
    .line 156
    iget-object v1, p0, Ln4/u;->r:Li4/m;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    add-int/2addr v0, v1

    .line 163
    mul-int/lit8 v0, v0, 0x1f

    .line 164
    .line 165
    iget v1, p0, Ln4/u;->s:I

    .line 166
    .line 167
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    add-int/2addr v0, v1

    .line 172
    mul-int/lit8 v0, v0, 0x1f

    .line 173
    .line 174
    iget v1, p0, Ln4/u;->t:I

    .line 175
    .line 176
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    add-int/2addr v0, v1

    .line 181
    return v0
.end method

.method public final i()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/u;->b:Li4/s;

    .line 2
    .line 3
    sget-object v1, Li4/s;->a:Li4/s;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Ln4/u;->k:I

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final j()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Ln4/u;->h:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final k(J)V
    .locals 5

    .line 1
    const-wide/32 v0, 0xdbba0

    .line 2
    .line 3
    .line 4
    cmp-long v2, p1, v0

    .line 5
    .line 6
    if-gez v2, :cond_0

    .line 7
    .line 8
    invoke-static {}, Li4/i;->e()Li4/i;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    sget-object v3, Ln4/u;->v:Ljava/lang/String;

    .line 13
    .line 14
    const-string v4, "Interval duration lesser than minimum allowed value; Changed to 900000"

    .line 15
    .line 16
    invoke-virtual {v2, v3, v4}, Li4/i;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {p1, p2, v0, v1}, Loe/j;->f(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    invoke-static {p1, p2, v0, v1}, Loe/j;->f(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    invoke-virtual {p0, v2, v3, p1, p2}, Ln4/u;->l(JJ)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final l(JJ)V
    .locals 8

    .line 1
    const-wide/32 v0, 0xdbba0

    .line 2
    .line 3
    .line 4
    cmp-long v2, p1, v0

    .line 5
    .line 6
    if-gez v2, :cond_0

    .line 7
    .line 8
    invoke-static {}, Li4/i;->e()Li4/i;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    sget-object v3, Ln4/u;->v:Ljava/lang/String;

    .line 13
    .line 14
    const-string v4, "Interval duration lesser than minimum allowed value; Changed to 900000"

    .line 15
    .line 16
    invoke-virtual {v2, v3, v4}, Li4/i;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {p1, p2, v0, v1}, Loe/j;->f(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iput-wide v0, p0, Ln4/u;->h:J

    .line 24
    .line 25
    const-wide/32 v0, 0x493e0

    .line 26
    .line 27
    .line 28
    cmp-long v0, p3, v0

    .line 29
    .line 30
    if-gez v0, :cond_1

    .line 31
    .line 32
    invoke-static {}, Li4/i;->e()Li4/i;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v1, Ln4/u;->v:Ljava/lang/String;

    .line 37
    .line 38
    const-string v2, "Flex duration lesser than minimum allowed value; Changed to 300000"

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Li4/i;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-wide v0, p0, Ln4/u;->h:J

    .line 44
    .line 45
    cmp-long v0, p3, v0

    .line 46
    .line 47
    if-lez v0, :cond_2

    .line 48
    .line 49
    invoke-static {}, Li4/i;->e()Li4/i;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget-object v1, Ln4/u;->v:Ljava/lang/String;

    .line 54
    .line 55
    new-instance v2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v3, "Flex duration greater than interval duration; Changed to "

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {v0, v1, p1}, Li4/i;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    const-wide/32 v4, 0x493e0

    .line 76
    .line 77
    .line 78
    iget-wide v6, p0, Ln4/u;->h:J

    .line 79
    .line 80
    move-wide v2, p3

    .line 81
    invoke-static/range {v2 .. v7}, Loe/j;->o(JJJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide p1

    .line 85
    iput-wide p1, p0, Ln4/u;->i:J

    .line 86
    .line 87
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "{WorkSpec: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Ln4/u;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x7d

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method
