.class final LK/z$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/z;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:LK/z;


# direct methods
.method constructor <init>(Ljava/util/List;LK/z;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/z$a;->a:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, LK/z$a;->b:LK/z;

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

    invoke-virtual {p0, p1}, LK/z$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 12

    .line 2
    iget-object v0, p0, LK/z$a;->a:Ljava/util/List;

    .line 3
    iget-object v1, p0, LK/z$a;->b:LK/z;

    invoke-static {v1}, LK/z;->a(LK/z;)Lie/a;

    move-result-object v1

    .line 4
    invoke-static {v0, v1}, LK/d;->h(Ljava/util/List;Lie/a;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 7
    check-cast v3, Lkotlin/Pair;

    .line 8
    invoke-virtual {v3}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Landroidx/compose/ui/layout/s;

    invoke-virtual {v3}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lie/a;

    if-eqz v3, :cond_0

    .line 9
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li1/n;

    invoke-virtual {v3}, Li1/n;->q()J

    move-result-wide v3

    :goto_1
    move-wide v7, v3

    goto :goto_2

    :cond_0
    sget-object v3, Li1/n;->b:Li1/n$a;

    invoke-virtual {v3}, Li1/n$a;->b()J

    move-result-wide v3

    goto :goto_1

    :goto_2
    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v5, p1

    invoke-static/range {v5 .. v11}, Landroidx/compose/ui/layout/s$a;->U(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;JFILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
