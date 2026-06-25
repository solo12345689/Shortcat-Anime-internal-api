.class final Landroidx/compose/foundation/layout/e;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/s0;


# instance fields
.field private a:Ll0/e;

.field private b:Z


# direct methods
.method public constructor <init>(Ll0/e;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/layout/e;->a:Ll0/e;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/compose/foundation/layout/e;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final E1()Ll0/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/e;->a:Ll0/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/layout/e;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public G1(Li1/d;Ljava/lang/Object;)Landroidx/compose/foundation/layout/e;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final H1(Ll0/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/e;->a:Ll0/e;

    .line 2
    .line 3
    return-void
.end method

.method public final I1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/layout/e;->b:Z

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic b(Li1/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/layout/e;->G1(Li1/d;Ljava/lang/Object;)Landroidx/compose/foundation/layout/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
