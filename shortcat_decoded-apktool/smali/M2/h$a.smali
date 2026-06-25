.class final LM2/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/L;
.implements LF2/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:LM2/L$a;

.field private c:LF2/t$a;

.field final synthetic d:LM2/h;


# direct methods
.method public constructor <init>(LM2/h;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iput-object p1, p0, LM2/h$a;->d:LM2/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, LM2/a;->v(LM2/D$b;)LM2/L$a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, p0, LM2/h$a;->b:LM2/L$a;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, LM2/a;->t(LM2/D$b;)LF2/t$a;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, LM2/h$a;->c:LF2/t$a;

    .line 18
    .line 19
    iput-object p2, p0, LM2/h$a;->a:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method

.method private b(ILM2/D$b;)Z
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LM2/h$a;->d:LM2/h;

    .line 4
    .line 5
    iget-object v1, p0, LM2/h$a;->a:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p2}, LM2/h;->E(Ljava/lang/Object;LM2/D$b;)LM2/D$b;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p2, 0x0

    .line 16
    :cond_1
    iget-object v0, p0, LM2/h$a;->d:LM2/h;

    .line 17
    .line 18
    iget-object v1, p0, LM2/h$a;->a:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, LM2/h;->G(Ljava/lang/Object;I)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object v0, p0, LM2/h$a;->b:LM2/L$a;

    .line 25
    .line 26
    iget v1, v0, LM2/L$a;->a:I

    .line 27
    .line 28
    if-ne v1, p1, :cond_2

    .line 29
    .line 30
    iget-object v0, v0, LM2/L$a;->b:LM2/D$b;

    .line 31
    .line 32
    invoke-static {v0, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    :cond_2
    iget-object v0, p0, LM2/h$a;->d:LM2/h;

    .line 39
    .line 40
    invoke-virtual {v0, p1, p2}, LM2/a;->u(ILM2/D$b;)LM2/L$a;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, LM2/h$a;->b:LM2/L$a;

    .line 45
    .line 46
    :cond_3
    iget-object v0, p0, LM2/h$a;->c:LF2/t$a;

    .line 47
    .line 48
    iget v1, v0, LF2/t$a;->a:I

    .line 49
    .line 50
    if-ne v1, p1, :cond_4

    .line 51
    .line 52
    iget-object v0, v0, LF2/t$a;->b:LM2/D$b;

    .line 53
    .line 54
    invoke-static {v0, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    :cond_4
    iget-object v0, p0, LM2/h$a;->d:LM2/h;

    .line 61
    .line 62
    invoke-virtual {v0, p1, p2}, LM2/a;->s(ILM2/D$b;)LF2/t$a;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, LM2/h$a;->c:LF2/t$a;

    .line 67
    .line 68
    :cond_5
    const/4 p1, 0x1

    .line 69
    return p1
.end method

.method private d(LM2/B;LM2/D$b;)LM2/B;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, LM2/h$a;->d:LM2/h;

    .line 8
    .line 9
    iget-object v4, v0, LM2/h$a;->a:Ljava/lang/Object;

    .line 10
    .line 11
    iget-wide v5, v1, LM2/B;->f:J

    .line 12
    .line 13
    invoke-virtual {v3, v4, v5, v6, v2}, LM2/h;->F(Ljava/lang/Object;JLM2/D$b;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v13

    .line 17
    iget-object v3, v0, LM2/h$a;->d:LM2/h;

    .line 18
    .line 19
    iget-object v4, v0, LM2/h$a;->a:Ljava/lang/Object;

    .line 20
    .line 21
    iget-wide v5, v1, LM2/B;->g:J

    .line 22
    .line 23
    invoke-virtual {v3, v4, v5, v6, v2}, LM2/h;->F(Ljava/lang/Object;JLM2/D$b;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v15

    .line 27
    iget-wide v2, v1, LM2/B;->f:J

    .line 28
    .line 29
    cmp-long v2, v13, v2

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    iget-wide v2, v1, LM2/B;->g:J

    .line 34
    .line 35
    cmp-long v2, v15, v2

    .line 36
    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_0
    new-instance v7, LM2/B;

    .line 41
    .line 42
    iget v8, v1, LM2/B;->a:I

    .line 43
    .line 44
    iget v9, v1, LM2/B;->b:I

    .line 45
    .line 46
    iget-object v10, v1, LM2/B;->c:Lq2/x;

    .line 47
    .line 48
    iget v11, v1, LM2/B;->d:I

    .line 49
    .line 50
    iget-object v12, v1, LM2/B;->e:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-direct/range {v7 .. v16}, LM2/B;-><init>(IILq2/x;ILjava/lang/Object;JJ)V

    .line 53
    .line 54
    .line 55
    return-object v7
.end method


# virtual methods
.method public G(ILM2/D$b;LM2/y;LM2/B;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/h$a;->b(ILM2/D$b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LM2/h$a;->b:LM2/L$a;

    .line 8
    .line 9
    invoke-direct {p0, p4, p2}, LM2/h$a;->d(LM2/B;LM2/D$b;)LM2/B;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p1, p3, p2, p5, p6}, LM2/L$a;->t(LM2/y;LM2/B;Ljava/io/IOException;Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public O(ILM2/D$b;LM2/y;LM2/B;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/h$a;->b(ILM2/D$b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LM2/h$a;->b:LM2/L$a;

    .line 8
    .line 9
    invoke-direct {p0, p4, p2}, LM2/h$a;->d(LM2/B;LM2/D$b;)LM2/B;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p1, p3, p2, p5}, LM2/L$a;->w(LM2/y;LM2/B;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public U(ILM2/D$b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/h$a;->b(ILM2/D$b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LM2/h$a;->c:LF2/t$a;

    .line 8
    .line 9
    invoke-virtual {p1}, LF2/t$a;->i()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public a0(ILM2/D$b;LM2/y;LM2/B;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/h$a;->b(ILM2/D$b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LM2/h$a;->b:LM2/L$a;

    .line 8
    .line 9
    invoke-direct {p0, p4, p2}, LM2/h$a;->d(LM2/B;LM2/D$b;)LM2/B;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p1, p3, p2}, LM2/L$a;->n(LM2/y;LM2/B;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public i0(ILM2/D$b;LM2/y;LM2/B;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/h$a;->b(ILM2/D$b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LM2/h$a;->b:LM2/L$a;

    .line 8
    .line 9
    invoke-direct {p0, p4, p2}, LM2/h$a;->d(LM2/B;LM2/D$b;)LM2/B;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p1, p3, p2}, LM2/L$a;->q(LM2/y;LM2/B;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public j0(ILM2/D$b;LM2/B;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/h$a;->b(ILM2/D$b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LM2/h$a;->b:LM2/L$a;

    .line 8
    .line 9
    invoke-direct {p0, p3, p2}, LM2/h$a;->d(LM2/B;LM2/D$b;)LM2/B;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p1, p2}, LM2/L$a;->k(LM2/B;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public o0(ILM2/D$b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/h$a;->b(ILM2/D$b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LM2/h$a;->c:LF2/t$a;

    .line 8
    .line 9
    invoke-virtual {p1}, LF2/t$a;->h()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public q0(ILM2/D$b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/h$a;->b(ILM2/D$b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LM2/h$a;->c:LF2/t$a;

    .line 8
    .line 9
    invoke-virtual {p1}, LF2/t$a;->m()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public u0(ILM2/D$b;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/h$a;->b(ILM2/D$b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LM2/h$a;->c:LF2/t$a;

    .line 8
    .line 9
    invoke-virtual {p1, p3}, LF2/t$a;->k(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public v0(ILM2/D$b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/h$a;->b(ILM2/D$b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LM2/h$a;->c:LF2/t$a;

    .line 8
    .line 9
    invoke-virtual {p1}, LF2/t$a;->j()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public w0(ILM2/D$b;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/h$a;->b(ILM2/D$b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LM2/h$a;->c:LF2/t$a;

    .line 8
    .line 9
    invoke-virtual {p1, p3}, LF2/t$a;->l(Ljava/lang/Exception;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public x0(ILM2/D$b;LM2/B;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LM2/h$a;->b(ILM2/D$b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LM2/h$a;->b:LM2/L$a;

    .line 8
    .line 9
    invoke-direct {p0, p3, p2}, LM2/h$a;->d(LM2/B;LM2/D$b;)LM2/B;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p1, p2}, LM2/L$a;->z(LM2/B;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
