.class final Landroidx/compose/animation/g$g;
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
.field final synthetic a:Landroidx/compose/animation/g;

.field final synthetic b:J


# direct methods
.method constructor <init>(Landroidx/compose/animation/g;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/g$g;->a:Landroidx/compose/animation/g;

    .line 2
    .line 3
    iput-wide p2, p0, Landroidx/compose/animation/g$g;->b:J

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
.method public final a(Lv/l;)J
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/g$g;->a:Landroidx/compose/animation/g;

    .line 2
    .line 3
    iget-wide v1, p0, Landroidx/compose/animation/g$g;->b:J

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1, v2}, Landroidx/compose/animation/g;->S1(Lv/l;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lv/l;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/animation/g$g;->a(Lv/l;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Li1/n;->c(J)Li1/n;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
