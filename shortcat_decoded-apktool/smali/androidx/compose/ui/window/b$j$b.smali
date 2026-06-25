.class final Landroidx/compose/ui/window/b$j$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b$j;->invoke(LY/m;I)V
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
    iput-object p1, p0, Landroidx/compose/ui/window/b$j$b;->a:Landroidx/compose/ui/window/m;

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
    .locals 2

    .line 1
    check-cast p1, Li1/r;

    .line 2
    .line 3
    invoke-virtual {p1}, Li1/r;->j()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/window/b$j$b;->invoke-ozmzZPI(J)V

    .line 8
    .line 9
    .line 10
    sget-object p1, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke-ozmzZPI(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/window/b$j$b;->a:Landroidx/compose/ui/window/m;

    .line 2
    .line 3
    invoke-static {p1, p2}, Li1/r;->b(J)Li1/r;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Landroidx/compose/ui/window/m;->setPopupContentSize-fhxjrPA(Li1/r;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Landroidx/compose/ui/window/b$j$b;->a:Landroidx/compose/ui/window/m;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/compose/ui/window/m;->s()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
