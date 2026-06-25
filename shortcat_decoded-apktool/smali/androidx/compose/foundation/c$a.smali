.class final Landroidx/compose/foundation/c$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/c;->G1(Lu0/c;)Ls0/i1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Landroidx/compose/foundation/c;

.field final synthetic c:Lu0/c;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Landroidx/compose/foundation/c;Lu0/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/c$a;->a:Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/c$a;->b:Landroidx/compose/foundation/c;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/c$a;->c:Lu0/c;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/c$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/c$a;->a:Lkotlin/jvm/internal/N;

    iget-object v1, p0, Landroidx/compose/foundation/c$a;->b:Landroidx/compose/foundation/c;

    invoke-virtual {v1}, Landroidx/compose/foundation/c;->H1()Ls0/E1;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/foundation/c$a;->c:Lu0/c;

    invoke-interface {v2}, Lu0/f;->f()J

    move-result-wide v2

    iget-object v4, p0, Landroidx/compose/foundation/c$a;->c:Lu0/c;

    invoke-interface {v4}, Lu0/f;->getLayoutDirection()Li1/t;

    move-result-object v4

    iget-object v5, p0, Landroidx/compose/foundation/c$a;->c:Lu0/c;

    invoke-interface {v1, v2, v3, v4, v5}, Ls0/E1;->createOutline-Pq9zytI(JLi1/t;Li1/d;)Ls0/i1;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-void
.end method
