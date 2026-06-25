.class final Landroidx/compose/ui/window/m$h;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/m;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/M;

.field final synthetic b:Landroidx/compose/ui/window/m;

.field final synthetic c:Li1/p;

.field final synthetic d:J

.field final synthetic e:J


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/M;Landroidx/compose/ui/window/m;Li1/p;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/m$h;->a:Lkotlin/jvm/internal/M;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/window/m$h;->b:Landroidx/compose/ui/window/m;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/ui/window/m$h;->c:Li1/p;

    .line 6
    .line 7
    iput-wide p4, p0, Landroidx/compose/ui/window/m$h;->d:J

    .line 8
    .line 9
    iput-wide p6, p0, Landroidx/compose/ui/window/m$h;->e:J

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/window/m$h;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 9

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/window/m$h;->a:Lkotlin/jvm/internal/M;

    .line 3
    iget-object v1, p0, Landroidx/compose/ui/window/m$h;->b:Landroidx/compose/ui/window/m;

    invoke-virtual {v1}, Landroidx/compose/ui/window/m;->getPositionProvider()Landroidx/compose/ui/window/s;

    move-result-object v2

    .line 4
    iget-object v3, p0, Landroidx/compose/ui/window/m$h;->c:Li1/p;

    .line 5
    iget-wide v4, p0, Landroidx/compose/ui/window/m$h;->d:J

    .line 6
    iget-object v1, p0, Landroidx/compose/ui/window/m$h;->b:Landroidx/compose/ui/window/m;

    invoke-virtual {v1}, Landroidx/compose/ui/window/m;->getParentLayoutDirection()Li1/t;

    move-result-object v6

    .line 7
    iget-wide v7, p0, Landroidx/compose/ui/window/m$h;->e:J

    .line 8
    invoke-interface/range {v2 .. v8}, Landroidx/compose/ui/window/s;->a(Li1/p;JLi1/t;J)J

    move-result-wide v1

    .line 9
    iput-wide v1, v0, Lkotlin/jvm/internal/M;->a:J

    return-void
.end method
