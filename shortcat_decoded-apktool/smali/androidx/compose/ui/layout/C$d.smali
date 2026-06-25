.class final Landroidx/compose/ui/layout/C$d;
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
    iput-object p1, p0, Landroidx/compose/ui/layout/C$d;->a:Landroidx/compose/ui/layout/C;

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
.method public final a(LK0/J;Landroidx/compose/ui/layout/C;)V
    .locals 2

    .line 1
    iget-object p2, p0, Landroidx/compose/ui/layout/C$d;->a:Landroidx/compose/ui/layout/C;

    .line 2
    .line 3
    invoke-virtual {p1}, LK0/J;->C0()Landroidx/compose/ui/layout/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroidx/compose/ui/layout/j;

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/compose/ui/layout/C$d;->a:Landroidx/compose/ui/layout/C;

    .line 12
    .line 13
    invoke-static {v1}, Landroidx/compose/ui/layout/C;->a(Landroidx/compose/ui/layout/C;)Landroidx/compose/ui/layout/D;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, p1, v1}, Landroidx/compose/ui/layout/j;-><init>(LK0/J;Landroidx/compose/ui/layout/D;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, LK0/J;->c2(Landroidx/compose/ui/layout/j;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-static {p2, v0}, Landroidx/compose/ui/layout/C;->c(Landroidx/compose/ui/layout/C;Landroidx/compose/ui/layout/j;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Landroidx/compose/ui/layout/C$d;->a:Landroidx/compose/ui/layout/C;

    .line 27
    .line 28
    invoke-static {p1}, Landroidx/compose/ui/layout/C;->b(Landroidx/compose/ui/layout/C;)Landroidx/compose/ui/layout/j;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroidx/compose/ui/layout/j;->E()V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Landroidx/compose/ui/layout/C$d;->a:Landroidx/compose/ui/layout/C;

    .line 36
    .line 37
    invoke-static {p1}, Landroidx/compose/ui/layout/C;->b(Landroidx/compose/ui/layout/C;)Landroidx/compose/ui/layout/j;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object p2, p0, Landroidx/compose/ui/layout/C$d;->a:Landroidx/compose/ui/layout/C;

    .line 42
    .line 43
    invoke-static {p2}, Landroidx/compose/ui/layout/C;->a(Landroidx/compose/ui/layout/C;)Landroidx/compose/ui/layout/D;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p1, p2}, Landroidx/compose/ui/layout/j;->O(Landroidx/compose/ui/layout/D;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LK0/J;

    .line 2
    .line 3
    check-cast p2, Landroidx/compose/ui/layout/C;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/C$d;->a(LK0/J;Landroidx/compose/ui/layout/C;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
