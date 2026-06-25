.class public final LN/n0;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/platform/h1;
.implements LK0/h;
.implements LK0/v;
.implements LN/q0$a;


# instance fields
.field private a:LN/q0;

.field private b:LK/y;

.field private c:LQ/F;

.field private final d:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LN/q0;LK/y;LQ/F;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN/n0;->a:LN/q0;

    .line 5
    .line 6
    iput-object p2, p0, LN/n0;->b:LK/y;

    .line 7
    .line 8
    iput-object p3, p0, LN/n0;->c:LQ/F;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 p2, 0x2

    .line 12
    invoke-static {p1, p1, p2, p1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, LN/n0;->d:LY/C0;

    .line 17
    .line 18
    return-void
.end method

.method private E1(LI0/p;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/n0;->d:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public F1(LK/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/n0;->b:LK/y;

    .line 2
    .line 3
    return-void
.end method

.method public final G1(LN/q0;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LN/n0;->a:LN/q0;

    .line 8
    .line 9
    invoke-interface {v0}, La1/M;->b()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LN/n0;->a:LN/q0;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, LN/q0;->l(LN/q0$a;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, LN/n0;->a:LN/q0;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, LN/n0;->a:LN/q0;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, LN/q0;->j(LN/q0$a;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public H1(LQ/F;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/n0;->c:LQ/F;

    .line 2
    .line 3
    return-void
.end method

.method public O0(Lkotlin/jvm/functions/Function2;)LGf/C0;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v4, LGf/Q;->d:LGf/Q;

    .line 14
    .line 15
    new-instance v5, LN/n0$a;

    .line 16
    .line 17
    invoke-direct {v5, p0, p1, v1}, LN/n0$a;-><init>(LN/n0;Lkotlin/jvm/functions/Function2;LZd/e;)V

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public Y0()LQ/F;
    .locals 1

    .line 1
    iget-object v0, p0, LN/n0;->c:LQ/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSoftwareKeyboardController()Landroidx/compose/ui/platform/o1;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/w0;->o()LY/b1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, LK0/i;->a(LK0/h;LY/D;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/compose/ui/platform/o1;

    .line 10
    .line 11
    return-object v0
.end method

.method public getViewConfiguration()Landroidx/compose/ui/platform/A1;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/w0;->r()LY/b1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, LK0/i;->a(LK0/h;LY/D;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/compose/ui/platform/A1;

    .line 10
    .line 11
    return-object v0
.end method

.method public o0()LI0/p;
    .locals 1

    .line 1
    iget-object v0, p0, LN/n0;->d:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LI0/p;

    .line 8
    .line 9
    return-object v0
.end method

.method public onAttach()V
    .locals 1

    .line 1
    iget-object v0, p0, LN/n0;->a:LN/q0;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LN/q0;->j(LN/q0$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 1
    iget-object v0, p0, LN/n0;->a:LN/q0;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LN/q0;->l(LN/q0$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public p(LI0/p;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LN/n0;->E1(LI0/p;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public y1()LK/y;
    .locals 1

    .line 1
    iget-object v0, p0, LN/n0;->b:LK/y;

    .line 2
    .line 3
    return-object v0
.end method
