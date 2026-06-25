.class final Landroidx/compose/ui/viewinterop/b$h$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/b$h;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
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
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/b$h$b;->a:Landroidx/compose/ui/viewinterop/b;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/b$h$b;->b:LK0/J;

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
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/b$h$b;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 1

    .line 2
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/b$h$b;->a:Landroidx/compose/ui/viewinterop/b;

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/b$h$b;->b:LK0/J;

    invoke-static {p1, v0}, Landroidx/compose/ui/viewinterop/d;->b(Landroid/view/View;LK0/J;)V

    return-void
.end method
