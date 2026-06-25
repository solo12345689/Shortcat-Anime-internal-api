.class final Landroidx/compose/ui/window/b$f;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/s;Lie/a;Landroidx/compose/ui/window/t;Lkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/m;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/b$f;->a:Landroidx/compose/ui/window/m;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LI0/p;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/b$f;->invoke(LI0/p;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LI0/p;)V
    .locals 1

    .line 2
    invoke-interface {p1}, LI0/p;->x0()LI0/p;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/window/b$f;->a:Landroidx/compose/ui/window/m;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/window/m;->q(LI0/p;)V

    return-void
.end method
