.class public final LK0/r0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final i:I


# instance fields
.field private final a:Li0/L;

.field private final b:Lkotlin/jvm/functions/Function1;

.field private final c:Lkotlin/jvm/functions/Function1;

.field private final d:Lkotlin/jvm/functions/Function1;

.field private final e:Lkotlin/jvm/functions/Function1;

.field private final f:Lkotlin/jvm/functions/Function1;

.field private final g:Lkotlin/jvm/functions/Function1;

.field private final h:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Li0/L;->l:I

    .line 2
    .line 3
    sput v0, LK0/r0;->i:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Li0/L;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Li0/L;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LK0/r0;->a:Li0/L;

    .line 10
    .line 11
    sget-object p1, LK0/r0$f;->a:LK0/r0$f;

    .line 12
    .line 13
    iput-object p1, p0, LK0/r0;->b:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    sget-object p1, LK0/r0$g;->a:LK0/r0$g;

    .line 16
    .line 17
    iput-object p1, p0, LK0/r0;->c:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    sget-object p1, LK0/r0$h;->a:LK0/r0$h;

    .line 20
    .line 21
    iput-object p1, p0, LK0/r0;->d:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    sget-object p1, LK0/r0$b;->a:LK0/r0$b;

    .line 24
    .line 25
    iput-object p1, p0, LK0/r0;->e:Lkotlin/jvm/functions/Function1;

    .line 26
    .line 27
    sget-object p1, LK0/r0$c;->a:LK0/r0$c;

    .line 28
    .line 29
    iput-object p1, p0, LK0/r0;->f:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    sget-object p1, LK0/r0$d;->a:LK0/r0$d;

    .line 32
    .line 33
    iput-object p1, p0, LK0/r0;->g:Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    sget-object p1, LK0/r0$e;->a:LK0/r0$e;

    .line 36
    .line 37
    iput-object p1, p0, LK0/r0;->h:Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    return-void
.end method

.method public static synthetic d(LK0/r0;LK0/J;ZLie/a;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LK0/r0;->c(LK0/J;ZLie/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic f(LK0/r0;LK0/J;ZLie/a;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LK0/r0;->e(LK0/J;ZLie/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic h(LK0/r0;LK0/J;ZLie/a;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LK0/r0;->g(LK0/J;ZLie/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/r0;->a:Li0/L;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/L;->g(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/r0;->a:Li0/L;

    .line 2
    .line 3
    sget-object v1, LK0/r0$a;->a:LK0/r0$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Li0/L;->h(Lkotlin/jvm/functions/Function1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c(LK0/J;ZLie/a;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, LK0/J;->j0()LK0/J;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, LK0/r0;->g:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, LK0/r0;->i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p2, p0, LK0/r0;->f:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, p3}, LK0/r0;->i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final e(LK0/J;ZLie/a;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, LK0/J;->j0()LK0/J;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, LK0/r0;->h:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, LK0/r0;->i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p2, p0, LK0/r0;->e:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, p3}, LK0/r0;->i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final g(LK0/J;ZLie/a;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, LK0/J;->j0()LK0/J;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, LK0/r0;->b:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, LK0/r0;->i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p2, p0, LK0/r0;->c:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, p3}, LK0/r0;->i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/r0;->a:Li0/L;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Li0/L;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lie/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j(LK0/J;Lie/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/r0;->d:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0, p2}, LK0/r0;->i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/r0;->a:Li0/L;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/L;->q()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l()V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/r0;->a:Li0/L;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/L;->r()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK0/r0;->a:Li0/L;

    .line 7
    .line 8
    invoke-virtual {v0}, Li0/L;->f()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
