.class public final Lc9/b;
.super LP8/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LL8/b;


# static fields
.field private static final k:LP8/a$g;

.field private static final l:LP8/a$a;

.field private static final m:LP8/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LP8/a$g;

    .line 2
    .line 3
    invoke-direct {v0}, LP8/a$g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc9/b;->k:LP8/a$g;

    .line 7
    .line 8
    new-instance v1, Lc9/r;

    .line 9
    .line 10
    invoke-direct {v1}, Lc9/r;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lc9/b;->l:LP8/a$a;

    .line 14
    .line 15
    new-instance v2, LP8/a;

    .line 16
    .line 17
    const-string v3, "Blockstore.API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, LP8/a;-><init>(Ljava/lang/String;LP8/a$a;LP8/a$g;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lc9/b;->m:LP8/a;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    sget-object v0, Lc9/b;->m:LP8/a;

    .line 2
    .line 3
    sget-object v1, LP8/a$d;->O:LP8/a$d$a;

    .line 4
    .line 5
    sget-object v2, LP8/e$a;->c:LP8/e$a;

    .line 6
    .line 7
    invoke-direct {p0, p1, v0, v1, v2}, LP8/e;-><init>(Landroid/content/Context;LP8/a;LP8/a$d;LP8/e$a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LL8/f;)Ln9/i;
    .locals 3

    .line 1
    invoke-static {}, LQ8/r;->a()LQ8/r$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lc9/c;->d:LO8/c;

    .line 6
    .line 7
    sget-object v2, Lc9/c;->f:LO8/c;

    .line 8
    .line 9
    filled-new-array {v1, v2}, [LO8/c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, LQ8/r$a;->d([LO8/c;)LQ8/r$a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lc9/p;

    .line 18
    .line 19
    invoke-direct {v1, p0, p1}, Lc9/p;-><init>(Lc9/b;LL8/f;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, LQ8/r$a;->b(LQ8/n;)LQ8/r$a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/16 v0, 0x66d

    .line 27
    .line 28
    invoke-virtual {p1, v0}, LQ8/r$a;->e(I)LQ8/r$a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p1, v0}, LQ8/r$a;->c(Z)LQ8/r$a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, LQ8/r$a;->a()LQ8/r;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, LP8/e;->m(LQ8/r;)Ln9/i;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1
.end method

.method public final b(LL8/c;)Ln9/i;
    .locals 2

    .line 1
    const-string v0, "DeleteBytesRequest cannot be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {}, LQ8/r;->a()LQ8/r$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lc9/c;->g:LO8/c;

    .line 11
    .line 12
    filled-new-array {v1}, [LO8/c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, LQ8/r$a;->d([LO8/c;)LQ8/r$a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lc9/o;

    .line 21
    .line 22
    invoke-direct {v1, p0, p1}, Lc9/o;-><init>(Lc9/b;LL8/c;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, LQ8/r$a;->b(LQ8/n;)LQ8/r$a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1, v0}, LQ8/r$a;->c(Z)LQ8/r$a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/16 v0, 0x685

    .line 35
    .line 36
    invoke-virtual {p1, v0}, LQ8/r$a;->e(I)LQ8/r$a;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, LQ8/r$a;->a()LQ8/r;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, LP8/e;->m(LQ8/r;)Ln9/i;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1
.end method

.method public final e(LL8/d;)Ln9/i;
    .locals 2

    .line 1
    const-string v0, "RetrieveBytesRequest cannot be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {}, LQ8/r;->a()LQ8/r$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lc9/c;->h:LO8/c;

    .line 11
    .line 12
    filled-new-array {v1}, [LO8/c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, LQ8/r$a;->d([LO8/c;)LQ8/r$a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lc9/q;

    .line 21
    .line 22
    invoke-direct {v1, p0, p1}, Lc9/q;-><init>(Lc9/b;LL8/d;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, LQ8/r$a;->b(LQ8/n;)LQ8/r$a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1, v0}, LQ8/r$a;->c(Z)LQ8/r$a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/16 v0, 0x684

    .line 35
    .line 36
    invoke-virtual {p1, v0}, LQ8/r$a;->e(I)LQ8/r$a;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, LQ8/r$a;->a()LQ8/r;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, LP8/e;->k(LQ8/r;)Ln9/i;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1
.end method
