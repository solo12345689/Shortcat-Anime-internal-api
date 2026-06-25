.class public final Lq2/Y$c;
.super Lq2/Y;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/Y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final e:LP9/u;

.field private final f:LP9/u;

.field private final g:[I

.field private final h:[I


# direct methods
.method public constructor <init>(LP9/u;LP9/u;[I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lq2/Y;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    array-length v1, p3

    .line 9
    const/4 v2, 0x0

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v2

    .line 15
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lq2/Y$c;->e:LP9/u;

    .line 19
    .line 20
    iput-object p2, p0, Lq2/Y$c;->f:LP9/u;

    .line 21
    .line 22
    iput-object p3, p0, Lq2/Y$c;->g:[I

    .line 23
    .line 24
    array-length p1, p3

    .line 25
    new-array p1, p1, [I

    .line 26
    .line 27
    iput-object p1, p0, Lq2/Y$c;->h:[I

    .line 28
    .line 29
    :goto_1
    array-length p1, p3

    .line 30
    if-ge v2, p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Lq2/Y$c;->h:[I

    .line 33
    .line 34
    aget p2, p3, v2

    .line 35
    .line 36
    aput v2, p1, p2

    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    return-void
.end method


# virtual methods
.method public e(Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lq2/Y;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lq2/Y$c;->g:[I

    .line 13
    .line 14
    aget p1, p1, v0

    .line 15
    .line 16
    return p1

    .line 17
    :cond_1
    return v0
.end method

.method public f(Ljava/lang/Object;)I
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public g(Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lq2/Y;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    return p1

    .line 9
    :cond_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object p1, p0, Lq2/Y$c;->g:[I

    .line 12
    .line 13
    invoke-virtual {p0}, Lq2/Y$c;->t()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    aget p1, p1, v0

    .line 20
    .line 21
    return p1

    .line 22
    :cond_1
    invoke-virtual {p0}, Lq2/Y$c;->t()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    add-int/lit8 p1, p1, -0x1

    .line 27
    .line 28
    return p1
.end method

.method public i(IIZ)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    return p1

    .line 5
    :cond_0
    invoke-virtual {p0, p3}, Lq2/Y$c;->g(Z)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne p1, v1, :cond_2

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    if-ne p2, p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, p3}, Lq2/Y$c;->e(Z)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_1
    const/4 p1, -0x1

    .line 20
    return p1

    .line 21
    :cond_2
    if-eqz p3, :cond_3

    .line 22
    .line 23
    iget-object p2, p0, Lq2/Y$c;->g:[I

    .line 24
    .line 25
    iget-object p3, p0, Lq2/Y$c;->h:[I

    .line 26
    .line 27
    aget p1, p3, p1

    .line 28
    .line 29
    add-int/2addr p1, v0

    .line 30
    aget p1, p2, p1

    .line 31
    .line 32
    return p1

    .line 33
    :cond_3
    add-int/2addr p1, v0

    .line 34
    return p1
.end method

.method public k(ILq2/Y$b;Z)Lq2/Y$b;
    .locals 10

    .line 1
    iget-object p3, p0, Lq2/Y$c;->f:LP9/u;

    .line 2
    .line 3
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lq2/Y$b;

    .line 8
    .line 9
    iget-object v1, p1, Lq2/Y$b;->a:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v2, p1, Lq2/Y$b;->b:Ljava/lang/Object;

    .line 12
    .line 13
    iget v3, p1, Lq2/Y$b;->c:I

    .line 14
    .line 15
    iget-wide v4, p1, Lq2/Y$b;->d:J

    .line 16
    .line 17
    iget-wide v6, p1, Lq2/Y$b;->e:J

    .line 18
    .line 19
    iget-object v8, p1, Lq2/Y$b;->g:Lq2/b;

    .line 20
    .line 21
    iget-boolean v9, p1, Lq2/Y$b;->f:Z

    .line 22
    .line 23
    move-object v0, p2

    .line 24
    invoke-virtual/range {v0 .. v9}, Lq2/Y$b;->u(Ljava/lang/Object;Ljava/lang/Object;IJJLq2/b;Z)Lq2/Y$b;

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/Y$c;->f:LP9/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public p(IIZ)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    return p1

    .line 5
    :cond_0
    invoke-virtual {p0, p3}, Lq2/Y$c;->e(Z)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne p1, v1, :cond_2

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    if-ne p2, p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, p3}, Lq2/Y$c;->g(Z)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_1
    const/4 p1, -0x1

    .line 20
    return p1

    .line 21
    :cond_2
    if-eqz p3, :cond_3

    .line 22
    .line 23
    iget-object p2, p0, Lq2/Y$c;->g:[I

    .line 24
    .line 25
    iget-object p3, p0, Lq2/Y$c;->h:[I

    .line 26
    .line 27
    aget p1, p3, p1

    .line 28
    .line 29
    sub-int/2addr p1, v0

    .line 30
    aget p1, p2, p1

    .line 31
    .line 32
    return p1

    .line 33
    :cond_3
    sub-int/2addr p1, v0

    .line 34
    return p1
.end method

.method public q(I)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public s(ILq2/Y$d;J)Lq2/Y$d;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lq2/Y$c;->e:LP9/u;

    .line 4
    .line 5
    move/from16 v2, p1

    .line 6
    .line 7
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lq2/Y$d;

    .line 12
    .line 13
    iget-object v2, v1, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, v2

    .line 16
    iget-object v2, v1, Lq2/Y$d;->c:Lq2/C;

    .line 17
    .line 18
    move-object v4, v3

    .line 19
    iget-object v3, v1, Lq2/Y$d;->d:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v6, v4

    .line 22
    iget-wide v4, v1, Lq2/Y$d;->e:J

    .line 23
    .line 24
    move-object v8, v6

    .line 25
    iget-wide v6, v1, Lq2/Y$d;->f:J

    .line 26
    .line 27
    move-object v10, v8

    .line 28
    iget-wide v8, v1, Lq2/Y$d;->g:J

    .line 29
    .line 30
    move-object v11, v10

    .line 31
    iget-boolean v10, v1, Lq2/Y$d;->h:Z

    .line 32
    .line 33
    move-object v12, v11

    .line 34
    iget-boolean v11, v1, Lq2/Y$d;->i:Z

    .line 35
    .line 36
    move-object v13, v12

    .line 37
    iget-object v12, v1, Lq2/Y$d;->j:Lq2/C$g;

    .line 38
    .line 39
    move-object v15, v13

    .line 40
    iget-wide v13, v1, Lq2/Y$d;->l:J

    .line 41
    .line 42
    move-object/from16 v16, v2

    .line 43
    .line 44
    move-object/from16 v17, v3

    .line 45
    .line 46
    iget-wide v2, v1, Lq2/Y$d;->m:J

    .line 47
    .line 48
    iget v0, v1, Lq2/Y$d;->n:I

    .line 49
    .line 50
    move/from16 v18, v0

    .line 51
    .line 52
    iget v0, v1, Lq2/Y$d;->o:I

    .line 53
    .line 54
    move-wide/from16 v19, v2

    .line 55
    .line 56
    iget-wide v2, v1, Lq2/Y$d;->p:J

    .line 57
    .line 58
    move-object/from16 v21, v1

    .line 59
    .line 60
    move-object v1, v15

    .line 61
    move/from16 v22, v0

    .line 62
    .line 63
    move-object/from16 v0, p2

    .line 64
    .line 65
    move/from16 v23, v18

    .line 66
    .line 67
    move/from16 v18, v22

    .line 68
    .line 69
    move-wide/from16 v24, v2

    .line 70
    .line 71
    move-object/from16 v2, v16

    .line 72
    .line 73
    move-object/from16 v3, v17

    .line 74
    .line 75
    move/from16 v17, v23

    .line 76
    .line 77
    move-wide/from16 v15, v19

    .line 78
    .line 79
    move-wide/from16 v19, v24

    .line 80
    .line 81
    invoke-virtual/range {v0 .. v20}, Lq2/Y$d;->h(Ljava/lang/Object;Lq2/C;Ljava/lang/Object;JJJZZLq2/C$g;JJIIJ)Lq2/Y$d;

    .line 82
    .line 83
    .line 84
    move-object/from16 v1, v21

    .line 85
    .line 86
    iget-boolean v1, v1, Lq2/Y$d;->k:Z

    .line 87
    .line 88
    iput-boolean v1, v0, Lq2/Y$d;->k:Z

    .line 89
    .line 90
    return-object v0
.end method

.method public t()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/Y$c;->e:LP9/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
