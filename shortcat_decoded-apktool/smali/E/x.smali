.class public final LE/x;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:I

.field private final b:[LE/v;

.field private final c:LE/E;

.field private final d:Ljava/util/List;

.field private final e:Z

.field private final f:I

.field private final g:I

.field private final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(I[LE/v;LE/E;Ljava/util/List;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LE/x;->a:I

    .line 5
    .line 6
    iput-object p2, p0, LE/x;->b:[LE/v;

    .line 7
    .line 8
    iput-object p3, p0, LE/x;->c:LE/E;

    .line 9
    .line 10
    iput-object p4, p0, LE/x;->d:Ljava/util/List;

    .line 11
    .line 12
    iput-boolean p5, p0, LE/x;->e:Z

    .line 13
    .line 14
    iput p6, p0, LE/x;->f:I

    .line 15
    .line 16
    array-length p1, p2

    .line 17
    const/4 p3, 0x0

    .line 18
    move p4, p3

    .line 19
    move p5, p4

    .line 20
    :goto_0
    if-ge p4, p1, :cond_0

    .line 21
    .line 22
    aget-object p6, p2, p4

    .line 23
    .line 24
    invoke-virtual {p6}, LE/v;->p()I

    .line 25
    .line 26
    .line 27
    move-result p6

    .line 28
    invoke-static {p5, p6}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result p5

    .line 32
    add-int/lit8 p4, p4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput p5, p0, LE/x;->g:I

    .line 36
    .line 37
    iget p1, p0, LE/x;->f:I

    .line 38
    .line 39
    add-int/2addr p5, p1

    .line 40
    invoke-static {p5, p3}, Loe/j;->e(II)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iput p1, p0, LE/x;->h:I

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, LE/x;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()[LE/v;
    .locals 1

    .line 1
    iget-object v0, p0, LE/x;->b:[LE/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, LE/x;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, LE/x;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE/x;->b:[LE/v;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public final f(III)[LE/v;
    .locals 13

    .line 1
    iget-object v0, p0, LE/x;->b:[LE/v;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    move v4, v3

    .line 7
    :goto_0
    if-ge v2, v1, :cond_2

    .line 8
    .line 9
    aget-object v5, v0, v2

    .line 10
    .line 11
    add-int/lit8 v12, v3, 0x1

    .line 12
    .line 13
    iget-object v6, p0, LE/x;->d:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, LE/c;

    .line 20
    .line 21
    invoke-virtual {v3}, LE/c;->g()J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    invoke-static {v6, v7}, LE/c;->d(J)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iget-object v6, p0, LE/x;->c:LE/E;

    .line 30
    .line 31
    invoke-virtual {v6}, LE/E;->a()[I

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    aget v7, v6, v4

    .line 36
    .line 37
    iget-boolean v6, p0, LE/x;->e:Z

    .line 38
    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    iget v8, p0, LE/x;->a:I

    .line 42
    .line 43
    move v10, v8

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    move v10, v4

    .line 46
    :goto_1
    if-eqz v6, :cond_1

    .line 47
    .line 48
    move v11, v4

    .line 49
    move v6, p1

    .line 50
    move v8, p2

    .line 51
    move/from16 v9, p3

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    iget v6, p0, LE/x;->a:I

    .line 55
    .line 56
    move v11, v6

    .line 57
    move v8, p2

    .line 58
    move/from16 v9, p3

    .line 59
    .line 60
    move v6, p1

    .line 61
    :goto_2
    invoke-virtual/range {v5 .. v11}, LE/v;->t(IIIIII)V

    .line 62
    .line 63
    .line 64
    sget-object v5, LTd/L;->a:LTd/L;

    .line 65
    .line 66
    add-int/2addr v4, v3

    .line 67
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    move v3, v12

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    iget-object p1, p0, LE/x;->b:[LE/v;

    .line 72
    .line 73
    return-object p1
.end method
