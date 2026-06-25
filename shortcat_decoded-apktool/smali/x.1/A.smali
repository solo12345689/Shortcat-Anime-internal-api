.class final Lx/A;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/h;
.implements LK0/j0;


# instance fields
.field private a:LI0/I$a;

.field private b:Z

.field private final c:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final E1()LI0/I;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lx/A$a;

    .line 7
    .line 8
    invoke-direct {v1, v0, p0}, Lx/A$a;-><init>(Lkotlin/jvm/internal/N;Lx/A;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, LK0/k0;->a(Landroidx/compose/ui/e$c;Lie/a;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LI0/I;

    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public final F1(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-direct {p0}, Lx/A;->E1()LI0/I;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v1}, LI0/I;->b()LI0/I$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    iput-object v0, p0, Lx/A;->a:LI0/I$a;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v1, p0, Lx/A;->a:LI0/I$a;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-interface {v1}, LI0/I$a;->a()V

    .line 22
    .line 23
    .line 24
    :cond_2
    iput-object v0, p0, Lx/A;->a:LI0/I$a;

    .line 25
    .line 26
    :goto_0
    iput-boolean p1, p0, Lx/A;->b:Z

    .line 27
    .line 28
    return-void
.end method

.method public getShouldAutoInvalidate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx/A;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public onReset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx/A;->a:LI0/I$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LI0/I$a;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lx/A;->a:LI0/I$a;

    .line 10
    .line 11
    return-void
.end method

.method public q0()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lx/A;->E1()LI0/I;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, p0, Lx/A;->b:Z

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    iget-object v1, p0, Lx/A;->a:LI0/I$a;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v1}, LI0/I$a;->a()V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, LI0/I;->b()LI0/I$a;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    iput-object v0, p0, Lx/A;->a:LI0/I$a;

    .line 25
    .line 26
    :cond_2
    return-void
.end method
