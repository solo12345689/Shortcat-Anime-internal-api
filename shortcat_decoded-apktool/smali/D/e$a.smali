.class public final LD/e$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/e;->a(LD/B;Z)LF/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LD/B;

.field final synthetic b:Z


# direct methods
.method constructor <init>(LD/B;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LD/e$a;->a:LD/B;

    .line 2
    .line 3
    iput-boolean p2, p0, LD/e$a;->b:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 1
    iget-object v0, p0, LD/e$a;->a:LD/B;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/B;->u()LD/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LD/q;->e()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, LD/e$a;->a:LD/B;

    .line 12
    .line 13
    invoke-virtual {v1}, LD/B;->u()LD/q;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, LD/q;->c()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int/2addr v0, v1

    .line 22
    return v0
.end method

.method public b()F
    .locals 3

    .line 1
    iget-object v0, p0, LD/e$a;->a:LD/B;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/B;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, LD/e$a;->a:LD/B;

    .line 8
    .line 9
    invoke-virtual {v1}, LD/B;->q()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, LD/e$a;->a:LD/B;

    .line 14
    .line 15
    invoke-virtual {v2}, LD/B;->e()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/lazy/layout/f;->a(IIZ)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0
.end method

.method public c()LR0/b;
    .locals 3

    .line 1
    iget-boolean v0, p0, LD/e$a;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LR0/b;

    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, LR0/b;-><init>(II)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, LR0/b;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, LR0/b;-><init>(II)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public d()I
    .locals 2

    .line 1
    iget-object v0, p0, LD/e$a;->a:LD/B;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/B;->u()LD/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LD/q;->a()Lz/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lz/q;->a:Lz/q;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LD/e$a;->a:LD/B;

    .line 16
    .line 17
    invoke-virtual {v0}, LD/B;->u()LD/q;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, LD/q;->b()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-static {v0, v1}, Li1/r;->f(J)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0

    .line 30
    :cond_0
    iget-object v0, p0, LD/e$a;->a:LD/B;

    .line 31
    .line 32
    invoke-virtual {v0}, LD/B;->u()LD/q;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, LD/q;->b()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {v0, v1}, Li1/r;->g(J)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    return v0
.end method

.method public e()F
    .locals 2

    .line 1
    iget-object v0, p0, LD/e$a;->a:LD/B;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/B;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, LD/e$a;->a:LD/B;

    .line 8
    .line 9
    invoke-virtual {v1}, LD/B;->q()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v0, v1}, Landroidx/compose/foundation/lazy/layout/f;->b(II)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public f(ILZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LD/e$a;->a:LD/B;

    .line 2
    .line 3
    const/4 v4, 0x2

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    move v1, p1

    .line 7
    move-object v3, p2

    .line 8
    invoke-static/range {v0 .. v5}, LD/B;->I(LD/B;IILZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 20
    .line 21
    return-object p1
.end method
