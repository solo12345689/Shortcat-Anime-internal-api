.class public final LK0/F;
.super LK0/e0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK0/F$a;,
        LK0/F$b;
    }
.end annotation


# static fields
.field private static final A0:Ls0/k1;

.field public static final z0:LK0/F$a;


# instance fields
.field private v0:LK0/E;

.field private w0:Li1/b;

.field private x0:LK0/U;

.field private y0:Landroidx/compose/ui/layout/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LK0/F$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LK0/F$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK0/F;->z0:LK0/F$a;

    .line 8
    .line 9
    invoke-static {}, Ls0/Q;->a()Ls0/k1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 14
    .line 15
    invoke-virtual {v1}, Ls0/r0$a;->b()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    invoke-interface {v0, v1, v2}, Ls0/k1;->p(J)V

    .line 20
    .line 21
    .line 22
    const/high16 v1, 0x3f800000    # 1.0f

    .line 23
    .line 24
    invoke-interface {v0, v1}, Ls0/k1;->A(F)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Ls0/l1;->a:Ls0/l1$a;

    .line 28
    .line 29
    invoke-virtual {v1}, Ls0/l1$a;->b()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-interface {v0, v1}, Ls0/k1;->z(I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, LK0/F;->A0:Ls0/k1;

    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(LK0/J;LK0/E;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, LK0/e0;-><init>(LK0/J;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LK0/F;->v0:LK0/E;

    .line 5
    .line 6
    invoke-virtual {p1}, LK0/J;->j0()LK0/J;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance p1, LK0/F$b;

    .line 14
    .line 15
    invoke-direct {p1, p0}, LK0/F$b;-><init>(LK0/F;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p1, v0

    .line 20
    :goto_0
    iput-object p1, p0, LK0/F;->x0:LK0/U;

    .line 21
    .line 22
    invoke-interface {p2}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/16 v1, 0x200

    .line 27
    .line 28
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    and-int/2addr p1, v1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    new-instance p1, Landroidx/compose/ui/layout/b;

    .line 40
    .line 41
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode"

    .line 42
    .line 43
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, p0, v0}, Landroidx/compose/ui/layout/b;-><init>(LK0/F;Landroidx/compose/ui/layout/a;)V

    .line 50
    .line 51
    .line 52
    move-object v0, p1

    .line 53
    :cond_1
    iput-object v0, p0, LK0/F;->y0:Landroidx/compose/ui/layout/b;

    .line 54
    .line 55
    return-void
.end method

.method public static final synthetic K3(LK0/F;)Landroidx/compose/ui/layout/b;
    .locals 0

    .line 1
    iget-object p0, p0, LK0/F;->y0:Landroidx/compose/ui/layout/b;

    .line 2
    .line 3
    return-object p0
.end method

.method private final N3()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LK0/T;->V1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, LK0/e0;->i3()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LK0/F;->y0:Landroidx/compose/ui/layout/b;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, LK0/e0;->M1()LI0/C;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, LI0/C;->A()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, LK0/F;->M3()LK0/e0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, LK0/e0;->s3(Z)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/layout/b;->b()Landroidx/compose/ui/layout/a;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, LK0/T;->O1()Landroidx/compose/ui/layout/s$a;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, LK0/F;->I2()LK0/U;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, LK0/U;->j2()LI0/y;

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    throw v0
.end method


# virtual methods
.method public I(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LK0/F;->y0:Landroidx/compose/ui/layout/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LK0/F;->v0:LK0/E;

    .line 6
    .line 7
    invoke-virtual {p0}, LK0/F;->M3()LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, p0, v1, p1}, LK0/E;->maxIntrinsicHeight(LI0/m;LI0/l;I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/layout/b;->b()Landroidx/compose/ui/layout/a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, LK0/F;->M3()LK0/e0;

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    throw p1
.end method

.method public I2()LK0/U;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/F;->x0:LK0/U;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L3()LK0/E;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/F;->v0:LK0/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M3()LK0/e0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0;->O2()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public N2()Landroidx/compose/ui/e$c;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/F;->v0:LK0/E;

    .line 2
    .line 3
    invoke-interface {v0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final O3(LK0/E;)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/F;->v0:LK0/E;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    invoke-interface {p1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/16 v1, 0x200

    .line 14
    .line 15
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    and-int/2addr v0, v1

    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, LK0/F;->y0:Landroidx/compose/ui/layout/b;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroidx/compose/ui/layout/b;->q(Landroidx/compose/ui/layout/a;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance v0, Landroidx/compose/ui/layout/b;

    .line 47
    .line 48
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, p0, v1}, Landroidx/compose/ui/layout/b;-><init>(LK0/F;Landroidx/compose/ui/layout/a;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    iput-object v0, p0, LK0/F;->y0:Landroidx/compose/ui/layout/b;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    iput-object v1, p0, LK0/F;->y0:Landroidx/compose/ui/layout/b;

    .line 58
    .line 59
    :cond_2
    :goto_1
    iput-object p1, p0, LK0/F;->v0:LK0/E;

    .line 60
    .line 61
    return-void
.end method

.method public final P3(Li1/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/F;->w0:Li1/b;

    .line 2
    .line 3
    return-void
.end method

.method protected Q3(LK0/U;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/F;->x0:LK0/U;

    .line 2
    .line 3
    return-void
.end method

.method protected Y0(JFLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, LK0/e0;->Y0(JFLkotlin/jvm/functions/Function1;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LK0/F;->N3()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public Z(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LK0/F;->y0:Landroidx/compose/ui/layout/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LK0/F;->v0:LK0/E;

    .line 6
    .line 7
    invoke-virtual {p0}, LK0/F;->M3()LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, p0, v1, p1}, LK0/E;->minIntrinsicHeight(LI0/m;LI0/l;I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/layout/b;->b()Landroidx/compose/ui/layout/a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, LK0/F;->M3()LK0/e0;

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    throw p1
.end method

.method protected a1(JFLv0/c;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, LK0/e0;->a1(JFLv0/c;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LK0/F;->N3()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public l0(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LK0/F;->y0:Landroidx/compose/ui/layout/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LK0/F;->v0:LK0/E;

    .line 6
    .line 7
    invoke-virtual {p0}, LK0/F;->M3()LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, p0, v1, p1}, LK0/E;->minIntrinsicWidth(LI0/m;LI0/l;I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/layout/b;->b()Landroidx/compose/ui/layout/a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, LK0/F;->M3()LK0/e0;

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    throw p1
.end method

.method public m3(Ls0/j0;Lv0/c;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LK0/F;->M3()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, LK0/e0;->u2(Ls0/j0;Lv0/c;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LK0/e0;->L1()LK0/J;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-static {p2}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-interface {p2}, LK0/p0;->getShowLayoutBounds()Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, LK0/e0;->O2()LK0/e0;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, LK0/e0;->a()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-virtual {p2}, LK0/e0;->a()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    invoke-static {v0, v1, v2, v3}, Li1/r;->e(JJ)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {p2}, LK0/e0;->P1()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    sget-object p2, Li1/n;->b:Li1/n$a;

    .line 47
    .line 48
    invoke-virtual {p2}, Li1/n$a;->b()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    invoke-static {v0, v1, v2, v3}, Li1/n;->j(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-nez p2, :cond_1

    .line 57
    .line 58
    :cond_0
    sget-object p2, LK0/F;->A0:Ls0/k1;

    .line 59
    .line 60
    invoke-virtual {p0, p1, p2}, LK0/e0;->v2(Ls0/j0;Ls0/k1;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public q0(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LK0/F;->y0:Landroidx/compose/ui/layout/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LK0/F;->v0:LK0/E;

    .line 6
    .line 7
    invoke-virtual {p0}, LK0/F;->M3()LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, p0, v1, p1}, LK0/E;->maxIntrinsicWidth(LI0/m;LI0/l;I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/layout/b;->b()Landroidx/compose/ui/layout/a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, LK0/F;->M3()LK0/e0;

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    throw p1
.end method

.method public v0(J)Landroidx/compose/ui/layout/s;
    .locals 2

    .line 1
    invoke-virtual {p0}, LK0/e0;->E2()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object p1, p0, LK0/F;->w0:Li1/b;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Li1/b;->r()J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string p2, "Lookahead constraints cannot be null in approach pass."

    .line 19
    .line 20
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    :goto_0
    invoke-static {p0, p1, p2}, LK0/e0;->p2(LK0/e0;J)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, LK0/F;->K3(LK0/F;)Landroidx/compose/ui/layout/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, LK0/F;->L3()LK0/E;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0}, LK0/F;->M3()LK0/e0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v0, p0, v1, p1, p2}, LK0/E;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, LK0/e0;->t3(LI0/C;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, LK0/e0;->h3()V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/layout/b;->b()Landroidx/compose/ui/layout/a;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/layout/b;->p()J

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    throw p1
.end method

.method public x2()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/F;->I2()LK0/U;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LK0/F$b;

    .line 8
    .line 9
    invoke-direct {v0, p0}, LK0/F$b;-><init>(LK0/F;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, LK0/F;->Q3(LK0/U;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public y1(LI0/a;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/F;->I2()LK0/U;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, LK0/U;->f2(LI0/a;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-static {p0, p1}, LK0/G;->a(LK0/T;LI0/a;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method
