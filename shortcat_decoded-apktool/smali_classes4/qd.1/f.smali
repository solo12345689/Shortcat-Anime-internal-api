.class public final Lqd/f;
.super Lqd/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd/f$j;
    }
.end annotation


# static fields
.field public static final l:Lqd/f$j;


# instance fields
.field private final a:LM3/q;

.field private final b:LM3/i;

.field private final c:Lpd/b;

.field private final d:LM3/h;

.field private final e:LM3/w;

.field private final f:LM3/w;

.field private final g:LM3/w;

.field private final h:LM3/w;

.field private final i:LM3/w;

.field private final j:LM3/w;

.field private final k:LM3/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqd/f$j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lqd/f$j;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lqd/f;->l:Lqd/f$j;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LM3/q;)V
    .locals 1

    .line 1
    const-string v0, "__db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lqd/e;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lpd/b;

    .line 10
    .line 11
    invoke-direct {v0}, Lpd/b;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lqd/f;->c:Lpd/b;

    .line 15
    .line 16
    iput-object p1, p0, Lqd/f;->a:LM3/q;

    .line 17
    .line 18
    new-instance v0, Lqd/f$a;

    .line 19
    .line 20
    invoke-direct {v0, p1, p0}, Lqd/f$a;-><init>(LM3/q;Lqd/f;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lqd/f;->b:LM3/i;

    .line 24
    .line 25
    new-instance v0, Lqd/f$b;

    .line 26
    .line 27
    invoke-direct {v0, p1, p0}, Lqd/f$b;-><init>(LM3/q;Lqd/f;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lqd/f;->d:LM3/h;

    .line 31
    .line 32
    new-instance v0, Lqd/f$c;

    .line 33
    .line 34
    invoke-direct {v0, p1}, Lqd/f$c;-><init>(LM3/q;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lqd/f;->e:LM3/w;

    .line 38
    .line 39
    new-instance v0, Lqd/f$d;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Lqd/f$d;-><init>(LM3/q;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lqd/f;->f:LM3/w;

    .line 45
    .line 46
    new-instance v0, Lqd/f$e;

    .line 47
    .line 48
    invoke-direct {v0, p1}, Lqd/f$e;-><init>(LM3/q;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lqd/f;->g:LM3/w;

    .line 52
    .line 53
    new-instance v0, Lqd/f$f;

    .line 54
    .line 55
    invoke-direct {v0, p1}, Lqd/f$f;-><init>(LM3/q;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lqd/f;->h:LM3/w;

    .line 59
    .line 60
    new-instance v0, Lqd/f$g;

    .line 61
    .line 62
    invoke-direct {v0, p1}, Lqd/f$g;-><init>(LM3/q;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lqd/f;->i:LM3/w;

    .line 66
    .line 67
    new-instance v0, Lqd/f$h;

    .line 68
    .line 69
    invoke-direct {v0, p1}, Lqd/f$h;-><init>(LM3/q;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lqd/f;->j:LM3/w;

    .line 73
    .line 74
    new-instance v0, Lqd/f$i;

    .line 75
    .line 76
    invoke-direct {v0, p1}, Lqd/f$i;-><init>(LM3/q;)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lqd/f;->k:LM3/w;

    .line 80
    .line 81
    return-void
.end method

.method public static final synthetic y(Lqd/f;)Lpd/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lqd/f;->c:Lpd/b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Ljava/util/UUID;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "newScopeKey"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->d()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lqd/f;->g:LM3/w;

    .line 17
    .line 18
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-interface {v0, v1, p2}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lqd/f;->c:Lpd/b;

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 p2, 0x2

    .line 33
    invoke-interface {v0, p2, p1}, LS3/i;->p1(I[B)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 37
    .line 38
    invoke-virtual {p1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 45
    .line 46
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    .line 48
    .line 49
    :try_start_2
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 50
    .line 51
    invoke-virtual {p1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lqd/f;->g:LM3/w;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, LM3/w;->h(LS3/k;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    goto :goto_0

    .line 62
    :catchall_1
    move-exception p1

    .line 63
    :try_start_3
    iget-object p2, p0, Lqd/f;->a:LM3/q;

    .line 64
    .line 65
    invoke-virtual {p2}, LM3/q;->i()V

    .line 66
    .line 67
    .line 68
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 69
    :goto_0
    iget-object p2, p0, Lqd/f;->g:LM3/w;

    .line 70
    .line 71
    invoke-virtual {p2, v0}, LM3/w;->h(LS3/k;)V

    .line 72
    .line 73
    .line 74
    throw p1
.end method

.method public b(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "updates"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->d()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->e()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lqd/f;->d:LM3/h;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LM3/h;->k(Ljava/lang/Iterable;)I

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 22
    .line 23
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 27
    .line 28
    invoke-virtual {p1}, LM3/q;->i()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 34
    .line 35
    invoke-virtual {v0}, LM3/q;->i()V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method public d(Ljava/util/UUID;)V
    .locals 2

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->d()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/f;->k:LM3/w;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lqd/f;->c:Lpd/b;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-interface {v0, v1, p1}, LS3/i;->p1(I[B)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 28
    .line 29
    invoke-virtual {p1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 36
    .line 37
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 38
    .line 39
    .line 40
    :try_start_2
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 41
    .line 42
    invoke-virtual {p1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lqd/f;->k:LM3/w;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, LM3/w;->h(LS3/k;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_0

    .line 53
    :catchall_1
    move-exception p1

    .line 54
    :try_start_3
    iget-object v1, p0, Lqd/f;->a:LM3/q;

    .line 55
    .line 56
    invoke-virtual {v1}, LM3/q;->i()V

    .line 57
    .line 58
    .line 59
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 60
    :goto_0
    iget-object v1, p0, Lqd/f;->k:LM3/w;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, LM3/w;->h(LS3/k;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method protected f(Ljava/util/UUID;)V
    .locals 2

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->d()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/f;->j:LM3/w;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lqd/f;->c:Lpd/b;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-interface {v0, v1, p1}, LS3/i;->p1(I[B)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 28
    .line 29
    invoke-virtual {p1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 36
    .line 37
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 38
    .line 39
    .line 40
    :try_start_2
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 41
    .line 42
    invoke-virtual {p1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lqd/f;->j:LM3/w;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, LM3/w;->h(LS3/k;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_0

    .line 53
    :catchall_1
    move-exception p1

    .line 54
    :try_start_3
    iget-object v1, p0, Lqd/f;->a:LM3/q;

    .line 55
    .line 56
    invoke-virtual {v1}, LM3/q;->i()V

    .line 57
    .line 58
    .line 59
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 60
    :goto_0
    iget-object v1, p0, Lqd/f;->j:LM3/w;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, LM3/w;->h(LS3/k;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method public g(Lrd/d;)V
    .locals 1

    .line 1
    const-string v0, "update"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->d()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->e()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lqd/f;->b:LM3/i;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LM3/i;->j(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 22
    .line 23
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 27
    .line 28
    invoke-virtual {p1}, LM3/q;->i()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 34
    .line 35
    invoke-virtual {v0}, LM3/q;->i()V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method protected h(Ljava/util/UUID;)V
    .locals 2

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->d()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/f;->e:LM3/w;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lqd/f;->c:Lpd/b;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-interface {v0, v1, p1}, LS3/i;->p1(I[B)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 28
    .line 29
    invoke-virtual {p1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 36
    .line 37
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 38
    .line 39
    .line 40
    :try_start_2
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 41
    .line 42
    invoke-virtual {p1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lqd/f;->e:LM3/w;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, LM3/w;->h(LS3/k;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_0

    .line 53
    :catchall_1
    move-exception p1

    .line 54
    :try_start_3
    iget-object v1, p0, Lqd/f;->a:LM3/q;

    .line 55
    .line 56
    invoke-virtual {v1}, LM3/q;->i()V

    .line 57
    .line 58
    .line 59
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 60
    :goto_0
    iget-object v1, p0, Lqd/f;->e:LM3/w;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, LM3/w;->h(LS3/k;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method public i()Ljava/util/List;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "getString(...)"

    .line 4
    .line 5
    sget-object v2, LM3/t;->i:LM3/t$a;

    .line 6
    .line 7
    const-string v3, "SELECT * FROM updates;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-virtual {v2, v3, v4}, LM3/t$a;->a(Ljava/lang/String;I)LM3/t;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v3, v1, Lqd/f;->a:LM3/q;

    .line 15
    .line 16
    invoke-virtual {v3}, LM3/q;->d()V

    .line 17
    .line 18
    .line 19
    iget-object v3, v1, Lqd/f;->a:LM3/q;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    invoke-static {v3, v2, v4, v5}, LO3/b;->b(LM3/q;LS3/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :try_start_0
    const-string v6, "id"

    .line 27
    .line 28
    invoke-static {v3, v6}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    const-string v7, "commit_time"

    .line 33
    .line 34
    invoke-static {v3, v7}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    const-string v8, "runtime_version"

    .line 39
    .line 40
    invoke-static {v3, v8}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    const-string v9, "scope_key"

    .line 45
    .line 46
    invoke-static {v3, v9}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    const-string v10, "manifest"

    .line 51
    .line 52
    invoke-static {v3, v10}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    const-string v11, "url"

    .line 57
    .line 58
    invoke-static {v3, v11}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    const-string v12, "headers"

    .line 63
    .line 64
    invoke-static {v3, v12}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    const-string v13, "launch_asset_id"

    .line 69
    .line 70
    invoke-static {v3, v13}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v13

    .line 74
    const-string v14, "status"

    .line 75
    .line 76
    invoke-static {v3, v14}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v14

    .line 80
    const-string v15, "keep"

    .line 81
    .line 82
    invoke-static {v3, v15}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    const-string v4, "last_accessed"

    .line 87
    .line 88
    invoke-static {v3, v4}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    const-string v5, "successful_launch_count"

    .line 93
    .line 94
    invoke-static {v3, v5}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 98
    move-object/from16 v16, v2

    .line 99
    .line 100
    :try_start_1
    const-string v2, "failed_launch_count"

    .line 101
    .line 102
    invoke-static {v3, v2}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    move/from16 v17, v2

    .line 107
    .line 108
    new-instance v2, Ljava/util/ArrayList;

    .line 109
    .line 110
    move/from16 v18, v5

    .line 111
    .line 112
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 117
    .line 118
    .line 119
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_a

    .line 124
    .line 125
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getBlob(I)[B

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    move/from16 v19, v6

    .line 130
    .line 131
    const-string v6, "getBlob(...)"

    .line 132
    .line 133
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-object v6, v1, Lqd/f;->c:Lpd/b;

    .line 137
    .line 138
    invoke-virtual {v6, v5}, Lpd/b;->a([B)Ljava/util/UUID;

    .line 139
    .line 140
    .line 141
    move-result-object v21

    .line 142
    invoke-interface {v3, v7}, Landroid/database/Cursor;->isNull(I)Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eqz v5, :cond_0

    .line 147
    .line 148
    const/4 v5, 0x0

    .line 149
    goto :goto_1

    .line 150
    :cond_0
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 151
    .line 152
    .line 153
    move-result-wide v5

    .line 154
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    :goto_1
    iget-object v6, v1, Lqd/f;->c:Lpd/b;

    .line 159
    .line 160
    invoke-virtual {v6, v5}, Lpd/b;->g(Ljava/lang/Long;)Ljava/util/Date;

    .line 161
    .line 162
    .line 163
    move-result-object v22
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    const-string v5, "Expected NON-NULL \'java.util.Date\', but it was NULL."

    .line 165
    .line 166
    if-eqz v22, :cond_9

    .line 167
    .line 168
    :try_start_2
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    move-object/from16 v23, v6

    .line 176
    .line 177
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v3, v10}, Landroid/database/Cursor;->isNull(I)Z

    .line 185
    .line 186
    .line 187
    move-result v20

    .line 188
    if-eqz v20, :cond_1

    .line 189
    .line 190
    move-object/from16 v28, v0

    .line 191
    .line 192
    const/4 v0, 0x0

    .line 193
    :goto_2
    move-object/from16 v24, v6

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_1
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v20

    .line 200
    move-object/from16 v28, v0

    .line 201
    .line 202
    move-object/from16 v0, v20

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :goto_3
    iget-object v6, v1, Lqd/f;->c:Lpd/b;

    .line 206
    .line 207
    invoke-virtual {v6, v0}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 208
    .line 209
    .line 210
    move-result-object v25

    .line 211
    if-eqz v25, :cond_8

    .line 212
    .line 213
    invoke-interface {v3, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_2

    .line 218
    .line 219
    const/4 v0, 0x0

    .line 220
    goto :goto_4

    .line 221
    :cond_2
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    :goto_4
    iget-object v6, v1, Lqd/f;->c:Lpd/b;

    .line 226
    .line 227
    invoke-virtual {v6, v0}, Lpd/b;->l(Ljava/lang/String;)Landroid/net/Uri;

    .line 228
    .line 229
    .line 230
    move-result-object v26

    .line 231
    invoke-interface {v3, v12}, Landroid/database/Cursor;->isNull(I)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_3

    .line 236
    .line 237
    const/4 v0, 0x0

    .line 238
    goto :goto_5

    .line 239
    :cond_3
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    :goto_5
    iget-object v6, v1, Lqd/f;->c:Lpd/b;

    .line 244
    .line 245
    invoke-virtual {v6, v0}, Lpd/b;->k(Ljava/lang/String;)Ljava/util/Map;

    .line 246
    .line 247
    .line 248
    move-result-object v27

    .line 249
    new-instance v20, Lrd/d;

    .line 250
    .line 251
    invoke-direct/range {v20 .. v27}, Lrd/d;-><init>(Ljava/util/UUID;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Landroid/net/Uri;Ljava/util/Map;)V

    .line 252
    .line 253
    .line 254
    move-object/from16 v0, v20

    .line 255
    .line 256
    invoke-interface {v3, v13}, Landroid/database/Cursor;->isNull(I)Z

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    if-eqz v6, :cond_4

    .line 261
    .line 262
    const/4 v6, 0x0

    .line 263
    invoke-virtual {v0, v6}, Lrd/d;->t(Ljava/lang/Long;)V

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :catchall_0
    move-exception v0

    .line 268
    goto/16 :goto_9

    .line 269
    .line 270
    :cond_4
    const/4 v6, 0x0

    .line 271
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 272
    .line 273
    .line 274
    move-result-wide v20

    .line 275
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    invoke-virtual {v0, v6}, Lrd/d;->t(Ljava/lang/Long;)V

    .line 280
    .line 281
    .line 282
    :goto_6
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getInt(I)I

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    move/from16 v20, v7

    .line 287
    .line 288
    iget-object v7, v1, Lqd/f;->c:Lpd/b;

    .line 289
    .line 290
    invoke-virtual {v7, v6}, Lpd/b;->e(I)Lsd/b;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    invoke-virtual {v0, v6}, Lrd/d;->v(Lsd/b;)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 298
    .line 299
    .line 300
    move-result v6

    .line 301
    if-eqz v6, :cond_5

    .line 302
    .line 303
    const/4 v6, 0x1

    .line 304
    goto :goto_7

    .line 305
    :cond_5
    const/4 v6, 0x0

    .line 306
    :goto_7
    invoke-virtual {v0, v6}, Lrd/d;->r(Z)V

    .line 307
    .line 308
    .line 309
    invoke-interface {v3, v4}, Landroid/database/Cursor;->isNull(I)Z

    .line 310
    .line 311
    .line 312
    move-result v6

    .line 313
    if-eqz v6, :cond_6

    .line 314
    .line 315
    const/4 v6, 0x0

    .line 316
    goto :goto_8

    .line 317
    :cond_6
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 318
    .line 319
    .line 320
    move-result-wide v6

    .line 321
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    :goto_8
    iget-object v7, v1, Lqd/f;->c:Lpd/b;

    .line 326
    .line 327
    invoke-virtual {v7, v6}, Lpd/b;->g(Ljava/lang/Long;)Ljava/util/Date;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    if-eqz v6, :cond_7

    .line 332
    .line 333
    invoke-virtual {v0, v6}, Lrd/d;->s(Ljava/util/Date;)V

    .line 334
    .line 335
    .line 336
    move/from16 v5, v18

    .line 337
    .line 338
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 339
    .line 340
    .line 341
    move-result v6

    .line 342
    invoke-virtual {v0, v6}, Lrd/d;->w(I)V

    .line 343
    .line 344
    .line 345
    move/from16 v6, v17

    .line 346
    .line 347
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 348
    .line 349
    .line 350
    move-result v7

    .line 351
    invoke-virtual {v0, v7}, Lrd/d;->q(I)V

    .line 352
    .line 353
    .line 354
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move/from16 v18, v5

    .line 358
    .line 359
    move/from16 v17, v6

    .line 360
    .line 361
    move/from16 v6, v19

    .line 362
    .line 363
    move/from16 v7, v20

    .line 364
    .line 365
    move-object/from16 v0, v28

    .line 366
    .line 367
    goto/16 :goto_0

    .line 368
    .line 369
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 370
    .line 371
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    throw v0

    .line 375
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 376
    .line 377
    const-string v2, "Expected NON-NULL \'org.json.JSONObject\', but it was NULL."

    .line 378
    .line 379
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    throw v0

    .line 383
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 384
    .line 385
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 389
    :cond_a
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v16 .. v16}, LM3/t;->k()V

    .line 393
    .line 394
    .line 395
    return-object v2

    .line 396
    :catchall_1
    move-exception v0

    .line 397
    move-object/from16 v16, v2

    .line 398
    .line 399
    :goto_9
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v16 .. v16}, LM3/t;->k()V

    .line 403
    .line 404
    .line 405
    throw v0
.end method

.method protected k(Ljava/util/UUID;)Lrd/a;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "updateId"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v2, LM3/t;->i:LM3/t$a;

    .line 11
    .line 12
    const-string v3, "SELECT assets.* FROM assets INNER JOIN updates ON updates.launch_asset_id = assets.id WHERE updates.id = ?;"

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    invoke-virtual {v2, v3, v4}, LM3/t$a;->a(Ljava/lang/String;I)LM3/t;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, v1, Lqd/f;->c:Lpd/b;

    .line 20
    .line 21
    invoke-virtual {v3, v0}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v2, v4, v0}, LM3/t;->p1(I[B)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v1, Lqd/f;->a:LM3/q;

    .line 29
    .line 30
    invoke-virtual {v0}, LM3/q;->d()V

    .line 31
    .line 32
    .line 33
    iget-object v0, v1, Lqd/f;->a:LM3/q;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-static {v0, v2, v3, v5}, LO3/b;->b(LM3/q;LS3/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    :try_start_0
    const-string v0, "key"

    .line 42
    .line 43
    invoke-static {v6, v0}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const-string v7, "type"

    .line 48
    .line 49
    invoke-static {v6, v7}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    const-string v8, "id"

    .line 54
    .line 55
    invoke-static {v6, v8}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    const-string v9, "url"

    .line 60
    .line 61
    invoke-static {v6, v9}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    const-string v10, "headers"

    .line 66
    .line 67
    invoke-static {v6, v10}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    const-string v11, "extra_request_headers"

    .line 72
    .line 73
    invoke-static {v6, v11}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    const-string v12, "metadata"

    .line 78
    .line 79
    invoke-static {v6, v12}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    const-string v13, "download_time"

    .line 84
    .line 85
    invoke-static {v6, v13}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v13

    .line 89
    const-string v14, "relative_path"

    .line 90
    .line 91
    invoke-static {v6, v14}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v14

    .line 95
    const-string v15, "hash"

    .line 96
    .line 97
    invoke-static {v6, v15}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v15

    .line 101
    const-string v3, "hash_type"

    .line 102
    .line 103
    invoke-static {v6, v3}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    const-string v4, "expected_hash"

    .line 108
    .line 109
    invoke-static {v6, v4}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    const-string v5, "marked_for_deletion"

    .line 114
    .line 115
    invoke-static {v6, v5}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 120
    .line 121
    .line 122
    move-result v16

    .line 123
    if-eqz v16, :cond_b

    .line 124
    .line 125
    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 126
    .line 127
    .line 128
    move-result v16

    .line 129
    if-eqz v16, :cond_0

    .line 130
    .line 131
    const/4 v0, 0x0

    .line 132
    goto :goto_0

    .line 133
    :cond_0
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :goto_0
    invoke-interface {v6, v7}, Landroid/database/Cursor;->isNull(I)Z

    .line 138
    .line 139
    .line 140
    move-result v16

    .line 141
    if-eqz v16, :cond_1

    .line 142
    .line 143
    const/4 v7, 0x0

    .line 144
    :goto_1
    move-object/from16 v16, v2

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_1
    invoke-interface {v6, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 151
    goto :goto_1

    .line 152
    :goto_2
    :try_start_1
    new-instance v2, Lrd/a;

    .line 153
    .line 154
    invoke-direct {v2, v0, v7}, Lrd/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v6, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 158
    .line 159
    .line 160
    move-result-wide v7

    .line 161
    invoke-virtual {v2, v7, v8}, Lrd/a;->B(J)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v6, v9}, Landroid/database/Cursor;->isNull(I)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_2

    .line 169
    .line 170
    const/4 v0, 0x0

    .line 171
    goto :goto_3

    .line 172
    :cond_2
    invoke-interface {v6, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    :goto_3
    iget-object v7, v1, Lqd/f;->c:Lpd/b;

    .line 177
    .line 178
    invoke-virtual {v7, v0}, Lpd/b;->l(Ljava/lang/String;)Landroid/net/Uri;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v2, v0}, Lrd/a;->K(Landroid/net/Uri;)V

    .line 183
    .line 184
    .line 185
    invoke-interface {v6, v10}, Landroid/database/Cursor;->isNull(I)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_3

    .line 190
    .line 191
    const/4 v0, 0x0

    .line 192
    goto :goto_4

    .line 193
    :cond_3
    invoke-interface {v6, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    :goto_4
    iget-object v7, v1, Lqd/f;->c:Lpd/b;

    .line 198
    .line 199
    invoke-virtual {v7, v0}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v2, v0}, Lrd/a;->A(Lorg/json/JSONObject;)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v6, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_4

    .line 211
    .line 212
    const/4 v0, 0x0

    .line 213
    goto :goto_5

    .line 214
    :cond_4
    invoke-interface {v6, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    :goto_5
    iget-object v7, v1, Lqd/f;->c:Lpd/b;

    .line 219
    .line 220
    invoke-virtual {v7, v0}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v2, v0}, Lrd/a;->x(Lorg/json/JSONObject;)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v6, v12}, Landroid/database/Cursor;->isNull(I)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_5

    .line 232
    .line 233
    const/4 v0, 0x0

    .line 234
    goto :goto_6

    .line 235
    :cond_5
    invoke-interface {v6, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    :goto_6
    iget-object v7, v1, Lqd/f;->c:Lpd/b;

    .line 240
    .line 241
    invoke-virtual {v7, v0}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v2, v0}, Lrd/a;->E(Lorg/json/JSONObject;)V

    .line 246
    .line 247
    .line 248
    invoke-interface {v6, v13}, Landroid/database/Cursor;->isNull(I)Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_6

    .line 253
    .line 254
    const/4 v0, 0x0

    .line 255
    goto :goto_7

    .line 256
    :cond_6
    invoke-interface {v6, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 257
    .line 258
    .line 259
    move-result-wide v7

    .line 260
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    :goto_7
    iget-object v7, v1, Lqd/f;->c:Lpd/b;

    .line 265
    .line 266
    invoke-virtual {v7, v0}, Lpd/b;->g(Ljava/lang/Long;)Ljava/util/Date;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {v2, v0}, Lrd/a;->u(Ljava/util/Date;)V

    .line 271
    .line 272
    .line 273
    invoke-interface {v6, v14}, Landroid/database/Cursor;->isNull(I)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_7

    .line 278
    .line 279
    const/4 v0, 0x0

    .line 280
    invoke-virtual {v2, v0}, Lrd/a;->F(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    goto :goto_8

    .line 284
    :catchall_0
    move-exception v0

    .line 285
    goto :goto_d

    .line 286
    :cond_7
    invoke-interface {v6, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v2, v0}, Lrd/a;->F(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    :goto_8
    invoke-interface {v6, v15}, Landroid/database/Cursor;->isNull(I)Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-eqz v0, :cond_8

    .line 298
    .line 299
    const/4 v0, 0x0

    .line 300
    invoke-virtual {v2, v0}, Lrd/a;->y([B)V

    .line 301
    .line 302
    .line 303
    goto :goto_9

    .line 304
    :cond_8
    invoke-interface {v6, v15}, Landroid/database/Cursor;->getBlob(I)[B

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v2, v0}, Lrd/a;->y([B)V

    .line 309
    .line 310
    .line 311
    :goto_9
    invoke-interface {v6, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    iget-object v3, v1, Lqd/f;->c:Lpd/b;

    .line 316
    .line 317
    invoke-virtual {v3, v0}, Lpd/b;->d(I)Lsd/a;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {v2, v0}, Lrd/a;->z(Lsd/a;)V

    .line 322
    .line 323
    .line 324
    invoke-interface {v6, v4}, Landroid/database/Cursor;->isNull(I)Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    if-eqz v0, :cond_9

    .line 329
    .line 330
    const/4 v0, 0x0

    .line 331
    invoke-virtual {v2, v0}, Lrd/a;->w(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    goto :goto_a

    .line 335
    :cond_9
    invoke-interface {v6, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-virtual {v2, v0}, Lrd/a;->w(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    :goto_a
    invoke-interface {v6, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-eqz v0, :cond_a

    .line 347
    .line 348
    const/4 v4, 0x1

    .line 349
    goto :goto_b

    .line 350
    :cond_a
    const/4 v4, 0x0

    .line 351
    :goto_b
    invoke-virtual {v2, v4}, Lrd/a;->D(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 352
    .line 353
    .line 354
    move-object v5, v2

    .line 355
    goto :goto_c

    .line 356
    :catchall_1
    move-exception v0

    .line 357
    move-object/from16 v16, v2

    .line 358
    .line 359
    goto :goto_d

    .line 360
    :cond_b
    move-object/from16 v16, v2

    .line 361
    .line 362
    const/4 v0, 0x0

    .line 363
    move-object v5, v0

    .line 364
    :goto_c
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v16 .. v16}, LM3/t;->k()V

    .line 368
    .line 369
    .line 370
    return-object v5

    .line 371
    :goto_d
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v16 .. v16}, LM3/t;->k()V

    .line 375
    .line 376
    .line 377
    throw v0
.end method

.method protected l(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "getString(...)"

    .line 6
    .line 7
    const-string v3, "scopeKey"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "statuses"

    .line 13
    .line 14
    move-object/from16 v4, p2

    .line 15
    .line 16
    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, LO3/d;->b()Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v5, "SELECT * FROM updates WHERE scope_key = "

    .line 24
    .line 25
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v5, "?"

    .line 29
    .line 30
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v5, " AND (successful_launch_count > 0 OR failed_launch_count < 1) AND status IN ("

    .line 34
    .line 35
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-static {v3, v5}, LO3/d;->a(Ljava/lang/StringBuilder;I)V

    .line 43
    .line 44
    .line 45
    const-string v6, ");"

    .line 46
    .line 47
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-string v6, "toString(...)"

    .line 55
    .line 56
    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 v6, 0x1

    .line 60
    add-int/2addr v5, v6

    .line 61
    sget-object v7, LM3/t;->i:LM3/t$a;

    .line 62
    .line 63
    invoke-virtual {v7, v3, v5}, LM3/t$a;->a(Ljava/lang/String;I)LM3/t;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3, v6, v0}, LM3/t;->Z0(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const/4 v4, 0x2

    .line 75
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_0

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Lsd/b;

    .line 86
    .line 87
    iget-object v7, v1, Lqd/f;->c:Lpd/b;

    .line 88
    .line 89
    invoke-virtual {v7, v5}, Lpd/b;->h(Lsd/b;)I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    int-to-long v7, v5

    .line 94
    invoke-virtual {v3, v4, v7, v8}, LM3/t;->m1(IJ)V

    .line 95
    .line 96
    .line 97
    add-int/2addr v4, v6

    .line 98
    goto :goto_0

    .line 99
    :cond_0
    iget-object v0, v1, Lqd/f;->a:LM3/q;

    .line 100
    .line 101
    invoke-virtual {v0}, LM3/q;->d()V

    .line 102
    .line 103
    .line 104
    iget-object v0, v1, Lqd/f;->a:LM3/q;

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    const/4 v5, 0x0

    .line 108
    invoke-static {v0, v3, v4, v5}, LO3/b;->b(LM3/q;LS3/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    :try_start_0
    const-string v0, "id"

    .line 113
    .line 114
    invoke-static {v7, v0}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    const-string v8, "commit_time"

    .line 119
    .line 120
    invoke-static {v7, v8}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    const-string v9, "runtime_version"

    .line 125
    .line 126
    invoke-static {v7, v9}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    const-string v10, "scope_key"

    .line 131
    .line 132
    invoke-static {v7, v10}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    const-string v11, "manifest"

    .line 137
    .line 138
    invoke-static {v7, v11}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    const-string v12, "url"

    .line 143
    .line 144
    invoke-static {v7, v12}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v12

    .line 148
    const-string v13, "headers"

    .line 149
    .line 150
    invoke-static {v7, v13}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v13

    .line 154
    const-string v14, "launch_asset_id"

    .line 155
    .line 156
    invoke-static {v7, v14}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    const-string v15, "status"

    .line 161
    .line 162
    invoke-static {v7, v15}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v15

    .line 166
    const-string v4, "keep"

    .line 167
    .line 168
    invoke-static {v7, v4}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    const-string v6, "last_accessed"

    .line 173
    .line 174
    invoke-static {v7, v6}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    const-string v5, "successful_launch_count"

    .line 179
    .line 180
    invoke-static {v7, v5}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 184
    move-object/from16 v16, v3

    .line 185
    .line 186
    :try_start_1
    const-string v3, "failed_launch_count"

    .line 187
    .line 188
    invoke-static {v7, v3}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    move/from16 v17, v3

    .line 193
    .line 194
    new-instance v3, Ljava/util/ArrayList;

    .line 195
    .line 196
    move/from16 v18, v5

    .line 197
    .line 198
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 203
    .line 204
    .line 205
    :goto_1
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_b

    .line 210
    .line 211
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    move/from16 v19, v0

    .line 216
    .line 217
    const-string v0, "getBlob(...)"

    .line 218
    .line 219
    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    iget-object v0, v1, Lqd/f;->c:Lpd/b;

    .line 223
    .line 224
    invoke-virtual {v0, v5}, Lpd/b;->a([B)Ljava/util/UUID;

    .line 225
    .line 226
    .line 227
    move-result-object v21

    .line 228
    invoke-interface {v7, v8}, Landroid/database/Cursor;->isNull(I)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_1

    .line 233
    .line 234
    const/4 v0, 0x0

    .line 235
    goto :goto_2

    .line 236
    :cond_1
    invoke-interface {v7, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 237
    .line 238
    .line 239
    move-result-wide v22

    .line 240
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    :goto_2
    iget-object v5, v1, Lqd/f;->c:Lpd/b;

    .line 245
    .line 246
    invoke-virtual {v5, v0}, Lpd/b;->g(Ljava/lang/Long;)Ljava/util/Date;

    .line 247
    .line 248
    .line 249
    move-result-object v22
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 250
    const-string v0, "Expected NON-NULL \'java.util.Date\', but it was NULL."

    .line 251
    .line 252
    if-eqz v22, :cond_a

    .line 253
    .line 254
    :try_start_2
    invoke-interface {v7, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    move-object/from16 v23, v5

    .line 262
    .line 263
    invoke-interface {v7, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-interface {v7, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 271
    .line 272
    .line 273
    move-result v20

    .line 274
    if-eqz v20, :cond_2

    .line 275
    .line 276
    move-object/from16 v28, v2

    .line 277
    .line 278
    const/4 v2, 0x0

    .line 279
    :goto_3
    move-object/from16 v24, v5

    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_2
    invoke-interface {v7, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v20

    .line 286
    move-object/from16 v28, v2

    .line 287
    .line 288
    move-object/from16 v2, v20

    .line 289
    .line 290
    goto :goto_3

    .line 291
    :goto_4
    iget-object v5, v1, Lqd/f;->c:Lpd/b;

    .line 292
    .line 293
    invoke-virtual {v5, v2}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 294
    .line 295
    .line 296
    move-result-object v25

    .line 297
    if-eqz v25, :cond_9

    .line 298
    .line 299
    invoke-interface {v7, v12}, Landroid/database/Cursor;->isNull(I)Z

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    if-eqz v2, :cond_3

    .line 304
    .line 305
    const/4 v2, 0x0

    .line 306
    goto :goto_5

    .line 307
    :cond_3
    invoke-interface {v7, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    :goto_5
    iget-object v5, v1, Lqd/f;->c:Lpd/b;

    .line 312
    .line 313
    invoke-virtual {v5, v2}, Lpd/b;->l(Ljava/lang/String;)Landroid/net/Uri;

    .line 314
    .line 315
    .line 316
    move-result-object v26

    .line 317
    invoke-interface {v7, v13}, Landroid/database/Cursor;->isNull(I)Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    if-eqz v2, :cond_4

    .line 322
    .line 323
    const/4 v2, 0x0

    .line 324
    goto :goto_6

    .line 325
    :cond_4
    invoke-interface {v7, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    :goto_6
    iget-object v5, v1, Lqd/f;->c:Lpd/b;

    .line 330
    .line 331
    invoke-virtual {v5, v2}, Lpd/b;->k(Ljava/lang/String;)Ljava/util/Map;

    .line 332
    .line 333
    .line 334
    move-result-object v27

    .line 335
    new-instance v20, Lrd/d;

    .line 336
    .line 337
    invoke-direct/range {v20 .. v27}, Lrd/d;-><init>(Ljava/util/UUID;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Landroid/net/Uri;Ljava/util/Map;)V

    .line 338
    .line 339
    .line 340
    move-object/from16 v2, v20

    .line 341
    .line 342
    invoke-interface {v7, v14}, Landroid/database/Cursor;->isNull(I)Z

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    if-eqz v5, :cond_5

    .line 347
    .line 348
    const/4 v5, 0x0

    .line 349
    invoke-virtual {v2, v5}, Lrd/d;->t(Ljava/lang/Long;)V

    .line 350
    .line 351
    .line 352
    goto :goto_7

    .line 353
    :catchall_0
    move-exception v0

    .line 354
    goto/16 :goto_a

    .line 355
    .line 356
    :cond_5
    const/4 v5, 0x0

    .line 357
    invoke-interface {v7, v14}, Landroid/database/Cursor;->getLong(I)J

    .line 358
    .line 359
    .line 360
    move-result-wide v20

    .line 361
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    invoke-virtual {v2, v5}, Lrd/d;->t(Ljava/lang/Long;)V

    .line 366
    .line 367
    .line 368
    :goto_7
    invoke-interface {v7, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    move/from16 v20, v8

    .line 373
    .line 374
    iget-object v8, v1, Lqd/f;->c:Lpd/b;

    .line 375
    .line 376
    invoke-virtual {v8, v5}, Lpd/b;->e(I)Lsd/b;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    invoke-virtual {v2, v5}, Lrd/d;->v(Lsd/b;)V

    .line 381
    .line 382
    .line 383
    invoke-interface {v7, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 384
    .line 385
    .line 386
    move-result v5

    .line 387
    if-eqz v5, :cond_6

    .line 388
    .line 389
    const/4 v5, 0x1

    .line 390
    goto :goto_8

    .line 391
    :cond_6
    const/4 v5, 0x0

    .line 392
    :goto_8
    invoke-virtual {v2, v5}, Lrd/d;->r(Z)V

    .line 393
    .line 394
    .line 395
    invoke-interface {v7, v6}, Landroid/database/Cursor;->isNull(I)Z

    .line 396
    .line 397
    .line 398
    move-result v5

    .line 399
    if-eqz v5, :cond_7

    .line 400
    .line 401
    const/4 v5, 0x0

    .line 402
    goto :goto_9

    .line 403
    :cond_7
    invoke-interface {v7, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 404
    .line 405
    .line 406
    move-result-wide v21

    .line 407
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    :goto_9
    iget-object v8, v1, Lqd/f;->c:Lpd/b;

    .line 412
    .line 413
    invoke-virtual {v8, v5}, Lpd/b;->g(Ljava/lang/Long;)Ljava/util/Date;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    if-eqz v5, :cond_8

    .line 418
    .line 419
    invoke-virtual {v2, v5}, Lrd/d;->s(Ljava/util/Date;)V

    .line 420
    .line 421
    .line 422
    move/from16 v0, v18

    .line 423
    .line 424
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    invoke-virtual {v2, v5}, Lrd/d;->w(I)V

    .line 429
    .line 430
    .line 431
    move/from16 v5, v17

    .line 432
    .line 433
    invoke-interface {v7, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 434
    .line 435
    .line 436
    move-result v8

    .line 437
    invoke-virtual {v2, v8}, Lrd/d;->q(I)V

    .line 438
    .line 439
    .line 440
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move/from16 v18, v0

    .line 444
    .line 445
    move/from16 v17, v5

    .line 446
    .line 447
    move/from16 v0, v19

    .line 448
    .line 449
    move/from16 v8, v20

    .line 450
    .line 451
    move-object/from16 v2, v28

    .line 452
    .line 453
    goto/16 :goto_1

    .line 454
    .line 455
    :cond_8
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 456
    .line 457
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    throw v2

    .line 461
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 462
    .line 463
    const-string v2, "Expected NON-NULL \'org.json.JSONObject\', but it was NULL."

    .line 464
    .line 465
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    throw v0

    .line 469
    :cond_a
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 470
    .line 471
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 475
    :cond_b
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v16 .. v16}, LM3/t;->k()V

    .line 479
    .line 480
    .line 481
    return-object v3

    .line 482
    :catchall_1
    move-exception v0

    .line 483
    move-object/from16 v16, v3

    .line 484
    .line 485
    :goto_a
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v16 .. v16}, LM3/t;->k()V

    .line 489
    .line 490
    .line 491
    throw v0
.end method

.method public n()Ljava/util/List;
    .locals 6

    .line 1
    sget-object v0, LM3/t;->i:LM3/t$a;

    .line 2
    .line 3
    const-string v1, "SELECT id FROM updates WHERE failed_launch_count > 0 ORDER BY commit_time DESC LIMIT 5;"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, v2}, LM3/t$a;->a(Ljava/lang/String;I)LM3/t;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lqd/f;->a:LM3/q;

    .line 11
    .line 12
    invoke-virtual {v1}, LM3/q;->d()V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lqd/f;->a:LM3/q;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static {v1, v0, v2, v3}, LO3/b;->b(LM3/q;LS3/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    const-string v5, "getBlob(...)"

    .line 42
    .line 43
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v5, p0, Lqd/f;->c:Lpd/b;

    .line 47
    .line 48
    invoke-virtual {v5, v4}, Lpd/b;->a([B)Ljava/util/UUID;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception v2

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, LM3/t;->k()V

    .line 62
    .line 63
    .line 64
    return-object v3

    .line 65
    :goto_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, LM3/t;->k()V

    .line 69
    .line 70
    .line 71
    throw v2
.end method

.method protected p(Ljava/util/UUID;)Ljava/util/List;
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "getString(...)"

    .line 6
    .line 7
    const-string v3, "id"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v4, LM3/t;->i:LM3/t$a;

    .line 13
    .line 14
    const-string v5, "SELECT * FROM updates WHERE id = ?;"

    .line 15
    .line 16
    const/4 v6, 0x1

    .line 17
    invoke-virtual {v4, v5, v6}, LM3/t$a;->a(Ljava/lang/String;I)LM3/t;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v5, v1, Lqd/f;->c:Lpd/b;

    .line 22
    .line 23
    invoke-virtual {v5, v0}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v4, v6, v0}, LM3/t;->p1(I[B)V

    .line 28
    .line 29
    .line 30
    iget-object v0, v1, Lqd/f;->a:LM3/q;

    .line 31
    .line 32
    invoke-virtual {v0}, LM3/q;->d()V

    .line 33
    .line 34
    .line 35
    iget-object v0, v1, Lqd/f;->a:LM3/q;

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    invoke-static {v0, v4, v5, v7}, LO3/b;->b(LM3/q;LS3/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    :try_start_0
    invoke-static {v8, v3}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const-string v3, "commit_time"

    .line 48
    .line 49
    invoke-static {v8, v3}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const-string v9, "runtime_version"

    .line 54
    .line 55
    invoke-static {v8, v9}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    const-string v10, "scope_key"

    .line 60
    .line 61
    invoke-static {v8, v10}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    const-string v11, "manifest"

    .line 66
    .line 67
    invoke-static {v8, v11}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    const-string v12, "url"

    .line 72
    .line 73
    invoke-static {v8, v12}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v12

    .line 77
    const-string v13, "headers"

    .line 78
    .line 79
    invoke-static {v8, v13}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    const-string v14, "launch_asset_id"

    .line 84
    .line 85
    invoke-static {v8, v14}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    const-string v15, "status"

    .line 90
    .line 91
    invoke-static {v8, v15}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v15

    .line 95
    const-string v5, "keep"

    .line 96
    .line 97
    invoke-static {v8, v5}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    const-string v6, "last_accessed"

    .line 102
    .line 103
    invoke-static {v8, v6}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    const-string v7, "successful_launch_count"

    .line 108
    .line 109
    invoke-static {v8, v7}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 113
    move-object/from16 v16, v4

    .line 114
    .line 115
    :try_start_1
    const-string v4, "failed_launch_count"

    .line 116
    .line 117
    invoke-static {v8, v4}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    move/from16 v17, v4

    .line 122
    .line 123
    new-instance v4, Ljava/util/ArrayList;

    .line 124
    .line 125
    move/from16 v18, v7

    .line 126
    .line 127
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 132
    .line 133
    .line 134
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-eqz v7, :cond_a

    .line 139
    .line 140
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    move/from16 v19, v0

    .line 145
    .line 146
    const-string v0, "getBlob(...)"

    .line 147
    .line 148
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, v1, Lqd/f;->c:Lpd/b;

    .line 152
    .line 153
    invoke-virtual {v0, v7}, Lpd/b;->a([B)Ljava/util/UUID;

    .line 154
    .line 155
    .line 156
    move-result-object v21

    .line 157
    invoke-interface {v8, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_0

    .line 162
    .line 163
    const/4 v0, 0x0

    .line 164
    goto :goto_1

    .line 165
    :cond_0
    invoke-interface {v8, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 166
    .line 167
    .line 168
    move-result-wide v22

    .line 169
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    :goto_1
    iget-object v7, v1, Lqd/f;->c:Lpd/b;

    .line 174
    .line 175
    invoke-virtual {v7, v0}, Lpd/b;->g(Ljava/lang/Long;)Ljava/util/Date;

    .line 176
    .line 177
    .line 178
    move-result-object v22
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    const-string v0, "Expected NON-NULL \'java.util.Date\', but it was NULL."

    .line 180
    .line 181
    if-eqz v22, :cond_9

    .line 182
    .line 183
    :try_start_2
    invoke-interface {v8, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    move/from16 v28, v3

    .line 191
    .line 192
    invoke-interface {v8, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v8, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 200
    .line 201
    .line 202
    move-result v20

    .line 203
    if-eqz v20, :cond_1

    .line 204
    .line 205
    move-object/from16 v29, v2

    .line 206
    .line 207
    const/4 v2, 0x0

    .line 208
    :goto_2
    move-object/from16 v24, v3

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_1
    invoke-interface {v8, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v20

    .line 215
    move-object/from16 v29, v2

    .line 216
    .line 217
    move-object/from16 v2, v20

    .line 218
    .line 219
    goto :goto_2

    .line 220
    :goto_3
    iget-object v3, v1, Lqd/f;->c:Lpd/b;

    .line 221
    .line 222
    invoke-virtual {v3, v2}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 223
    .line 224
    .line 225
    move-result-object v25

    .line 226
    if-eqz v25, :cond_8

    .line 227
    .line 228
    invoke-interface {v8, v12}, Landroid/database/Cursor;->isNull(I)Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-eqz v2, :cond_2

    .line 233
    .line 234
    const/4 v2, 0x0

    .line 235
    goto :goto_4

    .line 236
    :cond_2
    invoke-interface {v8, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    :goto_4
    iget-object v3, v1, Lqd/f;->c:Lpd/b;

    .line 241
    .line 242
    invoke-virtual {v3, v2}, Lpd/b;->l(Ljava/lang/String;)Landroid/net/Uri;

    .line 243
    .line 244
    .line 245
    move-result-object v26

    .line 246
    invoke-interface {v8, v13}, Landroid/database/Cursor;->isNull(I)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eqz v2, :cond_3

    .line 251
    .line 252
    const/4 v2, 0x0

    .line 253
    goto :goto_5

    .line 254
    :cond_3
    invoke-interface {v8, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    :goto_5
    iget-object v3, v1, Lqd/f;->c:Lpd/b;

    .line 259
    .line 260
    invoke-virtual {v3, v2}, Lpd/b;->k(Ljava/lang/String;)Ljava/util/Map;

    .line 261
    .line 262
    .line 263
    move-result-object v27

    .line 264
    new-instance v20, Lrd/d;

    .line 265
    .line 266
    move-object/from16 v23, v7

    .line 267
    .line 268
    invoke-direct/range {v20 .. v27}, Lrd/d;-><init>(Ljava/util/UUID;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Landroid/net/Uri;Ljava/util/Map;)V

    .line 269
    .line 270
    .line 271
    move-object/from16 v2, v20

    .line 272
    .line 273
    invoke-interface {v8, v14}, Landroid/database/Cursor;->isNull(I)Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    if-eqz v3, :cond_4

    .line 278
    .line 279
    const/4 v3, 0x0

    .line 280
    invoke-virtual {v2, v3}, Lrd/d;->t(Ljava/lang/Long;)V

    .line 281
    .line 282
    .line 283
    goto :goto_6

    .line 284
    :catchall_0
    move-exception v0

    .line 285
    goto/16 :goto_9

    .line 286
    .line 287
    :cond_4
    const/4 v3, 0x0

    .line 288
    invoke-interface {v8, v14}, Landroid/database/Cursor;->getLong(I)J

    .line 289
    .line 290
    .line 291
    move-result-wide v20

    .line 292
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    invoke-virtual {v2, v7}, Lrd/d;->t(Ljava/lang/Long;)V

    .line 297
    .line 298
    .line 299
    :goto_6
    invoke-interface {v8, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 300
    .line 301
    .line 302
    move-result v7

    .line 303
    iget-object v3, v1, Lqd/f;->c:Lpd/b;

    .line 304
    .line 305
    invoke-virtual {v3, v7}, Lpd/b;->e(I)Lsd/b;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-virtual {v2, v3}, Lrd/d;->v(Lsd/b;)V

    .line 310
    .line 311
    .line 312
    invoke-interface {v8, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    if-eqz v3, :cond_5

    .line 317
    .line 318
    const/4 v3, 0x1

    .line 319
    goto :goto_7

    .line 320
    :cond_5
    const/4 v3, 0x0

    .line 321
    :goto_7
    invoke-virtual {v2, v3}, Lrd/d;->r(Z)V

    .line 322
    .line 323
    .line 324
    invoke-interface {v8, v6}, Landroid/database/Cursor;->isNull(I)Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-eqz v3, :cond_6

    .line 329
    .line 330
    const/4 v3, 0x0

    .line 331
    goto :goto_8

    .line 332
    :cond_6
    invoke-interface {v8, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 333
    .line 334
    .line 335
    move-result-wide v20

    .line 336
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    :goto_8
    iget-object v7, v1, Lqd/f;->c:Lpd/b;

    .line 341
    .line 342
    invoke-virtual {v7, v3}, Lpd/b;->g(Ljava/lang/Long;)Ljava/util/Date;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    if-eqz v3, :cond_7

    .line 347
    .line 348
    invoke-virtual {v2, v3}, Lrd/d;->s(Ljava/util/Date;)V

    .line 349
    .line 350
    .line 351
    move/from16 v0, v18

    .line 352
    .line 353
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    invoke-virtual {v2, v3}, Lrd/d;->w(I)V

    .line 358
    .line 359
    .line 360
    move/from16 v3, v17

    .line 361
    .line 362
    invoke-interface {v8, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 363
    .line 364
    .line 365
    move-result v7

    .line 366
    invoke-virtual {v2, v7}, Lrd/d;->q(I)V

    .line 367
    .line 368
    .line 369
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move/from16 v18, v0

    .line 373
    .line 374
    move/from16 v17, v3

    .line 375
    .line 376
    move/from16 v0, v19

    .line 377
    .line 378
    move/from16 v3, v28

    .line 379
    .line 380
    move-object/from16 v2, v29

    .line 381
    .line 382
    goto/16 :goto_0

    .line 383
    .line 384
    :cond_7
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 385
    .line 386
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    throw v2

    .line 390
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 391
    .line 392
    const-string v2, "Expected NON-NULL \'org.json.JSONObject\', but it was NULL."

    .line 393
    .line 394
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw v0

    .line 398
    :cond_9
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 399
    .line 400
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 404
    :cond_a
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v16 .. v16}, LM3/t;->k()V

    .line 408
    .line 409
    .line 410
    return-object v4

    .line 411
    :catchall_1
    move-exception v0

    .line 412
    move-object/from16 v16, v4

    .line 413
    .line 414
    :goto_9
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v16 .. v16}, LM3/t;->k()V

    .line 418
    .line 419
    .line 420
    throw v0
.end method

.method protected r(Ljava/util/UUID;Ljava/util/Date;)V
    .locals 4

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lastAccessed"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->d()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lqd/f;->i:LM3/w;

    .line 17
    .line 18
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lqd/f;->c:Lpd/b;

    .line 23
    .line 24
    invoke-virtual {v1, p2}, Lpd/b;->b(Ljava/util/Date;)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const/4 v1, 0x1

    .line 29
    if-nez p2, :cond_0

    .line 30
    .line 31
    invoke-interface {v0, v1}, LS3/i;->I1(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    invoke-interface {v0, v1, v2, v3}, LS3/i;->m1(IJ)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object p2, p0, Lqd/f;->c:Lpd/b;

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 p2, 0x2

    .line 49
    invoke-interface {v0, p2, p1}, LS3/i;->p1(I[B)V

    .line 50
    .line 51
    .line 52
    :try_start_0
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 53
    .line 54
    invoke-virtual {p1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 61
    .line 62
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    .line 64
    .line 65
    :try_start_2
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 66
    .line 67
    invoke-virtual {p1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lqd/f;->i:LM3/w;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, LM3/w;->h(LS3/k;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    goto :goto_1

    .line 78
    :catchall_1
    move-exception p1

    .line 79
    :try_start_3
    iget-object p2, p0, Lqd/f;->a:LM3/q;

    .line 80
    .line 81
    invoke-virtual {p2}, LM3/q;->i()V

    .line 82
    .line 83
    .line 84
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 85
    :goto_1
    iget-object p2, p0, Lqd/f;->i:LM3/w;

    .line 86
    .line 87
    invoke-virtual {p2, v0}, LM3/w;->h(LS3/k;)V

    .line 88
    .line 89
    .line 90
    throw p1
.end method

.method public t(Lrd/d;Z)V
    .locals 1

    .line 1
    const-string v0, "update"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->e()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-super {p0, p1, p2}, Lqd/e;->t(Lrd/d;Z)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 15
    .line 16
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 20
    .line 21
    invoke-virtual {p1}, LM3/q;->i()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    iget-object p2, p0, Lqd/f;->a:LM3/q;

    .line 27
    .line 28
    invoke-virtual {p2}, LM3/q;->i()V

    .line 29
    .line 30
    .line 31
    throw p1
.end method

.method protected u(Lsd/b;Ljava/util/UUID;)V
    .locals 3

    .line 1
    const-string v0, "status"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "id"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->d()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lqd/f;->f:LM3/w;

    .line 17
    .line 18
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lqd/f;->c:Lpd/b;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lpd/b;->h(Lsd/b;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    int-to-long v1, p1

    .line 29
    const/4 p1, 0x1

    .line 30
    invoke-interface {v0, p1, v1, v2}, LS3/i;->m1(IJ)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lqd/f;->c:Lpd/b;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 p2, 0x2

    .line 40
    invoke-interface {v0, p2, p1}, LS3/i;->p1(I[B)V

    .line 41
    .line 42
    .line 43
    :try_start_0
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 44
    .line 45
    invoke-virtual {p1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 52
    .line 53
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    .line 55
    .line 56
    :try_start_2
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 57
    .line 58
    invoke-virtual {p1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lqd/f;->f:LM3/w;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, LM3/w;->h(LS3/k;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    goto :goto_0

    .line 69
    :catchall_1
    move-exception p1

    .line 70
    :try_start_3
    iget-object p2, p0, Lqd/f;->a:LM3/q;

    .line 71
    .line 72
    invoke-virtual {p2}, LM3/q;->i()V

    .line 73
    .line 74
    .line 75
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 76
    :goto_0
    iget-object p2, p0, Lqd/f;->f:LM3/w;

    .line 77
    .line 78
    invoke-virtual {p2, v0}, LM3/w;->h(LS3/k;)V

    .line 79
    .line 80
    .line 81
    throw p1
.end method

.method public w(Ljava/util/UUID;Ljava/util/Date;)V
    .locals 4

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "commitTime"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/f;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->d()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lqd/f;->h:LM3/w;

    .line 17
    .line 18
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lqd/f;->c:Lpd/b;

    .line 23
    .line 24
    invoke-virtual {v1, p2}, Lpd/b;->b(Ljava/util/Date;)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const/4 v1, 0x1

    .line 29
    if-nez p2, :cond_0

    .line 30
    .line 31
    invoke-interface {v0, v1}, LS3/i;->I1(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    invoke-interface {v0, v1, v2, v3}, LS3/i;->m1(IJ)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object p2, p0, Lqd/f;->c:Lpd/b;

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 p2, 0x2

    .line 49
    invoke-interface {v0, p2, p1}, LS3/i;->p1(I[B)V

    .line 50
    .line 51
    .line 52
    :try_start_0
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 53
    .line 54
    invoke-virtual {p1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 61
    .line 62
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    .line 64
    .line 65
    :try_start_2
    iget-object p1, p0, Lqd/f;->a:LM3/q;

    .line 66
    .line 67
    invoke-virtual {p1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lqd/f;->h:LM3/w;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, LM3/w;->h(LS3/k;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    goto :goto_1

    .line 78
    :catchall_1
    move-exception p1

    .line 79
    :try_start_3
    iget-object p2, p0, Lqd/f;->a:LM3/q;

    .line 80
    .line 81
    invoke-virtual {p2}, LM3/q;->i()V

    .line 82
    .line 83
    .line 84
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 85
    :goto_1
    iget-object p2, p0, Lqd/f;->h:LM3/w;

    .line 86
    .line 87
    invoke-virtual {p2, v0}, LM3/w;->h(LS3/k;)V

    .line 88
    .line 89
    .line 90
    throw p1
.end method
