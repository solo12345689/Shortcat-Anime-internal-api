.class final Landroidx/compose/animation/g$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/g;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/s;

.field final synthetic b:J

.field final synthetic c:J

.field final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/s;JJLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/g$c;->a:Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput-wide p2, p0, Landroidx/compose/animation/g$c;->b:J

    .line 4
    .line 5
    iput-wide p4, p0, Landroidx/compose/animation/g$c;->c:J

    .line 6
    .line 7
    iput-object p6, p0, Landroidx/compose/animation/g$c;->d:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/g$c;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 6

    .line 2
    iget-object v1, p0, Landroidx/compose/animation/g$c;->a:Landroidx/compose/ui/layout/s;

    .line 3
    iget-wide v2, p0, Landroidx/compose/animation/g$c;->b:J

    invoke-static {v2, v3}, Li1/n;->k(J)I

    move-result v0

    iget-wide v2, p0, Landroidx/compose/animation/g$c;->c:J

    invoke-static {v2, v3}, Li1/n;->k(J)I

    move-result v2

    add-int/2addr v2, v0

    iget-wide v3, p0, Landroidx/compose/animation/g$c;->b:J

    invoke-static {v3, v4}, Li1/n;->l(J)I

    move-result v0

    iget-wide v3, p0, Landroidx/compose/animation/g$c;->c:J

    invoke-static {v3, v4}, Li1/n;->l(J)I

    move-result v3

    add-int/2addr v3, v0

    const/4 v4, 0x0

    iget-object v5, p0, Landroidx/compose/animation/g$c;->d:Lkotlin/jvm/functions/Function1;

    move-object v0, p1

    .line 4
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/layout/s$a;->q0(Landroidx/compose/ui/layout/s;IIFLkotlin/jvm/functions/Function1;)V

    return-void
.end method
