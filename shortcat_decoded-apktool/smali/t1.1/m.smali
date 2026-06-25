.class public abstract Lt1/m;
.super Lt1/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field public L0:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lt1/e;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lt1/m;->L0:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lt1/e;-><init>(II)V

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lt1/m;->L0:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public c(Lt1/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/m;->L0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lt1/e;->L()Lt1/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lt1/e;->L()Lt1/e;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lt1/m;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lt1/m;->q1(Lt1/e;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1, p0}, Lt1/e;->Y0(Lt1/e;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public varargs n1([Lt1/e;)V
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    invoke-virtual {p0, v2}, Lt1/m;->c(Lt1/e;)V

    .line 8
    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
.end method

.method public o1()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/m;->L0:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract p1()V
.end method

.method public q1(Lt1/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/m;->L0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lt1/e;->s0()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public r1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/m;->L0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public s0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/m;->L0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lt1/e;->s0()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public v0(Lm1/c;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lt1/e;->v0(Lm1/c;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lt1/m;->L0:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lt1/m;->L0:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lt1/e;

    .line 20
    .line 21
    invoke-virtual {v2, p1}, Lt1/e;->v0(Lm1/c;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method
