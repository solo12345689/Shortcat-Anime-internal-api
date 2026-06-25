.class final Lx/b0$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/b0;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx/b0;

.field final synthetic b:I

.field final synthetic c:Landroidx/compose/ui/layout/s;


# direct methods
.method constructor <init>(Lx/b0;ILandroidx/compose/ui/layout/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx/b0$a;->a:Lx/b0;

    .line 2
    .line 3
    iput p2, p0, Lx/b0$a;->b:I

    .line 4
    .line 5
    iput-object p3, p0, Lx/b0$a;->c:Landroidx/compose/ui/layout/s;

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
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, Lx/b0$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lx/b0$a;->a:Lx/b0;

    invoke-virtual {v0}, Lx/b0;->E1()Landroidx/compose/foundation/o;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/o;->m()I

    move-result v0

    iget v1, p0, Lx/b0$a;->b:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Loe/j;->m(III)I

    move-result v0

    .line 3
    iget-object v1, p0, Lx/b0$a;->a:Lx/b0;

    invoke-virtual {v1}, Lx/b0;->F1()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lx/b0$a;->b:I

    sub-int/2addr v0, v1

    goto :goto_0

    :cond_0
    neg-int v0, v0

    .line 4
    :goto_0
    iget-object v1, p0, Lx/b0$a;->a:Lx/b0;

    invoke-virtual {v1}, Lx/b0;->G1()Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v0

    .line 5
    :goto_1
    iget-object v3, p0, Lx/b0$a;->a:Lx/b0;

    invoke-virtual {v3}, Lx/b0;->G1()Z

    move-result v3

    if-eqz v3, :cond_2

    move v2, v0

    .line 6
    :cond_2
    new-instance v0, Lx/b0$a$a;

    iget-object v3, p0, Lx/b0$a;->c:Landroidx/compose/ui/layout/s;

    invoke-direct {v0, v3, v1, v2}, Lx/b0$a$a;-><init>(Landroidx/compose/ui/layout/s;II)V

    invoke-virtual {p1, v0}, Landroidx/compose/ui/layout/s$a;->E0(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
