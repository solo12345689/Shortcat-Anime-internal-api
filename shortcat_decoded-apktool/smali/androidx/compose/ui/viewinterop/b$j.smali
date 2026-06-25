.class final Landroidx/compose/ui/viewinterop/b$j;
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

.field final synthetic c:Landroidx/compose/ui/viewinterop/b;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/b;LK0/J;Landroidx/compose/ui/viewinterop/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b$j;->a:Landroidx/compose/ui/viewinterop/b;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/b$j;->b:LK0/J;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/ui/viewinterop/b$j;->c:Landroidx/compose/ui/viewinterop/b;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu0/f;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/b$j;->invoke(Lu0/f;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/f;)V
    .locals 5

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b$j;->a:Landroidx/compose/ui/viewinterop/b;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/b$j;->b:LK0/J;

    iget-object v2, p0, Landroidx/compose/ui/viewinterop/b$j;->c:Landroidx/compose/ui/viewinterop/b;

    .line 3
    invoke-interface {p1}, Lu0/f;->n1()Lu0/d;

    move-result-object p1

    invoke-interface {p1}, Lu0/d;->b()Ls0/j0;

    move-result-object p1

    .line 4
    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/b;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_2

    const/4 v3, 0x1

    .line 5
    invoke-static {v0, v3}, Landroidx/compose/ui/viewinterop/b;->w(Landroidx/compose/ui/viewinterop/b;Z)V

    .line 6
    invoke-virtual {v1}, LK0/J;->z0()LK0/p0;

    move-result-object v1

    instance-of v3, v1, Landroidx/compose/ui/platform/AndroidComposeView;

    if-eqz v3, :cond_0

    check-cast v1, Landroidx/compose/ui/platform/AndroidComposeView;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 7
    invoke-static {p1}, Ls0/E;->d(Ls0/j0;)Landroid/graphics/Canvas;

    move-result-object p1

    .line 8
    invoke-virtual {v1, v2, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->u0(Landroidx/compose/ui/viewinterop/b;Landroid/graphics/Canvas;)V

    :cond_1
    const/4 p1, 0x0

    .line 9
    invoke-static {v0, p1}, Landroidx/compose/ui/viewinterop/b;->w(Landroidx/compose/ui/viewinterop/b;Z)V

    :cond_2
    return-void
.end method
