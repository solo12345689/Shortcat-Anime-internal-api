.class public Lqf/u0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqf/u0$a;,
        Lqf/u0$b;,
        Lqf/u0$c;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Z

.field private final d:Z

.field private final e:Luf/r;

.field private final f:Lqf/q;

.field private final g:Lqf/r;

.field private h:I

.field private i:Z

.field private j:Ljava/util/ArrayDeque;

.field private k:Ljava/util/Set;


# direct methods
.method public constructor <init>(ZZZZLuf/r;Lqf/q;Lqf/r;)V
    .locals 1

    .line 1
    const-string v0, "typeSystemContext"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "kotlinTypePreparator"

    .line 7
    .line 8
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "kotlinTypeRefiner"

    .line 12
    .line 13
    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-boolean p1, p0, Lqf/u0;->a:Z

    .line 20
    .line 21
    iput-boolean p2, p0, Lqf/u0;->b:Z

    .line 22
    .line 23
    iput-boolean p3, p0, Lqf/u0;->c:Z

    .line 24
    .line 25
    iput-boolean p4, p0, Lqf/u0;->d:Z

    .line 26
    .line 27
    iput-object p5, p0, Lqf/u0;->e:Luf/r;

    .line 28
    .line 29
    iput-object p6, p0, Lqf/u0;->f:Lqf/q;

    .line 30
    .line 31
    iput-object p7, p0, Lqf/u0;->g:Lqf/r;

    .line 32
    .line 33
    return-void
.end method

.method public static final synthetic a(Lqf/u0;)I
    .locals 0

    .line 1
    iget p0, p0, Lqf/u0;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic b(Lqf/u0;I)V
    .locals 0

    .line 1
    iput p1, p0, Lqf/u0;->h:I

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic d(Lqf/u0;Luf/i;Luf/i;ZILjava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x4

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lqf/u0;->c(Luf/i;Luf/i;Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: addSubtypeConstraint"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public c(Luf/i;Luf/i;Z)Ljava/lang/Boolean;
    .locals 0

    .line 1
    const-string p3, "subType"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "superType"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/u0;->j:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lqf/u0;->k:Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lqf/u0;->i:Z

    .line 19
    .line 20
    return-void
.end method

.method public f(Luf/i;Luf/i;)Z
    .locals 1

    .line 1
    const-string v0, "subType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "superType"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1
.end method

.method public g(Luf/j;Luf/d;)Lqf/u0$b;
    .locals 1

    .line 1
    const-string v0, "subType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "superType"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lqf/u0$b;->b:Lqf/u0$b;

    .line 12
    .line 13
    return-object p1
.end method

.method public final h()Ljava/util/ArrayDeque;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/u0;->j:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/u0;->k:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Luf/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/u0;->e:Luf/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lqf/u0;->i:Z

    .line 3
    .line 4
    iget-object v0, p0, Lqf/u0;->j:Ljava/util/ArrayDeque;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lqf/u0;->j:Ljava/util/ArrayDeque;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lqf/u0;->k:Ljava/util/Set;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    sget-object v0, LAf/k;->c:LAf/k$b;

    .line 21
    .line 22
    invoke-virtual {v0}, LAf/k$b;->a()LAf/k;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lqf/u0;->k:Ljava/util/Set;

    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final l(Luf/i;)Z
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lqf/u0;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lqf/u0;->e:Luf/r;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Luf/r;->C(Luf/i;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqf/u0;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqf/u0;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqf/u0;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final p(Luf/i;)Luf/i;
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqf/u0;->f:Lqf/q;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lqf/q;->a(Luf/i;)Luf/i;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final q(Luf/i;)Luf/i;
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqf/u0;->g:Lqf/r;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lqf/r;->a(Luf/i;)Luf/i;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public r(Lkotlin/jvm/functions/Function1;)Z
    .locals 1

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/u0$a$a;

    .line 7
    .line 8
    invoke-direct {v0}, Lqf/u0$a$a;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lqf/u0$a$a;->b()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method
