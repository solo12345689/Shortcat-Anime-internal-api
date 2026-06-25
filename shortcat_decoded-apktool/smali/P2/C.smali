.class public abstract LP2/C;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LP2/A;


# instance fields
.field private final a:LP2/A;


# direct methods
.method public constructor <init>(LP2/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP2/C;->a:LP2/A;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(IJ)Z
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LP2/A;->a(IJ)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0}, LP2/A;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c(JLN2/e;Ljava/util/List;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, LP2/A;->c(JLN2/e;Ljava/util/List;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public disable()V
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0}, LP2/A;->disable()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public enable()V
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0}, LP2/A;->enable()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, LP2/C;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, LP2/C;

    .line 12
    .line 13
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 14
    .line 15
    iget-object p1, p1, LP2/C;->a:LP2/A;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public f(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LP2/E;->f(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public g(IJ)Z
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LP2/A;->g(IJ)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public h(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LP2/A;->h(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public i()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0}, LP2/A;->i()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public j()V
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0}, LP2/A;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(JJJLjava/util/List;[LN2/n;)V
    .locals 9

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    move-wide v1, p1

    .line 4
    move-wide v3, p3

    .line 5
    move-wide v5, p5

    .line 6
    move-object/from16 v7, p7

    .line 7
    .line 8
    move-object/from16 v8, p8

    .line 9
    .line 10
    invoke-interface/range {v0 .. v8}, LP2/A;->k(JJJLjava/util/List;[LN2/n;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public l(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LP2/E;->l(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public length()I
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0}, LP2/E;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public n(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LP2/A;->n(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o(JLjava/util/List;)I
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LP2/A;->o(JLjava/util/List;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public p()I
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0}, LP2/A;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public r()I
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0}, LP2/A;->r()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public s()V
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    invoke-interface {v0}, LP2/A;->s()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public t()LP2/A;
    .locals 1

    .line 1
    iget-object v0, p0, LP2/C;->a:LP2/A;

    .line 2
    .line 3
    return-object v0
.end method
