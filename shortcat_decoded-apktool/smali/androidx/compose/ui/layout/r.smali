.class final Landroidx/compose/ui/layout/r;
.super Landroidx/compose/ui/layout/s$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:LK0/p0;


# direct methods
.method public constructor <init>(LK0/p0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/layout/s$a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/layout/r;->b:LK0/p0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected B()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/r;->b:LK0/p0;

    .line 2
    .line 3
    invoke-interface {v0}, LK0/p0;->getRoot()LK0/J;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LK0/J;->F0()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public getDensity()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/r;->b:LK0/p0;

    .line 2
    .line 3
    invoke-interface {v0}, LK0/p0;->getDensity()Li1/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Li1/d;->getDensity()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public j1()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/r;->b:LK0/p0;

    .line 2
    .line 3
    invoke-interface {v0}, LK0/p0;->getDensity()Li1/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Li1/l;->j1()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method protected z()Li1/t;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/r;->b:LK0/p0;

    .line 2
    .line 3
    invoke-interface {v0}, LK0/p0;->getLayoutDirection()Li1/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
