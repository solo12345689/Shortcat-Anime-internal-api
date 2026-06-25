.class final LO2/b;
.super Lr3/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final p:Lr3/r;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lr3/r;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lr3/i;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LO2/b;->p:Lr3/r;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected C([BIZ)Lr3/j;
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object p3, p0, LO2/b;->p:Lr3/r;

    .line 4
    .line 5
    invoke-interface {p3}, Lr3/r;->reset()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p3, p0, LO2/b;->p:Lr3/r;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-interface {p3, p1, v0, p2}, Lr3/r;->b([BII)Lr3/j;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
