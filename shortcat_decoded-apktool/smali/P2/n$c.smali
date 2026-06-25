.class final LP2/n$c;
.super LP2/n$i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final e:I

.field private final f:I


# direct methods
.method public constructor <init>(ILq2/a0;ILP2/n$e;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LP2/n$i;-><init>(ILq2/a0;I)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p4, LP2/n$e;->A0:Z

    .line 5
    .line 6
    invoke-static {p5, p1}, Landroidx/media3/exoplayer/O0;->l(IZ)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, LP2/n$c;->e:I

    .line 11
    .line 12
    iget-object p1, p0, LP2/n$i;->d:Lq2/x;

    .line 13
    .line 14
    invoke-virtual {p1}, Lq2/x;->g()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, LP2/n$c;->f:I

    .line 19
    .line 20
    return-void
.end method

.method public static c(Ljava/util/List;Ljava/util/List;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, LP2/n$c;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LP2/n$c;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, LP2/n$c;->h(LP2/n$c;)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public static k(ILq2/a0;LP2/n$e;[I)LP9/u;
    .locals 8

    .line 1
    invoke-static {}, LP9/u;->t()LP9/u$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v5, v1

    .line 7
    :goto_0
    iget v1, p1, Lq2/a0;->a:I

    .line 8
    .line 9
    if-ge v5, v1, :cond_0

    .line 10
    .line 11
    new-instance v2, LP2/n$c;

    .line 12
    .line 13
    aget v7, p3, v5

    .line 14
    .line 15
    move v3, p0

    .line 16
    move-object v4, p1

    .line 17
    move-object v6, p2

    .line 18
    invoke-direct/range {v2 .. v7}, LP2/n$c;-><init>(ILq2/a0;ILP2/n$e;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 22
    .line 23
    .line 24
    add-int/lit8 v5, v5, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0}, LP9/u$a;->k()LP9/u;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, LP2/n$c;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic b(LP2/n$i;)Z
    .locals 0

    .line 1
    check-cast p1, LP2/n$c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LP2/n$c;->m(LP2/n$c;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LP2/n$c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LP2/n$c;->h(LP2/n$c;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public h(LP2/n$c;)I
    .locals 1

    .line 1
    iget v0, p0, LP2/n$c;->f:I

    .line 2
    .line 3
    iget p1, p1, LP2/n$c;->f:I

    .line 4
    .line 5
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public m(LP2/n$c;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method
