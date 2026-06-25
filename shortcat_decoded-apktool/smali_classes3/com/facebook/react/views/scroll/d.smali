.class public final Lcom/facebook/react/views/scroll/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/Collection;
.implements Lje/b;


# instance fields
.field private final a:Z

.field private b:Lcom/facebook/react/views/scroll/c;

.field private final c:Ljava/util/Map;


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/d;->a:Z

    .line 5
    .line 6
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/facebook/react/views/scroll/d;->c:Ljava/util/Map;

    .line 12
    .line 13
    return-void
.end method

.method static synthetic A(Lcom/facebook/react/views/scroll/d;Landroid/graphics/Rect;Ljava/lang/String;ILjava/lang/Object;)Lcom/facebook/react/views/scroll/b;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const-string p2, ""

    .line 6
    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/d;->z(Landroid/graphics/Rect;Ljava/lang/String;)Lcom/facebook/react/views/scroll/b;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private final D(Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/c;->i(Lcom/facebook/react/views/scroll/c;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lcom/facebook/react/views/scroll/c;->k(Lcom/facebook/react/views/scroll/c;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/d;->G(Lcom/facebook/react/views/scroll/c;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/d;->I(Lcom/facebook/react/views/scroll/c;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/d;->G(Lcom/facebook/react/views/scroll/c;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/d;->I(Lcom/facebook/react/views/scroll/c;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string v0, "[IntervalTree] AVL node\'s right must not be null when rotating left."

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method

.method private final F(Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/c;->k(Lcom/facebook/react/views/scroll/c;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lcom/facebook/react/views/scroll/c;->i(Lcom/facebook/react/views/scroll/c;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/d;->G(Lcom/facebook/react/views/scroll/c;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/d;->I(Lcom/facebook/react/views/scroll/c;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/d;->G(Lcom/facebook/react/views/scroll/c;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/d;->I(Lcom/facebook/react/views/scroll/c;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string v0, "[IntervalTree] AVL node\'s left must not be null when rotating right."

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method

.method private final G(Lcom/facebook/react/views/scroll/c;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/d;->t(Lcom/facebook/react/views/scroll/c;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, v1}, Lcom/facebook/react/views/scroll/d;->t(Lcom/facebook/react/views/scroll/c;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/c;->g(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private final I(Lcom/facebook/react/views/scroll/c;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->b()Lcom/facebook/react/views/scroll/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/b;->a()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/facebook/react/views/scroll/c;->d()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v2

    .line 23
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v3}, Lcom/facebook/react/views/scroll/c;->d()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    :cond_1
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/c;->j(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private final d(Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/d;->G(Lcom/facebook/react/views/scroll/c;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/d;->I(Lcom/facebook/react/views/scroll/c;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/d;->e(Lcom/facebook/react/views/scroll/c;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-le v0, v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/d;->e(Lcom/facebook/react/views/scroll/c;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-gez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/d;->D(Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/c;->i(Lcom/facebook/react/views/scroll/c;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    const-string v0, "[IntervalTree] node.left must not be null when performing left rotation around it"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/d;->F(Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_2
    const/4 v1, -0x1

    .line 52
    if-ge v0, v1, :cond_5

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/d;->e(Lcom/facebook/react/views/scroll/c;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-lez v0, :cond_4

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/d;->F(Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/c;->k(Lcom/facebook/react/views/scroll/c;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    const-string v0, "[IntervalTree] node.right must not be null when performing right rotation around it"

    .line 81
    .line 82
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_4
    :goto_1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/d;->D(Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    :cond_5
    return-object p1
.end method

.method private final e(Lcom/facebook/react/views/scroll/c;)I
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/d;->t(Lcom/facebook/react/views/scroll/c;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/d;->t(Lcom/facebook/react/views/scroll/c;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    sub-int/2addr v0, p1

    .line 22
    return v0
.end method

.method private final f(Lcom/facebook/react/views/scroll/b;Lcom/facebook/react/views/scroll/b;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/b;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/b;->c()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/b;->c()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/b;->c()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(II)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/b;->a()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/b;->a()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eq v0, v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/b;->a()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/b;->a()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(II)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1

    .line 47
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/b;->b()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/b;->b()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    return p1
.end method

.method private final l(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/c;->b()Lcom/facebook/react/views/scroll/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->b()Lcom/facebook/react/views/scroll/b;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {p0, v1, v2}, Lcom/facebook/react/views/scroll/d;->f(Lcom/facebook/react/views/scroll/b;Lcom/facebook/react/views/scroll/b;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-gez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {p0, v1, p2}, Lcom/facebook/react/views/scroll/d;->l(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->i(Lcom/facebook/react/views/scroll/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/c;->b()Lcom/facebook/react/views/scroll/b;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->b()Lcom/facebook/react/views/scroll/b;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-direct {p0, v1, v2}, Lcom/facebook/react/views/scroll/d;->f(Lcom/facebook/react/views/scroll/b;Lcom/facebook/react/views/scroll/b;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-lez v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {p0, v1, p2}, Lcom/facebook/react/views/scroll/d;->l(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->k(Lcom/facebook/react/views/scroll/c;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    if-nez p2, :cond_3

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    if-nez p2, :cond_4

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    goto :goto_0

    .line 79
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-eqz p2, :cond_6

    .line 84
    .line 85
    invoke-direct {p0, p2}, Lcom/facebook/react/views/scroll/d;->n(Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/c;->f()Lcom/facebook/react/views/scroll/r;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {p1, v1}, Lcom/facebook/react/views/scroll/c;->l(Lcom/facebook/react/views/scroll/r;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/c;->b()Lcom/facebook/react/views/scroll/b;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {p1, v1}, Lcom/facebook/react/views/scroll/c;->h(Lcom/facebook/react/views/scroll/b;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-direct {p0, v1, p2}, Lcom/facebook/react/views/scroll/d;->l(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->k(Lcom/facebook/react/views/scroll/c;)V

    .line 112
    .line 113
    .line 114
    :goto_0
    if-nez p1, :cond_5

    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_5
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/d;->d(Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 123
    .line 124
    const-string p2, "[IntervalTree] node.right must not be null when finding node\'s successor"

    .line 125
    .line 126
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p1
.end method

.method private final n(Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/d;->n(Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    return-object p1
.end method

.method private final t(Lcom/facebook/react/views/scroll/c;)I
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->a()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return p1
.end method

.method private final u(Lcom/facebook/react/views/scroll/c;Ljava/util/List;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-direct {p0, v0, p2}, Lcom/facebook/react/views/scroll/d;->u(Lcom/facebook/react/views/scroll/c;Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->f()Lcom/facebook/react/views/scroll/r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/d;->u(Lcom/facebook/react/views/scroll/c;Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private final v(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p2

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/c;->b()Lcom/facebook/react/views/scroll/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->b()Lcom/facebook/react/views/scroll/b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/views/scroll/d;->f(Lcom/facebook/react/views/scroll/b;Lcom/facebook/react/views/scroll/b;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-gez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p0, v0, p2}, Lcom/facebook/react/views/scroll/d;->v(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->i(Lcom/facebook/react/views/scroll/c;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {p0, v0, p2}, Lcom/facebook/react/views/scroll/d;->v(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->k(Lcom/facebook/react/views/scroll/c;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/d;->d(Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1
.end method

.method private final y(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/b;Ljava/util/Set;)V
    .locals 7

    .line 1
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-static {}, Lh7/b;->B()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "VirtualViewContainerStateExperimental:"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "queryHelper"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->f()Lcom/facebook/react/views/scroll/r;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    invoke-interface {v2}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v2, v1

    .line 47
    :goto_0
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->f()Lcom/facebook/react/views/scroll/r;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    invoke-interface {v3}, Lcom/facebook/react/views/scroll/r;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/b;->c()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/b;->a()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    new-instance v5, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v6, "Check node ("

    .line 73
    .line 74
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v2, ", "

    .line 81
    .line 82
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, ") against interval("

    .line 89
    .line 90
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ")"

    .line 103
    .line 104
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v0, v1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_2
    if-eqz p1, :cond_5

    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->d()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/b;->c()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-gt v0, v1, :cond_3

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->c()Lcom/facebook/react/views/scroll/c;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/react/views/scroll/d;->y(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/b;Ljava/util/Set;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->b()Lcom/facebook/react/views/scroll/b;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0, p2}, Lcom/facebook/react/views/scroll/b;->d(Lcom/facebook/react/views/scroll/b;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_4

    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->f()Lcom/facebook/react/views/scroll/r;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {p3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->b()Lcom/facebook/react/views/scroll/b;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/b;->c()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/b;->a()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-ge v0, v1, :cond_5

    .line 168
    .line 169
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->e()Lcom/facebook/react/views/scroll/c;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/views/scroll/d;->y(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/b;Ljava/util/Set;)V

    .line 174
    .line 175
    .line 176
    :cond_5
    :goto_1
    return-void
.end method

.method private final z(Landroid/graphics/Rect;Ljava/lang/String;)Lcom/facebook/react/views/scroll/b;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/d;->a:Z

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Lcom/facebook/react/views/scroll/b;

    .line 8
    .line 9
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 10
    .line 11
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 12
    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    move-object p2, v1

    .line 16
    :cond_0
    invoke-direct {v0, v2, p1, p2}, Lcom/facebook/react/views/scroll/b;-><init>(IILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Lcom/facebook/react/views/scroll/b;

    .line 21
    .line 22
    iget v2, p1, Landroid/graphics/Rect;->top:I

    .line 23
    .line 24
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 25
    .line 26
    if-nez p2, :cond_2

    .line 27
    .line 28
    move-object p2, v1

    .line 29
    :cond_2
    invoke-direct {v0, v2, p1, p2}, Lcom/facebook/react/views/scroll/b;-><init>(IILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method


# virtual methods
.method public B(Lcom/facebook/react/views/scroll/r;)Z
    .locals 2

    .line 1
    const-string v0, "element"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/scroll/d;->c:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/facebook/react/views/scroll/c;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Lcom/facebook/react/views/scroll/d;->b:Lcom/facebook/react/views/scroll/c;

    .line 21
    .line 22
    invoke-direct {p0, v1, v0}, Lcom/facebook/react/views/scroll/d;->l(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/facebook/react/views/scroll/d;->b:Lcom/facebook/react/views/scroll/c;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/facebook/react/views/scroll/d;->c:Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_0
    const/4 p1, 0x0

    .line 40
    return p1
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/scroll/r;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/d;->b(Lcom/facebook/react/views/scroll/r;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/facebook/react/views/scroll/r;

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/scroll/d;->b(Lcom/facebook/react/views/scroll/r;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return v0
.end method

.method public b(Lcom/facebook/react/views/scroll/r;)Z
    .locals 12

    .line 1
    const-string v0, "element"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/facebook/react/views/scroll/d;->c:Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/facebook/react/views/scroll/c;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, Lcom/facebook/react/views/scroll/d;->b:Lcom/facebook/react/views/scroll/c;

    .line 21
    .line 22
    invoke-direct {p0, v2, v1}, Lcom/facebook/react/views/scroll/d;->l(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, p0, Lcom/facebook/react/views/scroll/d;->b:Lcom/facebook/react/views/scroll/c;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x1

    .line 31
    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-direct {p0, v2, v0}, Lcom/facebook/react/views/scroll/d;->z(Landroid/graphics/Rect;Ljava/lang/String;)Lcom/facebook/react/views/scroll/b;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    new-instance v3, Lcom/facebook/react/views/scroll/c;

    .line 40
    .line 41
    const/16 v10, 0x3c

    .line 42
    .line 43
    const/4 v11, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    move-object v5, p1

    .line 49
    invoke-direct/range {v3 .. v11}, Lcom/facebook/react/views/scroll/c;-><init>(Lcom/facebook/react/views/scroll/b;Lcom/facebook/react/views/scroll/r;IILcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/facebook/react/views/scroll/d;->b:Lcom/facebook/react/views/scroll/c;

    .line 53
    .line 54
    invoke-direct {p0, p1, v3}, Lcom/facebook/react/views/scroll/d;->v(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;)Lcom/facebook/react/views/scroll/c;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lcom/facebook/react/views/scroll/d;->b:Lcom/facebook/react/views/scroll/c;

    .line 59
    .line 60
    iget-object p1, p0, Lcom/facebook/react/views/scroll/d;->c:Ljava/util/Map;

    .line 61
    .line 62
    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    invoke-static {}, Lh7/b;->B()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_1

    .line 76
    .line 77
    new-instance p1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v0, "VirtualViewContainerStateExperimental:"

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v0, "IntervalTree: add"

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-interface {v5}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v5}, Lcom/facebook/react/views/scroll/r;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v3}, Lcom/facebook/react/views/scroll/c;->b()Lcom/facebook/react/views/scroll/b;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v3}, Lcom/facebook/react/views/scroll/b;->b()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    new-instance v4, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v5, "New VirtualView: ("

    .line 118
    .line 119
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v0, ", "

    .line 126
    .line 127
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v0, "). Node interval "

    .line 134
    .line 135
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {p1, v0}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :cond_1
    return v1
.end method

.method public clear()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/facebook/react/views/scroll/d;->b:Lcom/facebook/react/views/scroll/c;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/scroll/d;->c:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/facebook/react/views/scroll/r;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lcom/facebook/react/views/scroll/r;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/d;->i(Lcom/facebook/react/views/scroll/r;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lcom/facebook/react/views/scroll/r;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/scroll/d;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    return p1

    .line 43
    :cond_2
    return v1
.end method

.method public i(Lcom/facebook/react/views/scroll/r;)Z
    .locals 1

    .line 1
    const-string v0, "element"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/scroll/d;->c:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/d;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/react/views/scroll/d;->b:Lcom/facebook/react/views/scroll/c;

    .line 7
    .line 8
    invoke-direct {p0, v1, v0}, Lcom/facebook/react/views/scroll/d;->u(Lcom/facebook/react/views/scroll/c;Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public p()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/d;->c:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final r(Ljava/lang/String;)Lcom/facebook/react/views/scroll/r;
    .locals 1

    .line 1
    const-string v0, "virtualViewID"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/scroll/d;->c:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/facebook/react/views/scroll/c;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->f()Lcom/facebook/react/views/scroll/r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/facebook/react/views/scroll/r;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lcom/facebook/react/views/scroll/r;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/d;->B(Lcom/facebook/react/views/scroll/r;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/facebook/react/views/scroll/r;

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/scroll/d;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/Error;

    .line 7
    .line 8
    const-string v0, "IntervalTree does not support retainAll yet"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public final bridge size()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/d;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/j;->a(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 2
    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lkotlin/jvm/internal/j;->b(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final w(Landroid/graphics/Rect;)Ljava/util/Set;
    .locals 7

    .line 1
    const-string v0, "queryRect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-static {p0, p1, v0, v1, v0}, Lcom/facebook/react/views/scroll/d;->A(Lcom/facebook/react/views/scroll/d;Landroid/graphics/Rect;Ljava/lang/String;ILjava/lang/Object;)Lcom/facebook/react/views/scroll/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const-string v3, "VirtualViewContainerStateExperimental:"

    .line 22
    .line 23
    const-string v4, "query"

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-static {}, Lh7/b;->B()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v5, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v6, "Querying tree for rect "

    .line 54
    .line 55
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {v2, p1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/views/scroll/d;->b:Lcom/facebook/react/views/scroll/c;

    .line 69
    .line 70
    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/react/views/scroll/d;->y(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/b;Ljava/util/Set;)V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    invoke-static {}, Lh7/b;->B()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_1

    .line 84
    .line 85
    new-instance p1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v2, "Query results: "

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {p1, v0}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_1
    return-object v1
.end method
