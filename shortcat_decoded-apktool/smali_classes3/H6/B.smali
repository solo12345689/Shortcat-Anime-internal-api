.class public LH6/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH6/B$a;
    }
.end annotation


# instance fields
.field private final a:LH6/E;

.field private final b:LH6/F;

.field private final c:LH6/E;

.field private final d:LB5/d;

.field private final e:LH6/E;

.field private final f:LH6/F;

.field private final g:LH6/E;

.field private final h:LH6/F;

.field private final i:Ljava/lang/String;

.field private final j:I

.field private final k:I

.field private final l:Z

.field private final m:Z


# direct methods
.method private constructor <init>(LH6/B$a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, LL6/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    const-string v0, "PoolConfig()"

    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 5
    :cond_0
    invoke-static {p1}, LH6/B$a;->c(LH6/B$a;)LH6/E;

    move-result-object v0

    if-nez v0, :cond_1

    .line 6
    invoke-static {}, LH6/n;->a()LH6/E;

    move-result-object v0

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {p1}, LH6/B$a;->c(LH6/B$a;)LH6/E;

    move-result-object v0

    :goto_0
    iput-object v0, p0, LH6/B;->a:LH6/E;

    .line 8
    invoke-static {p1}, LH6/B$a;->d(LH6/B$a;)LH6/F;

    move-result-object v0

    if-nez v0, :cond_2

    .line 9
    invoke-static {}, LH6/z;->h()LH6/z;

    move-result-object v0

    goto :goto_1

    .line 10
    :cond_2
    invoke-static {p1}, LH6/B$a;->d(LH6/B$a;)LH6/F;

    move-result-object v0

    :goto_1
    iput-object v0, p0, LH6/B;->b:LH6/F;

    .line 11
    invoke-static {p1}, LH6/B$a;->f(LH6/B$a;)LH6/E;

    move-result-object v0

    if-nez v0, :cond_3

    .line 12
    invoke-static {}, LH6/p;->b()LH6/E;

    move-result-object v0

    goto :goto_2

    .line 13
    :cond_3
    invoke-static {p1}, LH6/B$a;->f(LH6/B$a;)LH6/E;

    move-result-object v0

    :goto_2
    iput-object v0, p0, LH6/B;->c:LH6/E;

    .line 14
    invoke-static {p1}, LH6/B$a;->i(LH6/B$a;)LB5/d;

    move-result-object v0

    if-nez v0, :cond_4

    .line 15
    invoke-static {}, LB5/e;->b()LB5/e;

    move-result-object v0

    goto :goto_3

    .line 16
    :cond_4
    invoke-static {p1}, LH6/B$a;->i(LH6/B$a;)LB5/d;

    move-result-object v0

    :goto_3
    iput-object v0, p0, LH6/B;->d:LB5/d;

    .line 17
    invoke-static {p1}, LH6/B$a;->g(LH6/B$a;)LH6/E;

    move-result-object v0

    if-nez v0, :cond_5

    .line 18
    invoke-static {}, LH6/q;->a()LH6/E;

    move-result-object v0

    goto :goto_4

    .line 19
    :cond_5
    invoke-static {p1}, LH6/B$a;->g(LH6/B$a;)LH6/E;

    move-result-object v0

    :goto_4
    iput-object v0, p0, LH6/B;->e:LH6/E;

    .line 20
    invoke-static {p1}, LH6/B$a;->h(LH6/B$a;)LH6/F;

    move-result-object v0

    if-nez v0, :cond_6

    .line 21
    invoke-static {}, LH6/z;->h()LH6/z;

    move-result-object v0

    goto :goto_5

    .line 22
    :cond_6
    invoke-static {p1}, LH6/B$a;->h(LH6/B$a;)LH6/F;

    move-result-object v0

    :goto_5
    iput-object v0, p0, LH6/B;->f:LH6/F;

    .line 23
    invoke-static {p1}, LH6/B$a;->k(LH6/B$a;)LH6/E;

    move-result-object v0

    if-nez v0, :cond_7

    .line 24
    invoke-static {}, LH6/o;->a()LH6/E;

    move-result-object v0

    goto :goto_6

    .line 25
    :cond_7
    invoke-static {p1}, LH6/B$a;->k(LH6/B$a;)LH6/E;

    move-result-object v0

    :goto_6
    iput-object v0, p0, LH6/B;->g:LH6/E;

    .line 26
    invoke-static {p1}, LH6/B$a;->l(LH6/B$a;)LH6/F;

    move-result-object v0

    if-nez v0, :cond_8

    .line 27
    invoke-static {}, LH6/z;->h()LH6/z;

    move-result-object v0

    goto :goto_7

    .line 28
    :cond_8
    invoke-static {p1}, LH6/B$a;->l(LH6/B$a;)LH6/F;

    move-result-object v0

    :goto_7
    iput-object v0, p0, LH6/B;->h:LH6/F;

    .line 29
    invoke-static {p1}, LH6/B$a;->e(LH6/B$a;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    const-string v0, "legacy"

    goto :goto_8

    :cond_9
    invoke-static {p1}, LH6/B$a;->e(LH6/B$a;)Ljava/lang/String;

    move-result-object v0

    :goto_8
    iput-object v0, p0, LH6/B;->i:Ljava/lang/String;

    .line 30
    invoke-static {p1}, LH6/B$a;->b(LH6/B$a;)I

    move-result v0

    iput v0, p0, LH6/B;->j:I

    .line 31
    invoke-static {p1}, LH6/B$a;->a(LH6/B$a;)I

    move-result v0

    if-lez v0, :cond_a

    .line 32
    invoke-static {p1}, LH6/B$a;->a(LH6/B$a;)I

    move-result v0

    goto :goto_9

    :cond_a
    const/high16 v0, 0x400000

    .line 33
    :goto_9
    iput v0, p0, LH6/B;->k:I

    .line 34
    invoke-static {p1}, LH6/B$a;->j(LH6/B$a;)Z

    move-result v0

    iput-boolean v0, p0, LH6/B;->l:Z

    .line 35
    invoke-static {}, LL6/b;->d()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 36
    invoke-static {}, LL6/b;->b()V

    .line 37
    :cond_b
    iget-boolean p1, p1, LH6/B$a;->m:Z

    iput-boolean p1, p0, LH6/B;->m:Z

    return-void
.end method

.method synthetic constructor <init>(LH6/B$a;LH6/C;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LH6/B;-><init>(LH6/B$a;)V

    return-void
.end method

.method public static n()LH6/B$a;
    .locals 2

    .line 1
    new-instance v0, LH6/B$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LH6/B$a;-><init>(LH6/C;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, LH6/B;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, LH6/B;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public c()LH6/E;
    .locals 1

    .line 1
    iget-object v0, p0, LH6/B;->a:LH6/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()LH6/F;
    .locals 1

    .line 1
    iget-object v0, p0, LH6/B;->b:LH6/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LH6/B;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()LH6/E;
    .locals 1

    .line 1
    iget-object v0, p0, LH6/B;->c:LH6/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()LH6/E;
    .locals 1

    .line 1
    iget-object v0, p0, LH6/B;->e:LH6/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()LH6/F;
    .locals 1

    .line 1
    iget-object v0, p0, LH6/B;->f:LH6/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()LB5/d;
    .locals 1

    .line 1
    iget-object v0, p0, LH6/B;->d:LB5/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()LH6/E;
    .locals 1

    .line 1
    iget-object v0, p0, LH6/B;->g:LH6/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()LH6/F;
    .locals 1

    .line 1
    iget-object v0, p0, LH6/B;->h:LH6/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LH6/B;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LH6/B;->l:Z

    .line 2
    .line 3
    return v0
.end method
