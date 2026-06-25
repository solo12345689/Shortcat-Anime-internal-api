.class public Lq1/e;
.super Lq1/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lr1/e;


# instance fields
.field protected final m0:Lq1/g;

.field final n0:Lq1/g$d;

.field protected o0:Ljava/util/ArrayList;

.field private p0:Lt1/j;


# direct methods
.method public constructor <init>(Lq1/g;Lq1/g$d;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lq1/a;-><init>(Lq1/g;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lq1/e;->o0:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p1, p0, Lq1/e;->m0:Lq1/g;

    .line 12
    .line 13
    iput-object p2, p0, Lq1/e;->n0:Lq1/g$d;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a()Lt1/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lq1/e;->u0()Lt1/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public apply()V
    .locals 0

    .line 1
    return-void
.end method

.method public varargs s0([Ljava/lang/Object;)Lq1/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/e;->o0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public t0()V
    .locals 0

    .line 1
    invoke-super {p0}, Lq1/a;->apply()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public u0()Lt1/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/e;->p0:Lt1/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public v0()Lq1/g$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/e;->n0:Lq1/g$d;

    .line 2
    .line 3
    return-object v0
.end method
