.class public Lr6/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lr6/c;

.field private b:LC5/a;

.field private c:Ljava/util/List;

.field private d:I

.field private e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr6/f;->a:Lr6/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Lr6/e;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Lr6/e;

    .line 3
    .line 4
    invoke-direct {v1, p0}, Lr6/e;-><init>(Lr6/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, Lr6/f;->b:LC5/a;

    .line 8
    .line 9
    invoke-static {v2}, LC5/a;->m(LC5/a;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lr6/f;->b:LC5/a;

    .line 13
    .line 14
    iget-object v2, p0, Lr6/f;->c:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v2}, LC5/a;->q(Ljava/lang/Iterable;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lr6/f;->c:Ljava/util/List;

    .line 20
    .line 21
    return-object v1

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    iget-object v2, p0, Lr6/f;->b:LC5/a;

    .line 24
    .line 25
    invoke-static {v2}, LC5/a;->m(LC5/a;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lr6/f;->b:LC5/a;

    .line 29
    .line 30
    iget-object v2, p0, Lr6/f;->c:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {v2}, LC5/a;->q(Ljava/lang/Iterable;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lr6/f;->c:Ljava/util/List;

    .line 36
    .line 37
    throw v1
.end method

.method public b()LN6/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lr6/f;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, LC5/a;->k(Ljava/util/Collection;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lr6/f;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public e()Lr6/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lr6/f;->a:Lr6/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()LC5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lr6/f;->b:LC5/a;

    .line 2
    .line 3
    invoke-static {v0}, LC5/a;->j(LC5/a;)LC5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr6/f;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public h(LN6/a;)Lr6/f;
    .locals 0

    .line 1
    return-object p0
.end method

.method public i(Ljava/util/List;)Lr6/f;
    .locals 0

    .line 1
    invoke-static {p1}, LC5/a;->k(Ljava/util/Collection;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lr6/f;->c:Ljava/util/List;

    .line 6
    .line 7
    return-object p0
.end method

.method public j(I)Lr6/f;
    .locals 0

    .line 1
    iput p1, p0, Lr6/f;->d:I

    .line 2
    .line 3
    return-object p0
.end method

.method public k(LC5/a;)Lr6/f;
    .locals 0

    .line 1
    invoke-static {p1}, LC5/a;->j(LC5/a;)LC5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lr6/f;->b:LC5/a;

    .line 6
    .line 7
    return-object p0
.end method

.method public l(Ljava/lang/String;)Lr6/f;
    .locals 0

    .line 1
    iput-object p1, p0, Lr6/f;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
