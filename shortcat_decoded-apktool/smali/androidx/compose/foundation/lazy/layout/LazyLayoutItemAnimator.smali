.class public final Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;,
        Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;,
        Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;
    }
.end annotation


# instance fields
.field private final a:Lt/P;

.field private b:Landroidx/compose/foundation/lazy/layout/c;

.field private c:I

.field private final d:Lt/Q;

.field private final e:Ljava/util/List;

.field private final f:Ljava/util/List;

.field private final g:Ljava/util/List;

.field private final h:Ljava/util/List;

.field private final i:Ljava/util/List;

.field private j:LK0/t;

.field private final k:Landroidx/compose/ui/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lt/d0;->b()Lt/P;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    .line 9
    .line 10
    invoke-static {}, Lt/f0;->b()Lt/Q;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d:Lt/Q;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->e:Ljava/util/List;

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f:Ljava/util/List;

    .line 29
    .line 30
    new-instance v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    .line 36
    .line 37
    new-instance v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    .line 43
    .line 44
    new-instance v0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->i:Ljava/util/List;

    .line 50
    .line 51
    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->k:Landroidx/compose/ui/e;

    .line 57
    .line 58
    return-void
.end method

.method public static final synthetic a(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LF/w;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->e(LF/w;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic b(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LK0/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->j:LK0/t;

    .line 2
    .line 3
    return-void
.end method

.method private final e(LF/w;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, LF/w;->n(I)J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    invoke-interface {p1}, LF/w;->j()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-static {v0, v1}, Li1/n;->l(J)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    invoke-static {v0, v1}, Li1/n;->k(J)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method private final f(LF/w;)Z
    .locals 4

    .line 1
    invoke-interface {p1}, LF/w;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, v2}, LF/w;->m(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {v3}, LF/n;->b(Ljava/lang/Object;)LF/g;

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v1
.end method

.method private final g(LF/w;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, LF/w;->n(I)J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    invoke-interface {p1}, LF/w;->j()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-static {v0, v1}, Li1/n;->l(J)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    invoke-static {v0, v1}, Li1/n;->k(J)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method private final j(LF/w;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, LF/w;->n(I)J

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    invoke-interface {p1}, LF/w;->j()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, p2

    .line 16
    invoke-static/range {v1 .. v6}, Li1/n;->h(JIIILjava/lang/Object;)J

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v3, p2

    .line 21
    const/4 v5, 0x2

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, Li1/n;->h(JIIILjava/lang/Object;)J

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    array-length p2, p1

    .line 32
    :goto_1
    if-ge v0, p2, :cond_1

    .line 33
    .line 34
    aget-object p3, p1, v0

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    return-void
.end method

.method static synthetic k(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LF/w;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    .line 6
    .line 7
    invoke-interface {p1}, LF/w;->getKey()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    invoke-virtual {p3, p4}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-static {p3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    check-cast p3, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    .line 19
    .line 20
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->j(LF/w;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private final m(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/P;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    array-length v0, p1

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_0

    .line 20
    .line 21
    aget-object v2, p1, v1

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method private final o(LF/w;Z)V
    .locals 2

    .line 1
    iget-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    .line 2
    .line 3
    invoke-interface {p1}, LF/w;->getKey()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p2, p1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    array-length p2, p1

    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-ge v0, p2, :cond_0

    .line 23
    .line 24
    aget-object v1, p1, v0

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method static synthetic p(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LF/w;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->o(LF/w;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final q([ILF/w;)I
    .locals 5

    .line 1
    invoke-interface {p2}, LF/w;->o()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p2}, LF/w;->f()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    aget v3, p1, v0

    .line 14
    .line 15
    invoke-interface {p2}, LF/w;->l()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    add-int/2addr v3, v4

    .line 20
    aput v3, p1, v0

    .line 21
    .line 22
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return v2
.end method


# virtual methods
.method public final d(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    aget-object p1, p1, p2

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
.end method

.method public final h()J
    .locals 11

    .line 1
    sget-object v0, Li1/r;->b:Li1/r$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Li1/r$a;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->i:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    :goto_0
    if-ge v4, v3, :cond_1

    .line 15
    .line 16
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    check-cast v5, Landroidx/compose/foundation/lazy/layout/b;

    .line 21
    .line 22
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/b;->e()Lv0/c;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    invoke-static {v0, v1}, Li1/r;->g(J)I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/b;->h()J

    .line 33
    .line 34
    .line 35
    move-result-wide v8

    .line 36
    invoke-static {v8, v9}, Li1/n;->k(J)I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    invoke-virtual {v6}, Lv0/c;->w()J

    .line 41
    .line 42
    .line 43
    move-result-wide v9

    .line 44
    invoke-static {v9, v10}, Li1/r;->g(J)I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    add-int/2addr v8, v9

    .line 49
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-static {v0, v1}, Li1/r;->f(J)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/b;->h()J

    .line 58
    .line 59
    .line 60
    move-result-wide v8

    .line 61
    invoke-static {v8, v9}, Li1/n;->l(J)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-virtual {v6}, Lv0/c;->w()J

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    invoke-static {v5, v6}, Li1/r;->f(J)I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    add-int/2addr v1, v5

    .line 74
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-static {v7, v0}, Li1/s;->a(II)J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    return-wide v0
.end method

.method public final i()Landroidx/compose/ui/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->k:Landroidx/compose/ui/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/c;LF/x;ZZIZIILGf/O;Ls0/Z0;)V
    .locals 42

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move/from16 v10, p9

    .line 1
    iget-object v11, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->b:Landroidx/compose/foundation/lazy/layout/c;

    .line 2
    iput-object v9, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->b:Landroidx/compose/foundation/lazy/layout/c;

    .line 3
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    const/4 v12, 0x0

    move v3, v12

    :goto_0
    if-ge v3, v2, :cond_1

    .line 4
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 5
    check-cast v4, LF/w;

    .line 6
    invoke-direct {v0, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f(LF/w;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 7
    :cond_1
    iget-object v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    invoke-virtual {v2}, Lt/c0;->h()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 8
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->n()V

    return-void

    .line 9
    :cond_2
    :goto_1
    iget v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->c:I

    .line 10
    invoke-static {v8}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF/w;

    if-eqz v3, :cond_3

    invoke-interface {v3}, LF/w;->getIndex()I

    move-result v3

    goto :goto_2

    :cond_3
    move v3, v12

    :goto_2
    iput v3, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->c:I

    if-eqz p7, :cond_4

    .line 11
    invoke-static {v12, v1}, Li1/o;->a(II)J

    goto :goto_3

    .line 12
    :cond_4
    invoke-static {v1, v12}, Li1/o;->a(II)J

    :goto_3
    if-nez p8, :cond_6

    if-nez p10, :cond_5

    goto :goto_4

    :cond_5
    move v14, v12

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v14, 0x1

    .line 13
    :goto_5
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    .line 14
    iget-object v3, v1, Lt/c0;->b:[Ljava/lang/Object;

    .line 15
    iget-object v1, v1, Lt/c0;->a:[J

    .line 16
    array-length v4, v1

    const/4 v15, 0x2

    sub-int/2addr v4, v15

    const-wide/16 v16, 0x80

    const-wide/16 v18, 0xff

    const/16 v20, 0x7

    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    if-ltz v4, :cond_a

    move/from16 p7, v12

    .line 17
    :goto_6
    aget-wide v12, v1, p7

    const/16 p10, 0x8

    not-long v5, v12

    shl-long v5, v5, v20

    and-long/2addr v5, v12

    and-long v5, v5, v21

    cmp-long v5, v5, v21

    if-eqz v5, :cond_9

    sub-int v5, p7, v4

    not-int v5, v5

    ushr-int/lit8 v5, v5, 0x1f

    rsub-int/lit8 v5, v5, 0x8

    const/4 v6, 0x0

    :goto_7
    if-ge v6, v5, :cond_8

    and-long v24, v12, v18

    cmp-long v24, v24, v16

    if-gez v24, :cond_7

    shl-int/lit8 v24, p7, 0x3

    add-int v24, v24, v6

    .line 18
    aget-object v15, v3, v24

    move-object/from16 v24, v1

    .line 19
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d:Lt/Q;

    invoke-virtual {v1, v15}, Lt/Q;->h(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_7
    move-object/from16 v24, v1

    :goto_8
    shr-long v12, v12, p10

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, v24

    const/4 v15, 0x2

    goto :goto_7

    :cond_8
    move-object/from16 v24, v1

    move/from16 v1, p10

    if-ne v5, v1, :cond_b

    :goto_9
    move/from16 v12, p7

    goto :goto_a

    :cond_9
    move-object/from16 v24, v1

    move/from16 v1, p10

    goto :goto_9

    :goto_a
    if-eq v12, v4, :cond_b

    add-int/lit8 v5, v12, 0x1

    move/from16 p7, v5

    move-object/from16 v1, v24

    const/4 v15, 0x2

    goto :goto_6

    :cond_a
    const/16 v1, 0x8

    .line 20
    :cond_b
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_b
    const/4 v6, 0x0

    const/4 v12, -0x1

    if-ge v4, v3, :cond_16

    .line 21
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 22
    check-cast v5, LF/w;

    .line 23
    iget-object v13, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d:Lt/Q;

    invoke-interface {v5}, LF/w;->getKey()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v13, v15}, Lt/Q;->y(Ljava/lang/Object;)Z

    .line 24
    invoke-direct {v0, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f(LF/w;)Z

    move-result v13

    if-eqz v13, :cond_14

    .line 25
    iget-object v13, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    invoke-interface {v5}, LF/w;->getKey()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v13, v15}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v26, v13

    check-cast v26, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    if-eqz v11, :cond_c

    .line 26
    invoke-interface {v5}, LF/w;->getKey()Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v11, v13}, Landroidx/compose/foundation/lazy/layout/c;->c(Ljava/lang/Object;)I

    move-result v13

    goto :goto_c

    :cond_c
    move v13, v12

    :goto_c
    if-ne v13, v12, :cond_d

    if-eqz v11, :cond_d

    const/4 v15, 0x1

    goto :goto_d

    :cond_d
    const/4 v15, 0x0

    :goto_d
    if-nez v26, :cond_11

    .line 27
    new-instance v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    invoke-direct {v6, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V

    const/16 v33, 0x20

    const/16 v34, 0x0

    const/16 v32, 0x0

    move/from16 v30, p11

    move/from16 v31, p12

    move-object/from16 v28, p13

    move-object/from16 v29, p14

    move-object/from16 v27, v5

    move-object/from16 v26, v6

    .line 28
    invoke-static/range {v26 .. v34}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->l(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;LF/w;LGf/O;Ls0/Z0;IIIILjava/lang/Object;)V

    .line 29
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    invoke-interface {v5}, LF/w;->getKey()Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v1, v12, v6}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    invoke-interface {v5}, LF/w;->getIndex()I

    move-result v1

    if-eq v1, v13, :cond_f

    const/4 v1, -0x1

    if-eq v13, v1, :cond_f

    if-ge v13, v2, :cond_e

    .line 31
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->e:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_12

    .line 32
    :cond_e
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_f
    const/4 v1, 0x0

    .line 33
    invoke-interface {v5, v1}, LF/w;->n(I)J

    move-result-wide v12

    invoke-interface {v5}, LF/w;->j()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {v12, v13}, Li1/n;->l(J)I

    move-result v1

    goto :goto_e

    :cond_10
    invoke-static {v12, v13}, Li1/n;->k(J)I

    move-result v1

    .line 34
    :goto_e
    invoke-direct {v0, v5, v1, v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->j(LF/w;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;)V

    if-eqz v15, :cond_15

    .line 35
    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v1

    .line 36
    array-length v5, v1

    const/4 v6, 0x0

    :goto_f
    if-ge v6, v5, :cond_15

    aget-object v12, v1, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_f

    :cond_11
    if-eqz v14, :cond_15

    const/16 v33, 0x20

    const/16 v34, 0x0

    const/16 v32, 0x0

    move/from16 v30, p11

    move/from16 v31, p12

    move-object/from16 v28, p13

    move-object/from16 v29, p14

    move-object/from16 v27, v5

    .line 37
    invoke-static/range {v26 .. v34}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->l(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;LF/w;LGf/O;Ls0/Z0;IIIILjava/lang/Object;)V

    .line 38
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v1

    .line 39
    array-length v12, v1

    const/4 v13, 0x0

    :goto_10
    if-ge v13, v12, :cond_12

    aget-object v24, v1, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_10

    :cond_12
    if-eqz v15, :cond_13

    .line 40
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v1

    .line 41
    array-length v12, v1

    const/4 v13, 0x0

    :goto_11
    if-ge v13, v12, :cond_13

    aget-object v15, v1, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_11

    :cond_13
    const/4 v1, 0x2

    const/4 v12, 0x0

    .line 42
    invoke-static {v0, v5, v12, v1, v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->p(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LF/w;ZILjava/lang/Object;)V

    goto :goto_12

    .line 43
    :cond_14
    invoke-interface {v5}, LF/w;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->m(Ljava/lang/Object;)V

    :cond_15
    :goto_12
    add-int/lit8 v4, v4, 0x1

    const/16 v1, 0x8

    goto/16 :goto_b

    .line 44
    :cond_16
    new-array v12, v10, [I

    const/4 v1, 0x0

    :goto_13
    if-ge v1, v10, :cond_17

    const/16 v23, 0x0

    aput v23, v12, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_13

    :cond_17
    if-eqz v14, :cond_1d

    if-eqz v11, :cond_1d

    .line 45
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1a

    .line 46
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->e:Ljava/util/List;

    .line 47
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_18

    new-instance v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$e;

    invoke-direct {v2, v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$e;-><init>(Landroidx/compose/foundation/lazy/layout/c;)V

    invoke-static {v1, v2}, LUd/u;->B(Ljava/util/List;Ljava/util/Comparator;)V

    .line 48
    :cond_18
    iget-object v13, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->e:Ljava/util/List;

    .line 49
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v15

    const/4 v1, 0x0

    :goto_14
    if-ge v1, v15, :cond_19

    .line 50
    invoke-interface {v13, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 51
    check-cast v2, LF/w;

    .line 52
    invoke-direct {v0, v12, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->q([ILF/w;)I

    move-result v3

    sub-int v3, p11, v3

    const/4 v4, 0x4

    const/4 v5, 0x0

    move/from16 v24, v1

    move-object v1, v2

    move v2, v3

    const/4 v3, 0x0

    move-object/from16 v26, v12

    const/16 v12, 0x8

    .line 53
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->k(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LF/w;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;ILjava/lang/Object;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 54
    invoke-static {v0, v1, v3, v2, v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->p(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LF/w;ZILjava/lang/Object;)V

    add-int/lit8 v1, v24, 0x1

    move-object/from16 v12, v26

    goto :goto_14

    :cond_19
    move-object/from16 v26, v12

    const/16 v12, 0x8

    const/16 v30, 0x6

    const/16 v31, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    .line 55
    invoke-static/range {v26 .. v31}, LUd/n;->x([IIIIILjava/lang/Object;)V

    move-object/from16 v13, v26

    goto :goto_15

    :cond_1a
    move-object v13, v12

    const/16 v12, 0x8

    .line 56
    :goto_15
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1e

    .line 57
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f:Ljava/util/List;

    .line 58
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_1b

    new-instance v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$c;

    invoke-direct {v2, v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$c;-><init>(Landroidx/compose/foundation/lazy/layout/c;)V

    invoke-static {v1, v2}, LUd/u;->B(Ljava/util/List;Ljava/util/Comparator;)V

    .line 59
    :cond_1b
    iget-object v15, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f:Ljava/util/List;

    .line 60
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_16
    if-ge v2, v1, :cond_1c

    .line 61
    invoke-interface {v15, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 62
    check-cast v3, LF/w;

    .line 63
    invoke-direct {v0, v13, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->q([ILF/w;)I

    move-result v4

    add-int v4, p12, v4

    .line 64
    invoke-interface {v3}, LF/w;->l()I

    move-result v5

    sub-int/2addr v4, v5

    move v5, v2

    move v2, v4

    const/4 v4, 0x4

    move/from16 v24, v5

    const/4 v5, 0x0

    move/from16 v26, v1

    move-object v1, v3

    const/4 v3, 0x0

    .line 65
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->k(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LF/w;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;ILjava/lang/Object;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 66
    invoke-static {v0, v1, v3, v2, v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->p(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LF/w;ZILjava/lang/Object;)V

    add-int/lit8 v2, v24, 0x1

    move/from16 v1, v26

    goto :goto_16

    :cond_1c
    const/16 v30, 0x6

    const/16 v31, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v26, v13

    .line 67
    invoke-static/range {v26 .. v31}, LUd/n;->x([IIIIILjava/lang/Object;)V

    goto :goto_17

    :cond_1d
    move-object v13, v12

    const/16 v12, 0x8

    .line 68
    :cond_1e
    :goto_17
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d:Lt/Q;

    .line 69
    iget-object v2, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 70
    iget-object v1, v1, Lt/e0;->a:[J

    .line 71
    array-length v3, v1

    const/16 v25, 0x2

    add-int/lit8 v3, v3, -0x2

    if-ltz v3, :cond_27

    const/4 v4, 0x0

    .line 72
    :goto_18
    aget-wide v5, v1, v4

    move/from16 p10, v12

    move-object/from16 v26, v13

    not-long v12, v5

    shl-long v12, v12, v20

    and-long/2addr v12, v5

    and-long v12, v12, v21

    cmp-long v12, v12, v21

    if-eqz v12, :cond_26

    sub-int v12, v4, v3

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    rsub-int/lit8 v12, v12, 0x8

    move-wide/from16 v24, v5

    const/4 v5, 0x0

    :goto_19
    if-ge v5, v12, :cond_25

    and-long v27, v24, v18

    cmp-long v6, v27, v16

    if-gez v6, :cond_24

    shl-int/lit8 v6, v4, 0x3

    add-int/2addr v6, v5

    .line 73
    aget-object v6, v2, v6

    .line 74
    iget-object v13, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    invoke-virtual {v13, v6}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    check-cast v13, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    .line 75
    invoke-interface {v9, v6}, Landroidx/compose/foundation/lazy/layout/c;->c(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v33, v1

    .line 76
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->g()I

    move-result v1

    invoke-static {v10, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {v13, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->j(I)V

    .line 77
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->g()I

    move-result v1

    sub-int v1, v10, v1

    move-object/from16 v34, v2

    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->d()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {v13, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->i(I)V

    const/4 v1, -0x1

    if-ne v15, v1, :cond_20

    .line 78
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v2

    .line 79
    array-length v13, v2

    const/4 v15, 0x0

    :goto_1a
    if-ge v15, v13, :cond_1f

    aget-object v27, v2, v15

    add-int/lit8 v15, v15, 0x1

    goto :goto_1a

    .line 80
    :cond_1f
    invoke-direct {v0, v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->m(Ljava/lang/Object;)V

    goto :goto_1c

    .line 81
    :cond_20
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->b()Li1/b;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {v2}, Li1/b;->r()J

    move-result-wide v31

    .line 82
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->d()I

    move-result v29

    .line 83
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->g()I

    move-result v30

    move-object/from16 v27, p6

    move/from16 v28, v15

    .line 84
    invoke-interface/range {v27 .. v32}, LF/x;->a(IIIJ)LF/w;

    move-result-object v2

    const/4 v1, 0x1

    .line 85
    invoke-interface {v2, v1}, LF/w;->h(Z)V

    .line 86
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v1

    move-object/from16 v36, v2

    .line 87
    array-length v2, v1

    move-object/from16 v27, v1

    const/4 v1, 0x0

    :goto_1b
    if-ge v1, v2, :cond_21

    aget-object v28, v27, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1b

    :cond_21
    if-eqz v11, :cond_22

    .line 88
    invoke-interface {v11, v6}, Landroidx/compose/foundation/lazy/layout/c;->c(Ljava/lang/Object;)I

    move-result v1

    if-ne v15, v1, :cond_22

    .line 89
    invoke-direct {v0, v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->m(Ljava/lang/Object;)V

    goto :goto_1c

    .line 90
    :cond_22
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->c()I

    move-result v41

    move/from16 v39, p11

    move/from16 v40, p12

    move-object/from16 v37, p13

    move-object/from16 v38, p14

    move-object/from16 v35, v13

    .line 91
    invoke-virtual/range {v35 .. v41}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->k(LF/w;LGf/O;Ls0/Z0;III)V

    move-object/from16 v1, v36

    .line 92
    iget v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->c:I

    if-ge v15, v2, :cond_23

    .line 93
    iget-object v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    .line 94
    :cond_23
    iget-object v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    :cond_24
    move-object/from16 v33, v1

    move-object/from16 v34, v2

    :goto_1c
    shr-long v24, v24, p10

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v1, v33

    move-object/from16 v2, v34

    goto/16 :goto_19

    :cond_25
    move-object/from16 v33, v1

    move-object/from16 v34, v2

    move/from16 v1, p10

    if-ne v12, v1, :cond_28

    goto :goto_1d

    :cond_26
    move-object/from16 v33, v1

    move-object/from16 v34, v2

    move/from16 v1, p10

    :goto_1d
    if-eq v4, v3, :cond_28

    add-int/lit8 v4, v4, 0x1

    move v12, v1

    move-object/from16 v13, v26

    move-object/from16 v1, v33

    move-object/from16 v2, v34

    goto/16 :goto_18

    :cond_27
    move-object/from16 v26, v13

    .line 95
    :cond_28
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2d

    .line 96
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    .line 97
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_29

    new-instance v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$f;

    invoke-direct {v2, v9}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$f;-><init>(Landroidx/compose/foundation/lazy/layout/c;)V

    invoke-static {v1, v2}, LUd/u;->B(Ljava/util/List;Ljava/util/Comparator;)V

    .line 98
    :cond_29
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    .line 99
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1e
    if-ge v3, v2, :cond_2c

    .line 100
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 101
    check-cast v4, LF/w;

    .line 102
    iget-object v5, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    invoke-interface {v4}, LF/w;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    check-cast v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    move-object/from16 v13, v26

    .line 103
    invoke-direct {v0, v13, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->q([ILF/w;)I

    move-result v6

    if-eqz p8, :cond_2a

    .line 104
    invoke-static {v8}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LF/w;

    invoke-direct {v0, v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g(LF/w;)I

    move-result v10

    goto :goto_1f

    .line 105
    :cond_2a
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->f()I

    move-result v10

    :goto_1f
    sub-int/2addr v10, v6

    .line 106
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->c()I

    move-result v5

    move/from16 v6, p2

    .line 107
    invoke-interface {v4, v10, v5, v6, v7}, LF/w;->k(IIII)V

    if-eqz v14, :cond_2b

    const/4 v5, 0x1

    .line 108
    invoke-direct {v0, v4, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->o(LF/w;Z)V

    :cond_2b
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v26, v13

    goto :goto_1e

    :cond_2c
    move/from16 v6, p2

    move-object/from16 v13, v26

    const/16 v30, 0x6

    const/16 v31, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    .line 109
    invoke-static/range {v26 .. v31}, LUd/n;->x([IIIIILjava/lang/Object;)V

    goto :goto_20

    :cond_2d
    move/from16 v6, p2

    move-object/from16 v13, v26

    .line 110
    :goto_20
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_31

    .line 111
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    .line 112
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_2e

    new-instance v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$d;

    invoke-direct {v2, v9}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$d;-><init>(Landroidx/compose/foundation/lazy/layout/c;)V

    invoke-static {v1, v2}, LUd/u;->B(Ljava/util/List;Ljava/util/Comparator;)V

    .line 113
    :cond_2e
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    .line 114
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_21
    if-ge v3, v2, :cond_31

    .line 115
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 116
    check-cast v4, LF/w;

    .line 117
    iget-object v5, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    invoke-interface {v4}, LF/w;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v5, v9}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    check-cast v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    .line 118
    invoke-direct {v0, v13, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->q([ILF/w;)I

    move-result v9

    if-eqz p8, :cond_2f

    .line 119
    invoke-static {v8}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    .line 120
    check-cast v10, LF/w;

    invoke-direct {v0, v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g(LF/w;)I

    move-result v10

    goto :goto_22

    .line 121
    :cond_2f
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->e()I

    move-result v10

    invoke-interface {v4}, LF/w;->l()I

    move-result v11

    sub-int/2addr v10, v11

    :goto_22
    add-int/2addr v10, v9

    .line 122
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->c()I

    move-result v5

    .line 123
    invoke-interface {v4, v10, v5, v6, v7}, LF/w;->k(IIII)V

    const/4 v5, 0x1

    if-eqz v14, :cond_30

    .line 124
    invoke-direct {v0, v4, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->o(LF/w;Z)V

    :cond_30
    add-int/lit8 v3, v3, 0x1

    goto :goto_21

    .line 125
    :cond_31
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    invoke-static {v1}, LUd/u;->Z(Ljava/util/List;)V

    sget-object v2, LTd/L;->a:LTd/L;

    const/4 v3, 0x0

    invoke-interface {v8, v3, v1}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 126
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    invoke-interface {v8, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 127
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 128
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 129
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 130
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 131
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d:Lt/Q;

    invoke-virtual {v1}, Lt/Q;->m()V

    return-void
.end method

.method public final n()V
    .locals 14

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/c0;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    .line 10
    .line 11
    iget-object v1, v0, Lt/c0;->c:[Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v0, v0, Lt/c0;->a:[J

    .line 14
    .line 15
    array-length v2, v0

    .line 16
    add-int/lit8 v2, v2, -0x2

    .line 17
    .line 18
    if-ltz v2, :cond_3

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    move v4, v3

    .line 22
    :goto_0
    aget-wide v5, v0, v4

    .line 23
    .line 24
    not-long v7, v5

    .line 25
    const/4 v9, 0x7

    .line 26
    shl-long/2addr v7, v9

    .line 27
    and-long/2addr v7, v5

    .line 28
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v7, v9

    .line 34
    cmp-long v7, v7, v9

    .line 35
    .line 36
    if-eqz v7, :cond_2

    .line 37
    .line 38
    sub-int v7, v4, v2

    .line 39
    .line 40
    not-int v7, v7

    .line 41
    ushr-int/lit8 v7, v7, 0x1f

    .line 42
    .line 43
    const/16 v8, 0x8

    .line 44
    .line 45
    rsub-int/lit8 v7, v7, 0x8

    .line 46
    .line 47
    move v9, v3

    .line 48
    :goto_1
    if-ge v9, v7, :cond_1

    .line 49
    .line 50
    const-wide/16 v10, 0xff

    .line 51
    .line 52
    and-long/2addr v10, v5

    .line 53
    const-wide/16 v12, 0x80

    .line 54
    .line 55
    cmp-long v10, v10, v12

    .line 56
    .line 57
    if-gez v10, :cond_0

    .line 58
    .line 59
    shl-int/lit8 v10, v4, 0x3

    .line 60
    .line 61
    add-int/2addr v10, v9

    .line 62
    aget-object v10, v1, v10

    .line 63
    .line 64
    check-cast v10, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    .line 65
    .line 66
    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    array-length v11, v10

    .line 71
    move v12, v3

    .line 72
    :goto_2
    if-ge v12, v11, :cond_0

    .line 73
    .line 74
    aget-object v13, v10, v12

    .line 75
    .line 76
    add-int/lit8 v12, v12, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_0
    shr-long/2addr v5, v8

    .line 80
    add-int/lit8 v9, v9, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    if-ne v7, v8, :cond_3

    .line 84
    .line 85
    :cond_2
    if-eq v4, v2, :cond_3

    .line 86
    .line 87
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lt/P;

    .line 91
    .line 92
    invoke-virtual {v0}, Lt/P;->k()V

    .line 93
    .line 94
    .line 95
    :cond_4
    sget-object v0, Landroidx/compose/foundation/lazy/layout/c;->a:Landroidx/compose/foundation/lazy/layout/c$a;

    .line 96
    .line 97
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->b:Landroidx/compose/foundation/lazy/layout/c;

    .line 98
    .line 99
    const/4 v0, -0x1

    .line 100
    iput v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->c:I

    .line 101
    .line 102
    return-void
.end method
