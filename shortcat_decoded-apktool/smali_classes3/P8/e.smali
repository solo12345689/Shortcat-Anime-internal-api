.class public abstract LP8/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/e$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:LP8/a;

.field private final d:LP8/a$d;

.field private final e:LQ8/b;

.field private final f:Landroid/os/Looper;

.field private final g:I

.field private final h:LP8/f;

.field private final i:LQ8/p;

.field protected final j:LQ8/e;


# direct methods
.method public constructor <init>(Landroid/app/Activity;LP8/a;LP8/a$d;LP8/e$a;)V
    .locals 6

    move-object v2, p1

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 1
    invoke-direct/range {v0 .. v5}, LP8/e;-><init>(Landroid/content/Context;Landroid/app/Activity;LP8/a;LP8/a$d;LP8/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;LP8/a;LP8/a$d;LQ8/p;)V
    .locals 1

    .line 2
    new-instance v0, LP8/e$a$a;

    invoke-direct {v0}, LP8/e$a$a;-><init>()V

    invoke-virtual {v0, p4}, LP8/e$a$a;->c(LQ8/p;)LP8/e$a$a;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-virtual {v0, p4}, LP8/e$a$a;->b(Landroid/os/Looper;)LP8/e$a$a;

    invoke-virtual {v0}, LP8/e$a$a;->a()LP8/e$a;

    move-result-object p4

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, LP8/e;-><init>(Landroid/app/Activity;LP8/a;LP8/a$d;LP8/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LP8/a;LP8/a$d;LP8/e$a;)V
    .locals 6

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 21
    invoke-direct/range {v0 .. v5}, LP8/e;-><init>(Landroid/content/Context;Landroid/app/Activity;LP8/a;LP8/a$d;LP8/e$a;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/app/Activity;LP8/a;LP8/a$d;LP8/e$a;)V
    .locals 3

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Api must not be null."

    .line 5
    invoke-static {p3, v0}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 6
    invoke-static {p5, v0}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "The provided context did not have an application context."

    .line 8
    invoke-static {v0, v1}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, LP8/e;->a:Landroid/content/Context;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    .line 9
    invoke-static {p1}, LP8/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, LP8/e;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 11
    :goto_0
    iput-object p1, p0, LP8/e;->b:Ljava/lang/String;

    iput-object p3, p0, LP8/e;->c:LP8/a;

    iput-object p4, p0, LP8/e;->d:LP8/a$d;

    .line 12
    iget-object v1, p5, LP8/e$a;->b:Landroid/os/Looper;

    iput-object v1, p0, LP8/e;->f:Landroid/os/Looper;

    .line 13
    invoke-static {p3, p4, p1}, LQ8/b;->a(LP8/a;LP8/a$d;Ljava/lang/String;)LQ8/b;

    move-result-object p1

    iput-object p1, p0, LP8/e;->e:LQ8/b;

    .line 14
    new-instance p3, LQ8/J;

    invoke-direct {p3, p0}, LQ8/J;-><init>(LP8/e;)V

    iput-object p3, p0, LP8/e;->h:LP8/f;

    .line 15
    invoke-static {v0}, LQ8/e;->u(Landroid/content/Context;)LQ8/e;

    move-result-object p3

    iput-object p3, p0, LP8/e;->j:LQ8/e;

    .line 16
    invoke-virtual {p3}, LQ8/e;->l()I

    move-result p4

    iput p4, p0, LP8/e;->g:I

    .line 17
    iget-object p4, p5, LP8/e$a;->a:LQ8/p;

    iput-object p4, p0, LP8/e;->i:LQ8/p;

    if-eqz p2, :cond_1

    instance-of p4, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    if-nez p4, :cond_1

    .line 18
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    if-ne p4, p5, :cond_1

    .line 19
    invoke-static {p2, p3, p1}, LQ8/w;->u(Landroid/app/Activity;LQ8/e;LQ8/b;)V

    .line 20
    :cond_1
    invoke-virtual {p3, p0}, LQ8/e;->F(LP8/e;)V

    return-void
.end method

.method private final w(ILcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->zak()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LP8/e;->j:LQ8/e;

    .line 5
    .line 6
    invoke-virtual {v0, p0, p1, p2}, LQ8/e;->A(LP8/e;ILcom/google/android/gms/common/api/internal/a;)V

    .line 7
    .line 8
    .line 9
    return-object p2
.end method

.method private final x(ILQ8/r;)Ln9/i;
    .locals 6

    .line 1
    new-instance v4, Ln9/j;

    .line 2
    .line 3
    invoke-direct {v4}, Ln9/j;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v5, p0, LP8/e;->i:LQ8/p;

    .line 7
    .line 8
    iget-object v0, p0, LP8/e;->j:LQ8/e;

    .line 9
    .line 10
    move-object v1, p0

    .line 11
    move v2, p1

    .line 12
    move-object v3, p2

    .line 13
    invoke-virtual/range {v0 .. v5}, LQ8/e;->B(LP8/e;ILQ8/r;Ln9/j;LQ8/p;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4}, Ln9/j;->a()Ln9/i;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method


# virtual methods
.method public g()LP8/f;
    .locals 1

    .line 1
    iget-object v0, p0, LP8/e;->h:LP8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method protected h()LR8/d$a;
    .locals 2

    .line 1
    new-instance v0, LR8/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, LR8/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, LR8/d$a;->d(Landroid/accounts/Account;)LR8/d$a;

    .line 8
    .line 9
    .line 10
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, LR8/d$a;->c(Ljava/util/Collection;)LR8/d$a;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, LP8/e;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, LR8/d$a;->e(Ljava/lang/String;)LR8/d$a;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, LP8/e;->a:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, LR8/d$a;->b(Ljava/lang/String;)LR8/d$a;

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public i(LQ8/r;)Ln9/i;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0, p1}, LP8/e;->x(ILQ8/r;)Ln9/i;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public j(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1}, LP8/e;->w(ILcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    .line 3
    .line 4
    .line 5
    return-object p1
.end method

.method public k(LQ8/r;)Ln9/i;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1}, LP8/e;->x(ILQ8/r;)Ln9/i;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public l(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1}, LP8/e;->w(ILcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    .line 3
    .line 4
    .line 5
    return-object p1
.end method

.method public m(LQ8/r;)Ln9/i;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1}, LP8/e;->x(ILQ8/r;)Ln9/i;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method protected n(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public final o()LQ8/b;
    .locals 1

    .line 1
    iget-object v0, p0, LP8/e;->e:LQ8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()LP8/a$d;
    .locals 1

    .line 1
    iget-object v0, p0, LP8/e;->d:LP8/a$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public q()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, LP8/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method protected r()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LP8/e;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, LP8/e;->f:Landroid/os/Looper;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()I
    .locals 1

    .line 1
    iget v0, p0, LP8/e;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final u(Landroid/os/Looper;LQ8/E;)LP8/a$f;
    .locals 8

    .line 1
    invoke-virtual {p0}, LP8/e;->h()LR8/d$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LR8/d$a;->a()LR8/d;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    iget-object v0, p0, LP8/e;->c:LP8/a;

    .line 10
    .line 11
    invoke-virtual {v0}, LP8/a;->a()LP8/a$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, LP8/a$a;

    .line 21
    .line 22
    iget-object v5, p0, LP8/e;->d:LP8/a$d;

    .line 23
    .line 24
    iget-object v2, p0, LP8/e;->a:Landroid/content/Context;

    .line 25
    .line 26
    move-object v7, p2

    .line 27
    move-object v3, p1

    .line 28
    move-object v6, p2

    .line 29
    invoke-virtual/range {v1 .. v7}, LP8/a$a;->a(Landroid/content/Context;Landroid/os/Looper;LR8/d;Ljava/lang/Object;LP8/f$a;LP8/f$b;)LP8/a$f;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0}, LP8/e;->r()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    instance-of v0, p1, LR8/c;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    move-object v0, p1

    .line 44
    check-cast v0, LR8/c;

    .line 45
    .line 46
    invoke-virtual {v0, p2}, LR8/c;->O(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    if-eqz p2, :cond_2

    .line 50
    .line 51
    instance-of p2, p1, LQ8/k;

    .line 52
    .line 53
    if-nez p2, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    throw p1

    .line 61
    :cond_2
    :goto_0
    return-object p1
.end method

.method public final v(Landroid/content/Context;Landroid/os/Handler;)LQ8/V;
    .locals 2

    .line 1
    new-instance v0, LQ8/V;

    .line 2
    .line 3
    invoke-virtual {p0}, LP8/e;->h()LR8/d$a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LR8/d$a;->a()LR8/d;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p1, p2, v1}, LQ8/V;-><init>(Landroid/content/Context;Landroid/os/Handler;LR8/d;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
