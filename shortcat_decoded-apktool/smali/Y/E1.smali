.class public final LY/E1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lk0/e;
.implements Ljava/lang/Iterable;
.implements Lje/a;


# instance fields
.field private a:[I

.field private b:I

.field private c:[Ljava/lang/Object;

.field private d:I

.field private e:I

.field private final f:Ljava/lang/Object;

.field private g:Z

.field private h:I

.field private i:Ljava/util/ArrayList;

.field private j:Ljava/util/HashMap;

.field private k:Lt/F;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    iput-object v1, p0, LY/E1;->a:[I

    .line 8
    .line 9
    new-array v0, v0, [Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v0, p0, LY/E1;->c:[Ljava/lang/Object;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LY/E1;->f:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, LY/E1;->i:Ljava/util/ArrayList;

    .line 26
    .line 27
    return-void
.end method

.method private final M(I)LY/b;
    .locals 2

    .line 1
    iget-boolean v0, p0, LY/E1;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "use active SlotWriter to crate an anchor for location instead"

    .line 6
    .line 7
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-ltz p1, :cond_1

    .line 11
    .line 12
    iget v0, p0, LY/E1;->b:I

    .line 13
    .line 14
    if-ge p1, v0, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, LY/E1;->i:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-static {v1, p1, v0}, LY/G1;->b(Ljava/util/ArrayList;II)LY/b;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    return-object p1
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/E1;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public final B(ILY/b;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, LY/E1;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Writer is active"

    .line 6
    .line 7
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    if-ltz p1, :cond_1

    .line 13
    .line 14
    iget v2, p0, LY/E1;->b:I

    .line 15
    .line 16
    if-ge p1, v2, :cond_1

    .line 17
    .line 18
    move v2, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v2, v1

    .line 21
    :goto_0
    if-nez v2, :cond_2

    .line 22
    .line 23
    const-string v2, "Invalid group index"

    .line 24
    .line 25
    invoke-static {v2}, LY/w;->t(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0, p2}, LY/E1;->I(LY/b;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    iget-object v2, p0, LY/E1;->a:[I

    .line 35
    .line 36
    invoke-static {v2, p1}, LY/G1;->c([II)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, p1

    .line 41
    invoke-virtual {p2}, LY/b;->a()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-gt p1, p2, :cond_3

    .line 46
    .line 47
    if-ge p2, v2, :cond_3

    .line 48
    .line 49
    return v0

    .line 50
    :cond_3
    return v1
.end method

.method public final D(LY/b;LY/b;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, LY/b;->a()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, LY/E1;->a:[I

    .line 6
    .line 7
    invoke-static {v0, p1}, LY/G1;->c([II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/2addr v0, p1

    .line 12
    invoke-virtual {p2}, LY/b;->a()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    const/4 v1, 0x0

    .line 17
    if-gt p1, p2, :cond_0

    .line 18
    .line 19
    if-ge p2, v0, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    return v1
.end method

.method public final F()LY/D1;
    .locals 2

    .line 1
    iget-boolean v0, p0, LY/E1;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LY/E1;->e:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iput v0, p0, LY/E1;->e:I

    .line 10
    .line 11
    new-instance v0, LY/D1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, LY/D1;-><init>(LY/E1;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v1, "Cannot read while a writer is pending"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public final G()LY/H1;
    .locals 2

    .line 1
    iget-boolean v0, p0, LY/E1;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Cannot start a writer when another writer is pending"

    .line 6
    .line 7
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget v0, p0, LY/E1;->e:I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-gtz v0, :cond_1

    .line 14
    .line 15
    move v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    :goto_0
    if-nez v0, :cond_2

    .line 19
    .line 20
    const-string v0, "Cannot start a writer when a reader is pending"

    .line 21
    .line 22
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_2
    iput-boolean v1, p0, LY/E1;->g:Z

    .line 26
    .line 27
    iget v0, p0, LY/E1;->h:I

    .line 28
    .line 29
    add-int/2addr v0, v1

    .line 30
    iput v0, p0, LY/E1;->h:I

    .line 31
    .line 32
    new-instance v0, LY/H1;

    .line 33
    .line 34
    invoke-direct {v0, p0}, LY/H1;-><init>(LY/E1;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public final I(LY/b;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, LY/b;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LY/E1;->i:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p1}, LY/b;->a()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget v2, p0, LY/E1;->b:I

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, LY/G1;->g(Ljava/util/ArrayList;II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ltz v0, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, LY/E1;->i:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    return p1
.end method

.method public final K([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lt/F;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/E1;->a:[I

    .line 2
    .line 3
    iput p2, p0, LY/E1;->b:I

    .line 4
    .line 5
    iput-object p3, p0, LY/E1;->c:[Ljava/lang/Object;

    .line 6
    .line 7
    iput p4, p0, LY/E1;->d:I

    .line 8
    .line 9
    iput-object p5, p0, LY/E1;->i:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p6, p0, LY/E1;->j:Ljava/util/HashMap;

    .line 12
    .line 13
    iput-object p7, p0, LY/E1;->k:Lt/F;

    .line 14
    .line 15
    return-void
.end method

.method public final L(I)LY/h0;
    .locals 2

    .line 1
    iget-object v0, p0, LY/E1;->j:Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1}, LY/E1;->M(I)LY/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, LY/h0;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    return-object v1
.end method

.method public final b(I)LY/b;
    .locals 4

    .line 1
    iget-boolean v0, p0, LY/E1;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "use active SlotWriter to create an anchor location instead"

    .line 6
    .line 7
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-ltz p1, :cond_1

    .line 13
    .line 14
    iget v2, p0, LY/E1;->b:I

    .line 15
    .line 16
    if-ge p1, v2, :cond_1

    .line 17
    .line 18
    move v0, v1

    .line 19
    :cond_1
    if-nez v0, :cond_2

    .line 20
    .line 21
    const-string v0, "Parameter index is out of range"

    .line 22
    .line 23
    invoke-static {v0}, LY/V0;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    iget-object v0, p0, LY/E1;->i:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget v2, p0, LY/E1;->b:I

    .line 29
    .line 30
    invoke-static {v0, p1, v2}, LY/G1;->g(Ljava/util/ArrayList;II)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-gez v2, :cond_3

    .line 35
    .line 36
    new-instance v3, LY/b;

    .line 37
    .line 38
    invoke-direct {v3, p1}, LY/b;-><init>(I)V

    .line 39
    .line 40
    .line 41
    add-int/2addr v2, v1

    .line 42
    neg-int p1, v2

    .line 43
    invoke-virtual {v0, p1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_3
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, LY/b;

    .line 52
    .line 53
    return-object p1
.end method

.method public final d(LY/b;)I
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/E1;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Use active SlotWriter to determine anchor location instead"

    .line 6
    .line 7
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, LY/b;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const-string v0, "Anchor refers to a group that was removed"

    .line 17
    .line 18
    invoke-static {v0}, LY/V0;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, LY/b;->a()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
.end method

.method public final e(LY/D1;Ljava/util/HashMap;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LY/D1;->z()LY/E1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-ne p1, p0, :cond_0

    .line 6
    .line 7
    iget p1, p0, LY/E1;->e:I

    .line 8
    .line 9
    if-lez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const-string p1, "Unexpected reader close()"

    .line 17
    .line 18
    invoke-static {p1}, LY/w;->t(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget p1, p0, LY/E1;->e:I

    .line 22
    .line 23
    add-int/lit8 p1, p1, -0x1

    .line 24
    .line 25
    iput p1, p0, LY/E1;->e:I

    .line 26
    .line 27
    if-eqz p2, :cond_3

    .line 28
    .line 29
    iget-object p1, p0, LY/E1;->f:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter p1

    .line 32
    :try_start_0
    iget-object v0, p0, LY/E1;->j:Ljava/util/HashMap;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p2

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    iput-object p2, p0, LY/E1;->j:Ljava/util/HashMap;

    .line 43
    .line 44
    :goto_1
    sget-object p2, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    monitor-exit p1

    .line 47
    return-void

    .line 48
    :goto_2
    monitor-exit p1

    .line 49
    throw p2

    .line 50
    :cond_3
    return-void
.end method

.method public final f(LY/H1;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lt/F;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, LY/H1;->c0()LY/E1;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v1, p0, :cond_0

    .line 7
    .line 8
    iget-boolean v1, p0, LY/E1;->g:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v1, v2

    .line 15
    :goto_0
    if-nez v1, :cond_1

    .line 16
    .line 17
    const-string v1, "Unexpected writer close()"

    .line 18
    .line 19
    invoke-static {v1}, LY/V0;->a(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iput-boolean v2, p0, LY/E1;->g:Z

    .line 23
    .line 24
    move-object v0, p0

    .line 25
    move-object v1, p2

    .line 26
    move v2, p3

    .line 27
    move-object v3, p4

    .line 28
    move v4, p5

    .line 29
    move-object v5, p6

    .line 30
    move-object v6, p7

    .line 31
    move-object/from16 v7, p8

    .line 32
    .line 33
    invoke-virtual/range {v0 .. v7}, LY/E1;->K([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lt/F;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final i()V
    .locals 4

    .line 1
    new-instance v0, Lt/F;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, Lt/F;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LY/E1;->k:Lt/F;

    .line 10
    .line 11
    return-void
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget v0, p0, LY/E1;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, LY/f0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, LY/E1;->b:I

    .line 5
    .line 6
    invoke-direct {v0, p0, v1, v2}, LY/f0;-><init>(LY/E1;II)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final l()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, LY/E1;->j:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public final n()Z
    .locals 3

    .line 1
    iget v0, p0, LY/E1;->b:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LY/E1;->a:[I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    aget v0, v0, v1

    .line 9
    .line 10
    const/high16 v2, 0x4000000

    .line 11
    .line 12
    and-int/2addr v0, v2

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public final p()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, LY/E1;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Lt/F;
    .locals 1

    .line 1
    iget-object v0, p0, LY/E1;->k:Lt/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()[I
    .locals 1

    .line 1
    iget-object v0, p0, LY/E1;->a:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()I
    .locals 1

    .line 1
    iget v0, p0, LY/E1;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final v()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LY/E1;->c:[Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()I
    .locals 1

    .line 1
    iget v0, p0, LY/E1;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final y()Ljava/util/HashMap;
    .locals 1

    .line 1
    iget-object v0, p0, LY/E1;->j:Ljava/util/HashMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()I
    .locals 1

    .line 1
    iget v0, p0, LY/E1;->h:I

    .line 2
    .line 3
    return v0
.end method
