.class public final LP9/r$a;
.super LP9/v$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP9/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LP9/v$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a()LP9/v;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/r$a;->k()LP9/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic c()LP9/v;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/r$a;->l()LP9/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic f(Ljava/lang/Object;Ljava/lang/Object;)LP9/v$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LP9/r$a;->m(Ljava/lang/Object;Ljava/lang/Object;)LP9/r$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic g(Ljava/util/Map$Entry;)LP9/v$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP9/r$a;->n(Ljava/util/Map$Entry;)LP9/r$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/Iterable;)LP9/v$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP9/r$a;->o(Ljava/lang/Iterable;)LP9/r$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic i(Ljava/util/Map;)LP9/v$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP9/r$a;->p(Ljava/util/Map;)LP9/r$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public k()LP9/r;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/r$a;->l()LP9/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l()LP9/r;
    .locals 3

    .line 1
    iget v0, p0, LP9/v$a;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LP9/r;->v()LP9/r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v1, p0, LP9/v$a;->a:Ljava/util/Comparator;

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    iget-boolean v1, p0, LP9/v$a;->d:Z

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, LP9/v$a;->b:[Ljava/lang/Object;

    .line 19
    .line 20
    mul-int/lit8 v0, v0, 0x2

    .line 21
    .line 22
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, LP9/v$a;->b:[Ljava/lang/Object;

    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, LP9/v$a;->b:[Ljava/lang/Object;

    .line 29
    .line 30
    iget v1, p0, LP9/v$a;->c:I

    .line 31
    .line 32
    iget-object v2, p0, LP9/v$a;->a:Ljava/util/Comparator;

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, LP9/v$a;->j([Ljava/lang/Object;ILjava/util/Comparator;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, LP9/v$a;->d:Z

    .line 39
    .line 40
    new-instance v0, LP9/M;

    .line 41
    .line 42
    iget-object v1, p0, LP9/v$a;->b:[Ljava/lang/Object;

    .line 43
    .line 44
    iget v2, p0, LP9/v$a;->c:I

    .line 45
    .line 46
    invoke-direct {v0, v1, v2}, LP9/M;-><init>([Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public m(Ljava/lang/Object;Ljava/lang/Object;)LP9/r$a;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, LP9/v$a;->f(Ljava/lang/Object;Ljava/lang/Object;)LP9/v$a;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public n(Ljava/util/Map$Entry;)LP9/r$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LP9/v$a;->g(Ljava/util/Map$Entry;)LP9/v$a;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public o(Ljava/lang/Iterable;)LP9/r$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LP9/v$a;->h(Ljava/lang/Iterable;)LP9/v$a;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public p(Ljava/util/Map;)LP9/r$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LP9/v$a;->i(Ljava/util/Map;)LP9/v$a;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method
