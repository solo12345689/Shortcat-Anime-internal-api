.class public final Landroidx/compose/ui/graphics/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ls0/k1;


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:I

.field private c:Landroid/graphics/Shader;

.field private d:Landroidx/compose/ui/graphics/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-static {}, Ls0/Q;->j()Landroid/graphics/Paint;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/b;-><init>(Landroid/graphics/Paint;)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Paint;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    sget-object p1, Landroidx/compose/ui/graphics/c;->b:Landroidx/compose/ui/graphics/c$a;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/c$a;->B()I

    move-result p1

    iput p1, p0, Landroidx/compose/ui/graphics/b;->b:I

    return-void
.end method


# virtual methods
.method public A(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ls0/Q;->v(Landroid/graphics/Paint;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public B()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0}, Ls0/Q;->i(Landroid/graphics/Paint;)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public a()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0}, Ls0/Q;->c(Landroid/graphics/Paint;)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0}, Ls0/Q;->d(Landroid/graphics/Paint;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public c(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/b;->b:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/compose/ui/graphics/c;->G(II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Landroidx/compose/ui/graphics/b;->b:I

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-static {v0, p1}, Ls0/Q;->m(Landroid/graphics/Paint;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public d(Landroidx/compose/ui/graphics/d;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/graphics/b;->d:Landroidx/compose/ui/graphics/d;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-static {v0, p1}, Ls0/Q;->o(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/d;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ls0/Q;->k(Landroid/graphics/Paint;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f()Landroidx/compose/ui/graphics/d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->d:Landroidx/compose/ui/graphics/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public k(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ls0/Q;->l(Landroid/graphics/Paint;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public l(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ls0/Q;->s(Landroid/graphics/Paint;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ls0/Q;->p(Landroid/graphics/Paint;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public n()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0}, Ls0/Q;->f(Landroid/graphics/Paint;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public o(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ls0/Q;->t(Landroid/graphics/Paint;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public p(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Ls0/Q;->n(Landroid/graphics/Paint;J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public q()Ls0/n1;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public r()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0}, Ls0/Q;->g(Landroid/graphics/Paint;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public s()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0}, Ls0/Q;->h(Landroid/graphics/Paint;)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public t(Ls0/n1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ls0/Q;->q(Landroid/graphics/Paint;Ls0/n1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public u()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public v(Landroid/graphics/Shader;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/graphics/b;->c:Landroid/graphics/Shader;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-static {v0, p1}, Ls0/Q;->r(Landroid/graphics/Paint;Landroid/graphics/Shader;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public w()Landroid/graphics/Shader;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->c:Landroid/graphics/Shader;

    .line 2
    .line 3
    return-object v0
.end method

.method public x(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ls0/Q;->u(Landroid/graphics/Paint;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public y()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0}, Ls0/Q;->e(Landroid/graphics/Paint;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public z(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ls0/Q;->w(Landroid/graphics/Paint;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
