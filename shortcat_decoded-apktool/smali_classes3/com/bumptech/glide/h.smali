.class public Lcom/bumptech/glide/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/h$d;,
        Lcom/bumptech/glide/h$e;,
        Lcom/bumptech/glide/h$b;,
        Lcom/bumptech/glide/h$a;,
        Lcom/bumptech/glide/h$c;
    }
.end annotation


# instance fields
.field private final a:LY4/p;

.field private final b:Lj5/a;

.field private final c:Lj5/e;

.field private final d:Lj5/f;

.field private final e:Lcom/bumptech/glide/load/data/f;

.field private final f:Lg5/f;

.field private final g:Lj5/b;

.field private final h:Lj5/d;

.field private final i:Lj5/c;

.field private final j:LK1/d;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj5/d;

    .line 5
    .line 6
    invoke-direct {v0}, Lj5/d;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bumptech/glide/h;->h:Lj5/d;

    .line 10
    .line 11
    new-instance v0, Lj5/c;

    .line 12
    .line 13
    invoke-direct {v0}, Lj5/c;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bumptech/glide/h;->i:Lj5/c;

    .line 17
    .line 18
    invoke-static {}, Lp5/a;->e()LK1/d;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/bumptech/glide/h;->j:LK1/d;

    .line 23
    .line 24
    new-instance v1, LY4/p;

    .line 25
    .line 26
    invoke-direct {v1, v0}, LY4/p;-><init>(LK1/d;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lcom/bumptech/glide/h;->a:LY4/p;

    .line 30
    .line 31
    new-instance v0, Lj5/a;

    .line 32
    .line 33
    invoke-direct {v0}, Lj5/a;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lcom/bumptech/glide/h;->b:Lj5/a;

    .line 37
    .line 38
    new-instance v0, Lj5/e;

    .line 39
    .line 40
    invoke-direct {v0}, Lj5/e;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/bumptech/glide/h;->c:Lj5/e;

    .line 44
    .line 45
    new-instance v0, Lj5/f;

    .line 46
    .line 47
    invoke-direct {v0}, Lj5/f;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lcom/bumptech/glide/h;->d:Lj5/f;

    .line 51
    .line 52
    new-instance v0, Lcom/bumptech/glide/load/data/f;

    .line 53
    .line 54
    invoke-direct {v0}, Lcom/bumptech/glide/load/data/f;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lcom/bumptech/glide/h;->e:Lcom/bumptech/glide/load/data/f;

    .line 58
    .line 59
    new-instance v0, Lg5/f;

    .line 60
    .line 61
    invoke-direct {v0}, Lg5/f;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lcom/bumptech/glide/h;->f:Lg5/f;

    .line 65
    .line 66
    new-instance v0, Lj5/b;

    .line 67
    .line 68
    invoke-direct {v0}, Lj5/b;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lcom/bumptech/glide/h;->g:Lj5/b;

    .line 72
    .line 73
    const-string v0, "Bitmap"

    .line 74
    .line 75
    const-string v1, "BitmapDrawable"

    .line 76
    .line 77
    const-string v2, "Animation"

    .line 78
    .line 79
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/h;->v(Ljava/util/List;)Lcom/bumptech/glide/h;

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method private f(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/bumptech/glide/h;->c:Lj5/e;

    .line 7
    .line 8
    invoke-virtual {v1, p1, p2}, Lj5/e;->d(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v4, v1

    .line 27
    check-cast v4, Ljava/lang/Class;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/bumptech/glide/h;->f:Lg5/f;

    .line 30
    .line 31
    invoke-virtual {v1, v4, p3}, Lg5/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    move-object v5, v2

    .line 50
    check-cast v5, Ljava/lang/Class;

    .line 51
    .line 52
    iget-object v2, p0, Lcom/bumptech/glide/h;->c:Lj5/e;

    .line 53
    .line 54
    invoke-virtual {v2, p1, v4}, Lj5/e;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    iget-object v2, p0, Lcom/bumptech/glide/h;->f:Lg5/f;

    .line 59
    .line 60
    invoke-virtual {v2, v4, v5}, Lg5/f;->a(Ljava/lang/Class;Ljava/lang/Class;)Lg5/e;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    new-instance v2, LU4/i;

    .line 65
    .line 66
    iget-object v8, p0, Lcom/bumptech/glide/h;->j:LK1/d;

    .line 67
    .line 68
    move-object v3, p1

    .line 69
    invoke-direct/range {v2 .. v8}, LU4/i;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Lg5/e;LK1/d;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Class;LS4/d;)Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->b:Lj5/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lj5/a;->a(Ljava/lang/Class;LS4/d;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public b(Ljava/lang/Class;LS4/k;)Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->d:Lj5/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lj5/f;->a(Ljava/lang/Class;LS4/k;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public c(Ljava/lang/Class;Ljava/lang/Class;LS4/j;)Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    const-string v0, "legacy_append"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LS4/j;)Lcom/bumptech/glide/h;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public d(Ljava/lang/Class;Ljava/lang/Class;LY4/o;)Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->a:LY4/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LY4/p;->a(Ljava/lang/Class;Ljava/lang/Class;LY4/o;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LS4/j;)Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->c:Lj5/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p4, p2, p3}, Lj5/e;->a(Ljava/lang/String;LS4/j;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public g()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->g:Lj5/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj5/b;->b()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Lcom/bumptech/glide/h$b;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/bumptech/glide/h$b;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public h(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)LU4/t;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->i:Lj5/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lj5/c;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)LU4/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bumptech/glide/h;->i:Lj5/c;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lj5/c;->c(LU4/t;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_0
    if-nez v0, :cond_2

    .line 18
    .line 19
    invoke-direct {p0, p1, p2, p3}, Lcom/bumptech/glide/h;->f(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    move-object v4, p1

    .line 30
    move-object v5, p2

    .line 31
    move-object v6, p3

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-instance v3, LU4/t;

    .line 34
    .line 35
    iget-object v8, p0, Lcom/bumptech/glide/h;->j:LK1/d;

    .line 36
    .line 37
    move-object v4, p1

    .line 38
    move-object v5, p2

    .line 39
    move-object v6, p3

    .line 40
    invoke-direct/range {v3 .. v8}, LU4/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;LK1/d;)V

    .line 41
    .line 42
    .line 43
    move-object v2, v3

    .line 44
    :goto_0
    iget-object p1, p0, Lcom/bumptech/glide/h;->i:Lj5/c;

    .line 45
    .line 46
    invoke-virtual {p1, v4, v5, v6, v2}, Lj5/c;->d(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;LU4/t;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_2
    return-object v0
.end method

.method public i(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->a:LY4/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LY4/p;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public j(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->h:Lj5/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lj5/d;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/bumptech/glide/h;->a:LY4/p;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, LY4/p;->c(Ljava/lang/Class;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/Class;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/bumptech/glide/h;->c:Lj5/e;

    .line 37
    .line 38
    invoke-virtual {v3, v2, p2}, Lj5/e;->d(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/Class;

    .line 57
    .line 58
    iget-object v4, p0, Lcom/bumptech/glide/h;->f:Lg5/f;

    .line 59
    .line 60
    invoke-virtual {v4, v3, p3}, Lg5/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-nez v4, :cond_1

    .line 75
    .line 76
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iget-object v1, p0, Lcom/bumptech/glide/h;->h:Lj5/d;

    .line 81
    .line 82
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v1, p1, p2, p3, v2}, Lj5/d;->b(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    return-object v0
.end method

.method public k(LU4/v;)LS4/k;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->d:Lj5/f;

    .line 2
    .line 3
    invoke-interface {p1}, LU4/v;->a()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lj5/f;->b(Ljava/lang/Class;)LS4/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Lcom/bumptech/glide/h$d;

    .line 15
    .line 16
    invoke-interface {p1}, LU4/v;->a()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Lcom/bumptech/glide/h$d;-><init>(Ljava/lang/Class;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public l(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->e:Lcom/bumptech/glide/load/data/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/data/f;->a(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public m(Ljava/lang/Object;)LS4/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->b:Lj5/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lj5/a;->b(Ljava/lang/Class;)LS4/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Lcom/bumptech/glide/h$e;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Lcom/bumptech/glide/h$e;-><init>(Ljava/lang/Class;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public n(LU4/v;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->d:Lj5/f;

    .line 2
    .line 3
    invoke-interface {p1}, LU4/v;->a()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lj5/f;->b(Ljava/lang/Class;)LS4/k;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method public o(Ljava/lang/Class;Ljava/lang/Class;LS4/j;)Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    const-string v0, "legacy_prepend_all"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/bumptech/glide/h;->q(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LS4/j;)Lcom/bumptech/glide/h;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public p(Ljava/lang/Class;Ljava/lang/Class;LY4/o;)Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->a:LY4/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LY4/p;->f(Ljava/lang/Class;Ljava/lang/Class;LY4/o;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public q(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LS4/j;)Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->c:Lj5/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p4, p2, p3}, Lj5/e;->e(Ljava/lang/String;LS4/j;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public r(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->g:Lj5/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lj5/b;->a(Lcom/bumptech/glide/load/ImageHeaderParser;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public s(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->e:Lcom/bumptech/glide/load/data/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/data/f;->b(Lcom/bumptech/glide/load/data/e$a;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public t(Ljava/lang/Class;Ljava/lang/Class;Lg5/e;)Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->f:Lg5/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lg5/f;->c(Ljava/lang/Class;Ljava/lang/Class;Lg5/e;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public u(Ljava/lang/Class;Ljava/lang/Class;LY4/o;)Lcom/bumptech/glide/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/h;->a:LY4/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LY4/p;->g(Ljava/lang/Class;Ljava/lang/Class;LY4/o;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final v(Ljava/util/List;)Lcom/bumptech/glide/h;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const-string v1, "legacy_prepend_all"

    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/String;

    .line 30
    .line 31
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string p1, "legacy_append"

    .line 36
    .line 37
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/bumptech/glide/h;->c:Lj5/e;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lj5/e;->f(Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    return-object p0
.end method
