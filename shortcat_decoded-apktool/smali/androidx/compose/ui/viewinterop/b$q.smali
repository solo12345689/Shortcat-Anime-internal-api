.class final Landroidx/compose/ui/viewinterop/b$q;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


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


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b$q;->a:Landroidx/compose/ui/viewinterop/b;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/b$q;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b$q;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/b;->e(Landroidx/compose/ui/viewinterop/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b$q;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b$q;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/b;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/b$q;->a:Landroidx/compose/ui/viewinterop/b;

    if-ne v0, v1, :cond_0

    .line 3
    invoke-static {v1}, Landroidx/compose/ui/viewinterop/b;->s(Landroidx/compose/ui/viewinterop/b;)LK0/r0;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/b$q;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-static {}, Landroidx/compose/ui/viewinterop/b;->g()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/ui/viewinterop/b$q;->a:Landroidx/compose/ui/viewinterop/b;

    invoke-virtual {v3}, Landroidx/compose/ui/viewinterop/b;->getUpdate()Lie/a;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, LK0/r0;->i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V

    :cond_0
    return-void
.end method
