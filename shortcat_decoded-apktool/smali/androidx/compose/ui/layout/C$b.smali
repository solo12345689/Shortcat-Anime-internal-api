.class final Landroidx/compose/ui/layout/C$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/C;-><init>(Landroidx/compose/ui/layout/D;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/C;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/C;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/C$b;->a:Landroidx/compose/ui/layout/C;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(LK0/J;LY/y;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/layout/C$b;->a:Landroidx/compose/ui/layout/C;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/compose/ui/layout/C;->b(Landroidx/compose/ui/layout/C;)Landroidx/compose/ui/layout/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1, p2}, Landroidx/compose/ui/layout/j;->N(LY/y;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LK0/J;

    .line 2
    .line 3
    check-cast p2, LY/y;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/C$b;->a(LK0/J;LY/y;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
