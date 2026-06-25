.class final Landroidx/compose/ui/viewinterop/e$h;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/e;->c(Lkotlin/jvm/functions/Function1;LY/m;I)Lie/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lkotlin/jvm/functions/Function1;

.field final synthetic c:LY/y;

.field final synthetic d:Lh0/p;

.field final synthetic e:I

.field final synthetic f:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;LY/y;Lh0/p;ILandroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/e$h;->a:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/e$h;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/ui/viewinterop/e$h;->c:LY/y;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/ui/viewinterop/e$h;->d:Lh0/p;

    .line 8
    .line 9
    iput p5, p0, Landroidx/compose/ui/viewinterop/e$h;->e:I

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/ui/viewinterop/e$h;->f:Landroid/view/View;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()LK0/J;
    .locals 8

    .line 1
    new-instance v0, Landroidx/compose/ui/viewinterop/i;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/e$h;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/ui/viewinterop/e$h;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/ui/viewinterop/e$h;->c:LY/y;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/compose/ui/viewinterop/e$h;->d:Lh0/p;

    .line 10
    .line 11
    iget v5, p0, Landroidx/compose/ui/viewinterop/e$h;->e:I

    .line 12
    .line 13
    iget-object v6, p0, Landroidx/compose/ui/viewinterop/e$h;->f:Landroid/view/View;

    .line 14
    .line 15
    const-string v7, "null cannot be cast to non-null type androidx.compose.ui.node.Owner"

    .line 16
    .line 17
    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast v6, LK0/p0;

    .line 21
    .line 22
    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/viewinterop/i;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;LY/y;Lh0/p;ILK0/p0;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/b;->getLayoutNode()LK0/J;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/e$h;->a()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
