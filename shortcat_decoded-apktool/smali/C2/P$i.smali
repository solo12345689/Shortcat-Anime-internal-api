.class public LC2/P$i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lr2/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC2/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field private final a:[Lr2/o;

.field private final b:LC2/d0;

.field private final c:Lr2/s;


# direct methods
.method public varargs constructor <init>([Lr2/o;)V
    .locals 2

    .line 1
    new-instance v0, LC2/d0;

    invoke-direct {v0}, LC2/d0;-><init>()V

    new-instance v1, Lr2/s;

    invoke-direct {v1}, Lr2/s;-><init>()V

    invoke-direct {p0, p1, v0, v1}, LC2/P$i;-><init>([Lr2/o;LC2/d0;Lr2/s;)V

    return-void
.end method

.method public constructor <init>([Lr2/o;LC2/d0;Lr2/s;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    array-length v0, p1

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Lr2/o;

    iput-object v0, p0, LC2/P$i;->a:[Lr2/o;

    const/4 v1, 0x0

    .line 4
    array-length v2, p1

    invoke-static {p1, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    iput-object p2, p0, LC2/P$i;->b:LC2/d0;

    .line 6
    iput-object p3, p0, LC2/P$i;->c:Lr2/s;

    .line 7
    array-length v1, p1

    aput-object p2, v0, v1

    .line 8
    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object p3, v0, p1

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P$i;->c:Lr2/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr2/s;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LC2/P$i;->c:Lr2/s;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lr2/s;->h(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    :cond_0
    return-wide p1
.end method

.method public b()[Lr2/o;
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P$i;->a:[Lr2/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Lq2/O;)Lq2/O;
    .locals 2

    .line 1
    iget-object v0, p0, LC2/P$i;->c:Lr2/s;

    .line 2
    .line 3
    iget v1, p1, Lq2/O;->a:F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lr2/s;->j(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LC2/P$i;->c:Lr2/s;

    .line 9
    .line 10
    iget v1, p1, Lq2/O;->b:F

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lr2/s;->i(F)V

    .line 13
    .line 14
    .line 15
    return-object p1
.end method

.method public d()J
    .locals 2

    .line 1
    iget-object v0, p0, LC2/P$i;->b:LC2/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, LC2/d0;->u()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public e(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P$i;->b:LC2/d0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LC2/d0;->D(Z)V

    .line 4
    .line 5
    .line 6
    return p1
.end method
