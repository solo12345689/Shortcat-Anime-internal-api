.class final Landroidx/compose/ui/viewinterop/b$k;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/b;-><init>(Landroid/content/Context;LY/y;ILD0/b;Landroid/view/View;LK0/p0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/viewinterop/b;

.field final synthetic b:LK0/J;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/b;LK0/J;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/b$k;->b:LK0/J;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LI0/p;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/b$k;->invoke(LI0/p;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LI0/p;)V
    .locals 9

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/b$k;->b:LK0/J;

    invoke-static {v0, v1}, Landroidx/compose/ui/viewinterop/d;->b(Landroid/view/View;LK0/J;)V

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/b;->l(Landroidx/compose/ui/viewinterop/b;)LK0/p0;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-interface {v0, v1}, LK0/p0;->i(Landroid/view/View;)V

    .line 4
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/b;->p(Landroidx/compose/ui/viewinterop/b;)[I

    move-result-object v0

    const/4 v1, 0x0

    aget v0, v0, v1

    .line 5
    iget-object v2, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-static {v2}, Landroidx/compose/ui/viewinterop/b;->p(Landroidx/compose/ui/viewinterop/b;)[I

    move-result-object v2

    const/4 v3, 0x1

    aget v2, v2, v3

    .line 6
    iget-object v4, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-virtual {v4}, Landroidx/compose/ui/viewinterop/b;->getView()Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-static {v5}, Landroidx/compose/ui/viewinterop/b;->p(Landroidx/compose/ui/viewinterop/b;)[I

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 7
    iget-object v4, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-static {v4}, Landroidx/compose/ui/viewinterop/b;->r(Landroidx/compose/ui/viewinterop/b;)J

    move-result-wide v4

    .line 8
    iget-object v6, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-interface {p1}, LI0/p;->a()J

    move-result-wide v7

    invoke-static {v6, v7, v8}, Landroidx/compose/ui/viewinterop/b;->x(Landroidx/compose/ui/viewinterop/b;J)V

    .line 9
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/b;->f(Landroidx/compose/ui/viewinterop/b;)Landroidx/core/view/L0;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 10
    iget-object v6, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-static {v6}, Landroidx/compose/ui/viewinterop/b;->p(Landroidx/compose/ui/viewinterop/b;)[I

    move-result-object v6

    aget v1, v6, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/b;->p(Landroidx/compose/ui/viewinterop/b;)[I

    move-result-object v0

    aget v0, v0, v3

    if-ne v2, v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/b;->r(Landroidx/compose/ui/viewinterop/b;)J

    move-result-wide v0

    invoke-static {v4, v5, v0, v1}, Li1/r;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-static {v0, p1}, Landroidx/compose/ui/viewinterop/b;->u(Landroidx/compose/ui/viewinterop/b;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroidx/core/view/L0;->y()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 13
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b$k;->a:Landroidx/compose/ui/viewinterop/b;

    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/b;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    :cond_1
    return-void
.end method
