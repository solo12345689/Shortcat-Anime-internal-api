.class public final LK/P;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LK/y;

.field private final b:LQ/F;

.field private final c:La1/U;

.field private final d:Z

.field private final e:Z

.field private final f:LQ/I;

.field private final g:La1/J;

.field private final h:LK/j0;

.field private final i:LK/j;

.field private final j:LK/r;

.field private final k:Lkotlin/jvm/functions/Function1;

.field private final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(LK/y;LQ/F;La1/U;ZZLQ/I;La1/J;LK/j0;LK/j;LK/r;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LK/P;->a:LK/y;

    .line 4
    iput-object p2, p0, LK/P;->b:LQ/F;

    .line 5
    iput-object p3, p0, LK/P;->c:La1/U;

    .line 6
    iput-boolean p4, p0, LK/P;->d:Z

    .line 7
    iput-boolean p5, p0, LK/P;->e:Z

    .line 8
    iput-object p6, p0, LK/P;->f:LQ/I;

    .line 9
    iput-object p7, p0, LK/P;->g:La1/J;

    .line 10
    iput-object p8, p0, LK/P;->h:LK/j0;

    .line 11
    iput-object p9, p0, LK/P;->i:LK/j;

    .line 12
    iput-object p10, p0, LK/P;->j:LK/r;

    .line 13
    iput-object p11, p0, LK/P;->k:Lkotlin/jvm/functions/Function1;

    .line 14
    iput p12, p0, LK/P;->l:I

    return-void
.end method

.method public synthetic constructor <init>(LK/y;LQ/F;La1/U;ZZLQ/I;La1/J;LK/j0;LK/j;LK/r;Lkotlin/jvm/functions/Function1;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 15
    new-instance v2, La1/U;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, La1/U;-><init>(Ljava/lang/String;JLU0/W0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    move v7, v1

    goto :goto_1

    :cond_1
    move/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move v8, v1

    goto :goto_2

    :cond_2
    move/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    .line 16
    sget-object v1, La1/J;->a:La1/J$a;

    invoke-virtual {v1}, La1/J$a;->a()La1/J;

    move-result-object v1

    move-object v10, v1

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    move-object v11, v1

    goto :goto_4

    :cond_4
    move-object/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_5

    .line 17
    invoke-static {}, LK/t;->a()LK/r;

    move-result-object v1

    move-object v13, v1

    goto :goto_5

    :cond_5
    move-object/from16 v13, p10

    :goto_5
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_6

    .line 18
    sget-object v0, LK/P$a;->a:LK/P$a;

    move-object v14, v0

    goto :goto_6

    :cond_6
    move-object/from16 v14, p11

    :goto_6
    const/16 v16, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v9, p6

    move-object/from16 v12, p9

    move/from16 v15, p12

    .line 19
    invoke-direct/range {v3 .. v16}, LK/P;-><init>(LK/y;LQ/F;La1/U;ZZLQ/I;La1/J;LK/j0;LK/j;LK/r;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(LK/y;LQ/F;La1/U;ZZLQ/I;La1/J;LK/j0;LK/j;LK/r;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p12}, LK/P;-><init>(LK/y;LQ/F;La1/U;ZZLQ/I;La1/J;LK/j0;LK/j;LK/r;Lkotlin/jvm/functions/Function1;I)V

    return-void
.end method

.method public static final synthetic a(LK/P;La1/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LK/P;->e(La1/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic b(LK/P;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LK/P;->f(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic c(LK/P;)I
    .locals 0

    .line 1
    iget p0, p0, LK/P;->l:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic d(LK/P;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, LK/P;->k:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method private final e(La1/i;)V
    .locals 0

    .line 1
    invoke-static {p1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, LK/P;->f(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final f(Ljava/util/List;)V
    .locals 3

    .line 1
    iget-object v0, p0, LK/P;->a:LK/y;

    .line 2
    .line 3
    invoke-virtual {v0}, LK/y;->n()La1/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, LUd/u;->d1(Ljava/util/Collection;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v1, La1/o;

    .line 12
    .line 13
    invoke-direct {v1}, La1/o;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-interface {p1, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, La1/l;->b(Ljava/util/List;)La1/U;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v0, p0, LK/P;->k:Lkotlin/jvm/functions/Function1;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private final g(Lkotlin/jvm/functions/Function1;)V
    .locals 5

    .line 1
    new-instance v0, LQ/E;

    .line 2
    .line 3
    iget-object v1, p0, LK/P;->c:La1/U;

    .line 4
    .line 5
    iget-object v2, p0, LK/P;->g:La1/J;

    .line 6
    .line 7
    iget-object v3, p0, LK/P;->a:LK/y;

    .line 8
    .line 9
    invoke-virtual {v3}, LK/y;->j()LK/Z;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, p0, LK/P;->f:LQ/I;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3, v4}, LQ/E;-><init>(La1/U;La1/J;LK/Z;LQ/I;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, LQ/b;->u()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    iget-object p1, p0, LK/P;->c:La1/U;

    .line 26
    .line 27
    invoke-virtual {p1}, La1/U;->k()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    invoke-static {v1, v2, v3, v4}, LU0/W0;->g(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, LQ/b;->e()LU0/e;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object v1, p0, LK/P;->c:La1/U;

    .line 42
    .line 43
    invoke-virtual {v1}, La1/U;->i()LU0/e;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-void

    .line 55
    :cond_1
    :goto_0
    iget-object p1, p0, LK/P;->k:Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    invoke-virtual {v0}, LQ/E;->Z()La1/U;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private final m(Landroid/view/KeyEvent;)La1/a;
    .locals 2

    .line 1
    invoke-static {p1}, LK/S;->a(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    iget-object v0, p0, LK/P;->i:LK/j;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, LK/j;->a(Landroid/view/KeyEvent;)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, p1}, LK/E;->a(Ljava/lang/StringBuilder;I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, La1/a;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-direct {v0, p1, v1}, La1/a;-><init>(Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    return-object v1
.end method


# virtual methods
.method public final h()LQ/F;
    .locals 1

    .line 1
    iget-object v0, p0, LK/P;->b:LQ/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK/P;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final j()LK/y;
    .locals 1

    .line 1
    iget-object v0, p0, LK/P;->a:LK/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()LK/j0;
    .locals 1

    .line 1
    iget-object v0, p0, LK/P;->h:LK/j0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1}, LK/P;->m(Landroid/view/KeyEvent;)La1/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, LK/P;->d:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, v0}, LK/P;->e(La1/i;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LK/P;->f:LQ/I;

    .line 17
    .line 18
    invoke-virtual {p1}, LQ/I;->b()V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    return v2

    .line 23
    :cond_1
    invoke-static {p1}, LC0/d;->b(Landroid/view/KeyEvent;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sget-object v3, LC0/c;->a:LC0/c$a;

    .line 28
    .line 29
    invoke-virtual {v3}, LC0/c$a;->a()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-static {v0, v3}, LC0/c;->e(II)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    return v2

    .line 40
    :cond_2
    iget-object v0, p0, LK/P;->j:LK/r;

    .line 41
    .line 42
    invoke-interface {v0, p1}, LK/r;->a(Landroid/view/KeyEvent;)LK/p;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_5

    .line 47
    .line 48
    invoke-virtual {p1}, LK/p;->b()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iget-boolean v0, p0, LK/P;->d:Z

    .line 55
    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    new-instance v0, Lkotlin/jvm/internal/J;

    .line 60
    .line 61
    invoke-direct {v0}, Lkotlin/jvm/internal/J;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 65
    .line 66
    new-instance v1, LK/P$b;

    .line 67
    .line 68
    invoke-direct {v1, p1, p0, v0}, LK/P$b;-><init>(LK/p;LK/P;Lkotlin/jvm/internal/J;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0, v1}, LK/P;->g(Lkotlin/jvm/functions/Function1;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, LK/P;->h:LK/j0;

    .line 75
    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-virtual {p1}, LK/j0;->a()V

    .line 79
    .line 80
    .line 81
    :cond_4
    iget-boolean p1, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 82
    .line 83
    return p1

    .line 84
    :cond_5
    :goto_0
    return v2
.end method
