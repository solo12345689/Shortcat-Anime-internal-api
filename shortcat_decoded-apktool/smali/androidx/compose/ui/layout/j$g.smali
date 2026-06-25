.class final Landroidx/compose/ui/layout/j$g;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/j;->w(Landroidx/compose/ui/layout/j$b;LK0/n0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/j$b;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/j$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/j$g;->a:Landroidx/compose/ui/layout/j$b;

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
    invoke-virtual {p0}, Landroidx/compose/ui/layout/j$g;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/layout/j$g;->a:Landroidx/compose/ui/layout/j$b;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/j$b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/layout/j$g;->a:Landroidx/compose/ui/layout/j$b;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/j$b;->c()LY/y1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LY/y1;->deactivate()V

    :cond_0
    return-void
.end method
