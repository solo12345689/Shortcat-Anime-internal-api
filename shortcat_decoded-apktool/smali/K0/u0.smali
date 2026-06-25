.class final LK0/u0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/q0;


# instance fields
.field private a:LI0/C;

.field private final b:LK0/T;


# direct methods
.method public constructor <init>(LI0/C;LK0/T;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK0/u0;->a:LI0/C;

    .line 5
    .line 6
    iput-object p2, p0, LK0/u0;->b:LK0/T;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public J0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK0/u0;->b:LK0/T;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/T;->x()LI0/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LI0/p;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final a()LK0/T;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/u0;->b:LK0/T;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LI0/C;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/u0;->a:LI0/C;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LI0/C;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/u0;->a:LI0/C;

    .line 2
    .line 3
    return-void
.end method
