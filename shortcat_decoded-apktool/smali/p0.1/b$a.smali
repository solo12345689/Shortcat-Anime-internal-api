.class final Lp0/b$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp0/b;->a(Landroidx/compose/ui/e;FFLs0/E1;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F

.field final synthetic c:I

.field final synthetic d:Ls0/E1;

.field final synthetic e:Z


# direct methods
.method constructor <init>(FFILs0/E1;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lp0/b$a;->a:F

    .line 2
    .line 3
    iput p2, p0, Lp0/b$a;->b:F

    .line 4
    .line 5
    iput p3, p0, Lp0/b$a;->c:I

    .line 6
    .line 7
    iput-object p4, p0, Lp0/b$a;->d:Ls0/E1;

    .line 8
    .line 9
    iput-boolean p5, p0, Lp0/b$a;->e:Z

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/g;

    invoke-virtual {p0, p1}, Lp0/b$a;->invoke(Landroidx/compose/ui/graphics/g;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/g;)V
    .locals 4

    .line 2
    iget v0, p0, Lp0/b$a;->a:F

    invoke-interface {p1, v0}, Li1/d;->l1(F)F

    move-result v0

    .line 3
    iget v1, p0, Lp0/b$a;->b:F

    invoke-interface {p1, v1}, Li1/d;->l1(F)F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v3, v0, v2

    if-lez v3, :cond_0

    cmpl-float v2, v1, v2

    if-lez v2, :cond_0

    .line 4
    iget v2, p0, Lp0/b$a;->c:I

    invoke-static {v0, v1, v2}, Ls0/v1;->a(FFI)Ls0/g0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->G(Ls0/u1;)V

    .line 6
    iget-object v0, p0, Lp0/b$a;->d:Ls0/E1;

    if-nez v0, :cond_1

    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    move-result-object v0

    :cond_1
    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->s1(Ls0/E1;)V

    .line 7
    iget-boolean v0, p0, Lp0/b$a;->e:Z

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->n(Z)V

    return-void
.end method
